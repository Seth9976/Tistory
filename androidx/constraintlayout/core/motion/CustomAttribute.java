package androidx.constraintlayout.core.motion;

public class CustomAttribute {
    public static enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE;

    }

    public final String a;
    public final AttributeType b;
    public int c;
    public float d;
    public boolean e;
    public int f;

    public CustomAttribute(CustomAttribute customAttribute0, Object object0) {
        this.a = customAttribute0.a;
        this.b = customAttribute0.b;
        this.setValue(object0);
    }

    public CustomAttribute(String s, AttributeType customAttribute$AttributeType0) {
        this.a = s;
        this.b = customAttribute$AttributeType0;
    }

    public CustomAttribute(String s, AttributeType customAttribute$AttributeType0, Object object0, boolean z) {
        this.a = s;
        this.b = customAttribute$AttributeType0;
        this.setValue(object0);
    }

    public boolean diff(CustomAttribute customAttribute0) {
        if(customAttribute0 != null) {
            AttributeType customAttribute$AttributeType0 = this.b;
            if(customAttribute$AttributeType0 == customAttribute0.b) {
                switch(a.a[customAttribute$AttributeType0.ordinal()]) {
                    case 2: {
                        return this.e == customAttribute0.e;
                    }
                    case 3: {
                        return this.c == customAttribute0.c;
                    }
                    case 4: 
                    case 5: {
                        return this.f == customAttribute0.f;
                    }
                    case 1: 
                    case 6: {
                        return this.c == customAttribute0.c;
                    }
                    case 7: {
                        return this.d == customAttribute0.d;
                    }
                    case 8: {
                        return this.d == customAttribute0.d;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public AttributeType getType() {
        return this.b;
    }

    public float getValueToInterpolate() {
        switch(a.a[this.b.ordinal()]) {
            case 2: {
                return this.e ? 1.0f : 0.0f;
            }
            case 3: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 4: 
            case 5: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 6: {
                return (float)this.c;
            }
            case 7: {
                return this.d;
            }
            case 8: {
                return this.d;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void getValuesToInterpolate(float[] arr_f) {
        switch(a.a[this.b.ordinal()]) {
            case 2: {
                arr_f[0] = this.e ? 1.0f : 0.0f;
                return;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 4: 
            case 5: {
                int v = this.f >> 24 & 0xFF;
                float f = (float)Math.pow(((float)(this.f >> 8 & 0xFF)) / 255.0f, 2.2);
                float f1 = (float)Math.pow(((float)(this.f & 0xFF)) / 255.0f, 2.2);
                arr_f[0] = (float)Math.pow(((float)(this.f >> 16 & 0xFF)) / 255.0f, 2.2);
                arr_f[1] = f;
                arr_f[2] = f1;
                arr_f[3] = ((float)v) / 255.0f;
                return;
            }
            case 6: {
                arr_f[0] = (float)this.c;
                return;
            }
            case 7: {
                arr_f[0] = this.d;
                return;
            }
            case 8: {
                arr_f[0] = this.d;
            }
        }
    }

    public static int hsvToRgb(float f, float f1, float f2) {
        float f3 = f * 6.0f - ((float)(((int)(f * 6.0f))));
        int v = (int)((1.0f - f1) * (f2 * 255.0f) + 0.5f);
        int v1 = (int)((1.0f - f3 * f1) * (f2 * 255.0f) + 0.5f);
        int v2 = (int)((1.0f - (1.0f - f3) * f1) * (f2 * 255.0f) + 0.5f);
        int v3 = (int)(f2 * 255.0f + 0.5f);
        switch(((int)(f * 6.0f))) {
            case 0: {
                return (v3 << 16) + (v2 << 8) + v | 0xFF000000;
            }
            case 1: {
                return (v1 << 16) + (v3 << 8) + v | 0xFF000000;
            }
            case 2: {
                return (v << 16) + (v3 << 8) + v2 | 0xFF000000;
            }
            case 3: {
                return (v << 16) + (v1 << 8) + v3 | 0xFF000000;
            }
            case 4: {
                return (v2 << 16) + (v << 8) + v3 | 0xFF000000;
            }
            case 5: {
                return (v3 << 16) + (v << 8) + v1 | 0xFF000000;
            }
            default: {
                return 0;
            }
        }
    }

    public boolean isContinuous() {
        switch(a.a[this.b.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public int numberOfInterpolatedValues() {
        switch(a.a[this.b.ordinal()]) {
            case 4: 
            case 5: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }

    public void setColorValue(int v) {
        this.f = v;
    }

    public void setFloatValue(float f) {
        this.d = f;
    }

    public void setIntValue(int v) {
        this.c = v;
    }

    public void setStringValue(String s) {
    }

    public void setValue(Object object0) {
        switch(a.a[this.b.ordinal()]) {
            case 2: {
                this.e = ((Boolean)object0).booleanValue();
                return;
            }
            case 3: {
                String s = (String)object0;
                return;
            }
            case 4: 
            case 5: {
                this.f = (int)(((Integer)object0));
                return;
            }
            case 1: 
            case 6: {
                this.c = (int)(((Integer)object0));
                return;
            }
            case 7: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 8: {
                this.d = (float)(((Float)object0));
            }
        }
    }

    public void setValue(float[] arr_f) {
        boolean z = true;
        switch(a.a[this.b.ordinal()]) {
            case 2: {
                if(((double)arr_f[0]) <= 0.5) {
                    z = false;
                }
                this.e = z;
                return;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 4: 
            case 5: {
                int v = CustomAttribute.hsvToRgb(arr_f[0], arr_f[1], arr_f[2]);
                this.f = v;
                int v1 = (int)(arr_f[3] * 255.0f);
                int v2 = (v1 & ~(v1 >> 0x1F)) - 0xFF;
                this.f = (v2 & v2 >> 0x1F) + 0xFF << 24 | v & 0xFFFFFF;
                return;
            }
            case 1: 
            case 6: {
                this.c = (int)arr_f[0];
                return;
            }
            case 7: {
                this.d = arr_f[0];
                return;
            }
            case 8: {
                this.d = arr_f[0];
            }
        }
    }
}

