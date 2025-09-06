package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.poll.PollSubItem;

public abstract class KeItemPollSubBinding extends ViewDataBinding {
    @NonNull
    public final ImageView kePluginPollItemImage;
    @NonNull
    public final TextView kePluginPollItemText;
    @Bindable
    protected PollSubItem mPollSubItem;

    public KeItemPollSubBinding(Object object0, View view0, int v, ImageView imageView0, TextView textView0) {
        super(object0, view0, v);
        this.kePluginPollItemImage = imageView0;
        this.kePluginPollItemText = textView0;
    }

    public static KeItemPollSubBinding bind(@NonNull View view0) {
        return KeItemPollSubBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemPollSubBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemPollSubBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_poll_sub);
    }

    @Nullable
    public PollSubItem getPollSubItem() {
        return this.mPollSubItem;
    }

    @NonNull
    public static KeItemPollSubBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemPollSubBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemPollSubBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemPollSubBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemPollSubBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemPollSubBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_poll_sub, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemPollSubBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemPollSubBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_poll_sub, null, false, object0);
    }

    public abstract void setPollSubItem(@Nullable PollSubItem arg1);
}

