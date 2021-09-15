package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Productos;

public class Prod03 {
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	// proceso -> consultar datos de un Producto
	    
	Productos pr = em.find(Productos.class, "P0050"); //metodo q devuelve toda la info de una
			                         //  clase Productos
			                         // el arg es el dato q qeremos buscar
	if(pr == null) {	
		System.out.println("Producto no EXISTE");
	}
	else {
		System.out.println("Producto existe!!!\n"+ pr);
		
		em.getTransaction().begin();
		
		em.remove(pr);  // <----- método para eliminar completado y correcto
		
		em.getTransaction().commit();
		System.out.println("Producto  eliminado");				
	}	
	
	em.close();
	
	}
	

}
