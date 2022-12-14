package ru.mirea.task22;

public class Client {
    private boolean sit = false;
    private Chair chair;

    void Sit(Chair chair) {
        if (sit) System.out.println("Я уже сижу");
        else {
            System.out.println("Я сижу на " + chair.getName() + " стуле");
            this.chair = chair;
            sit = true;
        }
    }
    void Stand(Chair chair) {
        if (!sit) System.out.println("Я уже стою");
        else {
            System.out.println("Я встала с " + chair.getName() + " стула");
            this.chair = chair;
            sit = false;
        }
    }
    public static void main(String[] args) {
        Chair chair1 = new VictorianChair();
        Chair chair2 = new MultifunctionalChair();
        Chair chair3 = new MagicChair();

        Client c = new Client();

        c.Sit(chair1);
        c.Sit(chair2);
        c.Stand(chair1);
        c.Sit(chair2);
        c.Stand(chair3);
        c.Stand(chair3);
        c.Sit(chair1);
    }
}
