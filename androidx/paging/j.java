package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;

public final class j extends Lambda implements Function0 {
    public final CoroutineDispatcher w;
    public final Factory x;

    public j(CoroutineDispatcher coroutineDispatcher0, Factory dataSource$Factory0) {
        this.w = coroutineDispatcher0;
        this.x = dataSource$Factory0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DataSource dataSource0 = this.x.create();
        return new LegacyPagingSource(this.w, dataSource0);
    }
}

