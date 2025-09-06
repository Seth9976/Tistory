package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class StatusRunnable implements Runnable {
    public final SettableFuture a;

    public StatusRunnable() {
        this.a = SettableFuture.create();
    }

    public abstract Object a();

    @NonNull
    public static StatusRunnable forStringIds(@NonNull WorkManagerImpl workManagerImpl0, @NonNull List list0) {
        return new h(workManagerImpl0, list0);
    }

    @NonNull
    public static StatusRunnable forTag(@NonNull WorkManagerImpl workManagerImpl0, @NonNull String s) {
        return new j(workManagerImpl0, s);
    }

    @NonNull
    public static StatusRunnable forUUID(@NonNull WorkManagerImpl workManagerImpl0, @NonNull UUID uUID0) {
        return new i(workManagerImpl0, uUID0);
    }

    @NonNull
    public static StatusRunnable forUniqueWork(@NonNull WorkManagerImpl workManagerImpl0, @NonNull String s) {
        return new k(workManagerImpl0, s);
    }

    @NonNull
    public static StatusRunnable forWorkQuerySpec(@NonNull WorkManagerImpl workManagerImpl0, @NonNull WorkQuery workQuery0) {
        return new l(workManagerImpl0, workQuery0);
    }

    @NonNull
    public ListenableFuture getFuture() {
        return this.a;
    }

    @Override
    public void run() {
        SettableFuture settableFuture0;
        try {
            settableFuture0 = this.a;
            settableFuture0.set(this.a());
        }
        catch(Throwable throwable0) {
            settableFuture0.setException(throwable0);
        }
    }
}

