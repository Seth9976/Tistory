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

public abstract class KeItemContentSearchPersonBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keItemContentSearchImage;
    @NonNull
    public final ImageView keItemContentSearchImagePlaceholder;
    @NonNull
    public final TextView keItemContentSearchJob;
    @NonNull
    public final TextView keItemContentSearchJobDesc;
    @NonNull
    public final ConstraintLayout keItemContentSearchLayout;
    @NonNull
    public final TextView keItemContentSearchMemberOf;
    @NonNull
    public final TextView keItemContentSearchMemberOfDesc;
    @NonNull
    public final Barrier keItemContentSearchTextBarrier;
    @NonNull
    public final TextView keItemContentSearchTitle;
    @Bindable
    protected ContentItem mItem;

    public KeItemContentSearchPersonBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1, TextView textView0, TextView textView1, ConstraintLayout constraintLayout0, TextView textView2, TextView textView3, Barrier barrier0, TextView textView4) {
        super(object0, view0, v);
        this.keItemContentSearchImage = imageView0;
        this.keItemContentSearchImagePlaceholder = imageView1;
        this.keItemContentSearchJob = textView0;
        this.keItemContentSearchJobDesc = textView1;
        this.keItemContentSearchLayout = constraintLayout0;
        this.keItemContentSearchMemberOf = textView2;
        this.keItemContentSearchMemberOfDesc = textView3;
        this.keItemContentSearchTextBarrier = barrier0;
        this.keItemContentSearchTitle = textView4;
    }

    public static KeItemContentSearchPersonBinding bind(@NonNull View view0) {
        return KeItemContentSearchPersonBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchPersonBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchPersonBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search_person);
    }

    @Nullable
    public ContentItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemContentSearchPersonBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchPersonBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchPersonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchPersonBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchPersonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchPersonBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_person, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchPersonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchPersonBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_person, null, false, object0);
    }

    public abstract void setItem(@Nullable ContentItem arg1);
}

