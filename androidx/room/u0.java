package androidx.room;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class u0 implements Runnable {
    public final int a;
    public final QueryInterceptorDatabase b;

    public u0(QueryInterceptorDatabase queryInterceptorDatabase0, int v) {
        this.a = v;
        this.b = queryInterceptorDatabase0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.c.onQuery("END TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.c.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.c.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.c.onQuery("TRANSACTION SUCCESSFUL", CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.c.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.c.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
            }
        }
    }
}

