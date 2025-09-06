package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.PropertyReference1Impl;

public final class t extends PropertyReference1Impl {
    public static final t b;

    static {
        t.b = new t(SupportSQLiteDatabase.class, "maximumSize", "getMaximumSize()J", 0);  // 初始化器: Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.internal.PropertyReference1Impl
    public final Object get(Object object0) {
        return ((SupportSQLiteDatabase)object0).getMaximumSize();
    }
}

