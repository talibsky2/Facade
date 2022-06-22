import java.util.Scanner;

public class Make {
    private boolean selectNumber = false;
    public boolean yourSelect (){
        return selectNumber;
    }

    void choice (){
    Scanner choice = new Scanner(System.in);
        System.out.printf("Choice your figure (1,2 or 3): ");
        int select = choice.nextInt();
        if (select == 1 || select == 2 || select == 3){
            System.out.println("You selected " + select);
            selectNumber = true;
        }
        else {
            System.err.println("Wrong selected");
            selectNumber = false;
        }
    }
    void makeFigure (Make make){
        if (make.yourSelect()){
            System.out.println("You make figure");
        }
        else {
            Power powerOff = new Power();
            powerOff.off();
            System.exit(0);
        }
    }
}
