package git;

public class gitPrueba {
	
	public static void main (String[] args) {
		
		gitPrueba a = new gitPrueba(2, 5);
		gitPrueba b = new gitPrueba();
		b.setReal(4.6);
		b.setImag(3.5);
		if (a.equals(b))
			System.out.println("Los dos números son iguales");
		
		
	
		
	}
	private double real;
	private double imag;
	
	// Constructores
	public gitPrueba() {
		real = 0;
		imag = 0;
	}

	public gitPrueba (double real) {
		this.real = real;
		this.imag = 0;
	}
	
	public gitPrueba (double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	// Getters y setters
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	
}









