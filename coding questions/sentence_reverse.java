

class sentence_reverse {
    public static String reverse(String s)
    {
        String k="";
        for(int i=s.length()-1;i>=0;i--)
        {
            k=k+s.charAt(i);
        }
        return k;
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String S="Jahnavi is";
        String a[]=S.split(" ");
        System.out.println(a.length);
        String ans="";
        for(int i=0;i<a.length;i++)
        {
            a[i]=reverse(a[i]);
            ans=ans+a[i]+" ";
            
        }
        System.out.println(ans);
    }
}