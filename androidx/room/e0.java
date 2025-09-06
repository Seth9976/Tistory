package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class e0 extends MutablePropertyReference1Impl {
    public static final e0 b;

    static {
        e0.b = new e0(SupportSQLiteDatabase.class, "version", "getVersion()I", 0);  // 初始化器: Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference1Impl
    public final Object get(Object object0) {
        return ((SupportSQLiteDatabase)object0).getVersion();
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference1Impl
    public final void set(Object object0, Object object1) {
        ((SupportSQLiteDatabase)object0).setVersion(((Number)object1).intValue());
    }
}

