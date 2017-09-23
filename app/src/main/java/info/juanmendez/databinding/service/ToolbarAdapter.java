package info.juanmendez.databinding.service;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
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

    @BindingAdapter({"toolBarIcon","toolBarIconDefault"})
    public static void setToolBarIcon(Toolbar toolbar, int iconId, Drawable defaultIcon){

        if( iconId != 0 ){
            toolbar.setNavigationIcon(iconId);
        }else{
            toolbar.setNavigationIcon(defaultIcon);
        }
    }
}
