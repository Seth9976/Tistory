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

public final class KphotopickerItemMediaPermissionActionBinding implements ViewBinding {
    public final LinearLayout a;
    @NonNull
    public final TextView mediaPermissionDesc;
    @NonNull
    public final TextView mediaPermissionTitle;

    public KphotopickerItemMediaPermissionActionBinding(LinearLayout linearLayout0, TextView textView0, TextView textView1) {
        this.a = linearLayout0;
        this.mediaPermissionDesc = textView0;
        this.mediaPermissionTitle = textView1;
    }

    @NonNull
    public static KphotopickerItemMediaPermissionActionBinding bind(@NonNull View view0) {
        int v = id.media_permission_desc;
        TextView textView0 = (TextView)ViewBindings.findChildViewById(view0, v);
        if(textView0 != null) {
            v = id.media_permission_title;
            TextView textView1 = (TextView)ViewBindings.findChildViewById(view0, v);
            if(textView1 != null) {
                return new KphotopickerItemMediaPermissionActionBinding(((LinearLayout)view0), textView0, textView1);
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
    public static KphotopickerItemMediaPermissionActionBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerItemMediaPermissionActionBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerItemMediaPermissionActionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_item_media_permission_action, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerItemMediaPermissionActionBinding.bind(view0);
    }
}

