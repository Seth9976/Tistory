package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2;

public final class d implements OnTabSelectedListener {
    public final ViewPager2 a;
    public final boolean b;

    public d(ViewPager2 viewPager20, boolean z) {
        this.a = viewPager20;
        this.b = z;
    }

    @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
    public final void onTabReselected(Tab tabLayout$Tab0) {
    }

    @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
    public final void onTabSelected(Tab tabLayout$Tab0) {
        this.a.setCurrentItem(tabLayout$Tab0.getPosition(), this.b);
    }

    @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
    public final void onTabUnselected(Tab tabLayout$Tab0) {
    }
}

