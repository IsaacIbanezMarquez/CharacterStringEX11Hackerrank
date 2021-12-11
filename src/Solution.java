




import java.io.*;
import java.util.*;





// Missatge reduït:


/* Donat un text acabat amb final de línia, redueix el text de forma que de cada paraula ens quedem amb la primera i la última lletra i en majúscula. En el cas que la paraula tingui una única lletra deixem aquesta en majúscula. Escriu el resultat final.

Input Format

Cadena de text fins a final de línia.

Constraints

No n'hi ha.

Output Format

Text reduït.

Sample Input 0

Aquest es un text reduit
Sample Output 0

AT ES UN TT RT
Sample Input 1

I aquEsT un Altre TamBe
Sample Output 1

I AT UN AE TE

 */





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String frase = new String(sc.nextLine().toUpperCase());
        String array[]= frase.split(" ", 0);
        String resposta;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i].length() == 1)
            {
                System.out.print(array[i].charAt(0) + " ");
            }

            else
            {
                System.out.print(array[i].charAt(0) + "" + array[i].charAt(array[i].length() - 1) + " ");
            }

        }
    }

}
