public class Palindromo {

    public static void main(String args[])
    {
        String str = "geeg";

        if (pegaTamanhoDaString(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean isPalRec(String str, int s, int e)
    {
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean pegaTamanhoDaString(String str) // Pega tamanho da String || Começo e Final da mesma
    {
        int n = str.length();

        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
}
