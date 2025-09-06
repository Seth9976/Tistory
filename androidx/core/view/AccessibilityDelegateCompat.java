package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat {
    public final View.AccessibilityDelegate a;
    public final a b;
    public static final View.AccessibilityDelegate c;

    static {
        AccessibilityDelegateCompat.c = new View.AccessibilityDelegate();
    }

    public AccessibilityDelegateCompat() {
        this(AccessibilityDelegateCompat.c);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityDelegateCompat(@NonNull View.AccessibilityDelegate view$AccessibilityDelegate0) {
        this.a = view$AccessibilityDelegate0;
        this.b = new a(this);
    }

    public boolean dispatchPopulateAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
        return this.a.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    @Nullable
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view0) {
        AccessibilityNodeProvider accessibilityNodeProvider0 = this.a.getAccessibilityNodeProvider(view0);
        return accessibilityNodeProvider0 == null ? null : new AccessibilityNodeProviderCompat(accessibilityNodeProvider0);
    }

    public void onInitializeAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
        this.a.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = accessibilityNodeInfoCompat0.unwrap();
        this.a.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
    }

    public void onPopulateAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
        this.a.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    public boolean performAccessibilityAction(@NonNull View view0, int v, @Nullable Bundle bundle0) {
        boolean z;
        List list0 = (List)view0.getTag(id.tag_accessibility_actions);
        if(list0 == null) {
            list0 = Collections.emptyList();
        }
        for(int v1 = 0; true; ++v1) {
            z = false;
            if(v1 >= list0.size()) {
                break;
            }
            AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = (AccessibilityActionCompat)list0.get(v1);
            if(accessibilityNodeInfoCompat$AccessibilityActionCompat0.getId() == v) {
                z = accessibilityNodeInfoCompat$AccessibilityActionCompat0.perform(view0, bundle0);
                break;
            }
        }
        if(!z) {
            z = this.a.performAccessibilityAction(view0, v, bundle0);
        }
        if(!z && v == id.accessibility_action_clickable_span && bundle0 != null) {
            int v2 = bundle0.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray0 = (SparseArray)view0.getTag(id.tag_accessibility_clickable_spans);
            if(sparseArray0 != null) {
                WeakReference weakReference0 = (WeakReference)sparseArray0.get(v2);
                if(weakReference0 != null) {
                    ClickableSpan clickableSpan0 = (ClickableSpan)weakReference0.get();
                    if(clickableSpan0 != null) {
                        ClickableSpan[] arr_clickableSpan = AccessibilityNodeInfoCompat.getClickableSpans(view0.createAccessibilityNodeInfo().getText());
                        for(int v3 = 0; arr_clickableSpan != null && v3 < arr_clickableSpan.length; ++v3) {
                            if(clickableSpan0.equals(arr_clickableSpan[v3])) {
                                clickableSpan0.onClick(view0);
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public void sendAccessibilityEvent(@NonNull View view0, int v) {
        this.a.sendAccessibilityEvent(view0, v);
    }

    public void sendAccessibilityEventUnchecked(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
        this.a.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }
}

