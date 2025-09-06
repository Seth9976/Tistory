package com.kakao.tistory.presentation.view.statistics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.tistory.data.model.StatisticsItem.EmptyItem;
import com.kakao.tistory.data.model.StatisticsItem.RefererChannel;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.data.model.StatisticsItem.RefererRankItem;
import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.data.model.StatisticsItem.TopEntryItem;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
import com.kakao.tistory.data.model.StatisticsItem;
import com.kakao.tistory.data.model.viewtype.StatisticsViewType;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.view.common.recyclerview.TopViewRecyclerAdapter;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsEmptyViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeaderViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererChannelViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererRankViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopHeaderViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopPostViewHolder;
import com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder;
import com.kakao.tistory.presentation.viewmodel.StatisticsTopEntryItem;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0017\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0016\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001C\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u001C\u0010\u0015¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/StatisticsAdapter;", "Lcom/kakao/tistory/presentation/view/common/recyclerview/TopViewRecyclerAdapter;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;", "topViewModel", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;", "statisticsViewModel", "<init>", "(Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;)V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateTopViewHolder", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "position", "", "onBindTopViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "viewType", "onCreateItemViewHolder", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemViewType", "(I)I", "itemPosition", "onBindItemViewHolder", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsAdapter extends TopViewRecyclerAdapter {
    public static final int $stable = 8;
    public final TopViewModel a;
    public final StatisticsViewModel b;

    public StatisticsAdapter(@NotNull TopViewModel topViewModel0, @NotNull StatisticsViewModel statisticsViewModel0) {
        Intrinsics.checkNotNullParameter(topViewModel0, "topViewModel");
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        super();
        this.a = topViewModel0;
        this.b = statisticsViewModel0;
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter
    public int getItemViewType(int v) {
        int v1 = super.getItemViewType(v);
        return v1 == 0 ? ((StatisticsItem)this.getItems().get(this.getContentItemPosition(v))).getStatisticsViewType().getViewType() : v1;
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter
    public void onBindItemViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        Title statisticsItem$Title0 = null;
        if(recyclerView$ViewHolder0 instanceof StatisticsItemHeaderViewHolder) {
            Object object0 = this.getItems().get(v);
            if(object0 instanceof Title) {
                statisticsItem$Title0 = (Title)object0;
            }
            if(statisticsItem$Title0 != null) {
                ((StatisticsItemHeaderViewHolder)recyclerView$ViewHolder0).setStatisticsItemHeader(statisticsItem$Title0, ((EntryItem)this.b.getEntryItem().getValue()), new k(statisticsItem$Title0, this));
            }
        }
        else {
            if(recyclerView$ViewHolder0 instanceof StatisticsTrendViewHolder) {
                Object object1 = this.getItems().get(v);
                if(object1 instanceof Trend) {
                    statisticsItem$Title0 = (Trend)object1;
                }
                ((StatisticsTrendViewHolder)recyclerView$ViewHolder0).setStatisticsTrend(((Trend)statisticsItem$Title0), this.b);
                return;
            }
            if(recyclerView$ViewHolder0 instanceof StatisticsRefererChannelViewHolder) {
                Object object2 = this.getItems().get(v);
                if(object2 instanceof RefererChannel) {
                    statisticsItem$Title0 = (RefererChannel)object2;
                }
                ((StatisticsRefererChannelViewHolder)recyclerView$ViewHolder0).setRefererChannel(((RefererChannel)statisticsItem$Title0));
                return;
            }
            if(recyclerView$ViewHolder0 instanceof StatisticsRefererRankViewHolder) {
                Object object3 = this.getItems().get(v);
                if(object3 instanceof RefererRankItem) {
                    statisticsItem$Title0 = (RefererRankItem)object3;
                }
                ((StatisticsRefererRankViewHolder)recyclerView$ViewHolder0).setRefererRank(((RefererRankItem)statisticsItem$Title0), new l(this));
                return;
            }
            if(recyclerView$ViewHolder0 instanceof StatisticsTopPostViewHolder) {
                Object object4 = this.getItems().get(v);
                TopEntryItem statisticsItem$TopEntryItem0 = object4 instanceof TopEntryItem ? ((TopEntryItem)object4) : null;
                Object object5 = statisticsItem$TopEntryItem0 == null ? null : statisticsItem$TopEntryItem0.getData();
                if(object5 instanceof StatisticsTopEntryItem) {
                    statisticsItem$Title0 = (StatisticsTopEntryItem)object5;
                }
                ((StatisticsTopPostViewHolder)recyclerView$ViewHolder0).setStatisticsTopPost(((StatisticsTopEntryItem)statisticsItem$Title0));
                return;
            }
            if(recyclerView$ViewHolder0 instanceof StatisticsRefererKeywordViewHolder) {
                Object object6 = this.getItems().get(v);
                if(object6 instanceof RefererKeywordItem) {
                    statisticsItem$Title0 = (RefererKeywordItem)object6;
                }
                m m0 = new m(this);
                ((StatisticsRefererKeywordViewHolder)recyclerView$ViewHolder0).setRefererKeyword(((RefererKeywordItem)statisticsItem$Title0), this.b, m0);
                return;
            }
            if(recyclerView$ViewHolder0 instanceof StatisticsEmptyViewHolder) {
                Object object7 = this.getItems().get(v);
                if(object7 instanceof EmptyItem) {
                    statisticsItem$Title0 = (EmptyItem)object7;
                }
                ((StatisticsEmptyViewHolder)recyclerView$ViewHolder0).setStatisticsEmpty(((EmptyItem)statisticsItem$Title0));
            }
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.recyclerview.TopViewRecyclerAdapter
    public void onBindTopViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof StatisticsTopHeaderViewHolder) {
            ((StatisticsTopHeaderViewHolder)recyclerView$ViewHolder0).setStatisticsTopHeader(this.a, this.b);
        }
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseHeaderFooterRecyclerAdapter
    @NotNull
    public ViewHolder onCreateItemViewHolder(@NotNull LayoutInflater layoutInflater0, @NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        if(v == StatisticsViewType.TITLE.getViewType()) {
            Context context0 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            return new StatisticsItemHeaderViewHolder(new ComposeView(context0, null, 0, 6, null));
        }
        if(v == StatisticsViewType.TREND.getViewType()) {
            Context context1 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
            return new StatisticsTrendViewHolder(new ComposeView(context1, null, 0, 6, null));
        }
        if(v == StatisticsViewType.REFERER_CHANNEL.getViewType()) {
            Context context2 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new StatisticsRefererChannelViewHolder(new ComposeView(context2, null, 0, 6, null));
        }
        if(v == StatisticsViewType.REFERER_RANK.getViewType()) {
            Context context3 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return new StatisticsRefererRankViewHolder(new ComposeView(context3, null, 0, 6, null));
        }
        if(v == StatisticsViewType.TOP_POST.getViewType()) {
            Context context4 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            return new StatisticsTopPostViewHolder(new ComposeView(context4, null, 0, 6, null));
        }
        if(v == StatisticsViewType.REFERER_KEYWORD.getViewType()) {
            Context context5 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            return new StatisticsRefererKeywordViewHolder(new ComposeView(context5, null, 0, 6, null));
        }
        if(v != StatisticsViewType.EMPTY.getViewType()) {
            throw new NoWhenBranchMatchedException("StatisticsAdapter : onCreateItemViewHolder()");
        }
        Context context6 = viewGroup0.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        return new StatisticsEmptyViewHolder(new ComposeView(context6, null, 0, 6, null));
    }

    @Override  // com.kakao.tistory.presentation.view.common.recyclerview.TopViewRecyclerAdapter
    @NotNull
    public ViewHolder onCreateTopViewHolder(@NotNull LayoutInflater layoutInflater0, @NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Context context0 = viewGroup0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        return new StatisticsTopHeaderViewHolder(new ComposeView(context0, null, 0, 6, null));
    }
}

