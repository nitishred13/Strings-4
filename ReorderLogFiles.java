import java.util.Arrays;

public class ReorderLogFiles {
// Time Complexity: O(k*nlogn)
// Space Complexity: O(1)
//We split each log into an identifier and the rest of the line.
//Letter-logs get sorted first by their text and then by their id; digit-logs keep their order.
//A custom comparator in the sort call enforces these rules in one pass.
    public String[] reorderLogs(String[] logs)
    {
        Arrays.sort(logs,(a,b)->{
            String[] splitArr1 = a.split(" ",2);
            String[] splitArr2 = b.split(" ",2);

            boolean isDigit1 = Character.isDigit(splitArr1[1].charAt(0));
            boolean isDigit2 = Character.isDigit2(splitArr2[1].charAt(0));

            if(!isDigit1 && !isDigit2)
            {
                int cmp = splitArr1[1].compareTo(splitArr1[1]);
                if(cmp==0)
                {
                    return splitArr1[0].compareTo(splitArr2[0]);
                }
                return cmp;
            }
            else if(!isDigit1 && isDigit){
                return -1;
            }
            else if(isDigit && !isDigit2){
                return 1;
            }
            else{
                return 0;
            }
        });
        return logs;
    }
}
