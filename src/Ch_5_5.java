/**
 * Created by a on 08/11/2016.
 */
public class Ch_5_5 {

    public static void main(String[] args) {
        countdown(99);
    }
    public static void countdown(int numOfBottles) {
        if (numOfBottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        }else{
            System.out.println(numOfBottles + " bottles of beer on the wall,");
            System.out.println(numOfBottles + " bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");
            if (numOfBottles==1){
                System.out.println("no bottles of beer on the wall,\n");
                countdown(numOfBottles-1);
            }else{
                System.out.println((numOfBottles-1) + " bottles of beer on the wall,\n");
                countdown(numOfBottles-1);}
        }}
}
