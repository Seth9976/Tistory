package g5;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class h extends LinearLayoutManager {
    public final ViewPager2 a;

    public h(ViewPager2 viewPager20, Context context0) {
        this.a = viewPager20;
        super(context0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(State recyclerView$State0, int[] arr_v) {
        ViewPager2 viewPager20 = this.a;
        int v = viewPager20.getOffscreenPageLimit();
        if(v == -1) {
            super.calculateExtraLayoutSpace(recyclerView$State0, arr_v);
            return;
        }
        int v1 = viewPager20.getPageSize() * v;
        arr_v[0] = v1;
        arr_v[1] = v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final void onInitializeAccessibilityNodeInfo(Recycler recyclerView$Recycler0, State recyclerView$State0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.onInitializeAccessibilityNodeInfo(recyclerView$Recycler0, recyclerView$State0, accessibilityNodeInfoCompat0);
        this.a.t.getClass();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(Recycler recyclerView$Recycler0, State recyclerView$State0, View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        ViewPager2 viewPager20 = this.a.t.d;
        int v = 0;
        int v1 = viewPager20.getOrientation() == 1 ? viewPager20.g.getPosition(view0) : 0;
        if(viewPager20.getOrientation() == 0) {
            v = viewPager20.g.getPosition(view0);
        }
        accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(v1, 1, v, 1, false, false));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final boolean performAccessibilityAction(Recycler recyclerView$Recycler0, State recyclerView$State0, int v, Bundle bundle0) {
        this.a.t.getClass();
        return super.performAccessibilityAction(recyclerView$Recycler0, recyclerView$State0, v, bundle0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView0, View view0, Rect rect0, boolean z, boolean z1) {
        return false;
    }
}

