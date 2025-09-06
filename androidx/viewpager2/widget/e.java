package androidx.viewpager2.widget;

public final class e extends OnPageChangeCallback {
    public final ViewPager2 a;

    public e(ViewPager2 viewPager20) {
        this.a = viewPager20;
        super();
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public final void onPageSelected(int v) {
        ViewPager2 viewPager20 = this.a;
        viewPager20.clearFocus();
        if(viewPager20.hasFocus()) {
            viewPager20.j.requestFocus(2);
        }
    }
}

