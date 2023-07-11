/* User-defined Package */
/* package abhi;  // for running the code, type "javac -d . A.java" and write "java abhi.A " in the next step"

 public class A 
{
    protected void show()
    {
        System.out.println("Learn Coding..!");
    }
} */
package ankush;  // first of all u have to make above package for this
import abhi.A;
class C extends A  // for running the code, type "javac -d . A.java" and write "javac -d. C.java" in the next step and write "java ankush.C " in the next step"
{
    public static void main(String[] args) {
     
        C r=new C();
        r.show();
    }
}
