/**
 * Created by a on 08/11/2016.
 */
public class Ch_5_2 {

    /**Draw a stack diagram that shows the state of the program the second
     time ping is invoked.>>>
     >>>ping is invoked only once!
     */

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }
    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }
    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork) ;
    }
    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }

}
