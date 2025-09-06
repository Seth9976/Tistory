package com.google.android.material.transition;

import android.graphics.RectF;

public final class a implements FadeModeEvaluator, FitModeEvaluator {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.material.transition.FitModeEvaluator
    public void applyMask(RectF rectF0, float f, g g0) {
        if(this.a != 4) {
            float f1 = Math.abs(g0.e - g0.c) / 2.0f * f;
            rectF0.left += f1;
            rectF0.right -= f1;
            return;
        }
        rectF0.bottom -= Math.abs(g0.f - g0.d) * f;
    }

    @Override  // com.google.android.material.transition.FadeModeEvaluator
    public c evaluate(float f, float f1, float f2, float f3) {
        switch(this.a) {
            case 0: {
                return new c(0xFF, p.e(0, f1, f2, 0xFF, f), true);
            }
            case 1: {
                return new c(p.e(0xFF, f1, f2, 0, f), 0xFF, false);
            }
            case 2: {
                return new c(p.e(0xFF, f1, f2, 0, f), p.e(0, f1, f2, 0xFF, f), false);
            }
            default: {
                float f4 = (f2 - f1) * f3 + f1;
                return new c(p.e(0xFF, f1, f4, 0, f), p.e(0, f4, f2, 0xFF, f), false);
            }
        }
    }

    @Override  // com.google.android.material.transition.FitModeEvaluator
    public g evaluate(float f, float f1, float f2, float f3, float f4, float f5, float f6) {
        if(this.a != 4) {
            float f7 = p.d(f4, f6, f1, f2, f, true);
            return new g(f7 / f4, f7 / f6, f3 * (f7 / f4), f7, f5 * (f7 / f6), f7);
        }
        float f8 = p.d(f3, f5, f1, f2, f, true);
        return new g(f8 / f3, f8 / f5, f8, f4 * (f8 / f3), f8, f6 * (f8 / f5));
    }

    @Override  // com.google.android.material.transition.FitModeEvaluator
    public boolean shouldMaskStartBounds(g g0) {
        return this.a == 4 ? g0.d > g0.f : g0.c > g0.e;
    }
}

