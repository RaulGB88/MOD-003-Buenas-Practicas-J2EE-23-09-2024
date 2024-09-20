
public class PerformanceTest {
	
	//Pasos a seguir:
	
	//1.- Probar con el JIT on. ¿Qué ocurre?
	//2.- Probar con el JIT off (parámetro -Xint) ¿Qué ocurre?
	//3.- Modificar el parámetro -XX:CompileThreshold=10000. Poner primero una cantidad menor, y luego una cantidad mayor. ¿Qué ocurre?
	

	
//	In reality, this JIT compilation is not in one go. It has two neat phases :
//
//		1) Everytime a method is called, its counter gets increased by 1 and soon after it reaches the threshold, the JIT does its first compilation.
//
//		2) After the first compilation, the counter is reset to 0 and incremented again. In this second cycle, when it reaches the threshold, JIT does an second round of compilation - this time with more aggressive and awesome optimizations (sorry - unable to provide you much details here)
//
//		If you are using JDK 7 and your machine runs on multi-core (I don’t see why not), then you could use the following flag to speed up your native compilation process
//
//		-server -XX:+TieredCompilation
//		I can’t claim to be an expert in JVM tuning considering the amount of options available. So, please leave your comments if you find this useful or is incorrect.
//		
		
	 public static void main(String[] args) {
		 int outer=1;
//	        for (int outer=1;outer<=100;outer++)
		 while (true)
	        {
	            long start = System.nanoTime();
	            testPerformance();
	            long duration = System.nanoTime()-start;
	            System.out.println("Loop # " + outer + " took " + ((duration)/1000.0d) + " µs");
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

//	    Loop # 1 took 777.748 µs
//	    Loop # 2 took 451.976 µs
//	    Loop # 3 took 120.502 µs
//	    Loop # 4 took 117.081 µs
//	    Loop # 5 took 123.163 µs
//	    Loop # 6 took 152.432 µs
//	    Loop # 7 took 122.403 µs
	    
	    
//	    Loop # 1 took 1029.774 µs
//	    Loop # 2 took 387.353 µs
//	    Loop # 3 took 115.18 µs
//	    Loop # 4 took 114.42 µs
//	    Loop # 5 took 114.8 µs
//	    Loop # 6 took 108.718 µs
//	    Loop # 7 took 96.933 µs
	    
	    private static int random(int i) {
	        int x = (int)(i*2.3d/2.7d); // This is a simulation
	        int y = (int)(i*2.36d);     // of time-consuming
	        return x%y;                 // business logic.
	    }
}
