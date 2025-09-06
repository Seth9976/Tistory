package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class DialogCommonBinding extends ViewDataBinding {
    @NonNull
    public final View commonDialogDivider1;
    @NonNull
    public final View commonDialogDivider2;
    @NonNull
    public final AppCompatButton commonDialogLeftButton;
    @NonNull
    public final TextView commonDialogMessageText;
    @NonNull
    public final AppCompatButton commonDialogRightButton;
    @NonNull
    public final TextView commonDialogTitleText;

    public DialogCommonBinding(Object object0, View view0, int v, View view1, View view2, AppCompatButton appCompatButton0, TextView textView0, AppCompatButton appCompatButton1, TextView textView1) {
        super(object0, view0, v);
        this.commonDialogDivider1 = view1;
        this.commonDialogDivider2 = view2;
        this.commonDialogLeftButton = appCompatButton0;
        this.commonDialogMessageText = textView0;
        this.commonDialogRightButton = appCompatButton1;
        this.commonDialogTitleText = textView1;
    }

    public static DialogCommonBinding bind(@NonNull View view0) {
        return DialogCommonBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCommonBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (DialogCommonBinding)ViewDataBinding.bind(object0, view0, layout.dialog_common);
    }

    @NonNull
    public static DialogCommonBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return DialogCommonBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogCommonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return DialogCommonBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogCommonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (DialogCommonBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_common, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static DialogCommonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (DialogCommonBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_common, null, false, object0);
    }
}

