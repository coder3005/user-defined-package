/* User-defined Package */
/* package abhi;  // for running the code, type "javac -d . A.java" and write "java abhi.A " in the next step"

public class A 
{
    public void show()
    {
        System.out.println("Learn Coding..!");
    }
} */
package ankush;
import abhi.A;
class C 
{
    public static void main(String[] args) {
     
        A r=new A();
        r.show();
    }
}
