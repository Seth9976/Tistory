package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final Modifier a;
    public final EntryItem b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Function0 g;
    public final int h;
    public final int i;

    public d(Modifier modifier0, EntryItem entryItem0, boolean z, boolean z1, boolean z2, boolean z3, Function0 function00, int v, int v1) {
        this.a = modifier0;
        this.b = entryItem0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = function00;
        this.h = v;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryItemKt.EntryItem(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

