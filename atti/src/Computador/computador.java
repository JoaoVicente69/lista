package Computador;

public class computador {
	private String marca;
	private String modelo;
	protected gabinete Gabinete;
	protected monitor Monitor;
	protected teclado Teclado;
	protected mouse Mouse;
	
	public computador() {
		Gabinete=new gabinete();
		Monitor = new monitor();
		Teclado = new teclado();
		Mouse = new mouse();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public gabinete getGabinete() {
		return Gabinete;
	}

	public void setGabinete(gabinete gabinete) {
		Gabinete = gabinete;
	}

	public monitor getMonitor() {
		return Monitor;
	}

	public void setMonitor(monitor monitor) {
		Monitor = monitor;
	}

	public teclado getTeclado() {
		return Teclado;
	}

	public void setTeclado(teclado teclado) {
		Teclado = teclado;
	}

	public mouse getMouse() {
		return Mouse;
	}

	public void setMouse(mouse mouse) {
		Mouse = mouse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("computador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", Gabinete=");
		builder.append(Gabinete);
		builder.append(", Monitor=");
		builder.append(Monitor);
		builder.append(", Teclado=");
		builder.append(Teclado);
		builder.append(", Mouse=");
		builder.append(Mouse);
		builder.append("]");
		return builder.toString();
	}
	

}
