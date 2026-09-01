class ExampleProgram
{
    public static void main(String[] args) {
        int a[]={12,2,3};
        try{
        int b=0;
        System.out.println(a[2]/b);
        }
        catch(Exception e)
        {
            System.out.println("kuchh toh gadbad hai....");
        }
        finally
        {
            System.out.println("program ends here");
        }
    }
}