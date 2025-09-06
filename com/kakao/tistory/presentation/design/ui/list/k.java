package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final ThumbnailUiState a;
    public final String b;
    public final TextStyle c;
    public final PaddingValues d;
    public final Function0 e;
    public final boolean f;
    public final int g;
    public final int h;

    public k(ThumbnailUiState thumbnailUiState0, String s, TextStyle textStyle0, PaddingValues paddingValues0, Function0 function00, boolean z, int v, int v1) {
        this.a = thumbnailUiState0;
        this.b = s;
        this.c = textStyle0;
        this.d = paddingValues0;
        this.e = function00;
        this.f = z;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogTitleKt.BlogTitleWithThumbnail(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

