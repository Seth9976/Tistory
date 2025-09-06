package com.kakao.tistory.presentation.view.comment.entry;

import android.util.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.tistory.data.datasource.comment.CommentDataSource.Query;
import com.kakao.tistory.data.datasource.comment.CommentDataSource;
import com.kakao.tistory.data.datasource.comment.ListMode;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.usecase.DeleteCommentUseCase;
import com.kakao.tistory.domain.usecase.GetCommentsUseCase;
import com.kakao.tistory.domain.usecase.GetPinCommentUseCase;
import com.kakao.tistory.domain.usecase.PinCommentUseCase;
import com.kakao.tistory.domain.usecase.PostCommentUseCase;
import com.kakao.tistory.domain.usecase.UnpinCommentUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.CommentInputAcceptType;
import com.kakao.tistory.presentation.common.EnumConstsKt;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.bottomsheet.ReportExtra;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.SetActivityResult;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.ShowToast;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.FinishInitLoading;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.LoadedCommentList;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.UpdateCommentCountList;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u00A0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0015\u001A\u00020\u00142\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00162\b\u0010\u001A\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001E\u0010\u001FJG\u0010$\u001A\u00020\u001D2\u0006\u0010\u0015\u001A\u00020\u00142\b\u0010\u0019\u001A\u0004\u0018\u00010\u00162\u0006\u0010!\u001A\u00020 2\b\u0010\"\u001A\u0004\u0018\u00010\u00142\b\u0010#\u001A\u0004\u0018\u00010\u00162\b\u0010\u001A\u001A\u0004\u0018\u00010\u0016H\u0014\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010&\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010*\u001A\u00020\u001D2\u0006\u0010)\u001A\u00020(H\u0014\u00A2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001A\u00020\u001D2\u0006\u0010\u001A\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b,\u0010-J\u001F\u00100\u001A\u00020\u001D2\u0006\u0010\u001A\u001A\u00020\u00162\u0006\u0010/\u001A\u00020.H\u0014\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00020\u001DH\u0014\u00A2\u0006\u0004\b2\u0010\'J \u00106\u001A\n\u0012\u0004\u0012\u00020\u001D\u0018\u0001052\u0006\u00104\u001A\u000203H\u0096@\u00A2\u0006\u0004\b6\u00107J\u0017\u00109\u001A\u00020\u001D2\u0006\u00108\u001A\u00020.H\u0016\u00A2\u0006\u0004\b9\u0010:R#\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0<0;8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R \u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0A8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER$\u0010\u0017\u001A\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\bF\u0010G\u001A\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001A\u0010Q\u001A\u00020L8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010PR\u0014\u0010U\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010TR\u0014\u0010W\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bV\u0010TR\u0014\u0010Y\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bX\u0010TR\u0014\u0010[\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bZ\u0010TR\u0014\u0010]\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\\\u0010TR\u0014\u0010_\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010TR\u0014\u0010a\u001A\u00020R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b`\u0010T\u00A8\u0006b"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel;", "Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;", "getCommentsUseCase", "Lcom/kakao/tistory/domain/usecase/PostCommentUseCase;", "postCommentUseCase", "Lcom/kakao/tistory/domain/usecase/DeleteCommentUseCase;", "deleteCommentUseCase", "Lcom/kakao/tistory/domain/usecase/PinCommentUseCase;", "pinCommentUseCase", "Lcom/kakao/tistory/domain/usecase/UnpinCommentUseCase;", "unpinCommentUseCase", "Lcom/kakao/tistory/domain/usecase/GetPinCommentUseCase;", "getPinCommentUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;Lcom/kakao/tistory/domain/usecase/PostCommentUseCase;Lcom/kakao/tistory/domain/usecase/DeleteCommentUseCase;Lcom/kakao/tistory/domain/usecase/PinCommentUseCase;Lcom/kakao/tistory/domain/usecase/UnpinCommentUseCase;Lcom/kakao/tistory/domain/usecase/GetPinCommentUseCase;)V", "", "blogName", "", "blogId", "blogRole", "entryId", "commentId", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "", "init", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/Long;Lcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "password", "parentCommentId", "loadComments", "(Ljava/lang/String;Ljava/lang/Long;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "goToDetailPinnedComment", "()V", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "writeComplete", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "onClickReport", "(J)V", "", "pin", "pinComment", "(JZ)V", "loadPinComment", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "Lcom/kakao/tistory/domain/entity/common/Result;", "deleteComment", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmpty", "completeInitLoad", "(Z)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "N", "Landroidx/lifecycle/LiveData;", "getGoToDetailPinnedComment", "()Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/MutableLiveData;", "O", "Landroidx/lifecycle/MutableLiveData;", "getEntryItem", "()Landroidx/lifecycle/MutableLiveData;", "P", "Ljava/lang/Long;", "getBlogId", "()Ljava/lang/Long;", "setBlogId", "(Ljava/lang/Long;)V", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "Q", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "", "getDeleteCommentDialogTitleRes", "()I", "deleteCommentDialogTitleRes", "getDeleteReplyDialogTitleRes", "deleteReplyDialogTitleRes", "getRestrictedCommentUnModifyDialogTitleRes", "restrictedCommentUnModifyDialogTitleRes", "getNotLoginUserRes", "notLoginUserRes", "getNotLoginReplyUserRes", "notLoginReplyUserRes", "getNotAcceptCommentRes", "notAcceptCommentRes", "getBlockedCommentRes", "blockedCommentRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPostCommentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCommentViewModel.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,304:1\n1#2:305\n53#3:306\n55#3:310\n50#4:307\n55#4:309\n107#5:308\n25#6,3:311\n*S KotlinDebug\n*F\n+ 1 PostCommentViewModel.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel\n*L\n132#1:306\n132#1:310\n132#1:307\n132#1:309\n132#1:308\n278#1:311,3\n*E\n"})
public class PostCommentViewModel extends CommentListViewModel {
    public static final int $stable = 8;
    public final EntryRepository F;
    public final GetCommentsUseCase G;
    public final PostCommentUseCase H;
    public final DeleteCommentUseCase I;
    public final PinCommentUseCase J;
    public final UnpinCommentUseCase K;
    public final GetPinCommentUseCase L;
    public final MutableLiveData M;
    public final MutableLiveData N;
    public final MutableLiveData O;
    public Long P;
    public final PostCommentTiara Q;

