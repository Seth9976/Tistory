package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public final class zzho {
    public static volatile zzig a;

    public static zzig zza(Context context0) {
        zzig zzig2;
        zzhh zzhh0;
        zzig zzig1;
        File file0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0;
        zzig zzig0;
        synchronized(zzho.class) {
            zzig0 = zzho.a;
            if(zzig0 == null) {
                String s = Build.TAGS;
                if(!Build.TYPE.equals("eng") && !Build.TYPE.equals("userdebug")) {
                    zzig2 = zzig.zzc();
                    zzig0 = zzig2;
                    zzho.a = zzig0;
                    return zzig0;
                }
                else if(s.contains("dev-keys") || s.contains("test-keys")) {
                    if(!context0.isDeviceProtectedStorage()) {
                        context0 = context0.createDeviceProtectedStorageContext();
                    }
                    strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    goto label_10;
                }
                else {
                    zzig2 = zzig.zzc();
                }
                zzig0 = zzig2;
                zzho.a = zzig0;
                return zzig0;
            }
            return zzig0;
        }
    label_10:
        StrictMode.allowThreadDiskWrites();
        try {
            file0 = new File(context0.getDir("phenotype_hermetic", 0), "overrides.txt");
        }
        catch(RuntimeException runtimeException0) {
            Log.e("HermeticFileOverrides", "no data dir", runtimeException0);
            zzig1 = zzig.zzc();
            goto label_18;
        }
        zzig1 = file0.exists() ? zzig.zzd(file0) : zzig.zzc();
    label_18:
        if(zzig1.zzb()) {
            File file1 = (File)zzig1.zza();
            try(BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))) {
                SimpleArrayMap simpleArrayMap0 = new SimpleArrayMap();
                HashMap hashMap0 = new HashMap();
                String s1;
                while((s1 = bufferedReader0.readLine()) != null) {
                    String[] arr_s = s1.split(" ", 3);
                    if(arr_s.length == 3) {
                        String s2 = new String(arr_s[0]);
                        String s3 = Uri.decode(new String(arr_s[1]));
                        String s4 = (String)hashMap0.get(arr_s[2]);
                        if(s4 == null) {
                            String s5 = new String(arr_s[2]);
                            s4 = Uri.decode(s5);
                            if(s4.length() < 0x400 || s4 == s5) {
                                hashMap0.put(s5, s4);
                            }
                        }
                        if(!simpleArrayMap0.containsKey(s2)) {
                            simpleArrayMap0.put(s2, new SimpleArrayMap());
                        }
                        ((SimpleArrayMap)simpleArrayMap0.get(s2)).put(s3, s4);
                    }
                    else {
                        Log.e("HermeticFileOverrides", "Invalid: " + s1);
                    }
                }
                Log.w("HermeticFileOverrides", "Parsed " + file1.toString() + " for Android package " + "net.daum.android.tistoryapp");
                zzhh0 = new zzhh(simpleArrayMap0);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            zzig2 = zzig.zzd(zzhh0);
        }
        else {
            zzig2 = zzig.zzc();
        }
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        zzig0 = zzig2;
        zzho.a = zzig0;
        return zzig0;
    }
}

