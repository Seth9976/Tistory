package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import kotlin.text.q;

public final class n implements TypeEvaluator {
    public final int a;
    public Object b;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override  // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object object0, Object object1) {
        if(this.a != 0) {
            int v = ((Rect)object0).left;
            int v1 = v + ((int)(((float)(((Rect)object1).left - v)) * f));
            int v2 = ((Rect)object0).top;
            int v3 = v2 + ((int)(((float)(((Rect)object1).top - v2)) * f));
            int v4 = ((Rect)object0).right;
            int v5 = v4 + ((int)(((float)(((Rect)object1).right - v4)) * f));
            int v6 = ((Rect)object0).bottom;
            int v7 = v6 + ((int)(((float)(((Rect)object1).bottom - v6)) * f));
            Rect rect0 = (Rect)this.b;
            if(rect0 == null) {
                return new Rect(v1, v3, v5, v7);
            }
            rect0.set(v1, v3, v5, v7);
            return rect0;
        }
        float[] arr_f = (float[])this.b;
        if(arr_f == null) {
            arr_f = new float[((float[])object0).length];
        }
        for(int v8 = 0; v8 < arr_f.length; ++v8) {
            float f1 = ((float[])object0)[v8];
            arr_f[v8] = q.a(((float[])object1)[v8], f1, f, f1);
        }
        return arr_f;
    }
}

