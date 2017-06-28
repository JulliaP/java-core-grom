package lesson5;

public class WithdrawMoney {
	// Напишите метод, который будет снимать деньги со счета определенного
	// клиента и возвращать остаток на счете. Если денег на счете недостаточно
	// метод будет возвращать -1
	// Сигнатура метода - withdraw(String[] clients, int[] balances, String
	// client, int amount)
	// Метод должен содержаться в классе. Название класса не важно

	public static void main(String[] args) {
		String[] names = { "Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John" };
		int[] balances = { 100, 500, 99, -99, 12000, -54, 0 };

		withdraw(names, balances, "Nikolay", 100);
		// System.out.println(withdraw()));
	}

	public static int withdraw(String[] clients, int[] balances, String client, int amount) {
		// 2.Withdraw amount
		// 3. Return leftover. Если денег на счете недостаточно метод будет
		// возвращать -1

		if (amount <= balances[findClientIndexByName(clients, client)]) {

			balances[findClientIndexByName(clients, client)] -= amount;
            int leftover = balances[findClientIndexByName(clients, client)];
			System.out.println(leftover );
			
			return leftover;
		}

		else {
			
			System.out.println("-1");
			return -1;
		}

		
	}

	// 1. Find client( his index). New variable.
	// Use for -each loop to run through clients array until client is found
	static int findClientIndexByName(String[] clients, String client) {
		int clientIndex = 0;
		for (String element : clients) {
			if (element == client) {
				break;
			}
			clientIndex++;
		}
		return clientIndex;
	}
}
