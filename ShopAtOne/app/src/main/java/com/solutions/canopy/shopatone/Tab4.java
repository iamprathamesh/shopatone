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

public class Tab4 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.tab4, container, false);
        String jabongUrl = "http://clnk.in/fdWn";
        WebView jabong = (WebView) v.findViewById(R.id.jabongWebView);
        jabong.setWebViewClient(new WebViewClient());
        jabong.setWebChromeClient(new MyWebChromeClient(getContext()));
        jabong.getSettings().setJavaScriptEnabled(true);
        jabong.getSettings().setAllowFileAccess(true);
        jabong.getSettings().setAppCacheEnabled(true);
        jabong.getSettings().setDatabaseEnabled(true);
        jabong.getSettings().setAllowContentAccess(true);
        jabong.getSettings().setSupportZoom(true);
        jabong.getSettings().setDomStorageEnabled(true);



        jabong.loadUrl(jabongUrl);
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
