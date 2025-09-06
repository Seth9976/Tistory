package androidx.compose.ui.platform;

import android.os.Build.VERSION;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\u000B\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0014\u0010\r\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\bR\u0014\u0010\u0011\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewConfiguration;", "Landroidx/compose/ui/platform/ViewConfiguration;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "", "getLongPressTimeoutMillis", "()J", "longPressTimeoutMillis", "getDoubleTapTimeoutMillis", "doubleTapTimeoutMillis", "getDoubleTapMinTimeMillis", "doubleTapMinTimeMillis", "", "getTouchSlop", "()F", "touchSlop", "getHandwritingSlop", "handwritingSlop", "getMaximumFlingVelocity", "maximumFlingVelocity", "getHandwritingGestureLineMargin", "handwritingGestureLineMargin", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    public final android.view.ViewConfiguration a;

    public AndroidViewConfiguration(@NotNull android.view.ViewConfiguration viewConfiguration0) {
        this.a = viewConfiguration0;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return 300L;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingGestureLineMargin() {
        return Build.VERSION.SDK_INT < 34 ? ViewConfiguration.super.getHandwritingGestureLineMargin() : n0.a.a(this.a);
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingSlop() {
        return Build.VERSION.SDK_INT < 34 ? ViewConfiguration.super.getHandwritingSlop() : n0.a.b(this.a);
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return (long)android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public float getMaximumFlingVelocity() {
        return (float)this.a.getScaledMaximumFlingVelocity();
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return (float)this.a.getScaledTouchSlop();
    }
}

