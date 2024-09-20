
public class PerformanceTest {
	
	//Pasos a seguir:
	
	//1.- Probar con el JIT on. �Qu� ocurre?
	//2.- Probar con el JIT off (par�metro -Xint) �Qu� ocurre?
	//3.- Modificar el par�metro -XX:CompileThreshold=10000. Poner primero una cantidad menor, y luego una cantidad mayor. �Qu� ocurre?
	

	
//	In reality, this JIT compilation is not in one go. It has two neat phases :
//
//		1) Everytime a method is called, its counter gets increased by 1 and soon after it reaches the threshold, the JIT does its first compilation.
//
//		2) After the first compilation, the counter is reset to 0 and incremented again. In this second cycle, when it reaches the threshold, JIT does an second round of compilation - this time with more aggressive and awesome optimizations (sorry - unable to provide you much details here)
//
//		If you are using JDK 7 and your machine runs on multi-core (I don�t see why not), then you could use the following flag to speed up your native compilation process
//
//		-server -XX:+TieredCompilation
//		I can�t claim to be an expert in JVM tuning considering the amount of options available. So, please leave your comments if you find this useful or is incorrect.
//		
		
	 public static void main(String[] args) {
		 int outer=1;
//	        for (int outer=1;outer<=100;outer++)
		 while (true)
	        {
	            long start = System.nanoTime();
	            testPerformance();
	            long duration = System.nanoTime()-start;
	            System.out.println("Loop # " + outer + " took " + ((duration)/1000.0d) + " �s");
	            outer++;
	        }
	    }

	    private static void testPerformance() {
	        long sum = 0;
	        for (int i = 1; i <= 5000; i++)
	        {
	            sum = sum + random(i);
	        }
	    }

//	    Loop # 1 took 777.748 �s
//	    Loop # 2 took 451.976 �s
//	    Loop # 3 took 120.502 �s
//	    Loop # 4 took 117.081 �s
//	    Loop # 5 took 123.163 �s
//	    Loop # 6 took 152.432 �s
//	    Loop # 7 took 122.403 �s
	    
	    
//	    Loop # 1 took 1029.774 �s
//	    Loop # 2 took 387.353 �s
//	    Loop # 3 took 115.18 �s
//	    Loop # 4 took 114.42 �s
//	    Loop # 5 took 114.8 �s
//	    Loop # 6 took 108.718 �s
//	    Loop # 7 took 96.933 �s
	    
	    private static int random(int i) {
	        int x = (int)(i*2.3d/2.7d); // This is a simulation
	        int y = (int)(i*2.36d);     // of time-consuming
	        return x%y;                 // business logic.
	    }
}
