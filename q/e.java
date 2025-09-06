package q;

import android.os.IBinder.DeathRecipient;
import androidx.browser.customtabs.CustomTabsSessionToken;

public final class e implements IBinder.DeathRecipient {
    public final CustomTabsSessionToken a;
    public final f b;

    public e(f f0, CustomTabsSessionToken customTabsSessionToken0) {
        this.b = f0;
        this.a = customTabsSessionToken0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        this.b.a.cleanUpSession(this.a);
    }
}

