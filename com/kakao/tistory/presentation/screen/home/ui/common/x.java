package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final ThumbnailUiState a;
    public final Dp b;
    public final Dp c;
    public final float d;
    public final boolean e;
    public final int f;
    public final int g;

    public x(ThumbnailUiState thumbnailUiState0, Dp dp0, Dp dp1, float f, boolean z, int v, int v1) {
        this.a = thumbnailUiState0;
        this.b = dp0;
        this.c = dp1;
        this.d = f;
        this.e = z;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotEntryImageKt.SlotEntryImage-JEEbyFU(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

