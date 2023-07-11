/* User-defined Package */
package abhi;  // for running the code, type "javac -d . A.java" and write "java abhi.A " in the next step"

class A 
{
    protected void show()
    {
        System.out.println("Learn Coding..!");
    }
}
class B extends A
{
    public static void main(String[] args) {
        
        B r=new B();
        r.show();
    }
}
