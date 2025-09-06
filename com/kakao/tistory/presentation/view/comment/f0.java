package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function0 {
    public final MutableState a;

    public f0(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CommentFragment.access$CommentListContent$lambda$8(this.a, false);
        return Unit.INSTANCE;
    }
}

