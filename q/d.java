package q;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.ICustomTabsCallback.Stub;
import androidx.appcompat.widget.w0;
import androidx.browser.customtabs.CustomTabsCallback;
import l5.a;

public final class d extends Stub {
    public final Handler a;
    public final CustomTabsCallback b;

    public d(CustomTabsCallback customTabsCallback0) {
        this.b = customTabsCallback0;
        super();
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String s, Bundle bundle0) {
        if(this.b == null) {
            return;
        }
        b b0 = new b(this, s, bundle0, 0);
        this.a.post(b0);
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle0) {
        if(this.b == null) {
            return;
        }
        a a0 = new a(1, this, bundle0);
        this.a.post(a0);
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int v, Bundle bundle0) {
        if(this.b == null) {
            return;
        }
        w0 w00 = new w0(this, v, bundle0, 4);
        this.a.post(w00);
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String s, Bundle bundle0) {
        if(this.b == null) {
            return;
        }
        b b0 = new b(this, s, bundle0, 1);
        this.a.post(b0);
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int v, Uri uri0, boolean z, Bundle bundle0) {
        if(this.b == null) {
            return;
        }
        c c0 = new c(this, v, uri0, z, bundle0);
        this.a.post(c0);
    }
}

