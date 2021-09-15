package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	// proceso -> consultar datos de un usuario
	    
	    
	Usuario u = em.find(Usuario.class, 123); //metodo q devuelve toda la info de una
			                         //  clase usuario
			                         // el arg es el dato q qeremos buscar
	em.close();
	
	if(u == null) {
		
		System.out.println("Usuario no EXISTE");
	}
	else {
		System.out.println("Usuario existe!!!\n"+ u);		
	}
	    
	}		

}
