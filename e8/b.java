package e8;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public final class b implements OnAdapterChangeListener {
    public boolean a;
    public final TabLayout b;

    public b(TabLayout tabLayout0) {
        this.b = tabLayout0;
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager0, PagerAdapter pagerAdapter0, PagerAdapter pagerAdapter1) {
        TabLayout tabLayout0 = this.b;
        if(tabLayout0.O == viewPager0) {
            tabLayout0.i(pagerAdapter1, this.a);
        }
    }
}

