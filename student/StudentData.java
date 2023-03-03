package student;

public class StudentData {
    private int rollNumber;
    private String name;
    private String course;
    private int mark1;
    private int mark2;
    private int mark3;

    public int calculateTotal(){
        return (mark1 + mark2 + mark3);
    }


    public String calculateGrade(){
        double total = calculateTotal();
        double average = (total*100)/300;
        
        if(average>=90)
            return "A+";
        else if(average>=80 && average<90)
            return "A";
        else if(average>=70 && average<80)
            return "B+";
        else if(average>=60 && average<70)
            return "B";
        else if(average >= 50 && average<60)
            return "C+";
        else if(average >= 40 && average<50)
            return "C";
        else if(average>=34 && average<40)
            return "D";
        
        return "F";

        
    }

    public void setRoll(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public int getRoll(){
        return rollNumber;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    
    
    public void setMark1(int mark1){
        this.mark1 = mark1;
    }
    public int getMark1(){
        return mark1;
    }


    public void setMark2(int mark2){
        this.mark2 = mark2;
    }
    public int getMark2(){
        return mark2;
    }

    public void setMark3(int mark3){
        this.mark3 = mark3;
    }
    public int setmMark3(){
        return mark3;
    }

    public String toString(){
        return "Roll number : " + rollNumber + "   " + "Name : " + name +"    "+ "Course : " + course ; 
    }
    
}
