package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function3 {
    public final EntryVisibilityType a;

    public f(EntryVisibilityType entryVisibilityType0) {
        this.a = entryVisibilityType0;
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
            ComposerKt.traceEventStart(0xCF78CC2F, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyTop.<anonymous> (BlogEntryModifyBottomSheet.kt:85)");
        }
        TextKt.Text--4IGK_g(BlogEntryModifyBottomSheetKt.a(this.a, ((Composer)object1), 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), ((Composer)object1), 0x180, 0, 0xFFFA);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_arrow, ((Composer)object1), 0), null, null, 0L, ((Composer)object1), 56, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

