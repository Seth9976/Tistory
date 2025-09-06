package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

public class SidePropagation extends VisibilityPropagation {
    public float b;
    public int c;

    public SidePropagation() {
        this.b = 3.0f;
        this.c = 80;
    }

    @Override  // androidx.transition.TransitionPropagation
    public long getStartDelay(ViewGroup viewGroup0, Transition transition0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        int v11;
        int v10;
        int v9;
        int v;
        if(transitionValues0 == null && transitionValues1 == null) {
            return 0L;
        }
        Rect rect0 = transition0.getEpicenter();
        if(transitionValues1 == null || this.getViewVisibility(transitionValues0) == 0) {
            v = -1;
        }
        else {
            transitionValues0 = transitionValues1;
            v = 1;
        }
        int v1 = this.getViewX(transitionValues0);
        int v2 = this.getViewY(transitionValues0);
        int[] arr_v = new int[2];
        viewGroup0.getLocationOnScreen(arr_v);
        int v3 = arr_v[0];
        int v4 = Math.round(viewGroup0.getTranslationX()) + v3;
        int v5 = arr_v[1];
        int v6 = Math.round(viewGroup0.getTranslationY()) + v5;
        int v7 = viewGroup0.getWidth() + v4;
        int v8 = viewGroup0.getHeight() + v6;
        if(rect0 == null) {
            v9 = (v4 + v7) / 2;
            v10 = (v6 + v8) / 2;
        }
        else {
            v9 = rect0.centerX();
            v10 = rect0.centerY();
        }
        switch(this.c) {
            case 3: {
                v11 = Math.abs(v10 - v2) + (v7 - v1);
                break;
            }
            case 5: {
                v11 = Math.abs(v10 - v2) + (v1 - v4);
                break;
            }
            case 0x30: {
                v11 = Math.abs(v9 - v1) + (v8 - v2);
                break;
            }
            case 80: {
                v11 = v2 - v6 + Math.abs(v9 - v1);
                break;
            }
            case 0x800005: {
                v11 = ViewCompat.getLayoutDirection(viewGroup0) == 1 ? Math.abs(v10 - v2) + (v7 - v1) : Math.abs(v10 - v2) + (v1 - v4);
                break;
            }
            default: {
                v11 = 0;
            }
        }
        int v12 = this.c == 3 || (this.c == 5 || this.c == 0x800003 || this.c == 0x800005) ? viewGroup0.getWidth() : viewGroup0.getHeight();
        return (long)Math.round(((float)((transition0.getDuration() >= 0L ? transition0.getDuration() : 300L) * ((long)v))) / this.b * (((float)v11) / ((float)v12)));
    }

    public void setPropagationSpeed(float f) {
        if(f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.b = f;
    }

    public void setSide(int v) {
        this.c = v;
    }
}

