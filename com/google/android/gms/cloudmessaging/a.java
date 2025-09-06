package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.regex.Matcher;

public final class a extends zzf {
    public final Rpc a;

    public a(Rpc rpc0, Looper looper0) {
        this.a = rpc0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        Rpc rpc0 = this.a;
        if(message0 == null) {
            Log.w("Rpc", "Dropping invalid message");
        }
        else {
            Object object0 = message0.obj;
            if(!(object0 instanceof Intent)) {
                Log.w("Rpc", "Dropping invalid message");
                return;
            }
            ((Intent)object0).setExtrasClassLoader(new zzc());
            if(((Intent)object0).hasExtra("google.messenger")) {
                Parcelable parcelable0 = ((Intent)object0).getParcelableExtra("google.messenger");
                if(parcelable0 instanceof zzd) {
                    rpc0.g = (zzd)parcelable0;
                }
                if(parcelable0 instanceof Messenger) {
                    rpc0.f = (Messenger)parcelable0;
                }
            }
            Intent intent0 = (Intent)message0.obj;
            String s = intent0.getAction();
            if("com.google.android.c2dm.intent.REGISTRATION".equals(s)) {
                String s2 = intent0.getStringExtra("registration_id");
                if(s2 == null) {
                    s2 = intent0.getStringExtra("unregistered");
                }
                if(s2 == null) {
                    String s3 = intent0.getStringExtra("error");
                    if(s3 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id " + intent0.getExtras());
                        return;
                    }
                    if(Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", (s3.length() == 0 ? new String("Received InstanceID error ") : "Received InstanceID error " + s3));
                    }
                    if(s3.startsWith("|")) {
                        String[] arr_s = s3.split("\\|");
                        if(arr_s.length > 2 && "ID".equals(arr_s[1])) {
                            String s4 = arr_s[2];
                            String s5 = arr_s[3];
                            if(s5.startsWith(":")) {
                                s5 = s5.substring(1);
                            }
                            rpc0.b(s4, intent0.putExtra("error", s5).getExtras());
                            return;
                        }
                        Log.w("Rpc", (s3.length() == 0 ? new String("Unexpected structured response ") : "Unexpected structured response " + s3));
                        return;
                    }
                    synchronized(rpc0.a) {
                        for(int v1 = 0; v1 < rpc0.a.size(); ++v1) {
                            rpc0.b(((String)rpc0.a.keyAt(v1)), intent0.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher0 = Rpc.k.matcher(s2);
                if(matcher0.matches()) {
                    String s6 = matcher0.group(1);
                    String s7 = matcher0.group(2);
                    if(s6 != null) {
                        Bundle bundle0 = intent0.getExtras();
                        bundle0.putString("registration_id", s7);
                        rpc0.b(s6, bundle0);
                    }
                }
                else if(Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", (s2.length() == 0 ? new String("Unexpected response string: ") : "Unexpected response string: " + s2));
                }
            }
            else if(Log.isLoggable("Rpc", 3)) {
                String s1 = String.valueOf(s);
                Log.d("Rpc", (s1.length() == 0 ? new String("Unexpected response action: ") : "Unexpected response action: " + s1));
            }
        }
    }
}

