package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.usecase.ChangeBlockUseCase;
import com.kakao.tistory.domain.blog.usecase.GetCategoriesUseCase;
import com.kakao.tistory.domain.blog.usecase.GetChallengeUseCase;
import com.kakao.tistory.domain.blog.usecase.GetEntryListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetFirstOpenUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRecentNoticeListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRefererKeywordsUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRefererLogUseCase;
import com.kakao.tistory.domain.blog.usecase.GetTrendUseCase;
import com.kakao.tistory.domain.blog.usecase.SetFirstOpenedUseCase;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueCurrentUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesLastWeekUseCase;
import com.kakao.tistory.domain.usecase.FollowBlogUseCase;
import com.kakao.tistory.domain.usecase.UnFollowBlogUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategory;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallengeKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallengeList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowToastBarDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.Others;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfoKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeBlockState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeBlogInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeCurrentCategory;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeFollow;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.GuideDismiss;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.HideBottomSheet;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.HideDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.NeedGuide;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.OnClickFollow;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.Refresh;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RefreshChallenge;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RefreshEntryAndNoticeIfMyBlog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RequestChangeBlock;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowBottomSheet;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowErrorDialog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateCategories;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateChallenge;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateEntryList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateRecentNotice;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsRefererKeyword;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsRefererLog;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsRevenue;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsRevenueEnable;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateStatisticsTrend;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateTopEntryList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainNoticeKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainStatistics;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainStatisticsKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainTopEntryKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Loading;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0091\u0001\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u0006\u0010\u0016\u001A\u00020\u0015\u0012\u0006\u0010\u0018\u001A\u00020\u0017\u0012\u0006\u0010\u001A\u001A\u00020\u0019\u0012\u0006\u0010\u001C\u001A\u00020\u001B\u0012\u0006\u0010\u001E\u001A\u00020\u001D\u0012\u0006\u0010 \u001A\u00020\u001F\u0012\u0006\u0010\"\u001A\u00020!\u0012\u0006\u0010$\u001A\u00020#\u0012\u0006\u0010&\u001A\u00020%¢\u0006\u0004\b\'\u0010(J\u000F\u0010)\u001A\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J \u0010-\u001A\u00020\u00042\u0006\u0010+\u001A\u00020\u00042\u0006\u0010,\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/BlogMainViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesLastWeekUseCase;", "getTopEntriesLastWeekUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetRecentNoticeListUseCase;", "getRecentNoticeListUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetCategoriesUseCase;", "getCategoriesUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetEntryListUseCase;", "getEntryListUseCase", "Lcom/kakao/tistory/domain/usecase/FollowBlogUseCase;", "followBlogUseCase", "Lcom/kakao/tistory/domain/usecase/UnFollowBlogUseCase;", "unFollowBlogUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetTrendUseCase;", "getTrendUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetRefererLogUseCase;", "getRefererLogUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetRefererKeywordsUseCase;", "getRefererKeywordsUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueVendorListUseCase;", "getRevenueVendorListUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueCurrentUseCase;", "getRevenueCurrentUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetFirstOpenUseCase;", "getFirstOpenUseCase", "Lcom/kakao/tistory/domain/blog/usecase/SetFirstOpenedUseCase;", "setFirstOpenedUseCase", "Lcom/kakao/tistory/domain/blog/usecase/ChangeBlockUseCase;", "changeBlockUseCase", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/blog/usecase/GetChallengeUseCase;", "getChallengeUseCase", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesLastWeekUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetRecentNoticeListUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetCategoriesUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetEntryListUseCase;Lcom/kakao/tistory/domain/usecase/FollowBlogUseCase;Lcom/kakao/tistory/domain/usecase/UnFollowBlogUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetTrendUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetRefererLogUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetRefererKeywordsUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueVendorListUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueCurrentUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetFirstOpenUseCase;Lcom/kakao/tistory/domain/blog/usecase/SetFirstOpenedUseCase;Lcom/kakao/tistory/domain/blog/usecase/ChangeBlockUseCase;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/blog/usecase/GetChallengeUseCase;Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainViewModel.kt\ncom/kakao/tistory/presentation/screen/blog/main/BlogMainViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,711:1\n53#2:712\n55#2:716\n53#2:717\n55#2:721\n50#3:713\n55#3:715\n50#3:718\n55#3:720\n107#4:714\n107#4:719\n*S KotlinDebug\n*F\n+ 1 BlogMainViewModel.kt\ncom/kakao/tistory/presentation/screen/blog/main/BlogMainViewModel\n*L\n60#1:712\n60#1:716\n395#1:717\n395#1:721\n60#1:713\n60#1:715\n395#1:718\n395#1:720\n60#1:714\n395#1:719\n*E\n"})
public final class BlogMainViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final GetTopEntriesLastWeekUseCase f;
    public final GetRecentNoticeListUseCase g;
    public final GetCategoriesUseCase h;
    public final GetEntryListUseCase i;
    public final FollowBlogUseCase j;
    public final UnFollowBlogUseCase k;
    public final GetTrendUseCase l;
    public final GetRefererLogUseCase m;
    public final GetRefererKeywordsUseCase n;
    public final GetRevenueVendorListUseCase o;
    public final GetRevenueCurrentUseCase p;
    public final GetFirstOpenUseCase q;
    public final SetFirstOpenedUseCase r;
    public final ChangeBlockUseCase s;
    public final EntryRepository t;
    public final GetChallengeUseCase u;
    public final StateFlow v;

    @Inject
    public BlogMainViewModel(@NotNull GetTopEntriesLastWeekUseCase getTopEntriesLastWeekUseCase0, @NotNull GetRecentNoticeListUseCase getRecentNoticeListUseCase0, @NotNull GetCategoriesUseCase getCategoriesUseCase0, @NotNull GetEntryListUseCase getEntryListUseCase0, @NotNull FollowBlogUseCase followBlogUseCase0, @NotNull UnFollowBlogUseCase unFollowBlogUseCase0, @NotNull GetTrendUseCase getTrendUseCase0, @NotNull GetRefererLogUseCase getRefererLogUseCase0, @NotNull GetRefererKeywordsUseCase getRefererKeywordsUseCase0, @NotNull GetRevenueVendorListUseCase getRevenueVendorListUseCase0, @NotNull GetRevenueCurrentUseCase getRevenueCurrentUseCase0, @NotNull GetFirstOpenUseCase getFirstOpenUseCase0, @NotNull SetFirstOpenedUseCase setFirstOpenedUseCase0, @NotNull ChangeBlockUseCase changeBlockUseCase0, @NotNull EntryRepository entryRepository0, @NotNull GetChallengeUseCase getChallengeUseCase0, @NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(getTopEntriesLastWeekUseCase0, "getTopEntriesLastWeekUseCase");
        Intrinsics.checkNotNullParameter(getRecentNoticeListUseCase0, "getRecentNoticeListUseCase");
        Intrinsics.checkNotNullParameter(getCategoriesUseCase0, "getCategoriesUseCase");
        Intrinsics.checkNotNullParameter(getEntryListUseCase0, "getEntryListUseCase");
        Intrinsics.checkNotNullParameter(followBlogUseCase0, "followBlogUseCase");
        Intrinsics.checkNotNullParameter(unFollowBlogUseCase0, "unFollowBlogUseCase");
        Intrinsics.checkNotNullParameter(getTrendUseCase0, "getTrendUseCase");
        Intrinsics.checkNotNullParameter(getRefererLogUseCase0, "getRefererLogUseCase");
        Intrinsics.checkNotNullParameter(getRefererKeywordsUseCase0, "getRefererKeywordsUseCase");
        Intrinsics.checkNotNullParameter(getRevenueVendorListUseCase0, "getRevenueVendorListUseCase");
        Intrinsics.checkNotNullParameter(getRevenueCurrentUseCase0, "getRevenueCurrentUseCase");
        Intrinsics.checkNotNullParameter(getFirstOpenUseCase0, "getFirstOpenUseCase");
        Intrinsics.checkNotNullParameter(setFirstOpenedUseCase0, "setFirstOpenedUseCase");
        Intrinsics.checkNotNullParameter(changeBlockUseCase0, "changeBlockUseCase");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(getChallengeUseCase0, "getChallengeUseCase");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.f = getTopEntriesLastWeekUseCase0;
        this.g = getRecentNoticeListUseCase0;
        this.h = getCategoriesUseCase0;
        this.i = getEntryListUseCase0;
        this.j = followBlogUseCase0;
        this.k = unFollowBlogUseCase0;
        this.l = getTrendUseCase0;
        this.m = getRefererLogUseCase0;
        this.n = getRefererKeywordsUseCase0;
        this.o = getRevenueVendorListUseCase0;
        this.p = getRevenueCurrentUseCase0;
        this.q = getFirstOpenUseCase0;
        this.r = setFirstOpenedUseCase0;
        this.s = changeBlockUseCase0;
        this.t = entryRepository0;
        this.u = getChallengeUseCase0;
        this.v = FlowKt.stateIn(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.special..inlined.map.1.2 blogMainViewModel$special$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.special..inlined.map.1.2.1 blogMainViewModel$special$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.special..inlined.map.1.2.1) {
                            blogMainViewModel$special$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.special..inlined.map.1.2.1)continuation0;
                            int v = blogMainViewModel$special$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                blogMainViewModel$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                blogMainViewModel$special$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            blogMainViewModel$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = blogMainViewModel$special$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(blogMainViewModel$special$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                blogMainViewModel$special$$inlined$map$1$2$10.b = 1;
                                return this.a.emit((((User)object0) == null ? null : ((User)object0).getId()), blogMainViewModel$special$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.a.collect(blogMainViewModel$special$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), -1L);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new t0(this, null), 3, null);
    }

    public final BlogMainInfo a(BlogInfo blogInfo0) {
        return BlogMainInfoKt.toBlogMainInfo(blogInfo0, new s2(this), new t2(this), new u2(this), new v2(this), new w2(this), new x2(this), new y2(this), new z2(this), new a3(this), new n2(this), new o2(this), new p2(this), new q2(this), new r2(this));
    }

    public final void a(String s, boolean z, boolean z1) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m2(this, s, null), 3, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h2(this, s, null), 3, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e2(this, s, null), 3, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g2(this, s, null, null), 3, null);
        if(z) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i2(this, s, null), 3, null);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j2(this, s, null), 3, null);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k2(this, s, null), 3, null);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l2(this, s, null), 3, null);
        }
        if(z1 || !p.isBlank(s)) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f2(this, s, null), 3, null);
        }
    }

    public static final void access$checkEntryEditable(BlogMainViewModel blogMainViewModel0, boolean z, Function0 function00) {
        blogMainViewModel0.getClass();
        if(z) {
            function00.invoke();
            return;
        }
        blogMainViewModel0.sendIntent(new ShowDialog(new Alert(null, string.label_dialog_entry_delete_no_permission, null, null, null, false, 29, null)));
    }

    public static final void access$onClickEntry(BlogMainViewModel blogMainViewModel0, String s, long v, boolean z, RestrictType restrictType0) {
        blogMainViewModel0.getClass();
        if(restrictType0 != null && !z) {
            blogMainViewModel0.sendEvent(new ShowToastBarDialog(restrictType0.getEntryMessageStringId()));
            return;
        }
        blogMainViewModel0.sendEvent(new GoEntry(s, v));
    }

    @NotNull
    public BlogMainUiState createInitState() {
        return new BlogMainUiState(null, null, new y0(this), new z0(this), new a1(this), null, null, null, null, null, null, new b1(this), new d1(this), new f1(this), new h1(this), new k1(this), new l1(this), null, new v0(this), null, new w0(this), false, new x0(this), 0x2A07E3, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull BlogMainUiState blogMainUiState0, @NotNull BlogMainIntent blogMainIntent0, @NotNull Continuation continuation0) {
        String s = null;
        if(blogMainIntent0 instanceof ChangeBlogInfo) {
            BlogInfo blogInfo0 = ((ChangeBlogInfo)blogMainIntent0).getBlogInfo();
            if(blogInfo0 == null) {
                return blogMainUiState0.clear();
            }
            String s1 = blogInfo0.getName();
            BlogMainInfo blogMainInfo0 = blogMainUiState0.getInfo();
            if(blogMainInfo0 != null) {
                s = blogMainInfo0.getName();
            }
            if(Intrinsics.areEqual(s1, s)) {
                return blogMainUiState0.updateInfo(this.a(blogInfo0));
            }
            BlogMainInfo blogMainInfo1 = this.a(blogInfo0);
            this.a(blogMainInfo1.getName(), blogMainInfo1.isMine(), blogMainInfo1.getRole().isMyOwnBlog());
            return blogMainUiState0.changeInfo(blogMainInfo1);
        }
        if(Intrinsics.areEqual(blogMainIntent0, Refresh.INSTANCE)) {
            this.a(blogMainUiState0.getBlogName(), blogMainUiState0.isMine(), blogMainUiState0.isOwner());
            return blogMainUiState0;
        }
        if(Intrinsics.areEqual(blogMainIntent0, RefreshEntryAndNoticeIfMyBlog.INSTANCE)) {
            String s2 = blogMainUiState0.getBlogName();
            if(!blogMainUiState0.isMine() || p.isBlank(s2)) {
                return blogMainUiState0;
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h2(this, s2, null), 3, null);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g2(this, s2, blogMainUiState0.getCategory().getCurrent(), null), 3, null);
            return blogMainUiState0;
        }
        if(Intrinsics.areEqual(blogMainIntent0, RefreshChallenge.INSTANCE)) {
            BlogMainChallengeList blogMainChallengeList0 = blogMainUiState0.getChallenge();
            if(blogMainChallengeList0 == null || !BlogMainChallengeKt.needRefresh(blogMainChallengeList0)) {
                return blogMainUiState0;
            }
            String s3 = blogMainUiState0.getBlogName();
            if(!blogMainUiState0.isOwner() && p.isBlank(s3)) {
                return blogMainUiState0;
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f2(this, s3, null), 3, null);
            return blogMainUiState0;
        }
        if(blogMainIntent0 instanceof UpdateStatisticsTrend) {
            BlogMainStatistics blogMainStatistics0 = blogMainUiState0.getStatistics();
            return blogMainStatistics0 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, BlogMainStatistics.copy$default(blogMainStatistics0, BlogMainStatisticsKt.toStatisticsTrendState(((UpdateStatisticsTrend)blogMainIntent0).getResult(), new r1(this, blogMainUiState0.getBlogName())), null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null);
        }
        if(blogMainIntent0 instanceof UpdateStatisticsRefererLog) {
            BlogMainStatistics blogMainStatistics1 = blogMainUiState0.getStatistics();
            return blogMainStatistics1 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, BlogMainStatistics.copy$default(blogMainStatistics1, null, BlogMainStatisticsKt.toStatisticsRefererLogState(((UpdateStatisticsRefererLog)blogMainIntent0).getResult(), new s1(this, blogMainUiState0.getBlogName())), null, null, 13, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null);
        }
        if(blogMainIntent0 instanceof UpdateStatisticsRefererKeyword) {
            List list0 = ((UpdateStatisticsRefererKeyword)blogMainIntent0).getResult() instanceof Success ? ((List)((Success)((UpdateStatisticsRefererKeyword)blogMainIntent0).getResult()).getData()) : CollectionsKt__CollectionsKt.emptyList();
            BlogMainStatistics blogMainStatistics2 = blogMainUiState0.getStatistics();
            return blogMainStatistics2 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, BlogMainStatistics.copy$default(blogMainStatistics2, null, null, BlogMainStatisticsKt.toStatisticsRefererKeywordState(((UpdateStatisticsRefererKeyword)blogMainIntent0).getResult(), new t1(this, list0)), null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null);
        }
        if(blogMainIntent0 instanceof UpdateStatisticsRevenueEnable) {
            if(((UpdateStatisticsRevenueEnable)blogMainIntent0).getEnable()) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u1(this, blogMainUiState0.getBlogName(), null), 3, null);
                BlogMainStatistics blogMainStatistics3 = blogMainUiState0.getStatistics();
                return blogMainStatistics3 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, BlogMainStatistics.copy$default(blogMainStatistics3, null, null, null, Loading.INSTANCE, 7, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null);
            }
            BlogMainStatistics blogMainStatistics4 = blogMainUiState0.getStatistics();
            return blogMainStatistics4 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, BlogMainStatistics.copy$default(blogMainStatistics4, null, null, null, null, 7, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null);
        }
        if(blogMainIntent0 instanceof UpdateStatisticsRevenue) {
            BlogMainStatistics blogMainStatistics5 = blogMainUiState0.getStatistics();
            return blogMainStatistics5 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, BlogMainStatistics.copy$default(blogMainStatistics5, null, null, null, BlogMainStatisticsKt.toStatisticsRevenueState(((UpdateStatisticsRevenue)blogMainIntent0).getResult(), new v1(this)), 7, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFDF, null);
        }
        if(blogMainIntent0 instanceof UpdateChallenge) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, BlogMainChallengeKt.toBlogMainChallengeList(((UpdateChallenge)blogMainIntent0).getChallenge(), new w1(this), new x1(this)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFBF, null);
        }
        if(blogMainIntent0 instanceof UpdateTopEntryList) {
            String s4 = blogMainUiState0.getBlogName();
            boolean z = blogMainUiState0.isMine();
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, BlogMainTopEntryKt.toBlogTopEntry(((UpdateTopEntryList)blogMainIntent0).getData(), new y1(this, s4, z), new n1(s4, z, this)), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFF7F, null);
        }
        if(blogMainIntent0 instanceof UpdateRecentNotice) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, BlogMainNoticeKt.toBlogMainNotice(((UpdateRecentNotice)blogMainIntent0).getNotice(), new o1(blogMainUiState0.getBlogName(), this, blogMainUiState0.isMine()), new p1(this)), null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFDFF, null);
        }
        if(blogMainIntent0 instanceof UpdateCategories) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, BlogMainCategoryKt.toBlogMainCategory(((UpdateCategories)blogMainIntent0).getCategories(), new z1(this), new a2(this)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFEFF, null);
        }
        if(blogMainIntent0 instanceof ChangeCurrentCategory) {
            BlogMainCategoryItem blogMainCategoryItem0 = ((ChangeCurrentCategory)blogMainIntent0).getCategory();
            if(blogMainCategoryItem0.getId() != blogMainUiState0.getCategory().getCurrent().getId()) {
                BlogMainCategoryItem blogMainCategoryItem1 = ((ChangeCurrentCategory)blogMainIntent0).getCategory();
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g2(this, blogMainUiState0.getBlogName(), blogMainCategoryItem1, null), 3, null);
            }
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, BlogMainCategory.copy$default(blogMainUiState0.getCategory(), null, blogMainCategoryItem0, null, 5, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFEFF, null);
        }
        if(blogMainIntent0 instanceof UpdateEntryList) {
            String s5 = blogMainUiState0.getBlogName();
            boolean z1 = blogMainUiState0.isMine();
            BlogMainInfo blogMainInfo2 = blogMainUiState0.getInfo();
            return blogMainInfo2 == null ? BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, new Flow() {
                @Override  // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                    com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2 blogMainViewModel$handleIntent$$inlined$map$1$20 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                            com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2.1 blogMainViewModel$handleIntent$$inlined$map$1$2$10;
                            if(continuation0 instanceof com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2.1) {
                                blogMainViewModel$handleIntent$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2.1)continuation0;
                                int v = blogMainViewModel$handleIntent$$inlined$map$1$2$10.b;
                                if((v & 0x80000000) == 0) {
                                    blogMainViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                        public Object a;
                                        public int b;

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            this.a = object0;
                                            this.b |= 0x80000000;
                                            return continuation0.emit(null, this);
                                        }
                                    };
                                }
                                else {
                                    blogMainViewModel$handleIntent$$inlined$map$1$2$10.b = v ^ 0x80000000;
                                }
                            }
                            else {
                                blogMainViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            Object object1 = blogMainViewModel$handleIntent$$inlined$map$1$2$10.a;
                            Object object2 = a.getCOROUTINE_SUSPENDED();
                            switch(blogMainViewModel$handleIntent$$inlined$map$1$2$10.b) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new d2(this.c, this.d, this.e, this.f, this.f, null));
                                    blogMainViewModel$handleIntent$$inlined$map$1$2$10.b = 1;
                                    return this.b.emit(pagingData0, blogMainViewModel$handleIntent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                                }
                                case 1: {
                                    ResultKt.throwOnFailure(object1);
                                    return Unit.INSTANCE;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    Object object0 = this.collect(blogMainViewModel$handleIntent$$inlined$map$1$20, continuation0);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            }, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFBFF, null) : BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, new Flow() {
                @Override  // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                    com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2 blogMainViewModel$handleIntent$$inlined$map$1$20 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                            com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2.1 blogMainViewModel$handleIntent$$inlined$map$1$2$10;
                            if(continuation0 instanceof com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2.1) {
                                blogMainViewModel$handleIntent$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.blog.main.BlogMainViewModel.handleIntent..inlined.map.1.2.1)continuation0;
                                int v = blogMainViewModel$handleIntent$$inlined$map$1$2$10.b;
                                if((v & 0x80000000) == 0) {
                                    blogMainViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                        public Object a;
                                        public int b;

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            this.a = object0;
                                            this.b |= 0x80000000;
                                            return continuation0.emit(null, this);
                                        }
                                    };
                                }
                                else {
                                    blogMainViewModel$handleIntent$$inlined$map$1$2$10.b = v ^ 0x80000000;
                                }
                            }
                            else {
                                blogMainViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            Object object1 = blogMainViewModel$handleIntent$$inlined$map$1$2$10.a;
                            Object object2 = a.getCOROUTINE_SUSPENDED();
                            switch(blogMainViewModel$handleIntent$$inlined$map$1$2$10.b) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new d2(this.c, this.d, this.e, this.f, this.f, null));
                                    blogMainViewModel$handleIntent$$inlined$map$1$2$10.b = 1;
                                    return this.b.emit(pagingData0, blogMainViewModel$handleIntent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                                }
                                case 1: {
                                    ResultKt.throwOnFailure(object1);
                                    return Unit.INSTANCE;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    Object object0 = this.collect(blogMainViewModel$handleIntent$$inlined$map$1$20, continuation0);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            }, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFBFF, null);
        }
        if(blogMainIntent0 instanceof OnClickFollow) {
            BlogMainInfo blogMainInfo3 = blogMainUiState0.getInfo();
            Others blogMainInfo$Others0 = blogMainInfo3 instanceof Others ? ((Others)blogMainInfo3) : null;
            if(blogMainInfo$Others0 == null) {
                return blogMainUiState0;
            }
            if(blogMainInfo$Others0.isBlocked()) {
                this.sendEvent(new ShowToast(null, Boxing.boxInt(string.label_blocked_not_follow_message), 1, null));
                return blogMainUiState0;
            }
            if(((OnClickFollow)blogMainIntent0).getNeedFollow()) {
                BlogMainTiara.INSTANCE.trackClickFollow();
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m1(this, blogMainUiState0.getBlogName(), null), 3, null);
                return BlogMainUiState.copy$default(blogMainUiState0, null, Others.copy-CdxTIzs$default(blogMainInfo$Others0, null, null, null, null, null, null, false, 0, true, null, false, null, null, false, null, false, null, null, null, null, null, null, null, 0x7FFEFF, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFFD, null);
            }
            BlogMainTiara.INSTANCE.trackClickUnFollow();
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b3(this, blogMainUiState0.getBlogName(), null), 3, null);
            return BlogMainUiState.copy$default(blogMainUiState0, null, Others.copy-CdxTIzs$default(blogMainInfo$Others0, null, null, null, null, null, null, false, 0, false, null, false, null, null, false, null, false, null, null, null, null, null, null, null, 0x7FFEFF, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFFD, null);
        }
        if(blogMainIntent0 instanceof ChangeFollow) {
            BlogMainInfo blogMainInfo4 = blogMainUiState0.getInfo();
            if(blogMainInfo4 instanceof Others) {
                s = (Others)blogMainInfo4;
            }
            return s == null ? blogMainUiState0 : BlogMainUiState.copy$default(blogMainUiState0, null, Others.copy-CdxTIzs$default(((Others)s), null, null, null, null, null, null, false, 0, ((ChangeFollow)blogMainIntent0).isFollowing(), null, false, null, null, false, null, false, null, null, null, null, null, null, null, 0x7FFEFF, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFFD, null);
        }
        if(blogMainIntent0 instanceof RequestChangeBlock) {
            if(!(blogMainUiState0.getInfo() instanceof Others)) {
                return blogMainUiState0;
            }
            long v = ((RequestChangeBlock)blogMainIntent0).getOwnerId();
            boolean z2 = ((RequestChangeBlock)blogMainIntent0).getNeedBlock();
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u0(this, v, z2, null), 3, null);
            return blogMainUiState0;
        }
        if(blogMainIntent0 instanceof ChangeBlockState) {
            BlogMainInfo blogMainInfo5 = blogMainUiState0.getInfo();
            if(blogMainInfo5 instanceof Others) {
                s = (Others)blogMainInfo5;
            }
            return s == null ? blogMainUiState0 : BlogMainUiState.copy$default(blogMainUiState0, null, Others.copy-CdxTIzs$default(((Others)s), null, null, null, null, null, null, false, 0, false, null, ((ChangeBlockState)blogMainIntent0).getNeedBlock(), null, null, false, null, false, null, null, null, null, null, null, null, 0x7FFBFF, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFFFD, null);
        }
        if(blogMainIntent0 instanceof ShowBottomSheet) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((ShowBottomSheet)blogMainIntent0).getType(), null, null, null, false, null, 0x7DFFFF, null);
        }
        if(Intrinsics.areEqual(blogMainIntent0, HideBottomSheet.INSTANCE)) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7DFFFF, null);
        }
        if(blogMainIntent0 instanceof ShowDialog) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((ShowDialog)blogMainIntent0).getType(), null, false, null, 0x77FFFF, null);
        }
        if(Intrinsics.areEqual(blogMainIntent0, HideDialog.INSTANCE)) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x77FFFF, null);
        }
        if(Intrinsics.areEqual(blogMainIntent0, NeedGuide.INSTANCE)) {
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 0x5FFFFF, null);
        }
        if(Intrinsics.areEqual(blogMainIntent0, GuideDismiss.INSTANCE)) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new q1(this, null), 3, null);
            return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x5FFFFF, null);
        }
        if(!(blogMainIntent0 instanceof ShowErrorDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        ErrorModel errorModel0 = ((ShowErrorDialog)blogMainIntent0).getErrorModel();
        return BlogMainUiState.copy$default(blogMainUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Alert(errorModel0.getTitle(), null, errorModel0.getMessage(), null, null, false, 58, null), null, false, null, 0x77FFFF, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((BlogMainUiState)object0), ((BlogMainIntent)object1), continuation0);
    }
}

