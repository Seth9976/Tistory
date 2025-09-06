package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final BlogMainUiState a;
    public final FromRefer b;
    public final BlogInfo c;
    public final Function0 d;
    public final Function4 e;
    public final int f;

    public u(BlogMainUiState blogMainUiState0, FromRefer fromRefer0, BlogInfo blogInfo0, Function0 function00, Function4 function40, int v) {
        this.a = blogMainUiState0;
        this.b = fromRefer0;
        this.c = blogInfo0;
        this.d = function00;
        this.e = function40;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainScreenKt.access$BlogMainContent(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

