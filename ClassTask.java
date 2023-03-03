import student.StudentData;
public class ClassTask {
    public static void main(String args[]){
        StudentData ada = new StudentData();
        ada.setRoll(1);
        ada.setName("Adarsh");
        ada.setCourse("Computer Science");
        ada.setMark1(96);
        ada.setMark2(85);
        ada.setMark3(90);

        StudentData twin = new StudentData();
        twin.setRoll(2);
        twin.setName("Twinkle");
        twin.setCourse("Computer Science");
        twin.setMark1(88);
        twin.setMark2(88);
        twin.setMark3(89);

        StudentData ayu = new StudentData();
        ayu.setRoll(3);
        ayu.setName("Aayush");
        ayu.setCourse("Computer Science");
        ayu.setMark1(76);
        ayu.setMark2(85);
        ayu.setMark3(99);

        StudentData gun = new StudentData();
        gun.setRoll(4);
        gun.setName("Gunjan");
        gun.setCourse("Computer Science");
        gun.setMark1(65);
        gun.setMark2(85);
        gun.setMark3(77);

        StudentData nav = new StudentData();
        nav.setRoll(5);
        nav.setName("Naveen");
        nav.setCourse("Computer Science");
        nav.setMark1(77);
        nav.setMark2(85);
        nav.setMark3(63);

        System.out.println(ada + "   " +  ada.calculateGrade());
        System.out.println(twin +"   " + twin.calculateGrade());

        System.out.println(ayu + "   " +  ayu.calculateGrade());
        System.out.println(gun +"   " + gun.calculateGrade());

        System.out.println(nav + "   " + nav.calculateGrade());
    }
    
}
