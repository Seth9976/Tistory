package androidx.viewpager2.widget;

import android.view.View;
import g5.h;
import kotlin.text.q;

public final class b extends OnPageChangeCallback {
    public final h a;
    public PageTransformer b;

    public b(h h0) {
        this.a = h0;
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrollStateChanged(int v) {
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrolled(int v, float f, int v1) {
        if(this.b == null) {
            return;
        }
        for(int v2 = 0; true; ++v2) {
            h h0 = this.a;
            if(v2 >= h0.getChildCount()) {
                break;
            }
            View view0 = h0.getChildAt(v2);
            if(view0 == null) {
                throw new IllegalStateException(q.o("LayoutManager returned a null child at pos ", v2, "/", h0.getChildCount(), " while transforming pages"));
            }
            int v3 = h0.getPosition(view0);
            this.b.transformPage(view0, ((float)(v3 - v)) + -f);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageSelected(int v) {
    }
}

