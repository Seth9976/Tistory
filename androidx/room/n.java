package androidx.room;

import android.content.ContentValues;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final String w;
    public final int x;
    public final ContentValues y;

    public n(String s, int v, ContentValues contentValues0) {
        this.w = s;
        this.x = v;
        this.y = contentValues0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "db");
        return ((SupportSQLiteDatabase)object0).insert(this.w, this.x, this.y);
    }
}

