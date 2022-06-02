package Seven_Google;

public class Child {

    private String childName;
    private String childBirthDay;

    public Child(String childName,String childBirthDay) {
        this.childName = childName;
        this.childBirthDay = childBirthDay;
    }
@Override
    public String toString(){
        return childName+ " " + childBirthDay;
}
}
