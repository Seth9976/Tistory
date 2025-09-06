package q;

import android.net.Uri;
import android.os.Bundle;

public final class c implements Runnable {
    public final int a;
    public final Uri b;
    public final boolean c;
    public final Bundle d;
    public final d e;

    public c(d d0, int v, Uri uri0, boolean z, Bundle bundle0) {
        this.e = d0;
        this.a = v;
        this.b = uri0;
        this.c = z;
        this.d = bundle0;
    }

    @Override
    public final void run() {
        this.e.b.onRelationshipValidationResult(this.a, this.b, this.c, this.d);
    }
}

