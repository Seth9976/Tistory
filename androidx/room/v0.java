package androidx.room;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class v0 implements Runnable {
    public final int a;
    public final QueryInterceptorDatabase b;
    public final String c;

    public v0(QueryInterceptorDatabase queryInterceptorDatabase0, String s, int v) {
        this.a = v;
        this.b = queryInterceptorDatabase0;
        this.c = s;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "this$0");
            Intrinsics.checkNotNullParameter(this.c, "$sql");
            this.b.c.onQuery(this.c, CollectionsKt__CollectionsKt.emptyList());
            return;
        }
        Intrinsics.checkNotNullParameter(this.b, "this$0");
        Intrinsics.checkNotNullParameter(this.c, "$query");
        this.b.c.onQuery(this.c, CollectionsKt__CollectionsKt.emptyList());
    }
}

