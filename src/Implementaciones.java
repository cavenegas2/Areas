
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

}
