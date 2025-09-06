package androidx.core.view;

import android.os.Bundle;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Collections;
import java.util.List;

public final class a extends View.AccessibilityDelegate {
    public final AccessibilityDelegateCompat a;

    public a(AccessibilityDelegateCompat accessibilityDelegateCompat0) {
        this.a = accessibilityDelegateCompat0;
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view0) {
        AccessibilityNodeProviderCompat accessibilityNodeProviderCompat0 = this.a.getAccessibilityNodeProvider(view0);
        return accessibilityNodeProviderCompat0 == null ? null : ((AccessibilityNodeProvider)accessibilityNodeProviderCompat0.getProvider());
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
        accessibilityNodeInfoCompat0.setScreenReaderFocusable(ViewCompat.isScreenReaderFocusable(view0));
        accessibilityNodeInfoCompat0.setHeading(ViewCompat.isAccessibilityHeading(view0));
        accessibilityNodeInfoCompat0.setPaneTitle(ViewCompat.getAccessibilityPaneTitle(view0));
        accessibilityNodeInfoCompat0.setStateDescription(ViewCompat.getStateDescription(view0));
        this.a.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.addSpansToExtras(accessibilityNodeInfo0.getText(), view0);
        List list0 = (List)view0.getTag(id.tag_accessibility_actions);
        if(list0 == null) {
            list0 = Collections.emptyList();
        }
        for(int v = 0; v < list0.size(); ++v) {
            accessibilityNodeInfoCompat0.addAction(((AccessibilityActionCompat)list0.get(v)));
        }
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
        return this.a.performAccessibilityAction(view0, v, bundle0);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void sendAccessibilityEvent(View view0, int v) {
        this.a.sendAccessibilityEvent(view0, v);
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }
}

