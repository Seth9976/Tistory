package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;

public abstract class i {
    @DoNotInline
    public static CollectionItemInfoCompat a(boolean z, int v, int v1, int v2, int v3, boolean z1, String s, String s1) {
        return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(v).setRowIndex(v1).setColumnSpan(v2).setRowSpan(v3).setSelected(z1).setRowTitle(s).setColumnTitle(s1).build());
    }

    @DoNotInline
    public static AccessibilityNodeInfoCompat b(AccessibilityNodeInfo accessibilityNodeInfo0, int v, int v1) {
        return AccessibilityNodeInfoCompat.e(accessibilityNodeInfo0.getChild(v, v1));
    }

    @DoNotInline
    public static String c(Object object0) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)object0).getColumnTitle();
    }

    @DoNotInline
    public static String d(Object object0) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)object0).getRowTitle();
    }

    @DoNotInline
    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getExtraRenderingInfo();
    }

    @DoNotInline
    public static AccessibilityNodeInfoCompat f(AccessibilityNodeInfo accessibilityNodeInfo0, int v) {
        return AccessibilityNodeInfoCompat.e(accessibilityNodeInfo0.getParent(v));
    }

    @DoNotInline
    public static String g(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getUniqueId();
    }

    @DoNotInline
    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.isTextSelectable();
    }

    @DoNotInline
    public static void i(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
        accessibilityNodeInfo0.setTextSelectable(z);
    }

    @DoNotInline
    public static void j(AccessibilityNodeInfo accessibilityNodeInfo0, String s) {
        accessibilityNodeInfo0.setUniqueId(s);
    }
}

