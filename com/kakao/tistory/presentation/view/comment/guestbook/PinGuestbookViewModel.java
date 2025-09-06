package com.kakao.tistory.presentation.view.comment.guestbook;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.tistory.data.datasource.comment.ListMode;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.usecase.DeleteGuestbookUseCase;
import com.kakao.tistory.domain.usecase.GetBlogUseCase;
import com.kakao.tistory.domain.usecase.GetGuestBookPinCommentUseCase;
import com.kakao.tistory.domain.usecase.GetGuestbookListUseCase;
import com.kakao.tistory.domain.usecase.GetPinGuestBookComment;
import com.kakao.tistory.domain.usecase.PinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.UnPinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.UpdateGuestbookUseCase;
import com.kakao.tistory.domain.usecase.WriteGuestbookUseCase;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.SetActivityResult;
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
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001F\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJG\u0010&\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020\u001F2\b\u0010!\u001A\u0004\u0018\u00010\u00182\u0006\u0010#\u001A\u00020\"2\b\u0010$\u001A\u0004\u0018\u00010\u001F2\b\u0010%\u001A\u0004\u0018\u00010\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018H\u0014\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010*\u001A\u00020\u001C2\u0006\u0010)\u001A\u00020(H\u0014\u00A2\u0006\u0004\b*\u0010+J+\u0010.\u001A\u00020\u001C2\b\u0010%\u001A\u0004\u0018\u00010\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u00182\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b.\u0010/J\u000F\u00100\u001A\u00020\u001CH\u0014\u00A2\u0006\u0004\b0\u00101R\u001A\u00107\u001A\u0002028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u001A\u00108\u001A\u00020,8\u0016X\u0096D\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u001A\u0010<\u001A\u00020,8\u0016X\u0096D\u00A2\u0006\f\n\u0004\b<\u00109\u001A\u0004\b<\u0010;\u00A8\u0006="}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookViewModel;", "Lcom/kakao/tistory/presentation/view/comment/guestbook/GuestbookViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/usecase/GetPinGuestBookComment;", "getPinGuestBookComment", "Lcom/kakao/tistory/domain/usecase/GetGuestbookListUseCase;", "getGuestbookListUseCase", "Lcom/kakao/tistory/domain/usecase/UpdateGuestbookUseCase;", "updateGuestbookUseCase", "Lcom/kakao/tistory/domain/usecase/WriteGuestbookUseCase;", "writeGuestbookUseCase", "Lcom/kakao/tistory/domain/usecase/DeleteGuestbookUseCase;", "deleteGuestbookUseCase", "Lcom/kakao/tistory/domain/usecase/PinGuestBookCommentUseCase;", "pinGuestBookCommentUseCase", "Lcom/kakao/tistory/domain/usecase/UnPinGuestBookCommentUseCase;", "unPinGuestBookCommentUseCase", "Lcom/kakao/tistory/domain/usecase/GetGuestBookPinCommentUseCase;", "getGuestBookPinCommentUseCase", "Lcom/kakao/tistory/domain/usecase/GetBlogUseCase;", "getBlogUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/usecase/GetPinGuestBookComment;Lcom/kakao/tistory/domain/usecase/GetGuestbookListUseCase;Lcom/kakao/tistory/domain/usecase/UpdateGuestbookUseCase;Lcom/kakao/tistory/domain/usecase/WriteGuestbookUseCase;Lcom/kakao/tistory/domain/usecase/DeleteGuestbookUseCase;Lcom/kakao/tistory/domain/usecase/PinGuestBookCommentUseCase;Lcom/kakao/tistory/domain/usecase/UnPinGuestBookCommentUseCase;Lcom/kakao/tistory/domain/usecase/GetGuestBookPinCommentUseCase;Lcom/kakao/tistory/domain/usecase/GetBlogUseCase;)V", "", "commentId", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "", "sendActivityResultEvent", "(JLcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;)V", "", "blogName", "entryId", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "password", "parentCommentId", "loadComments", "(Ljava/lang/String;Ljava/lang/Long;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "writeComplete", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "", "isReplyMore", "invalidate", "(Ljava/lang/Long;Ljava/lang/Long;Z)V", "loadPinComment", "()V", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "S", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "showEditorWhenEmpty", "Z", "getShowEditorWhenEmpty", "()Z", "isListStartFromBottom", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPinGuestbookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinGuestbookViewModel.kt\ncom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,100:1\n53#2:101\n55#2:105\n50#3:102\n55#3:104\n107#4:103\n*S KotlinDebug\n*F\n+ 1 PinGuestbookViewModel.kt\ncom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookViewModel\n*L\n71#1:101\n71#1:105\n71#1:102\n71#1:104\n71#1:103\n*E\n"})
public final class PinGuestbookViewModel extends GuestbookViewModel {
    public static final int $stable = 8;
    public final GetPinGuestBookComment Q;
    public Long R;
    public final PinGuestBookTiara S;

