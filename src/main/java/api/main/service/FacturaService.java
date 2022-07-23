package api.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import api.main.DTO.ClienteDTO;
import api.main.DTO.FacturaDTO;
import api.main.DTO.PersonaDTO;
import api.main.DTO.VendedorDTO;
import api.main.entity.Cliente;
import api.main.entity.Factura;
import api.main.entity.Persona;
import api.main.entity.Vendedor;
import api.main.repository.FacturaRepository;

@Service()
public class FacturaService extends BaseService<Factura, FacturaDTO>{

	private FacturaRepository facturaRepository;
	
	public FacturaService(FacturaRepository facturaRepository) {
		super(facturaRepository, FacturaDTO.class, Factura.class);
		this.facturaRepository = facturaRepository;
	}	
		
}
