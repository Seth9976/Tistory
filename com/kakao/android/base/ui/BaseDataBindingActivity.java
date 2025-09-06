package com.kakao.android.base.ui;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EH\u0015R\u001C\u0010\u0005\u001A\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\n\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000F"}, d2 = {"Lcom/kakao/android/base/ui/BaseDataBindingActivity;", "VB", "Landroidx/databinding/ViewDataBinding;", "Lcom/kakao/android/base/ui/BaseActivity;", "()V", "dataBinding", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseDataBindingActivity extends BaseActivity {
    protected ViewDataBinding dataBinding;

    public BaseDataBindingActivity() {
        super(true);
    }

    @NotNull
    public final ViewDataBinding getDataBinding() {
        ViewDataBinding viewDataBinding0 = this.dataBinding;
        if(viewDataBinding0 != null) {
            return viewDataBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.getAutoLifeCycleObserver().init(this);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, this.getLayoutResourceId());
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        this.setDataBinding(viewDataBinding0);
        this.getDataBinding().setLifecycleOwner(this);
    }

    public final void setDataBinding(@NotNull ViewDataBinding viewDataBinding0) {
        Intrinsics.checkNotNullParameter(viewDataBinding0, "<set-?>");
        this.dataBinding = viewDataBinding0;
    }
}

