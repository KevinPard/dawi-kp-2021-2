package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter          //        //para crear automaticamente getter sin necesidad de escribirlos
//@Setter //                 //para crear automaticamente setter sin necesidad de escribirlos

@Entity
@Table(name="tb_productos")
@Data                     //crea get y set  y tambien ToString
//@ToString                // Para crear automaticamente tostring
@AllArgsConstructor     //para automaticamente crear constructor con datos
@NoArgsConstructor     //crea constructor vacio
public class Productos {
	@Id                              //cuando se ponen los mismos nombres de los campos
	private String idprod;        // de la tabla, no es necesario poner @Column, solo
	                             // se pone cuando los pones diferentes a la de la tabla                            
	private String descripcion;
	
	private int stock;
	
	private double precio;
	
	private int idcategoria;
	
	private int estado;	

}
