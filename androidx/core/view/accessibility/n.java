package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;

public abstract class n {
    @DoNotInline
    public static boolean a(AccessibilityWindowInfo accessibilityWindowInfo0) {
        return accessibilityWindowInfo0.isInPictureInPictureMode();
    }
}

