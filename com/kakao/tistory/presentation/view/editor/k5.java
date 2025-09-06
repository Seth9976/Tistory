package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k5 extends Lambda implements Function0 {
    public final Function1 a;
    public final MutableState b;

    public k5(Function1 function10, MutableState mutableState0) {
        this.a = function10;
        this.b = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = EditorTagFragment.access$TagInput$lambda$5(this.b);
        if(((Boolean)this.a.invoke(s)).booleanValue()) {
            EditorTagFragment.access$TagInput$lambda$6(this.b, "");
        }
        return Unit.INSTANCE;
    }
}

