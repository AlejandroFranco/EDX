package edx.pablofranco.org.calusac.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edx.pablofranco.org.calusac.R;


public class cursos extends Fragment {

    private WebView browser;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_cursos, container, false);
        browser = (WebView) view.findViewById(R.id.webView2);
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
        browser.loadUrl("http:aulavirtual.google-calusac.com/");
        return view;
    }

}