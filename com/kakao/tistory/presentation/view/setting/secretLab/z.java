package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.ServerHost;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final String a;
    public final ServerHost b;
    public final Function1 c;
    public final int d;

    public z(String s, ServerHost serverHost0, Function1 function10, int v) {
        this.a = s;
        this.b = serverHost0;
        this.c = function10;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SeverHostScreenKt.access$ServerHostItem(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

