
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class a
{
    public static void descending(int n){
        System.out.println(n);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        if (n>0){
            descending(n-1);
        }
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
