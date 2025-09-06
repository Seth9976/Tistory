package u;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.EdgeEffectCompat;
import androidx.compose.ui.unit.IntSize;

public final class o1 {
    public final Context a;
    public final int b;
    public long c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public o1(Context context0, int v) {
        this.a = context0;
        this.b = v;
        this.c = 0L;
    }

    public final EdgeEffect a() {
        EdgeEffect edgeEffect0 = EdgeEffectCompat.INSTANCE.create(this.a);
        edgeEffect0.setColor(this.b);
        if(!IntSize.equals-impl0(this.c, 0L)) {
            edgeEffect0.setSize(IntSize.getWidth-impl(this.c), IntSize.getHeight-impl(this.c));
        }
        return edgeEffect0;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect0 = this.e;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.a();
            this.e = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect0 = this.f;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.a();
            this.f = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect0 = this.g;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.a();
            this.g = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect0 = this.d;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.a();
            this.d = edgeEffect0;
        }
        return edgeEffect0;
    }

    public static boolean f(EdgeEffect edgeEffect0) {
        return edgeEffect0 == null ? false : !edgeEffect0.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect0) {
        int v = 0;
        if(edgeEffect0 == null) {
            return false;
        }
        if(Float.compare(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect0), 0.0f) == 0) {
            v = 1;
        }
        return v ^ 1;
    }
}

