public class Funny_app {
    public static void main(String[] args) {
        System.out.println("кофе-машина");
        int moneyAmount = 50;
        int cappuchinoPrice = 150;
        int espreccoPrice = 80;
        int waterPrice = 20;
        int milkPrice = 50;
        boolean canBuySomething = false;
        if (moneyAmount >= cappuchinoPrice) {
            System.out.println("вы можете купить каппучино");
            canBuySomething = true;
        }
        if (moneyAmount >= espreccoPrice) {
            System.out.println("вы можете купить еспрессо");
            canBuySomething = true;
        }
        ;
        if (moneyAmount >= waterPrice) {
            canBuySomething = true;
            System.out.println("вы можете купить воду");
        }
        ;
        if (canBuySomething == false) {
            System.out.println("Недостаточно средств");
            canBuySomething = true;
        }
        if (moneyAmount >= milkPrice) {
            System.out.println("вы можете купить молоко");
            canBuySomething = true;
        }
    }
}
