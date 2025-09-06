package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;

public final class Batch extends BasePendingResult {
    public static final class Builder {
        public final ArrayList a;
        public final GoogleApiClient b;

        public Builder(@NonNull GoogleApiClient googleApiClient0) {
            this.a = new ArrayList();
            this.b = googleApiClient0;
        }

        @NonNull
        public BatchResultToken add(@NonNull PendingResult pendingResult0) {
            BatchResultToken batchResultToken0 = new BatchResultToken(this.a.size());
            this.a.add(pendingResult0);
            return batchResultToken0;
        }

        @NonNull
        public Batch build() {
            return new Batch(this.a, this.b);
        }
    }

    public int o;
    public boolean p;
    public boolean q;
    public final PendingResult[] r;
    public final Object s;

    public Batch(ArrayList arrayList0, GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
        this.s = new Object();
        int v = arrayList0.size();
        this.o = v;
        PendingResult[] arr_pendingResult = new PendingResult[v];
        this.r = arr_pendingResult;
        if(!arrayList0.isEmpty()) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                PendingResult pendingResult0 = (PendingResult)arrayList0.get(v1);
                this.r[v1] = pendingResult0;
                pendingResult0.addStatusListener(new a(this));
            }
            return;
        }
        this.setResult(new BatchResult(Status.RESULT_SUCCESS, arr_pendingResult));
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public void cancel() {
        super.cancel();
        PendingResult[] arr_pendingResult = this.r;
        for(int v = 0; v < arr_pendingResult.length; ++v) {
            arr_pendingResult[v].cancel();
        }
    }

    @NonNull
    public BatchResult createFailedResult(@NonNull Status status0) {
        return new BatchResult(status0, this.r);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public final Result createFailedResult(@NonNull Status status0) {
        return this.createFailedResult(status0);
    }
}

