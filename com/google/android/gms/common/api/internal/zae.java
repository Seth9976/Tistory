package com.google.android.gms.common.api.internal;

import a5.b;
import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public final class zae extends zai {
    protected final ApiMethodImpl zaa;

    public zae(int v, ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        super(v);
        this.zaa = (ApiMethodImpl)Preconditions.checkNotNull(baseImplementation$ApiMethodImpl0, "Null methods are not runnable.");
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status0) {
        try {
            this.zaa.setFailedResult(status0);
        }
        catch(IllegalStateException illegalStateException0) {
            Log.w("ApiCallRunner", "Exception reporting failure", illegalStateException0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exception0) {
        String s = exception0.getClass().getSimpleName();
        String s1 = exception0.getLocalizedMessage();
        Status status0 = new Status(10, b.q(new StringBuilder(s.length() + 2 + String.valueOf(s1).length()), s, ": ", s1));
        try {
            this.zaa.setFailedResult(status0);
        }
        catch(IllegalStateException illegalStateException0) {
            Log.w("ApiCallRunner", "Exception reporting failure", illegalStateException0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabq0) throws DeadObjectException {
        try {
            this.zaa.run(zabq0.zaf());
        }
        catch(RuntimeException runtimeException0) {
            this.zae(runtimeException0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaad0, boolean z) {
        zaad0.a.put(this.zaa, Boolean.valueOf(z));
        c c0 = new c(zaad0, this.zaa);
        this.zaa.addStatusListener(c0);
    }
}

