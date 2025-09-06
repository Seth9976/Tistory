package com.kakao.android.base.ui;

import a2.b;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import com.kakao.android.base.utils.AccessibilityUtils;
import com.kakao.android.base.utils.UiUtils;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u001B\u0010\u000F\u001A\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcom/kakao/android/base/ui/LayoutLessBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/kakao/android/base/observer/AutoLifecycleObserver;", "y", "Lkotlin/Lazy;", "getAutoLifeCycleObserver", "()Lcom/kakao/android/base/observer/AutoLifecycleObserver;", "autoLifeCycleObserver", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class LayoutLessBaseActivity extends AppCompatActivity {
    public final Lazy y;

    public LayoutLessBaseActivity() {
        this.y = c.lazy(new b(this, 27));
    }

    @Override  // android.app.Activity
    public void finish() {
        UiUtils.INSTANCE.hideSoftInput(this);
        super.finish();
    }

    @NotNull
    public final AutoLifecycleObserver getAutoLifeCycleObserver() {
        return (AutoLifecycleObserver)this.y.getValue();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.getAutoLifeCycleObserver().init(this);
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager0, "getSupportFragmentManager(...)");
        AccessibilityUtils.INSTANCE.initBackStackChangedListener(this, fragmentManager0);
    }
}

