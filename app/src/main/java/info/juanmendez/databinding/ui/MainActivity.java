package info.juanmendez.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import info.juanmendez.databinding.R;
import info.juanmendez.databinding.databinding.ActivityMainBinding;
import info.juanmendez.databinding.model.DataSource;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //we don't need this anymore
        //setContentView(R.layout.activity_main);

        //I did (Rebuild/Build Project) in Android Studio, so that would generate our ActivityMainBinding
        //That is a class which is created based on the layout name.
        // this is the format "{camelCase(layoutName)}+Binding"
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setDataSource(  DataSource.get("Hello World!") );

        //Android DataBinding has generated new files which help out
        //to ease the code. This is similar in other libraries like Dagger, or AndroidAnnotations
    }
}