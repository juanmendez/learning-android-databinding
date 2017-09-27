package info.juanmendez.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import info.juanmendez.databinding.R;
import info.juanmendez.databinding.databinding.ActivityWikiBinding;
import info.juanmendez.databinding.model.AppViewModel;
import info.juanmendez.databinding.model.CountryViewModel;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class WikiActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_wiki);
        ActivityWikiBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_wiki);

        binding.setAppViewModel(AppViewModel.getVM());
        binding.setCountryViewModel( CountryViewModel.getVM());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_wiki);
        toolbar.setOnMenuItemClickListener(item -> {

            if( item.getItemId() == R.id.delete ){
                CountryViewModel.getVM().removeSelectedCountry(toolbar);
                finish();
            }

            return false;
        });
    }
}