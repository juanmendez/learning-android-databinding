package info.juanmendez.databinding.service;

import android.databinding.BindingAdapter;
import android.support.v7.widget.Toolbar;

/**
 * Created by Juan Mendez on 9/22/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */
public class ToolbarAdapter {

    @BindingAdapter("toolBarIcon")
    public static void setToolBarIcon(Toolbar toolbar, int iconId){

        if( iconId != 0 ){
            toolbar.setNavigationIcon(iconId);
        }
    }
}
