class Reverse{
    public static void main(String args[])
    {
        String str = "manohar";
        String res="";

        for(int i=0;i<str.length();i++)
        {
            res+=str.charAt(str.length()-1-i);

        }
        System.out.println(res);

    }
}