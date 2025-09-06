package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class DialogCommonDatePickerBinding extends ViewDataBinding {
    @NonNull
    public final CalendarView commonDatePicker;
    @NonNull
    public final View commonDatePickerDivider1;
    @NonNull
    public final View commonDatePickerDivider2;
    @NonNull
    public final AppCompatButton commonDatePickerLeftButton;
    @NonNull
    public final AppCompatButton commonDatePickerRightButton;

    public DialogCommonDatePickerBinding(Object object0, View view0, int v, CalendarView calendarView0, View view1, View view2, AppCompatButton appCompatButton0, AppCompatButton appCompatButton1) {
        super(object0, view0, v);
        this.commonDatePicker = calendarView0;
        this.commonDatePickerDivider1 = view1;
        this.commonDatePickerDivider2 = view2;
        this.commonDatePickerLeftButton = appCompatButton0;
        this.commonDatePickerRightButton = appCompatButton1;
    }

    public static DialogCommonDatePickerBinding bind(@NonNull View view0) {
        return DialogCommonDatePickerBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCommonDatePickerBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (DialogCommonDatePickerBinding)ViewDataBinding.bind(object0, view0, layout.dialog_common_date_picker);
    }

    @NonNull
    public static DialogCommonDatePickerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return DialogCommonDatePickerBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogCommonDatePickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return DialogCommonDatePickerBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogCommonDatePickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (DialogCommonDatePickerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_common_date_picker, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static DialogCommonDatePickerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (DialogCommonDatePickerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.dialog_common_date_picker, null, false, object0);
    }
}

