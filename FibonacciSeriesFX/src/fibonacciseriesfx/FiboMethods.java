package fibonacciseriesfx;

import java.math.BigInteger;

/**
 * Esta clase contiene dos metodos que implementan cada uno un tipo de algoritmo
 * con diferentes complejidades temporales para realizar el calculo de cualquier
 * numero de la serie de fibonacci.
 *
 * @author Mauricio Belduque 
 * @version 1.0 - 20.10.2017
 */
public class FiboMethods {

	/**
	 * VERSION A : ALGORITMO ITERATIVO TIPICO hace una suma y tres asignaciones
	 * dentro de un ciclo iterativo de tipo for. Por lo tanto su complejidad
	 * temporal es O(1), porque ejecuta un número constante de operaciones. En
	 * general, todo programa que ejecute un número constante de operaciones tiene
	 * complejidad temporal O(1) Finalmente la complejidad del metodo es O(n) porque
	 * ejecuta un número de operaciones que siempre esta por debajo de una constante
	 * multiplicada por n
	 *
	 * @param n
	 *            Ejecuta el proceso n veces
	 * @return a - Entrega el valor de la variable que almacena el resultado del
	 *         calculo
	 */
	public static BigInteger serieFiboIterativa(int n) { // n >= 0

		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");

		for (int i = 0; i < n; i++) {
			BigInteger c = a.add(b); // La variable auxiliar c guarda el valor de a+b
			a = b; // A la variable 'a' asígnele el valor de la variable 'b'
			b = c; // A la variable 'b' asígnele el valor de la variable 'c'
		}

		return a;

	}

	/**
	 * VERSION B : ALGORITMO RECURSIVO TIPICO comprueba que la serie no sea igual a
	 * 0 o 1, posteriormente calcula la serie de manera recursiva, en este caso hace
	 * calculos costosos e innecesarios. el metodo se llama asi mismo, hace una
	 * resta, una suma y nuevamente se llama a si mismo para realizar una nueva
	 * resta recalculando la variable n por lo tanto su complejidad temporal es
	 * logaritmica y exponencial y hace que se produzca un desbordamiento de memoria
	 * que bloquea la ejecución y hará que el programa no responda.
	 * 
	 * @param n
	 *            Ejecuta el proceso n veces
	 * @return serieFiboRecursiva(n - 1).add(serieFiboRecursiva(n - 2) - Entrega el
	 *         valor de la adición
	 */
	public static BigInteger serieFiboRecursiva(int n) { // n >= 0

		switch (n) {
		case 0:
			return new BigInteger("0");
		case 1:
			return new BigInteger("1");
		default:
			// Si n >= 2
			return serieFiboRecursiva(n - 1).add(serieFiboRecursiva(n - 2));
		}

	}

}