package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public static final s a;

    static {
        s.a = new s();
    }

    public s() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object0).intValue();
        Intrinsics.checkNotNullParameter(((DraftItem)object1), "draft");
        return ((DraftItem)object1).getSequence();
    }
}

