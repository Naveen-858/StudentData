package com.studentDataList.entity;

public class MaleAndFemaleCount {
	private long males;
	private long females;

	public MaleAndFemaleCount(long males, long females) {
		super();
		this.males = males;
		this.females = females;
	}

	@Override
	public String toString() {
		return "MaleAndFemaleCount [males=" + males + ", females=" + females + "]";
	}

	public long getMales() {
		return males;
	}

	public void setMales(long males) {
		this.males = males;
	}

	public long getFemales() {
		return females;
	}

	public void setFemales(long females) {
		this.females = females;
	}

}
