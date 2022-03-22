package proje;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int sozlu1, int sozlu2, int sozlu3) {
        if (note1 >= 0 && note1 <= 100 && sozlu1 >= 0 && sozlu1 <= 100) {
            double note11 = (note1 * (0.8) + sozlu1 * (0.2));
            this.c1.note = (int) note11;
        }
        if (note2 >= 0 && note2 <= 100 && sozlu2 >= 0 && sozlu2 <= 100) {
            double note22 = (note2 * (0.8) + sozlu2 * (0.2));
            this.c2.note = (int) note22;

        }
        if (note3 >= 0 && note3 <= 100 && sozlu3 >= 0 && sozlu3 <= 100) {
            double note33 = (note3 * (0.8) + sozlu3 * (0.2));
            this.c3.note = (int) note33;
        }
    }
    void isPass(){
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("Sınıfı geçti");
        }else{
            System.out.println("Sınıfta kaldı.");
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
