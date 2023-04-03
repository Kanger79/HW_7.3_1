public class Main {
    public static void main(String[] args) {

        int costTicket = 21_362;
        int costMile = 20;
        int miles = costTicket/costMile;

        System.out.println("При стоимости билета равной " + costTicket + " рублей, " + "количество бонусных миль будет равно " + miles);
    }
}