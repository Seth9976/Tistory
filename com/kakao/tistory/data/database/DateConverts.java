package com.kakao.tistory.data.database;

import androidx.room.TypeConverter;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/data/database/DateConverts;", "", "()V", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromTimestamp", "value", "(Ljava/lang/Long;)Ljava/util/Date;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateConverts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateConverts.kt\ncom/kakao/tistory/data/database/DateConverts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class DateConverts {
    @TypeConverter
    @Nullable
    public final Long dateToTimestamp(@Nullable Date date0) {
        return date0 == null ? null : date0.getTime();
    }

    @TypeConverter
    @Nullable
    public final Date fromTimestamp(@Nullable Long long0) {
        return long0 == null ? null : new Date(long0.longValue());
    }
}

