package androidx.room;

import kotlin.jvm.internal.Intrinsics;

public final class x0 implements Runnable {
    public final int a;
    public final QueryInterceptorStatement b;

    public x0(QueryInterceptorStatement queryInterceptorStatement0, int v) {
        this.a = v;
        this.b = queryInterceptorStatement0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.d.onQuery(this.b.b, this.b.e);
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.d.onQuery(this.b.b, this.b.e);
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.d.onQuery(this.b.b, this.b.e);
                return;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.d.onQuery(this.b.b, this.b.e);
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.d.onQuery(this.b.b, this.b.e);
            }
        }
    }
}

