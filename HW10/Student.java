package hw10;

abstract public class Student implements Enrolee{
    private String name;
    private int byear;
    private String group;

    Student(){}
    Student(String n, int y, String g){
        this.setName(n);
        this.setBYear(y);
        this.setGroup(g);
    }

    public String getName(){
        return name;
    };
    public void setName(String s){
        this.name=s;
    };

    public int getBYear(){
        return byear;
    };
    public void setBYear(int n){
       this.byear=n;
    };

    public String getGroup(){
        return group;
    };
    public void setGroup(String s){
        this.group=s;
    };


    public String toString(){
        return "Student: "+getName()+" | "+getBYear()+" | "+getGroup();
    }

}