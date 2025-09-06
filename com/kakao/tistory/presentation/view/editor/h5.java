package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class h5 extends Lambda implements Function1 {
    public final MutableState a;

    public h5(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        String s = p.replace$default(((String)object0), "\n", "", false, 4, null);
        EditorTagFragment.access$TagInput$lambda$6(this.a, s);
        return Unit.INSTANCE;
    }
}

