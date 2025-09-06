package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;

public abstract class KeItemContentSearchExhibitionBinding extends ViewDataBinding {
    @NonNull
    public final TextView keItemContentSearchDate;
    @NonNull
    public final TextView keItemContentSearchDateDesc;
    @NonNull
    public final ImageView keItemContentSearchImage;
    @NonNull
    public final ImageView keItemContentSearchImagePlaceholder;
    @NonNull
    public final ConstraintLayout keItemContentSearchLayout;
    @NonNull
    public final TextView keItemContentSearchLocation;
    @NonNull
    public final TextView keItemContentSearchLocationDesc;
    @NonNull
    public final Barrier keItemContentSearchTextBarrier;
    @NonNull
    public final TextView keItemContentSearchTitle;
    @Bindable
    protected ContentItem mItem;

    public KeItemContentSearchExhibitionBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, ImageView imageView0, ImageView imageView1, ConstraintLayout constraintLayout0, TextView textView2, TextView textView3, Barrier barrier0, TextView textView4) {
        super(object0, view0, v);
        this.keItemContentSearchDate = textView0;
        this.keItemContentSearchDateDesc = textView1;
        this.keItemContentSearchImage = imageView0;
        this.keItemContentSearchImagePlaceholder = imageView1;
        this.keItemContentSearchLayout = constraintLayout0;
        this.keItemContentSearchLocation = textView2;
        this.keItemContentSearchLocationDesc = textView3;
        this.keItemContentSearchTextBarrier = barrier0;
        this.keItemContentSearchTitle = textView4;
    }

    public static KeItemContentSearchExhibitionBinding bind(@NonNull View view0) {
        return KeItemContentSearchExhibitionBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchExhibitionBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchExhibitionBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search_exhibition);
    }

    @Nullable
    public ContentItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemContentSearchExhibitionBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchExhibitionBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchExhibitionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchExhibitionBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchExhibitionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchExhibitionBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_exhibition, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchExhibitionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchExhibitionBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_exhibition, null, false, object0);
    }

    public abstract void setItem(@Nullable ContentItem arg1);
}

