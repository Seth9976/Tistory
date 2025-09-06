package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.R.layout;

public abstract class KeViewCodeBlockLanguageOverlayBinding extends ViewDataBinding {
    @NonNull
    public final RecyclerView list;

    public KeViewCodeBlockLanguageOverlayBinding(Object object0, View view0, int v, RecyclerView recyclerView0) {
        super(object0, view0, v);
        this.list = recyclerView0;
    }

    public static KeViewCodeBlockLanguageOverlayBinding bind(@NonNull View view0) {
        return KeViewCodeBlockLanguageOverlayBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeViewCodeBlockLanguageOverlayBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeViewCodeBlockLanguageOverlayBinding)ViewDataBinding.bind(object0, view0, layout.ke_view_code_block_language_overlay);
    }

    @NonNull
    public static KeViewCodeBlockLanguageOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeViewCodeBlockLanguageOverlayBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeViewCodeBlockLanguageOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeViewCodeBlockLanguageOverlayBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeViewCodeBlockLanguageOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeViewCodeBlockLanguageOverlayBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_view_code_block_language_overlay, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeViewCodeBlockLanguageOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeViewCodeBlockLanguageOverlayBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_view_code_block_language_overlay, null, false, object0);
    }
}

