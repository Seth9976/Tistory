package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final EntryItem a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public l(EntryItem entryItem0, boolean z, boolean z1, int v) {
        this.a = entryItem0;
        this.b = z;
        this.c = z1;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryStatusKt.EntryStatus(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

