package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class l extends m {
    public static Class b = null;
    public static Constructor c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    @Override  // androidx.core.graphics.m
    public Typeface a(Context context0, Typeface typeface0, int v, boolean z) {
        Typeface typeface1 = null;
        try {
            typeface1 = o.b(typeface0, v, z);
        }
        catch(RuntimeException unused_ex) {
        }
        return typeface1 == null ? super.a(context0, typeface0, v, z) : typeface1;
    }

    public static boolean c(Object object0, String s, int v, boolean z) {
        l.d();
        try {
            return ((Boolean)l.d.invoke(object0, s, v, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    @Override  // androidx.core.graphics.m
    public Typeface createFromFontFamilyFilesResourceEntry(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v) {
        Object object0;
        l.d();
        try {
            object0 = l.c.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry = fontResourcesParserCompat$FontFamilyFilesResourceEntry0.getEntries();
        for(int v1 = 0; v1 < arr_fontResourcesParserCompat$FontFileResourceEntry.length; ++v1) {
            FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = arr_fontResourcesParserCompat$FontFileResourceEntry[v1];
            File file0 = TypefaceCompatUtil.getTempFile(context0);
            if(file0 == null) {
                return null;
            }
            try {
                if(!TypefaceCompatUtil.copyToFile(file0, resources0, fontResourcesParserCompat$FontFileResourceEntry0.getResourceId())) {
                    return null;
                }
                if(!l.c(object0, file0.getPath(), fontResourcesParserCompat$FontFileResourceEntry0.getWeight(), fontResourcesParserCompat$FontFileResourceEntry0.isItalic())) {
                    return null;
                }
            }
            catch(RuntimeException unused_ex) {
                return null;
            }
            finally {
                file0.delete();
            }
        }
        l.d();
        try {
            Object object1 = Array.newInstance(l.b, 1);
            Array.set(object1, 0, object0);
            return (Typeface)l.e.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException1) {
            throw new RuntimeException(illegalAccessException1);
        }
    }

    public static void d() {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0;
        if(l.f) {
            return;
        }
        try {
            l.f = true;
            constructor0 = null;
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi21Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        l.c = constructor0;
        l.b = class0;
        l.d = method0;
        l.e = method1;
    }
}