    @Inject
    public PinGuestbookViewModel(@NotNull AccountRepository accountRepository0, @NotNull GetPinGuestBookComment getPinGuestBookComment0, @NotNull GetGuestbookListUseCase getGuestbookListUseCase0, @NotNull UpdateGuestbookUseCase updateGuestbookUseCase0, @NotNull WriteGuestbookUseCase writeGuestbookUseCase0, @NotNull DeleteGuestbookUseCase deleteGuestbookUseCase0, @NotNull PinGuestBookCommentUseCase pinGuestBookCommentUseCase0, @NotNull UnPinGuestBookCommentUseCase unPinGuestBookCommentUseCase0, @NotNull GetGuestBookPinCommentUseCase getGuestBookPinCommentUseCase0, @NotNull GetBlogUseCase getBlogUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(getPinGuestBookComment0, "getPinGuestBookComment");
        Intrinsics.checkNotNullParameter(getGuestbookListUseCase0, "getGuestbookListUseCase");
        Intrinsics.checkNotNullParameter(updateGuestbookUseCase0, "updateGuestbookUseCase");
        Intrinsics.checkNotNullParameter(writeGuestbookUseCase0, "writeGuestbookUseCase");
        Intrinsics.checkNotNullParameter(deleteGuestbookUseCase0, "deleteGuestbookUseCase");
        Intrinsics.checkNotNullParameter(pinGuestBookCommentUseCase0, "pinGuestBookCommentUseCase");
        Intrinsics.checkNotNullParameter(unPinGuestBookCommentUseCase0, "unPinGuestBookCommentUseCase");
        Intrinsics.checkNotNullParameter(getGuestBookPinCommentUseCase0, "getGuestBookPinCommentUseCase");
        Intrinsics.checkNotNullParameter(getBlogUseCase0, "getBlogUseCase");
        super(accountRepository0, getGuestbookListUseCase0, writeGuestbookUseCase0, deleteGuestbookUseCase0, pinGuestBookCommentUseCase0, unPinGuestBookCommentUseCase0, getGuestBookPinCommentUseCase0, getBlogUseCase0);
        this.Q = getPinGuestBookComment0;
        this.S = PinGuestBookTiara.INSTANCE;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel
    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.S;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public boolean getShowEditorWhenEmpty() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void invalidate(@Nullable Long long0, @Nullable Long long1, boolean z) {
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        this.loadComments(s, null, ListMode.INIT, null, long0, (long1 == null ? long0 : long1));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public boolean isListStartFromBottom() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel
    public void loadComments(@NotNull String s, @Nullable Long long0, @NotNull ListMode listMode0, @Nullable String s1, @Nullable Long long1, @Nullable Long long2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(listMode0, "listMode");
        this.sendIntent(new LoadedCommentList(CachedPagingDataKt.cachedIn(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel.loadComments..inlined.map.1.2 pinGuestbookViewModel$loadComments$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel.loadComments..inlined.map.1.2.1 pinGuestbookViewModel$loadComments$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel.loadComments..inlined.map.1.2.1) {
                            pinGuestbookViewModel$loadComments$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookViewModel.loadComments..inlined.map.1.2.1)continuation0;
                            int v = pinGuestbookViewModel$loadComments$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                pinGuestbookViewModel$loadComments$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                pinGuestbookViewModel$loadComments$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            pinGuestbookViewModel$loadComments$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = pinGuestbookViewModel$loadComments$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(pinGuestbookViewModel$loadComments$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                PagingData pagingData0 = PagingDataTransforms.flatMap(((PagingData)object0), new t(this.b, null));
                                pinGuestbookViewModel$loadComments$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(pagingData0, pinGuestbookViewModel$loadComments$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.collect(pinGuestbookViewModel$loadComments$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this)), long2));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel
    public void loadPinComment() {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void sendActivityResultEvent(long v, @NotNull CommentActivityResultType commentActivityResultType0) {
        Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
        this.sendEvent(new SetActivityResult(commentActivityResultType0, this.R != null && v == ((long)this.R)));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel
    public void writeComplete(@NotNull CommentCompletion commentCompletion0) {
        Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
        super.writeComplete(CommentCompletion.copy$default(commentCompletion0, null, this.R, null, null, false, 29, null));
    }
}

