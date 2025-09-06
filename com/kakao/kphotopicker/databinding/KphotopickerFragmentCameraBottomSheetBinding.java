package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerFragmentCameraBottomSheetBinding implements ViewBinding {
    public final LinearLayout a;
    @NonNull
    public final RecyclerView cameraList;

    public KphotopickerFragmentCameraBottomSheetBinding(LinearLayout linearLayout0, RecyclerView recyclerView0) {
        this.a = linearLayout0;
        this.cameraList = recyclerView0;
    }

    @NonNull
    public static KphotopickerFragmentCameraBottomSheetBinding bind(@NonNull View view0) {
        int v = id.camera_list;
        RecyclerView recyclerView0 = (RecyclerView)ViewBindings.findChildViewById(view0, v);
        if(recyclerView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
        }
        return new KphotopickerFragmentCameraBottomSheetBinding(((LinearLayout)view0), recyclerView0);
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
    public static KphotopickerFragmentCameraBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerFragmentCameraBottomSheetBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerFragmentCameraBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_fragment_camera_bottom_sheet, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerFragmentCameraBottomSheetBinding.bind(view0);
    }
}

