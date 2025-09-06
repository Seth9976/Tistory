package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j5 extends Lambda implements Function2 {
    public final EditorTagFragment a;
    public final Modifier b;
    public final String c;
    public final Function1 d;
    public final Function0 e;
    public final int f;
    public final int g;

    public j5(EditorTagFragment editorTagFragment0, Modifier modifier0, String s, Function1 function10, Function0 function00, int v, int v1) {
        this.a = editorTagFragment0;
        this.b = modifier0;
        this.c = s;
        this.d = function10;
        this.e = function00;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EditorTagFragment.access$TagInput(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

