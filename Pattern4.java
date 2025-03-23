public class Pattern4
{
    public static void main(String[] args) {
        for (int i = 5; i >=0; i--) {
            //Outer Loop
            for (int j = 0; j <= i; j++) {


                System.out.print(" ");

            }
            for (int j = 0; j <= 5-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
