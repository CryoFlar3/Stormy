package computermentors.org.stormy.weather;

/**
 * Created by nduke_000 on 3/2/2015.
 */
public class Hour {
    private long mTime;
    private String mSummery;
    private double mTemperature;
    private String mIcon;
    private String mTimZone;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummery() {
        return mSummery;
    }

    public void setSummery(String summery) {
        mSummery = summery;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimZone() {
        return mTimZone;
    }

    public void setTimZone(String timZone) {
        mTimZone = timZone;
    }
}
