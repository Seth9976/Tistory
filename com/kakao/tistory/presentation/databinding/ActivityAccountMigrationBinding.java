package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;

public abstract class ActivityAccountMigrationBinding extends ViewDataBinding {
    @NonNull
    public final TistoryToolbar loginToolbar;
    @Bindable
    protected MigrationViewModel mViewModel;
    @NonNull
    public final FragmentContainerView settingAccountFragmentContainer;

    public ActivityAccountMigrationBinding(Object object0, View view0, int v, TistoryToolbar tistoryToolbar0, FragmentContainerView fragmentContainerView0) {
        super(object0, view0, v);
        this.loginToolbar = tistoryToolbar0;
        this.settingAccountFragmentContainer = fragmentContainerView0;
    }

    public static ActivityAccountMigrationBinding bind(@NonNull View view0) {
        return ActivityAccountMigrationBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAccountMigrationBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ActivityAccountMigrationBinding)ViewDataBinding.bind(object0, view0, layout.activity_account_migration);
    }

    @Nullable
    public MigrationViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static ActivityAccountMigrationBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ActivityAccountMigrationBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityAccountMigrationBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ActivityAccountMigrationBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityAccountMigrationBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ActivityAccountMigrationBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_account_migration, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ActivityAccountMigrationBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ActivityAccountMigrationBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_account_migration, null, false, object0);
    }

    public abstract void setViewModel(@Nullable MigrationViewModel arg1);
}

