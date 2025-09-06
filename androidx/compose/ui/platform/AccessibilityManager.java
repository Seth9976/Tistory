package androidx.compose.ui.platform;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityManager;", "", "calculateRecommendedTimeoutMillis", "", "originalTimeoutMillis", "containsIcons", "", "containsText", "containsControls", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface AccessibilityManager {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager0, long v, boolean z, boolean z1, boolean z2, int v1, Object object0) {
            return AccessibilityManager.calculateRecommendedTimeoutMillis$default(accessibilityManager0, v, z, z1, z2, v1, object0);
        }
    }

    long calculateRecommendedTimeoutMillis(long arg1, boolean arg2, boolean arg3, boolean arg4);

    static long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager0, long v, boolean z, boolean z1, boolean z2, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
        }
        boolean z3 = (v1 & 2) == 0 ? z : false;
        boolean z4 = (v1 & 4) == 0 ? z1 : false;
        return (v1 & 8) == 0 ? accessibilityManager0.calculateRecommendedTimeoutMillis(v, z3, z4, z2) : accessibilityManager0.calculateRecommendedTimeoutMillis(v, z3, z4, false);
    }
}

