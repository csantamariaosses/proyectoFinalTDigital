package cl.csantam.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Procedimiento {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String codProcedimiento;
	private String nombre;
	private String descripcion;
	private double precio;
	private int estado;

}
