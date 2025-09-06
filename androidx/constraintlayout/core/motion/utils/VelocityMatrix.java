package androidx.constraintlayout.core.motion.utils;

public class VelocityMatrix {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public void applyTransform(float f, float f1, int v, int v1, float[] arr_f) {
        float f2 = (f - 0.5f) * 2.0f;
        float f3 = (f1 - 0.5f) * 2.0f;
        float f4 = this.a * f2 + (arr_f[0] + this.c);
        float f5 = (float)Math.toRadians(this.e);
        double f6 = (double)(((float)Math.toRadians(this.f)));
        double f7 = (double)(((float)v1) * f3);
        float f8 = f5 * ((float)(Math.cos(f6) * ((double)(((float)v) * f2)) - Math.sin(f6) * f7)) + (this.b * f3 + (arr_f[1] + this.d));
        arr_f[0] = ((float)(Math.sin(f6) * ((double)(((float)(-v)) * f2)) - Math.cos(f6) * f7)) * f5 + f4;
        arr_f[1] = f8;
    }

    public void clear() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator0, float f) {
        if(keyCycleOscillator0 != null) {
            this.e = keyCycleOscillator0.getSlope(f);
        }
    }

    public void setRotationVelocity(SplineSet splineSet0, float f) {
        if(splineSet0 != null) {
            this.e = splineSet0.getSlope(f);
            this.f = splineSet0.get(f);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator0, KeyCycleOscillator keyCycleOscillator1, float f) {
        if(keyCycleOscillator0 != null) {
            this.a = keyCycleOscillator0.getSlope(f);
        }
        if(keyCycleOscillator1 != null) {
            this.b = keyCycleOscillator1.getSlope(f);
        }
    }

    public void setScaleVelocity(SplineSet splineSet0, SplineSet splineSet1, float f) {
        if(splineSet0 != null) {
            this.a = splineSet0.getSlope(f);
        }
        if(splineSet1 != null) {
            this.b = splineSet1.getSlope(f);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator0, KeyCycleOscillator keyCycleOscillator1, float f) {
        if(keyCycleOscillator0 != null) {
            this.c = keyCycleOscillator0.getSlope(f);
        }
        if(keyCycleOscillator1 != null) {
            this.d = keyCycleOscillator1.getSlope(f);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet0, SplineSet splineSet1, float f) {
        if(splineSet0 != null) {
            this.c = splineSet0.getSlope(f);
        }
        if(splineSet1 != null) {
            this.d = splineSet1.getSlope(f);
        }
    }
}

