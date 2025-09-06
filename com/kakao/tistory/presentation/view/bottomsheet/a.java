package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public final boolean a;

    public a(boolean z) {
        this.a = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$Category");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1404013383, v, -1, "com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogAdapter.BlogCategoryChildItemCreateModeViewHolder.Content.<anonymous> (BlogCategoryDialogAdapter.kt:107)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_2_depth_bullet, ((Composer)object1), 0), null, ((RowScope)object0).align(SizeKt.size-3ABfNKs(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 4.0f, 0.0f, 2, null), 8.0f), Alignment.Companion.getCenterVertically()), 0L, ((Composer)object1), 56, 0);
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, 4.0f), ((Composer)object1), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

