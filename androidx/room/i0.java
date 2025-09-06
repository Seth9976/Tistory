package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function1 {
    public static final i0 A;
    public static final i0 B;
    public final int w;
    public static final i0 x;
    public static final i0 y;
    public static final i0 z;

    static {
        i0.x = new i0(1, 0);
        i0.y = new i0(1, 1);
        i0.z = new i0(1, 2);
        i0.A = new i0(1, 3);
        i0.B = new i0(1, 4);
    }

    public i0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((SupportSQLiteStatement)object0), "statement");
                ((SupportSQLiteStatement)object0).execute();
                return null;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((SupportSQLiteStatement)object0), "obj");
                return ((SupportSQLiteStatement)object0).executeInsert();
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((SupportSQLiteStatement)object0), "obj");
                return ((SupportSQLiteStatement)object0).executeUpdateDelete();
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((SupportSQLiteStatement)object0), "obj");
                return ((SupportSQLiteStatement)object0).simpleQueryForLong();
            }
            default: {
                Intrinsics.checkNotNullParameter(((SupportSQLiteStatement)object0), "obj");
                return ((SupportSQLiteStatement)object0).simpleQueryForString();
            }
        }
    }
}

