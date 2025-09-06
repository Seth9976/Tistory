package com.kakao.android.base.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import com.kakao.android.base.ui.dialog.BaseLoadingDialog;
import io.reactivex.disposables.Disposable;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005R\"\u0010\u0017\u001A\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u001B\u0010\"\u001A\u00020\u001D8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0014\u0010&\u001A\u00020#8eX¤\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%¨\u0006\'"}, d2 = {"Lcom/kakao/android/base/ui/BaseDialogFragment;", "Landroidx/databinding/ViewDataBinding;", "VB", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lio/reactivex/disposables/Disposable;", "disposable", "addDisposable", "(Lio/reactivex/disposables/Disposable;)V", "onDestroy", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "A", "Lkotlin/Lazy;", "getLoadingDialog", "()Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "loadingDialog", "", "getLayoutResourceId", "()I", "layoutResourceId", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseDialogFragment extends DialogFragment {
    public final Lazy A;
    protected ViewDataBinding dataBinding;
    public final Lazy z;

    public BaseDialogFragment() {
        this.z = c.lazy(new a(this, 0));
        this.A = c.lazy(new a(this, 1));
    }

    public final void addDisposable(@NotNull Disposable disposable0) {
        Intrinsics.checkNotNullParameter(disposable0, "disposable");
        ((AutoLifecycleObserver)this.z.getValue()).addDisposable(disposable0);
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

    @LayoutRes
    public abstract int getLayoutResourceId();

    @NotNull
    public final BaseLoadingDialog getLoadingDialog() {
        return (BaseLoadingDialog)this.A.getValue();
    }

    @Override  // androidx.fragment.app.DialogFragment
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((AutoLifecycleObserver)this.z.getValue()).init(this);
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(layoutInflater0, this.getLayoutResourceId(), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setDataBinding(viewDataBinding0);
        this.getDataBinding().setLifecycleOwner(this.getViewLifecycleOwner());
        return this.getDataBinding().getRoot();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.getLoadingDialog().dismiss();
        super.onDestroy();
    }

    public final void setDataBinding(@NotNull ViewDataBinding viewDataBinding0) {
        Intrinsics.checkNotNullParameter(viewDataBinding0, "<set-?>");
        this.dataBinding = viewDataBinding0;
    }
}

