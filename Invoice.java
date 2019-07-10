public class Invoice {

	private String partNum;
	private String partDesc;
	public int partQty;
	private double price;
	private double totalPrice;
	
	//constructor
	public Invoice(String partNum, String partDesc, int partQty, double price, double totalPrice) {
		this.partNum = partNum;
		this.partDesc = partDesc;
		
		if (partQty >= 0) {
			//this determines whether the quantity is positive
			this.partQty = partQty;	
		}
		
		if (price >= 0.0) {
			//this determines whether the price is positive
			this.price = price;
		}
	}
//this SETS item number
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
//this GETS item number
	public String getPartNum() {
		return partNum;
	}
	
	
//this SETS item description
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
//this GETS item description
	public String getPartDesc(){
	return partDesc;	
	}
	
	
	
//this SETS item quantity
		public void setPartQty(int partQty) {
			if (partQty >= 0) {
			this.partQty = partQty;
			}
		}
//this GETS item quantity
		public int getPartQty(){
		return partQty;	
		}
	
		
		
//this SETS item price
	public void setPrice(double price) {
		if (price >= 0.0) {
		//this determines whether the price is positive
			this.price = price;
		}
	}
	
//this GETS item price
	public double getPrice() {
		return price;
	}
	
	
	
//this SETS item price
	public void setTotalPrice(double totalPrice) {
		if (totalPrice >= 0.0) {
		//this determines whether the total price is positive
			this.totalPrice = totalPrice;
		}
	}
		
//this GETS item price
	public double getTotalPrice() {
		return totalPrice;
	}
}//end
