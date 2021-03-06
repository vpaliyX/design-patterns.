package weatherExample.entity;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class SmartWatch extends Device {

    @Nullable
    private WeatherData data;


    @Override
    public void update(@NotNull WeatherData data) {
        this.data=data;
        showWeather();
    }

    @Override
    public void showWeather() {
        if(data!=null){
            log(data);
            //some fancy UI for a smart watch
        }
    }
}
