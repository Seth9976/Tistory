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

public abstract class KeItemContentSearchMusicBinding extends ViewDataBinding {
    @NonNull
    public final TextView keItemContentSearchAlbum;
    @NonNull
    public final TextView keItemContentSearchAlbumDesc;
    @NonNull
    public final TextView keItemContentSearchArtist;
    @NonNull
    public final TextView keItemContentSearchArtistDesc;
    @NonNull
    public final ImageView keItemContentSearchImage;
    @NonNull
    public final ImageView keItemContentSearchImagePlaceholder;
    @NonNull
    public final ConstraintLayout keItemContentSearchLayout;
    @NonNull
    public final Barrier keItemContentSearchTextBarrier;
    @NonNull
    public final TextView keItemContentSearchTitle;
    @Bindable
    protected ContentItem mItem;

    public KeItemContentSearchMusicBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, TextView textView2, TextView textView3, ImageView imageView0, ImageView imageView1, ConstraintLayout constraintLayout0, Barrier barrier0, TextView textView4) {
        super(object0, view0, v);
        this.keItemContentSearchAlbum = textView0;
        this.keItemContentSearchAlbumDesc = textView1;
        this.keItemContentSearchArtist = textView2;
        this.keItemContentSearchArtistDesc = textView3;
        this.keItemContentSearchImage = imageView0;
        this.keItemContentSearchImagePlaceholder = imageView1;
        this.keItemContentSearchLayout = constraintLayout0;
        this.keItemContentSearchTextBarrier = barrier0;
        this.keItemContentSearchTitle = textView4;
    }

    public static KeItemContentSearchMusicBinding bind(@NonNull View view0) {
        return KeItemContentSearchMusicBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemContentSearchMusicBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemContentSearchMusicBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_content_search_music);
    }

    @Nullable
    public ContentItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemContentSearchMusicBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemContentSearchMusicBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemContentSearchMusicBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemContentSearchMusicBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchMusicBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemContentSearchMusicBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_music, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemContentSearchMusicBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemContentSearchMusicBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_content_search_music, null, false, object0);
    }

    public abstract void setItem(@Nullable ContentItem arg1);
}

