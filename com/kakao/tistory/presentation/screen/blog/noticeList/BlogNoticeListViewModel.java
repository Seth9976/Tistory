package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.usecase.GetNoticeListUseCase;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.GoNotice;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.ShowToastBarDialog;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ChangeBlogInfo;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.HideBottomSheet;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.HideDialog;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.Refresh;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.RefreshComplete;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ShowBottomSheet;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ShowErrorDialog;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.UpdateCurrentUserId;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListUiState;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType.Alert;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J \u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListUiState;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/blog/usecase/GetNoticeListUseCase;", "getNoticeListUseCase", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/blog/usecase/GetNoticeListUseCase;Lcom/kakao/tistory/domain/repository/OldBlogRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListUiState;Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogNoticeListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogNoticeListViewModel.kt\ncom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,232:1\n53#2:233\n55#2:237\n53#2:238\n55#2:242\n50#3:234\n55#3:236\n50#3:239\n55#3:241\n107#4:235\n107#4:240\n*S KotlinDebug\n*F\n+ 1 BlogNoticeListViewModel.kt\ncom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListViewModel\n*L\n33#1:233\n33#1:237\n154#1:238\n154#1:242\n33#1:234\n33#1:236\n154#1:239\n154#1:241\n33#1:235\n154#1:240\n*E\n"})
public final class BlogNoticeListViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final AccountRepository f;
    public final GetNoticeListUseCase g;
    public final EntryRepository h;
    public final StateFlow i;

    @Inject
    public BlogNoticeListViewModel(@NotNull AccountRepository accountRepository0, @NotNull GetNoticeListUseCase getNoticeListUseCase0, @NotNull OldBlogRepository oldBlogRepository0, @NotNull EntryRepository entryRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(getNoticeListUseCase0, "getNoticeListUseCase");
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        super();
        this.f = accountRepository0;
        this.g = getNoticeListUseCase0;
        this.h = entryRepository0;
        this.i = FlowKt.stateIn(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.special..inlined.map.1.2 blogNoticeListViewModel$special$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.special..inlined.map.1.2.1 blogNoticeListViewModel$special$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.special..inlined.map.1.2.1) {
                            blogNoticeListViewModel$special$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.special..inlined.map.1.2.1)continuation0;
                            int v = blogNoticeListViewModel$special$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                blogNoticeListViewModel$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                blogNoticeListViewModel$special$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            blogNoticeListViewModel$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = blogNoticeListViewModel$special$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(blogNoticeListViewModel$special$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                blogNoticeListViewModel$special$$inlined$map$1$2$10.b = 1;
                                return this.a.emit((((User)object0) == null ? null : ((User)object0).getId()), blogNoticeListViewModel$special$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.a.collect(blogNoticeListViewModel$special$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), -1L);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a0(this, null), 3, null);
    }

    public static final void access$checkEntryEditable(BlogNoticeListViewModel blogNoticeListViewModel0, boolean z, Function0 function00) {
        blogNoticeListViewModel0.getClass();
        if(z) {
            function00.invoke();
            return;
        }
        blogNoticeListViewModel0.sendIntent(new ShowDialog(new Alert(null, string.label_dialog_entry_delete_no_permission, null, null, null, false, 29, null)));
    }

    public static final void access$onClickEntry(BlogNoticeListViewModel blogNoticeListViewModel0, String s, long v, boolean z, RestrictType restrictType0) {
        blogNoticeListViewModel0.getClass();
        if(restrictType0 != null && !z) {
            blogNoticeListViewModel0.sendEvent(new ShowToastBarDialog(restrictType0.getEntryMessageStringId()));
            return;
        }
        blogNoticeListViewModel0.sendEvent(new GoNotice(s, v));
    }

    @NotNull
    public BlogNoticeListUiState createInitState() {
        return new BlogNoticeListUiState(null, null, null, null, new b0(this), null, new c0(this), new d0(this), new e0(this), new f0(this), new h0(this), new j0(this), new l0(this), new o0(this), 0x2F, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull BlogNoticeListUiState blogNoticeListUiState0, @NotNull BlogNoticeListIntent blogNoticeListIntent0, @NotNull Continuation continuation0) {
        if(blogNoticeListIntent0 instanceof ChangeBlogInfo) {
            BlogInfo blogInfo0 = ((ChangeBlogInfo)blogNoticeListIntent0).getBlog();
            BlogInfo blogInfo1 = blogNoticeListUiState0.getBlogInfo();
            if(!Intrinsics.areEqual((blogInfo1 == null ? null : blogInfo1.getName()), (blogInfo0 == null ? null : blogInfo0.getName()))) {
                this.sendIntent(Refresh.INSTANCE);
                return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, blogInfo0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFA, null);
            }
            return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, blogInfo0, null, blogNoticeListUiState0.getNoticeList(), null, null, null, null, null, null, null, null, null, null, null, 0x3FFA, null);
        }
        if(blogNoticeListIntent0 instanceof UpdateCurrentUserId) {
            return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, ((UpdateCurrentUserId)blogNoticeListIntent0).getUserId(), null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFD, null);
        }
        if(Intrinsics.areEqual(blogNoticeListIntent0, Refresh.INSTANCE)) {
            String s = blogNoticeListUiState0.getBlogName();
            if(s != null) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new s0(this, s, null), 3, null);
            }
            return blogNoticeListUiState0;
        }
        if(blogNoticeListIntent0 instanceof RefreshComplete) {
            boolean z = blogNoticeListUiState0.isMine();
            BlogInfo blogInfo2 = blogNoticeListUiState0.getBlogInfo();
            return blogInfo2 == null || blogInfo2.getRole() == null ? BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, new Flow() {
                @Override  // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                    com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2 blogNoticeListViewModel$handleIntent$$inlined$map$1$20 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                            com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2.1 blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10;
                            if(continuation0 instanceof com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2.1) {
                                blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2.1)continuation0;
                                int v = blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b;
                                if((v & 0x80000000) == 0) {
                                    blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                    blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b = v ^ 0x80000000;
                                }
                            }
                            else {
                                blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                            Object object1 = blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.a;
                            Object object2 = a.getCOROUTINE_SUSPENDED();
                            switch(blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new r0(this.c, this.d, this.d, null));
                                    blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b = 1;
                                    return this.b.emit(pagingData0, blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                    Object object0 = this.collect(blogNoticeListViewModel$handleIntent$$inlined$map$1$20, continuation0);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            }, null, null, null, null, null, null, null, null, null, null, null, 0x3FFB, null) : BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, new Flow() {
                @Override  // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                    com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2 blogNoticeListViewModel$handleIntent$$inlined$map$1$20 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                            com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2.1 blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10;
                            if(continuation0 instanceof com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2.1) {
                                blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListViewModel.handleIntent..inlined.map.1.2.1)continuation0;
                                int v = blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b;
                                if((v & 0x80000000) == 0) {
                                    blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                    blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b = v ^ 0x80000000;
                                }
                            }
                            else {
                                blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                            Object object1 = blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.a;
                            Object object2 = a.getCOROUTINE_SUSPENDED();
                            switch(blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new r0(this.c, this.d, this.d, null));
                                    blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b = 1;
                                    return this.b.emit(pagingData0, blogNoticeListViewModel$handleIntent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                    Object object0 = this.collect(blogNoticeListViewModel$handleIntent$$inlined$map$1$20, continuation0);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            }, null, null, null, null, null, null, null, null, null, null, null, 0x3FFB, null);
        }
        if(blogNoticeListIntent0 instanceof ShowBottomSheet) {
            return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, null, ((ShowBottomSheet)blogNoticeListIntent0).getNoticeBottomSheet(), null, null, null, null, null, null, null, null, null, null, 0x3FF7, null);
        }
        if(Intrinsics.areEqual(blogNoticeListIntent0, HideBottomSheet.INSTANCE)) {
            return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FF7, null);
        }
        if(blogNoticeListIntent0 instanceof ShowDialog) {
            return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, null, null, null, ((ShowDialog)blogNoticeListIntent0).getType(), null, null, null, null, null, null, null, null, 0x3FDF, null);
        }
        if(blogNoticeListIntent0 instanceof ShowErrorDialog) {
            ErrorModel errorModel0 = ((ShowErrorDialog)blogNoticeListIntent0).getErrorModel();
            return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, null, null, null, new Alert(errorModel0.getTitle(), null, errorModel0.getMessage(), null, null, false, 58, null), null, null, null, null, null, null, null, null, 0x3FDF, null);
        }
        if(!Intrinsics.areEqual(blogNoticeListIntent0, HideDialog.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return BlogNoticeListUiState.copy$default(blogNoticeListUiState0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FDF, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((BlogNoticeListUiState)object0), ((BlogNoticeListIntent)object1), continuation0);
    }
}

