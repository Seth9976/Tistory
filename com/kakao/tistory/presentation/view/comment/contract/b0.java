package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public static final b0 a;

    static {
        b0.a = new b0();
    }

    public b0() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).getClass();
        Intrinsics.checkNotNullParameter(((CommentCompletion)object1), "<anonymous parameter 1>");
        return Unit.INSTANCE;
    }
}