    @Inject
    public PostCommentViewModel(@NotNull AccountRepository accountRepository0, @NotNull EntryRepository entryRepository0, @NotNull GetCommentsUseCase getCommentsUseCase0, @NotNull PostCommentUseCase postCommentUseCase0, @NotNull DeleteCommentUseCase deleteCommentUseCase0, @NotNull PinCommentUseCase pinCommentUseCase0, @NotNull UnpinCommentUseCase unpinCommentUseCase0, @NotNull GetPinCommentUseCase getPinCommentUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(getCommentsUseCase0, "getCommentsUseCase");
        Intrinsics.checkNotNullParameter(postCommentUseCase0, "postCommentUseCase");
        Intrinsics.checkNotNullParameter(deleteCommentUseCase0, "deleteCommentUseCase");
        Intrinsics.checkNotNullParameter(pinCommentUseCase0, "pinCommentUseCase");
        Intrinsics.checkNotNullParameter(unpinCommentUseCase0, "unpinCommentUseCase");
        Intrinsics.checkNotNullParameter(getPinCommentUseCase0, "getPinCommentUseCase");
        super(accountRepository0);
        this.F = entryRepository0;
        this.G = getCommentsUseCase0;
        this.H = postCommentUseCase0;
        this.I = deleteCommentUseCase0;
        this.J = pinCommentUseCase0;
        this.K = unpinCommentUseCase0;
        this.L = getPinCommentUseCase0;
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.M = mutableLiveData0;
        this.N = mutableLiveData0;
        this.O = new MutableLiveData();
        this.Q = PostCommentTiara.INSTANCE;
    }

