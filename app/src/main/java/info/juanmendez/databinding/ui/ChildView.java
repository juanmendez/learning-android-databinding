package info.juanmendez.databinding.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import info.juanmendez.databinding.databinding.ChildLayoutBinding;
import info.juanmendez.databinding.model.DataSource;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */
public class ChildView extends FrameLayout{
    private ChildLayoutBinding binding;

    public ChildView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        binding = ChildLayoutBinding.bind(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DataSource dataSource = DataSource.get("Data View");
        binding.setDs(dataSource);
    }
}
