package com.kakao.tistory.presentation.view.common;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.ErrorModelThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function3 {
    public final ErrorModelThrowable a;
    public final FunctionReferenceImpl b;

    public z(ErrorModelThrowable errorModelThrowable0, Function0 function00) {
        this.a = errorModelThrowable0;
        this.b = (FunctionReferenceImpl)function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB1E5F07D, v, -1, "com.kakao.tistory.presentation.view.common.showLoadState.<anonymous>.<anonymous> (PagingItemList.kt:85)");
        }
        PagingItemListKt.access$ItemError(this.a, ((Function0)this.b), ((Composer)object1), 8, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

