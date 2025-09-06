package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function2 {
    public final Function0 a;
    public final boolean b;
    public final PaddingValues c;
    public final ThumbnailUiState d;
    public final String e;
    public final Function0 f;
    public final AnnotatedString g;
    public final AnnotatedString h;
    public final ThumbnailUiState i;
    public final int j;
    public final Integer k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;

    public x0(Function0 function00, boolean z, PaddingValues paddingValues0, ThumbnailUiState thumbnailUiState0, String s, Function0 function01, AnnotatedString annotatedString0, AnnotatedString annotatedString1, ThumbnailUiState thumbnailUiState1, int v, Integer integer0, String s1, int v1, int v2, int v3) {
        this.a = function00;
        this.b = z;
        this.c = paddingValues0;
        this.d = thumbnailUiState0;
        this.e = s;
        this.f = function01;
        this.g = annotatedString0;
        this.h = annotatedString1;
        this.i = thumbnailUiState1;
        this.j = v;
        this.k = integer0;
        this.l = s1;
        this.m = v1;
        this.n = v2;
        this.o = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListKt.EntryListItemWithLargeImage(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, ((Composer)object0), (this.m | 1) & -920350135 | ((0x24924924 & (this.m | 1)) >> 1 | 306783378 & (this.m | 1)) | (306783378 & (this.m | 1)) << 1 & (0x24924924 & (this.m | 1)), this.n & -920350135 | ((0x24924924 & this.n) >> 1 | 306783378 & this.n) | (306783378 & this.n) << 1 & (0x24924924 & this.n), this.o);
        return Unit.INSTANCE;
    }
}

