class conversion{
    public static void main(String[] args) {
        int dec = 6;
        System.out.println(decimaltoanybase(dec));

        // range
        for (int i = 1; i <= dec; i++) {
            System.out.println(range(i));
        }
    }

    public static int decimaltoanybase(int n){
        int ans = 0;
        int pow  = 1;
        int rem = 0;
        while(decimalnumber>0){
            rem = decimalnumber%2; //  if need to convert change(what base you need) to octal - 8,hexadecimal - 16,binary = 2;
            decimalnumber = decimalnumber/2; // if need to convert change(what base you need) to octal - 8,hexadecimal - 16,binary = 2;
            ans = ans + (rem*pow);
            pow = pow * 10;
        }
    }

    // to print binary value from 1 to N
    public static int range(int n){
        int ans = 0;
        int pow  = 1;
        int rem = 0;
        while(decimalnumber>0){
            rem = decimalnumber%2; //  if need to convert change(what base you need) to octal - 8,hexadecimal - 16,binary = 2;
            decimalnumber = decimalnumber/2; // if need to convert change(what base you need) to octal - 8,hexadecimal - 16,binary = 2;
            ans = ans + (rem*pow);
            pow = pow * 10;
        }
    }
}