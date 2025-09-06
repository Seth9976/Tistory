package com.kakao.android.base.ui.bottomsheet;

import a2.b;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.R.id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import com.kakao.android.base.utils.DeviceUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000E\b\'\u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001A\u001A\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u0014\u0010\"\u001A\u00020\u00168eX¤\u0004¢\u0006\u0006\u001A\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/kakao/android/base/ui/bottomsheet/BaseBottomSheetDialogFragment;", "Landroidx/databinding/ViewDataBinding;", "VB", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lio/reactivex/disposables/Disposable;", "disposable", "addDisposable", "(Lio/reactivex/disposables/Disposable;)V", "", "topMargin", "setBottomSheetMinimumHeight", "(I)V", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseBottomSheetDialogFragment extends BottomSheetDialogFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/android/base/ui/bottomsheet/BaseBottomSheetDialogFragment$Companion;", "", "", "BUNDLE_TIARA_PAGE_TYPE", "Ljava/lang/String;", "BUNDLE_TIARA_SECTION_TYPE", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public final Lazy A;
    @NotNull
    public static final String BUNDLE_TIARA_PAGE_TYPE = "BUNDLE_TIARA_PAGE_TYPE";
    @NotNull
    public static final String BUNDLE_TIARA_SECTION_TYPE = "BUNDLE_TIARA_SECTION_TYPE";
    @NotNull
    public static final Companion Companion;
    protected ViewDataBinding dataBinding;

    static {
        BaseBottomSheetDialogFragment.Companion = new Companion(null);
    }

    public BaseBottomSheetDialogFragment() {
        this.A = c.lazy(new b(this, 28));
    }

    public final void addDisposable(@NotNull Disposable disposable0) {
        Intrinsics.checkNotNullParameter(disposable0, "disposable");
        ((AutoLifecycleObserver)this.A.getValue()).addDisposable(disposable0);
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

    @Override  // androidx.fragment.app.DialogFragment
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((AutoLifecycleObserver)this.A.getValue()).init(this);
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(layoutInflater0, this.getLayoutResourceId(), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setDataBinding(viewDataBinding0);
        this.getDataBinding().setLifecycleOwner(this.getViewLifecycleOwner());
        return this.getDataBinding().getRoot();
    }

    public final void setBottomSheetMinimumHeight(int v) {
        int v1 = DeviceUtils.INSTANCE.getDisplayHeight();
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        BaseBottomSheetDialogFragment baseBottomSheetDialogFragment0 = v1 - v;
                        View view0 = baseBottomSheetDialogFragment0.getView();
                        if(view0 != null) {
                            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                            if(viewTreeObserver0 != null) {
                                viewTreeObserver0.removeOnGlobalLayoutListener(this);
                            }
                        }
                        Dialog dialog0 = baseBottomSheetDialogFragment0.getDialog();
                        if(dialog0 != null) {
                            FrameLayout frameLayout0 = (FrameLayout)dialog0.findViewById(id.design_bottom_sheet);
                            if(frameLayout0 != null) {
                                baseBottomSheetDialogFragment0.getDataBinding().getRoot().setMinimumHeight(this.b);
                                BottomSheetBehavior.from(frameLayout0).setPeekHeight(this.b);
                            }
                        }
                    }
                });
            }
        }
    }

    public final void setDataBinding(@NotNull ViewDataBinding viewDataBinding0) {
        Intrinsics.checkNotNullParameter(viewDataBinding0, "<set-?>");
        this.dataBinding = viewDataBinding0;
    }
}

