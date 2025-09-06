package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;

public abstract class KeDialogAlertBinding extends ViewDataBinding {
    @NonNull
    public final TextView keDialogCancel;
    @NonNull
    public final TextView keDialogConfirm;
    @NonNull
    public final TextView keDialogContentTextView;
    @NonNull
    public final FrameLayout keDialogOutsideClickArea;
    @NonNull
    public final TextView keDialogTitleTextView;
    @NonNull
    public final LinearLayout keEditLinkTitleLayout;
    @Bindable
    protected boolean mIsCancelable;
    @Bindable
    protected boolean mIsTitleOnly;

    public KeDialogAlertBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, TextView textView2, FrameLayout frameLayout0, TextView textView3, LinearLayout linearLayout0) {
        super(object0, view0, v);
        this.keDialogCancel = textView0;
        this.keDialogConfirm = textView1;
        this.keDialogContentTextView = textView2;
        this.keDialogOutsideClickArea = frameLayout0;
        this.keDialogTitleTextView = textView3;
        this.keEditLinkTitleLayout = linearLayout0;
    }

    public static KeDialogAlertBinding bind(@NonNull View view0) {
        return KeDialogAlertBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeDialogAlertBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeDialogAlertBinding)ViewDataBinding.bind(object0, view0, layout.ke_dialog_alert);
    }

    public boolean getIsCancelable() {
        return this.mIsCancelable;
    }

    public boolean getIsTitleOnly() {
        return this.mIsTitleOnly;
    }

    @NonNull
    public static KeDialogAlertBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeDialogAlertBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeDialogAlertBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeDialogAlertBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeDialogAlertBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeDialogAlertBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_dialog_alert, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeDialogAlertBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeDialogAlertBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_dialog_alert, null, false, object0);
    }

    public abstract void setIsCancelable(boolean arg1);

    public abstract void setIsTitleOnly(boolean arg1);
}

