package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

public class InterpolateOnScrollPositionChangeHelper {
    public final View a;
    public MaterialShapeDrawable b;
    public ScrollView c;
    public final int[] d;
    public final int[] e;
    public final a f;

    public InterpolateOnScrollPositionChangeHelper(View view0, MaterialShapeDrawable materialShapeDrawable0, ScrollView scrollView0) {
        this.d = new int[2];
        this.e = new int[2];
        this.f = new a(this);
        this.a = view0;
        this.b = materialShapeDrawable0;
        this.c = scrollView0;
    }

    public void setContainingScrollView(ScrollView scrollView0) {
        this.c = scrollView0;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable0) {
        this.b = materialShapeDrawable0;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.addOnScrollChangedListener(this.f);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.removeOnScrollChangedListener(this.f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView0 = this.c;
        if(scrollView0 == null) {
            return;
        }
        if(scrollView0.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.c.getLocationInWindow(this.d);
        this.c.getChildAt(0).getLocationInWindow(this.e);
        View view0 = this.a;
        int v = view0.getTop() - this.d[1] + this.e[1];
        int v1 = view0.getHeight();
        int v2 = this.c.getHeight();
        if(v < 0) {
            this.b.setInterpolation(Math.max(0.0f, Math.min(1.0f, ((float)v) / ((float)v1) + 1.0f)));
            view0.invalidate();
            return;
        }
        int v3 = v + v1;
        if(v3 > v2) {
            this.b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((float)(v3 - v2)) / ((float)v1))));
            view0.invalidate();
            return;
        }
        if(this.b.getInterpolation() != 1.0f) {
            this.b.setInterpolation(1.0f);
            view0.invalidate();
        }
    }
}

