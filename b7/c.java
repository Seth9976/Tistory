package b7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.service.zaa;

public final class c extends zaa {
    public final b a;

    public c(b b0) {
        this.a = b0;
    }

    @Override  // com.google.android.gms.common.internal.service.zaa
    public final void zab(int v) {
        Status status0 = new Status(v);
        this.a.setResult(status0);
    }
}

