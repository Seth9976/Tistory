package androidx.transition;

import android.view.View;

public abstract class s0 extends v0 {
    public static boolean c = true;

    public float b(View view0) {
        if(s0.c) {
            try {
                return view0.getTransitionAlpha();
            }
            catch(NoSuchMethodError unused_ex) {
                s0.c = false;
            }
        }
        return view0.getAlpha();
    }

    public void c(View view0, float f) {
        if(s0.c) {
            try {
                view0.setTransitionAlpha(f);
                return;
            }
            catch(NoSuchMethodError unused_ex) {
                s0.c = false;
            }
        }
        view0.setAlpha(f);
    }
}

