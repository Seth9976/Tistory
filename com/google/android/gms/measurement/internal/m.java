package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;

public final class m implements Runnable {
    public final URL a;
    public final byte[] b;
    public final zzej c;
    public final String d;
    public final ArrayMap e;
    public final zzen f;

    public m(zzen zzen0, String s, URL uRL0, byte[] arr_b, ArrayMap arrayMap0, zzej zzej0) {
        this.f = zzen0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(zzej0);
        this.a = uRL0;
        this.b = arr_b;
        this.c = zzej0;
        this.d = s;
        this.e = arrayMap0;
    }

    @Override
    public final void run() {
        byte[] arr_b3;
        InputStream inputStream0;
        Map map2;
        int v2;
        IOException iOException3;
        Map map1;
        int v1;
        Throwable throwable1;
        Map map0;
        int v;
        IOException iOException1;
        HttpURLConnection httpURLConnection0;
        String s = this.d;
        zzen zzen0 = this.f;
        zzen0.zzax();
        OutputStream outputStream0 = null;
        try {
            URLConnection uRLConnection0 = this.a.openConnection();
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            httpURLConnection0.setDefaultUseCaches(false);
            httpURLConnection0.setConnectTimeout(60000);
            httpURLConnection0.setReadTimeout(61000);
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setDoInput(true);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            v = 0;
            httpURLConnection0 = null;
            map0 = null;
            iOException3 = iOException1;
            goto label_99;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            v1 = 0;
            httpURLConnection0 = null;
            map1 = null;
            goto label_113;
        }
        try {
            ArrayMap arrayMap0 = this.e;
            if(arrayMap0 != null) {
                for(Object object0: arrayMap0.entrySet()) {
                    httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
            }
            byte[] arr_b = this.b;
            if(arr_b != null) {
                byte[] arr_b1 = zzen0.zzf.zzu().z(arr_b);
                zzen0.zzt.zzay().zzj().zzb("Uploading data. size", ((int)arr_b1.length));
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setFixedLengthStreamingMode(arr_b1.length);
                httpURLConnection0.connect();
                OutputStream outputStream1 = httpURLConnection0.getOutputStream();
                try {
                    outputStream1.write(arr_b1);
                    outputStream1.close();
                }
                catch(IOException iOException1) {
                    v = 0;
                    map0 = null;
                    outputStream0 = outputStream1;
                    iOException3 = iOException1;
                    goto label_99;
                }
                catch(Throwable throwable1) {
                    v1 = 0;
                    map1 = null;
                    outputStream0 = outputStream1;
                    goto label_113;
                }
            }
            v2 = httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException2) {
            v = 0;
            map0 = null;
            iOException3 = iOException2;
            goto label_99;
        }
        catch(Throwable throwable2) {
            v1 = 0;
            map1 = null;
            throwable1 = throwable2;
            goto label_113;
        }
        try {
            map2 = httpURLConnection0.getHeaderFields();
        }
        catch(IOException iOException4) {
            map0 = null;
            iOException3 = iOException4;
            v = v2;
            goto label_99;
        }
        catch(Throwable throwable1) {
            map1 = null;
            v1 = v2;
            goto label_113;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            inputStream0 = null;
            inputStream0 = httpURLConnection0.getInputStream();
            byte[] arr_b2 = new byte[0x400];
            int v3;
            while((v3 = inputStream0.read(arr_b2)) > 0) {
                byteArrayOutputStream0.write(arr_b2, 0, v3);
            }
            arr_b3 = byteArrayOutputStream0.toByteArray();
            goto label_93;
        }
        catch(Throwable throwable3) {
            try {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                throw throwable3;
            label_93:
                inputStream0.close();
                goto label_122;
            }
            catch(IOException iOException5) {
            }
            catch(Throwable throwable4) {
                goto label_110;
            }
        }
        iOException3 = iOException5;
        v = v2;
        map0 = map2;
    label_99:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException6) {
                zzen0.zzt.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeh.zzn(s), iOException6);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        zzfo zzfo0 = zzen0.zzt.zzaz();
        k k0 = new k(this.d, this.c, v, iOException3, null, map0);
        zzfo0.zzp(k0);
        return;
    label_110:
        throwable1 = throwable4;
        v1 = v2;
        map1 = map2;
    label_113:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException7) {
                zzen0.zzt.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeh.zzn(s), iOException7);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        zzen0.zzt.zzaz().zzp(new k(this.d, this.c, v1, null, null, map1));
        throw throwable1;
    label_122:
        httpURLConnection0.disconnect();
        zzfo0 = zzen0.zzt.zzaz();
        k0 = new k(this.d, this.c, v2, null, arr_b3, map2);
        zzfo0.zzp(k0);
    }
}

