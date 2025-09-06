package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.LocaleListCompat;

public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    public final AccessibilityWindowInfo a;

    public AccessibilityWindowInfoCompat() {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = o.a();
            return;
        }
        this.a = null;
    }

    public AccessibilityWindowInfoCompat(AccessibilityWindowInfo accessibilityWindowInfo0) {
        this.a = accessibilityWindowInfo0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfo accessibilityWindowInfo0 = ((AccessibilityWindowInfoCompat)object0).a;
        return this.a == null ? accessibilityWindowInfo0 == null : this.a.equals(accessibilityWindowInfo0);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getAnchor() {
        return AccessibilityNodeInfoCompat.e(m.a(this.a));
    }

    public void getBoundsInScreen(@NonNull Rect rect0) {
        l.a(this.a, rect0);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getChild(int v) {
        AccessibilityWindowInfo accessibilityWindowInfo0 = l.b(this.a, v);
        return accessibilityWindowInfo0 == null ? null : new AccessibilityWindowInfoCompat(accessibilityWindowInfo0);
    }

    public int getChildCount() {
        return l.c(this.a);
    }

    public int getDisplayId() {
        return Build.VERSION.SDK_INT < 33 ? 0 : p.a(this.a);
    }

    public int getId() {
        return l.d(this.a);
    }

    public int getLayer() {
        return l.e(this.a);
    }

    @NonNull
    public LocaleListCompat getLocales() {
        return Build.VERSION.SDK_INT < 34 ? LocaleListCompat.getEmptyLocaleList() : LocaleListCompat.wrap(q.a(this.a));
    }

    @Nullable
    public AccessibilityWindowInfoCompat getParent() {
        AccessibilityWindowInfo accessibilityWindowInfo0 = l.f(this.a);
        return accessibilityWindowInfo0 == null ? null : new AccessibilityWindowInfoCompat(accessibilityWindowInfo0);
    }

    public void getRegionInScreen(@NonNull Region region0) {
        AccessibilityWindowInfo accessibilityWindowInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 33) {
            p.b(accessibilityWindowInfo0, region0);
            return;
        }
        Rect rect0 = new Rect();
        l.a(accessibilityWindowInfo0, rect0);
        region0.set(rect0);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot() {
        return AccessibilityNodeInfoCompat.e(l.g(this.a));
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot(int v) {
        return Build.VERSION.SDK_INT < 33 ? this.getRoot() : p.c(this.a, v);
    }

    @Nullable
    public CharSequence getTitle() {
        return m.b(this.a);
    }

    public long getTransitionTimeMillis() {
        return Build.VERSION.SDK_INT < 34 ? 0L : q.b(this.a);
    }

    public int getType() {
        return l.h(this.a);
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return l.i(this.a);
    }

    public boolean isActive() {
        return l.j(this.a);
    }

    public boolean isFocused() {
        return l.k(this.a);
    }

    public boolean isInPictureInPictureMode() {
        return n.a(this.a);
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain() {
        AccessibilityWindowInfo accessibilityWindowInfo0 = l.l();
        return accessibilityWindowInfo0 == null ? null : new AccessibilityWindowInfoCompat(accessibilityWindowInfo0);
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain(@Nullable AccessibilityWindowInfoCompat accessibilityWindowInfoCompat0) {
        if(accessibilityWindowInfoCompat0 != null) {
            AccessibilityWindowInfo accessibilityWindowInfo0 = l.m(accessibilityWindowInfoCompat0.a);
            return accessibilityWindowInfo0 == null ? null : new AccessibilityWindowInfoCompat(accessibilityWindowInfo0);
        }
        return null;
    }

    @Deprecated
    public void recycle() {
    }

    @Override
    @NonNull
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect0 = new Rect();
        this.getBoundsInScreen(rect0);
        stringBuilder0.append(this.getId());
        stringBuilder0.append(", type=");
        boolean z = true;
        switch(this.getType()) {
            case 1: {
                s = "TYPE_APPLICATION";
                break;
            }
            case 2: {
                s = "TYPE_INPUT_METHOD";
                break;
            }
            case 3: {
                s = "TYPE_SYSTEM";
                break;
            }
            case 4: {
                s = "TYPE_ACCESSIBILITY_OVERLAY";
                break;
            }
            default: {
                s = "<UNKNOWN>";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", layer=");
        stringBuilder0.append(this.getLayer());
        stringBuilder0.append(", bounds=");
        stringBuilder0.append(rect0);
        stringBuilder0.append(", focused=");
        stringBuilder0.append(this.isFocused());
        stringBuilder0.append(", active=");
        stringBuilder0.append(this.isActive());
        stringBuilder0.append(", hasParent=");
        stringBuilder0.append(this.getParent() != null);
        stringBuilder0.append(", hasChildren=");
        if(this.getChildCount() <= 0) {
            z = false;
        }
        stringBuilder0.append(z);
        stringBuilder0.append(", transitionTime=");
        stringBuilder0.append(this.getTransitionTimeMillis());
        stringBuilder0.append(", locales=");
        stringBuilder0.append(this.getLocales());
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Nullable
    public AccessibilityWindowInfo unwrap() {
        return this.a;
    }
}

