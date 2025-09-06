package androidx.room;

import android.content.ContentValues;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final Object[] A;
    public final String w;
    public final int x;
    public final ContentValues y;
    public final String z;

    public d0(String s, int v, ContentValues contentValues0, String s1, Object[] arr_object) {
        this.w = s;
        this.x = v;
        this.y = contentValues0;
        this.z = s1;
        this.A = arr_object;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "db");
        return ((SupportSQLiteDatabase)object0).update(this.w, this.x, this.y, this.z, this.A);
    }
}

