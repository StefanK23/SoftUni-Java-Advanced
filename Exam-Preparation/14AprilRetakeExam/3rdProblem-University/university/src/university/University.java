package university;
import java.util.ArrayList;
import java.util.List;


public class University {
    public List<Student> students;
    public int capacity;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {
        StringBuilder sb = new StringBuilder();
        for (Student s: students) {
            if(s.equals(student)){
                sb.append("Student is already in the university");
            }

        }

        if(capacity > students.size()){
            students.add(student);
            sb.append(String.format("Added student %s %s", student.getFirstName(), student.getLastName()));
        }
        else if(capacity <= students.size()){
            sb.append("No seats in the university");
        }
        return sb.toString();

    }

    public String dismissStudent(Student student) {

        StringBuilder sb = new StringBuilder();
        if(students.contains(student)){
            students.remove(student);
            sb.append(String.format("Removed student %s %s", student.getFirstName(), student.getLastName()));
        }
        else{
            sb.append("Student not found");
        }
        return sb.toString();
    }
        public Student getStudent (String firstName, String lastName){
            Student student = null;
            for (Student s : students) {
                if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)){
                    student = s;
                }
            }
            return student;

        }
        public String getStatistics () {
            StringBuilder builder = new StringBuilder();
            for (Student student : students) {
                System.out.printf("==Student: First Name %s, Last Name = %s, Best Subject = %s", student.getFirstName()
                        , student.getLastName()
                        , student.getBestSubject()).append(builder).append(System.lineSeparator());

            }


            return builder.toString().trim();
        }
    }

