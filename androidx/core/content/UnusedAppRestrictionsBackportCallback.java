package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

public class UnusedAppRestrictionsBackportCallback {
    public final IUnusedAppRestrictionsBackportCallback a;

    @RestrictTo({Scope.LIBRARY})
    public UnusedAppRestrictionsBackportCallback(@NonNull IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) {
        this.a = iUnusedAppRestrictionsBackportCallback0;
    }

    public void onResult(boolean z, boolean z1) throws RemoteException {
        this.a.onIsPermissionRevocationEnabledForAppResult(z, z1);
    }
}

