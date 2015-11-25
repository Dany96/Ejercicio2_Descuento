
public class Descuento {
	
	private double descuento;
	private double totalcompra;
	
	public Descuento(double descuentoparam, double totalcompraparam){
		this.descuento=descuentoparam;
		this.totalcompra=totalcompraparam;
	}
	public double getTotal(){
		double total=totalcompra-totalcompra*descuento;
		return total;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getTotalcompra() {
		return totalcompra;
	}
	public void setTotalcompra(double totalcompra) {
		this.totalcompra = totalcompra;
	}
					   }
