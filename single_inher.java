class baseclass 
{
    public void show()
    {
        System.out.println( "This is the Base Class" );
    }
}

class childclass extends baseclass
{
    public void showme()
    {
        System.out.println( "This is the Child Class" );
    }
}

class single_inher
{
    public static void main (String[] args)
    {
        childclass  c = new childclass();
        c.show();
        c.showme();
    }
}