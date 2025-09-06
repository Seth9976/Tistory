package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorTagViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v5 extends Lambda implements Function1 {
    public final EditorTagViewModel a;

    public v5(EditorTagViewModel editorTagViewModel0) {
        this.a = editorTagViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return Boolean.valueOf(this.a.addTag(((String)object0), true));
    }
}

