package e5;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

public final class a implements View.OnClickListener {
    public final PagerTabStrip a;

    public a(PagerTabStrip pagerTabStrip0) {
        this.a = pagerTabStrip0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ViewPager viewPager0 = this.a.a;
        viewPager0.setCurrentItem(viewPager0.getCurrentItem() - 1);
    }
}

