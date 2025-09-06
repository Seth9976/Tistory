package androidx.core.view;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import java.util.Map;

public abstract class v1 {
    public static AccessibilityNodeInfo.TouchDelegateInfo i(Map map0) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map0);
    }

    public static void m(int v, View view0) {
        view0.setTransitionVisibility(v);
    }
}

