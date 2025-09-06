package s4;

import androidx.paging.AsyncPagedListDiffer;
import androidx.paging.PagedList;
import androidx.paging.PlaceholderPaddedDiffResult;
import androidx.paging.PlaceholderPaddedListDiffHelperKt;
import androidx.paging.RecordingCallback;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Runnable {
    public final PagedList a;
    public final PagedList b;
    public final AsyncPagedListDiffer c;
    public final int d;
    public final PagedList e;
    public final RecordingCallback f;
    public final Runnable g;

    public a(PagedList pagedList0, PagedList pagedList1, AsyncPagedListDiffer asyncPagedListDiffer0, int v, PagedList pagedList2, RecordingCallback recordingCallback0, Runnable runnable0) {
        this.a = pagedList0;
        this.b = pagedList1;
        this.c = asyncPagedListDiffer0;
        this.d = v;
        this.e = pagedList2;
        this.f = recordingCallback0;
        this.g = runnable0;
    }

    @Override
    public final void run() {
        Intrinsics.checkNotNullParameter(this.b, "$newSnapshot");
        Intrinsics.checkNotNullParameter(this.c, "this$0");
        Intrinsics.checkNotNullParameter(this.f, "$recordingCallback");
        ItemCallback diffUtil$ItemCallback0 = this.c.a.getDiffCallback();
        Intrinsics.checkNotNullExpressionValue(diffUtil$ItemCallback0, "config.diffCallback");
        PlaceholderPaddedDiffResult placeholderPaddedDiffResult0 = PlaceholderPaddedListDiffHelperKt.computeDiff(this.a.getPlaceholderPaddedList(), this.b.getPlaceholderPaddedList(), diffUtil$ItemCallback0);
        this.c.b.execute(new b(this.c, this.d, this.e, this.b, placeholderPaddedDiffResult0, this.f, this.a, this.g));
    }
}

