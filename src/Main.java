public class Main {
    public static void main(String[] args) {

        int incomingAmount = 500;
        int depositAmount = 1500;
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }
        System.out.println(bonusAmount);
    }
}

