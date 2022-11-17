public class Palindromo {

    public static void main(String args[])
    {
        String str = "arara";

        if (pegaTamanhoDaString(str))
            System.out.println("É um palindromo");
        else
            System.out.println("Não é um palindromo");
    }

    static boolean verificaPalindromo(String str, int s, int e)
    {
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return verificaPalindromo(str, s + 1, e - 1);

        return true;
    }

    static boolean pegaTamanhoDaString(String str) // Pega tamanho da String || Começo e Final da mesma
    {
        int n = str.length();

        if (n == 0)
            return true;

        return verificaPalindromo(str, 0, n - 1);
    }
}
