package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.room.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzer {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final o d;

    public zzer(o o0, String s, Bundle bundle0) {
        this.d = o0;
        super();
        new String("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }

    // This method was un-flattened
    @WorkerThread
    public final Bundle zza() {
        if(this.c == null) {
            o o0 = this.d;
            String s = o0.a().getString(this.a, null);
            if(s != null) {
                try {
                    Bundle bundle0 = new Bundle();
                    JSONArray jSONArray0 = new JSONArray(s);
                    for(int v = 0; true; ++v) {
                        if(v >= jSONArray0.length()) {
                            this.c = bundle0;
                            break;
                        }
                        try {
                            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                            String s1 = jSONObject0.getString("n");
                            String s2 = jSONObject0.getString("t");
                            switch(s2) {
                                case "d": {
                                    bundle0.putDouble(s1, Double.parseDouble(jSONObject0.getString("v")));
                                    break;
                                }
                                case "l": {
                                    bundle0.putLong(s1, Long.parseLong(jSONObject0.getString("v")));
                                    break;
                                }
                                case "s": {
                                    bundle0.putString(s1, jSONObject0.getString("v"));
                                    break;
                                }
                                default: {
                                    o0.zzt.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", s2);
                                }
                            }
                        }
                        catch(JSONException | NumberFormatException unused_ex) {
                            o0.zzt.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                }
                catch(JSONException unused_ex) {
                    a.v(o0.zzt, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if(this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }

    @WorkerThread
    public final void zzb(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        o o0 = this.d;
        SharedPreferences.Editor sharedPreferences$Editor0 = o0.a().edit();
        String s = this.a;
        if(bundle0.size() == 0) {
            sharedPreferences$Editor0.remove(s);
        }
        else {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: bundle0.keySet()) {
                String s1 = (String)object0;
                Object object1 = bundle0.get(s1);
                if(object1 != null) {
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("n", s1);
                        jSONObject0.put("v", object1.toString());
                        if(object1 instanceof String) {
                            jSONObject0.put("t", "s");
                        }
                        else {
                            if(object1 instanceof Long) {
                                jSONObject0.put("t", "l");
                                jSONArray0.put(jSONObject0);
                            }
                            else if(object1 instanceof Double) {
                                jSONObject0.put("t", "d");
                                jSONArray0.put(jSONObject0);
                            }
                            else {
                                o0.zzt.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", object1.getClass());
                            }
                            continue;
                        }
                        jSONArray0.put(jSONObject0);
                        continue;
                    }
                    catch(JSONException jSONException0) {
                    }
                    o0.zzt.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", jSONException0);
                }
            }
            sharedPreferences$Editor0.putString(s, jSONArray0.toString());
        }
        sharedPreferences$Editor0.apply();
        this.c = bundle0;
    }
}

