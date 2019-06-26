package com.taboola.android.sdksamples.sdk_via_native;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taboola.android.TaboolaWidget;
import com.taboola.android.sdksamples.R;

import java.util.HashMap;

public class SimpleWidgetFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple_widget, container, false);
        TaboolaWidget taboolaWidget = view.findViewById(R.id.taboola_widget);
        taboolaWidget.setAutoResizeHeight(true);
        taboolaWidget.setInterceptScroll(true);
        taboolaWidget.setPageUrl("https://www.sankei.com");
        HashMap<String, String> optionalPageCommands = new HashMap<>();
        optionalPageCommands.put("keepDependencies", "true");
        taboolaWidget.setExtraProperties(optionalPageCommands);
        taboolaWidget.fetchContent();
        return view;
    }
}
