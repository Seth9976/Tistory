package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g5 extends Lambda implements Function2 {
    public final int a;
    public final String b;
    public final ThumbnailUiState c;
    public final int d;
    public final int e;
    public final int f;
    public final Function0 g;
    public final int h;

    public g5(int v, String s, ThumbnailUiState thumbnailUiState0, int v1, int v2, int v3, Function0 function00, int v4) {
        this.a = v;
        this.b = s;
        this.c = thumbnailUiState0;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = function00;
        this.h = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TopEntryListItemKt.TopEntryListItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
        return Unit.INSTANCE;
    }
}

