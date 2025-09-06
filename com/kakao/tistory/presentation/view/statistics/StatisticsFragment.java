package com.kakao.tistory.presentation.view.statistics;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.databinding.FragmentRecyclerViewBinding;
import com.kakao.android.base.ui.recyclerview.SpaceDividerItemDecoration;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.SortItem.StatisticsSortItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.view.exception.TistoryErrorView;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import gc.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qc.a;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ!\u0010\u000E\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\"\u0010\u0018\u001A\u00020\u00118\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/StatisticsFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryRecyclerFragment;", "<init>", "()V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "createLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "refresh", "", "n", "Ljava/lang/String;", "getPage", "()Ljava/lang/String;", "setPage", "(Ljava/lang/String;)V", "page", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsFragment.kt\ncom/kakao/tistory/presentation/view/statistics/StatisticsFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,211:1\n14#2,4:212\n14#2,4:232\n1#3:216\n1#3:236\n1#3:252\n106#4,15:217\n106#4,15:237\n*S KotlinDebug\n*F\n+ 1 StatisticsFragment.kt\ncom/kakao/tistory/presentation/view/statistics/StatisticsFragment\n*L\n47#1:212,4\n48#1:232,4\n47#1:216\n48#1:236\n47#1:217,15\n48#1:237,15\n*E\n"})
public final class StatisticsFragment extends Hilt_StatisticsFragment {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J#\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\n¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/StatisticsFragment$Companion;", "", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "", "blogName", "Lcom/kakao/tistory/presentation/view/statistics/StatisticsFragment;", "newInstance", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;Ljava/lang/String;)Lcom/kakao/tistory/presentation/view/statistics/StatisticsFragment;", "BUNDLE_STATISTICS_BLOG_NAME", "Ljava/lang/String;", "BUNDLE_STATISTICS_ENTRY_ITEM", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final StatisticsFragment newInstance(@Nullable EntryItem entryItem0, @Nullable String s) {
            StatisticsFragment statisticsFragment0 = new StatisticsFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("BUNDLE_STATISTICS_ENTRY_ITEM", entryItem0);
            bundle0.putString("BUNDLE_STATISTICS_BLOG_NAME", s);
            statisticsFragment0.setArguments(bundle0);
            return statisticsFragment0;
        }

        public static StatisticsFragment newInstance$default(Companion statisticsFragment$Companion0, EntryItem entryItem0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                entryItem0 = null;
            }
            return statisticsFragment$Companion0.newInstance(entryItem0, s);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public StatisticsAdapter i;
    public final BaseViewModelLazy j;
    public final BaseViewModelLazy k;
    public EntryItem l;
    public String m;
    public String n;

    static {
        StatisticsFragment.Companion = new Companion(null);
        StatisticsFragment.$stable = 8;
    }

    public StatisticsFragment() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.j = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TopViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy1 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41);
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(StatisticsViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy1)));
        this.n = "";
    }

    public static final void a(EntryItem entryItem0, StatisticsFragment statisticsFragment0, SortItem sortItem0) {
        String s1;
        Intrinsics.checkNotNullParameter(statisticsFragment0, "this$0");
        if(sortItem0 != null) {
            SortItem sortItem1 = sortItem0 instanceof StatisticsSortItem ? sortItem0 : null;
            if(sortItem1 == null) {
                s1 = null;
            }
            else {
                String s = ((StatisticsSortItem)sortItem1).getGranularity();
                s1 = s == null ? null : StatisticsSortType.Companion.getPeriodName(s);
            }
            if(s1 == null) {
                s1 = "";
            }
            StatisticsTiara.INSTANCE.trackPage(entryItem0 == null, s1);
            StatisticsViewModel.updateSortType$default(((StatisticsViewModel)statisticsFragment0.k.getValue()), sortItem0, null, 2, null);
        }
    }

    public static final void a(StatisticsFragment statisticsFragment0) {
        Intrinsics.checkNotNullParameter(statisticsFragment0, "this$0");
        statisticsFragment0.refresh();
    }

    public static final void a(StatisticsFragment statisticsFragment0, StatisticsViewModel statisticsViewModel0, String s) {
        Intrinsics.checkNotNullParameter(statisticsFragment0, "this$0");
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "$this_apply");
        if(s != null) {
            ((TopViewModel)statisticsFragment0.j.getValue()).updateSortItems(statisticsViewModel0.getSortItems(), statisticsViewModel0.getMetricSortItemList());
        }
    }

    public static final void a(StatisticsFragment statisticsFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(statisticsFragment0, "this$0");
        if(statisticsFragment0.getContext() != null) {
            Intrinsics.checkNotNull(boolean0);
            if(boolean0.booleanValue()) {
                statisticsFragment0.getLoadingDialog().show();
                return;
            }
            statisticsFragment0.getLoadingDialog().dismiss();
        }
    }

    public static final void a(StatisticsFragment statisticsFragment0, List list0) {
        Intrinsics.checkNotNullParameter(statisticsFragment0, "this$0");
        ((FragmentRecyclerViewBinding)statisticsFragment0.getDataBinding()).swipeRefreshLayout.setRefreshing(false);
        StatisticsAdapter statisticsAdapter0 = statisticsFragment0.i;
        if(statisticsAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statisticsAdapter");
            statisticsAdapter0 = null;
        }
        if(list0 == null) {
            list0 = new ArrayList();
        }
        statisticsAdapter0.setItems(list0);
    }

    public static final void a(TopViewModel topViewModel0, StatisticsFragment statisticsFragment0, EntryItem entryItem0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(topViewModel0, "$this_apply");
        Intrinsics.checkNotNullParameter(statisticsFragment0, "this$0");
        if(!boolean0.booleanValue()) {
            return;
        }
        List list0 = (List)topViewModel0.getSortItems().getValue();
        if(list0 != null) {
            CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
            commonBottomDialogFragment0.setItems(list0);
            commonBottomDialogFragment0.setOnSelectedItem(new p(topViewModel0, entryItem0));
            commonBottomDialogFragment0.show(statisticsFragment0.getChildFragmentManager(), "CommonBottomDialogFragment");
        }
    }

    public final void a() {
        ((FragmentRecyclerViewBinding)this.getDataBinding()).swipeRefreshLayout.setOnRefreshListener(new h(this, 23));
    }

    public final void a(EntryItem entryItem0, String s) {
        String s1;
        Logger.INSTANCE.log("initViewModel " + entryItem0 + " " + s);
        TopViewModel topViewModel0 = (TopViewModel)this.j.getValue();
        if(entryItem0 == null) {
            s1 = this.getString(string.label_statistics);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        }
        else {
            s1 = entryItem0.getTitle();
            if(s1 == null) {
                s1 = this.getString(string.label_statistics);
                Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            }
        }
        TopViewModel.setTopView$default(topViewModel0, s1, null, ((StatisticsViewModel)this.k.getValue()).getSortItems(), ((StatisticsViewModel)this.k.getValue()).getMetricSortItemList(), 2, null);
        topViewModel0.getSelectedSortItem().observe(this.getViewLifecycleOwner(), new b(5, entryItem0, this));
        topViewModel0.getSelectedMetricSortItem().observe(this.getViewLifecycleOwner(), new y(new n(this)));
        topViewModel0.getShowBottomSortDialog().observe(this.getViewLifecycleOwner(), new a(topViewModel0, this, entryItem0));
        topViewModel0.getShowBottomMetricSortDialog().observe(this.getViewLifecycleOwner(), new y(new r(topViewModel0, this)));
        StatisticsViewModel statisticsViewModel0 = (StatisticsViewModel)this.k.getValue();
        if(entryItem0 == null) {
            statisticsViewModel0.init(s);
        }
        else {
            statisticsViewModel0.init(entryItem0);
        }
        statisticsViewModel0.isShowProgress().observe(this.getViewLifecycleOwner(), new qc.b(this, 0));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(statisticsViewModel0.getErrorEvent(), lifecycleOwner0, new s(this));
        statisticsViewModel0.getStatisticsItems().observe(this.getViewLifecycleOwner(), new qc.b(this, 1));
        statisticsViewModel0.getDate().observe(this.getViewLifecycleOwner(), new b(6, this, statisticsViewModel0));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(statisticsViewModel0.getGoToRefererEtcListActivity(), lifecycleOwner1, new t(this, entryItem0, statisticsViewModel0));
        LifecycleOwner lifecycleOwner2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(statisticsViewModel0.getGoToStatisticsActivity(), lifecycleOwner2, new u(this));
        LifecycleOwner lifecycleOwner3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(statisticsViewModel0.getGoToTopPostListActivity(), lifecycleOwner3, new v(this, statisticsViewModel0));
        LifecycleOwner lifecycleOwner4 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner4, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(statisticsViewModel0.getShowErrorDialog(), lifecycleOwner4, new x(this));
    }

    public static final StatisticsViewModel access$getStatisticsViewModel(StatisticsFragment statisticsFragment0) {
        return (StatisticsViewModel)statisticsFragment0.k.getValue();
    }

    @NotNull
    public LinearLayoutManager createLayoutManager() {
        return new LinearLayoutManager(this.getContext());
    }

    @Override  // com.kakao.android.base.ui.recyclerview.BaseRecyclerFragment
    public LayoutManager createLayoutManager() {
        return this.createLayoutManager();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryRecyclerFragment
    @NotNull
    public String getPage() {
        return this.n;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryRecyclerFragment
    public void onCreate(@Nullable Bundle bundle0) {
        Bundle bundle1 = this.getArguments();
        String s = null;
        this.l = bundle1 == null ? null : ((EntryItem)bundle1.getParcelable("BUNDLE_STATISTICS_ENTRY_ITEM"));
        Bundle bundle2 = this.getArguments();
        if(bundle2 != null) {
            s = bundle2.getString("BUNDLE_STATISTICS_BLOG_NAME");
        }
        this.m = s;
        super.onCreate(bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        this.initExceptionView(new TistoryErrorView(context0));
        this.a(this.l, this.m);
        this.a();
        this.i = new StatisticsAdapter(((TopViewModel)this.j.getValue()), ((StatisticsViewModel)this.k.getValue()));
        RecyclerView recyclerView0 = ((FragmentRecyclerViewBinding)this.getDataBinding()).recyclerView;
        Context context1 = recyclerView0.getContext();
        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
        recyclerView0.addItemDecoration(new SpaceDividerItemDecoration(0, false, 0, ScaleUtilsKt.dp2px(context1, 22.0f), false, 22, null));
        StatisticsAdapter statisticsAdapter0 = this.i;
        if(statisticsAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statisticsAdapter");
            statisticsAdapter0 = null;
        }
        recyclerView0.setAdapter(statisticsAdapter0);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryRecyclerFragment
    public void refresh() {
        ((FragmentRecyclerViewBinding)this.getDataBinding()).swipeRefreshLayout.setRefreshing(false);
        StatisticsViewModel.getStatistics$default(((StatisticsViewModel)this.k.getValue()), null, null, 3, null);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryRecyclerFragment
    public void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.n = s;
    }
}

