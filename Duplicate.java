public class Duplicate {
    public static void main(String args[])
    {
        String str="manohar";
        char ch[] = new char[str.length()];
        int letters = 0;
        String d = "";
        String duplicates="";
        for(int i=0;i<str.length();i++)
        {
            String character = Character.toString(str.charAt(i));
            if(d.contains(character))
            {
               duplicates+=character;
            }
            character+=d;
        }
        System.out.print(duplicates);
    }
}
