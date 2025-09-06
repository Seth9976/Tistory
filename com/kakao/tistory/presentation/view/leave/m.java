package com.kakao.tistory.presentation.view.leave;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final LeaveActivity a;
    public final String b;
    public final int c;

    public m(LeaveActivity leaveActivity0, String s, int v) {
        this.a = leaveActivity0;
        this.b = s;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.LeaveInfoTitle(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

