package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kakao.kphotopicker.R.layout;

public final class FastscrollDefaultBubbleBinding implements ViewBinding {
    public final TextView a;

    public FastscrollDefaultBubbleBinding(TextView textView0) {
        this.a = textView0;
    }

    @NonNull
    public static FastscrollDefaultBubbleBinding bind(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new FastscrollDefaultBubbleBinding(((TextView)view0));
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.getRoot();
    }

    @NonNull
    public TextView getRoot() {
        return this.a;
    }

    @NonNull
    public static FastscrollDefaultBubbleBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return FastscrollDefaultBubbleBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static FastscrollDefaultBubbleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.fastscroll__default_bubble, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return FastscrollDefaultBubbleBinding.bind(view0);
    }
}

