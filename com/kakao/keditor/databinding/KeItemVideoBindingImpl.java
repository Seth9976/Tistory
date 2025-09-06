package com.kakao.keditor.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.common.widget.SquareRelativeLayout;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Failed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.OnLoading;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.itemspec.video.KeditorVideoImageView;
import com.kakao.keditor.plugin.itemspec.video.VideoItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemVideoBindingImpl extends KeItemVideoBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemVideoBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_video_layout_wrapper, 6);
        sparseIntArray0.put(id.ke_item_video_layout, 7);
        sparseIntArray0.put(id.ke_item_video_relative_layout, 8);
        sparseIntArray0.put(id.ke_item_video, 9);
        sparseIntArray0.put(id.ke_item_video_upload_failed_wrap, 10);
    }

    public KeItemVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 11, KeItemVideoBindingImpl.sIncludes, KeItemVideoBindingImpl.sViewsWithIds));
    }

    private KeItemVideoBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((KeditorVideoImageView)arr_object[9]), ((EditText)arr_object[4]), ((FrameLayout)arr_object[7]), ((RelativeLayout)arr_object[6]), ((SquareRelativeLayout)arr_object[5]), ((View)arr_object[3]), ((ImageView)arr_object[1]), ((FrameLayout)arr_object[8]), ((View)arr_object[10]), ((View)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemVideoCaptionEditText.setTag(null);
        this.keItemVideoLoadFailedLayout.setTag(null);
        this.keItemVideoLoadingLayout.setTag(null);
        this.keItemVideoPlayBtn.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.videoItemBorder.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        Drawable drawable0;
        int v1;
        Context context0;
        boolean z3;
        boolean z2;
        String s;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        VideoItem videoItem0 = this.mVideoItem;
        LoadingStatus loadingStatus0 = null;
        boolean z1 = false;
        if(Long.compare(v & 6L, 0L) == 0) {
            drawable0 = null;
            z3 = false;
        }
        else {
            if(videoItem0 == null) {
                s = null;
                z2 = false;
            }
            else {
                loadingStatus0 = videoItem0.getLoadingStatus();
                s = videoItem0.getCaption();
                z2 = videoItem0.isYoutubeHost();
            }
            v |= (z2 ? 16L : 8L);
            z3 = loadingStatus0 == OnLoading.INSTANCE;
            if(loadingStatus0 == Failed.INSTANCE) {
                z1 = true;
            }
            if(z2) {
                context0 = this.keItemVideoPlayBtn.getContext();
                v1 = drawable.ke_ic_video_youtube;
            }
            else {
                context0 = this.keItemVideoPlayBtn.getContext();
                v1 = drawable.ke_ic_btn_movie;
            }
            drawable0 = AppCompatResources.getDrawable(context0, v1);
            loadingStatus0 = s;
        }
        if((6L & v) != 0L) {
            TextViewBindingAdapter.setText(this.keItemVideoCaptionEditText, ((CharSequence)loadingStatus0));
            BindingAdapters.goneUnless(this.keItemVideoLoadFailedLayout, Boolean.valueOf(z1));
            BindingAdapters.goneUnless(this.keItemVideoLoadingLayout, Boolean.valueOf(z3));
            BindingAdapters.setSrcDrawable(this.keItemVideoPlayBtn, drawable0);
        }
        if((v & 5L) != 0L) {
            BindingAdapters.goneUnless(this.videoItemBorder, Boolean.valueOf(z));
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.mDirtyFlags != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.mDirtyFlags = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemVideoBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.videoItem == v) {
            this.setVideoItem(((VideoItem)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemVideoBinding
    public void setVideoItem(@Nullable VideoItem videoItem0) {
        this.mVideoItem = videoItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.videoItem);
        super.requestRebind();
    }
}

