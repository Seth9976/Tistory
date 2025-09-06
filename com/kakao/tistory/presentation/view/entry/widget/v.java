package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final MutableState a;

    public v(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CommentEditFieldKt.access$CommentModifyEditField$lambda$12(this.a, ((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }
}

