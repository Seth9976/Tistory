package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public final class a extends OnPageChangeCallback {
    public final ArrayList a;

    public a() {
        this.a = new ArrayList(3);
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrollStateChanged(int v) {
        try {
            for(Object object0: this.a) {
                ((OnPageChangeCallback)object0).onPageScrollStateChanged(v);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrolled(int v, float f, int v1) {
        try {
            for(Object object0: this.a) {
                ((OnPageChangeCallback)object0).onPageScrolled(v, f, v1);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageSelected(int v) {
        try {
            for(Object object0: this.a) {
                ((OnPageChangeCallback)object0).onPageSelected(v);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
        }
    }
}

