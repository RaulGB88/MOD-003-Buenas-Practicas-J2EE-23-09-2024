public class Main {

	
//	static 
	
	public static void main(String args[]) {
		int i=0;
		StringBuilder sb=new StringBuilder();
		while (true) {
//			String a=new String();
			sb.append("abcd");
			if (i==1044818) {
				System.out.println("Hola");
			}
			System.out.println("interacion "+i+" - C: "+sb.capacity()+" - L:"+sb.length());
			i++;
		}
	}

}