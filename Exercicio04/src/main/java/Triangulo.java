
public class Triangulo implements FiguraGeometrica {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calculaArea() {
		double areaTriangulo = (this.base * this.altura)/2;
		return areaTriangulo;
	}
	
	public String getNomeFigura() {
		return "Triângulo";
	}
	
	public String toString() {
		return String.format("Nome: %s\nÁrea do trângulo: %.2f", getNomeFigura(), calculaArea());
	}
}