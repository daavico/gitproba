								
public class girar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String numero ="234";
		String numeronou="";
		
		int numeroo= Integer.parseInt(numero);
		
		int contador=numero.length();
		System.out.printlm("No vaaa a ir");
		System.out.println("Pepinissim");
		
		
		for(int i=0;i<numero.length();i++){
			
			numeronou=numero.substring(1) + numero.charAt(0);
		
		}
		System.out.println(numeronou);
		System.out.println("El maxim de combinacions es de:" +contador);
			
	
	}
}

