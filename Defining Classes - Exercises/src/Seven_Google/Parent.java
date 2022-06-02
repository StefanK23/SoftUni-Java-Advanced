package Seven_Google;

public class Parent {

    private  String parentName ;
    private  String parentBirthDay;

    public Parent(String parentName , String parentBirthDay){
        this.parentBirthDay = parentBirthDay;
        this.parentName = parentName;
    }
    @Override
    public  String toString(){

        return parentName + " " + parentBirthDay;
    }

}
