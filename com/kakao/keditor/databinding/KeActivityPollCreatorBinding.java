package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.poll.PollItem;

public abstract class KeActivityPollCreatorBinding extends ViewDataBinding {
    @NonNull
    public final TextView attachPoll;
    @NonNull
    public final ImageView close;
    @Bindable
    protected PollItem mPollItem;
    @NonNull
    public final TextView navigationTitle;
    @NonNull
    public final RecyclerView pollItems;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final ImageView titleDelBtn;
    @NonNull
    public final EditText titleInput;

    public KeActivityPollCreatorBinding(Object object0, View view0, int v, TextView textView0, ImageView imageView0, TextView textView1, RecyclerView recyclerView0, NestedScrollView nestedScrollView0, ImageView imageView1, EditText editText0) {
        super(object0, view0, v);
        this.attachPoll = textView0;
        this.close = imageView0;
        this.navigationTitle = textView1;
        this.pollItems = recyclerView0;
        this.scrollView = nestedScrollView0;
        this.titleDelBtn = imageView1;
        this.titleInput = editText0;
    }

    public static KeActivityPollCreatorBinding bind(@NonNull View view0) {
        return KeActivityPollCreatorBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeActivityPollCreatorBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeActivityPollCreatorBinding)ViewDataBinding.bind(object0, view0, layout.ke_activity_poll_creator);
    }

    @Nullable
    public PollItem getPollItem() {
        return this.mPollItem;
    }

    @NonNull
    public static KeActivityPollCreatorBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeActivityPollCreatorBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeActivityPollCreatorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeActivityPollCreatorBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeActivityPollCreatorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeActivityPollCreatorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_poll_creator, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeActivityPollCreatorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeActivityPollCreatorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_poll_creator, null, false, object0);
    }

    public abstract void setPollItem(@Nullable PollItem arg1);
}

