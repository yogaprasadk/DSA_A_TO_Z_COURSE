package bank;
interface kyc{
    void identity();
}

interface loan {
    public void identity(){
        System.out.println("checking pen and adhar");
    }

    public void eligible(){
        System.out.println("eligible");
    }
}