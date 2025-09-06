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

public abstract class KeItemContentSearchBookBinding extends ViewDataBinding {
    @NonNull
    public final TextView keItemContentSearchAuthor;
    @NonNull
    public final TextView keItemContentSearchAuthorDesc;
    @NonNull
    public final ImageView keItemContentSearchImage;
    @NonNull
    public final ImageView keItemContentSearchImagePlaceholder;
    @NonNull
    public final ConstraintLayout keItemContentSearchLayout;
    @NonNull
    public final TextView keItemContentSearchPublicationDate;
    @NonNull
    public final TextView keItemContentSearchPublicationDateDesc;
    @NonNull
    public final TextView keItemContentSearchPublisher;
    @NonNull
    public final TextView keItemContentSearchPublisherDesc;
    @NonNull
    public final Barrier keItemContentSearchTextBarrier;
    @NonNull
    public final TextView keItemContentSearchTitle;
    @Bindable
    protected ContentItem mItem;

    public KeItemContentSearchBookBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, ImageView imageView0, ImageView imageView1, ConstraintLayout constraintLayout0, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Barrier barrier0, TextView textView6) {
        super(object0, view0, v);
        this.keItemContentSearchAuthor = textView0;
        this.keItemContentSearchAuthorDesc = textView1;
        this.keItemContentSearchImage = imageView0;
        this.keItemContentSearchImagePlaceholder = imageView1;
        this.keItemContentSearchLayout = constraintLayout0;
        this.keItemContentSearchPublicationDate = textView2;
        this.keItemContentSearchPublicationDateDesc = textView3;
        this.keItemContentSearchPublisher = textView4;
        this.keItemContentSearchPublisherDesc = textView5;
        this.keItemContentSearchTextBarrier = barrier0;
        this.keItemContentSearchTitle = textView6;
    }

    public static KeItemContentSearchBookBinding bind(@NonNull View view0) {
        return KeItemContentSearchBookBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchBookBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchBookBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search_book);
    }

    @Nullable
    public ContentItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemContentSearchBookBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchBookBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchBookBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchBookBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchBookBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchBookBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_book, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchBookBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchBookBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_book, null, false, object0);
    }

    public abstract void setItem(@Nullable ContentItem arg1);
}

