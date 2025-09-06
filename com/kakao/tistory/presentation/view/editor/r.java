package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final DraftItem a;
    public final Function0 b;
    public final Function0 c;
    public final int d;

    public r(DraftItem draftItem0, Function0 function00, Function0 function01, int v) {
        this.a = draftItem0;
        this.b = function00;
        this.c = function01;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DraftBottomSheetKt.DraftItemView(this.a, this.b, this.c, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
        return Unit.INSTANCE;
    }
}

