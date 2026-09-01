import java.util.*;
public class MyTask {
    String names[]=new String[4];
    MyTask()
    {
        System.out.println("A new Object has been created...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+names.length+" names");
        for(int i=0;i<names.length;i++)
            names[i]=sc.nextLine();
    }
void arrange()
{
    for(int i=0;i<names.length-1;i++)
        {
            String temp;
            for(int j=i+1;j<names.length;j++)
            {
                if(names[i].compareTo(names[j]))
                {
                            // compate and swap positions
                }
            }
        }
}
void showNames()
{
    for(String name:names)
        System.out.println(name);
}
public static void main(String[] a)
{
    MyTask mt1 = new MyTask();
    MyTask mt2 = new MyTask();
    mt2.arrange();
    mt1.arrange();
}
}
