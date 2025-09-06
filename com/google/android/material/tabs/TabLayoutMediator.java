package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.viewpager2.widget.ViewPager2;
import e8.e;

public final class TabLayoutMediator {
    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull Tab arg1, int arg2);
    }

    public final TabLayout a;
    public final ViewPager2 b;
    public final boolean c;
    public final boolean d;
    public final TabConfigurationStrategy e;
    public Adapter f;
    public boolean g;
    public c h;
    public d i;
    public e j;

    public TabLayoutMediator(@NonNull TabLayout tabLayout0, @NonNull ViewPager2 viewPager20, @NonNull TabConfigurationStrategy tabLayoutMediator$TabConfigurationStrategy0) {
        this(tabLayout0, viewPager20, true, tabLayoutMediator$TabConfigurationStrategy0);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout0, @NonNull ViewPager2 viewPager20, boolean z, @NonNull TabConfigurationStrategy tabLayoutMediator$TabConfigurationStrategy0) {
        this(tabLayout0, viewPager20, z, true, tabLayoutMediator$TabConfigurationStrategy0);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout0, @NonNull ViewPager2 viewPager20, boolean z, boolean z1, @NonNull TabConfigurationStrategy tabLayoutMediator$TabConfigurationStrategy0) {
        this.a = tabLayout0;
        this.b = viewPager20;
        this.c = z;
        this.d = z1;
        this.e = tabLayoutMediator$TabConfigurationStrategy0;
    }

    public final void a() {
        TabLayout tabLayout0 = this.a;
        tabLayout0.removeAllTabs();
        Adapter recyclerView$Adapter0 = this.f;
        if(recyclerView$Adapter0 != null) {
            int v = recyclerView$Adapter0.getItemCount();
            for(int v1 = 0; v1 < v; ++v1) {
                Tab tabLayout$Tab0 = tabLayout0.newTab();
                this.e.onConfigureTab(tabLayout$Tab0, v1);
                tabLayout0.addTab(tabLayout$Tab0, false);
            }
            if(v > 0) {
                int v2 = tabLayout0.getTabCount();
                int v3 = Math.min(this.b.getCurrentItem(), v2 - 1);
                if(v3 != tabLayout0.getSelectedTabPosition()) {
                    tabLayout0.selectTab(tabLayout0.getTabAt(v3));
                }
            }
        }
    }

    public void attach() {
        if(this.g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager20 = this.b;
        Adapter recyclerView$Adapter0 = viewPager20.getAdapter();
        this.f = recyclerView$Adapter0;
        if(recyclerView$Adapter0 == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.g = true;
        TabLayout tabLayout0 = this.a;
        c c0 = new c(tabLayout0);
        this.h = c0;
        viewPager20.registerOnPageChangeCallback(c0);
        d d0 = new d(viewPager20, this.d);
        this.i = d0;
        tabLayout0.addOnTabSelectedListener(d0);
        if(this.c) {
            e e0 = new e(this);
            this.j = e0;
            this.f.registerAdapterDataObserver(e0);
        }
        this.a();
        tabLayout0.setScrollPosition(viewPager20.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        if(this.c) {
            Adapter recyclerView$Adapter0 = this.f;
            if(recyclerView$Adapter0 != null) {
                recyclerView$Adapter0.unregisterAdapterDataObserver(this.j);
                this.j = null;
            }
        }
        this.a.removeOnTabSelectedListener(this.i);
        this.b.unregisterOnPageChangeCallback(this.h);
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = false;
    }

    public boolean isAttached() {
        return this.g;
    }
}

