package lektion1;

public class program4 {
    public static void main(String[] args) {
        String [] strArr = new String[] {"1","3","2"};
        String find = "4";
        String repl  = "4";
        String [] strNewArr = new String[strArr.length+1];
        strNewArr = findAndReplace (strArr, find, repl);
        for (int  i = 0; i < strNewArr.length; i++) {
            System.out.print(strNewArr[i] + " ");
        }
    }

    public static String [] findAndReplace (String [] strArr, String find, String repl){
        int x = 0;
        String [] strEx = new String[strArr.length + 1];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == find)
                strEx[i] = repl;
                else {
                    strEx [i] = strArr[i];
                    x++;
                }
        } 
        if (x == strArr.length)
            strEx [strArr.length] = "Искомое значение не найдено, попробуйте снова";
            else return strEx;  
        
        return  strEx;
    }        
}
