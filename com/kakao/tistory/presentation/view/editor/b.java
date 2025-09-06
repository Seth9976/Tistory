package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Function0 a;
    public final d b;
    public final DraftItem c;

    public b(Function0 function00, d d0, DraftItem draftItem0) {
        this.a = function00;
        this.b = d0;
        this.c = draftItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        this.b.a.invoke(this.c);
        return Unit.INSTANCE;
    }
}

