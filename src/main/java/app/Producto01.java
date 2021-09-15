package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;
public class Producto01 {
		
	public static void main(String[] args) {
		//similar a DAOFactory		
	    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	 // similar a crear el obj DAO
	    EntityManager em = fabrica.createEntityManager();
	
	// proceso -> registrar un nuevo producto
	Producto p = new Producto();
	
	p.setCodigo("P01");
	p.setDescripcion("PC y Laptops");
	p.setStock(100);
	p.setPrecio("345");
	p.setCategoria(1);
	p.setEstado(1);
	
	em.getTransaction().begin();
	
	em.persist(p);  // <-----registrar
	
	em.getTransaction().commit();
	System.out.println("Nuevo Producto Registrado");

	em.close();
	    
	}

}
