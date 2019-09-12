package pessoa;

public class Main {

	public static void main(String[] args) {
		
		pessoa pe = new pessoa();
		
		pe.setEndereco("pouso");
		pe.setPessoa("joao");
		
		System.out.println(pe);
		
		carro car=new carro();
		
		car.dono.setEndereco("redondo");
		car.dono.setPessoa("darci");
		car.setAno(2012);
		car.setCor("branco");
		car.setFabricante("rohden");
		car.setModelo("fiat");
		car.Motor.setCilindros(12);
		car.Motor.setCombustivel("gas");
		car.Motor.setModelo("122");
		car.Motor.setPotenci(12);
		
		System.out.println(car);
		
	}

}
