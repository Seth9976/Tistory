package q;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback.Stub;

public final class i extends Stub {
    @Override  // android.support.customtabs.ICustomTabsCallback$Stub
    public final IBinder asBinder() {
        return this;
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String s, Bundle bundle0) {
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle0) {
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int v, Bundle bundle0) {
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String s, Bundle bundle0) {
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int v, Uri uri0, boolean z, Bundle bundle0) {
    }
}

