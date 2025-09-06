package androidx.constraintlayout.widget;

import a5.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {
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

    public final boolean a;
    public final String b;
    public final AttributeType c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public ConstraintAttribute(ConstraintAttribute constraintAttribute0, Object object0) {
        this.a = false;
        this.b = constraintAttribute0.b;
        this.c = constraintAttribute0.c;
        this.setValue(object0);
    }

    public ConstraintAttribute(String s, AttributeType constraintAttribute$AttributeType0) {
        this.a = false;
        this.b = s;
        this.c = constraintAttribute$AttributeType0;
    }

    public ConstraintAttribute(String s, AttributeType constraintAttribute$AttributeType0, Object object0, boolean z) {
        this.b = s;
        this.c = constraintAttribute$AttributeType0;
        this.a = z;
        this.setValue(object0);
    }

    public void applyCustom(View view0) {
        Class class0 = view0.getClass();
        String s = this.b;
        String s1 = this.a ? s : "set" + s;
        try {
            switch(a.a[this.c.ordinal()]) {
                case 2: {
                    class0.getMethod(s1, Boolean.TYPE).invoke(view0, Boolean.valueOf(this.g));
                    return;
                }
                case 3: {
                    class0.getMethod(s1, CharSequence.class).invoke(view0, this.f);
                    return;
                }
                case 4: {
                    class0.getMethod(s1, Integer.TYPE).invoke(view0, this.h);
                    return;
                }
                case 5: {
                    Method method0 = class0.getMethod(s1, Drawable.class);
                    ColorDrawable colorDrawable0 = new ColorDrawable();
                    colorDrawable0.setColor(this.h);
                    method0.invoke(view0, colorDrawable0);
                    return;
                }
                case 1: 
                case 6: {
                    class0.getMethod(s1, Integer.TYPE).invoke(view0, this.d);
                    return;
                }
                case 7: {
                    class0.getMethod(s1, Float.TYPE).invoke(view0, this.e);
                    return;
                }
                case 8: {
                    class0.getMethod(s1, Float.TYPE).invoke(view0, this.e);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch(NoSuchMethodException noSuchMethodException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            goto label_31;
        }
        catch(InvocationTargetException invocationTargetException0) {
            goto label_36;
        }
        Log.e("TransitionLayout", noSuchMethodException0.getMessage());
        Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName());
        Log.e("TransitionLayout", class0.getName() + " must have a method " + s1);
        return;
    label_31:
        StringBuilder stringBuilder0 = b.v(" Custom Attribute \"", s, "\" not found on ");
        stringBuilder0.append(class0.getName());
        Log.e("TransitionLayout", stringBuilder0.toString());
        illegalAccessException0.printStackTrace();
        return;
    label_36:
        StringBuilder stringBuilder1 = b.v(" Custom Attribute \"", s, "\" not found on ");
        stringBuilder1.append(class0.getName());
        Log.e("TransitionLayout", stringBuilder1.toString());
        invocationTargetException0.printStackTrace();
    }

    public boolean diff(ConstraintAttribute constraintAttribute0) {
        if(constraintAttribute0 != null) {
            AttributeType constraintAttribute$AttributeType0 = this.c;
            if(constraintAttribute$AttributeType0 == constraintAttribute0.c) {
                switch(a.a[constraintAttribute$AttributeType0.ordinal()]) {
                    case 2: {
                        return this.g == constraintAttribute0.g;
                    }
                    case 3: {
                        return this.d == constraintAttribute0.d;
                    }
                    case 4: 
                    case 5: {
                        return this.h == constraintAttribute0.h;
                    }
                    case 1: 
                    case 6: {
                        return this.d == constraintAttribute0.d;
                    }
                    case 7: {
                        return this.e == constraintAttribute0.e;
                    }
                    case 8: {
                        return this.e == constraintAttribute0.e;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static HashMap extractAttributes(HashMap hashMap0, View view0) {
        HashMap hashMap1 = new HashMap();
        Class class0 = view0.getClass();
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap0.get(s);
            try {
                if(s.equals("BackgroundColor")) {
                    hashMap1.put(s, new ConstraintAttribute(constraintAttribute0, ((ColorDrawable)view0.getBackground()).getColor()));
                    continue;
                }
                hashMap1.put(s, new ConstraintAttribute(constraintAttribute0, class0.getMethod("getMap" + s, null).invoke(view0, null)));
                continue;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                illegalAccessException0.printStackTrace();
                continue;
            }
            catch(InvocationTargetException invocationTargetException0) {
                goto label_21;
            }
            noSuchMethodException0.printStackTrace();
            continue;
        label_21:
            invocationTargetException0.printStackTrace();
        }
        return hashMap1;
    }

    public int getColorValue() {
        return this.h;
    }

    public float getFloatValue() {
        return this.e;
    }

    public int getIntegerValue() {
        return this.d;
    }

    public String getName() {
        return this.b;
    }

    public String getStringValue() {
        return this.f;
    }

    public AttributeType getType() {
        return this.c;
    }

    public float getValueToInterpolate() {
        switch(a.a[this.c.ordinal()]) {
            case 2: {
                return this.g ? 1.0f : 0.0f;
            }
            case 3: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 4: 
            case 5: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 6: {
                return (float)this.d;
            }
            case 7: {
                return this.e;
            }
            case 8: {
                return this.e;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void getValuesToInterpolate(float[] arr_f) {
        switch(a.a[this.c.ordinal()]) {
            case 2: {
                arr_f[0] = this.g ? 1.0f : 0.0f;
                return;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 4: 
            case 5: {
                int v = this.h >> 24 & 0xFF;
                float f = (float)Math.pow(((float)(this.h >> 8 & 0xFF)) / 255.0f, 2.2);
                float f1 = (float)Math.pow(((float)(this.h & 0xFF)) / 255.0f, 2.2);
                arr_f[0] = (float)Math.pow(((float)(this.h >> 16 & 0xFF)) / 255.0f, 2.2);
                arr_f[1] = f;
                arr_f[2] = f1;
                arr_f[3] = ((float)v) / 255.0f;
                return;
            }
            case 6: {
                arr_f[0] = (float)this.d;
                return;
            }
            case 7: {
                arr_f[0] = this.e;
                return;
            }
            case 8: {
                arr_f[0] = this.e;
            }
        }
    }

    public boolean isBooleanValue() {
        return this.g;
    }

    public boolean isContinuous() {
        switch(a.a[this.c.ordinal()]) {
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

    public boolean isMethod() {
        return this.a;
    }

    public int numberOfInterpolatedValues() {
        switch(a.a[this.c.ordinal()]) {
            case 4: 
            case 5: {
                return 4;
            }
            default: {
                return 1;
            }
        }
    }

    public static void parse(Context context0, XmlPullParser xmlPullParser0, HashMap hashMap0) {
        Integer integer0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.CustomAttribute);
        int v = typedArray0.getIndexCount();
        String s = null;
        Object object0 = null;
        AttributeType constraintAttribute$AttributeType0 = null;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.CustomAttribute_attributeName) {
                s = typedArray0.getString(v2);
                if(s != null && s.length() > 0) {
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                }
            }
            else if(v2 == styleable.CustomAttribute_methodName) {
                s = typedArray0.getString(v2);
                z = true;
            }
            else if(v2 == styleable.CustomAttribute_customBoolean) {
                object0 = Boolean.valueOf(typedArray0.getBoolean(v2, false));
                constraintAttribute$AttributeType0 = AttributeType.BOOLEAN_TYPE;
            }
            else if(v2 == styleable.CustomAttribute_customColorValue) {
                integer0 = typedArray0.getColor(v2, 0);
                constraintAttribute$AttributeType0 = AttributeType.COLOR_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customColorDrawableValue) {
                integer0 = typedArray0.getColor(v2, 0);
                constraintAttribute$AttributeType0 = AttributeType.COLOR_DRAWABLE_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customPixelDimension) {
                integer0 = TypedValue.applyDimension(1, typedArray0.getDimension(v2, 0.0f), context0.getResources().getDisplayMetrics());
                constraintAttribute$AttributeType0 = AttributeType.DIMENSION_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customDimension) {
                integer0 = typedArray0.getDimension(v2, 0.0f);
                constraintAttribute$AttributeType0 = AttributeType.DIMENSION_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customFloatValue) {
                integer0 = typedArray0.getFloat(v2, NaNf);
                constraintAttribute$AttributeType0 = AttributeType.FLOAT_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customIntegerValue) {
                integer0 = typedArray0.getInteger(v2, -1);
                constraintAttribute$AttributeType0 = AttributeType.INT_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customStringValue) {
                integer0 = typedArray0.getString(v2);
                constraintAttribute$AttributeType0 = AttributeType.STRING_TYPE;
                object0 = integer0;
            }
            else if(v2 == styleable.CustomAttribute_customReference) {
                AttributeType constraintAttribute$AttributeType1 = AttributeType.REFERENCE_TYPE;
                int v3 = typedArray0.getResourceId(v2, -1);
                if(v3 == -1) {
                    v3 = typedArray0.getInt(v2, -1);
                }
                constraintAttribute$AttributeType0 = constraintAttribute$AttributeType1;
                object0 = v3;
            }
        }
        if(s != null && object0 != null) {
            hashMap0.put(s, new ConstraintAttribute(s, constraintAttribute$AttributeType0, object0, z));
        }
        typedArray0.recycle();
    }

    public static void setAttributes(View view0, HashMap hashMap0) {
        Class class0 = view0.getClass();
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap0.get(s);
            String s1 = constraintAttribute0.a ? s : "set" + s;
            try {
                switch(a.a[constraintAttribute0.c.ordinal()]) {
                    case 1: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, constraintAttribute0.d);
                        continue;
                    }
                    case 2: {
                        class0.getMethod(s1, Boolean.TYPE).invoke(view0, Boolean.valueOf(constraintAttribute0.g));
                        continue;
                    }
                    case 3: {
                        class0.getMethod(s1, CharSequence.class).invoke(view0, constraintAttribute0.f);
                        continue;
                    }
                    case 4: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, constraintAttribute0.h);
                        continue;
                    }
                    case 5: {
                        Method method0 = class0.getMethod(s1, Drawable.class);
                        ColorDrawable colorDrawable0 = new ColorDrawable();
                        colorDrawable0.setColor(constraintAttribute0.h);
                        method0.invoke(view0, colorDrawable0);
                        continue;
                    }
                    case 6: {
                        class0.getMethod(s1, Integer.TYPE).invoke(view0, constraintAttribute0.d);
                        continue;
                    }
                    case 7: {
                        class0.getMethod(s1, Float.TYPE).invoke(view0, constraintAttribute0.e);
                        continue;
                    }
                    case 8: {
                        class0.getMethod(s1, Float.TYPE).invoke(view0, constraintAttribute0.e);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            catch(NoSuchMethodException noSuchMethodException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                goto label_37;
            }
            catch(InvocationTargetException invocationTargetException0) {
                goto label_43;
            }
            Log.e("TransitionLayout", noSuchMethodException0.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName());
            Log.e("TransitionLayout", class0.getName() + " must have a method " + s1);
            continue;
        label_37:
            StringBuilder stringBuilder0 = b.v(" Custom Attribute \"", s, "\" not found on ");
            stringBuilder0.append(class0.getName());
            Log.e("TransitionLayout", stringBuilder0.toString());
            illegalAccessException0.printStackTrace();
            continue;
        label_43:
            StringBuilder stringBuilder1 = b.v(" Custom Attribute \"", s, "\" not found on ");
            stringBuilder1.append(class0.getName());
            Log.e("TransitionLayout", stringBuilder1.toString());
            invocationTargetException0.printStackTrace();
        }
    }

    public void setColorValue(int v) {
        this.h = v;
    }

    public void setFloatValue(float f) {
        this.e = f;
    }

    public void setIntValue(int v) {
        this.d = v;
    }

    public void setStringValue(String s) {
        this.f = s;
    }

    public void setValue(Object object0) {
        switch(a.a[this.c.ordinal()]) {
            case 2: {
                this.g = ((Boolean)object0).booleanValue();
                return;
            }
            case 3: {
                this.f = (String)object0;
                return;
            }
            case 4: 
            case 5: {
                this.h = (int)(((Integer)object0));
                return;
            }
            case 1: 
            case 6: {
                this.d = (int)(((Integer)object0));
                return;
            }
            case 7: {
                this.e = (float)(((Float)object0));
                return;
            }
            case 8: {
                this.e = (float)(((Float)object0));
            }
        }
    }

    public void setValue(float[] arr_f) {
        boolean z = false;
        switch(a.a[this.c.ordinal()]) {
            case 2: {
                if(((double)arr_f[0]) > 0.5) {
                    z = true;
                }
                this.g = z;
                return;
            }
            case 3: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 4: 
            case 5: {
                int v = Color.HSVToColor(arr_f);
                this.h = v;
                int v1 = (int)(arr_f[3] * 255.0f);
                int v2 = (v1 & ~(v1 >> 0x1F)) - 0xFF;
                this.h = (v2 & v2 >> 0x1F) + 0xFF << 24 | v & 0xFFFFFF;
                return;
            }
            case 1: 
            case 6: {
                this.d = (int)arr_f[0];
                return;
            }
            case 7: {
                this.e = arr_f[0];
                return;
            }
            case 8: {
                this.e = arr_f[0];
            }
        }
    }
}

