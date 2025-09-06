package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerActivityPhotoPickerBinding implements ViewBinding {
    public final FragmentContainerView a;
    @NonNull
    public final FragmentContainerView contentView;

    public KphotopickerActivityPhotoPickerBinding(FragmentContainerView fragmentContainerView0, FragmentContainerView fragmentContainerView1) {
        this.a = fragmentContainerView0;
        this.contentView = fragmentContainerView1;
    }

    @NonNull
    public static KphotopickerActivityPhotoPickerBinding bind(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new KphotopickerActivityPhotoPickerBinding(((FragmentContainerView)view0), ((FragmentContainerView)view0));
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.getRoot();
    }

    @NonNull
    public FragmentContainerView getRoot() {
        return this.a;
    }

    @NonNull
    public static KphotopickerActivityPhotoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerActivityPhotoPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerActivityPhotoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_activity_photo_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerActivityPhotoPickerBinding.bind(view0);
    }
}

