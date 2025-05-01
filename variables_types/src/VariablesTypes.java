/* PrimitiveType 
 * byte - Valor -128 a 127 podemos usar 1 byte
 * short - Valor -32.768 a 32.767 podemos usar 2 bytes
 * int - Valor -122147483648 a 2147483647 podemos usar 4 bytes
 * long - Valor -9223372036854775808L a 9223372036854775807L podemos usar 8 bytes
 
 * Tipos primitivos que podem conter partes fracionarias:

 * float - usa 4 bytes de memoria
 * double - usa 8 bytes de memoria
 

 * boolean - True or false
 * char - caracter
 
 Operadores

 == 'Igual'
 != 'Diferente'
 < 'Menor'
 > 'Maior'
 <= 'Menor Igual'
 >= 'Maior Igual'
  
 * 
*/

public class VariablesTypes {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    }
}
