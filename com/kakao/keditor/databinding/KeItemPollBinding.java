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
import com.kakao.keditor.plugin.itemspec.poll.PollItem;

public abstract class KeItemPollBinding extends ViewDataBinding {
    @NonNull
    public final View kePluginPollBorder;
    @NonNull
    public final TextView kePluginPollDateRange;
    @NonNull
    public final ImageView kePluginPollIcon;
    @NonNull
    public final LinearLayout kePluginPollItemOptionSelect;
    @NonNull
    public final LinearLayout kePluginPollSummary;
    @NonNull
    public final TextView kePluginPollTitle;
    @NonNull
    public final TextView kePluginPollType;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected PollItem mPollItem;

    public KeItemPollBinding(Object object0, View view0, int v, View view1, TextView textView0, ImageView imageView0, LinearLayout linearLayout0, LinearLayout linearLayout1, TextView textView1, TextView textView2) {
        super(object0, view0, v);
        this.kePluginPollBorder = view1;
        this.kePluginPollDateRange = textView0;
        this.kePluginPollIcon = imageView0;
        this.kePluginPollItemOptionSelect = linearLayout0;
        this.kePluginPollSummary = linearLayout1;
        this.kePluginPollTitle = textView1;
        this.kePluginPollType = textView2;
    }

    public static KeItemPollBinding bind(@NonNull View view0) {
        return KeItemPollBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemPollBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemPollBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_poll);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public PollItem getPollItem() {
        return this.mPollItem;
    }

    @NonNull
    public static KeItemPollBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemPollBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemPollBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemPollBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemPollBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemPollBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_poll, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemPollBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemPollBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_poll, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setPollItem(@Nullable PollItem arg1);
}

