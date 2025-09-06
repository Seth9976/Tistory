package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class n2 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final Modifier b;
    public final float c;
    public final boolean d;
    public final Vertical e;
    public final Function3 f;
    public final int g;
    public final int h;

    public n2(EditorSettingFragment editorSettingFragment0, Modifier modifier0, float f, boolean z, Vertical alignment$Vertical0, Function3 function30, int v, int v1) {
        this.a = editorSettingFragment0;
        this.b = modifier0;
        this.c = f;
        this.d = z;
        this.e = alignment$Vertical0;
        this.f = function30;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

