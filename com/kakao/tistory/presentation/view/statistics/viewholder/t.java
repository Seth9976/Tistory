package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function3 {
    public final RefererKeywordItem a;

    public t(RefererKeywordItem statisticsItem$RefererKeywordItem0) {
        this.a = statisticsItem$RefererKeywordItem0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$RoundButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9D5C4AA1, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder.RefererKeywordButton.<anonymous> (StatisticsRefererKeywordViewHolder.kt:177)");
        }
        TextKt.Text--4IGK_g("", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize15Weight400(), ((Composer)object1), 0x180, 0x180000, 0xFFFA);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(Modifier.Companion, 8.0f), ((Composer)object1), 6);
        TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(this.a.getCount()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize15Weight700(), ((Composer)object1), 0x180, 0x180000, 0xFFFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

