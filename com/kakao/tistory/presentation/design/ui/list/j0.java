package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function2 {
    public final Function0 a;
    public final PaddingValues b;
    public final AnnotatedString c;
    public final ThumbnailUiState d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public j0(Function0 function00, PaddingValues paddingValues0, AnnotatedString annotatedString0, ThumbnailUiState thumbnailUiState0, int v, int v1, int v2, int v3, int v4) {
        this.a = function00;
        this.b = paddingValues0;
        this.c = annotatedString0;
        this.d = thumbnailUiState0;
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        this.i = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListKt.EntryListCompactItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

