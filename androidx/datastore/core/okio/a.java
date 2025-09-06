package androidx.datastore.core.okio;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final OkioStorage w;

    public a(OkioStorage okioStorage0) {
        this.w = okioStorage0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        synchronized(OkioStorage.Companion.getActiveFilesLock()) {
            OkioStorage.Companion.getActiveFiles$datastore_core_okio().remove(OkioStorage.access$getCanonicalPath(this.w).toString());
            return Unit.INSTANCE;
        }
    }
}

