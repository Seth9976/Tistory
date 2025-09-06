package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final DataSource w;

    public l(DataSource dataSource0) {
        this.w = dataSource0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.w.isInvalid());
    }
}

