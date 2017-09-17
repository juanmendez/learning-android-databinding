package info.juanmendez.databinding.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.juanmendez.databinding.databinding.ChildLayoutBinding;
import info.juanmendez.databinding.model.DataSource;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class ChildFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //ChildLayoutBinding this is a generated file based on the child_layout.xml
        ChildLayoutBinding binding = ChildLayoutBinding.inflate( inflater, container, false );
        binding.setDataSource( DataSource.get("Hello from static fragment!"));

        //Returns the outermost View in the layout file associated with the Binding.
        return binding.getRoot();
    }
}
