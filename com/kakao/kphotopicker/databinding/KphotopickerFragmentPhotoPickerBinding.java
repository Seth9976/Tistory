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
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.futuremind.fastscroll.FastScroller;
import com.kakao.kphotopicker.R.id;
import com.kakao.kphotopicker.R.layout;

public final class KphotopickerFragmentPhotoPickerBinding implements ViewBinding {
    public final LinearLayout a;
    @NonNull
    public final TextView attachCount;
    @NonNull
    public final TextView attachPhoto;
    @NonNull
    public final ImageView close;
    @NonNull
    public final TextView currentFolder;
    @NonNull
    public final ImageView edit;
    @NonNull
    public final FastScroller fastScroll;
    @NonNull
    public final AppCompatCheckBox group;
    @NonNull
    public final View iconCategoryArrow;
    @NonNull
    public final RecyclerView keFolder;
    @NonNull
    public final FrameLayout keFolderLoading;
    @NonNull
    public final FrameLayout keLayoutSelectAnimation;
    @NonNull
    public final RecyclerView kePickerPhotos;
    @NonNull
    public final RecyclerView kePickerSelected;
    @NonNull
    public final RelativeLayout kePickerToolbar;
    @NonNull
    public final LinearLayout layoutCurrentFolder;
    @NonNull
    public final LinearLayout layoutFolder;
    @NonNull
    public final RelativeLayout layoutPicker;

    public KphotopickerFragmentPhotoPickerBinding(LinearLayout linearLayout0, TextView textView0, TextView textView1, ImageView imageView0, TextView textView2, ImageView imageView1, FastScroller fastScroller0, AppCompatCheckBox appCompatCheckBox0, View view0, RecyclerView recyclerView0, FrameLayout frameLayout0, FrameLayout frameLayout1, RecyclerView recyclerView1, RecyclerView recyclerView2, RelativeLayout relativeLayout0, LinearLayout linearLayout1, LinearLayout linearLayout2, RelativeLayout relativeLayout1) {
        this.a = linearLayout0;
        this.attachCount = textView0;
        this.attachPhoto = textView1;
        this.close = imageView0;
        this.currentFolder = textView2;
        this.edit = imageView1;
        this.fastScroll = fastScroller0;
        this.group = appCompatCheckBox0;
        this.iconCategoryArrow = view0;
        this.keFolder = recyclerView0;
        this.keFolderLoading = frameLayout0;
        this.keLayoutSelectAnimation = frameLayout1;
        this.kePickerPhotos = recyclerView1;
        this.kePickerSelected = recyclerView2;
        this.kePickerToolbar = relativeLayout0;
        this.layoutCurrentFolder = linearLayout1;
        this.layoutFolder = linearLayout2;
        this.layoutPicker = relativeLayout1;
    }

    @NonNull
    public static KphotopickerFragmentPhotoPickerBinding bind(@NonNull View view0) {
        int v = id.attach_count;
        View view1 = ViewBindings.findChildViewById(view0, v);
        if(((TextView)view1) != null) {
            v = id.attach_photo;
            View view2 = ViewBindings.findChildViewById(view0, v);
            if(((TextView)view2) != null) {
                v = id.close;
                View view3 = ViewBindings.findChildViewById(view0, v);
                if(((ImageView)view3) != null) {
                    v = id.current_folder;
                    View view4 = ViewBindings.findChildViewById(view0, v);
                    if(((TextView)view4) != null) {
                        v = id.edit;
                        View view5 = ViewBindings.findChildViewById(view0, v);
                        if(((ImageView)view5) != null) {
                            v = id.fast_scroll;
                            View view6 = ViewBindings.findChildViewById(view0, v);
                            if(((FastScroller)view6) != null) {
                                v = id.group;
                                View view7 = ViewBindings.findChildViewById(view0, v);
                                if(((AppCompatCheckBox)view7) != null) {
                                    v = id.icon_category_arrow;
                                    View view8 = ViewBindings.findChildViewById(view0, v);
                                    if(view8 != null) {
                                        v = id.ke_folder;
                                        View view9 = ViewBindings.findChildViewById(view0, v);
                                        if(((RecyclerView)view9) != null) {
                                            v = id.ke_folder_loading;
                                            View view10 = ViewBindings.findChildViewById(view0, v);
                                            if(((FrameLayout)view10) != null) {
                                                v = id.ke_layout_select_animation;
                                                View view11 = ViewBindings.findChildViewById(view0, v);
                                                if(((FrameLayout)view11) != null) {
                                                    v = id.ke_picker_photos;
                                                    View view12 = ViewBindings.findChildViewById(view0, v);
                                                    if(((RecyclerView)view12) != null) {
                                                        v = id.ke_picker_selected;
                                                        View view13 = ViewBindings.findChildViewById(view0, v);
                                                        if(((RecyclerView)view13) != null) {
                                                            v = id.ke_picker_toolbar;
                                                            View view14 = ViewBindings.findChildViewById(view0, v);
                                                            if(((RelativeLayout)view14) != null) {
                                                                v = id.layout_current_folder;
                                                                View view15 = ViewBindings.findChildViewById(view0, v);
                                                                if(((LinearLayout)view15) != null) {
                                                                    v = id.layout_folder;
                                                                    View view16 = ViewBindings.findChildViewById(view0, v);
                                                                    if(((LinearLayout)view16) != null) {
                                                                        v = id.layout_picker;
                                                                        View view17 = ViewBindings.findChildViewById(view0, v);
                                                                        if(((RelativeLayout)view17) != null) {
                                                                            return new KphotopickerFragmentPhotoPickerBinding(((LinearLayout)view0), ((TextView)view1), ((TextView)view2), ((ImageView)view3), ((TextView)view4), ((ImageView)view5), ((FastScroller)view6), ((AppCompatCheckBox)view7), view8, ((RecyclerView)view9), ((FrameLayout)view10), ((FrameLayout)view11), ((RecyclerView)view12), ((RecyclerView)view13), ((RelativeLayout)view14), ((LinearLayout)view15), ((LinearLayout)view16), ((RelativeLayout)view17));
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
    public LinearLayout getRoot() {
        return this.a;
    }

    @NonNull
    public static KphotopickerFragmentPhotoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KphotopickerFragmentPhotoPickerBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static KphotopickerFragmentPhotoPickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.kphotopicker_fragment_photo_picker, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return KphotopickerFragmentPhotoPickerBinding.bind(view0);
    }
}

