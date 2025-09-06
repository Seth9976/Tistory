package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.common.widget.SquareRelativeLayout;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.video.KeditorVideoImageView;
import com.kakao.keditor.plugin.itemspec.video.VideoItem;

public abstract class KeItemVideoBinding extends ViewDataBinding {
    @NonNull
    public final KeditorVideoImageView keItemVideo;
    @NonNull
    public final EditText keItemVideoCaptionEditText;
    @NonNull
    public final FrameLayout keItemVideoLayout;
    @NonNull
    public final RelativeLayout keItemVideoLayoutWrapper;
    @NonNull
    public final SquareRelativeLayout keItemVideoLoadFailedLayout;
    @NonNull
    public final View keItemVideoLoadingLayout;
    @NonNull
    public final ImageView keItemVideoPlayBtn;
    @NonNull
    public final FrameLayout keItemVideoRelativeLayout;
    @NonNull
    public final View keItemVideoUploadFailedWrap;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected VideoItem mVideoItem;
    @NonNull
    public final View videoItemBorder;

    public KeItemVideoBinding(Object object0, View view0, int v, KeditorVideoImageView keditorVideoImageView0, EditText editText0, FrameLayout frameLayout0, RelativeLayout relativeLayout0, SquareRelativeLayout squareRelativeLayout0, View view1, ImageView imageView0, FrameLayout frameLayout1, View view2, View view3) {
        super(object0, view0, v);
        this.keItemVideo = keditorVideoImageView0;
        this.keItemVideoCaptionEditText = editText0;
        this.keItemVideoLayout = frameLayout0;
        this.keItemVideoLayoutWrapper = relativeLayout0;
        this.keItemVideoLoadFailedLayout = squareRelativeLayout0;
        this.keItemVideoLoadingLayout = view1;
        this.keItemVideoPlayBtn = imageView0;
        this.keItemVideoRelativeLayout = frameLayout1;
        this.keItemVideoUploadFailedWrap = view2;
        this.videoItemBorder = view3;
    }

    public static KeItemVideoBinding bind(@NonNull View view0) {
        return KeItemVideoBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemVideoBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemVideoBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_video);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public VideoItem getVideoItem() {
        return this.mVideoItem;
    }

    @NonNull
    public static KeItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemVideoBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemVideoBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemVideoBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_video, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemVideoBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemVideoBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_video, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setVideoItem(@Nullable VideoItem arg1);
}

