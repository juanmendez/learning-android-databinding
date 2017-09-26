package info.juanmendez.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;

public class Country extends BaseObservable{
    @Bindable
    public final ObservableInt name = new ObservableInt();

    @Bindable
    public final ObservableInt flag = new ObservableInt();

    @Bindable
    public final ObservableInt url = new ObservableInt();

    @Bindable
    public final ObservableInt timesVisited = new ObservableInt();

    public Country(int name) {
        this.name.set(name);
    }

    Country(int name, int flag, int url) {
        this.name.set(name);
        this.flag.set(flag);
        this.url.set(url);
    }

    Country(int name, int flag, int url, int timesVisited ){
        this( name, flag, url );
        this.timesVisited.set(timesVisited);
    }
}