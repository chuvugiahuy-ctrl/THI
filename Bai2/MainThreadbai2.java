public class MainThreadbai2 {
public static void main(String[] args) {
    System.out.println("===== STUDENT 1 =====");
    StudentMark student1 = new StudentMark();
    student1.setchecktheoryMark(47);
    student1.setcheckpracticalMark(57);
    student1.setcheckassignmentMark(75);
    student1.displayResult();
    System.out.println();
    System.out.println("===== STUDENT 2 =====");
    StudentMark student2 = new StudentMark();
    student2.setchecktheoryMark(47);
    student2.setcheckpracticalMark(30);
    student2.setcheckassignmentMark(75);

    student2.displayResult();
}
}
