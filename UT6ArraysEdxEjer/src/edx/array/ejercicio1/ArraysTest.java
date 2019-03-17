package edx.array.ejercicio1;

/*Operaciones con Arrays 

Implementamos dos m�todos, uno para encontrar el �ndice donde se encuentra 
el m�nimo de un array de enteros, y otro para encontrar el valor m�nimo del array. 

Compila y ejecuta el c�digo proporcionado. 
Como puedes ver, hay errores dentro de estos m�todos. Por favor, encu�ntralos y corrige el c�digo.

Hay un m�todo dentro de la clase java.util.Arrays que puede sustituir a nuestro m�todo print(). �Cu�l es el nombre de este m�todo?
*/

public class ArraysTest {

	   private static void print(String name, int a[]){
		    System.out.print(name +" = [");
		    for (int i=0; i < a.length-1; i++){
		        System.out.print(a[i]+", ");
		    }
		    System.out.println(a[a.length-1]+"]");
	    }

	    private static int indexMin(int[] array) {
	    	int var = 0;
		    for (int i = 1; i < array.length -1; i++) {
		        if (array[i] < var) {
			        var = i;
		        }
		    }
		    return var;
	    }

	    private static int min(int[] array) {
		    int var = array[0];
		    for (int i = 1; i < array.length -1; i++) {
		        if (array[i] < var) {
			        var = i;
		        }
		    }
		    return var;
	    }

	    public static void main(String args[]){
		    int[] arrayA = new int[]{0,1,2,3,4,5};
	    	int[] arrayB = new int[10];
		
		    for (int i = 0; i<10; i++){
		        arrayB[i] = (int) (Math.random()*100);
		    }

		    print("A", arrayA);
		    // Utiliza el API de Java para que tenga el mismo comportamiento.
		    //System.out.println("A = "+??????????);
	    	print("B", arrayB);
		    //System.out.println("B = "+?????????);
		
		    System.out.println("min(A) = "+ min(arrayA));
		    System.out.println("indexMin(A) = "+ indexMin(arrayA));

		    System.out.println("min(B) = "+ min(arrayB));
		    System.out.println("indexMin(B) = "+ indexMin(arrayB));
	    }
}



