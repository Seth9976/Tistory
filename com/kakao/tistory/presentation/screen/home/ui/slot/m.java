package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotPageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function3 {
    public final Category a;

    public m(Category homeSlotUiState$Category0) {
        this.a = homeSlotUiState$Category0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SlotContainer");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((ColumnScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(23931032, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Category.<anonymous> (Category.kt:84)");
        }
        CategoryKt.access$CategoryList(this.a.getActiveCategoryGroupId(), this.a.getCategoryGroups(), ((Composer)object1), 0x40);
        SlotPageKt.SlotPage(((ColumnScope)object0), this.a, null, ComposableSingletons.CategoryKt.INSTANCE.getLambda-1$presentation_prodRelease(), ((Composer)object1), v & 14 | 0xC40, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

