    /**
     * Created by katherine_celeste on 8/10/16.
     */
    public class Kata {

        // Given a string, return a new string where spaces have been inserted between each letter.
        // Do not include any additional spaces before the first character or after the last character.
        public static String explode(String a)
        {
            String temp = "";
            for(int i = 0; i < a.length(); i++)
            {
                temp+= a.charAt(i);

                if (i < a.length()-1) temp+= " "; //exclude space after last char

            }
            return temp;
        }

        // Given a string, return a new string where "not " has been added to the front. However,
        // if the string already begins with "not", return the string unchanged.
        public static String notString(String a)
        {
            if((a.length() >=3) && (a.substring(0,3).equals("not")))
            {
                return a;
            }
            else
                {
                    String b = "not";
                    b+= " " + a;
                    return b;
                }
        }

        // Given a non-empty string and an integer, return a new string where the character at the specified
        // index has been removed. The specified index will be a valid index of in the original string (IE.
        // n will be in the range 0 .. str.length()-1 inclusive).
        public static String missingChar(String a, int b)
        {
            String partA = a.substring(0,b);
            String partB = a.substring(b+1, a.length());
            return partA+partB;
        }

        // Given a string, return a new string where the first and last characters have been exchanged.
        public static String frontBack(String a)
        {
            String sub ="";
            char first = a.charAt(0);
            char last = a.charAt(a.length()-1);
            if (a.length()==1)
            {return a;}
            else if (a.length()>2) {sub = a.substring(1,a.length()-1);}
            String finalString = last + sub + first;
            return finalString;

        }

        // Given a string, we'll say that the front is the first 3 characters of the string.
        // If the string length is less than 3, the front is whatever is there. Return a new
        // string which is 3 copies of the front.
        public static String front3(String a)
        {
           String front = "";
            if (a.length()<3) front = a;
            else front = a.substring(0,3);

            front = front + front + front;

            return front;

        }

        // Given a string, take the last character and return a new string with the last character
        // added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
        public static String backAround(String a){
            char b = a.charAt(a.length()-1);
            String c = b + a +b;
            return c;
        }

        // Given a string, take the first 2 characters and return the string with the 2 characters added at both
        // the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever
        // characters are there.
        public static String front22(String a){
            String b;
            if (a.length()<2) b = a;
            else b = a.substring(0, 2);
            String c = b + a +b;
            return c;
        }

        // Given a string, if the string "del" appears starting at index 1, return a
        // string where that "del" has been deleted. Otherwise, return the string unchanged.
        public static String delDel(String a){
            if (a.substring(1,4).equals("del"))
            {
                return a.charAt(0)+ a.substring(4, a.length());
            }
            else return a;
        }

        // Given a string, return a string made of the first 2 characters (if present), however include
        // first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
        public static String startOz (String a)
        {
            String b = "";

            if(a.length()>=2)
            {
                if (a.charAt(0)=='o') b = "" + 'o';
                if (a.charAt(1)=='z') b+= 'z';
                else return (a.substring(0,2));
            }

            return b;
        }

        //Given a string, return a new string where the last 3 characters are now in upper case.
        // If the string has less than 3 characters, uppercase whatever is there.
        public static String endUp(String a)
        {
            if (a.length()<3)
            {
                return a.toUpperCase();
            }
            else
                {
                    String b = a.toUpperCase();
                    return a.substring(0, a.length()-3) + b.substring(a.length()-3, a.length());
                }
        }

    }
