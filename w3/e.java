package w3;

import androidx.datastore.core.DataStoreImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final int w;
    public final DataStoreImpl x;

    public e(DataStoreImpl dataStoreImpl0, int v) {
        this.w = v;
        this.x = dataStoreImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? this.x.a.createConnection() : this.x.getStorageConnection$datastore_core_release().getCoordinator();
    }
}

