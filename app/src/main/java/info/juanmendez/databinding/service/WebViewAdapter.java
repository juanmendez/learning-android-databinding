package info.juanmendez.databinding.service;

import android.databinding.BindingAdapter;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

/**
 * Created by Juan Mendez on 9/19/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 * @see https://stackoverflow.com/questions/44301545/2-way-databinding-for-webview-and-progressbar
 */
public class WebViewAdapter {

    @BindingAdapter("loadUrl")
    public static void loadUrl(WebView view, String url) {
        view.loadUrl(url);
    }

    @BindingAdapter("loadUrl")
    public static void loadUrl(WebView view, int urlId) {
        if( urlId != 0 ){
            loadUrl( view,view.getResources().getString( urlId ) );
        }
    }
}
