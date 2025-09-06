package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding implements ViewBinding {
    public final FrameLayout a;
    @NonNull
    public final TextView text;

    public KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding(FrameLayout frameLayout0, TextView textView0) {
        this.a = frameLayout0;
        this.text = textView0;
    }

    @NonNull
    public static KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding bind(@NonNull View view0) {
        int v = id.text;
        TextView textView0 = (TextView)ViewBindings.findChildViewById(view0, v);
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
        }
        return new KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding(((FrameLayout)view0), textView0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.getRoot();
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }

    @NonNull
    public static KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_media_fastscroller_title_indicator_layout, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerMediaFastscrollerTitleIndicatorLayoutBinding.bind(view0);
    }
}

