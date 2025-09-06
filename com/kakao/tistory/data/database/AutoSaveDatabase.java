package com.kakao.tistory.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.kakao.tistory.data.database.dao.AutoSaveDao;
import com.kakao.tistory.data.database.entity.AutoSavedModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md.c;
import org.jetbrains.annotations.NotNull;

@Database(entities = {AutoSavedModel.class}, version = 1)
@TypeConverters({ListStringConverts.class})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/data/database/AutoSaveDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/kakao/tistory/data/database/dao/AutoSaveDao;", "getAutoSaveDao", "()Lcom/kakao/tistory/data/database/dao/AutoSaveDao;", "Companion", "com/kakao/tistory/data/database/b", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class AutoSaveDatabase extends RoomDatabase {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001B\u0010\u0007\u001A\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/data/database/AutoSaveDatabase$Companion;", "", "Lcom/kakao/tistory/data/database/AutoSaveDatabase;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/tistory/data/database/AutoSaveDatabase;", "instance", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final AutoSaveDatabase getInstance() {
            return (AutoSaveDatabase)AutoSaveDatabase.a.getValue();
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final Lazy a;

    static {
        AutoSaveDatabase.Companion = new Companion(null);
        AutoSaveDatabase.a = c.lazy(a.a);
    }

    @NotNull
    public abstract AutoSaveDao getAutoSaveDao();
}

