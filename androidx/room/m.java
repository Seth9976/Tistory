package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class m extends FunctionReferenceImpl implements Function1 {
    public static final m a;

    static {
        m.a = new m(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "p0");
        return Boolean.valueOf(((SupportSQLiteDatabase)object0).inTransaction());
    }
}

