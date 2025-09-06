package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c implements RegistrarNameRetriever {
    public final Class a;

    public c(Class class0) {
        this.a = class0;
    }

    @Override  // com.google.firebase.components.ComponentDiscovery$RegistrarNameRetriever
    public final List retrieve(Object object0) {
        Context context0 = (Context)object0;
        Class class0 = this.a;
        Bundle bundle0 = null;
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            }
            else {
                ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, class0), 0x80);
                if(serviceInfo0 == null) {
                    Log.w("ComponentDiscovery", class0 + " has no service info.");
                }
                else {
                    bundle0 = serviceInfo0.metaData;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if(bundle0 == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
        }
        List list0 = new ArrayList();
        for(Object object1: bundle0.keySet()) {
            String s = (String)object1;
            if("com.google.firebase.components.ComponentRegistrar".equals(bundle0.get(s)) && s.startsWith("com.google.firebase.components:")) {
                ((ArrayList)list0).add(s.substring(0x1F));
            }
        }
        return list0;
    }
}

