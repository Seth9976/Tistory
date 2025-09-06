package com.kakao.tistory.presentation.view.comment.guestbook;

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
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.usecase.DeleteGuestbookUseCase;
import com.kakao.tistory.domain.usecase.GetBlogUseCase;
import com.kakao.tistory.domain.usecase.GetGuestBookPinCommentUseCase;
import com.kakao.tistory.domain.usecase.GetGuestbookListUseCase;
import com.kakao.tistory.domain.usecase.PinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.UnPinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.WriteGuestbookUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.CommentInputAcceptType;
import com.kakao.tistory.presentation.common.EnumConstsKt;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
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
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJG\u0010$\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\u0006\u0010 \u001A\u00020\u001F2\b\u0010!\u001A\u0004\u0018\u00010\u001B2\b\u0010\"\u001A\u0004\u0018\u00010\u001D2\b\u0010#\u001A\u0004\u0018\u00010\u001DH\u0014\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010&\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010)\u001A\u00020\u00182\u0006\u0010(\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001A\u00020\u00182\u0006\u0010#\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b+\u0010,J\u001F\u0010.\u001A\u00020\u00182\u0006\u0010#\u001A\u00020\u001D2\u0006\u0010-\u001A\u00020\u0016H\u0014\u00A2\u0006\u0004\b.\u0010/J\u000F\u00100\u001A\u00020\u0018H\u0014\u00A2\u0006\u0004\b0\u0010\'J\u0017\u00103\u001A\u00020\u00182\u0006\u00102\u001A\u000201H\u0014\u00A2\u0006\u0004\b3\u00104J \u00108\u001A\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001072\u0006\u00106\u001A\u000205H\u0096@\u00A2\u0006\u0004\b8\u00109R#\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140;0:8\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R\u001A\u0010E\u001A\u00020@8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u0014\u0010I\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u0010HR\u0014\u0010K\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u0010HR\u0014\u0010M\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bL\u0010HR\u0014\u0010O\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bN\u0010HR\u0014\u0010Q\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bP\u0010HR\u0014\u0010S\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bR\u0010HR\u0014\u0010U\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010H\u00A8\u0006V"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/GuestbookViewModel;", "Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/usecase/GetGuestbookListUseCase;", "getGuestbookListUseCase", "Lcom/kakao/tistory/domain/usecase/WriteGuestbookUseCase;", "writeGuestbookUseCase", "Lcom/kakao/tistory/domain/usecase/DeleteGuestbookUseCase;", "deleteGuestbookUseCase", "Lcom/kakao/tistory/domain/usecase/PinGuestBookCommentUseCase;", "pinGuestBookCommentUseCase", "Lcom/kakao/tistory/domain/usecase/UnPinGuestBookCommentUseCase;", "unPinGuestBookCommentUseCase", "Lcom/kakao/tistory/domain/usecase/GetGuestBookPinCommentUseCase;", "getGuestBookPinCommentUseCase", "Lcom/kakao/tistory/domain/usecase/GetBlogUseCase;", "getBlogUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/usecase/GetGuestbookListUseCase;Lcom/kakao/tistory/domain/usecase/WriteGuestbookUseCase;Lcom/kakao/tistory/domain/usecase/DeleteGuestbookUseCase;Lcom/kakao/tistory/domain/usecase/PinGuestBookCommentUseCase;Lcom/kakao/tistory/domain/usecase/UnPinGuestBookCommentUseCase;Lcom/kakao/tistory/domain/usecase/GetGuestBookPinCommentUseCase;Lcom/kakao/tistory/domain/usecase/GetBlogUseCase;)V", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "", "fromNotification", "", "init", "(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;Z)V", "", "blogName", "", "entryId", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "password", "parentCommentId", "commentId", "loadComments", "(Ljava/lang/String;Ljava/lang/Long;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "goToDetailPinnedComment", "()V", "isEmpty", "completeInitLoad", "(Z)V", "onClickReport", "(J)V", "pin", "pinComment", "(JZ)V", "loadPinComment", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "writeComplete", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "Lcom/kakao/tistory/domain/entity/common/Result;", "deleteComment", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "N", "Landroidx/lifecycle/LiveData;", "getGoToDetailPinnedComment", "()Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "P", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "", "getDeleteCommentDialogTitleRes", "()I", "deleteCommentDialogTitleRes", "getDeleteReplyDialogTitleRes", "deleteReplyDialogTitleRes", "getRestrictedCommentUnModifyDialogTitleRes", "restrictedCommentUnModifyDialogTitleRes", "getNotLoginUserRes", "notLoginUserRes", "getNotLoginReplyUserRes", "notLoginReplyUserRes", "getNotAcceptCommentRes", "notAcceptCommentRes", "getBlockedCommentRes", "blockedCommentRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGuestbookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuestbookViewModel.kt\ncom/kakao/tistory/presentation/view/comment/guestbook/GuestbookViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,281:1\n1#2:282\n53#3:283\n55#3:287\n50#4:284\n55#4:286\n107#5:285\n25#6,3:288\n*S KotlinDebug\n*F\n+ 1 GuestbookViewModel.kt\ncom/kakao/tistory/presentation/view/comment/guestbook/GuestbookViewModel\n*L\n145#1:283\n145#1:287\n145#1:284\n145#1:286\n145#1:285\n251#1:288,3\n*E\n"})
public class GuestbookViewModel extends CommentListViewModel {
    public static final int $stable = 8;
    public final GetGuestbookListUseCase F;
    public final WriteGuestbookUseCase G;
    public final DeleteGuestbookUseCase H;
    public final PinGuestBookCommentUseCase I;
    public final UnPinGuestBookCommentUseCase J;
    public final GetGuestBookPinCommentUseCase K;
    public final GetBlogUseCase L;
    public final MutableLiveData M;
    public final MutableLiveData N;
    public Long O;
    public final GuestBookTiara P;

    @Inject
    public GuestbookViewModel(@NotNull AccountRepository accountRepository0, @NotNull GetGuestbookListUseCase getGuestbookListUseCase0, @NotNull WriteGuestbookUseCase writeGuestbookUseCase0, @NotNull DeleteGuestbookUseCase deleteGuestbookUseCase0, @NotNull PinGuestBookCommentUseCase pinGuestBookCommentUseCase0, @NotNull UnPinGuestBookCommentUseCase unPinGuestBookCommentUseCase0, @NotNull GetGuestBookPinCommentUseCase getGuestBookPinCommentUseCase0, @NotNull GetBlogUseCase getBlogUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(getGuestbookListUseCase0, "getGuestbookListUseCase");
        Intrinsics.checkNotNullParameter(writeGuestbookUseCase0, "writeGuestbookUseCase");
        Intrinsics.checkNotNullParameter(deleteGuestbookUseCase0, "deleteGuestbookUseCase");
        Intrinsics.checkNotNullParameter(pinGuestBookCommentUseCase0, "pinGuestBookCommentUseCase");
        Intrinsics.checkNotNullParameter(unPinGuestBookCommentUseCase0, "unPinGuestBookCommentUseCase");
        Intrinsics.checkNotNullParameter(getGuestBookPinCommentUseCase0, "getGuestBookPinCommentUseCase");
        Intrinsics.checkNotNullParameter(getBlogUseCase0, "getBlogUseCase");
        super(accountRepository0);
        this.F = getGuestbookListUseCase0;
        this.G = writeGuestbookUseCase0;
        this.H = deleteGuestbookUseCase0;
        this.I = pinGuestBookCommentUseCase0;
        this.J = unPinGuestBookCommentUseCase0;
        this.K = getGuestBookPinCommentUseCase0;
        this.L = getBlogUseCase0;
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.M = mutableLiveData0;
        this.N = mutableLiveData0;
        this.P = GuestBookTiara.INSTANCE;
    }

    public static Object a(GuestbookViewModel guestbookViewModel0, CommentItem commentItemType$CommentItem0, Continuation continuation0) {
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.d;
            if((v & 0x80000000) == 0) {
                e0 = new e(guestbookViewModel0, continuation0);
            }
            else {
                e0.d = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(guestbookViewModel0, continuation0);
        }
        Object object0 = e0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = guestbookViewModel0.getBlogName();
                if(s == null) {
                    return null;
                }
                e0.a = guestbookViewModel0;
                e0.d = 1;
                object0 = guestbookViewModel0.H.invoke(s, commentItemType$CommentItem0.getId(), e0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                guestbookViewModel0 = e0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            guestbookViewModel0.sendEvent(new SetActivityResult(CommentActivityResultType.Updated, false, 2, null));
            return (Success)(((Result)object0));
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return (Fail)(((Result)object0));
    }

    public final void a(GuestbookExtra guestbookExtra0) {
        ListMode listMode0;
        CommentInputAcceptType commentInputAcceptType0;
        this.setBlogName(guestbookExtra0.getBlogName());
        this.O = guestbookExtra0.getBlogId();
        this.getBlogRoleType().setValue(EnumConstsKt.getBlogRoleType(guestbookExtra0.getBlogRole()));
        MutableLiveData mutableLiveData0 = this.get_enableInputComment();
        if(guestbookExtra0.getAllowWriteOnGuestbook() && guestbookExtra0.isBlocked()) {
            commentInputAcceptType0 = CommentInputAcceptType.BLOCK;
        }
        else if(guestbookExtra0.getAllowWriteOnGuestbook() || guestbookExtra0.isBlocked()) {
            commentInputAcceptType0 = guestbookExtra0.getAllowWriteOnGuestbook() || !guestbookExtra0.isBlocked() ? CommentInputAcceptType.ACCEPT : CommentInputAcceptType.BLOCK;
        }
        else {
            commentInputAcceptType0 = CommentInputAcceptType.NOT_ACCEPT;
        }
        mutableLiveData0.setValue(commentInputAcceptType0);
        this.getAcceptComment().setValue(Boolean.valueOf(this.get_enableInputComment().getValue() == CommentInputAcceptType.ACCEPT));
        if(guestbookExtra0.getCommentId() == null) {
            listMode0 = ListMode.INIT;
        }
        else {
            listMode0 = ListMode.COMMENT;
            if(listMode0 == null) {
                listMode0 = ListMode.INIT;
            }
        }
        this.loadComments(guestbookExtra0.getBlogName(), null, listMode0, null, null, guestbookExtra0.getCommentId());
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void completeInitLoad(boolean z) {
        CommentDataSource commentDataSource0 = this.getDataSource();
        this.sendIntent(new UpdateCommentCountList((commentDataSource0 == null ? 0L : commentDataSource0.getCommentCount())));
        CommentDataSource commentDataSource1 = this.getDataSource();
        if(commentDataSource1 != null && commentDataSource1.getShowDeleteCommentToast()) {
            this.sendEvent(new ShowToast(string.label_toast_guest_comment_deleted));
        }
        this.sendIntent(new FinishInitLoading(z));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    @Nullable
    public Object deleteComment(@NotNull CommentItem commentItemType$CommentItem0, @NotNull Continuation continuation0) {
        return GuestbookViewModel.a(this, commentItemType$CommentItem0, continuation0);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getBlockedCommentRes() {
        return string.label_guestbook_blocked;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.P;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getDeleteCommentDialogTitleRes() {
        return string.label_dialog_guestbook_delete;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getDeleteReplyDialogTitleRes() {
        return string.label_dialog_reply_delete;
    }

    @NotNull
    public final LiveData getGoToDetailPinnedComment() {
        return this.N;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getNotAcceptCommentRes() {
        return string.label_guestbook_not_accept;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getNotLoginReplyUserRes() {
        return string.label_guestbook_not_login_user;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getNotLoginUserRes() {
        return string.label_guestbook_not_login_user;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public int getRestrictedCommentUnModifyDialogTitleRes() {
        return string.label_dialog_guestbook_modify_restricted_comment;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void goToDetailPinnedComment() {
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(this, s, null), 3, null);
    }

    public final void init(@NotNull GuestbookExtra guestbookExtra0, boolean z) {
        Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
        if(z) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(this, guestbookExtra0, null), 3, null);
            return;
        }
        this.a(guestbookExtra0);
    }

    public static void init$default(GuestbookViewModel guestbookViewModel0, GuestbookExtra guestbookExtra0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if((v & 2) != 0) {
            z = false;
        }
        guestbookViewModel0.init(guestbookExtra0, z);
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
                com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel.loadComments..inlined.map.1.2 guestbookViewModel$loadComments$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel.loadComments..inlined.map.1.2.1 guestbookViewModel$loadComments$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel.loadComments..inlined.map.1.2.1) {
                            guestbookViewModel$loadComments$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.view.comment.guestbook.GuestbookViewModel.loadComments..inlined.map.1.2.1)continuation0;
                            int v = guestbookViewModel$loadComments$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                guestbookViewModel$loadComments$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                guestbookViewModel$loadComments$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            guestbookViewModel$loadComments$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = guestbookViewModel$loadComments$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(guestbookViewModel$loadComments$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                ObjectRef ref$ObjectRef0 = new ObjectRef();
                                PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new i(this.b, ref$ObjectRef0, null));
                                guestbookViewModel$loadComments$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(pagingData0, guestbookViewModel$loadComments$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.collect(guestbookViewModel$loadComments$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this)), long2));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void loadPinComment() {
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(this, s, null), 3, null);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void onClickReport(long v) {
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        this.get_showReportCommentDialog().setValue(new Event(new ReportExtra(s, this.O, 0L, v, null, null, null, 0x70, null)));
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void pinComment(long v, boolean z) {
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k(z, this, s, v, null), 3, null);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentListViewModel
    public void writeComplete(@NotNull CommentCompletion commentCompletion0) {
        Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        Long long0 = commentCompletion0.getParentId();
        Long long1 = commentCompletion0.getMentionId();
        boolean z = commentCompletion0.isSecret();
        String s1 = commentCompletion0.getText();
        if(s1.length() == 0) {
            return;
        }
        String s2 = StringsKt__StringsKt.trim(s1).toString();
        this.isShowProgress().postValue(Boolean.TRUE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l(this, s, s2, long0, long1, z, null), 3, null);
    }
}

