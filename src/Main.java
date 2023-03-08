import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kanal kanal1=new Kanal("Баластан",3);
        Kanal kanal2=new Kanal("КТРК",1);
        Kanal kanal3=new Kanal("Osh Pirim",7);
        Kanal kanal4=new Kanal("312кино",9);
        Kanal kanal5=new Kanal("ТНТ",8);
        Kanal kanal6=new Kanal("tumar TV",4);
        Kanal kanal7=new Kanal("Элтр",5);
        Kanal kanal8=new Kanal("5 kanal",2);
        Kanal kanal9=new Kanal("Semeinyi",10);
        Kanal kanal10=new Kanal("SmartTV",6);
        Kanal[]kanals={kanal1,kanal2,kanal3,kanal4,kanal5,kanal6,kanal7,kanal8,kanal9,kanal10};
        Television television=new Television(kanal1,kanals);
        System.out.println("|------------------------------|");
        System.out.printf(" |                   %s         |\n",television.getCurrentChannel().getName());
        System.out.printf(" |                           %d |\n",television.getCurrentChannel().getNumber());
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|------------------------------|");
        System.out.println("               |  |             ");

        System.out.println("Нажмите на номер канала,и я вывиду имя канала");
        System.out.println("Нажмите на >,и я переключю cледующий канал");
        System.out.println("Нажмите на <,и я переключю на предыдущий канал");
        System.out.println("Нажмите на !, и я выключю телевизор");

        while(true) {
            Scanner s = new Scanner(System.in);
            char d = s.next().charAt(0);
            if (d == '>') {
                television.nextKanal();
            } else if (d=='<') {
                television.beforeKanal();
            } else if (d == '!') {
                break;
            }
        }
    }
}