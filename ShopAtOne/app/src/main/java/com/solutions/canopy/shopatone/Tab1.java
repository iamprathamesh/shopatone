package com.solutions.canopy.shopatone;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by prathamesh on 26/09/17.
 */

public class Tab1 extends Fragment {
    String amazonUrl = "http://clnk.in/fczo";
    WebView amazon;
    private Bundle webViewBundle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.tab1, container, false);
        WebView amazon = (WebView) v.findViewById(R.id.amazonWebView);
        amazon.setWebViewClient(new WebViewClient());
        amazon.setWebChromeClient(new MyWebChromeClient(getContext()));
        amazon.getSettings().setJavaScriptEnabled(true);
        amazon.getSettings().setAllowFileAccess(true);
        amazon.getSettings().setAppCacheEnabled(true);
        amazon.getSettings().setDatabaseEnabled(true);
        amazon.getSettings().setAllowContentAccess(true);
        amazon.getSettings().setSupportZoom(true);
        amazon.getSettings().setDomStorageEnabled(true);



        amazon.loadUrl(amazonUrl);
        return v;
    }

    private class MyWebChromeClient extends WebChromeClient {
        Context context;

        public MyWebChromeClient(Context context) {
            super();
            this.context = context;
        }
    }
}
