package androidx.work.impl.utils;

import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.UUID;

public final class o implements Runnable {
    public final UUID a;
    public final Data b;
    public final SettableFuture c;
    public final WorkProgressUpdater d;

    public o(WorkProgressUpdater workProgressUpdater0, UUID uUID0, Data data0, SettableFuture settableFuture0) {
        this.d = workProgressUpdater0;
        this.a = uUID0;
        this.b = data0;
        this.c = settableFuture0;
    }

    @Override
    public final void run() {
        SettableFuture settableFuture0 = this.c;
        String s = this.a.toString();
        Logger logger0 = Logger.get();
        Data data0 = this.b;
        logger0.debug("WM-WorkProgressUpdater", "Updating progress for " + this.a + " (" + data0 + ")");
        WorkProgressUpdater workProgressUpdater0 = this.d;
        workProgressUpdater0.a.beginTransaction();
        try {
            WorkSpec workSpec0 = workProgressUpdater0.a.workSpecDao().getWorkSpec(s);
            if(workSpec0 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if(workSpec0.state == State.RUNNING) {
                WorkProgress workProgress0 = new WorkProgress(s, data0);
                workProgressUpdater0.a.workProgressDao().insert(workProgress0);
            }
            else {
                Logger.get().warning("WM-WorkProgressUpdater", "Ignoring setProgressAsync(...). WorkSpec (" + s + ") is not in a RUNNING state.");
            }
            settableFuture0.set(null);
            workProgressUpdater0.a.setTransactionSuccessful();
            goto label_25;
        }
        catch(Throwable throwable0) {
        }
        try {
            Logger.get().error("WM-WorkProgressUpdater", "Error updating Worker progress", throwable0);
            settableFuture0.setException(throwable0);
        }
        catch(Throwable throwable1) {
            workProgressUpdater0.a.endTransaction();
            throw throwable1;
        }
    label_25:
        workProgressUpdater0.a.endTransaction();
    }
}

