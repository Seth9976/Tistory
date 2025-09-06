package androidx.appcompat.widget;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public final class y1 extends DataSetObserver {
    public final int a;
    public final Object b;

    public y1(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.database.DataSetObserver
    public final void onChanged() {
        switch(this.a) {
            case 0: {
                ListPopupWindow listPopupWindow0 = (ListPopupWindow)this.b;
                if(listPopupWindow0.isShowing()) {
                    listPopupWindow0.show();
                }
                return;
            }
            case 1: {
                ((ViewPager)this.b).c();
                return;
            }
            default: {
                ((TabLayout)this.b).g();
            }
        }
    }

    @Override  // android.database.DataSetObserver
    public final void onInvalidated() {
        switch(this.a) {
            case 0: {
                ((ListPopupWindow)this.b).dismiss();
                return;
            }
            case 1: {
                ((ViewPager)this.b).c();
                return;
            }
            default: {
                ((TabLayout)this.b).g();
            }
        }
    }
}

