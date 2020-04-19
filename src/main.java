public class main {
    public static void main(String[] args) {
        VendingMachine myMachine = new VendingMachine();
        myMachine.addItem("PEPSI", 0.35);
        myMachine.addItem("Chocolate", 1.25);
        myMachine.addItem("Chips", 0.75);
        myMachine.printItems();
        myMachine.buyItem("PEPSI",10);
        myMachine.printItems();
    }
}
