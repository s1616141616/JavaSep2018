/**
 * 
 */
package javabasic;

/**
 * @author Saif
 * 		byte (number, 1 byte)
 * 		short (number, 2 bytes)
 * 		int (number, 4 bytes) 
 *      long (number, 8 bytes)
 *      float (float number, 4 bytes)
 *      double (float number, 8 bytes)
 *      char (a character, 2 bytes)
 *      boolean (true /false, 1 byte)
 */
public class DataType {

	public static void main(String[] args) {

		short var_short = 10;
		float var_float = 4.5F;
		float var_float1 = (float) 8.5; // different way of declaration.
		double var_double = 11.56;
		char var_char = 'H';
		boolean var_true_false = false;

		System.out.println(var_short);
		System.out.println(var_float);
		System.out.println(var_float1);
		System.out.println(var_double);
		System.out.println(var_char);
		System.out.println(var_true_false);
	}
}