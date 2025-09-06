package com.kakao.android.base.ui;

import a2.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import io.reactivex.disposables.Disposable;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001A\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u000FH\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001A\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001D\u001A\u00020\u001A8eX¤\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Lcom/kakao/android/base/ui/BaseFragment;", "Landroidx/databinding/ViewDataBinding;", "VB", "Lcom/kakao/android/base/ui/LayoutLessBaseFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lio/reactivex/disposables/Disposable;", "disposable", "", "addDisposable", "(Lio/reactivex/disposables/Disposable;)V", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "", "getLayoutResourceId", "()I", "layoutResourceId", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseFragment extends LayoutLessBaseFragment {
    public final Lazy B;
    protected ViewDataBinding dataBinding;

    public BaseFragment() {
        this.B = c.lazy(new b(this, 26));
    }

    public final void addDisposable(@NotNull Disposable disposable0) {
        Intrinsics.checkNotNullParameter(disposable0, "disposable");
        ((AutoLifecycleObserver)this.B.getValue()).addDisposable(disposable0);
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

    public final void setDataBinding(@NotNull ViewDataBinding viewDataBinding0) {
        Intrinsics.checkNotNullParameter(viewDataBinding0, "<set-?>");
        this.dataBinding = viewDataBinding0;
    }
}

