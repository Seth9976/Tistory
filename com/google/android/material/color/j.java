package com.google.android.material.color;

import a5.b;
import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.constraintlayout.core.c;
import androidx.core.app.y;
import androidx.core.view.c2;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

public abstract class j {
    public static byte a;
    public static final e b;
    public static final c c;
    public static final p d;

    static {
        j.b = new e(1, "android");
        j.c = new c(5);
        j.d = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static byte[] a(int v) [...] // 潜在的解密器

    public static boolean b(Context context0, Map map0) {
        ResourcesLoader resourcesLoader1;
        FileDescriptor fileDescriptor0;
        ResourcesLoader resourcesLoader0 = null;
        try {
            byte[] arr_b = j.d(context0, map0);
            Log.i("ColorResLoaderCreator", "Table created, length: " + arr_b.length);
            if(arr_b.length != 0) {
                try {
                    fileDescriptor0 = null;
                    fileDescriptor0 = c2.j();
                    if(fileDescriptor0 == null) {
                        Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                    }
                    else {
                        FileOutputStream fileOutputStream0 = new FileOutputStream(fileDescriptor0);
                        TWR.declareResource(fileOutputStream0);
                        TWR.useResource$NT(fileOutputStream0);
                        fileOutputStream0.write(arr_b);
                        ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.dup(fileDescriptor0);
                        TWR.declareResource(parcelFileDescriptor0);
                        TWR.useResource$NT(parcelFileDescriptor0);
                        resourcesLoader1 = c2.e();
                        resourcesLoader1.addProvider(c2.f(parcelFileDescriptor0));
                        goto label_23;
                    }
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    if(fileDescriptor0 != null) {
                        Os.close(fileDescriptor0);
                    }
                    throw throwable0;
                }
            label_23:
                Os.close(fileDescriptor0);
                resourcesLoader0 = resourcesLoader1;
            }
        }
        catch(Exception exception0) {
            Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", exception0);
        }
    label_28:
        if(resourcesLoader0 != null) {
            context0.getResources().addLoaders(new ResourcesLoader[]{resourcesLoader0});
            return true;
        }
        return false;
    }

    public static byte[] c(char c) [...] // 潜在的解密器

    public static byte[] d(Context context0, Map map0) {
        e e1;
        if(map0.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        e e0 = new e(0x7F, "net.daum.android.tistoryapp");
        HashMap hashMap0 = new HashMap();
        com.google.android.material.color.c c0 = null;
        for(Object object0: map0.entrySet()) {
            int v = (int)(((Integer)((Map.Entry)object0).getKey()));
            String s = context0.getResources().getResourceName(((int)(((Integer)((Map.Entry)object0).getKey()))));
            com.google.android.material.color.c c1 = new com.google.android.material.color.c(v, s, ((int)(((Integer)((Map.Entry)object0).getValue()))));
            if(context0.getResources().getResourceTypeName(((int)(((Integer)((Map.Entry)object0).getKey())))).equals("color")) {
                int v1 = c1.a;
                if(v1 == 1) {
                    e1 = j.b;
                }
                else {
                    if(v1 != 0x7F) {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + v1);
                    }
                    e1 = e0;
                }
                if(!hashMap0.containsKey(e1)) {
                    hashMap0.put(e1, new ArrayList());
                }
                ((List)hashMap0.get(e1)).add(c1);
                c0 = c1;
                continue;
            }
            StringBuilder stringBuilder0 = b.v("Non color resource found: name=", s, ", typeId=");
            stringBuilder0.append(Integer.toHexString(c1.b & 0xFF));
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
        j.a = c0.b;
        if(c0.b == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ArrayList arrayList0 = new ArrayList();
        int v2 = hashMap0.size();
        h h0 = new h(false, new String[0]);
        for(Object object1: hashMap0.entrySet()) {
            List list0 = (List)((Map.Entry)object1).getValue();
            Collections.sort(list0, j.c);
            arrayList0.add(new d(((e)((Map.Entry)object1).getKey()), list0));
        }
        int v3 = 0;
        for(Object object2: arrayList0) {
            v3 += ((d)object2).a();
        }
        byteArrayOutputStream0.write(new byte[]{2, 0});
        byteArrayOutputStream0.write(new byte[]{12, 0});
        byteArrayOutputStream0.write(j.a(h0.l + 12 + v3));
        byteArrayOutputStream0.write(j.a(v2));
        h0.a(byteArrayOutputStream0);
        for(Object object3: arrayList0) {
            ((d)object3).a.a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(j.a(((d)object3).b.a));
            char[] arr_c = ((d)object3).b.b.toCharArray();
            for(int v4 = 0; v4 < 0x80; ++v4) {
                if(v4 < arr_c.length) {
                    byteArrayOutputStream0.write(j.c(arr_c[v4]));
                }
                else {
                    byteArrayOutputStream0.write(new byte[]{0, 0});
                }
            }
            byteArrayOutputStream0.write(new byte[]{0x20, 1, 0, 0});
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream0.write(j.a(((d)object3).c.l + 0x120));
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            ((d)object3).c.a(byteArrayOutputStream0);
            ((d)object3).d.a(byteArrayOutputStream0);
            y y0 = ((d)object3).e;
            ((f)y0.b).a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(new byte[]{j.a, 0, 0, 0});
            byteArrayOutputStream0.write(j.a(y0.a));
            int[] arr_v = (int[])y0.c;
            for(int v5 = 0; v5 < arr_v.length; ++v5) {
                byteArrayOutputStream0.write(j.a(arr_v[v5]));
            }
            i i0 = (i)y0.d;
            ((f)i0.b).a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(new byte[]{j.a, 0, 0, 0});
            byteArrayOutputStream0.write(j.a(i0.a));
            int[] arr_v1 = (int[])i0.d;
            byteArrayOutputStream0.write(j.a(arr_v1.length * 4 + 84));
            byteArrayOutputStream0.write(((byte[])i0.c));
            for(int v6 = 0; v6 < arr_v1.length; ++v6) {
                byteArrayOutputStream0.write(j.a(arr_v1[v6]));
            }
            g[] arr_g = (g[])i0.e;
            for(int v7 = 0; v7 < arr_g.length; ++v7) {
                g g0 = arr_g[v7];
                g0.getClass();
                byteArrayOutputStream0.write(new byte[]{8, 0});
                byteArrayOutputStream0.write(new byte[]{2, 0});
                byteArrayOutputStream0.write(j.a(g0.a));
                byteArrayOutputStream0.write(new byte[]{8, 0});
                byteArrayOutputStream0.write(new byte[]{0, 28});
                byteArrayOutputStream0.write(j.a(g0.b));
            }
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static byte[] e(short v) [...] // 潜在的解密器
}

