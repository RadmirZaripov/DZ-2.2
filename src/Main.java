public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment = 11;

        if (replenishment > 100) {
            int bonus = replenishment / 100;
            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + (check + replenishment + bonus));
        } else {
            int bonus = 0;
            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + (check + replenishment));
        }

    }

}
