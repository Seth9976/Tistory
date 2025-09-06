package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "calculateRecommendedTimeoutMillis", "(JZZZ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidAccessibilityManager implements AccessibilityManager {
    public static final int $stable = 8;
    @Deprecated
    public static final int FlagContentControls = 4;
    @Deprecated
    public static final int FlagContentIcons = 1;
    @Deprecated
    public static final int FlagContentText = 2;
    public final android.view.accessibility.AccessibilityManager a;

    public AndroidAccessibilityManager(@NotNull Context context0) {
        Object object0 = context0.getSystemService("accessibility");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (android.view.accessibility.AccessibilityManager)object0;
    }

    @Override  // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long v, boolean z, boolean z1, boolean z2) {
        if(v >= 0x7FFFFFFFL) {
            return v;
        }
        if(z1) {
            z |= 2;
        }
        if(z2) {
            z |= 4;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager0 = this.a;
        if(Build.VERSION.SDK_INT >= 29) {
            int v1 = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(accessibilityManager0, ((int)v), ((int)z));
            return v1 == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)v1);
        }
        return z2 && accessibilityManager0.isTouchExplorationEnabled() ? 0x7FFFFFFFFFFFFFFFL : v;
    }
}

