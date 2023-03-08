public class Kanal {
    private String name;
    private int number;

    public Kanal() {
    }

    public Kanal(String name, int number) {
        if(number<0&&number<=10){
               System.err.println("Такого канала не существует,напишете от 1 до 10");
        }else{
        this.name = name;
        }
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Kanal{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

}
