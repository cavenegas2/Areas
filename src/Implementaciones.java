
public class Implementaciones {
	
	
	public double calcularcuadarado(double lado){
		
		double aux = 0;
		
		aux = lado*lado;
		System.out.println(lado);
		System.out.println("El area del cuadrado es: ");
		
		return aux;
		
	}
	
	
	
	
	public double calculartriangulo(double base , double altura) {
		double aux2 = 0;
		
		aux2=((base*altura)/2);
		System.out.println("La base es igual a: "+base +"y la altura es: " +altura);
		System.out.println("El area triangulo es: ");
		return aux2;
		
	}
	
	
	public double calcularrectangulo(double base , double altura) {
		double aux3 = 0;
		
		aux3=((base*altura)/2);
		System.out.println("La base es igual a: "+base +"y la altura es: " +altura);
		System.out.println("El area rectangulo es: ");
		return aux3;
		
	}
	
	
	public void  calcularTodo(double lado, double base, double altura) {
		
		double cuadrado = this.calcularcuadarado(lado);
		System.out.println("El area cuadrado es: " +cuadrado);
		
		double triangulo = this.calculartriangulo(base, altura);
		System.out.println("El area triangulo es: "+triangulo);
		
		double rectangulo = this.calcularrectangulo(base, altura);
		System.out.println("El area rectangulo es: "+rectangulo);
		
		
		
	}

}
