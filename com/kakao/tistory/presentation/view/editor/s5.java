package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s5 extends Lambda implements Function0 {
    public final MutableState a;
    public final Function1 b;

    public s5(MutableState mutableState0, Function1 function10) {
        this.a = mutableState0;
        this.b = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = EditorTagFragment.access$TagList$lambda$1(this.a);
        if(s != null) {
            this.b.invoke(s);
            EditorTagFragment.access$TagList$lambda$2(this.a, null);
            return true;
        }
        return false;
    }
}

