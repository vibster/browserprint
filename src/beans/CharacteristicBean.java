package beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CharacteristicBean implements Serializable{
	
	private String name;
	private String nameHoverText;
	private int numOccurrences;
	private double bits;
	private double inX;
	private String value;

	public CharacteristicBean(){
		name = "";
		nameHoverText = "";
		numOccurrences = 0;
		bits = 0;
		inX = 0;
		value = "";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameHoverText() {
		return nameHoverText;
	}

	public void setNameHoverText(String nameHoverText) {
		this.nameHoverText = nameHoverText;
	}

	public int getNumOccurrences() {
		return numOccurrences;
	}

	public void setNumOccurrences(int numOccurrences) {
		this.numOccurrences = numOccurrences;
	}

	public double getBits() {
		return bits;
	}

	public void setBits(double bits) {
		this.bits = bits;
	}

	public double getInX() {
		return inX;
	}

	public void setInX(double inX) {
		this.inX = inX;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
