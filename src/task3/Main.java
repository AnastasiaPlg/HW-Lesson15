package task3;

public class Main {
    public static void main(String[] args) {
        Logic<Object> logic = new Logic<>(2);
        try {
            logic.choseLogic(5);
        } catch (ClassCastException e) {
            System.out.println("Wrong enter");
        }
    }
}
