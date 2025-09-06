package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryDialogViewModel;

public abstract class DialogEntryPasswordBinding extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout commonProtectedEntryDialogButtonContainer;
    @NonNull
    public final View commonProtectedEntryDialogDivider;
    @NonNull
    public final TextInputEditText commonProtectedEntryDialogEditText;
    @NonNull
    public final TextInputLayout commonProtectedEntryDialogInputLayout;
    @NonNull
    public final AppCompatButton commonProtectedEntryDialogLeftButton;
    @NonNull
    public final AppCompatButton commonProtectedEntryDialogRightButton;
    @NonNull
    public final TextView commonProtectedEntryDialogTitleText;
    @Bindable
    protected ProtectedEntryDialogViewModel mViewModel;

    public DialogEntryPasswordBinding(Object object0, View view0, int v, ConstraintLayout constraintLayout0, View view1, TextInputEditText textInputEditText0, TextInputLayout textInputLayout0, AppCompatButton appCompatButton0, AppCompatButton appCompatButton1, TextView textView0) {
        super(object0, view0, v);
        this.commonProtectedEntryDialogButtonContainer = constraintLayout0;
        this.commonProtectedEntryDialogDivider = view1;
        this.commonProtectedEntryDialogEditText = textInputEditText0;
        this.commonProtectedEntryDialogInputLayout = textInputLayout0;
        this.commonProtectedEntryDialogLeftButton = appCompatButton0;
        this.commonProtectedEntryDialogRightButton = appCompatButton1;
        this.commonProtectedEntryDialogTitleText = textView0;
    }

    public static DialogEntryPasswordBinding bind(@NonNull View view0) {
        return DialogEntryPasswordBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEntryPasswordBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (DialogEntryPasswordBinding)ViewDataBinding.bind(object0, view0, layout.dialog_entry_password);
    }

    @Nullable
    public ProtectedEntryDialogViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static DialogEntryPasswordBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return DialogEntryPasswordBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogEntryPasswordBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return DialogEntryPasswordBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogEntryPasswordBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (DialogEntryPasswordBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_entry_password, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static DialogEntryPasswordBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (DialogEntryPasswordBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_entry_password, null, false, object0);
    }

    public abstract void setViewModel(@Nullable ProtectedEntryDialogViewModel arg1);
}

