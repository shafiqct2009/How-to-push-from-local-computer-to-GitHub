package OOPs.InheritencePractice;

/**
 * Hello world!
 *
 */
public class Dog extends Animal { 

    public static void main( String[] args ){
    	Dog myDog = new Dog ();
    	
    	myDog.eat ();
    	myDog.makeNoise();
    	System.out.println(myDog.animalType);
    }
    public static void makeNoise() {
    	System.out.println("Bark Bark!");
    }


        
    }

