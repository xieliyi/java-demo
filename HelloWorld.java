

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

    	if( args != null && args.length > 0) {

    		System.out.println("input args:");
    		for(int i=0;i<args.length;i++) {
    			
    			System.out.print(args[i]);
    			System.out.print(",  ");
    		}
    		System.out.print("\n");
    	}
    	else {
    		System.out.println("input args is null!");
    	}
    }
}