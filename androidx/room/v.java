package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class v extends MutablePropertyReference1Impl {
    public static final v b;

    static {
        v.b = new v(SupportSQLiteDatabase.class, "pageSize", "getPageSize()J", 0);  // 初始化器: Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference1Impl
    public final Object get(Object object0) {
        return ((SupportSQLiteDatabase)object0).getPageSize();
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference1Impl
    public final void set(Object object0, Object object1) {
        ((SupportSQLiteDatabase)object0).setPageSize(((Number)object1).longValue());
    }
}