    public static Object a(PostCommentViewModel postCommentViewModel0, CommentItem commentItemType$CommentItem0, Continuation continuation0) {
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.d;
            if((v & 0x80000000) == 0) {
                g0 = new g(postCommentViewModel0, continuation0);
            }
            else {
                g0.d = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(postCommentViewModel0, continuation0);
        }
        Object object0 = g0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = postCommentViewModel0.getBlogName();
                if(s == null) {
                    return null;
                }
                Long long0 = postCommentViewModel0.getEntryId();
                if(long0 == null) {
                    return null;
                }
                g0.a = postCommentViewModel0;
                g0.d = 1;
                object0 = postCommentViewModel0.I.invoke(s, ((long)long0), commentItemType$CommentItem0.getId(), postCommentViewModel0.getGuestPassword(), g0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                postCommentViewModel0 = g0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            postCommentViewModel0.sendEvent(new SetActivityResult(CommentActivityResultType.Updated, false, 2, null));
            return (Success)(((Result)object0));
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return (Fail)(((Result)object0));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void completeInitLoad(boolean z) {
        CommentDataSource commentDataSource0 = this.getDataSource();
        long v = commentDataSource0 == null ? 0L : commentDataSource0.getCommentCount();
        this.sendIntent(new UpdateCommentCountList(v));
        Long long0 = this.getEntryId();
        if(long0 != null) {
            long v1 = long0.longValue();
            MutableLiveData mutableLiveData0 = this.F.getUpdatedCommentCounts();
            LongSparseArray longSparseArray0 = (LongSparseArray)this.F.getUpdatedCommentCounts().getValue();
            if(longSparseArray0 == null) {
                longSparseArray0 = new LongSparseArray();
            }
            longSparseArray0.put(v1, v);
            mutableLiveData0.setValue(longSparseArray0);
        }
        CommentDataSource commentDataSource1 = this.getDataSource();
        if(commentDataSource1 != null && commentDataSource1.getShowDeleteCommentToast()) {
            this.sendEvent(new ShowToast(string.label_toast_comment_deleted));
        }
        this.sendIntent(new FinishInitLoading(z));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    @Nullable
    public Object deleteComment(@NotNull CommentItem commentItemType$CommentItem0, @NotNull Continuation continuation0) {
        return PostCommentViewModel.a(this, commentItemType$CommentItem0, continuation0);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getBlockedCommentRes() {
        return string.label_comment_blocked;
    }

    @Nullable
    public final Long getBlogId() {
        return this.P;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.Q;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getDeleteCommentDialogTitleRes() {
        return string.label_dialog_comment_delete;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getDeleteReplyDialogTitleRes() {
        return string.label_dialog_reply_delete;
    }

    @NotNull
    public final MutableLiveData getEntryItem() {
        return this.O;
    }

    @NotNull
    public final LiveData getGoToDetailPinnedComment() {
        return this.N;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getNotAcceptCommentRes() {
        return string.label_comment_not_accept;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getNotLoginReplyUserRes() {
        return string.label_not_login_reply_user;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getNotLoginUserRes() {
        return string.label_not_login_user;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getRestrictedCommentUnModifyDialogTitleRes() {
        return string.label_dialog_comment_modify_restricted_comment;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void goToDetailPinnedComment() {
        EntryItem entryItem0 = (EntryItem)this.O.getValue();
        if(entryItem0 != null) {
            LiveDataExtensionKt.postEvent(this.M, entryItem0);
        }
    }

    public final void init(@NotNull String s, @Nullable Long long0, @NotNull String s1, long v, @Nullable Long long1, @NotNull EntryItem entryItem0) {
        ListMode listMode0;
        CommentInputAcceptType commentInputAcceptType0;
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "blogRole");
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        this.setBlogName(s);
        this.P = long0;
        this.getBlogRoleType().setValue(EnumConstsKt.getBlogRoleType(s1));
        this.setEntryId(v);
        this.O.setValue(entryItem0);
        this.setGuestPassword(entryItem0.getPassword());
        this.getAcceptComment().setValue(Boolean.valueOf(entryItem0.getAcceptComment()));
        this.setArticleWriterId(entryItem0.getAuthor());
        MutableLiveData mutableLiveData0 = this.get_enableInputComment();
        if(entryItem0.getAcceptComment() && entryItem0.isBlocked()) {
            commentInputAcceptType0 = CommentInputAcceptType.BLOCK;
        }
        else if(entryItem0.getAcceptComment() || entryItem0.isBlocked()) {
            commentInputAcceptType0 = entryItem0.getAcceptComment() || !entryItem0.isBlocked() ? CommentInputAcceptType.ACCEPT : CommentInputAcceptType.BLOCK;
        }
        else {
            commentInputAcceptType0 = CommentInputAcceptType.NOT_ACCEPT;
        }
        mutableLiveData0.setValue(commentInputAcceptType0);
        if(long1 == null) {
            listMode0 = ListMode.INIT;
        }
        else {
            listMode0 = ListMode.COMMENT;
            if(listMode0 == null) {
                listMode0 = ListMode.INIT;
            }
        }
        this.loadComments(s, v, listMode0, entryItem0.getPassword(), null, long1);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void loadComments(@NotNull String s, @Nullable Long long0, @NotNull ListMode listMode0, @Nullable String s1, @Nullable Long long1, @Nullable Long long2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(listMode0, "listMode");
        this.setQuery(new Query(s, long0, s1, listMode0, long2, null, 0x20, null));
        this.sendIntent(new LoadedCommentList(CachedPagingDataKt.cachedIn(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel.loadComments..inlined.map.1.2 postCommentViewModel$loadComments$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel.loadComments..inlined.map.1.2.1 postCommentViewModel$loadComments$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel.loadComments..inlined.map.1.2.1) {
                            postCommentViewModel$loadComments$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.view.comment.entry.PostCommentViewModel.loadComments..inlined.map.1.2.1)continuation0;
                            int v = postCommentViewModel$loadComments$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                postCommentViewModel$loadComments$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                postCommentViewModel$loadComments$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            postCommentViewModel$loadComments$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = postCommentViewModel$loadComments$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(postCommentViewModel$loadComments$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                ObjectRef ref$ObjectRef0 = new ObjectRef();
                                PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new i(this.b, ref$ObjectRef0, null));
                                postCommentViewModel$loadComments$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(pagingData0, postCommentViewModel$loadComments$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.collect(postCommentViewModel$loadComments$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this)), long2));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void loadPinComment() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(this, null), 3, null);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void onClickReport(long v) {
        this.getCommentTiara().trackClickReport();
        String s = this.getBlogName();
        if(s != null) {
            Long long0 = this.getEntryId();
            if(long0 != null) {
                long v1 = long0.longValue();
                Long long1 = this.P;
                EntryItem entryItem0 = (EntryItem)this.O.getValue();
                String s1 = null;
                String s2 = entryItem0 == null ? null : entryItem0.getAuthorName();
                EntryItem entryItem1 = (EntryItem)this.O.getValue();
                Long long2 = entryItem1 == null ? null : entryItem1.getAuthor();
                EntryItem entryItem2 = (EntryItem)this.O.getValue();
                if(entryItem2 != null) {
                    s1 = entryItem2.getTitle();
                }
                this.get_showReportCommentDialog().setValue(new Event(new ReportExtra(s, long1, v1, v, long2, (s2 == null ? "" : s2), (s1 == null ? "" : s1))));
            }
        }
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void pinComment(long v, boolean z) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k(this, z, v, null), 3, null);
    }

    public final void setBlogId(@Nullable Long long0) {
        this.P = long0;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void writeComplete(@NotNull CommentCompletion commentCompletion0) {
        String s8;
        Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        Long long0 = this.getEntryId();
        if(long0 != null) {
            long v = (long)long0;
            Long long1 = commentCompletion0.getParentId();
            Long long2 = commentCompletion0.getMentionId();
            String s1 = commentCompletion0.getText();
            boolean z = commentCompletion0.isSecret();
            if(s1.length() == 0) {
                return;
            }
            EntryItem entryItem0 = (EntryItem)this.O.getValue();
            BaseCommentTiara baseCommentTiara0 = this.getCommentTiara();
            String s2 = entryItem0 == null ? null : entryItem0.getTitle();
            String s3 = "";
            if(s2 == null) {
                s2 = "";
            }
            String s4 = String.valueOf(v);
            String s5 = entryItem0 == null ? null : entryItem0.getBlogName();
            if(s5 == null) {
                s5 = "";
            }
            String s6 = entryItem0 == null ? null : entryItem0.getAuthorName();
            if(s6 != null) {
                s3 = s6;
            }
            String s7 = String.valueOf((entryItem0 == null ? null : entryItem0.getAuthor()));
            if(entryItem0 == null) {
                s8 = null;
            }
            else {
                Blog blog0 = entryItem0.getBlog();
                s8 = blog0 == null ? null : blog0.getRole();
            }
            baseCommentTiara0.trackClickWriteComplete(s2, s4, s5, s3, s7, s8, long1, z);
            String s9 = StringsKt__StringsKt.trim(s1).toString();
            this.isShowProgress().postValue(Boolean.TRUE);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l(this, s, v, this.getGuestPassword(), s9, long1, long2, z, null), 3, null);
        }
    }
}

