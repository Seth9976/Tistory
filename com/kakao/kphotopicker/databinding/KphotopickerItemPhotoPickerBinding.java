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
import com.kakao.kphotopicker.picker.item.PhotoGalleryImageView;

public final class KphotopickerItemPhotoPickerBinding implements ViewBinding {
    public final FrameLayout a;
    @NonNull
    public final View border;
    @NonNull
    public final View gif;
    @NonNull
    public final PhotoGalleryImageView image;
    @NonNull
    public final TextView index;
    @NonNull
    public final View indexBg;
    @NonNull
    public final FrameLayout layerIndex;

    public KphotopickerItemPhotoPickerBinding(FrameLayout frameLayout0, View view0, View view1, PhotoGalleryImageView photoGalleryImageView0, TextView textView0, View view2, FrameLayout frameLayout1) {
        this.a = frameLayout0;
        this.border = view0;
        this.gif = view1;
        this.image = photoGalleryImageView0;
        this.index = textView0;
        this.indexBg = view2;
        this.layerIndex = frameLayout1;
    }

    @NonNull
    public static KphotopickerItemPhotoPickerBinding bind(@NonNull View view0) {
        int v = id.border;
        View view1 = ViewBindings.findChildViewById(view0, v);
        if(view1 != null) {
            v = id.gif;
            View view2 = ViewBindings.findChildViewById(view0, v);
            if(view2 != null) {
                v = id.image;
                View view3 = ViewBindings.findChildViewById(view0, v);
                if(((PhotoGalleryImageView)view3) != null) {
                    v = id.index;
                    View view4 = ViewBindings.findChildViewById(view0, v);
                    if(((TextView)view4) != null) {
                        v = id.index_bg;
                        View view5 = ViewBindings.findChildViewById(view0, v);
                        if(view5 != null) {
                            v = id.layer_index;
                            View view6 = ViewBindings.findChildViewById(view0, v);
                            if(((FrameLayout)view6) != null) {
                                return new KphotopickerItemPhotoPickerBinding(((FrameLayout)view0), view1, view2, ((PhotoGalleryImageView)view3), ((TextView)view4), view5, ((FrameLayout)view6));
                            }
                        }
                    }
                }
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
    public static KphotopickerItemPhotoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemPhotoPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemPhotoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_photo_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemPhotoPickerBinding.bind(view0);
    }
}

