package com.kakao.android.base.ui;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.FragmentManager;
import com.kakao.android.base.utils.AccessibilityUtils;
import com.kakao.android.base.utils.UiUtils;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0015¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\u0010\u001A\u00020\r8eX¤\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/android/base/ui/BaseActivity;", "Lcom/kakao/android/base/ui/LayoutLessBaseActivity;", "", "isDataBinding", "<init>", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "finish", "()V", "", "getLayoutResourceId", "()I", "layoutResourceId", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseActivity extends LayoutLessBaseActivity {
    public final boolean z;

    public BaseActivity() {
        this(false, 1, null);
    }

    public BaseActivity(boolean z) {
        this.z = z;
    }

    public BaseActivity(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    @Override  // com.kakao.android.base.ui.LayoutLessBaseActivity
    public void finish() {
        UiUtils.INSTANCE.hideSoftInput(this);
        super.finish();
    }

    @LayoutRes
    public abstract int getLayoutResourceId();

    @Override  // com.kakao.android.base.ui.LayoutLessBaseActivity
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.getAutoLifeCycleObserver().init(this);
        if(!this.z) {
            this.setContentView(this.getLayoutResourceId());
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager0, "getSupportFragmentManager(...)");
        AccessibilityUtils.INSTANCE.initBackStackChangedListener(this, fragmentManager0);
    }
}

