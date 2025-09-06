package com.google.android.material.transition.platform;

import android.graphics.RectF;

public final class a implements FadeModeEvaluator, FitModeEvaluator {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.material.transition.platform.FitModeEvaluator
    public void applyMask(RectF rectF0, float f, d d0) {
        if(this.a != 4) {
            float f1 = Math.abs(d0.e - d0.c) / 2.0f * f;
            rectF0.left += f1;
            rectF0.right -= f1;
            return;
        }
        rectF0.bottom -= Math.abs(d0.f - d0.d) * f;
    }

    @Override  // com.google.android.material.transition.platform.FadeModeEvaluator
    public c evaluate(float f, float f1, float f2, float f3) {
        switch(this.a) {
            case 0: {
                return new c(0xFF, l.e(0, f1, f2, 0xFF, f), true);
            }
            case 1: {
                return new c(l.e(0xFF, f1, f2, 0, f), 0xFF, false);
            }
            case 2: {
                return new c(l.e(0xFF, f1, f2, 0, f), l.e(0, f1, f2, 0xFF, f), false);
            }
            default: {
                float f4 = (f2 - f1) * f3 + f1;
                return new c(l.e(0xFF, f1, f4, 0, f), l.e(0, f4, f2, 0xFF, f), false);
            }
        }
    }

    @Override  // com.google.android.material.transition.platform.FitModeEvaluator
    public d evaluate(float f, float f1, float f2, float f3, float f4, float f5, float f6) {
        if(this.a != 4) {
            float f7 = l.d(f4, f6, f1, f2, f, true);
            return new d(f7 / f4, f7 / f6, f3 * (f7 / f4), f7, f5 * (f7 / f6), f7);
        }
        float f8 = l.d(f3, f5, f1, f2, f, true);
        return new d(f8 / f3, f8 / f5, f8, f4 * (f8 / f3), f8, f6 * (f8 / f5));
    }

    @Override  // com.google.android.material.transition.platform.FitModeEvaluator
    public boolean shouldMaskStartBounds(d d0) {
        return this.a == 4 ? d0.d > d0.f : d0.c > d0.e;
    }
}

