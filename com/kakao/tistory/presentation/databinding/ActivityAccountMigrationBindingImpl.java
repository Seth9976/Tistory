package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LiveData;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;

public class ActivityAccountMigrationBindingImpl extends ActivityAccountMigrationBinding {
    public final TextView a;
    public long b;
    public static final SparseIntArray c;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        ActivityAccountMigrationBindingImpl.c = sparseIntArray0;
        sparseIntArray0.put(id.login_toolbar, 2);
        sparseIntArray0.put(id.setting_account_fragment_container, 3);
    }

    public ActivityAccountMigrationBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, null, ActivityAccountMigrationBindingImpl.c);
        super(dataBindingComponent0, view0, 1, ((TistoryToolbar)arr_object[2]), ((FragmentContainerView)arr_object[3]));
        this.b = -1L;
        ((LinearLayout)arr_object[0]).setTag(null);
        this.a = (TextView)arr_object[1];
        ((TextView)arr_object[1]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.b;
            this.b = 0L;
        }
        MigrationViewModel migrationViewModel0 = this.mViewModel;
        int v1 = Long.compare(v & 7L, 0L);
        Integer integer0 = null;
        if(v1 != 0) {
            LiveData liveData0 = migrationViewModel0 == null ? null : migrationViewModel0.getAppbarTitleRes();
            this.updateLiveDataRegistration(0, liveData0);
            if(liveData0 != null) {
                integer0 = (Integer)liveData0.getValue();
            }
        }
        if(v1 != 0) {
            CommonBindingAdapter.bindText(this.a, integer0);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.b != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.b = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        if(v != 0) {
            return false;
        }
        LiveData liveData0 = (LiveData)object0;
        if(v1 == BR._all) {
            synchronized(this) {
                this.b |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.viewModel == v) {
            this.setViewModel(((MigrationViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ActivityAccountMigrationBinding
    public void setViewModel(@Nullable MigrationViewModel migrationViewModel0) {
        this.mViewModel = migrationViewModel0;
        synchronized(this) {
            this.b |= 2L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

