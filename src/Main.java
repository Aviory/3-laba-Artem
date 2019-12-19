public class Main {

    public static void main(String[] args) {
        Bank<Integer> bank = new Bank<>();
        Printer printer = new Printer();

        printer.print(bank.getCards());
        Transaction<UniversalBankCard> transaction = new Transaction<>(new UniversalBankCard(),new UniversalBankCard(),10);
    }
}
