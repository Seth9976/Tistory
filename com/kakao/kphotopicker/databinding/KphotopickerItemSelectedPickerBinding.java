package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;
import com.kakao.kphotopicker.picker.item.PhotoGalleryImageView;

public final class KphotopickerItemSelectedPickerBinding implements ViewBinding {
    public final FrameLayout a;
    @NonNull
    public final PhotoGalleryImageView image;
    @NonNull
    public final View unpick;

    public KphotopickerItemSelectedPickerBinding(FrameLayout frameLayout0, PhotoGalleryImageView photoGalleryImageView0, View view0) {
        this.a = frameLayout0;
        this.image = photoGalleryImageView0;
        this.unpick = view0;
    }

    @NonNull
    public static KphotopickerItemSelectedPickerBinding bind(@NonNull View view0) {
        int v = id.image;
        PhotoGalleryImageView photoGalleryImageView0 = (PhotoGalleryImageView)ViewBindings.findChildViewById(view0, v);
        if(photoGalleryImageView0 != null) {
            v = id.unpick;
            View view1 = ViewBindings.findChildViewById(view0, v);
            if(view1 != null) {
                return new KphotopickerItemSelectedPickerBinding(((FrameLayout)view0), photoGalleryImageView0, view1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
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
    public static KphotopickerItemSelectedPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemSelectedPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemSelectedPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_selected_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemSelectedPickerBinding.bind(view0);
    }
}

