package retrofit2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class p implements Callback, Converter {
    public final Object a;
    public Object b;

    public p() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
    }

    public p(Context context0) {
        this.b = null;
        this.a = context0;
    }

    public p(Gson gson0, TypeAdapter typeAdapter0) {
        this.a = gson0;
        this.b = typeAdapter0;
    }

    public p(s s0, retrofit2.Callback callback0) {
        this.b = s0;
        this.a = callback0;
    }

    public BackendFactory a(String s) {
        Map map0;
        Bundle bundle0;
        if(((Map)this.b) == null) {
            Context context0 = (Context)this.a;
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    goto label_13;
                }
                else {
                    ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, TransportBackendDiscovery.class), 0x80);
                    if(serviceInfo0 == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        goto label_13;
                    }
                    else {
                        bundle0 = serviceInfo0.metaData;
                    }
                }
                goto label_14;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            label_12:
                Log.w("BackendRegistry", "Application info not found.");
            }
            try {
            label_13:
                bundle0 = null;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                goto label_12;
            }
        label_14:
            if(bundle0 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map0 = Collections.emptyMap();
            }
            else {
                HashMap hashMap0 = new HashMap();
                for(Object object0: bundle0.keySet()) {
                    String s1 = (String)object0;
                    Object object1 = bundle0.get(s1);
                    if(object1 instanceof String && s1.startsWith("backend:")) {
                        String[] arr_s = ((String)object1).split(",", -1);
                        for(int v = 0; v < arr_s.length; ++v) {
                            String s2 = arr_s[v].trim();
                            if(!s2.isEmpty()) {
                                hashMap0.put(s2, s1.substring(8));
                            }
                        }
                    }
                }
                map0 = hashMap0;
            }
            this.b = map0;
        }
        String s3 = (String)((Map)this.b).get(s);
        if(s3 == null) {
            return null;
        }
        try {
            return (BackendFactory)Class.forName(s3).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            Log.w("BackendRegistry", "Class " + s3 + " is not found.", classNotFoundException0);
            return null;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3 + ".", illegalAccessException0);
            return null;
        }
        catch(InstantiationException instantiationException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3 + ".", instantiationException0);
            return null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3, noSuchMethodException0);
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("BackendRegistry", "Could not instantiate " + s3, invocationTargetException0);
            return null;
        }
    }

    @Override  // retrofit2.Converter
    public Object convert(Object object0) {
        Reader reader0 = ((ResponseBody)object0).charStream();
        JsonReader jsonReader0 = ((Gson)this.a).newJsonReader(reader0);
        try {
            Object object1 = ((TypeAdapter)this.b).read(jsonReader0);
            if(jsonReader0.peek() == JsonToken.END_DOCUMENT) {
                return object1;
            }
        }
        finally {
            ((ResponseBody)object0).close();
        }
        throw new JsonIOException("JSON document was not fully consumed.");
    }

    @Override  // okhttp3.Callback
    public void onFailure(Call call0, IOException iOException0) {
        try {
            ((retrofit2.Callback)this.a).onFailure(((s)this.b), iOException0);
        }
        catch(Throwable throwable0) {
            p0.p(throwable0);
            throwable0.printStackTrace();
        }
    }

    @Override  // okhttp3.Callback
    public void onResponse(Call call0, Response response0) {
        retrofit2.Response response1;
        retrofit2.Callback callback0 = (retrofit2.Callback)this.a;
        s s0 = (s)this.b;
        try {
            response1 = s0.c(response0);
        }
        catch(Throwable throwable0) {
            p0.p(throwable0);
            try {
                callback0.onFailure(s0, throwable0);
            }
            catch(Throwable throwable1) {
                p0.p(throwable1);
                throwable1.printStackTrace();
            }
            return;
        }
        try {
            callback0.onResponse(s0, response1);
        }
        catch(Throwable throwable2) {
            p0.p(throwable2);
            throwable2.printStackTrace();
        }
    }
}

