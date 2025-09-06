package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;
import com.kakao.kphotopicker.picker.item.PhotoGalleryImageView;

public final class KphotopickerItemFolderPickerBinding implements ViewBinding {
    public final LinearLayout a;
    @NonNull
    public final TextView count;
    @NonNull
    public final TextView folderName;
    @NonNull
    public final PhotoGalleryImageView image;

    public KphotopickerItemFolderPickerBinding(LinearLayout linearLayout0, TextView textView0, TextView textView1, PhotoGalleryImageView photoGalleryImageView0) {
        this.a = linearLayout0;
        this.count = textView0;
        this.folderName = textView1;
        this.image = photoGalleryImageView0;
    }

    @NonNull
    public static KphotopickerItemFolderPickerBinding bind(@NonNull View view0) {
        int v = id.count;
        TextView textView0 = (TextView)ViewBindings.findChildViewById(view0, v);
        if(textView0 != null) {
            v = id.folder_name;
            TextView textView1 = (TextView)ViewBindings.findChildViewById(view0, v);
            if(textView1 != null) {
                v = id.image;
                PhotoGalleryImageView photoGalleryImageView0 = (PhotoGalleryImageView)ViewBindings.findChildViewById(view0, v);
                if(photoGalleryImageView0 != null) {
                    return new KphotopickerItemFolderPickerBinding(((LinearLayout)view0), textView0, textView1, photoGalleryImageView0);
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
    public LinearLayout getRoot() {
        return this.a;
    }

    @NonNull
    public static KphotopickerItemFolderPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemFolderPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemFolderPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_folder_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemFolderPickerBinding.bind(view0);
    }
}

