package com.kakao.tistory.data.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A.\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u001A\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003\u001A:\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*&\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"toList", "", "T", "Lcom/kakao/tistory/data/repository/Four;", "Lcom/kakao/tistory/data/repository/Six;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TuplesKt {
    @NotNull
    public static final List toList(@NotNull Four four0) {
        Intrinsics.checkNotNullParameter(four0, "<this>");
        return CollectionsKt__CollectionsKt.listOf(new Object[]{four0.getFirst(), four0.getSecond(), four0.getThird(), four0.getFourth()});
    }

    @NotNull
    public static final List toList(@NotNull Six six0) {
        Intrinsics.checkNotNullParameter(six0, "<this>");
        return CollectionsKt__CollectionsKt.listOf(new Object[]{six0.getFirst(), six0.getSecond(), six0.getThird(), six0.getFourth(), six0.getFive(), six0.getSix()});
    }
}

