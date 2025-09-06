package androidx.constraintlayout.core.motion;

import a5.b;
import wb.a;

public class CustomVariable {
    public final String a;
    public final int b;
    public int c;
    public float d;
    public String e;
    public boolean f;

    public CustomVariable(CustomVariable customVariable0) {
        this.a = customVariable0.a;
        this.b = customVariable0.b;
        this.c = customVariable0.c;
        this.d = customVariable0.d;
        this.e = customVariable0.e;
        this.f = customVariable0.f;
    }

    public CustomVariable(CustomVariable customVariable0, Object object0) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = customVariable0.a;
        this.b = customVariable0.b;
        this.setValue(object0);
    }

    public CustomVariable(String s, int v) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
    }

    public CustomVariable(String s, int v, float f) {
        this.c = 0x80000000;
        this.e = null;
        this.a = s;
        this.b = v;
        this.d = f;
    }

    public CustomVariable(String s, int v, int v1) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
        if(v == 901) {
            this.d = (float)v1;
            return;
        }
        this.c = v1;
    }

    public CustomVariable(String s, int v, Object object0) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
        this.setValue(object0);
    }

    public CustomVariable(String s, int v, String s1) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.a = s;
        this.b = v;
        this.e = s1;
    }

    public CustomVariable(String s, int v, boolean z) {
        this.c = 0x80000000;
        this.d = NaNf;
        this.e = null;
        this.a = s;
        this.b = v;
        this.f = z;
    }

    public static int a(int v) {
        int v1 = (v & ~(v >> 0x1F)) - 0xFF;
        return (v1 & v1 >> 0x1F) + 0xFF;
    }

    public void applyToWidget(MotionWidget motionWidget0) {
        String s = this.a;
        int v = this.b;
        switch(v) {
            case 903: {
                motionWidget0.setCustomAttribute(s, 903, this.e);
                return;
            }
            case 904: {
                motionWidget0.setCustomAttribute(s, 904, this.f);
                return;
            }
            case 901: 
            case 905: {
                motionWidget0.setCustomAttribute(s, v, this.d);
                return;
            }
            case 900: 
            case 902: 
            case 906: {
                motionWidget0.setCustomAttribute(s, v, this.c);
            }
        }
    }

    public static String colorString(int v) {
        String s = "00000000" + Integer.toHexString(v);
        return "#" + s.substring(s.length() - 8);
    }

    public CustomVariable copy() {
        return new CustomVariable(this);
    }

    public boolean diff(CustomVariable customVariable0) {
        if(customVariable0 != null) {
            int v = this.b;
            if(v == customVariable0.b) {
                switch(v) {
                    case 901: {
                        return this.d == customVariable0.d;
                    }
                    case 902: {
                        return this.c == customVariable0.c;
                    }
                    case 903: {
                        return this.c == customVariable0.c;
                    }
                    case 904: {
                        return this.f == customVariable0.f;
                    }
                    case 905: {
                        return this.d == customVariable0.d;
                    }
                    case 900: 
                    case 906: {
                        return this.c == customVariable0.c;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public boolean getBooleanValue() {
        return this.f;
    }

    public int getColorValue() {
        return this.c;
    }

    public float getFloatValue() {
        return this.d;
    }

    public int getIntegerValue() {
        return this.c;
    }

    public int getInterpolatedColor(float[] arr_f) {
        return CustomVariable.a(((int)(arr_f[3] * 255.0f))) << 24 | CustomVariable.a(((int)(((float)Math.pow(arr_f[0], 0.454545)) * 255.0f))) << 16 | CustomVariable.a(((int)(((float)Math.pow(arr_f[1], 0.454545)) * 255.0f))) << 8 | CustomVariable.a(((int)(((float)Math.pow(arr_f[2], 0.454545)) * 255.0f)));
    }

    public String getName() {
        return this.a;
    }

    public String getStringValue() {
        return this.e;
    }

    public int getType() {
        return this.b;
    }

    public float getValueToInterpolate() {
        switch(this.b) {
            case 900: {
                return (float)this.c;
            }
            case 901: {
                return this.d;
            }
            case 902: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 904: {
                return this.f ? 1.0f : 0.0f;
            }
            case 905: {
                return this.d;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void getValuesToInterpolate(float[] arr_f) {
        switch(this.b) {
            case 900: {
                arr_f[0] = (float)this.c;
                return;
            }
            case 901: {
                arr_f[0] = this.d;
                return;
            }
            case 902: {
                int v = this.c >> 24 & 0xFF;
                float f = (float)Math.pow(((float)(this.c >> 8 & 0xFF)) / 255.0f, 2.2);
                float f1 = (float)Math.pow(((float)(this.c & 0xFF)) / 255.0f, 2.2);
                arr_f[0] = (float)Math.pow(((float)(this.c >> 16 & 0xFF)) / 255.0f, 2.2);
                arr_f[1] = f;
                arr_f[2] = f1;
                arr_f[3] = ((float)v) / 255.0f;
                return;
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 904: {
                arr_f[0] = this.f ? 1.0f : 0.0f;
                return;
            }
            case 905: {
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
        return this.b != 903 && this.b != 904 && this.b != 906;
    }

    public int numberOfInterpolatedValues() {
        return this.b == 902 ? 4 : 1;
    }

    public static int rgbaTocColor(float f, float f1, float f2, float f3) {
        return CustomVariable.a(((int)(f * 255.0f))) << 16 | CustomVariable.a(((int)(f3 * 255.0f))) << 24 | CustomVariable.a(((int)(f1 * 255.0f))) << 8 | CustomVariable.a(((int)(f2 * 255.0f)));
    }

    public void setBooleanValue(boolean z) {
        this.f = z;
    }

    public void setFloatValue(float f) {
        this.d = f;
    }

    public void setIntValue(int v) {
        this.c = v;
    }

    public void setInterpolatedValue(MotionWidget motionWidget0, float[] arr_f) {
        boolean z = true;
        String s = this.a;
        int v = this.b;
        switch(v) {
            case 900: {
                motionWidget0.setCustomAttribute(s, 900, ((int)arr_f[0]));
                return;
            }
            case 902: {
                motionWidget0.setCustomAttribute(s, 902, CustomVariable.a(((int)(arr_f[3] * 255.0f))) << 24 | CustomVariable.a(((int)(((float)Math.pow(arr_f[0], 0.454545)) * 255.0f))) << 16 | CustomVariable.a(((int)(((float)Math.pow(arr_f[1], 0.454545)) * 255.0f))) << 8 | CustomVariable.a(((int)(((float)Math.pow(arr_f[2], 0.454545)) * 255.0f))));
                return;
            }
            case 904: {
                if(arr_f[0] <= 0.5f) {
                    z = false;
                }
                motionWidget0.setCustomAttribute(s, 904, z);
                return;
            }
            case 901: 
            case 905: {
                motionWidget0.setCustomAttribute(s, v, arr_f[0]);
                return;
            }
            case 903: 
            case 906: {
                throw new RuntimeException("unable to interpolate " + s);
            }
        }
    }

    public void setStringValue(String s) {
        this.e = s;
    }

    public void setValue(Object object0) {
        switch(this.b) {
            case 901: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 902: {
                this.c = (int)(((Integer)object0));
                return;
            }
            case 903: {
                this.e = (String)object0;
                return;
            }
            case 904: {
                this.f = ((Boolean)object0).booleanValue();
                return;
            }
            case 905: {
                this.d = (float)(((Float)object0));
                return;
            }
            case 900: 
            case 906: {
                this.c = (int)(((Integer)object0));
            }
        }
    }

    public void setValue(float[] arr_f) {
        boolean z = true;
        switch(this.b) {
            case 902: {
                this.c = (Math.round(arr_f[3] * 255.0f) & 0xFF) << 24 | (Math.round(((float)Math.pow(arr_f[0], 0.5)) * 255.0f) & 0xFF) << 16 | (Math.round(((float)Math.pow(arr_f[1], 0.5)) * 255.0f) & 0xFF) << 8 | Math.round(((float)Math.pow(arr_f[2], 0.5)) * 255.0f) & 0xFF;
                return;
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 904: {
                if(((double)arr_f[0]) <= 0.5) {
                    z = false;
                }
                this.f = z;
                return;
            }
            case 901: 
            case 905: {
                this.d = arr_f[0];
                return;
            }
            case 900: 
            case 906: {
                this.c = (int)arr_f[0];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = a.b(':', this.a, stringBuilder0);
        switch(this.b) {
            case 900: {
                StringBuilder stringBuilder1 = b.t(s);
                stringBuilder1.append(this.c);
                return stringBuilder1.toString();
            }
            case 901: {
                StringBuilder stringBuilder2 = b.t(s);
                stringBuilder2.append(this.d);
                return stringBuilder2.toString();
            }
            case 902: {
                StringBuilder stringBuilder3 = b.t(s);
                stringBuilder3.append(CustomVariable.colorString(this.c));
                return stringBuilder3.toString();
            }
            case 903: {
                StringBuilder stringBuilder4 = b.t(s);
                stringBuilder4.append(this.e);
                return stringBuilder4.toString();
            }
            case 904: {
                StringBuilder stringBuilder5 = b.t(s);
                stringBuilder5.append(Boolean.valueOf(this.f));
                return stringBuilder5.toString();
            }
            case 905: {
                StringBuilder stringBuilder6 = b.t(s);
                stringBuilder6.append(this.d);
                return stringBuilder6.toString();
            }
            default: {
                return s + "????";
            }
        }
    }
}

