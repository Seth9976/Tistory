package androidx.room;

import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class w0 implements Runnable {
    public final int a;
    public final QueryInterceptorDatabase b;
    public final SupportSQLiteQuery c;
    public final QueryInterceptorProgram d;

    public w0(QueryInterceptorDatabase queryInterceptorDatabase0, SupportSQLiteQuery supportSQLiteQuery0, QueryInterceptorProgram queryInterceptorProgram0, int v) {
        this.a = v;
        this.b = queryInterceptorDatabase0;
        this.c = supportSQLiteQuery0;
        this.d = queryInterceptorProgram0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "this$0");
            Intrinsics.checkNotNullParameter(this.c, "$query");
            Intrinsics.checkNotNullParameter(this.d, "$queryInterceptorProgram");
            String s = this.c.getSql();
            List list0 = this.d.getBindArgsCache$room_runtime_release();
            this.b.c.onQuery(s, list0);
            return;
        }
        Intrinsics.checkNotNullParameter(this.b, "this$0");
        Intrinsics.checkNotNullParameter(this.c, "$query");
        Intrinsics.checkNotNullParameter(this.d, "$queryInterceptorProgram");
        String s1 = this.c.getSql();
        List list1 = this.d.getBindArgsCache$room_runtime_release();
        this.b.c.onQuery(s1, list1);
    }
}

