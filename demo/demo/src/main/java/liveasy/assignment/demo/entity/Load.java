package liveasy.assignment.demo.entity;

import java.sql.Date;

public class Load {
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private long noOfTrucks;
	private double weight;
	private long shipperId;
	private Date dd;
	private String comment;
	
	
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}
	
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	
	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getTruckType() {
		return truckType;
	}
	
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	
	public long getNoOfTrucks() {
		return noOfTrucks;
	}
	
	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public long getShipperId() {
		return shipperId;
	}
	
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	
	public Date getDd() {
		return dd;
	}
	
	public void setDd(Date dd) {
		this.dd = dd;
	}
	
	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", shipperId=" + shipperId +", comment="+comment+ ", dd=" + dd + "]";
	}

	public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, long noOfTrucks,
			double weight, long shipperId, Date dd) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
		this.dd = dd;
		this.comment=null;
	}
	
	public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, long noOfTrucks,
			double weight, long shipperId, Date dd,String comment) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
		this.dd = dd;
		this.comment=comment;
	}
	

}
