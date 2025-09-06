package androidx.core.content;

import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

public final class t extends Stub {
    public final UnusedAppRestrictionsBackportService a;

    public t(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService0) {
        this.a = unusedAppRestrictionsBackportService0;
        super();
    }

    @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
    public final void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) {
        if(iUnusedAppRestrictionsBackportCallback0 == null) {
            return;
        }
        UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback0 = new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback0);
        this.a.isPermissionRevocationEnabled(unusedAppRestrictionsBackportCallback0);
    }
}

