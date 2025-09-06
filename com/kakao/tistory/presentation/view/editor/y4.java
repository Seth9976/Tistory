package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y4 extends Lambda implements Function2 {
    public final EditorTagFragment a;
    public final List b;
    public final Function1 c;
    public final Function1 d;
    public final int e;

    public y4(EditorTagFragment editorTagFragment0, List list0, Function1 function10, Function1 function11, int v) {
        this.a = editorTagFragment0;
        this.b = list0;
        this.c = function10;
        this.d = function11;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EditorTagFragment.access$RecentTagList(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

