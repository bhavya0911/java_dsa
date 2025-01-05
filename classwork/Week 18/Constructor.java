public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student("adf");
        System.out.println(s1.name);
        s1.roll = 13;
        s1.marks[0] = 14;
        s1.marks[1] = 15;
        s1.marks[2] = 16;
        Student s2 = new Student();
        Student s3 = new Student(123);
        System.out.println(s3.roll);
        Student s4 = new Student(s1, true);
        for(int i = 0; i < s4.marks.length; i++) {
            System.out.println(s4.marks[i]);
        }
        s1.marks[1] = 4;
        System.out.println(s4.marks[1]);
    }
}

class Student {
    String name;
    int roll;
    String passowrd;
    int marks[];

    Student(Student s, boolean a) {
        if(a) {
            marks = new int[3];
            this.name = s.name;
            this.roll = s.roll;
            for(int i = 0; i < marks.length; i++) {
                this.marks[i] = s.marks[i];
            }
        }
    }

    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        this.marks = s.marks;
    }

    Student() {
        System.out.println("constructor is called..");
    }

    Student(String name) {
        this.name = name;
        this.marks = new int[3];
    }

    Student(int roll) {
        this.roll = roll;
    }
}
