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

public final class KphotopickerItemVideoPickerBinding implements ViewBinding {
    public final FrameLayout a;
    @NonNull
    public final View border;
    @NonNull
    public final PhotoGalleryImageView image;
    @NonNull
    public final TextView index;
    @NonNull
    public final View indexBg;
    @NonNull
    public final FrameLayout layerIndex;
    @NonNull
    public final TextView videoDurationText;

    public KphotopickerItemVideoPickerBinding(FrameLayout frameLayout0, View view0, PhotoGalleryImageView photoGalleryImageView0, TextView textView0, View view1, FrameLayout frameLayout1, TextView textView1) {
        this.a = frameLayout0;
        this.border = view0;
        this.image = photoGalleryImageView0;
        this.index = textView0;
        this.indexBg = view1;
        this.layerIndex = frameLayout1;
        this.videoDurationText = textView1;
    }

    @NonNull
    public static KphotopickerItemVideoPickerBinding bind(@NonNull View view0) {
        int v = id.border;
        View view1 = ViewBindings.findChildViewById(view0, v);
        if(view1 != null) {
            v = id.image;
            View view2 = ViewBindings.findChildViewById(view0, v);
            if(((PhotoGalleryImageView)view2) != null) {
                v = id.index;
                View view3 = ViewBindings.findChildViewById(view0, v);
                if(((TextView)view3) != null) {
                    v = id.index_bg;
                    View view4 = ViewBindings.findChildViewById(view0, v);
                    if(view4 != null) {
                        v = id.layer_index;
                        View view5 = ViewBindings.findChildViewById(view0, v);
                        if(((FrameLayout)view5) != null) {
                            v = id.video_duration_text;
                            View view6 = ViewBindings.findChildViewById(view0, v);
                            if(((TextView)view6) != null) {
                                return new KphotopickerItemVideoPickerBinding(((FrameLayout)view0), view1, ((PhotoGalleryImageView)view2), ((TextView)view3), view4, ((FrameLayout)view5), ((TextView)view6));
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
    public static KphotopickerItemVideoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemVideoPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemVideoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_video_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemVideoPickerBinding.bind(view0);
    }
}

