package com.kakao.tistory.presentation.common.tiara;

import androidx.compose.runtime.Composer;
import com.kakao.tiara.data.ActionKind;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final Object c;
    public final ActionKind d;
    public final Map e;
    public final int f;
    public final int g;

    public b(String s, String s1, Object object0, ActionKind actionKind0, Map map0, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = object0;
        this.d = actionKind0;
        this.e = map0;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TiaraExtensionKt.TrackPage(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

