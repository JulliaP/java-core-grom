package lesson8.Ad;

import java.util.Date;

public class Ad extends BaseEntity {

	int price;
	Date dateCreated;

	public Ad(long id, int price) {
		super(id);
		this.price = price;
		this.dateCreated = new Date();
	}

	void publishAdd() {
		// some logic
	}

}
