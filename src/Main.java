//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    double purchasePrice = 100.0;

    final double SALES_TAX_RATE = 0.05;

    double salesTax = purchasePrice * SALES_TAX_RATE;
    double totalPrice = purchasePrice + salesTax;

    System.out.println(String.format("Purchase price is: $" + purchasePrice));
    System.out.println(String.format("Sales tax is: $" + salesTax));
    System.out.println(String.format("Total price is: $" + totalPrice));

    }
