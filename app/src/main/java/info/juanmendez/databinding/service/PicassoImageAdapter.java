package info.juanmendez.databinding.service;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Juan Mendez on 9/19/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class PicassoImageAdapter {

    private static Picasso picasso;

    private static Picasso getPicasso(ImageView view) {
        if( picasso == null )
            picasso = Picasso.with( view.getContext() );

        return picasso;
    }

    @BindingAdapter("picassoSrc")
    public static void setImage(ImageView view, int resoureId ){
        Picasso picasso = getPicasso( view );

        if( resoureId != 0 ){
            picasso.load(resoureId).into(view);
        }
    }

    @BindingAdapter("picassoSrc")
    public static void setImage(ImageView view, String src ){
        Picasso picasso = getPicasso( view );
        picasso.load(src).into(view);
    }

    @BindingAdapter({"picassoSrc","picassoHolder","picassoError"})
    public static void setImage(ImageView view, int resoureId, int holderId, int holderErrorId){
        Picasso picasso = getPicasso( view );

        if( resoureId == 0 ){
            picasso.load( holderId ).error(holderErrorId).into(view);
        }else{
            picasso.load( resoureId ).placeholder(holderId).error(holderErrorId).into(view);
        }
    }

    @BindingAdapter({"picassoSrc","picassoHolder","picassoError"})
    public static void setImage(ImageView view, String src, int holderId, int holderErrorId){
        Picasso picasso = getPicasso( view );
        picasso.load( src ).placeholder(holderId).error(holderErrorId).into(view);
    }
}