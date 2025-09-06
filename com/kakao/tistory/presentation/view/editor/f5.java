package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f5 extends Lambda implements Function1 {
    public final State a;

    public f5(State state0) {
        this.a = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KeyboardActionScope)object0), "$this$$receiver");
        EditorTagFragment.access$TagInput$lambda$8(this.a).invoke();
        return Unit.INSTANCE;
    }
}

