package s4;

import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PagingState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;

public final class g0 {
    public final PageFetcherSnapshot a;
    public final PagingState b;
    public final CompletableJob c;

    public g0(PageFetcherSnapshot pageFetcherSnapshot0, PagingState pagingState0, CompletableJob completableJob0) {
        Intrinsics.checkNotNullParameter(pageFetcherSnapshot0, "snapshot");
        Intrinsics.checkNotNullParameter(completableJob0, "job");
        super();
        this.a = pageFetcherSnapshot0;
        this.b = pagingState0;
        this.c = completableJob0;
    }
}

