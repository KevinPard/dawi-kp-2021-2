package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;

public class Producto02 {
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	      // proceso -> para actualizar producto
	         Producto p = new Producto();
	
	                  p.setCodigo("P01");
	                  p.setDescripcion("Mesas");
	                  p.setStock(200);
	                  p.setPrecio("325");
	                  p.setCategoria(1);
	                  p.setEstado(1);
	
	                  em.getTransaction().begin();
	
	                  em.merge(p);  // <-----actualizar por codigo//sino existe codigo
	                                  // registrar nuevo producto sino existe código
	
	                  em.getTransaction().commit();
	                  System.out.println("Producto Actualizado");

	                  em.close();
	    
	       }
	

}
