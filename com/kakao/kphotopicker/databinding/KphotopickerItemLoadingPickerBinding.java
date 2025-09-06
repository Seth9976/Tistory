package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kakao.kphotopicker.R.layout;
import com.kakao.kphotopicker.picker.item.SquareRelativeLayout;

public final class KphotopickerItemLoadingPickerBinding implements ViewBinding {
    public final SquareRelativeLayout a;

    public KphotopickerItemLoadingPickerBinding(SquareRelativeLayout squareRelativeLayout0) {
        this.a = squareRelativeLayout0;
    }

    @NonNull
    public static KphotopickerItemLoadingPickerBinding bind(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new KphotopickerItemLoadingPickerBinding(((SquareRelativeLayout)view0));
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.getRoot();
    }

    @NonNull
    public SquareRelativeLayout getRoot() {
        return this.a;
    }

    @NonNull
    public static KphotopickerItemLoadingPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemLoadingPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemLoadingPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_loading_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemLoadingPickerBinding.bind(view0);
    }
}

