package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class WidgetTimeBinding extends ViewDataBinding {
    @NonNull
    public final TextView timeAmPmText;
    @NonNull
    public final TextView timeStateText;
    @NonNull
    public final TextView timeText;

    public WidgetTimeBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, TextView textView2) {
        super(object0, view0, v);
        this.timeAmPmText = textView0;
        this.timeStateText = textView1;
        this.timeText = textView2;
    }

    public static WidgetTimeBinding bind(@NonNull View view0) {
        return WidgetTimeBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetTimeBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (WidgetTimeBinding)ViewDataBinding.bind(object0, view0, layout.widget_time);
    }

    @NonNull
    public static WidgetTimeBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return WidgetTimeBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static WidgetTimeBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return WidgetTimeBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static WidgetTimeBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (WidgetTimeBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.widget_time, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static WidgetTimeBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (WidgetTimeBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.widget_time, null, false, object0);
    }
}

