import java.text.DecimalFormat;

public class Invoice implements Payable {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	DecimalFormat formatter = new DecimalFormat("###,###.00");

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		if (quantity >= 0.0) {
			this.quantity = quantity;
			// System.out.println("***");
		} else {
			System.out.println("Enter a valid quantity number");
		System.out.println("Program is terminating...");
		System.exit(0);
		}

		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		} else {
			System.out.println("Enter a valid price number");
		System.out.println("Program is terminating...");
		System.exit(0);
		}

	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if (quantity >= 0.0) {
			this.quantity = quantity;
		} else {
			System.out.println("Enter a valid quantity number");
		System.out.println("Program is terminating...");
		System.exit(0);
		}
	}

	public String getPricePerItem() {
		return formatter.format(pricePerItem);
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		} else {
			System.out.println("Enter a valid price number");
		System.out.println("Program is terminating...");
		System.exit(0);
		}
	}

	@Override
	public double getPaymentAmount() {

		return quantity * pricePerItem;
	}

	public String toString() {
		return "invoice:\n" + "part number: " + getPartNumber() + " (" + getPartDescription() + ")" + "\nquantity: "
				+ getQuantity() + "\nprice per item: $" + getPricePerItem() + "\npayment amount: $"
				+ formatter.format(getPaymentAmount());

	}

}
