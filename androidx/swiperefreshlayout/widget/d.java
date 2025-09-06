package androidx.swiperefreshlayout.widget;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public final class d {
    public final RectF a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;

    public d() {
        this.a = new RectF();
        Paint paint0 = new Paint();
        this.b = paint0;
        Paint paint1 = new Paint();
        this.c = paint1;
        Paint paint2 = new Paint();
        this.d = paint2;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = 0xFF;
        paint0.setStrokeCap(Paint.Cap.SQUARE);
        paint0.setAntiAlias(true);
        paint0.setStyle(Paint.Style.STROKE);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setAntiAlias(true);
        paint2.setColor(0);
    }

    public final void a(int v) {
        this.j = v;
        this.u = this.i[v];
    }
}

