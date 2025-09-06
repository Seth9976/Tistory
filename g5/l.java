package g5;

import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.viewpager2.widget.ViewPager2;

public final class l extends PagerSnapHelper {
    public final ViewPager2 f;

    public l(ViewPager2 viewPager20) {
        this.f = viewPager20;
        super();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.PagerSnapHelper
    public final View findSnapView(LayoutManager recyclerView$LayoutManager0) {
        return this.f.isFakeDragging() ? null : super.findSnapView(recyclerView$LayoutManager0);
    }
}

