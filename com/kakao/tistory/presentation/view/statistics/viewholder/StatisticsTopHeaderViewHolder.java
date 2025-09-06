package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTopHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;", "topViewModel", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;", "statisticsViewModel", "", "setStatisticsTopHeader", "(Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsTopHeaderViewHolder extends ViewHolder {
    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsTopHeaderViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsTopHeaderViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    public final void setStatisticsTopHeader(@NotNull TopViewModel topViewModel0, @NotNull StatisticsViewModel statisticsViewModel0) {
        Intrinsics.checkNotNullParameter(topViewModel0, "topViewModel");
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x4613F82E, true, new g0(topViewModel0, statisticsViewModel0));
        this.a.setContent(composableLambda0);
    }
}

