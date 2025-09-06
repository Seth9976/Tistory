package com.kakao.android.base.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.fragment.app.Fragment;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import com.kakao.android.base.ui.dialog.BaseLoadingDialog;
import com.kakao.android.base.utils.UiUtils;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000F\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u001B\u0010\u0010\u001A\u00020\u000B8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/android/base/ui/LayoutLessBaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "A", "Lkotlin/Lazy;", "getLoadingDialog", "()Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "loadingDialog", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutLessBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutLessBaseFragment.kt\ncom/kakao/android/base/ui/LayoutLessBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public abstract class LayoutLessBaseFragment extends Fragment {
    public final Lazy A;
    public final Lazy z;

    public LayoutLessBaseFragment() {
        this.z = c.lazy(new b(this, 0));
        this.A = c.lazy(new b(this, 1));
    }

    @NotNull
    public final BaseLoadingDialog getLoadingDialog() {
        return (BaseLoadingDialog)this.A.getValue();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((AutoLifecycleObserver)this.z.getValue()).init(this);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.getLoadingDialog().dismiss();
        super.onDestroy();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view0 = this.getView();
        if(view0 != null) {
            UiUtils.INSTANCE.hideSoftInput(view0);
        }
        super.onDestroyView();
    }
}

