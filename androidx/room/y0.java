package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function1 {
    public final int w;
    public final RoomDatabase x;

    public y0(RoomDatabase roomDatabase0, int v) {
        this.w = v;
        this.x = roomDatabase0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "it");
            RoomDatabase.access$internalEndTransaction(this.x);
            return null;
        }
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "it");
        RoomDatabase.access$internalBeginTransaction(this.x);
        return null;
    }
}

