package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public final class p0 implements Runnable {
    public final URL a;
    public final zzib b;
    public final zzfp c;

    public p0(zzib zzib0, String s, URL uRL0, zzfp zzfp0) {
        this.b = zzib0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(zzfp0);
        this.a = uRL0;
        this.c = zzfp0;
    }

    @Override
    public final void run() {
        byte[] arr_b1;
        InputStream inputStream0;
        Throwable throwable1;
        Map map0;
        IOException iOException1;
        int v;
        HttpURLConnection httpURLConnection0;
        zzib zzib0 = this.b;
        zzib0.zzax();
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
            v = 0;
            iOException1 = iOException0;
            httpURLConnection0 = null;
            map0 = null;
            goto label_60;
        }
        catch(Throwable throwable0) {
            v = 0;
            throwable1 = throwable0;
            httpURLConnection0 = null;
            map0 = null;
            goto label_65;
        }
        try {
            v = 0;
            v = httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException2) {
            iOException1 = iOException2;
            map0 = null;
            goto label_60;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            map0 = null;
            goto label_65;
        }
        try {
            map0 = httpURLConnection0.getHeaderFields();
            goto label_42;
        }
        catch(IOException iOException3) {
            iOException1 = iOException3;
            map0 = null;
            goto label_60;
        }
        catch(Throwable throwable1) {
        }
        map0 = null;
        goto label_65;
        try {
        label_42:
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            inputStream0 = null;
            inputStream0 = httpURLConnection0.getInputStream();
            byte[] arr_b = new byte[0x400];
            int v1;
            while((v1 = inputStream0.read(arr_b)) > 0) {
                byteArrayOutputStream0.write(arr_b, 0, v1);
            }
            arr_b1 = byteArrayOutputStream0.toByteArray();
            goto label_56;
        }
        catch(Throwable throwable3) {
            try {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                throw throwable3;
            label_56:
                inputStream0.close();
                goto label_69;
            }
            catch(IOException iOException4) {
            }
            catch(Throwable throwable1) {
                goto label_65;
            }
        }
        iOException1 = iOException4;
    label_60:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        zzib0.zzt.zzaz().zzp(new zzhz(this, v, iOException1, null, map0));
        return;
    label_65:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        zzib0.zzt.zzaz().zzp(new zzhz(this, v, null, null, map0));
        throw throwable1;
    label_69:
        httpURLConnection0.disconnect();
        zzib0.zzt.zzaz().zzp(new zzhz(this, v, null, arr_b1, map0));
    }
}

