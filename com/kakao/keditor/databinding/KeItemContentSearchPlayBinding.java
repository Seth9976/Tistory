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

public abstract class KeItemContentSearchPlayBinding extends ViewDataBinding {
    @NonNull
    public final TextView keItemContentSearchActors;
    @NonNull
    public final TextView keItemContentSearchActorsDesc;
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

    public KeItemContentSearchPlayBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, TextView textView2, TextView textView3, ImageView imageView0, ImageView imageView1, ConstraintLayout constraintLayout0, TextView textView4, TextView textView5, Barrier barrier0, TextView textView6) {
        super(object0, view0, v);
        this.keItemContentSearchActors = textView0;
        this.keItemContentSearchActorsDesc = textView1;
        this.keItemContentSearchDate = textView2;
        this.keItemContentSearchDateDesc = textView3;
        this.keItemContentSearchImage = imageView0;
        this.keItemContentSearchImagePlaceholder = imageView1;
        this.keItemContentSearchLayout = constraintLayout0;
        this.keItemContentSearchLocation = textView4;
        this.keItemContentSearchLocationDesc = textView5;
        this.keItemContentSearchTextBarrier = barrier0;
        this.keItemContentSearchTitle = textView6;
    }

    public static KeItemContentSearchPlayBinding bind(@NonNull View view0) {
        return KeItemContentSearchPlayBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchPlayBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchPlayBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search_play);
    }

    @Nullable
    public ContentItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemContentSearchPlayBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchPlayBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchPlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchPlayBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchPlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchPlayBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_play, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchPlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchPlayBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_play, null, false, object0);
    }

    public abstract void setItem(@Nullable ContentItem arg1);
}

