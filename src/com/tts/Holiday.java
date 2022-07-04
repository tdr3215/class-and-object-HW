package com.tts;

public class Holiday {
	
	final Integer MAX_MONTH = 12;
	final Integer MIN_MONTH = 1;
	
	private String name;
	private Integer month;
	private boolean hasGifts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		if ( month > MAX_MONTH || month < MIN_MONTH) {
			this.month = -1;
		} else {
			this.month = month;
		}

	}

	public boolean isHasGift() {
		return hasGifts;
	}

	public void setHasGifts(boolean hasGifts) {
		this.hasGifts = hasGifts;
	}

	public Holiday() {
		setName("Holiday");
		setMonth(3);
		setHasGifts(false);

		this.name = getName();
		this.month = getMonth();
		this.hasGifts = isHasGift();
	}
	
	public Holiday(String name, Integer month) {
		setName(name);
		setMonth(month);
		this.name = getName();
		this.month = getMonth();
	}
	
	public Holiday(String name, Integer month, boolean hasGifts) {
		setName(name);
		setMonth(month);
		setHasGifts(hasGifts);
		
		this.name = getName();
		this.month = getMonth();
		this.hasGifts = isHasGift();
		
		
	}
	
	public boolean isSoon(Integer month) {
		
		if (month == this.month) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public String celebrate() {
		return "Happy" + " " + name;
	}

	@Override
	public String toString() {
		return "Holiday [name=" + name + ", month=" + month + ", hasGifts=" + hasGifts + "]";
	}
}
