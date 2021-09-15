package app;

import model.Productos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Prod04 {
	
	public static void main(String[] args) {
		  //similar a DAOFactory		
	      EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	    // similar a crear el obj DAO
	       EntityManager em = fabrica.createEntityManager();
	 
	     // proceso ---> consultar datos de un producto
	       
	     //em.createQuery("sentencia de consulta pero con JPQL", clase de resultado)
	       
	      //al ser JPQL se pone el nombre de la entidad luego de FROM
	       
	       //si quiere mostrar un dato especifico pon select pr.codigo, pr.estado, etc
	       
	        
	        System.out.println("----Listado de todos los productos------");    
            List<Productos> lstProductos = em.createQuery("SELECT pr FROM Productos pr ", Productos.class).getResultList();
            System.out.println("cantidad de Productos: "+ lstProductos.size());
            for(Productos pr : lstProductos){
	        System.out.println(pr);
           }
            System.out.println("----------------------------");



           System.out.println("----Listado de los Productos x categoria 2----"); 
             //Define la cadena
           String sql = "SELECT pr FROM Productos pr where pr.idcategoria = :xcategoria2 ";
             //prepara la consulta
          TypedQuery<Productos> query = em.createQuery(sql, Productos.class);
          //setear los parámetros
          query.setParameter("xcategoria2", 2); 
          //ejecuta la consulta y convierte el resultado en un list
          List<Productos> lstProductos2 = query.getResultList();
          //muestra resultado
         System.out.println("cantidad de Productos: "+ lstProductos2.size());
         for(Productos pr : lstProductos2){
	       System.out.println(pr);
           }
           System.out.println("----------------------------");
           
           em.close(); //si quiero lo pongo sino no
	
	   }

}
