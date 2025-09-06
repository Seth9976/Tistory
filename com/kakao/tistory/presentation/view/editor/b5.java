package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b5 extends Lambda implements Function2 {
    public final EditorTagFragment a;
    public final String b;
    public final boolean c;
    public final Function1 d;
    public final int e;

    public b5(EditorTagFragment editorTagFragment0, String s, boolean z, Function1 function10, int v) {
        this.a = editorTagFragment0;
        this.b = s;
        this.c = z;
        this.d = function10;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

