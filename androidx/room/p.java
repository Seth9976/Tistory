package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.PropertyReference1Impl;

public final class p extends PropertyReference1Impl {
    public static final p b;

    static {
        p.b = new p(SupportSQLiteDatabase.class, "isDbLockedByCurrentThread", "isDbLockedByCurrentThread()Z", 0);  // 初始化器: Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.internal.PropertyReference1Impl
    public final Object get(Object object0) {
        return Boolean.valueOf(((SupportSQLiteDatabase)object0).isDbLockedByCurrentThread());
    }
}

