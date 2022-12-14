package ru.mirea.task22;

public class Factory {
    public Chair CreateChair(ChairType type) {
        Chair chair = null;

        switch (type) {
            case Victorian:
                chair = new VictorianChair();
                break;

            case Magic:
                chair = new MagicChair();
                break;

            case Multifunctional:
                chair = new MultifunctionalChair();
                break;
        }
        return chair;
    }
}
