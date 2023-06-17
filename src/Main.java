import java.security.PublicKey;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // GETSUM FÜGGVÉNY
        int[] array = new int[]{10, 2, 6, 4, 1};
        int sum = BasicAlgoritms.GetSum(array);
        System.out.println("Összeg: " + sum);

        // COUNTNEGATIV FÜGGVÉNY
        int[] array2 = new int[]{10, 2, -6, -4, -1};
        int negativok = BasicAlgoritms.CountNegative(array2);
        System.out.println("Negativ szamok db: " + negativok);

        // GETMIN FÜGGVÉNY
        int[] array3 = new int[]{10, 2, -6, -4, -1};
        int legkisebb = BasicAlgoritms.GetMin(array3);
        System.out.println("A töm legkissebb eleme: " + legkisebb);

        // GETMININDEX FÜGGVÉNY
        int[] array4 = new int[]{10, 2, -6, -4, -1};
        int minIndex = BasicAlgoritms.GetMinIndex(array4);
        System.out.println("Tömb legkissebb szam indexe: " + minIndex);

        // CONTAINS ELEMENT FÜGGVÉNY
        int[] array5 = new int[]{10, 2, -6, -4, -1};
        System.out.println("Van benne 2? " + BasicAlgoritms.ContainsElement(array5, 2));

        // INDEXOF FÜGGVÉNY
        int[] array6 = new int[]{10, 2, -6, -4, -1};
        System.out.println("2 indexe? : " + BasicAlgoritms.IndexOf(array6, 2));

        // COPYTWICE FÜGGVÉNY
        int[] array7 = new int[]{10, 2, -6, -4, -1, 3};
        System.out.println("Eredeti: " + Arrays.toString(array));
        System.out.println("Eredeti tömb 2x-ese: " + Arrays.toString(BasicAlgoritms.CopyTwice(array7)));

        // GETEVENS FÜGGVÉNY
        int[] array8 = new int[]{10, 2, -6, -4, -1, 3};
        System.out.println("Páros elemek tömb: " + Arrays.toString(BasicAlgoritms.GetEvens(array8)));

        // GETBYPARITY FÜGGVÉNY
        int[] array9 = new int[]{10, 2, -6, -4, -1, 3};
        BasicAlgoritms.GetByParity(array9);

        // SECTION, metszet függvény
        int[] res = BasicAlgoritms.Section(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{5, 6, 7, 8, 9, 10});
        System.out.println("Közös elemek: " + Arrays.toString(res));

        // UNIO függvény
        int[] res2 = BasicAlgoritms.Union(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{5, 6, 7, 8, 9, 10});
        System.out.println("Union: " + Arrays.toString(res2));


    }
}