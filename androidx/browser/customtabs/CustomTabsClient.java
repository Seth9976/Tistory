package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import q.a;
import q.d;

public class CustomTabsClient {
    public final ICustomTabsService a;
    public final ComponentName b;

    public CustomTabsClient(ICustomTabsService iCustomTabsService0, ComponentName componentName0) {
        this.a = iCustomTabsService0;
        this.b = componentName0;
    }

    public static boolean bindCustomTabsService(Context context0, String s, CustomTabsServiceConnection customTabsServiceConnection0) {
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        if(!TextUtils.isEmpty(s)) {
            intent0.setPackage(s);
        }
        return context0.bindService(intent0, customTabsServiceConnection0, 33);
    }

    public static boolean connectAndInitialize(Context context0, String s) {
        if(s == null) {
            return false;
        }
        Context context1 = context0.getApplicationContext();
        a a0 = new a(context1);
        try {
            return CustomTabsClient.bindCustomTabsService(context1, s, a0);
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }

    public Bundle extraCommand(String s, Bundle bundle0) {
        try {
            return this.a.extraCommand(s, bundle0);
        }
        catch(RemoteException unused_ex) {
            return null;
        }
    }

    public static String getPackageName(Context context0, @Nullable List list0) {
        return CustomTabsClient.getPackageName(context0, list0, false);
    }

    public static String getPackageName(Context context0, @Nullable List list0, boolean z) {
        PackageManager packageManager0 = context0.getPackageManager();
        List list1 = list0 == null ? new ArrayList() : list0;
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if(!z) {
            ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
            if(resolveInfo0 != null) {
                String s = resolveInfo0.activityInfo.packageName;
                ArrayList arrayList0 = new ArrayList(list1.size() + 1);
                arrayList0.add(s);
                if(list0 != null) {
                    arrayList0.addAll(list0);
                }
                list1 = arrayList0;
            }
        }
        Intent intent1 = new Intent("android.support.customtabs.action.CustomTabsService");
        for(Object object0: list1) {
            String s1 = (String)object0;
            intent1.setPackage(s1);
            if(packageManager0.resolveService(intent1, 0) != null) {
                return s1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback0) {
        ICustomTabsService iCustomTabsService0 = this.a;
        d d0 = new d(customTabsCallback0);
        try {
            if(!iCustomTabsService0.newSession(d0)) {
                return null;
            }
        }
        catch(RemoteException unused_ex) {
            return null;
        }
        return new CustomTabsSession(iCustomTabsService0, d0, this.b);
    }

    public boolean warmup(long v) {
        try {
            return this.a.warmup(v);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }
}

