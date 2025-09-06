package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public abstract class m {
    public final ConcurrentHashMap a;

    public m() {
        this.a = new ConcurrentHashMap();
    }

    public Typeface a(Context context0, Typeface typeface0, int v, boolean z) {
        Typeface typeface1 = null;
        try {
            typeface1 = n.a(this, context0, typeface0, v, z);
        }
        catch(RuntimeException unused_ex) {
        }
        return typeface1 == null ? typeface0 : typeface1;
    }

    public static long b(Typeface typeface0) {
        if(typeface0 == null) {
            return 0L;
        }
        try {
            Field field0 = Typeface.class.getDeclaredField("native_instance");
            field0.setAccessible(true);
            return ((Number)field0.get(typeface0)).longValue();
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", noSuchFieldException0);
            return 0L;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", illegalAccessException0);
            return 0L;
        }
    }

    public abstract Typeface createFromFontFamilyFilesResourceEntry(Context arg1, FontFamilyFilesResourceEntry arg2, Resources arg3, int arg4);

    public abstract Typeface createFromFontInfo(Context arg1, CancellationSignal arg2, FontInfo[] arg3, int arg4);

    public Typeface createFromInputStream(Context context0, InputStream inputStream0) {
        File file0 = TypefaceCompatUtil.getTempFile(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return TypefaceCompatUtil.copyToFile(file0, inputStream0) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    public Typeface createFromResourcesFontFile(Context context0, Resources resources0, int v, String s, int v1) {
        File file0 = TypefaceCompatUtil.getTempFile(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return TypefaceCompatUtil.copyToFile(file0, resources0, v) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    public FontInfo findBestInfo(FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        FontInfo fontsContractCompat$FontInfo0 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < arr_fontsContractCompat$FontInfo.length; ++v2) {
            FontInfo fontsContractCompat$FontInfo1 = arr_fontsContractCompat$FontInfo[v2];
            int v3 = Math.abs(fontsContractCompat$FontInfo1.getWeight() - ((v & 1) == 0 ? 400 : 700)) * 2 + (fontsContractCompat$FontInfo1.isItalic() == ((v & 2) != 0) ? 0 : 1);
            if(fontsContractCompat$FontInfo0 == null || v1 > v3) {
                fontsContractCompat$FontInfo0 = fontsContractCompat$FontInfo1;
                v1 = v3;
            }
        }
        return fontsContractCompat$FontInfo0;
    }
}

