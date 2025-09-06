package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.tistory.data.model.StatisticsItem.RefererRankItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000B\u001A\u00020\t2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererRankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "refererRankItem", "Lkotlin/Function0;", "", "onClickDetail", "setRefererRank", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;Lkotlin/jvm/functions/Function0;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsRefererRankViewHolder extends ViewHolder {
    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsRefererRankViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsRefererRankViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    public final void setRefererRank(@Nullable RefererRankItem statisticsItem$RefererRankItem0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onClickDetail");
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-2104970206, true, new c0(statisticsItem$RefererRankItem0, function00));
        this.a.setContent(composableLambda0);
    }
}

