package info.juanmendez.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;
import android.widget.CompoundButton;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */
public class AppViewModel extends BaseObservable{

    @Bindable public final ObservableBoolean dayMode = new ObservableBoolean();
    @Bindable public final ObservableBoolean showFlags = new ObservableBoolean();

    private static AppViewModel appViewModel;

    public void setDayMode(CompoundButton view, Boolean mode){
        dayMode.set(mode);
        notifyChange();
    }

    public void setShowFlags(CompoundButton view, Boolean show){
        showFlags.set(show);
        notifyChange();
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
}