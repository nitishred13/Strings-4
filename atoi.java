class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
//We first trim the string and check if it starts with a valid sign or digit.
//Then we go through each character, stop at any non-digit, and build the number.
//If the number goes beyond 32-bit range, we clamp it to Integer.MAX_VALUE or MIN_VALUE.   
    public int myAtoi(String s){
        s = s.trim();
        if(s.length() == 0) return 0;
        char c = s.charAt(0);
        if(!Character.isDigit(c) && c != '+' && c != '-')
        {
            return 0;
        }
        boolean flag = true;

        if(c == '-')
        {
            flag = false;
        }
        long result = 0;

        for(int i=0;i<s.length();i++)
        {
            c = s.charAt(i);
            if(Character.isDigit(c))
            {
                result = result * 10 + c - '0';

                if(result>Integer.MAX_VALUE)
                {
                    if(flag)
                    {
                        return Integer.MAX_VALUE;
                    }
                    else
                    { return Integer.MIN_VALUE;
                    }

                }
            }
            else{
                if(i!=0) break;
            }
        }

        if(flag) return (int)result;
        else return -(int)result;
    }
}