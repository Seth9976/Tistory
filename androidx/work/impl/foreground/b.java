package androidx.work.impl.foreground;

import com.google.android.gms.common.api.internal.zabq;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.navigation.NavigationBarItemView;
import g5.m;

public final class b implements Runnable {
    public final int a;
    public final int b;
    public final Object c;

    public b(int v, m m0) {
        this.a = 3;
        super();
        this.b = v;
        this.c = m0;
    }

    public b(Object object0, int v, int v1) {
        this.a = v1;
        this.c = object0;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        int v = this.b;
        Object object0 = this.c;
        switch(this.a) {
            case 0: {
                ((SystemForegroundService)object0).e.cancel(v);
                return;
            }
            case 1: {
                ((zabq)object0).g(v);
                return;
            }
            case 2: {
                ((MaterialCalendar)object0).H.smoothScrollToPosition(v);
                return;
            }
            case 3: {
                ((m)object0).smoothScrollToPosition(v);
                return;
            }
            default: {
                ((NavigationBarItemView)object0).g(v);
            }
        }
    }
}

