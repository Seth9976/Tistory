package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final ThumbnailUiState a;
    public final Modifier b;
    public final Dp c;
    public final Color d;
    public final int e;
    public final int f;

    public f(ThumbnailUiState thumbnailUiState0, Modifier modifier0, Dp dp0, Color color0, int v, int v1) {
        this.a = thumbnailUiState0;
        this.b = modifier0;
        this.c = dp0;
        this.d = color0;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryThumbnailKt.EntryThumbnail-T-dY9a0(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

