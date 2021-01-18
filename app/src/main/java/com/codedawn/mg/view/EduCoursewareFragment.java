package com.codedawn.mg.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.codedawn.mg.R;

public class EduCoursewareFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private WebView webView;
    public EduCoursewareFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentB.
     */
    // TODO: Rename and change types and number of parameters
    public static EduCoursewareFragment newInstance(String param1, String param2) {
        EduCoursewareFragment eduCoursewareFragment = new EduCoursewareFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        eduCoursewareFragment.setArguments(args);
        return eduCoursewareFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_edu_courseware, container, false);
        webView=contentView.findViewById(R.id.wv);
        initView();
        webView.loadUrl("www.baidu.com");
        webView.setWebViewClient(new WebViewClient());


        return contentView;
    }

    private void initView() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);//支持JS
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);//缓存模式
        webSettings.setBuiltInZoomControls(true);//是否支持画面缩放（默认不支持）
        webSettings.setSupportZoom(true);
        webSettings.setDisplayZoomControls(false);//是否显示缩放图标（默认显示）
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);//设置网页内容自适应屏幕大小

        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);

    }
}
