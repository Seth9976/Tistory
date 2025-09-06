package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r5 extends Lambda implements Function2 {
    public final EditorTagFragment a;
    public final List b;
    public final boolean c;
    public final Function1 d;
    public final Function1 e;
    public final int f;

    public r5(EditorTagFragment editorTagFragment0, List list0, boolean z, Function1 function10, Function1 function11, int v) {
        this.a = editorTagFragment0;
        this.b = list0;
        this.c = z;
        this.d = function10;
        this.e = function11;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EditorTagFragment.access$TagList(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

