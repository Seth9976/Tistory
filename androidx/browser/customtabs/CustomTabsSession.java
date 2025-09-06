package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.ICustomTabsService;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import q.i;

public final class CustomTabsSession {
    public final Object a;
    public final ICustomTabsService b;
    public final Stub c;
    public final ComponentName d;

    public CustomTabsSession(ICustomTabsService iCustomTabsService0, Stub iCustomTabsCallback$Stub0, ComponentName componentName0) {
        this.a = new Object();
        this.b = iCustomTabsService0;
        this.c = iCustomTabsCallback$Stub0;
        this.d = componentName0;
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName0) {
        return new CustomTabsSession(null, new i(), componentName0);  // 初始化器: Landroid/support/customtabs/ICustomTabsCallback$Stub;-><init>()V
    }

    public boolean mayLaunchUrl(Uri uri0, Bundle bundle0, List list0) {
        try {
            return this.b.mayLaunchUrl(this.c, uri0, bundle0, list0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public int postMessage(String s, Bundle bundle0) {
        synchronized(this.a) {
            try {
                return this.b.postMessage(this.c, s, bundle0);
            }
            catch(RemoteException unused_ex) {
                return -2;
            }
        }
    }

    public boolean requestPostMessageChannel(Uri uri0) {
        try {
            return this.b.requestPostMessageChannel(this.c, uri0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean setActionButton(@NonNull Bitmap bitmap0, @NonNull String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
        bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
        Bundle bundle1 = new Bundle();
        bundle1.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle0);
        try {
            return this.b.updateVisuals(this.c, bundle1);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews0, @Nullable int[] arr_v, @Nullable PendingIntent pendingIntent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews0);
        bundle0.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", arr_v);
        bundle0.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent0);
        try {
            return this.b.updateVisuals(this.c, bundle0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int v, @NonNull Bitmap bitmap0, @NonNull String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("android.support.customtabs.customaction.ID", v);
        bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
        bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
        Bundle bundle1 = new Bundle();
        bundle1.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle0);
        try {
            return this.b.updateVisuals(this.c, bundle1);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean validateRelationship(int v, @NonNull Uri uri0, @Nullable Bundle bundle0) {
        if(v >= 1 && v <= 2) {
            try {
                return this.b.validateRelationship(this.c, v, uri0, bundle0);
            }
            catch(RemoteException unused_ex) {
            }
        }
        return false;
    }
}

