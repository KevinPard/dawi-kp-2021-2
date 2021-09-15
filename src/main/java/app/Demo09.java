package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo09 {
	
	public static void main(String[] args) {
		//similar a DAOFactory		
	      EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

	    // similar a crear el obj DAO
	      EntityManager em = fabrica.createEntityManager();
	
   // proceso -> validar  usando usando usuario y clave: login con UPS(Procedimiento almacenado)     	      
	       //String sql = "{call usp_validaAcceso(?,?)}"; //primera forma valida
	      
	      String sql = "{call usp_validaAcceso(:xusr,:xcla)}"; // segunda forma valida
	                
	       //prepara la consulta
	         Query query = em.createNativeQuery(sql, Usuario.class);
	         //setea los parámetros
	           query.setParameter("xusr", "U001@gmail.com"); 
	           query.setParameter("xcla", "10001"); 	           
	           
	         //ejecuta la consulta y obtiene el resultado
	          Usuario u = (Usuario) query.getSingleResult();
	               	      	      	      	      	      	   	     	      
              em.close();
	
	      if(u == null) {
		      System.out.println("Usuario NO existe, usuario o clave incorrecto");
	       }
	       else {
		       System.out.println("Bienvenido " + u.getNombre());		
		   }	    
	}	
}
