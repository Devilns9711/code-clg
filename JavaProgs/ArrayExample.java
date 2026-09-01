import java.util.Scanner;

class ArrayExample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line ");
        String s = sc.nextLine();
        String ss = s.toLowerCase();
        char sarr[] = ss.toCharArray();
        int count=0;
        for(int i=0;i<sarr.length;i++)
           {
            switch(sarr[i])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    System.out.println(s.charAt(i));

            }
           }
        System.out.println("total number of vowels = "+count);
        //for(String name : names)
           // System.out.println(name);
            
        }
    }
