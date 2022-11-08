public class Money {
    int money = 0;
    int bill[] = {200, 100, 50, 20, 10, 5};
    int cashBack[] = {0, 0, 0, 0, 0, 0};

    public String cash() {
        int amount = 0;
        System.out.println("\nIntroduce la cantidad a retirar:");
        do {
            Input num = new Input();
            amount = num.num();
            if (amount % 5 != 0) {
                System.out.println("Cantidad inválida. Por favor introduzca una cantidad acabada en 0 o en 5:");
            }
        } while (amount % 5 != 0);

        money = amount;

        do {
            for (int i = 0; i < 6; i++) {
                if (money >= bill[i]) {
                    money -= bill[i];
                    cashBack[i]++;
                    break;
                }
            }
        } while (money > 0);

        String resp = "";

        for (int i = 0; i < 6; i++) {
            if (cashBack[i] != 0) {
                resp += cashBack[i] + " billete/s de " + bill[i] + "\n";
            }
        }

        return resp;
    }
}
