package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerMediaFastscrollerHandleLayoutBinding implements ViewBinding {
    public final FrameLayout a;

    public KphotopickerMediaFastscrollerHandleLayoutBinding(FrameLayout frameLayout0) {
        this.a = frameLayout0;
    }

    @NonNull
    public static KphotopickerMediaFastscrollerHandleLayoutBinding bind(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new KphotopickerMediaFastscrollerHandleLayoutBinding(((FrameLayout)view0));
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
    public static KphotopickerMediaFastscrollerHandleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerMediaFastscrollerHandleLayoutBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerMediaFastscrollerHandleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_media_fastscroller_handle_layout, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerMediaFastscrollerHandleLayoutBinding.bind(view0);
    }
}

