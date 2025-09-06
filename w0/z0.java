package w0;

import android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class z0 {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull AccessibilityManager accessibilityManager0, @NotNull AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener0) {
        accessibilityManager0.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener0);
    }

    @DoNotInline
    @JvmStatic
    public static final void b(@NotNull AccessibilityManager accessibilityManager0, @NotNull AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener0) {
        accessibilityManager0.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener0);
    }
}

