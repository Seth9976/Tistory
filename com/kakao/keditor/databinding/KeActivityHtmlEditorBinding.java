package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.kakao.keditor.plugin.pluginspec.html.editor.HtmlViewModel;
import com.kakao.keditor.plugin.pluginspec.html.editor.view.HtmlEditScrollView;

public abstract class KeActivityHtmlEditorBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keClose;
    @NonNull
    public final LinearLayout keCodeBlockEditorTop;
    @NonNull
    public final HtmlEditScrollView keHtmlCode;
    @NonNull
    public final TextView keOkButton;
    @Bindable
    protected EventFlow mFlow;
    @Bindable
    protected boolean mIsAttachable;
    @Bindable
    protected boolean mIsOverlayOpen;
    @Bindable
    protected HtmlViewModel mVm;

    public KeActivityHtmlEditorBinding(Object object0, View view0, int v, ImageView imageView0, LinearLayout linearLayout0, HtmlEditScrollView htmlEditScrollView0, TextView textView0) {
        super(object0, view0, v);
        this.keClose = imageView0;
        this.keCodeBlockEditorTop = linearLayout0;
        this.keHtmlCode = htmlEditScrollView0;
        this.keOkButton = textView0;
    }

    public static KeActivityHtmlEditorBinding bind(@NonNull View view0) {
        return KeActivityHtmlEditorBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeActivityHtmlEditorBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeActivityHtmlEditorBinding)ViewDataBinding.bind(object0, view0, layout.ke_activity_html_editor);
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
    public HtmlViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static KeActivityHtmlEditorBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeActivityHtmlEditorBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeActivityHtmlEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeActivityHtmlEditorBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeActivityHtmlEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeActivityHtmlEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_html_editor, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeActivityHtmlEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeActivityHtmlEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_html_editor, null, false, object0);
    }

    public abstract void setFlow(@Nullable EventFlow arg1);

    public abstract void setIsAttachable(boolean arg1);

    public abstract void setIsOverlayOpen(boolean arg1);

    public abstract void setVm(@Nullable HtmlViewModel arg1);
}

