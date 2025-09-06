package com.google.android.gms.common.api;

public final class a implements StatusListener {
    public final Batch a;

    public a(Batch batch0) {
        this.a = batch0;
    }

    @Override  // com.google.android.gms.common.api.PendingResult$StatusListener
    public final void onComplete(Status status0) {
        synchronized(this.a.s) {
            if(this.a.isCanceled()) {
                return;
            }
            if(status0.isCanceled()) {
                this.a.q = true;
            }
            else if(!status0.isSuccess()) {
                this.a.p = true;
            }
            Batch batch0 = this.a;
            int v1 = batch0.o - 1;
            batch0.o = v1;
            if(v1 == 0) {
                if(batch0.q) {
                    batch0.super.cancel();
                }
                else {
                    BatchResult batchResult0 = new BatchResult((batch0.p ? new Status(13) : Status.RESULT_SUCCESS), this.a.r);
                    this.a.setResult(batchResult0);
                }
            }
        }
    }
}

