package com.kakao.tistory.presentation.view.comment;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A=\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012$\u0010\u0004\u001A \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"SimplePager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/domain/entity/PinComment;", "invoke", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SimplePagerKt {
    @NotNull
    public static final Flow SimplePager(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "invoke");
        return new Pager(new PagingConfig(20, 2, false, 20, 0, 0, 52, null), null, new g2(function10), 2, null).getFlow();
    }
}

