package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.tistory.presentation.viewmodel.StatisticsTopEntryItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTopPostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsTopEntryItem;", "topPostItem", "", "setStatisticsTopPost", "(Lcom/kakao/tistory/presentation/viewmodel/StatisticsTopEntryItem;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsTopPostViewHolder extends ViewHolder {
    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsTopPostViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsTopPostViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    public final void setStatisticsTopPost(@Nullable StatisticsTopEntryItem statisticsTopEntryItem0) {
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xBBEF1F2, true, new q0(statisticsTopEntryItem0));
        this.a.setContent(composableLambda0);
    }
}

