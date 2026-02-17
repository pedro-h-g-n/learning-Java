public class Roman{
    public static void main(String[] args) {
        String take = "XLVII";
        int total = 0;

        for(int e = 0; e < take.length();e++){

        int current = RomanValue(take.charAt(e));
        
        if(e + 1 < take.length()){
            int next = RomanValue(take.charAt(e + 1));

            if(current < next){
             total -= current;
            } 
                else{
                    total += current;
                } 
        }       else{
                    total += current;
                }
        }
        System.out.println("The result is:"+total);
    }

    public static int RomanValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'M': return 1000;
            default: return 0;
        }

    }
} //Remember, the Roman numeral system only allows the subtraction of one letter (e.g., IV or IX).
