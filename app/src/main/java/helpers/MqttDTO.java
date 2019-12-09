package helpers;

import com.google.gson.annotations.SerializedName;

public class MqttDTO{

	@SerializedName("image")
	private String image;

	@SerializedName("device_id")
	private String deviceId;

	@SerializedName("pkg_missing")
	private int pkgMissing;

	@SerializedName("season_id")
	private int seasonId;

	@SerializedName("pkg_status_false")
	private int pkgStatusFalse;

	@SerializedName("speed")
	private double speed;

	@SerializedName("estimate_endtime")
	private String estimateEndtime;

	@SerializedName("pkg_count")
	private int pkgCount;

	@SerializedName("start_time")
	private String startTime;

	@SerializedName("rescan_pkg_count")
	private int rescanPkgCount;

	@SerializedName("bag_count")
	private int bagCount;

	@SerializedName("barcode_false_count")
	private int barcodeFalseCount;

	@SerializedName("estimate_time_remain")
	private String estimateTimeRemain;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	public String getDeviceId(){
		return deviceId;
	}

	public void setPkgMissing(int pkgMissing){
		this.pkgMissing = pkgMissing;
	}

	public int getPkgMissing(){
		return pkgMissing;
	}

	public void setSeasonId(int seasonId){
		this.seasonId = seasonId;
	}

	public int getSeasonId(){
		return seasonId;
	}

	public void setPkgStatusFalse(int pkgStatusFalse){
		this.pkgStatusFalse = pkgStatusFalse;
	}

	public int getPkgStatusFalse(){
		return pkgStatusFalse;
	}

	public void setSpeed(double speed){
		this.speed = speed;
	}

	public double getSpeed(){
		return speed;
	}

	public void setEstimateEndtime(String estimateEndtime){
		this.estimateEndtime = estimateEndtime;
	}

	public String getEstimateEndtime(){
		return estimateEndtime;
	}

	public void setPkgCount(int pkgCount){
		this.pkgCount = pkgCount;
	}

	public int getPkgCount(){
		return pkgCount;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setRescanPkgCount(int rescanPkgCount){
		this.rescanPkgCount = rescanPkgCount;
	}

	public int getRescanPkgCount(){
		return rescanPkgCount;
	}

	public void setBagCount(int bagCount){
		this.bagCount = bagCount;
	}

	public int getBagCount(){
		return bagCount;
	}

	public void setBarcodeFalseCount(int barcodeFalseCount){
		this.barcodeFalseCount = barcodeFalseCount;
	}

	public int getBarcodeFalseCount(){
		return barcodeFalseCount;
	}

	public void setEstimateTimeRemain(String estimateTimeRemain){
		this.estimateTimeRemain = estimateTimeRemain;
	}

	public String getEstimateTimeRemain(){
		return estimateTimeRemain;
	}

	@Override
 	public String toString(){
		return 
			"MqttDTO{" + 
			"image = '" + image + '\'' + 
			",device_id = '" + deviceId + '\'' + 
			",pkg_missing = '" + pkgMissing + '\'' + 
			",season_id = '" + seasonId + '\'' + 
			",pkg_status_false = '" + pkgStatusFalse + '\'' + 
			",speed = '" + speed + '\'' + 
			",estimate_endtime = '" + estimateEndtime + '\'' + 
			",pkg_count = '" + pkgCount + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",rescan_pkg_count = '" + rescanPkgCount + '\'' + 
			",bag_count = '" + bagCount + '\'' + 
			",barcode_false_count = '" + barcodeFalseCount + '\'' + 
			",estimate_time_remain = '" + estimateTimeRemain + '\'' + 
			"}";
		}
}