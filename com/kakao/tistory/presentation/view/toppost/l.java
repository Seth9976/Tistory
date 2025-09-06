package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public final TopEntriesSortType a;
    public final Function1 b;

    public l(TopEntriesSortType topEntriesSortType0, Function1 function10) {
        this.a = topEntriesSortType0;
        this.b = function10;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$TistoryComposeBottomSheet");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-767347003, v, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.SortBottomSheet.<anonymous> (TopPostListActivity.kt:209)");
        }
        EnumEntries enumEntries0 = TopEntriesSortType.getEntries();
        TopEntriesSortType topEntriesSortType0 = this.a;
        Function1 function10 = this.b;
        int v1 = 0;
        for(Object object3: enumEntries0) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String s = StringResources_androidKt.stringResource(((TopEntriesSortType)object3).getTitleRes(), ((Composer)object1), 0);
            boolean z = v1 != CollectionsKt__CollectionsKt.getLastIndex(enumEntries0);
            ((Composer)object1).startReplaceGroup(0x390C6589);
            boolean z1 = ((Composer)object1).changed(function10);
            boolean z2 = ((Composer)object1).changed(((TopEntriesSortType)object3));
            k k0 = ((Composer)object1).rememberedValue();
            if(z1 || z2 || k0 == Composer.Companion.getEmpty()) {
                k0 = new k(function10, ((TopEntriesSortType)object3));
                ((Composer)object1).updateRememberedValue(k0);
            }
            ((Composer)object1).endReplaceGroup();
            TistoryComposeBottomSheetKt.BottomSheetItem(null, s, ((TopEntriesSortType)object3) == topEntriesSortType0, false, z, k0, ((Composer)object1), 0xC00, 1);
            ++v1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

