package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerLayoutPreviewPageBinding implements ViewBinding {
    public final FrameLayout a;
    @NonNull
    public final ImageView previewItemPhotoImage;
    @NonNull
    public final AppCompatImageButton videoPlayButton;

    public KphotopickerLayoutPreviewPageBinding(FrameLayout frameLayout0, ImageView imageView0, AppCompatImageButton appCompatImageButton0) {
        this.a = frameLayout0;
        this.previewItemPhotoImage = imageView0;
        this.videoPlayButton = appCompatImageButton0;
    }

    @NonNull
    public static KphotopickerLayoutPreviewPageBinding bind(@NonNull View view0) {
        int v = id.preview_item_photo_image;
        ImageView imageView0 = (ImageView)ViewBindings.findChildViewById(view0, v);
        if(imageView0 != null) {
            v = id.video_play_button;
            AppCompatImageButton appCompatImageButton0 = (AppCompatImageButton)ViewBindings.findChildViewById(view0, v);
            if(appCompatImageButton0 != null) {
                return new KphotopickerLayoutPreviewPageBinding(((FrameLayout)view0), imageView0, appCompatImageButton0);
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
    public static KphotopickerLayoutPreviewPageBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerLayoutPreviewPageBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerLayoutPreviewPageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_layout_preview_page, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerLayoutPreviewPageBinding.bind(view0);
    }
}

