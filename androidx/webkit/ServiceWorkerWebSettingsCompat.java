package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

public abstract class ServiceWorkerWebSettingsCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheMode {
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    @NonNull
    public abstract Set getRequestedWithHeaderOriginAllowList();

    public abstract void setAllowContentAccess(boolean arg1);

    public abstract void setAllowFileAccess(boolean arg1);

    public abstract void setBlockNetworkLoads(boolean arg1);

    public abstract void setCacheMode(int arg1);

    public abstract void setRequestedWithHeaderOriginAllowList(@NonNull Set arg1);
}

