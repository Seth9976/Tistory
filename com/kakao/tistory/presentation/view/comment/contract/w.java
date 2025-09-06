package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public static final w a;

    static {
        w.a = new w();
    }

    public w() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ReplyType)object0), "it");
        return Unit.INSTANCE;
    }
}

