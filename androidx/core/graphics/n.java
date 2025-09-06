package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import java.lang.reflect.Field;

public abstract class n {
    public static final Field a;
    public static final LongSparseArray b;
    public static final Object c;

    static {
        Field field0;
        try {
            field0 = Typeface.class.getDeclaredField("native_instance");
            field0.setAccessible(true);
        }
        catch(Exception exception0) {
            Log.e("WeightTypeface", exception0.getClass().getName(), exception0);
            field0 = null;
        }
        n.a = field0;
        n.b = new LongSparseArray(3);
        n.c = new Object();
    }

    public static Typeface a(m m0, Context context0, Typeface typeface0, int v, boolean z) {
        int v9;
        Typeface typeface2;
        long v3;
        Field field0 = n.a;
        if(field0 != null) {
            int v1 = v << 1 | z;
            synchronized(n.c) {
                try {
                    v3 = ((Number)field0.get(typeface0)).longValue();
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException(illegalAccessException0);
                }
            }
            LongSparseArray longSparseArray0 = n.b;
            SparseArray sparseArray0 = (SparseArray)longSparseArray0.get(v3);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray(4);
                longSparseArray0.put(v3, sparseArray0);
            }
            else {
                Typeface typeface1 = (Typeface)sparseArray0.get(v1);
                if(typeface1 != null) {
                    return typeface1;
                }
            }
            m0.getClass();
            long v4 = m.b(typeface0);
            FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0 = v4 == 0L ? null : ((FontFamilyFilesResourceEntry)m0.a.get(v4));
            if(fontResourcesParserCompat$FontFamilyFilesResourceEntry0 == null) {
                typeface2 = null;
            }
            else {
                Resources resources0 = context0.getResources();
                FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry = fontResourcesParserCompat$FontFamilyFilesResourceEntry0.getEntries();
                int v5 = 0x7FFFFFFF;
                FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = null;
                for(int v6 = 0; v6 < arr_fontResourcesParserCompat$FontFileResourceEntry.length; ++v6) {
                    FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry1 = arr_fontResourcesParserCompat$FontFileResourceEntry[v6];
                    int v7 = Math.abs(fontResourcesParserCompat$FontFileResourceEntry1.getWeight() - v) * 2 + (fontResourcesParserCompat$FontFileResourceEntry1.isItalic() == z ? 0 : 1);
                    if(fontResourcesParserCompat$FontFileResourceEntry0 == null || v5 > v7) {
                        v5 = v7;
                        fontResourcesParserCompat$FontFileResourceEntry0 = fontResourcesParserCompat$FontFileResourceEntry1;
                    }
                }
                if(fontResourcesParserCompat$FontFileResourceEntry0 == null) {
                    typeface2 = null;
                }
                else {
                    typeface2 = TypefaceCompat.createFromResourcesFontFile(context0, resources0, fontResourcesParserCompat$FontFileResourceEntry0.getResourceId(), fontResourcesParserCompat$FontFileResourceEntry0.getFileName(), 0, 0);
                    long v8 = m.b(typeface2);
                    if(v8 != 0L) {
                        m0.a.put(v8, fontResourcesParserCompat$FontFamilyFilesResourceEntry0);
                    }
                }
            }
            if(typeface2 == null) {
                if(v < 600 && !z) {
                    v9 = 0;
                }
                else if(v < 600) {
                    v9 = 2;
                }
                else {
                    v9 = z ? 3 : 1;
                }
                typeface2 = Typeface.create(typeface0, v9);
            }
            sparseArray0.put(v1, typeface2);
            return typeface2;
        }
        return null;
    }
}

