package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.State;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w5 extends Lambda implements Function1 {
    public final State a;

    public w5(State state0) {
        this.a = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return Boolean.valueOf(((List)this.a.getValue()).contains(((String)object0)));
    }
}

