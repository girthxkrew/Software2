package Project;

public class Coordinate {
	private double latitude;
	private double longitude;

	public Coordinate() {
		setLatitude(0);
		setLongitude(0);
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

}
