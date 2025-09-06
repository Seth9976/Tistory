package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.data.datasource.comment.CommentDataSource.Query;
import com.kakao.tistory.data.datasource.comment.CommentDataSource;
import com.kakao.tistory.data.datasource.comment.ListMode;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.CommentItemType.CommentReplyMoreItem;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.BlogRoleType;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.GoModify;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.SetActivityResult;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.ShowDialog;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.ShowToast;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.ClickReply;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.FinishInitLoading;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.LoadedCommentList;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.LoadedPinCommentList;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RefreshCommentList;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RemoveReply;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.UpdateCommentCountList;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.WriteComplete;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import com.kakao.tistory.presentation.view.common.dialog.DialogUIModel;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import com.kakao.tistory.presentation.viewmodel.base.BaseMviViewModel;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00CC\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\b\'\u0018\u0000 \u00C2\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u00C2\u0001B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0002H\u0096@\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u000BH&\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\tH&\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\u0019H$\u00A2\u0006\u0004\b\u001B\u0010\u001CJ \u0010 \u001A\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001F2\u0006\u0010\u001E\u001A\u00020\u001DH\u00A6@\u00A2\u0006\u0004\b \u0010!JG\u0010)\u001A\u00020\u00132\u0006\u0010#\u001A\u00020\"2\b\u0010$\u001A\u0004\u0018\u00010\t2\u0006\u0010&\u001A\u00020%2\b\u0010\'\u001A\u0004\u0018\u00010\"2\b\u0010(\u001A\u0004\u0018\u00010\t2\b\u0010\u0016\u001A\u0004\u0018\u00010\tH$\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010-\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\t2\u0006\u0010,\u001A\u00020+H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0015\u00101\u001A\u00020\u00132\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\u001F\u00104\u001A\u00020\u00132\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u00103\u001A\u00020\u000B\u00A2\u0006\u0004\b4\u00105J\u001F\u00106\u001A\u00020\u00132\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u00103\u001A\u00020\u000B\u00A2\u0006\u0004\b6\u00105J\u0015\u00108\u001A\u00020\u00132\u0006\u00107\u001A\u00020\"\u00A2\u0006\u0004\b8\u00109J\r\u0010:\u001A\u00020\u0013\u00A2\u0006\u0004\b:\u0010;J\u001F\u0010=\u001A\u00020\u00132\b\u0010<\u001A\u0004\u0018\u00010\t2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b=\u0010>J\u001F\u0010@\u001A\u00020\u00132\b\u0010?\u001A\u0004\u0018\u00010\t2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b@\u0010>J\u0015\u0010A\u001A\u00020\u00132\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\bA\u0010BJ\u001D\u0010D\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\t2\u0006\u0010C\u001A\u00020\u000B\u00A2\u0006\u0004\bD\u0010EJ\u001F\u0010F\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\t2\u0006\u0010C\u001A\u00020\u000BH$\u00A2\u0006\u0004\bF\u0010EJ\u000F\u0010G\u001A\u00020\u0013H$\u00A2\u0006\u0004\bG\u0010;J\u000F\u0010H\u001A\u00020\u0013H&\u00A2\u0006\u0004\bH\u0010;J\u0017\u0010K\u001A\u00020\u00132\u0006\u0010J\u001A\u00020IH\u0014\u00A2\u0006\u0004\bK\u0010LJ\u001D\u0010M\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u00103\u001A\u00020\u000B\u00A2\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\bO\u0010PJ\u001F\u0010Q\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u00103\u001A\u00020\u000B\u00A2\u0006\u0004\bQ\u0010NJ1\u0010S\u001A\u00020\u00132\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010R\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\bS\u0010TJ\u001B\u0010X\u001A\b\u0012\u0004\u0012\u00020W0V2\u0006\u0010U\u001A\u00020\u001D\u00A2\u0006\u0004\bX\u0010YR$\u0010a\u001A\u0004\u0018\u00010Z8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010i\u001A\u0004\u0018\u00010b8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010d\u001A\u0004\be\u0010f\"\u0004\bg\u0010hR\u001A\u0010l\u001A\u00020\u000B8\u0016X\u0096D\u00A2\u0006\f\n\u0004\bj\u0010k\u001A\u0004\bl\u0010mR\u001A\u0010p\u001A\u00020\u000B8\u0016X\u0096D\u00A2\u0006\f\n\u0004\bn\u0010k\u001A\u0004\bo\u0010mR\u001D\u0010v\u001A\b\u0012\u0004\u0012\u00020\u000B0q8\u0006\u00A2\u0006\f\n\u0004\br\u0010s\u001A\u0004\bt\u0010uR$\u0010#\u001A\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\bw\u0010x\u001A\u0004\by\u0010z\"\u0004\b{\u00109R&\u0010$\u001A\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0014\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007F\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0085\u0001\u001A\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0015\n\u0005\b\u0082\u0001\u0010x\u001A\u0005\b\u0083\u0001\u0010z\"\u0005\b\u0084\u0001\u00109R)\u0010\u0089\u0001\u001A\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0016\n\u0005\b\u0086\u0001\u0010}\u001A\u0005\b\u0087\u0001\u0010\u007F\"\u0006\b\u0088\u0001\u0010\u0081\u0001R$\u0010\u008D\u0001\u001A\t\u0012\u0005\u0012\u00030\u008A\u00010q8\u0004X\u0084\u0004\u00A2\u0006\u000E\n\u0005\b\u008B\u0001\u0010s\u001A\u0005\b\u008C\u0001\u0010uR \u0010\u0093\u0001\u001A\u00030\u008E\u00018\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u008F\u0001\u0010\u0090\u0001\u001A\u0006\b\u0091\u0001\u0010\u0092\u0001R+\u0010\u0098\u0001\u001A\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00010q8\u0004X\u0084\u0004\u00A2\u0006\u000E\n\u0005\b\u0096\u0001\u0010s\u001A\u0005\b\u0097\u0001\u0010uR$\u0010\u009C\u0001\u001A\t\u0012\u0005\u0012\u00030\u0099\u00010q8\u0004X\u0084\u0004\u00A2\u0006\u000E\n\u0005\b\u009A\u0001\u0010s\u001A\u0005\b\u009B\u0001\u0010uR$\u0010\u00A3\u0001\u001A\n\u0012\u0005\u0012\u00030\u009E\u00010\u009D\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u009F\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0018\u0010\u00A6\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00A4\u0001\u0010\u00A5\u0001R\u0018\u0010\u00A8\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00A7\u0001\u0010\u00A5\u0001R\u0018\u0010\u00AA\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00A9\u0001\u0010\u00A5\u0001R\u0018\u0010\u00AC\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00AB\u0001\u0010\u00A5\u0001R\u0018\u0010\u00AE\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00AD\u0001\u0010\u00A5\u0001R\u0018\u0010\u00B0\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00AF\u0001\u0010\u00A5\u0001R\u0018\u0010\u00B2\u0001\u001A\u00030\u009E\u00018&X\u00A6\u0004\u00A2\u0006\b\u001A\u0006\b\u00B1\u0001\u0010\u00A5\u0001R#\u0010\u00B5\u0001\u001A\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00B3\u00010\u0094\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00B4\u0001\u0010\u00A2\u0001R$\u0010\u00B7\u0001\u001A\u0012\u0012\r\u0012\u000B\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0094\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00B6\u0001\u0010\u00A2\u0001R$\u0010\u00B9\u0001\u001A\u0012\u0012\r\u0012\u000B\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0094\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00B8\u0001\u0010\u00A2\u0001R\"\u0010\u00BB\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020I0\u0094\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00BA\u0001\u0010\u00A2\u0001R\"\u0010\u00BD\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020I0\u0094\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00BC\u0001\u0010\u00A2\u0001R#\u0010\u00BF\u0001\u001A\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00BE\u0001\u0010\u00A2\u0001R\u001C\u0010\u00C1\u0001\u001A\n\u0012\u0005\u0012\u00030\u0099\u00010\u009D\u00018F\u00A2\u0006\b\u001A\u0006\b\u00C0\u0001\u0010\u00A2\u0001\u00A8\u0006\u00C3\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/BaseMviViewModel;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "userId", "", "isMyUserId", "(Ljava/lang/Long;)Z", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmpty", "", "completeInitLoad", "(Z)V", "commentId", "onClickReport", "(J)V", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "writeComplete", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "Lcom/kakao/tistory/domain/entity/common/Result;", "deleteComment", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "blogName", "entryId", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "password", "parentCommentId", "loadComments", "(Ljava/lang/String;Ljava/lang/Long;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "sendActivityResultEvent", "(JLcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;)V", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyMoreItem;", "commentReplyMoreItem", "onClickLoadMoreReply", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyMoreItem;)V", "isReplyToMe", "onClickUserImage", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Z)V", "onClickUserName", "link", "onClickLink", "(Ljava/lang/String;)V", "onClickContentReadMore", "()V", "previewCommendId", "onClickMenu", "(Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "reloadId", "onClickDelete", "onClickModify", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "pin", "onClickPin", "(JZ)V", "pinComment", "loadPinComment", "goToDetailPinnedComment", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "showErrorDialog", "(Lcom/kakao/android/base/model/ErrorModel;)V", "isReplyButtonVisible", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Z)Z", "isMenuVisible", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)Z", "isAllowedSecret", "isReplyMore", "invalidate", "(Ljava/lang/Long;Ljava/lang/Long;Z)V", "item", "", "Lcom/kakao/tistory/presentation/view/comment/CommentMenuItem;", "getAccessibleMenu", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)Ljava/util/List;", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "k", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "getQuery", "()Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "setQuery", "(Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;)V", "query", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource;", "l", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource;", "getDataSource", "()Lcom/kakao/tistory/data/datasource/comment/CommentDataSource;", "setDataSource", "(Lcom/kakao/tistory/data/datasource/comment/CommentDataSource;)V", "dataSource", "m", "Z", "isListStartFromBottom", "()Z", "n", "getShowEditorWhenEmpty", "showEditorWhenEmpty", "Landroidx/lifecycle/MutableLiveData;", "p", "Landroidx/lifecycle/MutableLiveData;", "getAcceptComment", "()Landroidx/lifecycle/MutableLiveData;", "acceptComment", "q", "Ljava/lang/String;", "getBlogName", "()Ljava/lang/String;", "setBlogName", "r", "Ljava/lang/Long;", "getEntryId", "()Ljava/lang/Long;", "setEntryId", "(Ljava/lang/Long;)V", "s", "getGuestPassword", "setGuestPassword", "guestPassword", "t", "getArticleWriterId", "setArticleWriterId", "articleWriterId", "Lcom/kakao/tistory/presentation/common/BlogRoleType;", "u", "getBlogRoleType", "blogRoleType", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "v", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lcom/kakao/tistory/presentation/view/bottomsheet/ReportExtra;", "C", "get_showReportCommentDialog", "_showReportCommentDialog", "Lcom/kakao/tistory/presentation/common/CommentInputAcceptType;", "D", "get_enableInputComment", "_enableInputComment", "Landroidx/lifecycle/LiveData;", "", "E", "Landroidx/lifecycle/LiveData;", "getNotAgreeInputTextTitle", "()Landroidx/lifecycle/LiveData;", "notAgreeInputTextTitle", "getDeleteCommentDialogTitleRes", "()I", "deleteCommentDialogTitleRes", "getDeleteReplyDialogTitleRes", "deleteReplyDialogTitleRes", "getRestrictedCommentUnModifyDialogTitleRes", "restrictedCommentUnModifyDialogTitleRes", "getNotLoginUserRes", "notLoginUserRes", "getNotLoginReplyUserRes", "notLoginReplyUserRes", "getNotAcceptCommentRes", "notAcceptCommentRes", "getBlockedCommentRes", "blockedCommentRes", "Lcom/kakao/tistory/presentation/view/comment/CommentShowMenuEvent;", "getShowBottomSheetMenu", "showBottomSheetMenu", "getGoToBlogActivity", "goToBlogActivity", "getGoToRedirect", "goToRedirect", "getShowCanNotFindPostDialog", "showCanNotFindPostDialog", "getShowCanNotFindCommentDialog", "showCanNotFindCommentDialog", "getShowReportCommentDialog", "showReportCommentDialog", "getEnableInputComment", "enableInputComment", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentListViewModel extends BaseMviViewModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel$Companion;", "", "", "COMMENT_MAX_LENGTH", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[ReplyType.values().length];
            try {
                arr_v[ReplyType.Parent.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ReplyType.Mention.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ReplyType.None.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[BlogRoleType.values().length];
            try {
                arr_v1[BlogRoleType.OWNER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[BlogRoleType.MANAGER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[BlogRoleType.EDITOR.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[BlogRoleType.WRITER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    public static final int $stable;
    public final MutableLiveData A;
    public final MutableLiveData B;
    public final MutableLiveData C;
    @NotNull
    public static final Companion Companion;
    public final MutableLiveData D;
    public final LiveData E;
    public Query k;
    public CommentDataSource l;
    public final boolean m;
    public final boolean n;
    public final LiveData o;
    public final MutableLiveData p;
    public String q;
    public Long r;
    public String s;
    public Long t;
    public final MutableLiveData u;
    public final com.kakao.tistory.presentation.view.comment.CommentListViewModel.commentTiara.1 v;
    public Long w;
    public final MutableLiveData x;
    public final MutableLiveData y;
    public final MutableLiveData z;

    static {
        CommentListViewModel.Companion = new Companion(null);
        CommentListViewModel.$stable = 8;
    }

    public CommentListViewModel(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super(new CommentListModel(false, false, null, null, 0L, false, null, null, false, false, null, null, null, null, null, 0x7FFF, null));
        this.m = true;
        this.n = true;
        this.o = accountRepository0.getOldUser();
        this.p = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = new com.kakao.tistory.presentation.view.comment.CommentListViewModel.commentTiara.1();
        this.x = new MutableLiveData();
        this.y = new MutableLiveData();
        this.z = new MutableLiveData();
        this.A = new MutableLiveData();
        this.B = new MutableLiveData();
        this.C = new MutableLiveData();
        this.D = new MutableLiveData();
        this.E = Transformations.map(this.getEnableInputComment(), new u1(this));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x1(this, null), 3, null);

        @Metadata(d1 = {"\u0000\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/kakao/tistory/presentation/view/comment/CommentListViewModel$commentTiara$1", "Lcom/kakao/tistory/presentation/view/comment/CommentTiara;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.tistory.presentation.view.comment.CommentListViewModel.commentTiara.1 extends CommentTiara {
        }

    }

    public final void a(CommentItem commentItemType$CommentItem0, boolean z) {
        this.w = commentItemType$CommentItem0.getId();
        if(!this.isAllowedSecret(commentItemType$CommentItem0, z) && commentItemType$CommentItem0.isSecret()) {
            return;
        }
        String s = commentItemType$CommentItem0.getDefaultBlogName();
        if(s != null && !p.isBlank(s) && commentItemType$CommentItem0.getUserId() != null) {
            Event event0 = new Event(commentItemType$CommentItem0.getDefaultBlogName());
            this.y.setValue(event0);
            return;
        }
        if(commentItemType$CommentItem0.getParent() == null) {
            this.sendEvent(new ShowToast(this.getNotLoginUserRes()));
            return;
        }
        this.sendEvent(new ShowToast(this.getNotLoginReplyUserRes()));
    }

    public final boolean a() {
        BlogRoleType blogRoleType0 = (BlogRoleType)this.u.getValue();
        int v = blogRoleType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[blogRoleType0.ordinal()];
        return v == 1 || v == 2 || v == 3 || v == 4;
    }

    public static final void access$deleteComment(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, Long long0) {
        commentListViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(commentListViewModel0), null, null, new p1(commentListViewModel0, commentItemType$CommentItem0, long0, null), 3, null);
    }

    public static final Long access$getSelectedCommentId$p(CommentListViewModel commentListViewModel0) {
        return commentListViewModel0.w;
    }

    public static final boolean access$isReachCommentMaxLength(CommentListViewModel commentListViewModel0, String s) {
        commentListViewModel0.getClass();
        if(s.length() <= 1000) {
            return false;
        }
        commentListViewModel0.sendEvent(new ShowDialog(new DialogUIModel(string.label_reach_limit_comment_length, null, null, string.label_dialog_ok, false, null, null, 0x76, null)));
        return true;
    }

    public final boolean b() {
        BlogRoleType blogRoleType0 = (BlogRoleType)this.u.getValue();
        int v = blogRoleType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[blogRoleType0.ordinal()];
        return v == 1 || v == 2 || v == 3 || this.isMyUserId(this.t);
    }

    public abstract void completeInitLoad(boolean arg1);

    @Nullable
    public abstract Object deleteComment(@NotNull CommentItem arg1, @NotNull Continuation arg2);

    @NotNull
    public final MutableLiveData getAcceptComment() {
        return this.p;
    }

    @NotNull
    public final List getAccessibleMenu(@NotNull CommentItem commentItemType$CommentItem0) {
        CommentMenuItem commentMenuItem1;
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "item");
        boolean z = this.isMyUserId(commentItemType$CommentItem0.getUserId());
        boolean z1 = this.a();
        CommentMenuItem commentMenuItem0 = null;
        if(!z1 || commentItemType$CommentItem0.isSecret() || commentItemType$CommentItem0.getParent() != null) {
            commentMenuItem1 = null;
        }
        else if(commentItemType$CommentItem0.isPinned()) {
            commentMenuItem1 = CommentMenuItem.UnPin;
        }
        else {
            commentMenuItem1 = CommentMenuItem.Pin;
        }
        CommentMenuItem commentMenuItem2 = z ? CommentMenuItem.Modify : null;
        CommentMenuItem commentMenuItem3 = z1 || z ? CommentMenuItem.Delete : null;
        if(!z && !commentItemType$CommentItem0.isRestrict()) {
            commentMenuItem0 = CommentMenuItem.Report;
        }
        return CollectionsKt__CollectionsKt.listOfNotNull(new CommentMenuItem[]{commentMenuItem1, commentMenuItem2, commentMenuItem3, commentMenuItem0});
    }

    @Nullable
    public final Long getArticleWriterId() {
        return this.t;
    }

    public abstract int getBlockedCommentRes();

    @Nullable
    public final String getBlogName() {
        return this.q;
    }

    @NotNull
    public final MutableLiveData getBlogRoleType() {
        return this.u;
    }

    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.v;
    }

    @Nullable
    public final CommentDataSource getDataSource() {
        return this.l;
    }

    public abstract int getDeleteCommentDialogTitleRes();

    public abstract int getDeleteReplyDialogTitleRes();

    @NotNull
    public final LiveData getEnableInputComment() {
        return this.D;
    }

    @Nullable
    public final Long getEntryId() {
        return this.r;
    }

    @NotNull
    public final LiveData getGoToBlogActivity() {
        return this.y;
    }

    @NotNull
    public final LiveData getGoToRedirect() {
        return this.z;
    }

    @Nullable
    public final String getGuestPassword() {
        return this.s;
    }

    public abstract int getNotAcceptCommentRes();

    @NotNull
    public final LiveData getNotAgreeInputTextTitle() {
        return this.E;
    }

    public abstract int getNotLoginReplyUserRes();

    public abstract int getNotLoginUserRes();

    @Nullable
    public final Query getQuery() {
        return this.k;
    }

    public abstract int getRestrictedCommentUnModifyDialogTitleRes();

    @NotNull
    public final LiveData getShowBottomSheetMenu() {
        return this.x;
    }

    @NotNull
    public final LiveData getShowCanNotFindCommentDialog() {
        return this.B;
    }

    @NotNull
    public final LiveData getShowCanNotFindPostDialog() {
        return this.A;
    }

    public boolean getShowEditorWhenEmpty() {
        return this.n;
    }

    @NotNull
    public final LiveData getShowReportCommentDialog() {
        return this.C;
    }

    @NotNull
    public final MutableLiveData get_enableInputComment() {
        return this.D;
    }

    @NotNull
    public final MutableLiveData get_showReportCommentDialog() {
        return this.C;
    }

    public abstract void goToDetailPinnedComment();

    @Nullable
    public Object handleIntent(@NotNull CommentListModel commentListModel0, @NotNull CommentListIntent commentListIntent0, @NotNull Continuation continuation0) {
        boolean z = true;
        if(commentListIntent0 instanceof LoadedCommentList) {
            this.loadPinComment();
            Flow flow0 = ((LoadedCommentList)commentListIntent0).getComments();
            Long long0 = ((LoadedCommentList)commentListIntent0).getScrollTargetCommentId();
            return new CommentListModel(false, false, flow0, null, 0L, false, null, null, false, this.isListStartFromBottom(), long0, new q1(this), new r1(this), new s1(this), new t1(this), 490, null);
        }
        if(commentListIntent0 instanceof LoadedPinCommentList) {
            return CommentListModel.copy$default(commentListModel0, false, false, null, ((LoadedPinCommentList)commentListIntent0).getPinedComment(), 0L, false, null, null, false, false, null, null, null, null, null, 0x7FF7, null);
        }
        if(commentListIntent0 instanceof UpdateCommentCountList) {
            return CommentListModel.copy$default(commentListModel0, false, false, null, null, ((UpdateCommentCountList)commentListIntent0).getCount(), false, null, null, false, false, null, null, null, null, null, 0x7FEF, null);
        }
        if(commentListIntent0 instanceof RefreshCommentList) {
            CommentListViewModel.invalidate$default(this, null, ((RefreshCommentList)commentListIntent0).getCommentId(), false, 5, null);
            return CommentListModel.copy$default(commentListModel0, false, false, null, null, 0L, false, null, null, ((RefreshCommentList)commentListIntent0).getKeepScrollPosition(), false, null, null, null, null, null, 0x7EFE, null);
        }
        if(commentListIntent0 instanceof ClickReply) {
            this.getCommentTiara().trackClickReply();
            return CommentListModel.copy$default(commentListModel0, false, false, null, null, 0L, false, ((ClickReply)commentListIntent0).getParent(), ((ClickReply)commentListIntent0).getMention(), false, false, null, null, null, null, null, 0x7F3F, null);
        }
        if(commentListIntent0 instanceof RemoveReply) {
            switch(WhenMappings.$EnumSwitchMapping$0[((RemoveReply)commentListIntent0).getReplyType().ordinal()]) {
                case 1: {
                    return CommentListModel.copy$default(commentListModel0, false, false, null, null, 0L, false, null, null, false, false, null, null, null, null, null, 0x7FBF, null);
                }
                case 2: {
                    return CommentListModel.copy$default(commentListModel0, false, false, null, null, 0L, false, null, null, false, false, null, null, null, null, null, 0x7F7F, null);
                }
                case 3: {
                    return commentListModel0;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(commentListIntent0 instanceof WriteComplete) {
            this.writeComplete(((WriteComplete)commentListIntent0).getCommentCompletion());
            return CommentListModel.copy$default(commentListModel0, false, false, null, null, 0L, false, null, null, false, false, null, null, null, null, null, 0x7F3F, null);
        }
        if(!(commentListIntent0 instanceof FinishInitLoading)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z1 = ((FinishInitLoading)commentListIntent0).isEmpty();
        if(((FinishInitLoading)commentListIntent0).isEmpty()) {
            z = this.getShowEditorWhenEmpty();
        }
        return CommentListModel.copy$default(commentListModel0, true, z1, null, null, 0L, z, null, null, false, false, null, null, null, null, null, 0x7ADC, null);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.BaseMviViewModel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((CommentListModel)object0), ((CommentListIntent)object1), continuation0);
    }

    public void invalidate(@Nullable Long long0, @Nullable Long long1, boolean z) {
        Unit unit0;
        Query commentDataSource$Query0 = this.k;
        if(commentDataSource$Query0 != null) {
            commentDataSource$Query0.setCommentId((long0 == null ? long1 : long0));
        }
        if(long0 == null) {
            long0 = long1;
        }
        if(long0 == null) {
            unit0 = null;
        }
        else {
            long v = long0.longValue();
            Query commentDataSource$Query1 = this.k;
            if(commentDataSource$Query1 != null) {
                commentDataSource$Query1.setListMode(ListMode.COMMENT);
            }
            if(z) {
                Query commentDataSource$Query2 = this.k;
                if(commentDataSource$Query2 != null) {
                    HashSet hashSet0 = commentDataSource$Query2.getReplyMoreCommentIdSet();
                    if(hashSet0 != null) {
                        hashSet0.add(v);
                    }
                }
            }
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            Query commentDataSource$Query3 = this.k;
            if(commentDataSource$Query3 != null) {
                commentDataSource$Query3.setListMode(ListMode.INIT);
            }
        }
        this.loadPinComment();
        CommentDataSource commentDataSource0 = this.l;
        if(commentDataSource0 != null) {
            commentDataSource0.invalidate();
        }
    }

    public static void invalidate$default(CommentListViewModel commentListViewModel0, Long long0, Long long1, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invalidate");
        }
        if((v & 1) != 0) {
            long0 = null;
        }
        if((v & 2) != 0) {
            long1 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        commentListViewModel0.invalidate(long0, long1, z);
    }

    public final boolean isAllowedSecret(@NotNull CommentItem commentItemType$CommentItem0, boolean z) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        return this.a() || this.isMyUserId(commentItemType$CommentItem0.getUserId()) || z;
    }

    public static boolean isAllowedSecret$default(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isAllowedSecret");
        }
        if((v & 2) != 0) {
            z = false;
        }
        return commentListViewModel0.isAllowedSecret(commentItemType$CommentItem0, z);
    }

    public boolean isListStartFromBottom() {
        return this.m;
    }

    // 去混淆评级： 低(25)
    public final boolean isMenuVisible(@NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        return !commentItemType$CommentItem0.isDeletedSupport() && !commentItemType$CommentItem0.isRestrict() && (!commentItemType$CommentItem0.isSecret() || this.a() || this.isMyUserId(commentItemType$CommentItem0.getUserId()));
    }

    public final boolean isMyUserId(@Nullable Long long0) {
        User user0 = (User)this.o.getValue();
        return user0 == null ? Intrinsics.areEqual(long0, null) : Intrinsics.areEqual(long0, user0.getId());
    }

    public final boolean isReplyButtonVisible(@NotNull CommentItem commentItemType$CommentItem0, boolean z) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        if(Intrinsics.areEqual(this.p.getValue(), Boolean.FALSE) || commentItemType$CommentItem0.isDeletedSupport() || commentItemType$CommentItem0.isRestrict()) {
            return false;
        }
        return commentItemType$CommentItem0.isSecret() ? this.isAllowedSecret(commentItemType$CommentItem0, z) : true;
    }

    public abstract void loadComments(@NotNull String arg1, @Nullable Long arg2, @NotNull ListMode arg3, @Nullable String arg4, @Nullable Long arg5, @Nullable Long arg6);

    public abstract void loadPinComment();

    public final void onClickContentReadMore() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_COMMENT_READ_MORE, null, null, null, null, null, 0xF8, null);
    }

    public final void onClickDelete(@Nullable Long long0, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        this.getCommentTiara().trackCLickDelete();
        if(!this.isMyUserId(commentItemType$CommentItem0.getUserId()) && !this.b()) {
            this.sendEvent(new ShowDialog(new DialogUIModel(string.label_dialog_comment_blog_role_type, null, null, string.label_dialog_ok, false, null, null, 0x76, null)));
            return;
        }
        this.sendEvent(new ShowDialog(new DialogUIModel((commentItemType$CommentItem0.getParent() == null ? this.getDeleteCommentDialogTitleRes() : this.getDeleteReplyDialogTitleRes()), null, string.label_dialog_cancel, string.label_dialog_delete, true, null, new v1(this, commentItemType$CommentItem0, long0), 34, null)));
    }

    public final void onClickLink(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "link");
        Event event0 = new Event(s);
        this.z.postValue(event0);
    }

    public final void onClickLoadMoreReply(@NotNull CommentReplyMoreItem commentItemType$CommentReplyMoreItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentReplyMoreItem0, "commentReplyMoreItem");
        this.getCommentTiara().trackClickLoadMore();
        CommentListViewModel.invalidate$default(this, commentItemType$CommentReplyMoreItem0.getParent(), null, true, 2, null);
    }

    public final void onClickMenu(@Nullable Long long0, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        CommentShowMenuEvent commentShowMenuEvent0 = new CommentShowMenuEvent(long0, commentItemType$CommentItem0);
        LiveDataExtensionKt.postEvent(this.x, commentShowMenuEvent0);
    }

    public final void onClickModify(@NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        this.getCommentTiara().trackCLickModify();
        if(commentItemType$CommentItem0.isRestrict()) {
            this.sendEvent(new ShowDialog(new DialogUIModel((commentItemType$CommentItem0.getParent() == null ? this.getRestrictedCommentUnModifyDialogTitleRes() : string.label_dialog_reply_modify_restricted_reply), null, null, string.label_dialog_ok, false, null, null, 0x76, null)));
            return;
        }
        String s = this.q;
        if(s != null) {
            this.sendEvent(new GoModify(s, this.r, this.s, commentItemType$CommentItem0));
        }
    }

    public final void onClickPin(long v, boolean z) {
        if(this.b()) {
            if(z) {
                this.getCommentTiara().trackClickPin();
                this.sendEvent(new ShowDialog(new DialogUIModel(string.label_comment_pin_confirm_title, string.label_comment_pin_confirm_message, string.label_dialog_cancel, string.label_comment_pin_confirm_ok, true, null, new w1(this, v), 0x20, null)));
                return;
            }
            this.getCommentTiara().trackClickUnPin();
            this.pinComment(v, false);
            this.sendActivityResultEvent(v, CommentActivityResultType.Updated);
            return;
        }
        this.sendEvent(new ShowDialog(new DialogUIModel(string.label_dialog_comment_blog_role_type, null, null, string.label_dialog_ok, false, null, null, 0x76, null)));
    }

    public abstract void onClickReport(long arg1);

    public final void onClickUserImage(@NotNull CommentItem commentItemType$CommentItem0, boolean z) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        this.getCommentTiara().trackClickProfile();
        this.a(commentItemType$CommentItem0, z);
    }

    public static void onClickUserImage$default(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickUserImage");
        }
        if((v & 2) != 0) {
            z = false;
        }
        commentListViewModel0.onClickUserImage(commentItemType$CommentItem0, z);
    }

    public final void onClickUserName(@NotNull CommentItem commentItemType$CommentItem0, boolean z) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        this.getCommentTiara().trackClickUserName();
        this.a(commentItemType$CommentItem0, z);
    }

    public static void onClickUserName$default(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClickUserName");
        }
        if((v & 2) != 0) {
            z = false;
        }
        commentListViewModel0.onClickUserName(commentItemType$CommentItem0, z);
    }

    public abstract void pinComment(long arg1, boolean arg2);

    public void sendActivityResultEvent(long v, @NotNull CommentActivityResultType commentActivityResultType0) {
        Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
        this.sendEvent(new SetActivityResult(commentActivityResultType0, false));
    }

    public final void setArticleWriterId(@Nullable Long long0) {
        this.t = long0;
    }

    public final void setBlogName(@Nullable String s) {
        this.q = s;
    }

    public final void setDataSource(@Nullable CommentDataSource commentDataSource0) {
        this.l = commentDataSource0;
    }

    public final void setEntryId(@Nullable Long long0) {
        this.r = long0;
    }

    public final void setGuestPassword(@Nullable String s) {
        this.s = s;
    }

    public final void setQuery(@Nullable Query commentDataSource$Query0) {
        this.k = commentDataSource$Query0;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel
    public void showErrorDialog(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "CAN_NOT_FIND_POST")) {
            Event event0 = new Event(errorModel0);
            this.A.setValue(event0);
            return;
        }
        if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "CAN_NOT_FIND_COMMENT")) {
            Event event1 = new Event(errorModel0);
            this.B.setValue(event1);
            return;
        }
        super.showErrorDialog(errorModel0);
    }

    public abstract void writeComplete(@NotNull CommentCompletion arg1);
}

