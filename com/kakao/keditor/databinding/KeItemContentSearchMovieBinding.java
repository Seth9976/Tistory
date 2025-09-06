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

public abstract class KeItemContentSearchMovieBinding extends ViewDataBinding {
    @NonNull
    public final TextView keItemContentSearchActors;
    @NonNull
    public final TextView keItemContentSearchActorsDesc;
    @NonNull
    public final TextView keItemContentSearchDirectors;
    @NonNull
    public final TextView keItemContentSearchDirectorsDesc;
    @NonNull
    public final ImageView keItemContentSearchImage;
    @NonNull
    public final ImageView keItemContentSearchImagePlaceholder;
    @NonNull
    public final ConstraintLayout keItemContentSearchLayout;
    @NonNull
    public final TextView keItemContentSearchRating;
    @NonNull
    public final TextView keItemContentSearchRatingDesc;
    @NonNull
    public final TextView keItemContentSearchRatingEmpty;
    @NonNull
    public final ImageView keItemContentSearchRatingIcon;
    @NonNull
    public final Barrier keItemContentSearchTextBarrier;
    @NonNull
    public final TextView keItemContentSearchTitle;
    @Bindable
    protected ContentItem mItem;

    public KeItemContentSearchMovieBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, TextView textView2, TextView textView3, ImageView imageView0, ImageView imageView1, ConstraintLayout constraintLayout0, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2, Barrier barrier0, TextView textView7) {
        super(object0, view0, v);
        this.keItemContentSearchActors = textView0;
        this.keItemContentSearchActorsDesc = textView1;
        this.keItemContentSearchDirectors = textView2;
        this.keItemContentSearchDirectorsDesc = textView3;
        this.keItemContentSearchImage = imageView0;
        this.keItemContentSearchImagePlaceholder = imageView1;
        this.keItemContentSearchLayout = constraintLayout0;
        this.keItemContentSearchRating = textView4;
        this.keItemContentSearchRatingDesc = textView5;
        this.keItemContentSearchRatingEmpty = textView6;
        this.keItemContentSearchRatingIcon = imageView2;
        this.keItemContentSearchTextBarrier = barrier0;
        this.keItemContentSearchTitle = textView7;
    }

    public static KeItemContentSearchMovieBinding bind(@NonNull View view0) {
        return KeItemContentSearchMovieBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchMovieBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchMovieBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search_movie);
    }

    @Nullable
    public ContentItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemContentSearchMovieBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchMovieBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchMovieBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchMovieBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchMovieBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchMovieBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_movie, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchMovieBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchMovieBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_movie, null, false, object0);
    }

    public abstract void setItem(@Nullable ContentItem arg1);
}

