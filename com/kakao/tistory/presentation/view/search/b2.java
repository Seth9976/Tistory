package com.kakao.tistory.presentation.view.search;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function2 {
    public final ResultViewType a;
    public final State b;

    public b2(ResultViewType resultViewType0, State state0) {
        this.a = resultViewType0;
        this.b = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(108603021, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultTab.<anonymous>.<anonymous>.<anonymous> (SearchResultListFragment.kt:162)");
        }
        FontWeight fontWeight0 = ((Boolean)this.b.getValue()).booleanValue() ? FontWeight.Companion.getSemiBold() : FontWeight.Companion.getLight();
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(this.a.getTabTitle(), ((Composer)object0), 0), null, ((Color)((Composer)object0).consume(ContentColorKt.getLocalContentColor())).unbox-impl(), 0L, null, fontWeight0, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize14Weight400(), ((Composer)object0), 0, 0x180000, 0xFFDA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

