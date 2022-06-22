import java.util.Scanner;

public class Paint {
    private boolean selectColor = false;

    public boolean yourSelect() {
        return selectColor;
    }

    void choice() {
        Scanner choice = new Scanner(System.in);
        System.out.printf("Choice your color (1,2 or 3): ");
        int select = choice.nextInt();
        if (select == 1 || select == 2 || select == 3) {
            System.out.println("You selected color " + select);
            selectColor = true;
        } else {
            System.err.println("I don`t have this color");
            selectColor = false;
        }
    }
    void paintFigure (Paint paint){
        if (paint.yourSelect()){
            System.out.println("You paint figure");
        }
        else {
            Power powerOff = new Power();
            powerOff.off();
            System.exit(0);
        }
    }
}