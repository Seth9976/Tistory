package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;

public abstract class KeItemContentSearchBinding extends ViewDataBinding {
    @NonNull
    public final View keItemBorderView;
    @NonNull
    public final KeItemContentSearchBookBinding keItemContentSearchBook;
    @NonNull
    public final View keItemContentSearchBorderView;
    @NonNull
    public final Barrier keItemContentSearchBottomBarrier;
    @NonNull
    public final KeItemContentSearchExhibitionBinding keItemContentSearchExhibition;
    @NonNull
    public final KeItemContentSearchMovieBinding keItemContentSearchMovie;
    @NonNull
    public final KeItemContentSearchMusicBinding keItemContentSearchMusic;
    @NonNull
    public final ConstraintLayout keItemContentSearchParentLayout;
    @NonNull
    public final KeItemContentSearchPersonBinding keItemContentSearchPerson;
    @NonNull
    public final KeItemContentSearchPlayBinding keItemContentSearchPlay;
    @NonNull
    public final Barrier keItemContentSearchTopBarrier;
    @NonNull
    public final KeItemContentSearchTvBinding keItemContentSearchTv;
    @Bindable
    protected ContentItem mContentItem;
    @Bindable
    protected boolean mHasFocus;

    public KeItemContentSearchBinding(Object object0, View view0, int v, View view1, KeItemContentSearchBookBinding keItemContentSearchBookBinding0, View view2, Barrier barrier0, KeItemContentSearchExhibitionBinding keItemContentSearchExhibitionBinding0, KeItemContentSearchMovieBinding keItemContentSearchMovieBinding0, KeItemContentSearchMusicBinding keItemContentSearchMusicBinding0, ConstraintLayout constraintLayout0, KeItemContentSearchPersonBinding keItemContentSearchPersonBinding0, KeItemContentSearchPlayBinding keItemContentSearchPlayBinding0, Barrier barrier1, KeItemContentSearchTvBinding keItemContentSearchTvBinding0) {
        super(object0, view0, v);
        this.keItemBorderView = view1;
        this.keItemContentSearchBook = keItemContentSearchBookBinding0;
        this.keItemContentSearchBorderView = view2;
        this.keItemContentSearchBottomBarrier = barrier0;
        this.keItemContentSearchExhibition = keItemContentSearchExhibitionBinding0;
        this.keItemContentSearchMovie = keItemContentSearchMovieBinding0;
        this.keItemContentSearchMusic = keItemContentSearchMusicBinding0;
        this.keItemContentSearchParentLayout = constraintLayout0;
        this.keItemContentSearchPerson = keItemContentSearchPersonBinding0;
        this.keItemContentSearchPlay = keItemContentSearchPlayBinding0;
        this.keItemContentSearchTopBarrier = barrier1;
        this.keItemContentSearchTv = keItemContentSearchTvBinding0;
    }

    public static KeItemContentSearchBinding bind(@NonNull View view0) {
        return KeItemContentSearchBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search);
    }

    @Nullable
    public ContentItem getContentItem() {
        return this.mContentItem;
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @NonNull
    public static KeItemContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search, null, false, object0);
    }

    public abstract void setContentItem(@Nullable ContentItem arg1);

    public abstract void setHasFocus(boolean arg1);
}

