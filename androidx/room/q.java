package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public static final q w;

    static {
        q.w = new q(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "obj");
        return Boolean.valueOf(((SupportSQLiteDatabase)object0).isReadOnly());
    }
}

