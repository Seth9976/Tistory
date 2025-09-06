package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final BlogMainTiara a;
    public final String b;
    public final BlogRoleType c;
    public final int d;

    public h0(BlogMainTiara blogMainTiara0, String s, BlogRoleType blogRoleType0, int v) {
        this.a = blogMainTiara0;
        this.b = s;
        this.c = blogRoleType0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.TrackUsage(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

