package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final LegacyPagingSource w;

    public s(LegacyPagingSource legacyPagingSource0) {
        this.w = legacyPagingSource0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.getDataSource$paging_common_release().removeInvalidatedCallback(new r(this.w));
        this.w.getDataSource$paging_common_release().invalidate();
        return Unit.INSTANCE;
    }
}

