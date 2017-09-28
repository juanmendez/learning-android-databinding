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
     * For testing sake, lets see how a bindable method will work using double binding aka @=.
     * In activity_main the toolbar title is bound to appName and has a default title if empty.
     * In case appName is null then the toolbar has no title. So for it to work it is an empty string.
     */
    private String appName="";

    @Bindable
    public String getAppName() {
        return appName;
    }

    /**
     * So this proves it works. This is great if you need to update an attribute of a pojo being part
     * of your viewModel. Similarly in your own setter you can update the pojo's attribute while
     * notifying the pojo as a whole was updated. notifyPropertyChanged(BR.myPojo)
     * @param appName a new toolbar title!
     */
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