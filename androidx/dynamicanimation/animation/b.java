package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.appcompat.app.w0;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

public final class b implements Choreographer.FrameCallback {
    public final w0 a;

    public b(w0 w00) {
        this.a = w00;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        ArrayList arrayList0;
        ((a)this.a.a).getClass();
        long v1 = SystemClock.uptimeMillis();
        c c0 = ((a)this.a.a).a;
        c0.getClass();
        long v2 = SystemClock.uptimeMillis();
        for(int v3 = 0; true; ++v3) {
            arrayList0 = c0.b;
            if(v3 >= arrayList0.size()) {
                break;
            }
            AnimationHandler.AnimationFrameCallback animationHandler$AnimationFrameCallback0 = (AnimationHandler.AnimationFrameCallback)arrayList0.get(v3);
            if(animationHandler$AnimationFrameCallback0 != null) {
                SimpleArrayMap simpleArrayMap0 = c0.a;
                Long long0 = (Long)simpleArrayMap0.get(animationHandler$AnimationFrameCallback0);
                if(long0 == null) {
                    animationHandler$AnimationFrameCallback0.doAnimationFrame(v1);
                }
                else if(((long)long0) < v2) {
                    simpleArrayMap0.remove(animationHandler$AnimationFrameCallback0);
                    animationHandler$AnimationFrameCallback0.doAnimationFrame(v1);
                }
            }
        }
        if(c0.e) {
            for(int v4 = arrayList0.size() - 1; v4 >= 0; --v4) {
                if(arrayList0.get(v4) == null) {
                    arrayList0.remove(v4);
                }
            }
            c0.e = false;
        }
        if(arrayList0.size() > 0) {
            if(c0.d == null) {
                c0.d = new w0(c0.c);
            }
            ((Choreographer)c0.d.b).postFrameCallback(((b)c0.d.c));
        }
    }
}

