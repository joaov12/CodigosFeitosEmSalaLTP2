public class Potencia {
    public static void main(String[] args) {
        System.out.print(calcPot(2,2));
    }
    public static int calcPot(int base, int expoente){
        if (expoente == 0){
            return 1;
        } else {
            return base * calcPot(base, expoente - 1);
        }
    }
}
