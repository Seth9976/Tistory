package q;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsSessionToken;

public final class h extends CustomTabsCallback {
    public final CustomTabsSessionToken a;

    public h(CustomTabsSessionToken customTabsSessionToken0) {
        this.a = customTabsSessionToken0;
        super();
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String s, Bundle bundle0) {
        try {
            this.a.a.extraCallback(s, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle0) {
        try {
            this.a.a.onMessageChannelReady(bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int v, Bundle bundle0) {
        try {
            this.a.a.onNavigationEvent(v, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String s, Bundle bundle0) {
        try {
            this.a.a.onPostMessage(s, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int v, Uri uri0, boolean z, Bundle bundle0) {
        try {
            this.a.a.onRelationshipValidationResult(v, uri0, z, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }
}

