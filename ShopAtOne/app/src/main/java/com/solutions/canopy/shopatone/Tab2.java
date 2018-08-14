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

public class Tab2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.tab2, container, false);
        String flipkartUrl = "http://clnk.in/fcA4";
        WebView flipkart = (WebView) v.findViewById(R.id.flipkartWebView);
        flipkart.setWebViewClient(new WebViewClient());
        flipkart.setWebChromeClient(new MyWebChromeClient(getContext()));
        flipkart.getSettings().setJavaScriptEnabled(true);
        flipkart.getSettings().setAllowFileAccess(true);
        flipkart.getSettings().setAppCacheEnabled(true);
        flipkart.getSettings().setDatabaseEnabled(true);
        flipkart.getSettings().setAllowContentAccess(true);
        flipkart.getSettings().setSupportZoom(true);
        flipkart.getSettings().setDomStorageEnabled(true);



        flipkart.loadUrl(flipkartUrl);
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
