package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;
    public final PaddingValues d;
    public final Function2 e;
    public final AnnotatedString f;
    public final AnnotatedString g;
    public final ThumbnailUiState h;
    public final int i;
    public final Integer j;
    public final String k;
    public final boolean l;
    public final Visibility m;
    public final int n;
    public final int o;
    public final int p;

    public l0(Function0 function00, Function0 function01, boolean z, PaddingValues paddingValues0, Function2 function20, AnnotatedString annotatedString0, AnnotatedString annotatedString1, ThumbnailUiState thumbnailUiState0, int v, Integer integer0, String s, boolean z1, Visibility entryListUiState$Visibility0, int v1, int v2, int v3) {
        this.a = function00;
        this.b = function01;
        this.c = z;
        this.d = paddingValues0;
        this.e = function20;
        this.f = annotatedString0;
        this.g = annotatedString1;
        this.h = thumbnailUiState0;
        this.i = v;
        this.j = integer0;
        this.k = s;
        this.l = z1;
        this.m = entryListUiState$Visibility0;
        this.n = v1;
        this.o = v2;
        this.p = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListKt.EntryListItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, ((Composer)object0), (this.n | 1) & -920350135 | ((0x24924924 & (this.n | 1)) >> 1 | 306783378 & (this.n | 1)) | (306783378 & (this.n | 1)) << 1 & (0x24924924 & (this.n | 1)), this.o & -920350135 | ((0x24924924 & this.o) >> 1 | 306783378 & this.o) | (306783378 & this.o) << 1 & (0x24924924 & this.o), this.p);
        return Unit.INSTANCE;
    }
}

