package androidx.core.view.accessibility;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;
    public final Object a;

    public AccessibilityNodeProviderCompat() {
        this.a = new k(this);
    }

    public AccessibilityNodeProviderCompat(@Nullable Object object0) {
        this.a = object0;
    }

    public void addExtraDataToAccessibilityNodeInfo(int v, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, @NonNull String s, @Nullable Bundle bundle0) {
    }

    @Nullable
    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int v) {
        return null;
    }

    @Nullable
    public List findAccessibilityNodeInfosByText(@NonNull String s, int v) [...] // Inlined contents

    @Nullable
    public AccessibilityNodeInfoCompat findFocus(int v) {
        return null;
    }

    @Nullable
    public Object getProvider() {
        return this.a;
    }

    public boolean performAction(int v, int v1, @Nullable Bundle bundle0) {
        return false;
    }
}

