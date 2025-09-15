public interface staticinterface {
        public static void dispaly(){
            System.out.println("display");
        }

}

class B implements staticinterface{
    public static void main(String[] args) {
        dispaly();
    }
}

/*
 interface can contain static methods but we cannot inherit it
 */