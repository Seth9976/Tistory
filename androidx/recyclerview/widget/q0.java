package androidx.recyclerview.widget;

import android.view.View;
import r0.a;

public final class q0 {
    public OrientationHelper a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public q0() {
        this.d();
    }

    public final void a() {
        this.c = this.d ? this.a.getEndAfterPadding() : this.a.getStartAfterPadding();
    }

    public final void b(int v, View view0) {
        if(this.d) {
            int v1 = this.a.getDecoratedEnd(view0);
            this.c = this.a.getTotalSpaceChange() + v1;
        }
        else {
            this.c = this.a.getDecoratedStart(view0);
        }
        this.b = v;
    }

    public final void c(int v, View view0) {
        int v1 = this.a.getTotalSpaceChange();
        if(v1 >= 0) {
            this.b(v, view0);
            return;
        }
        this.b = v;
        if(this.d) {
            int v2 = this.a.getEndAfterPadding() - v1 - this.a.getDecoratedEnd(view0);
            this.c = this.a.getEndAfterPadding() - v2;
            if(v2 > 0) {
                int v3 = this.a.getDecoratedMeasurement(view0);
                int v4 = this.c - v3;
                int v5 = this.a.getStartAfterPadding();
                int v6 = v4 - (Math.min(this.a.getDecoratedStart(view0) - v5, 0) + v5);
                if(v6 < 0) {
                    this.c = Math.min(v2, -v6) + this.c;
                }
            }
        }
        else {
            int v7 = this.a.getDecoratedStart(view0);
            int v8 = v7 - this.a.getStartAfterPadding();
            this.c = v7;
            if(v8 > 0) {
                int v9 = this.a.getDecoratedMeasurement(view0);
                int v10 = this.a.getEndAfterPadding();
                int v11 = this.a.getDecoratedEnd(view0);
                int v12 = this.a.getEndAfterPadding() - Math.min(0, v10 - v1 - v11) - (v9 + v7);
                if(v12 < 0) {
                    this.c -= Math.min(v8, -v12);
                }
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = 0x80000000;
        this.d = false;
        this.e = false;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AnchorInfo{mPosition=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", mCoordinate=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", mLayoutFromEnd=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", mValid=");
        return a.p(stringBuilder0, this.e, '}');
    }
}

