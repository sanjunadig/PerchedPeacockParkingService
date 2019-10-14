package com.example.sanjeev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingRecord {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Long lotId; 
	private Long parkingLotId;
	private String vehicleNo; 
	private Double vehicleWeight; 
	private Long durationInMin; 
	private Double amountInRs;
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Double getVehicleWeight() {
		return vehicleWeight;
	}
	public void setVehicleWeight(Double vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}
	
	public Long getLotId() {
		return lotId;
	}
	public void setLotId(Long lotId) {
		this.lotId = lotId;
	}
	public Long getParkingLotId() {
		return parkingLotId;
	}
	public void setParkingLotId(Long parkingLotId) {
		this.parkingLotId = parkingLotId;
	}
	public Long getDurationInMin() {
		return durationInMin;
	}
	public void setDurationInMin(Long durationInMin) {
		this.durationInMin = durationInMin;
	}
	public Double getAmountInRs() {
		return amountInRs;
	}
	public void setAmountInRs(Double amountInRs) {
		this.amountInRs = amountInRs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehicleWeight == null) ? 0 : vehicleWeight.hashCode());
		result = prime * result + ((amountInRs == null) ? 0 : amountInRs.hashCode());
		result = prime * result + ((durationInMin == null) ? 0 : durationInMin.hashCode());
		result = prime * result + ((lotId == null) ? 0 : lotId.hashCode());
		result = prime * result + ((parkingLotId == null) ? 0 : parkingLotId.hashCode());
		result = prime * result + ((vehicleNo == null) ? 0 : vehicleNo.hashCode());
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
		ParkingRecord other = (ParkingRecord) obj;
		if (vehicleWeight == null) {
			if (other.vehicleWeight != null)
				return false;
		} else if (!vehicleWeight.equals(other.vehicleWeight))
			return false;
		if (amountInRs == null) {
			if (other.amountInRs != null)
				return false;
		} else if (!amountInRs.equals(other.amountInRs))
			return false;
		if (durationInMin == null) {
			if (other.durationInMin != null)
				return false;
		} else if (!durationInMin.equals(other.durationInMin))
			return false;
		if (lotId == null) {
			if (other.lotId != null)
				return false;
		} else if (!lotId.equals(other.lotId))
			return false;
		if (parkingLotId == null) {
			if (other.parkingLotId != null)
				return false;
		} else if (!parkingLotId.equals(other.parkingLotId))
			return false;
		if (vehicleNo == null) {
			if (other.vehicleNo != null)
				return false;
		} else if (!vehicleNo.equals(other.vehicleNo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ParkingRecord [vehicleNo=" + vehicleNo + ", VehicleWeight=" + vehicleWeight + ", lotId=" + lotId
				+ ", parkingLotId=" + parkingLotId + ", durationInMin=" + durationInMin + ", amountInRs=" + amountInRs
				+ "]";
	}	
	
	
}
