package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.view.common.widget.CommonTimePickerTimeWidget;

public abstract class DialogCommonTimePickerBinding extends ViewDataBinding {
    @NonNull
    public final View commonDialogDivider2;
    @NonNull
    public final AppCompatButton commonDialogLeftButton;
    @NonNull
    public final AppCompatButton commonDialogRightButton;
    @NonNull
    public final CommonTimePickerTimeWidget commonTimeEnd;
    @NonNull
    public final TimePicker commonTimePicker;
    @NonNull
    public final CommonTimePickerTimeWidget commonTimeStart;
    @NonNull
    public final ConstraintLayout commonTimeStateContainer;

    public DialogCommonTimePickerBinding(Object object0, View view0, int v, View view1, AppCompatButton appCompatButton0, AppCompatButton appCompatButton1, CommonTimePickerTimeWidget commonTimePickerTimeWidget0, TimePicker timePicker0, CommonTimePickerTimeWidget commonTimePickerTimeWidget1, ConstraintLayout constraintLayout0) {
        super(object0, view0, v);
        this.commonDialogDivider2 = view1;
        this.commonDialogLeftButton = appCompatButton0;
        this.commonDialogRightButton = appCompatButton1;
        this.commonTimeEnd = commonTimePickerTimeWidget0;
        this.commonTimePicker = timePicker0;
        this.commonTimeStart = commonTimePickerTimeWidget1;
        this.commonTimeStateContainer = constraintLayout0;
    }

    public static DialogCommonTimePickerBinding bind(@NonNull View view0) {
        return DialogCommonTimePickerBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCommonTimePickerBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (DialogCommonTimePickerBinding)ViewDataBinding.bind(object0, view0, layout.dialog_common_time_picker);
    }

    @NonNull
    public static DialogCommonTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return DialogCommonTimePickerBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogCommonTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return DialogCommonTimePickerBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogCommonTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (DialogCommonTimePickerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_common_time_picker, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static DialogCommonTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (DialogCommonTimePickerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_common_time_picker, null, false, object0);
    }
}

