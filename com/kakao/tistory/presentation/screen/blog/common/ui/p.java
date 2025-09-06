package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function3 {
    public static final p a;

    static {
        p.a = new p();
    }

    public p() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$BottomSheetItem");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9F9B8B27, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.ComposableSingletons$BlogEntryModifyBottomSheetKt.lambda-1.<anonymous> (BlogEntryModifyBottomSheet.kt:167)");
        }
        TistoryComposeBottomSheetKt.BottomSheetItemText(StringResources_androidKt.stringResource(string.label_blog_entry_menu_password, ((Composer)object1), 0), null, false, ((Composer)object1), 0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

