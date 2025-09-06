package com.kakao.tistory.data.common;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u007F\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00022R\u0010\u0006\u001AN\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\r0\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"simplePager", "Landroidx/paging/Pager;", "", "T", "", "pageSize", "invoke", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "key", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/common/PagingModel;", "(ILkotlin/jvm/functions/Function3;)Landroidx/paging/Pager;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PagingKt {
    @NotNull
    public static final Pager simplePager(int v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "invoke");
        return new Pager(new PagingConfig(v, 2, false, v, 0, 0, 52, null), null, new a(function30), 2, null);
    }

    public static Pager simplePager$default(int v, Function3 function30, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 20;
        }
        return PagingKt.simplePager(v, function30);
    }
}

