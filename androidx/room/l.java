package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final String w;
    public final Object[] x;

    public l(String s, Object[] arr_object) {
        this.w = s;
        this.x = arr_object;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "db");
        ((SupportSQLiteDatabase)object0).execSQL(this.w, this.x);
        return null;
    }
}

