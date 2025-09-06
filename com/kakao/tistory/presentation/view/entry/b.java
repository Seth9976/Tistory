package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel.ErrorDialogEvent;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function4 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((DialogFactory)object0), "$this$DialogHandler");
        Intrinsics.checkNotNullParameter(((ErrorDialogEvent)object1), "it");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x96679D13, v, -1, "com.kakao.tistory.presentation.view.entry.ComposableSingletons$EntryViewActivityKt.lambda-1.<anonymous> (EntryViewActivity.kt:243)");
        }
        String s = ((ErrorDialogEvent)object1).getErrorModel().getTitle();
        String s1 = ((ErrorDialogEvent)object1).getErrorModel().getMessage();
        ((Composer)object2).startReplaceGroup(0xC5DA20EE);
        boolean z = (v & 14 ^ 6) > 4 && ((Composer)object2).changed(((DialogFactory)object0)) || (v & 6) == 4;
        a a0 = ((Composer)object2).rememberedValue();
        if(z || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(((DialogFactory)object0));
            ((Composer)object2).updateRememberedValue(a0);
        }
        ((Composer)object2).endReplaceGroup();
        ((DialogFactory)object0).ShowOk(s, s1, 0, false, a0, null, ((Composer)object2), v << 18 & 0x380000, 44);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

