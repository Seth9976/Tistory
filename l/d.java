package l;

import android.animation.TimeInterpolator;

public final class d implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int v = (int)(f * ((float)this.c) + 0.5f);
        int v1 = this.b;
        int[] arr_v = this.a;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_v[v2];
            if(v < v3) {
                break;
            }
            v -= v3;
        }
        return v2 >= v1 ? ((float)v2) / ((float)v1) + 0.0f : ((float)v2) / ((float)v1) + ((float)v) / ((float)this.c);
    }
}

