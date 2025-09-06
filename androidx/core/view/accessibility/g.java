package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import androidx.annotation.DoNotInline;

public abstract class g {
    @DoNotInline
    public static CollectionItemInfoCompat a(int v, int v1, int v2, int v3, boolean z, boolean z1) {
        return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, v1, v2, v3, z, z1));
    }
}

