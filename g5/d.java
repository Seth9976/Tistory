package g5;

import androidx.viewpager2.widget.ViewPager2;

public final class d extends g {
    public final int a;
    public final Object b;

    public d(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // g5.g
    public final void onChanged() {
        if(this.a != 0) {
            ((k)this.b).a();
            return;
        }
        ((ViewPager2)this.b).e = true;
        ((ViewPager2)this.b).l.l = true;
    }
}

