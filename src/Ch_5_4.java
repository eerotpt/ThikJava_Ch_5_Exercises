/**
 * Created by a on 08/11/2016.
 */
public class Ch_5_4 {

    public static void main(String[] args) {
        int n=5;
        checkFermat(3,4,5,n);
    }

    public static void checkFermat(int a,int b,int c,int n) {

        int theoremPart1 = ((int) Math.pow(a, n)) + ((int) Math.pow(b, n));
        int theoremPart2 = (int) Math.pow(c, n);

        if (theoremPart1 == theoremPart2 && n > 2) {
            System.out.print("Holy smokes, Fermat was wrong!");
        } else {
            if (theoremPart1 == theoremPart2){
                System.out.println(theoremPart1+"="+theoremPart2+" That does work.");
            }else{
                System.out.println(theoremPart1+"<>"+theoremPart2+" No, that doesn't work.");
            }
            if (n==0){
                System.out.print("End");
            }else {
                checkFermat(3, 4, 5, n - 1);
            }

        }

    }
}
