package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r3 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Function0 g;
    public final int h;

    public r3(EditorSettingFragment editorSettingFragment0, int v, int v1, int v2, boolean z, boolean z1, Function0 function00, int v3) {
        this.a = editorSettingFragment0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = z1;
        this.g = function00;
        this.h = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EditorSettingFragment.access$VisibilityItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
        return Unit.INSTANCE;
    }
}

