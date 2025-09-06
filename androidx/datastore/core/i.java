package androidx.datastore.core;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final File w;

    public i(File file0) {
        this.w = file0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        synchronized(FileStorage.Companion.getActiveFilesLock$datastore_core_release()) {
            FileStorage.Companion.getActiveFiles$datastore_core_release().remove(this.w.getAbsolutePath());
            return Unit.INSTANCE;
        }
    }
}

