/* User-defined Package */
package abhi;   // for running the code, type "javac -d . A.java" and write "java abhi.A " in the next step"

class A 
{
    protected void show()
    {
        System.out.println("Learn Coding..!");
    }
}
class B 
{
    public static void main(String[] args) {
        
        A r=new A();
        r.show();
    }
}
