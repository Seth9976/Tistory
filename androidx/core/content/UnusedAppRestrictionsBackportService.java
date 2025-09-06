package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class UnusedAppRestrictionsBackportService extends Service {
    @SuppressLint({"ActionValue"})
    public static final String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    public final t a;

    public UnusedAppRestrictionsBackportService() {
        this.a = new t(this);
    }

    public abstract void isPermissionRevocationEnabled(@NonNull UnusedAppRestrictionsBackportCallback arg1);

    @Override  // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent0) {
        return this.a;
    }
}

