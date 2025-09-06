package com.kakao.tistory.data.database;

import androidx.room.TypeConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/data/database/ListStringConverts;", "", "()V", "fromList", "", "value", "", "toList", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ListStringConverts {
    @TypeConverter
    @Nullable
    public final String fromList(@Nullable List list0) {
        return list0 == null ? null : CollectionsKt___CollectionsKt.joinToString$default(list0, ",", null, null, 0, null, null, 62, null);
    }

    @TypeConverter
    @NotNull
    public final List toList(@Nullable String s) {
        return s == null || s.length() == 0 ? CollectionsKt__CollectionsKt.emptyList() : StringsKt__StringsKt.split$default(s, new String[]{","}, false, 0, 6, null);
    }
}

