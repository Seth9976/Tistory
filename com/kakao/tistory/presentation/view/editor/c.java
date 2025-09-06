package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.widget.swipe.CommonAnchorViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function3 {
    public final Function0 a;
    public final d b;
    public final DraftItem c;

    public c(Function0 function00, d d0, DraftItem draftItem0) {
        this.a = function00;
        this.b = d0;
        this.c = draftItem0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$$receiver");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x37428A0E, v, -1, "com.kakao.tistory.presentation.view.editor.DraftAnchorsProvider.create.<anonymous> (DraftBottomSheet.kt:223)");
        }
        c.a(18.0f, Modifier.Companion, ((Composer)object1), 6);
        CommonAnchorViewKt.CommonAnchorView(drawable.ic_swipe_delete, new b(this.a, this.b, this.c), ((Composer)object1), 0);
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, 18.0f), ((Composer)object1), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

