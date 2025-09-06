package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.data.model.StatisticsItem.EmptyItem;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsEmptyViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsEmptyViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsEmptyViewHolderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n148#2:51\n1#3:52\n*S KotlinDebug\n*F\n+ 1 StatisticsEmptyViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsEmptyViewHolderKt\n*L\n45#1:51\n*E\n"})
public final class StatisticsEmptyViewHolderKt {
    public static final void access$StatisticsEmpty(EmptyItem statisticsItem$EmptyItem0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x54C54328);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x54C54328, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsEmpty (StatisticsEmptyViewHolder.kt:40)");
        }
        String s = null;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 20.0f, 8.0f, 20.0f, 27.0f);
        Integer integer0 = statisticsItem$EmptyItem0 == null ? null : statisticsItem$EmptyItem0.getEmptyTextRes();
        if(integer0 != null) {
            s = StringResources_androidKt.stringResource(integer0.intValue(), composer1, 0);
        }
        ExcludeFontPaddingTextKt.Text-IbK3jfQ((s == null ? "" : s), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0x30, 0xC00, 0x1DFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(statisticsItem$EmptyItem0, v));
        }
    }
}

