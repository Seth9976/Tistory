package androidx.viewpager2.adapter;

import android.view.ViewParent;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle.State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import f5.e;
import f5.f;
import f5.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b {
    public e a;
    public f b;
    public g c;
    public ViewPager2 d;
    public long e;
    public final FragmentStateAdapter f;

    public b(FragmentStateAdapter fragmentStateAdapter0) {
        this.f = fragmentStateAdapter0;
        this.e = -1L;
    }

    public static ViewPager2 a(RecyclerView recyclerView0) {
        ViewParent viewParent0 = recyclerView0.getParent();
        if(!(viewParent0 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + viewParent0);
        }
        return (ViewPager2)viewParent0;
    }

    public final void b(boolean z) {
        FragmentStateAdapter fragmentStateAdapter0 = this.f;
        if(fragmentStateAdapter0.h.isStateSaved()) {
            return;
        }
        if(this.d.getScrollState() != 0) {
            return;
        }
        LongSparseArray longSparseArray0 = fragmentStateAdapter0.i;
        if(!longSparseArray0.isEmpty() && fragmentStateAdapter0.getItemCount() != 0) {
            int v = this.d.getCurrentItem();
            if(v >= fragmentStateAdapter0.getItemCount()) {
                return;
            }
            if(((long)v) == this.e && !z) {
                return;
            }
            Fragment fragment0 = (Fragment)longSparseArray0.get(((long)v));
            if(fragment0 != null && fragment0.isAdded()) {
                this.e = (long)v;
                FragmentTransaction fragmentTransaction0 = fragmentStateAdapter0.h.beginTransaction();
                ArrayList arrayList0 = new ArrayList();
                Fragment fragment1 = null;
                for(int v1 = 0; v1 < longSparseArray0.size(); ++v1) {
                    long v2 = longSparseArray0.keyAt(v1);
                    Fragment fragment2 = (Fragment)longSparseArray0.valueAt(v1);
                    if(fragment2.isAdded()) {
                        if(v2 == this.e) {
                            fragment1 = fragment2;
                        }
                        else {
                            fragmentTransaction0.setMaxLifecycle(fragment2, State.STARTED);
                            arrayList0.add(fragmentStateAdapter0.m.a(fragment2, State.STARTED));
                        }
                        fragment2.setMenuVisibility(v2 == this.e);
                    }
                }
                if(fragment1 != null) {
                    fragmentTransaction0.setMaxLifecycle(fragment1, State.RESUMED);
                    arrayList0.add(fragmentStateAdapter0.m.a(fragment1, State.RESUMED));
                }
                if(!fragmentTransaction0.isEmpty()) {
                    fragmentTransaction0.commitNow();
                    Collections.reverse(arrayList0);
                    for(Object object0: arrayList0) {
                        fragmentStateAdapter0.m.getClass();
                        a.b(((List)object0));
                    }
                }
            }
        }
    }
}

