package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.kakao.tistory.presentation.viewmodel.StatisticsTopEntryItem;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import com.kakao.tistory.presentation.widget.common.TopEntryListItemKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsTopPostViewHolderKt {
    public static final void access$StatisticsTopPost(StatisticsTopEntryItem statisticsTopEntryItem0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAFF87A9D);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsTopEntryItem0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAFF87A9D, v1, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopPost (StatisticsTopPostViewHolder.kt:37)");
            }
            composer1.startReplaceGroup(77200166);
            if(statisticsTopEntryItem0.getShowTopDivider()) {
                ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, composer1, 0, 3);
            }
            composer1.endReplaceGroup();
            TopEntryListItemKt.TopEntryListItem(statisticsTopEntryItem0.getRank(), statisticsTopEntryItem0.getTitle(), statisticsTopEntryItem0.getThumbnail(), statisticsTopEntryItem0.getLikeCount(), statisticsTopEntryItem0.getCommentCount(), ((int)statisticsTopEntryItem0.getCount()), statisticsTopEntryItem0.getOnClickEntry(), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r0(statisticsTopEntryItem0, v));
        }
    }
}

