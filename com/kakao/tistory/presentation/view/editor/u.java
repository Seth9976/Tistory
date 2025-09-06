package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final Function1 a;
    public final DraftItem b;

    public u(Function1 function10, DraftItem draftItem0) {
        this.a = function10;
        this.b = draftItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

