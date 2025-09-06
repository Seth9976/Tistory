package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x4 extends Lambda implements Function2 {
    public final List a;
    public final EditorTagFragment b;
    public final Function1 c;
    public final Function1 d;

    public x4(List list0, EditorTagFragment editorTagFragment0, Function1 function10, Function1 function11) {
        this.a = list0;
        this.b = editorTagFragment0;
        this.c = function10;
        this.d = function11;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1403243569, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.RecentTagList.<anonymous>.<anonymous> (EditorTagFragment.kt:211)");
        }
        EditorTagFragment editorTagFragment0 = this.b;
        Function1 function10 = this.c;
        Function1 function11 = this.d;
        for(Object object2: this.a) {
            editorTagFragment0.a(((String)object2), function10, function11, ((Composer)object0), 0x1000);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

