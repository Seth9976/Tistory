package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.CodeBlockViewModel;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.CodeEditScrollView;

public abstract class KeActivityCodeBlockEditorBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keClose;
    @NonNull
    public final CodeEditScrollView keCodeBlockCode;
    @NonNull
    public final LinearLayout keCodeBlockEditorToolbar;
    @NonNull
    public final LinearLayout keCodeBlockEditorTop;
    @NonNull
    public final TextView keOkButton;
    @Bindable
    protected EventFlow mFlow;
    @Bindable
    protected boolean mIsAttachable;
    @Bindable
    protected boolean mIsOverlayOpen;
    @Bindable
    protected String mLanguage;
    @Bindable
    protected CodeBlockViewModel mVm;
    @NonNull
    public final FrameLayout overlay;

    public KeActivityCodeBlockEditorBinding(Object object0, View view0, int v, ImageView imageView0, CodeEditScrollView codeEditScrollView0, LinearLayout linearLayout0, LinearLayout linearLayout1, TextView textView0, FrameLayout frameLayout0) {
        super(object0, view0, v);
        this.keClose = imageView0;
        this.keCodeBlockCode = codeEditScrollView0;
        this.keCodeBlockEditorToolbar = linearLayout0;
        this.keCodeBlockEditorTop = linearLayout1;
        this.keOkButton = textView0;
        this.overlay = frameLayout0;
    }

    public static KeActivityCodeBlockEditorBinding bind(@NonNull View view0) {
        return KeActivityCodeBlockEditorBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeActivityCodeBlockEditorBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeActivityCodeBlockEditorBinding)ViewDataBinding.bind(object0, view0, layout.ke_activity_code_block_editor);
    }

    @Nullable
    public EventFlow getFlow() {
        return this.mFlow;
    }

    public boolean getIsAttachable() {
        return this.mIsAttachable;
    }

    public boolean getIsOverlayOpen() {
        return this.mIsOverlayOpen;
    }

    @Nullable
    public String getLanguage() {
        return this.mLanguage;
    }

    @Nullable
    public CodeBlockViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static KeActivityCodeBlockEditorBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeActivityCodeBlockEditorBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeActivityCodeBlockEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeActivityCodeBlockEditorBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeActivityCodeBlockEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeActivityCodeBlockEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_code_block_editor, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeActivityCodeBlockEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeActivityCodeBlockEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_code_block_editor, null, false, object0);
    }

    public abstract void setFlow(@Nullable EventFlow arg1);

    public abstract void setIsAttachable(boolean arg1);

    public abstract void setIsOverlayOpen(boolean arg1);

    public abstract void setLanguage(@Nullable String arg1);

    public abstract void setVm(@Nullable CodeBlockViewModel arg1);
}

