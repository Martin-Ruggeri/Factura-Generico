package api.main.DTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import api.main.entity.Comprobante;

public class PersonaDTO extends BaseDTO{

    protected String nombre;
	
    protected String apellido;
    
    protected String documento;
    
    protected String direccion;
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
