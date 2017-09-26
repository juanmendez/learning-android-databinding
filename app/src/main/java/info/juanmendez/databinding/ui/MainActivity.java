package info.juanmendez.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;

import com.mikepenz.iconics.context.IconicsLayoutInflater;

import info.juanmendez.databinding.R;
import info.juanmendez.databinding.databinding.ActivityMainBinding;
import info.juanmendez.databinding.model.AppViewListener;
import info.juanmendez.databinding.model.AppViewModel;
import info.juanmendez.databinding.model.CountryViewModel;
import info.juanmendez.databinding.service.CountryAdapter;

public class MainActivity extends AppCompatActivity implements AppViewListener {

    CountryViewModel countryViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

      //iconic fonts setup
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));

        super.onCreate(savedInstanceState);


        //we don't need this anymore
        //setContentView(R.layout.activity_main);

        //I did (Rebuild/Build Project) in Android Studio, so that would generate our ActivityMainBinding
        //That is a class which is created based on the layout name.
        // this is the format "{camelCase(layoutName)}+Binding"
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setAppViewModel(getAppViewModel());
        binding.setAppViewListener(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Android DataBinding has generated new files which help out
        //to ease the code. This is similar in other libraries like Dagger, or AndroidAnnotations
        binding.list.setLayoutManager(new LinearLayoutManager(this));
        binding.list.setAdapter( new CountryAdapter(getLayoutInflater()));
    }

    private AppViewModel getAppViewModel(){
        return AppViewModel.getAppViewModel();
    }

    private CountryViewModel getCountryViewModel(){
        return CountryViewModel.getCountryViewModel();
    }

    @Override
    public void setShowFlags(CompoundButton view, boolean showFlags) {
        getAppViewModel().showFlags.set(showFlags);
    }

    @Override
    public void setDayMode(CompoundButton view, boolean dayMode) {
        getAppViewModel().dayMode.set(dayMode);
    }
}