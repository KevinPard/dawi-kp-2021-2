package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Productos;

public class Prod01 {
	
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	// proceso -> registrar un nuevo producto
	Productos pr = new Productos();
	pr.setIdprod("P0050");
	pr.setDescripcion("Prueba 50");
	pr.setStock(110);
	pr.setPrecio(0.69);
	pr.setIdcategoria(1);
	pr.setEstado(1);
	
	em.getTransaction().begin();
	
	em.persist(pr);  // <-----registrar
	
	em.getTransaction().commit();
	System.out.println("Nuevo Producto Registrado");

	em.close();
	    
	}


}
