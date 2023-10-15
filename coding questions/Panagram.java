import java.util.*;
class Panagram{
    public static boolean checkIfPangram(String sentence) {
        String k="abcdefghijklmnopqrstuvwxyz";
        int i;
        HashMap<Character,Integer> a=new HashMap<>();
        for(i=0;i<sentence.length();i++)
        {
            if(a.containsKey(sentence.charAt(i)))
            {
                a.put(sentence.charAt(i),a.get(sentence.charAt(i))+1);
            }
            else{
                a.put(sentence.charAt(i),1);
            }
        }
        for(i=0;i<k.length();i++)
        {
            if(a.containsKey(k.charAt(i)))
            {

            }
            else{
                //System.out.println(k.charAt(i));
                return false;
            }
        }
        return true;
        
    }
	public static void main(String arg[])
	{
		String sentence="abcdefghj";
		System.out.println(checkIfPangram(sentence));
	}
}