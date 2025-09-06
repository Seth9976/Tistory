package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public final class b extends zag {
    public final Intent a;
    public final LifecycleFragment b;

    public b(Intent intent0, LifecycleFragment lifecycleFragment0) {
        this.a = intent0;
        this.b = lifecycleFragment0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent0 = this.a;
        if(intent0 != null) {
            this.b.startActivityForResult(intent0, 2);
        }
    }
}

