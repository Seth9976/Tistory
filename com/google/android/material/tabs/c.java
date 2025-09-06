package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import java.lang.ref.WeakReference;

public final class c extends OnPageChangeCallback {
    public final WeakReference a;
    public int b;
    public int c;

    public c(TabLayout tabLayout0) {
        this.a = new WeakReference(tabLayout0);
        this.c = 0;
        this.b = 0;
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrollStateChanged(int v) {
        this.b = this.c;
        this.c = v;
        TabLayout tabLayout0 = (TabLayout)this.a.get();
        if(tabLayout0 != null) {
            tabLayout0.U = this.c;
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageScrolled(int v, float f, int v1) {
        Object object0 = this.a.get();
        if(((TabLayout)object0) != null) {
            ((TabLayout)object0).j(v, f, this.c != 2 || this.b == 1, this.c != 2 || this.b != 0, false);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageSelected(int v) {
        TabLayout tabLayout0 = (TabLayout)this.a.get();
        if(tabLayout0 != null && tabLayout0.getSelectedTabPosition() != v && v < tabLayout0.getTabCount()) {
            boolean z = this.c == 0 || this.c == 2 && this.b == 0;
            tabLayout0.selectTab(tabLayout0.getTabAt(v), z);
        }
    }
}

