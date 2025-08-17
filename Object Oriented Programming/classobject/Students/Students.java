package Students;

public class Students {
    String name;
    int age;
    static String language = "JAVA";
    double marks;
    static String academy  = "QSPIDERS";
    
    Students(){
        name  = "Yogaprasad";
        age   = 22;
        marks = 67;
    }

    public Students(String name,int age,double marks){
            this.name  = name;
            this.age   = age;
            this.marks = marks;
    }

    public void details(){
        System.out.println("Name    :"+ name);
        System.out.println("Age     :"+ age);
        System.out.println("Marks   :"+ marks);
        System.out.println("Academy :"+ academy);
        System.out.println("Language:"+ language);
    }


    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students("Rahul", 22, 97);
        Students student3 = new Students("ramana", 21, 70);
        Students student4 = new Students("KL RAHUL",24,98);
        Students student5 = new Students("Soundharya", 20, 87);

        // check which student having mark is greater than 80 print their details

        Students[] student = {student1,student2,student3,student4,student5};

        for (int i = 0; i < student.length; i++) {
            if(student[i].marks > 80){
                student[i].details();
            }
        }
    }
}
