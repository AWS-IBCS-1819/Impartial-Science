

public class Card {

	private String name;

	private Integer value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Card() {
		name = "";
		value = 0;
	}

	@Override
	public String toString() {
		return "Card [" + name + "]";
	}

	
}
