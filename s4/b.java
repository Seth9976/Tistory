package s4;

import androidx.paging.AsyncPagedListDiffer;
import androidx.paging.PagedList;
import androidx.paging.PlaceholderPaddedDiffResult;
import androidx.paging.RecordingCallback;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Runnable {
    public final AsyncPagedListDiffer a;
    public final int b;
    public final PagedList c;
    public final PagedList d;
    public final PlaceholderPaddedDiffResult e;
    public final RecordingCallback f;
    public final PagedList g;
    public final Runnable h;

    public b(AsyncPagedListDiffer asyncPagedListDiffer0, int v, PagedList pagedList0, PagedList pagedList1, PlaceholderPaddedDiffResult placeholderPaddedDiffResult0, RecordingCallback recordingCallback0, PagedList pagedList2, Runnable runnable0) {
        this.a = asyncPagedListDiffer0;
        this.b = v;
        this.c = pagedList0;
        this.d = pagedList1;
        this.e = placeholderPaddedDiffResult0;
        this.f = recordingCallback0;
        this.g = pagedList2;
        this.h = runnable0;
    }

    @Override
    public final void run() {
        AsyncPagedListDiffer asyncPagedListDiffer0 = this.a;
        Intrinsics.checkNotNullParameter(asyncPagedListDiffer0, "this$0");
        PagedList pagedList0 = this.d;
        Intrinsics.checkNotNullParameter(pagedList0, "$newSnapshot");
        PlaceholderPaddedDiffResult placeholderPaddedDiffResult0 = this.e;
        Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult0, "$result");
        RecordingCallback recordingCallback0 = this.f;
        Intrinsics.checkNotNullParameter(recordingCallback0, "$recordingCallback");
        if(asyncPagedListDiffer0.f == this.b) {
            int v = this.g.lastLoad();
            asyncPagedListDiffer0.latchPagedList$paging_runtime_release(this.c, pagedList0, placeholderPaddedDiffResult0, recordingCallback0, v, this.h);
        }
    }
}

