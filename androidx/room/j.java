package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final String w;
    public final String x;
    public final Object[] y;

    public j(String s, String s1, Object[] arr_object) {
        this.w = s;
        this.x = s1;
        this.y = arr_object;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "db");
        return ((SupportSQLiteDatabase)object0).delete(this.w, this.x, this.y);
    }
}

