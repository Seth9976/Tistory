package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.data.datasource.BlogFollowerDataSource;
import com.kakao.tistory.data.datasource.BlogFollowingDataSource;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.SortItem.BlogFollowSortItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.repository.FeedRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.usecase.GetCurrentBlogNameUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.view.blog.FollowingTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003OPQB!\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001A\u00020\f2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\f\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\f\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001B\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0012\u00A2\u0006\u0004\b\u001B\u0010\u001AJ\u0015\u0010\u001E\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\u001C\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0015\u0010\"\u001A\u00020\f2\u0006\u0010!\u001A\u00020 \u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001A\u00020\f2\u0006\u0010!\u001A\u00020 \u00A2\u0006\u0004\b$\u0010#J\u0015\u0010\'\u001A\u00020\f2\u0006\u0010&\u001A\u00020%\u00A2\u0006\u0004\b\'\u0010(R.\u00101\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0*0)8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00105\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0*0)8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b2\u0010,\u001A\u0004\b3\u0010.\"\u0004\b4\u00100R\u001D\u0010;\u001A\b\u0012\u0004\u0012\u00020%068\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u001D\u0010>\u001A\b\u0012\u0004\u0012\u00020%068\u0006\u00A2\u0006\f\n\u0004\b<\u00108\u001A\u0004\b=\u0010:R)\u0010C\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020@0?068\u0006\u00A2\u0006\f\n\u0004\bA\u00108\u001A\u0004\bB\u0010:R\u001D\u0010F\u001A\b\u0012\u0004\u0012\u00020%068\u0006\u00A2\u0006\f\n\u0004\bD\u00108\u001A\u0004\bE\u0010:R\u001F\u0010K\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0H0G8F\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR\u001D\u0010N\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0H0G8F\u00A2\u0006\u0006\u001A\u0004\bM\u0010J\u00A8\u0006R"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/FeedRepository;", "feedRepository", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "Lcom/kakao/tistory/domain/usecase/GetCurrentBlogNameUseCase;", "currentBlogNameUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/FeedRepository;Lcom/kakao/tistory/domain/repository/OldBlogRepository;Lcom/kakao/tistory/domain/usecase/GetCurrentBlogNameUseCase;)V", "", "blogName", "", "init", "(Ljava/lang/String;)V", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "type", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "getSortItems", "(Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;)Ljava/util/List;", "followingLoadComplete", "()V", "followerLoadComplete", "sortItem", "updateBlogFollowingSortType", "(Lcom/kakao/tistory/domain/entity/SortItem;)V", "updateBlogFollowerSortType", "Lcom/kakao/tistory/domain/entity/User;", "user", "onClickFollower", "(Lcom/kakao/tistory/domain/entity/User;)V", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "onClickFollowing", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "onClickFollow", "", "count", "updateFollowingTotalCount", "(J)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "q", "Lkotlinx/coroutines/flow/Flow;", "getBlogFollowings", "()Lkotlinx/coroutines/flow/Flow;", "setBlogFollowings", "(Lkotlinx/coroutines/flow/Flow;)V", "blogFollowings", "r", "getBlogFollowers", "setBlogFollowers", "blogFollowers", "Landroidx/lifecycle/MutableLiveData;", "s", "Landroidx/lifecycle/MutableLiveData;", "getBlogFollowingTotalCount", "()Landroidx/lifecycle/MutableLiveData;", "blogFollowingTotalCount", "t", "getBlogFollowerTotalCount", "blogFollowerTotalCount", "Lkotlin/Pair;", "", "u", "getUpdatedBlog", "updatedBlog", "v", "getUpdatedTotalCount", "updatedTotalCount", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToBlogActivity", "()Landroidx/lifecycle/LiveData;", "goToBlogActivity", "", "getShowToast", "showToast", "BlogFollowerSortType", "BlogFollowingSortType", "Type", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogFollowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogFollowViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,215:1\n193#2:216\n193#2:217\n*S KotlinDebug\n*F\n+ 1 BlogFollowViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel\n*L\n61#1:216\n70#1:217\n*E\n"})
public final class BlogFollowViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$BlogFollowerSortType;", "", "", "a", "I", "getTitleResourceId", "()I", "titleResourceId", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "LATEST", "BLOG_NICK_NAME", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum BlogFollowerSortType {
        LATEST(0x7F12032C, "recency"),  // string:label_blog_follow_latest "최신 구독순"
        BLOG_NICK_NAME(string.label_blog_follow_blog_nickname, "letter");

        public final int a;
        public final String b;
        public static final BlogFollowerSortType[] c;
        public static final EnumEntries d;

        static {
            BlogFollowerSortType.c = arr_blogFollowViewModel$BlogFollowerSortType;
            Intrinsics.checkNotNullParameter(arr_blogFollowViewModel$BlogFollowerSortType, "entries");
            BlogFollowerSortType.d = new a(arr_blogFollowViewModel$BlogFollowerSortType);
        }

        public BlogFollowerSortType(int v1, String s1) {
            this.a = v1;
            this.b = s1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return BlogFollowerSortType.d;
        }

        public final int getTitleResourceId() {
            return this.a;
        }

        @NotNull
        public final String getValue() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$BlogFollowingSortType;", "", "", "a", "I", "getTitleResourceId", "()I", "titleResourceId", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "LATEST", "BLOG_NAME", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum BlogFollowingSortType {
        LATEST(0x7F12032C, "recency"),  // string:label_blog_follow_latest "최신 구독순"
        BLOG_NAME(string.label_blog_follow_blog_name, "letter");

        public final int a;
        public final String b;
        public static final BlogFollowingSortType[] c;
        public static final EnumEntries d;

        static {
            BlogFollowingSortType.c = arr_blogFollowViewModel$BlogFollowingSortType;
            Intrinsics.checkNotNullParameter(arr_blogFollowViewModel$BlogFollowingSortType, "entries");
            BlogFollowingSortType.d = new a(arr_blogFollowViewModel$BlogFollowingSortType);
        }

        public BlogFollowingSortType(int v1, String s1) {
            this.a = v1;
            this.b = s1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return BlogFollowingSortType.d;
        }

        public final int getTitleResourceId() {
            return this.a;
        }

        @NotNull
        public final String getValue() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "", "", "a", "I", "getTitleStringId", "()I", "titleStringId", "FOLLOWING", "FOLLOWER", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Type {
        FOLLOWING(string.label_feed_following),
        FOLLOWER(string.label_feed_follower);

        public final int a;
        public static final Type[] b;
        public static final EnumEntries c;

        static {
            Type.b = arr_blogFollowViewModel$Type;
            Intrinsics.checkNotNullParameter(arr_blogFollowViewModel$Type, "entries");
            Type.c = new a(arr_blogFollowViewModel$Type);
        }

        public Type(int v1) {
            this.a = v1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Type.c;
        }

        public final int getTitleStringId() {
            return this.a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.FOLLOWING.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.FOLLOWER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final FeedRepository g;
    public final OldBlogRepository h;
    public final GetCurrentBlogNameUseCase i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableStateFlow m;
    public final MutableStateFlow n;
    public BlogFollowingDataSource o;
    public BlogFollowerDataSource p;
    public Flow q;
    public Flow r;
    public final MutableLiveData s;
    public final MutableLiveData t;
    public final MutableLiveData u;
    public final MutableLiveData v;

    @Inject
    public BlogFollowViewModel(@NotNull FeedRepository feedRepository0, @NotNull OldBlogRepository oldBlogRepository0, @NotNull GetCurrentBlogNameUseCase getCurrentBlogNameUseCase0) {
        Intrinsics.checkNotNullParameter(feedRepository0, "feedRepository");
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        Intrinsics.checkNotNullParameter(getCurrentBlogNameUseCase0, "currentBlogNameUseCase");
        super();
        this.g = feedRepository0;
        this.h = oldBlogRepository0;
        this.i = getCurrentBlogNameUseCase0;
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.l = mutableLiveData0;
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow("recency");
        this.m = mutableStateFlow0;
        MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow("recency");
        this.n = mutableStateFlow1;
        this.q = FlowKt.transformLatest(mutableStateFlow0, new Function3(this) {
            public int a;
            public FlowCollector b;
            public Object c;
            public final BlogFollowViewModel d;

            {
                this.d = blogFollowViewModel0;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
                com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.special..inlined.flatMapLatest.1 blogFollowViewModel$special$$inlined$flatMapLatest$10 = new com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.special..inlined.flatMapLatest.1(continuation0, this.d);
                blogFollowViewModel$special$$inlined$flatMapLatest$10.b = flowCollector0;
                blogFollowViewModel$special$$inlined$flatMapLatest$10.c = object0;
                return blogFollowViewModel$special$$inlined$flatMapLatest$10.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = qd.a.getCOROUTINE_SUSPENDED();
                switch(this.a) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        FlowCollector flowCollector0 = this.b;
                        String s = (String)this.c;
                        Flow flow0 = CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(20, 3, false, 20, 0, 0, 52, null), null, new j(this.d, s), 2, null).getFlow(), ViewModelKt.getViewModelScope(this.d));
                        this.a = 1;
                        return FlowKt.emitAll(flowCollector0, flow0, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
        this.r = FlowKt.transformLatest(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(mutableLiveData0), mutableStateFlow1, h.a), new Function3(this) {
            public int a;
            public FlowCollector b;
            public Object c;
            public final BlogFollowViewModel d;

            {
                this.d = blogFollowViewModel0;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
                com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.special..inlined.flatMapLatest.2 blogFollowViewModel$special$$inlined$flatMapLatest$20 = new com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.special..inlined.flatMapLatest.2(continuation0, this.d);
                blogFollowViewModel$special$$inlined$flatMapLatest$20.b = flowCollector0;
                blogFollowViewModel$special$$inlined$flatMapLatest$20.c = object0;
                return blogFollowViewModel$special$$inlined$flatMapLatest$20.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = qd.a.getCOROUTINE_SUSPENDED();
                switch(this.a) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        FlowCollector flowCollector0 = this.b;
                        Pair pair0 = (Pair)this.c;
                        Flow flow0 = CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(20, 10, false, 20, 0, 0, 52, null), null, new i(this.d, ((String)pair0.component1()), ((String)pair0.component2())), 2, null).getFlow(), ViewModelKt.getViewModelScope(this.d));
                        this.a = 1;
                        return FlowKt.emitAll(flowCollector0, flow0, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
        this.s = new MutableLiveData(0L);
        this.t = new MutableLiveData(0L);
        this.u = new MutableLiveData();
        this.v = new MutableLiveData();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l(this, null), 3, null);
    }

    public static final Object access$blogFollowers$lambda$1(String s, String s1, Continuation continuation0) {
        return new Pair(s, s1);
    }

    public final void followerLoadComplete() {
        this.t.postValue(((long)(this.p == null ? 0L : this.p.getTotalCount())));
    }

    public final void followingLoadComplete() {
        this.s.postValue(((long)(this.o == null ? 0L : this.o.getTotalCount())));
    }

    @NotNull
    public final MutableLiveData getBlogFollowerTotalCount() {
        return this.t;
    }

    @NotNull
    public final Flow getBlogFollowers() {
        return this.r;
    }

    @NotNull
    public final MutableLiveData getBlogFollowingTotalCount() {
        return this.s;
    }

    @NotNull
    public final Flow getBlogFollowings() {
        return this.q;
    }

    @NotNull
    public final LiveData getGoToBlogActivity() {
        return this.j;
    }

    @NotNull
    public final LiveData getShowToast() {
        return this.k;
    }

    @NotNull
    public final List getSortItems(@NotNull Type blogFollowViewModel$Type0) {
        List list0;
        Intrinsics.checkNotNullParameter(blogFollowViewModel$Type0, "type");
        int v = 0;
        switch(WhenMappings.$EnumSwitchMapping$0[blogFollowViewModel$Type0.ordinal()]) {
            case 1: {
                list0 = new ArrayList();
                BlogFollowingSortType[] arr_blogFollowViewModel$BlogFollowingSortType = BlogFollowingSortType.values();
                while(v < arr_blogFollowViewModel$BlogFollowingSortType.length) {
                    BlogFollowingSortType blogFollowViewModel$BlogFollowingSortType0 = arr_blogFollowViewModel$BlogFollowingSortType[v];
                    String s = BaseKt.getAppContext().getString(blogFollowViewModel$BlogFollowingSortType0.getTitleResourceId());
                    Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                    ((ArrayList)list0).add(new BlogFollowSortItem(blogFollowViewModel$BlogFollowingSortType0.getValue(), s));
                    ++v;
                }
                return list0;
            }
            case 2: {
                list0 = new ArrayList();
                BlogFollowerSortType[] arr_blogFollowViewModel$BlogFollowerSortType = BlogFollowerSortType.values();
                while(v < arr_blogFollowViewModel$BlogFollowerSortType.length) {
                    BlogFollowerSortType blogFollowViewModel$BlogFollowerSortType0 = arr_blogFollowViewModel$BlogFollowerSortType[v];
                    String s1 = BaseKt.getAppContext().getString(blogFollowViewModel$BlogFollowerSortType0.getTitleResourceId());
                    Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                    ((ArrayList)list0).add(new BlogFollowSortItem(blogFollowViewModel$BlogFollowerSortType0.getValue(), s1));
                    ++v;
                }
                return list0;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final MutableLiveData getUpdatedBlog() {
        return this.u;
    }

    @NotNull
    public final MutableLiveData getUpdatedTotalCount() {
        return this.v;
    }

    public final void init(@Nullable String s) {
        this.l.setValue(s);
        BlogFollowingDataSource blogFollowingDataSource0 = this.o;
        if(blogFollowingDataSource0 != null) {
            blogFollowingDataSource0.invalidate();
        }
        BlogFollowerDataSource blogFollowerDataSource0 = this.p;
        if(blogFollowerDataSource0 != null) {
            blogFollowerDataSource0.invalidate();
        }
    }

    public static void init$default(BlogFollowViewModel blogFollowViewModel0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        blogFollowViewModel0.init(s);
    }

    public final void onClickFollow(@NotNull Blog blog0) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k(blog0, this, null), 3, null);
    }

    public final void onClickFollower(@NotNull User user0) {
        Intrinsics.checkNotNullParameter(user0, "user");
        FollowingTiara.INSTANCE.trackClickBlog("구독자");
        Blog blog0 = user0.getDefaultBlog();
        this.j.setValue(new Event((blog0 == null ? null : blog0.getName())));
    }

    public final void onClickFollowing(@NotNull Blog blog0) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        FollowingTiara.trackClickBlog$default(FollowingTiara.INSTANCE, null, 1, null);
        Event event0 = new Event(blog0.getName());
        this.j.setValue(event0);
    }

    public final void setBlogFollowers(@NotNull Flow flow0) {
        Intrinsics.checkNotNullParameter(flow0, "<set-?>");
        this.r = flow0;
    }

    public final void setBlogFollowings(@NotNull Flow flow0) {
        Intrinsics.checkNotNullParameter(flow0, "<set-?>");
        this.q = flow0;
    }

    public final void updateBlogFollowerSortType(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "sortItem");
        String s = ((BlogFollowSortItem)sortItem0).getValue();
        this.n.tryEmit(s);
    }

    public final void updateBlogFollowingSortType(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "sortItem");
        String s = ((BlogFollowSortItem)sortItem0).getValue();
        this.m.tryEmit(s);
    }

    public final void updateFollowingTotalCount(long v) {
        this.g.getFollowingCount().setValue(v);
    }
}

