/**
 * Created by a on 08/11/2016.
 */
public class Ch_5_6 {

    //Buzz

    /**Exercise 5.6 : Lines of code numbered in sequence of execution.
     Value of parameter blimp when baffle gets invoked is "rattle"*/

    public static void baffle(String blimp) {
        System.out.println(blimp);                           //6
        zippo("ping", -5);                                    //7
    }
    public static void zippo(String quince, int flag) {   //2  //8
        if (flag < 0) {                                    //3  //9
            System.out.println(quince + " zoop");                //10
        } else {
            System.out.println("ik");                       //4
            baffle(quince);                                  //5
            System.out.println("boo-wa-ha-ha");                     //11
        }
    }
    public static void main(String[] args) {
        zippo("rattle", 13);                             //1
    }
}
