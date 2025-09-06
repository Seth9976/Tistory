package q;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

public final class a extends CustomTabsServiceConnection {
    public final Context a;

    public a(Context context0) {
        this.a = context0;
        super();
    }

    @Override  // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName0, CustomTabsClient customTabsClient0) {
        customTabsClient0.warmup(0L);
        this.a.unbindService(this);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
    }
}

