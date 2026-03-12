package com.onlineinteract.model;

public class Test {

	String id = "123";
	String dataItem1 = "data 1";
	String dataItem2 = "data 2";
	String dataItem3 = "data 3";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDataItem1() {
		return dataItem1;
	}
	public void setDataItem1(String dataItem1) {
		this.dataItem1 = dataItem1;
	}
	public String getDataItem2() {
		return dataItem2;
	}
	public void setDataItem2(String dataItem2) {
		this.dataItem2 = dataItem2;
	}
	public String getDataItem3() {
		return dataItem3;
	}
	public void setDataItem3(String dataItem3) {
		this.dataItem3 = dataItem3;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataItem1 == null) ? 0 : dataItem1.hashCode());
		result = prime * result + ((dataItem2 == null) ? 0 : dataItem2.hashCode());
		result = prime * result + ((dataItem3 == null) ? 0 : dataItem3.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (dataItem1 == null) {
			if (other.dataItem1 != null)
				return false;
		} else if (!dataItem1.equals(other.dataItem1))
			return false;
		if (dataItem2 == null) {
			if (other.dataItem2 != null)
				return false;
		} else if (!dataItem2.equals(other.dataItem2))
			return false;
		if (dataItem3 == null) {
			if (other.dataItem3 != null)
				return false;
		} else if (!dataItem3.equals(other.dataItem3))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Hash Code is: " + test.hashCode());
		test.setDataItem2("data 22");
		System.out.println("Hash Code is: " + test.hashCode());
	}
	
}
