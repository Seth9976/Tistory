package q;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService.Stub;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;

public final class f extends Stub {
    public final CustomTabsService a;

    public f(CustomTabsService customTabsService0) {
        this.a = customTabsService0;
        super();
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final Bundle extraCommand(String s, Bundle bundle0) {
        return this.a.extraCommand(s, bundle0);
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback0, Uri uri0, Bundle bundle0, List list0) {
        CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(iCustomTabsCallback0);
        return this.a.mayLaunchUrl(customTabsSessionToken0, uri0, bundle0, list0);
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean newSession(ICustomTabsCallback iCustomTabsCallback0) {
        CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(iCustomTabsCallback0);
        try {
            e e0 = new e(this, customTabsSessionToken0);
            synchronized(this.a.a) {
                iCustomTabsCallback0.asBinder().linkToDeath(e0, 0);
                IBinder iBinder0 = iCustomTabsCallback0.asBinder();
                this.a.a.put(iBinder0, e0);
            }
            return this.a.newSession(customTabsSessionToken0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final int postMessage(ICustomTabsCallback iCustomTabsCallback0, String s, Bundle bundle0) {
        CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(iCustomTabsCallback0);
        return this.a.postMessage(customTabsSessionToken0, s, bundle0);
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback0, Uri uri0) {
        CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(iCustomTabsCallback0);
        return this.a.requestPostMessageChannel(customTabsSessionToken0, uri0);
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback0, Bundle bundle0) {
        CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(iCustomTabsCallback0);
        return this.a.updateVisuals(customTabsSessionToken0, bundle0);
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback0, int v, Uri uri0, Bundle bundle0) {
        CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(iCustomTabsCallback0);
        return this.a.validateRelationship(customTabsSessionToken0, v, uri0, bundle0);
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean warmup(long v) {
        return this.a.warmup(v);
    }
}

