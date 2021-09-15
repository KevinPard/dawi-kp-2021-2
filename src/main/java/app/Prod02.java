package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Productos;

public class Prod02 {
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	// proceso -> registrar un nuevo producto
	      Productos pr = new Productos();
	      pr.setIdprod("P0050");
	      pr.setDescripcion("Prueba 503");
	      pr.setStock(120);
	      pr.setPrecio(0.79);
	      pr.setIdcategoria(1);
	      pr.setEstado(1);
	
	      em.getTransaction().begin();
	
	      em.merge(pr);  // <-----actualizar por codigo//sino existe codigo
                             // registra  nuevo producto sino existe código

	      em.getTransaction().commit();
	      System.out.println("Nuevo Producto Actualizado");

	     em.close();
	    
	   }

}
