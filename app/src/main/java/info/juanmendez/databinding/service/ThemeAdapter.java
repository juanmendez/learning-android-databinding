package info.juanmendez.databinding.service;

import android.content.res.Resources;
import android.databinding.BindingAdapter;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class ThemeAdapter {

    @BindingAdapter("styleMode")
    public static void setStyleMode(ViewGroup layout, Boolean dayMode ){
        if( dayMode){
            layout.setBackgroundColor( layout.getResources().getColor( android.R.color.white ));
        }else{
            layout.setBackgroundColor( layout.getResources().getColor( android.R.color.black ));
        }
    }


    @BindingAdapter("styleMode")
    public static void setStyleMode(TextView textView, Boolean dayMode ){
        Resources resources = textView.getResources();

        if( dayMode){
            textView.setTextColor( resources.getColor(android.R.color.black));
        }else{
            textView.setTextColor( resources.getColor(android.R.color.white));
        }
    }
}
