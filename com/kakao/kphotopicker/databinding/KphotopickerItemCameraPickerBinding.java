package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;
import com.kakao.kphotopicker.picker.item.SquareRelativeLayout;

public final class KphotopickerItemCameraPickerBinding implements ViewBinding {
    public final SquareRelativeLayout a;
    @NonNull
    public final ImageView image;

    public KphotopickerItemCameraPickerBinding(SquareRelativeLayout squareRelativeLayout0, ImageView imageView0) {
        this.a = squareRelativeLayout0;
        this.image = imageView0;
    }

    @NonNull
    public static KphotopickerItemCameraPickerBinding bind(@NonNull View view0) {
        int v = id.image;
        ImageView imageView0 = (ImageView)ViewBindings.findChildViewById(view0, v);
        if(imageView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
        }
        return new KphotopickerItemCameraPickerBinding(((SquareRelativeLayout)view0), imageView0);
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
    public static KphotopickerItemCameraPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemCameraPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemCameraPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_camera_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemCameraPickerBinding.bind(view0);
    }
}

