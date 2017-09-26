package info.juanmendez.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class AppViewModel extends BaseObservable{

    @Bindable public final ObservableBoolean dayMode = new ObservableBoolean();
    @Bindable public final ObservableBoolean showFlags = new ObservableBoolean();

    private static AppViewModel appViewModel;

    public static AppViewModel getAppViewModel(){
        if( appViewModel == null ){
            appViewModel = new AppViewModel();
        }

        return appViewModel;
    }
}