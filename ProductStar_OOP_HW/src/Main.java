public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Петр";
        student.years = 3;
        student.status = "Студент";

        System.out.println(student.status + " " + student.name + " учится на " + student.years + " курсе");
        System.out.print(student.name + " говорит: ");
        getActivity(student);
        System.out.println();

        Docent docent = new Docent();
        docent.name = "Павел Иванович";
        docent.years = 25;
        docent.status = "Доцент";

        System.out.println(docent.status + " " + docent.name + " преподает в университете " + docent.years + " лет");
        System.out.print(docent.name + " говорит: ");
        getActivity(docent);

    }
    public static void getActivity(University university){
        university.activity();
    }
}