package git;

public class gitPrueba {
	
	public static void main (String[] args) {
		
		gitPrueba a = new gitPrueba(2, 5);
		gitPrueba b = new gitPrueba();
		b.setReal(4.6);
		b.setImag(3.5);
		gitPrueba suma = a.sumar(b);
		gitPrueba resta = a.restar(b);
		gitPrueba mult = a.multiplicar(b);
		gitPrueba mult2 = a.multiplicar(5.2);
		gitPrueba div = a.dividir(b);
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(mult);
		System.out.println(mult2);
		System.out.println(div);
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
	



	//Métodos públicos
		public gitPrueba sumar(gitPrueba num) {
			gitPrueba aux = new gitPrueba();

			aux.setReal(real + num.real);
			aux.setImag(imag + num.imag);

			return aux;
		}
		
		public gitPrueba restar(gitPrueba num) {
			gitPrueba aux = new gitPrueba();
			
			aux.setReal(this.real - num.real);
			aux.setImag(imag - num.imag);
			
			return aux;
		}
		
		public gitPrueba multiplicar(gitPrueba num) {
			gitPrueba aux = new gitPrueba();
			
			aux.setReal(real * num.real - imag * num.imag);
			aux.setImag(real * num.imag + imag * num.real);
			
			return aux;
		}
		
		public gitPrueba multiplicar(double num) {
			gitPrueba aux = new gitPrueba();
			
			aux.setReal(real * num);
			aux.setImag(imag * num);

			return aux;
		}
		
		public gitPrueba dividir(gitPrueba num) {
			gitPrueba aux = new gitPrueba();
			
			aux.setReal((real * num.real + imag * num.imag)/(num.real * num.real + num.imag * num.imag));
			aux.setImag((imag * num.real - real * num.imag)/(num.real * num.real + num.imag * num.imag));
			
			return aux;
		}
		
}









