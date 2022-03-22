package proje;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","89465465416","TRH");
        Teacher t2 = new Teacher("Ali Hoca", "2164988945","FZK");
        Teacher t3 = new Teacher("Ahmet Hoca", "28946545847","BYJ");

        Course tarih = new Course("Tarih","101","TRH",t1);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","101","FZK",t1);
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji","101","BYJ",t1);
        biyoloji.addTeacher(t3);


        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,80,50,80,80,60);
        s1.isPass();
    }
}
