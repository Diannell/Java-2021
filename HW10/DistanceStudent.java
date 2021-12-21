package hw10;

public class DistanceStudent extends Student {

    DistanceStudent(){}
    DistanceStudent(String n, int y, String g){
        super(n,y,g);
    }

    public String toString(){
        return "DistanceStudent: "+getName()+" | "+getBYear()+" | "+getGroup();
    }

}