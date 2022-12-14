package br.edu.infnet.appCompra;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Celular;

@Component
@Order(4)
public class CelularTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#celular");
		
		Celular celular1 = new Celular();
		
		celular1.setCodigo(123); 
		celular1.setNome("Cel 1");
		celular1.setPreco((double) 10);
			
		celular1.setMarca("Motorola");
		celular1.setModelo("Galaxy");
		celular1.setValor(1000.0);
		celular1.setCarregador(true);
		System.out.println(celular1.toString());
		
		Celular celular2 = new Celular();
		
		celular2.setCodigo(234);
		celular2.setNome("Cel 2");
		celular2.setPreco((double) 20);
		
		celular2.setMarca("Apple");
		celular2.setModelo("11");
		celular2.setValor(2000.0);
		celular2.setCarregador(false);
		System.out.println(celular2.toString());
		
		Celular celular3 = new Celular();
		
		celular3.setCodigo(345);
		celular3.setNome("Cel 3");
		celular3.setPreco((double) 30);
		
		celular3.setMarca("LG");
		celular3.setModelo("NX 10");
		celular3.setValor(3000.0);
		celular3.setCarregador(true);
		System.out.println(celular3.toString());		
	}

}
