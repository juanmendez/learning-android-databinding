package info.juanmendez.databinding.ui;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import info.juanmendez.databinding.BR;
import info.juanmendez.databinding.databinding.ChildLayoutBinding;
import info.juanmendez.databinding.model.DataSource;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 *
 * I fond out how to get the binding as it is already created for us.
 * https://stackoverflow.com/questions/34799622/android-data-binding-with-a-custom-view/46269607#46269607
 */
public class ChildView extends FrameLayout{
    private ChildLayoutBinding binding;

    public ChildView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        binding = DataBindingUtil.getBinding(this);
        DataSource dataSource = DataSource.get("Data View");
        binding.setVariable(BR.ds, dataSource);
    }
}
