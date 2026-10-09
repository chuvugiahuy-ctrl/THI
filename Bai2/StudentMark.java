
public class StudentMark {
private double theoryMark;
private double practicalMark;
private double assignmentMark;
public void setchecktheoryMark(double theoryMark) {
    this.theoryMark = theoryMark;
}
public void setcheckpracticalMark(double practicalMark) {
    this.practicalMark = practicalMark;
}
public void setcheckassignmentMark(double assignmentMark) {
    this.assignmentMark = assignmentMark;
}
public boolean checktheoryMark() {
    return theoryMark >= 40;
}
public boolean checkpracticalMark() {
    return practicalMark >= 40;
}
public boolean checkassignmentMark() {
    return assignmentMark >= 40;
}
public boolean checkPass() {
    if (theoryMark >= 40
            && practicalMark >= 40
            && assignmentMark >= 40) {
        return true;
    } else {
        return false;
    }
}
public void displayResult() {
    System.out.println("Diem ly thuyet: " + theoryMark);
    System.out.println("Diem thuc hanh: " + practicalMark);
    System.out.println("Diem Assignment: " + assignmentMark);
    if (checkPass()) {
        System.out.println("Ket qua: DA DAT (PASS)");
    } else {
        System.out.println("Ket qua: TRUOT (FAIL)");
    }
}
}
