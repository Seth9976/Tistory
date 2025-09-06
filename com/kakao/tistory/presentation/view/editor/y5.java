package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.presentation.viewmodel.EditorTagViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y5 extends Lambda implements Function2 {
    public final EditorTagFragment a;
    public final EditorTagViewModel b;
    public final int c;

    public y5(EditorTagFragment editorTagFragment0, EditorTagViewModel editorTagViewModel0, int v) {
        this.a = editorTagFragment0;
        this.b = editorTagViewModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
        return Unit.INSTANCE;
    }
}

