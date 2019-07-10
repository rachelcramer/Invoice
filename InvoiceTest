public class InvoiceTest {
	
	public static void main(String[] args) {
		Invoice item1 = new Invoice("#0001", "Hammer", 1, 56.00, 0.0);
		Invoice item2 = new Invoice("#0002", "Screws, 50pk", 2, 5.75, 0.0);
		Invoice item3 = new Invoice("#0003", "Nails, 100pk", 2, 2.85, 0.0);
		Invoice item4 = new Invoice("#0004", "Screwdriver", 1, 19.95, 0.0);
		Invoice item5 = new Invoice("#0005", "Flush Saw", 1, 50.45, 0.0);
		Invoice item6 = new Invoice("#0006", "2x4in Wood", 10, 3.15, 0.0);
		Invoice item7 = new Invoice("#0007", "Table Saw", 1, 631.28, 0.0);
		Invoice item8 = new Invoice("#0008", "Wood Glue", 3, 12.15, 0.0);
		Invoice item9 = new Invoice("#0009", "Plumber's Putty", 2, 9.68, 0.0);
		Invoice item10 = new Invoice("#0010", "Wrap Tape", 4, 8.92, 0.0);
		
		
		//this multiplies the price with the part quantity
		System.out.printf("%n**TOTAL**%n");
		item1.setTotalPrice(item1.getPrice() * item1.getPartQty());
		item2.setTotalPrice(item2.getPrice() * item2.getPartQty());
		item3.setTotalPrice(item3.getPrice() * item3.getPartQty());
		item4.setTotalPrice(item4.getPrice() * item4.getPartQty());
		item5.setTotalPrice(item5.getPrice() * item5.getPartQty());
		item6.setTotalPrice(item6.getPrice() * item6.getPartQty());
		item7.setTotalPrice(item7.getPrice() * item7.getPartQty());
		item8.setTotalPrice(item8.getPrice() * item8.getPartQty());
		item9.setTotalPrice(item9.getPrice() * item9.getPartQty());
		item10.setTotalPrice(item10.getPrice() * item10.getPartQty());
		
		//this displays totals
		
		System.out.printf("%nPART NO.      PART DESC.      QTY       PRICE%n");
		System.out.printf("%s         %s           %d        $%.2f,       $%.2f%n", item1.getPartNum(), item1.getPartDesc(), item1.getPartQty(), item1.getPrice(), item1.getTotalPrice());
		System.out.printf("%s         %s     %d        $%.2f,       $%.2f%n", item2.getPartNum(), item2.getPartDesc(), item2.getPartQty(), item2.getPrice(), item2.getTotalPrice());
		System.out.printf("%s         %s     %d        $%.2f,       $%.2f%n", item3.getPartNum(), item3.getPartDesc(), item3.getPartQty(), item3.getPrice(), item3.getTotalPrice());
		System.out.printf("%s         %s      %d        $%.2f,       $%.2f%n", item4.getPartNum(), item4.getPartDesc(), item4.getPartQty(), item4.getPrice(), item4.getTotalPrice());
		System.out.printf("%s         %s        %d        $%.2f,       $%.2f%n", item5.getPartNum(), item5.getPartDesc(), item5.getPartQty(), item5.getPrice(), item5.getTotalPrice());
		System.out.printf("%s         %s       %d       $%.2f,       $%.2f%n", item6.getPartNum(), item6.getPartDesc(), item6.getPartQty(), item6.getPrice(), item6.getTotalPrice());
		System.out.printf("%s         %s        %d        $%.2f,       $%.2f%n", item7.getPartNum(), item7.getPartDesc(), item7.getPartQty(), item7.getPrice(), item7.getTotalPrice());
		System.out.printf("%s         %s        %d        $%.2f,       $%.2f%n", item8.getPartNum(), item8.getPartDesc(), item8.getPartQty(), item8.getPrice(), item8.getTotalPrice());
		System.out.printf("%s         %s  %d        $%.2f,       $%.2f%n", item9.getPartNum(), item9.getPartDesc(), item9.getPartQty(), item9.getPrice(), item9.getTotalPrice());
		System.out.printf("%s         %s        %d        $%.2f,       $%.2f%n", item10.getPartNum(), item10.getPartDesc(), item10.getPartQty(), item10.getPrice(), item10.getTotalPrice());
		
		item1.setPrice(item1.getTotalPrice() + item2.getTotalPrice() + item3.getTotalPrice() + item4.getTotalPrice() + item5.getTotalPrice() + item6.getTotalPrice()+ item7.getTotalPrice() + item8.getTotalPrice() + item9.getTotalPrice() + item10.getTotalPrice());
		System.out.printf("%n%n                          Your total is $%s%n", item1.getTotalPrice());
		System.out.printf("%n%n             Thank you, please come again :)");
	

	}}//end
