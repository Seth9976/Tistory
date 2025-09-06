package com.google.android.gms.ads.identifier;

import android.net.Uri.Builder;
import android.net.Uri;
import java.util.HashMap;

public final class a extends Thread {
    public final HashMap a;

    public a(HashMap hashMap0) {
        this.a = hashMap0;
        super();
    }

    @Override
    public final void run() {
        Uri.Builder uri$Builder0 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap0 = this.a;
        for(Object object0: hashMap0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), ((String)hashMap0.get(((String)object0))));
        }
        zzc.zza(uri$Builder0.build().toString());
    }
}

