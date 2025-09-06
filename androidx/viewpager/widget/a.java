package androidx.viewpager.widget;

import android.database.DataSetObserver;

public final class a extends DataSetObserver implements OnAdapterChangeListener, OnPageChangeListener {
    public int a;
    public final PagerTitleStrip b;

    public a(PagerTitleStrip pagerTitleStrip0) {
        this.b = pagerTitleStrip0;
        super();
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager0, PagerAdapter pagerAdapter0, PagerAdapter pagerAdapter1) {
        this.b.a(pagerAdapter0, pagerAdapter1);
    }

    @Override  // android.database.DataSetObserver
    public final void onChanged() {
        this.b.b(this.b.a.getCurrentItem(), this.b.a.getAdapter());
        this.b.c(this.b.a.getCurrentItem(), (this.b.f >= 0.0f ? this.b.f : 0.0f), true);
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public final void onPageScrollStateChanged(int v) {
        this.a = v;
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public final void onPageScrolled(int v, float f, int v1) {
        if(f > 0.5f) {
            ++v;
        }
        this.b.c(v, f, false);
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public final void onPageSelected(int v) {
        if(this.a == 0) {
            this.b.b(this.b.a.getCurrentItem(), this.b.a.getAdapter());
            this.b.c(this.b.a.getCurrentItem(), (this.b.f >= 0.0f ? this.b.f : 0.0f), true);
        }
    }
}

