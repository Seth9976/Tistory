package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements Initializer {
    public static final String a;

    static {
        WorkManagerInitializer.a = "WM-WrkMgrInitializer";
    }

    @NonNull
    public WorkManager create(@NonNull Context context0) {
        Logger.get().debug("WM-WrkMgrInitializer", "Initializing WorkManager with default configuration.");
        WorkManager.initialize(context0, new Builder().build());
        return WorkManager.getInstance(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public Object create(@NonNull Context context0) {
        return this.create(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public List dependencies() {
        return Collections.emptyList();
    }
}

