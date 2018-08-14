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

public class Tab3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.tab3, container, false);
        String myntraUrl = "http://clnk.in/fdWi";
        WebView myntra = (WebView) v.findViewById(R.id.myntraWebView);
        myntra.setWebViewClient(new WebViewClient());
        myntra.setWebChromeClient(new MyWebChromeClient(getContext()));
        myntra.getSettings().setJavaScriptEnabled(true);
        myntra.getSettings().setAllowFileAccess(true);
        myntra.getSettings().setAppCacheEnabled(true);
        myntra.getSettings().setDatabaseEnabled(true);
        myntra.getSettings().setAllowContentAccess(true);
        myntra.getSettings().setSupportZoom(true);
        myntra.getSettings().setDomStorageEnabled(true);



        myntra.loadUrl(myntraUrl);
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
