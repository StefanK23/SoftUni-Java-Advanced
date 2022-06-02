package groomingSalon;


import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    public List<Pet> data;
    public int capacity;


    public GroomingSalon (int capacity){
        data = new ArrayList<>();
        this.capacity= capacity;
    }

    public List<Pet> getPetList() {
        return data;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add(Pet pet){
        if(this.data.size() < this.getCapacity()){
            this.data.add(pet);
        }
    }
    public boolean remove(String name){
        return this.getPetList().removeIf(element -> element.getName().equals(name));
    }
    public Pet getPet(String name, String owner){

            for (Pet pet : data) {
                if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                    return pet;
                }
            }
            return null;
        }

     public int getCount(){
        int count =0;
         for (int i = 0; i < this.data.size(); i++) {
             count++;
         }
         return count;
     }
     public String getStatistics(){
         StringBuilder sb = new StringBuilder();
         String toAppend = "The grooming salon has the following clients:";
         sb.append(toAppend).append(System.lineSeparator());

         for (Pet pet : this.data) {
             sb.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
         }
         return sb.toString().trim();
     }

}
