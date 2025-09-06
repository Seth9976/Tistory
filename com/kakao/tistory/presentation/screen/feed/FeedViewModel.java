package com.kakao.tistory.presentation.screen.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.android.base.viewmodel.Event;
import com.kakao.tistory.domain.entity.Thumbnail;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.FeedRepository;
import com.kakao.tistory.domain.usecase.GetBlogFollowerCountUseCase;
import com.kakao.tistory.domain.usecase.GetBlogFollowingCountUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.livedata.ChangedEntryLiveData;
import com.kakao.tistory.presentation.screen.feed.tiara.FeedTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u001D\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\u000E\u00A2\u0006\u0004\b\u001A\u0010\u0010J\r\u0010\u001B\u001A\u00020\u000E\u00A2\u0006\u0004\b\u001B\u0010\u0010J\u0015\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u001C\u001A\u00020\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u001F\u0010%\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001F8\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R%\u0010*\u001A\u0010\u0012\f\u0012\n \'*\u0004\u0018\u00010&0&0\u001F8\u0006\u00A2\u0006\f\n\u0004\b(\u0010\"\u001A\u0004\b)\u0010$R%\u0010-\u001A\u0010\u0012\f\u0012\n \'*\u0004\u0018\u00010&0&0\u001F8\u0006\u00A2\u0006\f\n\u0004\b+\u0010\"\u001A\u0004\b,\u0010$R\u001D\u00104\u001A\b\u0012\u0004\u0012\u00020/0.8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u001D\u00107\u001A\b\u0012\u0004\u0012\u00020&0.8\u0006\u00A2\u0006\f\n\u0004\b5\u00101\u001A\u0004\b6\u00103R#\u0010?\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09088\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u001D\u0010B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0@0\u001F8F\u00A2\u0006\u0006\u001A\u0004\bA\u0010$R\u001D\u0010D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0@0\u001F8F\u00A2\u0006\u0006\u001A\u0004\bC\u0010$R\u001D\u0010F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160@0\u001F8F\u00A2\u0006\u0006\u001A\u0004\bE\u0010$R\u001F\u0010H\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0@0\u001F8F\u00A2\u0006\u0006\u001A\u0004\bG\u0010$R\u001D\u0010J\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140@0\u001F8F\u00A2\u0006\u0006\u001A\u0004\bI\u0010$\u00A8\u0006K"}, d2 = {"Lcom/kakao/tistory/presentation/screen/feed/FeedViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/FeedRepository;", "feedRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/usecase/GetBlogFollowingCountUseCase;", "getBlogFollowingCountUseCase", "Lcom/kakao/tistory/domain/usecase/GetBlogFollowerCountUseCase;", "getBlogFollowerCountUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/FeedRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/usecase/GetBlogFollowingCountUseCase;Lcom/kakao/tistory/domain/usecase/GetBlogFollowerCountUseCase;)V", "", "refresh", "()V", "initData", "getBlogFollowerCount", "syncUserProfile", "", "position", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "onClickEntryItem", "(ILcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "onClickFollowing", "onClickFollower", "entry", "onClickBlog", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "Landroidx/lifecycle/LiveData;", "", "p", "Landroidx/lifecycle/LiveData;", "getCurrentBlogName", "()Landroidx/lifecycle/LiveData;", "currentBlogName", "", "kotlin.jvm.PlatformType", "q", "getFollowingCount", "followingCount", "r", "getFollowerCount", "followerCount", "Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "s", "Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "getUpdatedLikeStates", "()Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "updatedLikeStates", "t", "getUpdatedCommentCounts", "updatedCommentCounts", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/screen/feed/contract/FeedEntry;", "u", "Lkotlinx/coroutines/flow/Flow;", "getFeedList", "()Lkotlinx/coroutines/flow/Flow;", "feedList", "Lcom/kakao/android/base/viewmodel/Event;", "getGoToBlogFollowing", "goToBlogFollowing", "getGoToBlogFollower", "goToBlogFollower", "getGoToEntry", "goToEntry", "getGoToBlog", "goToBlog", "getShowAlertDialog", "showAlertDialog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFeedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedViewModel.kt\ncom/kakao/tistory/presentation/screen/feed/FeedViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,166:1\n53#2:167\n55#2:171\n50#3:168\n55#3:170\n107#4:169\n*S KotlinDebug\n*F\n+ 1 FeedViewModel.kt\ncom/kakao/tistory/presentation/screen/feed/FeedViewModel\n*L\n75#1:167\n75#1:171\n75#1:168\n75#1:170\n75#1:169\n*E\n"})
public final class FeedViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final AccountRepository g;
    public final FeedRepository h;
    public final GetBlogFollowingCountUseCase i;
    public final GetBlogFollowerCountUseCase j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final LiveData p;
    public final LiveData q;
    public final LiveData r;
    public final ChangedEntryLiveData s;
    public final ChangedEntryLiveData t;
    public final Flow u;

    @Inject
    public FeedViewModel(@NotNull AccountRepository accountRepository0, @NotNull FeedRepository feedRepository0, @NotNull EntryRepository entryRepository0, @NotNull GetBlogFollowingCountUseCase getBlogFollowingCountUseCase0, @NotNull GetBlogFollowerCountUseCase getBlogFollowerCountUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(feedRepository0, "feedRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(getBlogFollowingCountUseCase0, "getBlogFollowingCountUseCase");
        Intrinsics.checkNotNullParameter(getBlogFollowerCountUseCase0, "getBlogFollowerCountUseCase");
        super();
        this.g = accountRepository0;
        this.h = feedRepository0;
        this.i = getBlogFollowingCountUseCase0;
        this.j = getBlogFollowerCountUseCase0;
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = accountRepository0.getOldCurrentBlogName();
        this.q = Transformations.distinctUntilChanged(feedRepository0.getFollowingCount());
        this.r = Transformations.distinctUntilChanged(feedRepository0.getFollowerCount());
        this.s = new ChangedEntryLiveData(entryRepository0.getUpdatedLikeStates());
        this.t = new ChangedEntryLiveData(entryRepository0.getUpdatedCommentCounts());
        this.u = CachedPagingDataKt.cachedIn(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.screen.feed.FeedViewModel.special..inlined.map.1.2 feedViewModel$special$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.screen.feed.FeedViewModel.special..inlined.map.1.2.1 feedViewModel$special$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.screen.feed.FeedViewModel.special..inlined.map.1.2.1) {
                            feedViewModel$special$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.feed.FeedViewModel.special..inlined.map.1.2.1)continuation0;
                            int v = feedViewModel$special$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                feedViewModel$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                feedViewModel$special$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            feedViewModel$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = feedViewModel$special$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(feedViewModel$special$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new c0(this.b, null));
                                feedViewModel$special$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(pagingData0, feedViewModel$special$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.collect(feedViewModel$special$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g0(this, null), 3, null);
        this.initData();
    }

    public static final void access$getBlogFollowingCount(FeedViewModel feedViewModel0) {
        feedViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(feedViewModel0), null, null, new e0(feedViewModel0, null), 3, null);
    }

    public final void getBlogFollowerCount() {
        String s = (String)this.p.getValue();
        if(s != null) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d0(this, s, null), 3, null);
        }
    }

    @NotNull
    public final LiveData getCurrentBlogName() {
        return this.p;
    }

    @NotNull
    public final Flow getFeedList() {
        return this.u;
    }

    @NotNull
    public final LiveData getFollowerCount() {
        return this.r;
    }

    @NotNull
    public final LiveData getFollowingCount() {
        return this.q;
    }

    @NotNull
    public final LiveData getGoToBlog() {
        return this.n;
    }

    @NotNull
    public final LiveData getGoToBlogFollower() {
        return this.l;
    }

    @NotNull
    public final LiveData getGoToBlogFollowing() {
        return this.k;
    }

    @NotNull
    public final LiveData getGoToEntry() {
        return this.m;
    }

    @NotNull
    public final LiveData getShowAlertDialog() {
        return this.o;
    }

    @NotNull
    public final ChangedEntryLiveData getUpdatedCommentCounts() {
        return this.t;
    }

    @NotNull
    public final ChangedEntryLiveData getUpdatedLikeStates() {
        return this.s;
    }

    public final void initData() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e0(this, null), 3, null);
        this.getBlogFollowerCount();
    }

    public final void onClickBlog(@NotNull EntryItem entryItem0) {
        Intrinsics.checkNotNullParameter(entryItem0, "entry");
        FeedTiara.INSTANCE.trackClickBlog(entryItem0.getBlogTitle(), entryItem0.getPermalink());
        Event event0 = new Event(entryItem0.getBlogName());
        this.n.setValue(event0);
    }

    public final void onClickEntryItem(int v, @NotNull EntryItem entryItem0) {
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        Thumbnail thumbnail0 = entryItem0.getThumbnail();
        FeedTiara.INSTANCE.trackClickEntry(entryItem0.getId(), entryItem0.getTitle(), (thumbnail0 == null ? null : thumbnail0.getOrigin()), entryItem0.getCategory(), entryItem0.getCategoryLabel(), entryItem0.getBlogName(), v, entryItem0.getPermalink());
        Event event0 = new Event(entryItem0);
        this.m.setValue(event0);
    }

    public final void onClickFollower() {
        Unit unit0;
        FeedTiara.INSTANCE.trackClickFollower();
        String s = (String)this.p.getValue();
        if(s == null) {
            unit0 = null;
        }
        else {
            Event event0 = new Event(s);
            this.l.setValue(event0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            Event event1 = new Event(string.label_feed_default_blog_empty);
            this.o.setValue(event1);
        }
    }

    public final void onClickFollowing() {
        FeedTiara.INSTANCE.trackClickFollowing();
        Event event0 = new Event(Unit.INSTANCE);
        this.k.setValue(event0);
    }

    public final void refresh() {
        this.syncUserProfile();
        this.initData();
    }

    public final void syncUserProfile() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h0(this, null), 3, null);
    }
}

