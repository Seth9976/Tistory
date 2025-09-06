package com.kakao.tistory.presentation.view.common.base;

import androidx.compose.runtime.Composer;
import com.kakao.android.base.model.ErrorModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final TistoryComposeFragment a;
    public final ErrorModel b;
    public final int c;

    public m(TistoryComposeFragment tistoryComposeFragment0, ErrorModel errorModel0, int v) {
        this.a = tistoryComposeFragment0;
        this.b = errorModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.CommonExceptionView(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

