package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.R.attr;
import androidx.core.R.styleable;
import androidx.core.math.MathUtils;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class ColorStateListInflaterCompat {
    public static final ThreadLocal a;

    static {
        ColorStateListInflaterCompat.a = new ThreadLocal();
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
        do {
            int v = xmlPullParser0.next();
        }
        while(v != 1 && v != 2);
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return ColorStateListInflaterCompat.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        float f;
        int v5;
        String s = xmlPullParser0.getName();
        if(!s.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": invalid color state list tag " + s);
        }
        int v = xmlPullParser0.getDepth();
        int[][] arr2_v = new int[20][];
        int[] arr_v = new int[20];
        int v1 = 0;
        int v2;
        while((v2 = xmlPullParser0.next()) != 1) {
            int v3 = xmlPullParser0.getDepth();
            if(v3 < v + 1 && v2 == 3) {
                break;
            }
            if(v2 == 2 && v3 <= v + 1 && xmlPullParser0.getName().equals("item")) {
                int[] arr_v1 = styleable.ColorStateListItem;
                TypedArray typedArray0 = resources$Theme0 == null ? resources0.obtainAttributes(attributeSet0, arr_v1) : resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v1, 0, 0);
                int v4 = typedArray0.getResourceId(styleable.ColorStateListItem_android_color, -1);
                if(v4 == -1) {
                    v5 = typedArray0.getColor(styleable.ColorStateListItem_android_color, 0xFFFF00FF);
                }
                else {
                    ThreadLocal threadLocal0 = ColorStateListInflaterCompat.a;
                    TypedValue typedValue0 = (TypedValue)threadLocal0.get();
                    if(typedValue0 == null) {
                        typedValue0 = new TypedValue();
                        threadLocal0.set(typedValue0);
                    }
                    resources0.getValue(v4, typedValue0, true);
                    if(typedValue0.type < 28 || typedValue0.type > 0x1F) {
                        try {
                            v5 = ColorStateListInflaterCompat.createFromXml(resources0, resources0.getXml(v4), resources$Theme0).getDefaultColor();
                        }
                        catch(Exception unused_ex) {
                            v5 = typedArray0.getColor(styleable.ColorStateListItem_android_color, 0xFFFF00FF);
                        }
                    }
                }
                if(typedArray0.hasValue(styleable.ColorStateListItem_android_alpha)) {
                    f = typedArray0.getFloat(styleable.ColorStateListItem_android_alpha, 1.0f);
                }
                else {
                    f = typedArray0.hasValue(styleable.ColorStateListItem_alpha) ? typedArray0.getFloat(styleable.ColorStateListItem_alpha, 1.0f) : 1.0f;
                }
                float f1 = Build.VERSION.SDK_INT < 0x1F || !typedArray0.hasValue(styleable.ColorStateListItem_android_lStar) ? typedArray0.getFloat(styleable.ColorStateListItem_lStar, -1.0f) : typedArray0.getFloat(styleable.ColorStateListItem_android_lStar, -1.0f);
                typedArray0.recycle();
                int v6 = attributeSet0.getAttributeCount();
                int[] arr_v2 = new int[v6];
                int v7 = 0;
                for(int v8 = 0; v8 < v6; ++v8) {
                    int v9 = attributeSet0.getAttributeNameResource(v8);
                    if(v9 != 0x10101A5 && v9 != 0x101031F && v9 != attr.alpha && v9 != attr.lStar) {
                        if(!attributeSet0.getAttributeBooleanValue(v8, false)) {
                            v9 = -v9;
                        }
                        arr_v2[v7] = v9;
                        ++v7;
                    }
                }
                int[] arr_v3 = StateSet.trimStateSet(arr_v2, v7);
                boolean z = f1 >= 0.0f && f1 <= 100.0f;
                if(f != 1.0f || z) {
                    int v10 = MathUtils.clamp(((int)(((float)Color.alpha(v5)) * f + 0.5f)), 0, 0xFF);
                    if(z) {
                        CamColor camColor0 = CamColor.a(v5);
                        v5 = CamColor.toColor(camColor0.a, camColor0.b, f1);
                    }
                    v5 = 0xFFFFFF & v5 | v10 << 24;
                }
                int v11 = 8;
                if(v1 + 1 > arr_v.length) {
                    int[] arr_v4 = new int[(v1 > 4 ? v1 * 2 : 8)];
                    System.arraycopy(arr_v, 0, arr_v4, 0, v1);
                    arr_v = arr_v4;
                }
                arr_v[v1] = v5;
                if(v1 + 1 > arr2_v.length) {
                    Class class0 = arr2_v.getClass().getComponentType();
                    if(v1 > 4) {
                        v11 = v1 * 2;
                    }
                    Object[] arr_object = (Object[])Array.newInstance(class0, v11);
                    System.arraycopy(arr2_v, 0, arr_object, 0, v1);
                    arr2_v = arr_object;
                }
                arr2_v[v1] = arr_v3;
                ++v1;
            }
        }
        int[] arr_v5 = new int[v1];
        int[][] arr2_v1 = new int[v1][];
        System.arraycopy(arr_v, 0, arr_v5, 0, v1);
        System.arraycopy(arr2_v, 0, arr2_v1, 0, v1);
        return new ColorStateList(arr2_v1, arr_v5);
    }

    @Nullable
    public static ColorStateList inflate(@NonNull Resources resources0, @XmlRes int v, @Nullable Resources.Theme resources$Theme0) {
        try {
            return ColorStateListInflaterCompat.createFromXml(resources0, resources0.getXml(v), resources$Theme0);
        }
        catch(Exception exception0) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", exception0);
            return null;
        }
    }
}

