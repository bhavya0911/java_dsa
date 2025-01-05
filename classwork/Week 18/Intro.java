public class Intro {
        public static void main(String args[]) {
            Pen p1 = new Pen();
            p1.setColor("Blue");
            System.out.println(p1.getColor());
            p1.setTip(5);
            System.out.println(p1.getTip());
            p1.setColor("Yellow");
            System.out.println(p1.getColor());

            BankAccount myAcc = new BankAccount();
            myAcc.username = "alp";
            myAcc.setPassword("314");
        }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}