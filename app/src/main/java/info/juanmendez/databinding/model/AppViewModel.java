package info.juanmendez.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

import info.juanmendez.databinding.BR;
import timber.log.Timber;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */
public class AppViewModel extends BaseObservable{

    @Bindable public final ObservableBoolean dayMode = new ObservableBoolean();
    @Bindable public final ObservableBoolean showFlags = new ObservableBoolean();

    /**
     * For testing sake, lets see how a bindable method will work with @=
     */
    private String appName = "";

    @Bindable
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
        Timber.i("appName change: " + appName );
        notifyPropertyChanged(BR.appName);
    }

    /**
     * @return singleton
     */
    public static AppViewModel getVM(){
        if( appViewModel == null ){
            appViewModel = new AppViewModel();
        }

        return appViewModel;
    }
    private static AppViewModel appViewModel;
}