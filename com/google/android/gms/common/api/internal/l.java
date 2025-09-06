package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.zab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class l extends o {
    public final ArrayList b;
    public final zaaw c;

    public l(zaaw zaaw0, ArrayList arrayList0) {
        this.c = zaaw0;
        super(zaaw0);
        this.b = arrayList0;
    }

    @Override  // com.google.android.gms.common.api.internal.o
    public final void a() {
        Set set0;
        zaaw zaaw0 = this.c;
        zabe zabe0 = zaaw0.a.n;
        zabi zabi0 = zaaw0.a;
        ClientSettings clientSettings0 = zaaw0.r;
        if(clientSettings0 == null) {
            set0 = Collections.emptySet();
        }
        else {
            HashSet hashSet0 = new HashSet(clientSettings0.getRequiredScopes());
            Map map0 = clientSettings0.zad();
            for(Object object0: map0.keySet()) {
                Api api0 = (Api)object0;
                if(!zabi0.g.containsKey(api0.zab())) {
                    hashSet0.addAll(((zab)map0.get(api0)).zaa);
                }
            }
            set0 = hashSet0;
        }
        zabe0.p = set0;
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Client)arrayList0.get(v1)).getRemoteService(zaaw0.o, zabi0.n.p);
        }
    }
}

