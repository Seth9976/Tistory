package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m5 extends Lambda implements Function1 {
    public final String a;
    public final MutableState b;

    public m5(String s, MutableState mutableState0) {
        this.a = s;
        this.b = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        EditorTagFragment.access$TagList$lambda$2(this.b, (((Boolean)object0).booleanValue() ? null : this.a));
        return Unit.INSTANCE;
    }
}

