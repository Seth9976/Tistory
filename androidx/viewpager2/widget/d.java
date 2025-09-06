package androidx.viewpager2.widget;

public final class d extends OnPageChangeCallback {
    public final ViewPager2 a;

    public d(ViewPager2 viewPager20) {
        this.a = viewPager20;
        super();
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrollStateChanged(int v) {
        if(v == 0) {
            this.a.d();
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageSelected(int v) {
        ViewPager2 viewPager20 = this.a;
        if(viewPager20.d != v) {
            viewPager20.d = v;
            viewPager20.t.a();
        }
    }
}

