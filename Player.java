package Labs;

public class Player {
	private String name;
	private int health;
	private double coins;
	
	
	public Player() {
		
	}
	
	public Player(String name, int health, double coins) {
		super();
		this.name = name;
		this.health = health;
		this.coins = coins;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int addHealth(int valueToAdd) {
		if (health + valueToAdd > 100) {
			this.health = 100;
		} else {
			this.health += valueToAdd;
		}
		return health;
	}

	public int deductHealth(int valueToDeduct) {
		if (health - valueToDeduct < 0) {
			this.health = 0;
		} else {
			this.health -= valueToDeduct;
		}
		return health;
	}

	public void depositCoins(double coinsToDeposit) {
		this.coins += coinsToDeposit;
	}

	public boolean withdrawalCoins(double coinsToWithdrawal) {
		if (coins - coinsToWithdrawal < 0) {
			return false;
		} else {
			this.coins -= coinsToWithdrawal;
		}
		return true;
	}
	
	

}
