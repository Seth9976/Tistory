package androidx.core.content.res;

import a7.b;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.styleable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class ComplexColorCompat {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public ComplexColorCompat(Shader shader0, ColorStateList colorStateList0, int v) {
        this.a = shader0;
        this.b = colorStateList0;
        this.c = v;
    }

    public static ComplexColorCompat a(Resources.Theme resources$Theme0, Resources resources0, int v) {
        float f7;
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        do {
            int v1 = xmlResourceParser0.next();
        }
        while(v1 != 1 && v1 != 2);
        if(v1 != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String s = xmlResourceParser0.getName();
        s.getClass();
        if(!s.equals("gradient")) {
            if(!s.equals("selector")) {
                throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": unsupported complex color tag " + s);
            }
            ColorStateList colorStateList0 = ColorStateListInflaterCompat.createFromXmlInner(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
            return new ComplexColorCompat(null, colorStateList0, colorStateList0.getDefaultColor());
        }
        String s1 = xmlResourceParser0.getName();
        if(s1.equals("gradient")) {
            TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.GradientColor);
            float f = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "startX", styleable.GradientColor_android_startX, 0.0f);
            float f1 = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "startY", styleable.GradientColor_android_startY, 0.0f);
            float f2 = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "endX", styleable.GradientColor_android_endX, 0.0f);
            float f3 = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "endY", styleable.GradientColor_android_endY, 0.0f);
            float f4 = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "centerX", styleable.GradientColor_android_centerX, 0.0f);
            float f5 = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "centerY", styleable.GradientColor_android_centerY, 0.0f);
            int v2 = TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "type", styleable.GradientColor_android_type, 0);
            int v3 = TypedArrayUtils.getNamedColor(typedArray0, xmlResourceParser0, "startColor", styleable.GradientColor_android_startColor, 0);
            boolean z = TypedArrayUtils.hasAttribute(xmlResourceParser0, "centerColor");
            int v4 = TypedArrayUtils.getNamedColor(typedArray0, xmlResourceParser0, "centerColor", styleable.GradientColor_android_centerColor, 0);
            int v5 = TypedArrayUtils.getNamedColor(typedArray0, xmlResourceParser0, "endColor", styleable.GradientColor_android_endColor, 0);
            int v6 = TypedArrayUtils.getNamedInt(typedArray0, xmlResourceParser0, "tileMode", styleable.GradientColor_android_tileMode, 0);
            float f6 = TypedArrayUtils.getNamedFloat(typedArray0, xmlResourceParser0, "gradientRadius", styleable.GradientColor_android_gradientRadius, 0.0f);
            typedArray0.recycle();
            int v7 = xmlResourceParser0.getDepth();
            ArrayList arrayList0 = new ArrayList(20);
            ArrayList arrayList1 = new ArrayList(20);
            while(true) {
                int v8 = xmlResourceParser0.next();
                if(v8 == 1) {
                    f7 = f1;
                    break;
                }
                int v9 = xmlResourceParser0.getDepth();
                f7 = f1;
                if(v9 < v7 + 1 && v8 == 3) {
                    break;
                }
                if(v8 == 2 && (v9 <= v7 + 1 && xmlResourceParser0.getName().equals("item"))) {
                    TypedArray typedArray1 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.GradientColorItem);
                    if(!typedArray1.hasValue(styleable.GradientColorItem_android_color) || !typedArray1.hasValue(styleable.GradientColorItem_android_offset)) {
                        throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!");
                    }
                    int v10 = typedArray1.getColor(styleable.GradientColorItem_android_color, 0);
                    float f8 = typedArray1.getFloat(styleable.GradientColorItem_android_offset, 0.0f);
                    typedArray1.recycle();
                    arrayList1.add(v10);
                    arrayList0.add(f8);
                }
                f1 = f7;
            }
            b b0 = arrayList1.size() <= 0 ? null : new b(arrayList1, arrayList0);
            if(b0 == null) {
                b0 = z ? new b(v3, v4, v5) : new b(v3, v5);
            }
            switch(v2) {
                case 1: {
                    if(f6 > 0.0f) {
                        switch(v6) {
                            case 1: {
                                return new ComplexColorCompat(new RadialGradient(f4, f5, f6, ((int[])b0.b), ((float[])b0.c), Shader.TileMode.REPEAT), null, 0);
                            }
                            case 2: {
                                return new ComplexColorCompat(new RadialGradient(f4, f5, f6, ((int[])b0.b), ((float[])b0.c), Shader.TileMode.MIRROR), null, 0);
                            }
                            default: {
                                return new ComplexColorCompat(new RadialGradient(f4, f5, f6, ((int[])b0.b), ((float[])b0.c), Shader.TileMode.CLAMP), null, 0);
                            }
                        }
                    }
                    throw new XmlPullParserException("<gradient> tag requires \'gradientRadius\' attribute with radial type");
                }
                case 2: {
                    return new ComplexColorCompat(new SweepGradient(f4, f5, ((int[])b0.b), ((float[])b0.c)), null, 0);
                }
                default: {
                    switch(v6) {
                        case 1: {
                            return new ComplexColorCompat(new LinearGradient(f, f7, f2, f3, ((int[])b0.b), ((float[])b0.c), Shader.TileMode.REPEAT), null, 0);
                        }
                        case 2: {
                            return new ComplexColorCompat(new LinearGradient(f, f7, f2, f3, ((int[])b0.b), ((float[])b0.c), Shader.TileMode.MIRROR), null, 0);
                        }
                        default: {
                            return new ComplexColorCompat(new LinearGradient(f, f7, f2, f3, ((int[])b0.b), ((float[])b0.c), Shader.TileMode.CLAMP), null, 0);
                        }
                    }
                }
            }
        }
        throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": invalid gradient color tag " + s1);
    }

    @ColorInt
    public int getColor() {
        return this.c;
    }

    @Nullable
    public Shader getShader() {
        return this.a;
    }

    @Nullable
    public static ComplexColorCompat inflate(@NonNull Resources resources0, @ColorRes int v, @Nullable Resources.Theme resources$Theme0) {
        try {
            return ComplexColorCompat.a(resources$Theme0, resources0, v);
        }
        catch(Exception exception0) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", exception0);
            return null;
        }
    }

    public boolean isGradient() {
        return this.a != null;
    }

    public boolean isStateful() {
        return this.a == null && (this.b != null && this.b.isStateful());
    }

    public boolean onStateChanged(int[] arr_v) {
        if(this.isStateful()) {
            int v = this.b.getDefaultColor();
            int v1 = this.b.getColorForState(arr_v, v);
            if(v1 != this.c) {
                this.c = v1;
                return true;
            }
        }
        return false;
    }

    public void setColor(@ColorInt int v) {
        this.c = v;
    }

    public boolean willDraw() {
        return this.isGradient() || this.c != 0;
    }
}

