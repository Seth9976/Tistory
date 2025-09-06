package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService.Stub;
import q.g;

public abstract class CustomTabsServiceConnection implements ServiceConnection {
    public abstract void onCustomTabsServiceConnected(ComponentName arg1, CustomTabsClient arg2);

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.onCustomTabsServiceConnected(componentName0, new g(Stub.asInterface(iBinder0), componentName0));  // 初始化器: Landroidx/browser/customtabs/CustomTabsClient;-><init>(Landroid/support/customtabs/ICustomTabsService;Landroid/content/ComponentName;)V
    }
}

