package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class CircularPropagation extends VisibilityPropagation {
    public float b;

    public CircularPropagation() {
        this.b = 3.0f;
    }

    @Override  // androidx.transition.TransitionPropagation
    public long getStartDelay(ViewGroup viewGroup0, Transition transition0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        int v4;
        int v3;
        int v;
        if(transitionValues0 == null && transitionValues1 == null) {
            return 0L;
        }
        if(transitionValues1 == null || this.getViewVisibility(transitionValues0) == 0) {
            v = -1;
        }
        else {
            transitionValues0 = transitionValues1;
            v = 1;
        }
        int v1 = this.getViewX(transitionValues0);
        int v2 = this.getViewY(transitionValues0);
        Rect rect0 = transition0.getEpicenter();
        if(rect0 == null) {
            int[] arr_v = new int[2];
            viewGroup0.getLocationOnScreen(arr_v);
            int v5 = arr_v[0];
            int v6 = viewGroup0.getWidth();
            int v7 = Math.round(viewGroup0.getTranslationX() + ((float)(v6 / 2 + v5)));
            int v8 = arr_v[1];
            int v9 = viewGroup0.getHeight();
            v4 = Math.round(viewGroup0.getTranslationY() + ((float)(v9 / 2 + v8)));
            v3 = v7;
        }
        else {
            v3 = rect0.centerX();
            v4 = rect0.centerY();
        }
        float f = ((float)v3) - ((float)v1);
        float f1 = ((float)v4) - ((float)v2);
        float f2 = (float)viewGroup0.getWidth();
        float f3 = ((float)viewGroup0.getHeight()) - 0.0f;
        return (long)Math.round(((float)((transition0.getDuration() >= 0L ? transition0.getDuration() : 300L) * ((long)v))) / this.b * (((float)Math.sqrt(f1 * f1 + f * f)) / ((float)Math.sqrt(f3 * f3 + (f2 - 0.0f) * (f2 - 0.0f)))));
    }

    public void setPropagationSpeed(float f) {
        if(f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.b = f;
    }
}

