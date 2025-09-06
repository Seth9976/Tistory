package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class ViewCommonExceptionBinding extends ViewDataBinding {
    @NonNull
    public final TextView commonExceptionEmojiText;
    @NonNull
    public final TextView commonExceptionMessageText;
    @NonNull
    public final View commonExceptionPaddingTop;
    @NonNull
    public final AppCompatButton commonExceptionRefreshButton;
    @NonNull
    public final TextView commonExceptionTitleText;
    @Bindable
    protected CharSequence mMessage;
    @Bindable
    protected String mTitle;

    public ViewCommonExceptionBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, View view1, AppCompatButton appCompatButton0, TextView textView2) {
        super(object0, view0, v);
        this.commonExceptionEmojiText = textView0;
        this.commonExceptionMessageText = textView1;
        this.commonExceptionPaddingTop = view1;
        this.commonExceptionRefreshButton = appCompatButton0;
        this.commonExceptionTitleText = textView2;
    }

    public static ViewCommonExceptionBinding bind(@NonNull View view0) {
        return ViewCommonExceptionBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewCommonExceptionBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ViewCommonExceptionBinding)ViewDataBinding.bind(object0, view0, layout.view_common_exception);
    }

    @Nullable
    public CharSequence getMessage() {
        return this.mMessage;
    }

    @Nullable
    public String getTitle() {
        return this.mTitle;
    }

    @NonNull
    public static ViewCommonExceptionBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ViewCommonExceptionBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewCommonExceptionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ViewCommonExceptionBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewCommonExceptionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ViewCommonExceptionBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.view_common_exception, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ViewCommonExceptionBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ViewCommonExceptionBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.view_common_exception, null, false, object0);
    }

    public abstract void setMessage(@Nullable CharSequence arg1);

    public abstract void setTitle(@Nullable String arg1);
}

