package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function3 {
    public static final q a;

    static {
        q.a = new q();
    }

    public q() {
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
            ComposerKt.traceEventStart(0x2842B286, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.ComposableSingletons$BlogEntryModifyBottomSheetKt.lambda-2.<anonymous> (BlogEntryModifyBottomSheet.kt:157)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_2_depth_bullet, ((Composer)object1), 0), null, SizeKt.size-3ABfNKs(PaddingKt.padding-3ABfNKs(Modifier.Companion, 8.0f), 8.0f), TColor.INSTANCE.getGray200-0d7_KjU(), ((Composer)object1), 0xDB8, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

