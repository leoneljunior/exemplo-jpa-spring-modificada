package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import br.ufc.quixada.npi.service.ClinicService;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Owner;
import br.ufc.quixada.npi.service.ContatoService;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClinicService cs = (ClinicService)ctx.getBean("clinicServiceImpl");
		
		Owner owner = new Owner();
		
		owner.setFirstName("Raimundo");
		owner.setAddress("Rua José Josué da Costa");
		owner.setCity("Dep. Irapuan Pinheiro");
		owner.setLastName("Leonel");
		owner.setTelephone("88548663");
		//owner.setId(null);
				
		
		cs.saveOwner(owner);
		
		
		/*
		List<Owner> l = (List<Owner>) cs.findOwnerByLastName("Leonel");

	    for (Owner c : l) {
	    	System.out.println(c);
	    }
	    */
		ctx.close();
	}
	
}
