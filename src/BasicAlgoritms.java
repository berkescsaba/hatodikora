import java.util.Arrays;

public class BasicAlgoritms {
    /**
     * Összeadja a tömb elemeit
     *
     * @param bevitel Számokat tároló tömb
     * @return Az összeg 0 ha nincs elem
     */
    public static int GetSum(int[] bevitel) {
        int sum = 0;
        for (int i = 0; i < bevitel.length; i++) {
            sum += bevitel[i];
        }
        return sum;
    }

    /**
     * Összegzi hány db negativ szám van a tömben
     *
     * @param bevitel Számokat tároló tömb
     * @return Összeg 0 ha nicns elem
     */
    public static int CountNegative(int[] bevitel) {
        int count = 0;
        for (int i = 0; i < bevitel.length; i++) {
            if (bevitel[i] < 0) {
                count++;
            }
        }
        return count;

    }

    /**
     * Kiirja a tömb legkissebb elemét
     *
     * @param bevitel Tömb számokkal
     * @return 0 ha nincs elem
     */
    public static int GetMin(int[] bevitel) {
        int legkissebb = bevitel[0];
        for (int i = 0; i < bevitel.length; i++) {
            if (bevitel[i] < legkissebb) {
                legkissebb = bevitel[i];
            }
        }
        return legkissebb;
    }

    /**
     * Minimum szám indexe
     *
     * @param bevitel Tömb amiben számok vannak
     * @return A legkisebb elem indexe -1 ha nincs benne elem
     */
    public static int GetMinIndex(int[] bevitel) {
        int minIndex = 0;
        for (int i = 0; i < bevitel.length; i++) {
            if (bevitel[i] < bevitel[minIndex]) {
                minIndex = i;
            }
        }
        return bevitel.length > 0 ? minIndex : -1;
    }

    /**
     * Megnéz hogy van e ilyen elem a tömben
     *
     * @param bevitel Tömb ami számokat tárol
     * @param element Elem amit keresünk
     * @return true ha van ilyen elem, false ha nincs
     */
    public static boolean ContainsElement(int[] bevitel, int element) {
        for (int i = 0; i < bevitel.length; i++) {
            if (bevitel[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Keresés, megkeresi az element első előfordulásának indexét
     *
     * @param bevitel Tömb számokkal
     * @param element Ezt keressük
     * @return Az elem első elfordulási indexe, -1 ha nincs
     */
    public static int IndexOf(int[] bevitel, int element) {
        int index = -1;
        for (int i = 0; i < bevitel.length; i++) {
            if (bevitel[i] == element) {
                index = 1;
                break;
            }
        }
        return index;
    }

    /**
     * Új tömb + szorzás
     *
     * @param src
     * @return
     */
    public static int[] CopyTwice(int[] src) {
        int[] dst = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i] *= 2;
        }
        return dst;
    }

    /**
     * Kiválogatás páros számokra
     *
     * @param src Ebben keressük a páros számokat
     * @return A páros számokat tartalmazó tömb üres is lehet
     */
    public static int[] GetEvens(int[] src) {
        int[] dst = new int[0];
        int j = 0;
        for (int i = 0; i < src.length; i++) {
            if (src[i] % 2 == 0) {
                dst = Arrays.copyOf(dst, dst.length + 1);
                dst[j] = src[i];
                j++;
            }
        }
        return dst;
    }

    /**
     * paros és páratlant szortiroz
     * @param src
     */
    public static void GetByParity(int[] src) {
        int[] paros = new int[0];
        int j = 0;
        int[] paratlan = new int[0];
        int k = 0;
        for (int i = 0; i < src.length; i++) {
            if (src[i] % 2 == 0) {
                paros = Arrays.copyOf(paros, paros.length + 1);
                paros[j++] = src[i];
            } else {
                paratlan = Arrays.copyOf(paratlan, paratlan.length + 1);
                paratlan[k++] = src[i];
            }
        }
        System.out.println("Paros: " + Arrays.toString(paros));
        System.out.println("Paratlan: " + Arrays.toString(paratlan));
    }

    /**
     * Metszet, két több közös elemait irja ki
     * @param a Első tömm
     * @param b Második tömb
     * @return
     */
    public static int[] Section(int[] a, int[] b) {
        int[] dst = new int[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    dst = Arrays.copyOf(dst, dst.length +1);
                    dst[dst.length -1] = a[i];
                    break;
                }
            }
        }
        return dst;
    }

    /**
     * UNION egyesítés, diában olvasd el!
     * @param a egyik tömb
     * @param b másik tömb
     * @return
     */
    public static int[] Union(int[] a, int[] b) {
        int[] dst = a.clone();
        for (int j = 0; j < b.length; j++) {
            boolean contains = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                dst = Arrays.copyOf(dst, dst.length +1);
                dst[dst.length - 1] = b[j];
            }
        }
        return dst;
    }




}

