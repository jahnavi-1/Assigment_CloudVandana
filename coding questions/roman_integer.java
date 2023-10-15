import java.util.*;

class roman_integer {
    // Finds decimal value of a given roman numeral
    public static int romanToInteger(String str) {
        // code here
        HashMap<Character,Integer> a=new HashMap<>();
        a.put('I',1);
        a.put('V',5);
        a.put('X',10);
        a.put('L',50);
        a.put('C',100);
        a.put('D',500);
        a.put('M',1000);
        int number=0;
        str = str.replace("IV","IIII");  
        str = str.replace("IX","VIIII");  
        str = str.replace("XL","XXXX");  
        str = str.replace("XC","LXXXX");  
        str = str.replace("CD","CCCC");  
        str = str.replace("CM","DCCCC");  
        for(int i=0;i<str.length();i++)
        {
            number=number+a.get(str.charAt(i));
        }
        return number;
    }
	public static void main(String arg[])
	{
		String romanNumber="V";
		System.out.println(romanToInteger(romanNumber));
	}
}