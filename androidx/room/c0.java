package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final long w;

    public c0(long v) {
        this.w = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "db");
        return ((SupportSQLiteDatabase)object0).setMaximumSize(this.w);
    }
}

