package com.kakao.tistory.presentation.view.comment.entry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.tistory.data.datasource.comment.ListMode;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.usecase.DeleteCommentUseCase;
import com.kakao.tistory.domain.usecase.GetCommentsUseCase;
import com.kakao.tistory.domain.usecase.GetPinCommentUseCase;
import com.kakao.tistory.domain.usecase.PinCommentUseCase;
import com.kakao.tistory.domain.usecase.PostCommentUseCase;
import com.kakao.tistory.domain.usecase.UnpinCommentUseCase;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.SetActivityResult;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.FinishInitLoading;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.LoadedCommentList;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJG\u0010\"\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001D\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u001F\u001A\u00020\u001E2\b\u0010 \u001A\u0004\u0018\u00010\u001B2\b\u0010!\u001A\u0004\u0018\u00010\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0014\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001A\u00020\u00182\u0006\u0010%\u001A\u00020$H\u0014\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010*\u001A\u00020\u00182\u0006\u0010)\u001A\u00020(H\u0016\u00A2\u0006\u0004\b*\u0010+J+\u0010-\u001A\u00020\u00182\b\u0010!\u001A\u0004\u0018\u00010\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0006\u0010,\u001A\u00020(H\u0016\u00A2\u0006\u0004\b-\u0010.J\u000F\u0010/\u001A\u00020\u0018H\u0014\u00A2\u0006\u0004\b/\u00100R\u001A\u00106\u001A\u0002018\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001A\u00107\u001A\u00020(8\u0016X\u0096D\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b7\u00109R\u001A\u0010:\u001A\u00020(8\u0016X\u0096D\u00A2\u0006\f\n\u0004\b:\u00108\u001A\u0004\b;\u00109\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentViewModel;", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;", "getCommentsUseCase", "Lcom/kakao/tistory/domain/usecase/PostCommentUseCase;", "postCommentUseCase", "Lcom/kakao/tistory/domain/usecase/DeleteCommentUseCase;", "deleteCommentUseCase", "Lcom/kakao/tistory/domain/usecase/PinCommentUseCase;", "pinCommentUseCase", "Lcom/kakao/tistory/domain/usecase/UnpinCommentUseCase;", "unpinCommentUseCase", "Lcom/kakao/tistory/domain/usecase/GetPinCommentUseCase;", "getPinCommentUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;Lcom/kakao/tistory/domain/usecase/PostCommentUseCase;Lcom/kakao/tistory/domain/usecase/DeleteCommentUseCase;Lcom/kakao/tistory/domain/usecase/PinCommentUseCase;Lcom/kakao/tistory/domain/usecase/UnpinCommentUseCase;Lcom/kakao/tistory/domain/usecase/GetPinCommentUseCase;)V", "", "commentId", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "", "sendActivityResultEvent", "(JLcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;)V", "", "blogName", "entryId", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "password", "parentCommentId", "loadComments", "(Ljava/lang/String;Ljava/lang/Long;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "writeComplete", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "", "isEmpty", "completeInitLoad", "(Z)V", "isReplyMore", "invalidate", "(Ljava/lang/Long;Ljava/lang/Long;Z)V", "loadPinComment", "()V", "Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentTiara;", "T", "Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentTiara;", "commentTiara", "isListStartFromBottom", "Z", "()Z", "showEditorWhenEmpty", "getShowEditorWhenEmpty", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPostPinCommentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPinCommentViewModel.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostPinCommentViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,104:1\n53#2:105\n55#2:109\n50#3:106\n55#3:108\n107#4:107\n*S KotlinDebug\n*F\n+ 1 PostPinCommentViewModel.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostPinCommentViewModel\n*L\n68#1:105\n68#1:109\n68#1:106\n68#1:108\n68#1:107\n*E\n"})
public final class PostPinCommentViewModel extends PostCommentViewModel {
    public static final int $stable = 8;
    public final GetPinCommentUseCase R;
    public Long S;
    public final PostPinCommentTiara T;

    @Inject
    public PostPinCommentViewModel(@NotNull AccountRepository accountRepository0, @NotNull EntryRepository entryRepository0, @NotNull GetCommentsUseCase getCommentsUseCase0, @NotNull PostCommentUseCase postCommentUseCase0, @NotNull DeleteCommentUseCase deleteCommentUseCase0, @NotNull PinCommentUseCase pinCommentUseCase0, @NotNull UnpinCommentUseCase unpinCommentUseCase0, @NotNull GetPinCommentUseCase getPinCommentUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(getCommentsUseCase0, "getCommentsUseCase");
        Intrinsics.checkNotNullParameter(postCommentUseCase0, "postCommentUseCase");
        Intrinsics.checkNotNullParameter(deleteCommentUseCase0, "deleteCommentUseCase");
        Intrinsics.checkNotNullParameter(pinCommentUseCase0, "pinCommentUseCase");
        Intrinsics.checkNotNullParameter(unpinCommentUseCase0, "unpinCommentUseCase");
        Intrinsics.checkNotNullParameter(getPinCommentUseCase0, "getPinCommentUseCase");
        super(accountRepository0, entryRepository0, getCommentsUseCase0, postCommentUseCase0, deleteCommentUseCase0, pinCommentUseCase0, unpinCommentUseCase0, getPinCommentUseCase0);
        this.R = getPinCommentUseCase0;
        this.T = PostPinCommentTiara.INSTANCE;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel
    public void completeInitLoad(boolean z) {
        this.sendIntent(new FinishInitLoading(z));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel
    public BaseCommentTiara getCommentTiara() {
        return this.getCommentTiara();
    }

    @NotNull
    public PostPinCommentTiara getCommentTiara() {
        return this.T;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public boolean getShowEditorWhenEmpty() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void invalidate(@Nullable Long long0, @Nullable Long long1, boolean z) {
        String s = this.getBlogName();
        if(s != null) {
            Long long2 = this.getEntryId();
            if(long2 != null) {
                this.loadComments(s, long2.longValue(), ListMode.INIT, null, long0, (long1 == null ? long0 : long1));
            }
        }
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public boolean isListStartFromBottom() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel
    public void loadComments(@NotNull String s, @Nullable Long long0, @NotNull ListMode listMode0, @Nullable String s1, @Nullable Long long1, @Nullable Long long2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(listMode0, "listMode");
        if(long0 != null) {
            this.sendIntent(new LoadedCommentList(CachedPagingDataKt.cachedIn(new Flow() {
                @Override  // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                    com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel.loadComments.lambda.2..inlined.map.1.2 postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$20 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                            com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel.loadComments.lambda.2..inlined.map.1.2.1 postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10;
                            if(continuation0 instanceof com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel.loadComments.lambda.2..inlined.map.1.2.1) {
                                postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.view.comment.entry.PostPinCommentViewModel.loadComments.lambda.2..inlined.map.1.2.1)continuation0;
                                int v = postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10.b;
                                if((v & 0x80000000) == 0) {
                                    postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                    postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10.b = v ^ 0x80000000;
                                }
                            }
                            else {
                                postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                            Object object1 = postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10.a;
                            Object object2 = a.getCOROUTINE_SUSPENDED();
                            switch(postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10.b) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    PagingData pagingData0 = PagingDataTransforms.flatMap(((PagingData)object0), new r(this.b, null));
                                    postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10.b = 1;
                                    return this.b.emit(pagingData0, postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                    Object object0 = this.collect(postPinCommentViewModel$loadComments$lambda$2$$inlined$map$1$20, continuation0);
                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            }, ViewModelKt.getViewModelScope(this)), long2));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel
    public void loadPinComment() {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void sendActivityResultEvent(long v, @NotNull CommentActivityResultType commentActivityResultType0) {
        Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
        this.sendEvent(new SetActivityResult(commentActivityResultType0, this.S != null && v == ((long)this.S)));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel
    public void writeComplete(@NotNull CommentCompletion commentCompletion0) {
        Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
        super.writeComplete(CommentCompletion.copy$default(commentCompletion0, null, this.S, null, null, false, 29, null));
    }
}

