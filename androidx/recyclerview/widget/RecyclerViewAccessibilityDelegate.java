package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.WeakHashMap;

public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public static class ItemDelegate extends AccessibilityDelegateCompat {
        public final RecyclerViewAccessibilityDelegate d;
        public final WeakHashMap e;

        public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0) {
            this.e = new WeakHashMap();
            this.d = recyclerViewAccessibilityDelegate0;
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            return accessibilityDelegateCompat0 == null ? super.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0) : accessibilityDelegateCompat0.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        @Nullable
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            return accessibilityDelegateCompat0 == null ? super.getAccessibilityNodeProvider(view0) : accessibilityDelegateCompat0.getAccessibilityNodeProvider(view0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
                return;
            }
            super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, @SuppressLint({"InvalidNullabilityOverride"}) @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0 = this.d;
            if(!recyclerViewAccessibilityDelegate0.d.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView0 = recyclerViewAccessibilityDelegate0.d;
                if(recyclerView0.getLayoutManager() != null) {
                    recyclerView0.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view0, accessibilityNodeInfoCompat0);
                    AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
                    if(accessibilityDelegateCompat0 != null) {
                        accessibilityDelegateCompat0.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
                return;
            }
            super.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(viewGroup0);
            return accessibilityDelegateCompat0 == null ? super.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0) : accessibilityDelegateCompat0.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, int v, @SuppressLint({"InvalidNullabilityOverride"}) @Nullable Bundle bundle0) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0 = this.d;
            if(!recyclerViewAccessibilityDelegate0.d.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView0 = recyclerViewAccessibilityDelegate0.d;
                if(recyclerView0.getLayoutManager() != null) {
                    AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
                    if(accessibilityDelegateCompat0 != null) {
                        return accessibilityDelegateCompat0.performAccessibilityAction(view0, v, bundle0) ? true : recyclerView0.getLayoutManager().performAccessibilityActionForItem(view0, v, bundle0);
                    }
                    return super.performAccessibilityAction(view0, v, bundle0) ? true : recyclerView0.getLayoutManager().performAccessibilityActionForItem(view0, v, bundle0);
                }
            }
            return super.performAccessibilityAction(view0, v, bundle0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEvent(@NonNull View view0, int v) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.sendAccessibilityEvent(view0, v);
                return;
            }
            super.sendAccessibilityEvent(view0, v);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEventUnchecked(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
                return;
            }
            super.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
        }
    }

    public final RecyclerView d;
    public final ItemDelegate e;

    public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView0) {
        this.d = recyclerView0;
        AccessibilityDelegateCompat accessibilityDelegateCompat0 = this.getItemDelegate();
        if(accessibilityDelegateCompat0 != null && accessibilityDelegateCompat0 instanceof ItemDelegate) {
            this.e = (ItemDelegate)accessibilityDelegateCompat0;
            return;
        }
        this.e = new ItemDelegate(this);
    }

    @NonNull
    public AccessibilityDelegateCompat getItemDelegate() {
        return this.e;
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, @SuppressLint({"InvalidNullabilityOverride"}) @NonNull AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
        if(view0 instanceof RecyclerView && !this.d.hasPendingAdapterUpdates() && ((RecyclerView)view0).getLayoutManager() != null) {
            ((RecyclerView)view0).getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent0);
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, @SuppressLint({"InvalidNullabilityOverride"}) @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
        RecyclerView recyclerView0 = this.d;
        if(!recyclerView0.hasPendingAdapterUpdates() && recyclerView0.getLayoutManager() != null) {
            recyclerView0.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat0);
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, int v, @SuppressLint({"InvalidNullabilityOverride"}) @Nullable Bundle bundle0) {
        if(super.performAccessibilityAction(view0, v, bundle0)) {
            return true;
        }
        return this.d.hasPendingAdapterUpdates() || this.d.getLayoutManager() == null ? false : this.d.getLayoutManager().performAccessibilityAction(v, bundle0);
    }
}

