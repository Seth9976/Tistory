package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\t\u001A\u0004\u0018\u00010\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsItemHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/data/model/StatisticsItem$Title;", "statisticsTitle", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "Lkotlin/Function0;", "", "onClickSeeAll", "setStatisticsItemHeader", "(Lcom/kakao/tistory/data/model/StatisticsItem$Title;Lcom/kakao/tistory/domain/entity/entry/EntryItem;Lkotlin/jvm/functions/Function0;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsItemHeaderViewHolder extends ViewHolder {
    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsItemHeaderViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsItemHeaderViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    public final void setStatisticsItemHeader(@NotNull Title statisticsItem$Title0, @Nullable EntryItem entryItem0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(statisticsItem$Title0, "statisticsTitle");
        Intrinsics.checkNotNullParameter(function00, "onClickSeeAll");
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1456790475, true, new f(statisticsItem$Title0, entryItem0, function00));
        this.a.setContent(composableLambda0);
    }
}

