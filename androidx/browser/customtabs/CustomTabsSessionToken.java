package androidx.browser.customtabs;

import android.content.Intent;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.NonNull;
import androidx.core.app.BundleCompat;
import q.h;
import q.i;

public class CustomTabsSessionToken {
    public final ICustomTabsCallback a;
    public final h b;

    public CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback0) {
        this.a = iCustomTabsCallback0;
        this.b = new h(this);
    }

    @NonNull
    public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new i());  // 初始化器: Landroid/support/customtabs/ICustomTabsCallback$Stub;-><init>()V
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CustomTabsSessionToken ? ((CustomTabsSessionToken)object0).a.asBinder().equals(this.a.asBinder()) : false;
    }

    public CustomTabsCallback getCallback() {
        return this.b;
    }

    public static CustomTabsSessionToken getSessionTokenFromIntent(Intent intent0) {
        IBinder iBinder0 = BundleCompat.getBinder(intent0.getExtras(), "android.support.customtabs.extra.SESSION");
        return iBinder0 == null ? null : new CustomTabsSessionToken(Stub.asInterface(iBinder0));
    }

    @Override
    public int hashCode() {
        return this.a.asBinder().hashCode();
    }

    public boolean isAssociatedWith(CustomTabsSession customTabsSession0) {
        return customTabsSession0.c.asBinder().equals(this.a);
    }
}

