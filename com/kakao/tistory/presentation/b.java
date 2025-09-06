package com.kakao.tistory.presentation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final CoilImageLibrary a;
    public final Object b;
    public final IntSize c;
    public final String d;
    public final Modifier e;
    public final Alignment f;
    public final ContentScale g;
    public final int h;

    public b(CoilImageLibrary coilImageLibrary0, Object object0, IntSize intSize0, String s, Modifier modifier0, Alignment alignment0, ContentScale contentScale0, int v) {
        this.a = coilImageLibrary0;
        this.b = object0;
        this.c = intSize0;
        this.d = s;
        this.e = modifier0;
        this.f = alignment0;
        this.g = contentScale0;
        this.h = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.AsyncImage-v934gDM(this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
        return Unit.INSTANCE;
    }
}

