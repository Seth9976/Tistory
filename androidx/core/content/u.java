package androidx.core.content;

import android.util.Log;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub;

public final class u extends Stub {
    public final v a;

    public u(v v0) {
        this.a = v0;
        super();
    }

    @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
    public final void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z1) {
        v v0 = this.a;
        if(z) {
            if(z1) {
                v0.b.set(3);
                return;
            }
            v0.b.set(2);
            return;
        }
        v0.b.set(0);
        Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
    }
}

