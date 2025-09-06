package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final Object a;
    public final String b;
    public final Modifier c;
    public final Painter d;
    public final Alignment e;
    public final ContentScale f;
    public final int g;
    public final int h;

    public b0(Object object0, String s, Modifier modifier0, Painter painter0, Alignment alignment0, ContentScale contentScale0, int v, int v1) {
        this.a = object0;
        this.b = s;
        this.c = modifier0;
        this.d = painter0;
        this.e = alignment0;
        this.f = contentScale0;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommonImageKt.CommonImage(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

