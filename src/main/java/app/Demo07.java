package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo07 {

	     public static void main(String[] args) {
		  //similar a DAOFactory		
	      EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	    // similar a crear el obj DAO
	       EntityManager em = fabrica.createEntityManager();
	 
	     // proceso ---> consultar datos de un usuario
	       
	     //em.createQuery("sentencia de consulta pero con JPQL", clase de resultado)
	       
	      //al ser JPQL se pone el nombre de la entidad luego de FROM
	       
	       //si quiere mostrar un dato especifico pon select u.apellido, u.nombre, etc
	       
	        
	System.out.println("----Listado de todos los usuarios------");    
  List<Usuario> lstUsuarios = em.createQuery("SELECT u FROM Usuario u ", Usuario.class).getResultList();
   System.out.println("cantidad de usuarios: "+ lstUsuarios.size());
   for(Usuario u : lstUsuarios){
	  System.out.println(u);
   }
  System.out.println("----------------------------");
  
  
  
  System.out.println("----Listado de los usuarios x tipo 2----"); 
  //Define la cadena
  String sql = "SELECT u FROM Usuario u where u.tipo = :xtipo ";
  //prepara la consulta
  TypedQuery<Usuario> query = em.createQuery(sql, Usuario.class);
  //setear los parámetros
  query.setParameter("xtipo", 2); 
  //ejecuta la consulta y convierte el resultado en un list
  List<Usuario> lstUsuarios2 = query.getResultList();
  //muestra resultado
   System.out.println("cantidad de usuarios: "+ lstUsuarios2.size());
   for(Usuario u : lstUsuarios2){
	  System.out.println(u);
   }
  System.out.println("----------------------------");
  
  
  
  
  
  
  
  
  
	      
	     TypedQuery<Usuario> t =   em.createQuery("Select u FROM Usuario u ", Usuario.class);
	       List<Usuario> lstUsuarios3 =  t.getResultList();
	       
	       for(Usuario usuario : lstUsuarios){

	       }
	         em.close();
	
	    
	    }		
	
}
