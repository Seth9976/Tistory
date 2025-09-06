package com.kakao.kphotopicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerFragmentPhotoPreviewBinding implements ViewBinding {
    public final FrameLayout a;
    @NonNull
    public final TextView attachCount;
    @NonNull
    public final TextView attachPhotoButton;
    @NonNull
    public final ImageView back;
    @NonNull
    public final ImageView editButton;
    @NonNull
    public final RelativeLayout layoutBottomBar;
    @NonNull
    public final RelativeLayout layoutNavigation;
    @NonNull
    public final TextView photoIndex;
    @NonNull
    public final ViewPager previewViewpager;
    @NonNull
    public final TextView selectedIndex;
    @NonNull
    public final LinearLayout selectedIndexWrapper;

    public KphotopickerFragmentPhotoPreviewBinding(FrameLayout frameLayout0, TextView textView0, TextView textView1, ImageView imageView0, ImageView imageView1, RelativeLayout relativeLayout0, RelativeLayout relativeLayout1, TextView textView2, ViewPager viewPager0, TextView textView3, LinearLayout linearLayout0) {
        this.a = frameLayout0;
        this.attachCount = textView0;
        this.attachPhotoButton = textView1;
        this.back = imageView0;
        this.editButton = imageView1;
        this.layoutBottomBar = relativeLayout0;
        this.layoutNavigation = relativeLayout1;
        this.photoIndex = textView2;
        this.previewViewpager = viewPager0;
        this.selectedIndex = textView3;
        this.selectedIndexWrapper = linearLayout0;
    }

    @NonNull
    public static KphotopickerFragmentPhotoPreviewBinding bind(@NonNull View view0) {
        int v = id.attach_count;
        View view1 = ViewBindings.findChildViewById(view0, v);
        if(((TextView)view1) != null) {
            v = id.attach_photo_button;
            View view2 = ViewBindings.findChildViewById(view0, v);
            if(((TextView)view2) != null) {
                v = id.back;
                View view3 = ViewBindings.findChildViewById(view0, v);
                if(((ImageView)view3) != null) {
                    v = id.edit_button;
                    View view4 = ViewBindings.findChildViewById(view0, v);
                    if(((ImageView)view4) != null) {
                        v = id.layout_bottom_bar;
                        View view5 = ViewBindings.findChildViewById(view0, v);
                        if(((RelativeLayout)view5) != null) {
                            v = id.layout_navigation;
                            View view6 = ViewBindings.findChildViewById(view0, v);
                            if(((RelativeLayout)view6) != null) {
                                v = id.photo_index;
                                View view7 = ViewBindings.findChildViewById(view0, v);
                                if(((TextView)view7) != null) {
                                    v = id.preview_viewpager;
                                    View view8 = ViewBindings.findChildViewById(view0, v);
                                    if(((ViewPager)view8) != null) {
                                        v = id.selected_index;
                                        View view9 = ViewBindings.findChildViewById(view0, v);
                                        if(((TextView)view9) != null) {
                                            v = id.selected_index_wrapper;
                                            View view10 = ViewBindings.findChildViewById(view0, v);
                                            if(((LinearLayout)view10) != null) {
                                                return new KphotopickerFragmentPhotoPreviewBinding(((FrameLayout)view0), ((TextView)view1), ((TextView)view2), ((ImageView)view3), ((ImageView)view4), ((RelativeLayout)view5), ((RelativeLayout)view6), ((TextView)view7), ((ViewPager)view8), ((TextView)view9), ((LinearLayout)view10));
                                            }
                                        }
                                    }
                                }
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
    public static KphotopickerFragmentPhotoPreviewBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerFragmentPhotoPreviewBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerFragmentPhotoPreviewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_fragment_photo_preview, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerFragmentPhotoPreviewBinding.bind(view0);
    }
}

