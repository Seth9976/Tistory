package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.runtime.MutableState;
import com.kakao.tistory.presentation.screen.blog.main.BlogMainTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final MutableState a;

    public b(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((r)object0), "it");
        BlogMainTiara.INSTANCE.trackClickEntryVisibilityMenu();
        BlogEntryModifyBottomSheetKt.access$BlogEntryModifyBottomSheet$lambda$2(this.a, ((r)object0));
        return Unit.INSTANCE;
    }
}

