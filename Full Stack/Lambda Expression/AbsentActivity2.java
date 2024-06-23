public class AbsentActivity2 {
    int SensorID;
    String TimeStamp;
    double temperatureReading;
    public int getSensorID() {
        return SensorID;
    }
    public AbsentActivity2(int sensorID, String timeStamp, double temperatureReading) {
        SensorID = sensorID;
        TimeStamp = timeStamp;
        this.temperatureReading = temperatureReading;
    }
    public void setSensorID(int sensorID) {
        SensorID = sensorID;
    }
    public String getTimeStamp() {
        return TimeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }
    public double getTemperatureReading() {
        return temperatureReading;
    }
    public void setTemperatureReading(double temperatureReading) {
        this.temperatureReading = temperatureReading;
    }

    @Override
    public String toString() {
        return "AbsentActivity2 [SensorID=" + SensorID + ", TimeStamp=" + TimeStamp + ", temperatureReading="
                + temperatureReading + "]";
    }
    
}
