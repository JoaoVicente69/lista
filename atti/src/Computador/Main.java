package Computador;

public class Main {

	public static void main(String[] args) {
		
		EquipamentoEletronico ep= new EquipamentoEletronico(220,50);
		
		System.out.println(ep);
		
		PlacaMae placa =  new PlacaMae();
		placa.hd.setCapacidade(200);
		placa.hd.setMarca("adsd");
		placa.hd.setModelo("2");
		placa.hd.setRpm(200);
		
		placa.Memoria.setCapacidade(20111);
		placa.Memoria.setMarca("DFA");
		placa.Memoria.setModelo("2F");
		placa.Memoria.setVelocida(2000000);
		
		placa.Processador.setCache(200);
		placa.Processador.setClock(5);
		placa.Processador.setMarca("intel");
		placa.Processador.setModelo("p");
		computador pc =new computador();
		
		pc.Gabinete.setBaias(12);
		pc.Gabinete.setMarca("giga");
		pc.Gabinete.setModelo("44");
		pc.Monitor.setMarca("LG");
		pc.Monitor.setResolucao("1200 x 600");
		pc.Monitor.setTipo("hd");
		pc.Mouse.setMarca("san");
		pc.Mouse.setTipo("44");
		pc.Teclado.setMarca("SGS");
		pc.Teclado.setTipo("FEFE");
		
		
		System.out.println(pc);
		
	}

}
