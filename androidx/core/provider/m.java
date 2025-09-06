package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class m {
    public static final LruCache a;
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final SimpleArrayMap d;

    static {
        m.a = new LruCache(16);
        o o0 = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        o0.a = "fonts-androidx";
        o0.b = 10;
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), o0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        m.b = threadPoolExecutor0;
        m.c = new Object();
        m.d = new SimpleArrayMap();
    }

    public static l a(String s, Context context0, FontRequest fontRequest0, int v) {
        FontFamilyResult fontsContractCompat$FontFamilyResult0;
        int v1;
        LruCache lruCache0 = m.a;
        Typeface typeface0 = (Typeface)lruCache0.get(s);
        if(typeface0 != null) {
            return new l(typeface0);
        }
        try {
            v1 = 1;
            fontsContractCompat$FontFamilyResult0 = g.a(context0, null, fontRequest0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return new l(-1);
        }
        switch(fontsContractCompat$FontFamilyResult0.getStatusCode()) {
            case 0: {
                FontInfo[] arr_fontsContractCompat$FontInfo = fontsContractCompat$FontFamilyResult0.getFonts();
                if(arr_fontsContractCompat$FontInfo != null && arr_fontsContractCompat$FontInfo.length != 0) {
                    v1 = 0;
                    for(int v2 = 0; true; ++v2) {
                        if(v2 >= arr_fontsContractCompat$FontInfo.length) {
                            break;
                        }
                        int v3 = arr_fontsContractCompat$FontInfo[v2].getResultCode();
                        if(v3 != 0) {
                            if(v3 >= 0) {
                                v1 = v3;
                                break;
                            }
                            v1 = -3;
                            break;
                        }
                    }
                }
                break;
            }
            case 1: {
                v1 = -2;
                break;
            }
            default: {
                v1 = -3;
            }
        }
        if(v1 != 0) {
            return new l(v1);
        }
        Typeface typeface1 = TypefaceCompat.createFromFontInfo(context0, null, fontsContractCompat$FontFamilyResult0.getFonts(), v);
        if(typeface1 != null) {
            lruCache0.put(s, typeface1);
            return new l(typeface1);
        }
        return new l(-3);
    }

    public static Typeface b(Context context0, FontRequest fontRequest0, int v, p p0, c c0) {
        String s = fontRequest0.f + "-" + v;
        Typeface typeface0 = (Typeface)m.a.get(s);
        if(typeface0 != null) {
            a a0 = new a(c0.a, typeface0);
            c0.b.post(a0);
            return typeface0;
        }
        i i0 = new i(c0);
        synchronized(m.c) {
            SimpleArrayMap simpleArrayMap0 = m.d;
            ArrayList arrayList0 = (ArrayList)simpleArrayMap0.get(s);
            if(arrayList0 != null) {
                arrayList0.add(i0);
                return null;
            }
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(i0);
            simpleArrayMap0.put(s, arrayList1);
        }
        j j0 = new j(s, context0, fontRequest0, v);
        if(p0 == null) {
            p0 = m.b;
        }
        k k0 = new k(s);
        Handler handler0 = g.a.q();
        q q0 = new q();
        q0.b = j0;
        q0.c = k0;
        q0.d = handler0;
        p0.execute(q0);
        return null;
    }
}

