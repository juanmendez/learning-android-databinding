package info.juanmendez.databinding;

import android.app.Application;

import timber.log.Timber;


/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant( new Timber.DebugTree());
    }

}
