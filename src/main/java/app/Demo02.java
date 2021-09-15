package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	// proceso -> actualizar un usuario
	Usuario u = new Usuario();
	u.setCodigo(110);
	u.setNombre("Juan");
	u.setApellido("Ackerman");
	u.setUsuario("Juere@titan.pe");
	u.setClave("1234");
	u.setFnacim("2021/08/24");
	u.setTipo(1);
	u.setEstado(1);
	
	em.getTransaction().begin();
	
	em.merge(u);  // <--actualizar---> si  existe código/registrar nuevo dato
	                // pero el correo tiene q ser distinto
	
	em.getTransaction().commit();
	System.out.println("Usuario actualizado");
	
	em.close();
	
	    
	}	

}
