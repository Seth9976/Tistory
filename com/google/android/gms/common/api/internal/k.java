package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.HashMap;

public final class k extends o {
    public final HashMap b;
    public final zaaw c;

    public k(zaaw zaaw0, HashMap hashMap0) {
        this.c = zaaw0;
        super(zaaw0);
        this.b = hashMap0;
    }

    @Override  // com.google.android.gms.common.api.internal.o
    public final void a() {
        zaaw zaaw0 = this.c;
        zal zal0 = new zal(zaaw0.d);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            Client api$Client0 = (Client)object0;
            if(api$Client0.requiresGooglePlayServices() && !((h)hashMap0.get(api$Client0)).c) {
                arrayList0.add(api$Client0);
            }
            else {
                arrayList1.add(api$Client0);
            }
        }
        Context context0 = zaaw0.c;
        int v = -1;
        int v1 = 0;
        if(arrayList0.isEmpty()) {
            int v2 = arrayList1.size();
            while(v1 < v2) {
                v = zal0.zab(context0, ((Client)arrayList1.get(v1)));
                ++v1;
                if(v == 0) {
                    break;
                }
            }
        }
        else {
            int v3 = arrayList0.size();
            while(v1 < v3) {
                v = zal0.zab(context0, ((Client)arrayList0.get(v1)));
                ++v1;
                if(v != 0) {
                    break;
                }
            }
        }
        zabi zabi0 = zaaw0.a;
        if(v != 0) {
            i i0 = new i(this, zaaw0, new ConnectionResult(v, null));
            Message message0 = zabi0.e.obtainMessage(1, i0);
            zabi0.e.sendMessage(message0);
            return;
        }
        if(zaaw0.m) {
            zae zae0 = zaaw0.k;
            if(zae0 != null) {
                zae0.zab();
            }
        }
        for(Object object1: hashMap0.keySet()) {
            Client api$Client1 = (Client)object1;
            ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0 = (ConnectionProgressReportCallbacks)hashMap0.get(api$Client1);
            if(api$Client1.requiresGooglePlayServices() && zal0.zab(context0, api$Client1) != 0) {
                j j0 = new j(zaaw0, baseGmsClient$ConnectionProgressReportCallbacks0);
                Message message1 = zabi0.e.obtainMessage(1, j0);
                zabi0.e.sendMessage(message1);
            }
            else {
                api$Client1.connect(baseGmsClient$ConnectionProgressReportCallbacks0);
            }
        }
    }
}

