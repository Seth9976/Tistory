package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final ThumbnailUiState a;
    public final float b;
    public final Modifier c;
    public final boolean d;
    public final String e;
    public final int f;
    public final int g;

    public a(ThumbnailUiState thumbnailUiState0, float f, Modifier modifier0, boolean z, String s, int v, int v1) {
        this.a = thumbnailUiState0;
        this.b = f;
        this.c = modifier0;
        this.d = z;
        this.e = s;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

