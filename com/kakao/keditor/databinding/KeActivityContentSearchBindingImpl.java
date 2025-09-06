package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.pluginspec.contentsearch.webview.ContentSearchWebView;

public class KeActivityContentSearchBindingImpl extends KeActivityContentSearchBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeActivityContentSearchBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_content_search_web_view, 1);
        sparseIntArray0.put(id.ke_content_search_web_view_loading_view, 2);
    }

    public KeActivityContentSearchBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeActivityContentSearchBindingImpl.sIncludes, KeActivityContentSearchBindingImpl.sViewsWithIds));
    }

    private KeActivityContentSearchBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ContentSearchWebView)arr_object[1]), ((View)arr_object[2]), ((FrameLayout)arr_object[0]));
        this.mDirtyFlags = -1L;
        this.keContentSearchWebViewWrapper.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.mDirtyFlags = 0L;
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
            this.mDirtyFlags = 1L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        return true;
    }
}

