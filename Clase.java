public class Clase {
	public static void main(String[] args){
		System.out.println("Hola "+args[0]);
		for(int i=0;i<args[0].length();i++){
			System.out.println(args[0].charAt(i));
		}
	}
}