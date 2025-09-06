package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public final class ManifestParser {
    public final Context a;

    public ManifestParser(Context context0) {
        this.a = context0;
    }

    public static GlideModule a(String s) {
        Object object0;
        Class class0;
        try {
            class0 = Class.forName(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", classNotFoundException0);
        }
        try {
            object0 = class0.getDeclaredConstructor(null).newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            ManifestParser.b(class0, instantiationException0);
            throw null;
        }
        catch(IllegalAccessException illegalAccessException0) {
            ManifestParser.b(class0, illegalAccessException0);
            throw null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            ManifestParser.b(class0, noSuchMethodException0);
            throw null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            ManifestParser.b(class0, invocationTargetException0);
            throw null;
        }
        if(!(object0 instanceof GlideModule)) {
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + object0);
        }
        return (GlideModule)object0;
    }

    public static void b(Class class0, ReflectiveOperationException reflectiveOperationException0) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + class0, reflectiveOperationException0);
    }

    public List parse() {
        if(Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        List list0 = new ArrayList();
        try {
            ApplicationInfo applicationInfo0 = this.a.getPackageManager().getApplicationInfo("net.daum.android.tistoryapp", 0x80);
            if(applicationInfo0 == null || applicationInfo0.metaData == null) {
                if(Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return list0;
            }
            if(Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo0.metaData);
            }
            Iterator iterator0 = applicationInfo0.metaData.keySet().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_21;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                if("GlideModule".equals(applicationInfo0.metaData.get(s))) {
                    ((ArrayList)list0).add(ManifestParser.a(s));
                    if(Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + s);
                    }
                }
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        throw new RuntimeException("Unable to find metadata to parse GlideModules", packageManager$NameNotFoundException0);
    label_21:
        if(Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Finished loading Glide modules");
        }
        return list0;
    }
}

