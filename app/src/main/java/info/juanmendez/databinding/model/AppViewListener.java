package info.juanmendez.databinding.model;

import android.widget.CompoundButton;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public interface AppViewListener {

    void setShowFlags(CompoundButton view, boolean showFlags);
    void setDayMode(CompoundButton view, boolean dayMode);
}