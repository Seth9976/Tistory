package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c3 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final Function0 f;
    public final int g;
    public final int h;

    public c3(EditorSettingFragment editorSettingFragment0, int v, String s, int v1, boolean z, Function0 function00, int v2, int v3) {
        this.a = editorSettingFragment0;
        this.b = v;
        this.c = s;
        this.d = v1;
        this.e = z;
        this.f = function00;
        this.g = v2;
        this.h = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

