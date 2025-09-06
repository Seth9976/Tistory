package f5;

import androidx.viewpager2.adapter.b;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;

public final class e extends OnPageChangeCallback {
    public final b a;

    public e(b b0) {
        this.a = b0;
        super();
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrollStateChanged(int v) {
        this.a.b(false);
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageSelected(int v) {
        this.a.b(false);
    }
}

