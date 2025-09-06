package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.plugin.itemspec.video.VideoItem;
import java.util.List;

public abstract class KeToolbarVideoMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnAlign;
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final ImageView keBtnVideoFitContent;
    @NonNull
    public final ImageView keBtnVideoMatchParent;
    @NonNull
    public final LinearLayout keMenuVideoEditLayout;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected MediaMenuClickListener mMediaMenuListener;
    @Bindable
    protected VideoItem mVideoItem;
    @Bindable
    protected List mVideoStyles;

    public KeToolbarVideoMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout0) {
        super(object0, view0, v);
        this.keBtnAlign = imageView0;
        this.keBtnDelete = imageView1;
        this.keBtnVideoFitContent = imageView2;
        this.keBtnVideoMatchParent = imageView3;
        this.keMenuVideoEditLayout = linearLayout0;
    }

    public static KeToolbarVideoMenuBinding bind(@NonNull View view0) {
        return KeToolbarVideoMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarVideoMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarVideoMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_video_menu);
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public MediaMenuClickListener getMediaMenuListener() {
        return this.mMediaMenuListener;
    }

    @Nullable
    public VideoItem getVideoItem() {
        return this.mVideoItem;
    }

    @Nullable
    public List getVideoStyles() {
        return this.mVideoStyles;
    }

    @NonNull
    public static KeToolbarVideoMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarVideoMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarVideoMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarVideoMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarVideoMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarVideoMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_video_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarVideoMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarVideoMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_video_menu, null, false, object0);
    }

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setMediaMenuListener(@Nullable MediaMenuClickListener arg1);

    public abstract void setVideoItem(@Nullable VideoItem arg1);

    public abstract void setVideoStyles(@Nullable List arg1);
}

