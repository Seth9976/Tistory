package com.kakao.tistory.presentation.widget.bottomsheet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public long a;
    public Object b;
    public final com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetModalKt.PreUpPostDownNestedScrollConnection.1 c;
    public int d;

    public h(com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetModalKt.PreUpPostDownNestedScrollConnection.1 bottomSheetModalKt$PreUpPostDownNestedScrollConnection$10, Continuation continuation0) {
        this.c = bottomSheetModalKt$PreUpPostDownNestedScrollConnection$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return this.c.onPostFling-RZ2iAVY(0L, 0L, this);
    }
}

