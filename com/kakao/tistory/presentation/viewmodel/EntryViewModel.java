package com.kakao.tistory.presentation.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.blog.usecase.GetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.blog.usecase.SetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.repository.SessionRepository;
import com.kakao.tistory.domain.usecase.PostEntryChallengeUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.BlogRoleType;
import com.kakao.tistory.presentation.common.EntryType;
import com.kakao.tistory.presentation.common.EnumConstsKt;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.entry.EntryTiara;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint.Comment;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint.Modify;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import com.kakao.tistory.presentation.widget.dialog.DialogController;
import com.kakao.tistory.presentation.widget.dialog.DialogEvent;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u00B4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0093\u0001\u0094\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J\'\u0010\u001E\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\'\u0010\u001E\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010 \u001A\u00020\u00192\b\u0010\u001D\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b\u001E\u0010!J\u0015\u0010$\u001A\u00020\u00142\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020\u00142\u0006\u0010\'\u001A\u00020&H\u0014\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010*\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b*\u0010+J\r\u0010,\u001A\u00020\u0014\u00A2\u0006\u0004\b,\u0010\u0018J\r\u0010-\u001A\u00020\u0014\u00A2\u0006\u0004\b-\u0010\u0018J%\u0010/\u001A\u00020\u00142\n\b\u0002\u0010.\u001A\u0004\u0018\u00010\u001B2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b/\u00100J\r\u00101\u001A\u00020\u0014\u00A2\u0006\u0004\b1\u0010\u0018J\r\u00102\u001A\u00020\u0014\u00A2\u0006\u0004\b2\u0010\u0018J\r\u00103\u001A\u00020\u0014\u00A2\u0006\u0004\b3\u0010\u0018J\r\u00104\u001A\u00020\u0014\u00A2\u0006\u0004\b4\u0010\u0018J\r\u00105\u001A\u00020\u0014\u00A2\u0006\u0004\b5\u0010\u0018J\r\u00106\u001A\u00020\u0014\u00A2\u0006\u0004\b6\u0010\u0018J\r\u00107\u001A\u00020\u0014\u00A2\u0006\u0004\b7\u0010\u0018R\u001D\u0010>\u001A\b\u0012\u0004\u0012\u000209088\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u001D\u0010E\u001A\b\u0012\u0004\u0012\u00020@0?8\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u001F\u0010L\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010G0F8\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u001D\u0010O\u001A\b\u0012\u0004\u0012\u00020M0?8\u0006\u00A2\u0006\f\n\u0004\bN\u0010B\u001A\u0004\bO\u0010DR\u001D\u0010R\u001A\b\u0012\u0004\u0012\u00020\u001B0?8\u0006\u00A2\u0006\f\n\u0004\bP\u0010B\u001A\u0004\bQ\u0010DR0\u0010X\u001A\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010M0M0?8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010B\u001A\u0004\bU\u0010D\"\u0004\bV\u0010WR\u001D\u0010[\u001A\b\u0012\u0004\u0012\u00020\u001B0?8\u0006\u00A2\u0006\f\n\u0004\bY\u0010B\u001A\u0004\bZ\u0010DR#\u0010_\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\\0?8\u0006\u00A2\u0006\f\n\u0004\b]\u0010B\u001A\u0004\b^\u0010DR\u001D\u0010b\u001A\b\u0012\u0004\u0012\u00020M0?8\u0006\u00A2\u0006\f\n\u0004\b`\u0010B\u001A\u0004\ba\u0010DR\u001D\u0010e\u001A\b\u0012\u0004\u0012\u00020M0F8\u0006\u00A2\u0006\f\n\u0004\bc\u0010I\u001A\u0004\bd\u0010KR\u001D\u0010h\u001A\b\u0012\u0004\u0012\u00020M0F8\u0006\u00A2\u0006\f\n\u0004\bf\u0010I\u001A\u0004\bg\u0010KR\u001D\u0010l\u001A\b\u0012\u0004\u0012\u00020i0?8\u0006\u00A2\u0006\f\n\u0004\bj\u0010B\u001A\u0004\bk\u0010DR$\u0010\u001A\u001A\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010n\u001A\u0004\bo\u0010+\"\u0004\bp\u0010qR(\u0010w\u001A\u0004\u0018\u00010\u001B2\b\u0010r\u001A\u0004\u0018\u00010\u001B8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010vR\u001D\u0010z\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0x0F8F\u00A2\u0006\u0006\u001A\u0004\by\u0010KR\u001D\u0010}\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0x0F8F\u00A2\u0006\u0006\u001A\u0004\b|\u0010KR\u001D\u0010\u007F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0x0F8F\u00A2\u0006\u0006\u001A\u0004\b~\u0010KR&\u0010\u0082\u0001\u001A\u0015\u0012\u0011\u0012\u000F\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u00190\u0080\u00010x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u0081\u0001\u0010KR\u001F\u0010\u0084\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u0083\u0001\u0010KR!\u0010\u0086\u0001\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u0085\u0001\u0010KR\u001F\u0010\u0088\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u0087\u0001\u0010KR\u001F\u0010\u008A\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u0089\u0001\u0010KR\u001F\u0010\u008C\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u008B\u0001\u0010KR\u001F\u0010\u008E\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u008D\u0001\u0010KR\u001F\u0010\u0090\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u008F\u0001\u0010KR\u001F\u0010\u0092\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140x0F8F\u00A2\u0006\u0007\u001A\u0005\b\u0091\u0001\u0010K\u00A8\u0006\u0095\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/SessionRepository;", "sessionRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "Lcom/kakao/tistory/domain/usecase/PostEntryChallengeUseCase;", "postEntryChallengeUseCase", "Lcom/kakao/tistory/domain/blog/usecase/GetShowChallengeAuthUseCase;", "getShowChallengeAuthUseCase", "Lcom/kakao/tistory/domain/blog/usecase/SetShowChallengeAuthUseCase;", "setShowChallengeAuthUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/SessionRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/OldBlogRepository;Lcom/kakao/tistory/domain/usecase/PostEntryChallengeUseCase;Lcom/kakao/tistory/domain/blog/usecase/GetShowChallengeAuthUseCase;Lcom/kakao/tistory/domain/blog/usecase/SetShowChallengeAuthUseCase;)V", "Landroid/content/Intent;", "intent", "", "initBundle", "(Landroid/content/Intent;)V", "init", "()V", "", "blogName", "", "entryId", "password", "getEntry", "(Ljava/lang/String;JLjava/lang/String;)V", "slogan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "result", "showChallengeSuccessDialog", "(Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;)V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "showErrorDialog", "(Lcom/kakao/android/base/model/ErrorModel;)V", "getWebSessionCookie", "()Ljava/lang/String;", "deleteEntry", "onClickLike", "commentId", "onClickComment", "(Ljava/lang/Long;Ljava/lang/String;)V", "onClickShare", "onClickModification", "onClickStatistics", "onClickDelete", "onClickMoreButton", "onClickReport", "onClickUserProfileImage", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "y", "Lkotlinx/coroutines/flow/Flow;", "getDialogEvent", "()Lkotlinx/coroutines/flow/Flow;", "dialogEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "B", "Landroidx/lifecycle/MutableLiveData;", "getEntryItem", "()Landroidx/lifecycle/MutableLiveData;", "entryItem", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/domain/entity/User;", "C", "Landroidx/lifecycle/LiveData;", "getAppBarUser", "()Landroidx/lifecycle/LiveData;", "appBarUser", "", "E", "isRestrictedEntry", "G", "getLikeCount", "likeCount", "kotlin.jvm.PlatformType", "H", "getLikeSelected", "setLikeSelected", "(Landroidx/lifecycle/MutableLiveData;)V", "likeSelected", "I", "getCommentCount", "commentCount", "Landroid/util/LongSparseArray;", "J", "getUpdateCommentCount", "updateCommentCount", "K", "getMoreSelected", "moreSelected", "L", "getShowMoreMineBottomGroup", "showMoreMineBottomGroup", "M", "getShowMoreOthersBottomGroup", "showMoreOthersBottomGroup", "", "N", "getCommentButtonVisibility", "CommentButtonVisibility", "O", "Ljava/lang/String;", "getBlogName", "setBlogName", "(Ljava/lang/String;)V", "<set-?>", "S", "Ljava/lang/Long;", "getBlogId", "()Ljava/lang/Long;", "blogId", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getShowWebView", "showWebView", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryEvent;", "getEntryEvent", "entryEvent", "getGoToStatisticsActivity", "goToStatisticsActivity", "", "getGoToShare", "goToShare", "getShowReportEntryDialog", "showReportEntryDialog", "getGoToBlogActivity", "goToBlogActivity", "getShowProtectedEntryDialogGoToComment", "showProtectedEntryDialogGoToComment", "getShowProtectedEntryDialogGoToEntry", "showProtectedEntryDialogGoToEntry", "getShowProtectedEntryDialogGoToSupport", "showProtectedEntryDialogGoToSupport", "getShowProtectedEntryDialogWithSloganGoToEntry", "showProtectedEntryDialogWithSloganGoToEntry", "getShowToast", "showToast", "getFinishActivity", "finishActivity", "EntryDialogEvent", "EntryEvent", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/EntryViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1#2:438\n*E\n"})
public final class EntryViewModel extends TistoryViewModel {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;", "ShowCanNotFindPostDialog", "ShowChallengeAuthDialog", "ShowChallengeSuccessDialog", "ShowDeleteEntryDialog", "ShowModificationDialog", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowChallengeAuthDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowDeleteEntryDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowModificationDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class EntryDialogEvent implements DialogEvent {
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ShowCanNotFindPostDialog extends EntryDialogEvent {
            public static final int $stable = 8;
            public final ErrorModel a;

            public ShowCanNotFindPostDialog(@NotNull ErrorModel errorModel0) {
                Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
                super(null);
                this.a = errorModel0;
            }

            @NotNull
            public final ErrorModel component1() {
                return this.a;
            }

            @NotNull
            public final ShowCanNotFindPostDialog copy(@NotNull ErrorModel errorModel0) {
                Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
                return new ShowCanNotFindPostDialog(errorModel0);
            }

            public static ShowCanNotFindPostDialog copy$default(ShowCanNotFindPostDialog entryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog0, ErrorModel errorModel0, int v, Object object0) {
                if((v & 1) != 0) {
                    errorModel0 = entryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog0.a;
                }
                return entryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog0.copy(errorModel0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof ShowCanNotFindPostDialog ? Intrinsics.areEqual(this.a, ((ShowCanNotFindPostDialog)object0).a) : false;
            }

            @NotNull
            public final ErrorModel getErrorModel() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "ShowCanNotFindPostDialog(errorModel=" + this.a + ")";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowChallengeAuthDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "challengeResult", "<init>", "(Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;)V", "component1", "()Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "copy", "(Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;)Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowChallengeAuthDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "getChallengeResult", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ShowChallengeAuthDialog extends EntryDialogEvent {
            public static final int $stable = 8;
            public final ChallengeResult a;

            public ShowChallengeAuthDialog(@NotNull ChallengeResult challengeResult0) {
                Intrinsics.checkNotNullParameter(challengeResult0, "challengeResult");
                super(null);
                this.a = challengeResult0;
            }

            @NotNull
            public final ChallengeResult component1() {
                return this.a;
            }

            @NotNull
            public final ShowChallengeAuthDialog copy(@NotNull ChallengeResult challengeResult0) {
                Intrinsics.checkNotNullParameter(challengeResult0, "challengeResult");
                return new ShowChallengeAuthDialog(challengeResult0);
            }

            public static ShowChallengeAuthDialog copy$default(ShowChallengeAuthDialog entryViewModel$EntryDialogEvent$ShowChallengeAuthDialog0, ChallengeResult challengeResult0, int v, Object object0) {
                if((v & 1) != 0) {
                    challengeResult0 = entryViewModel$EntryDialogEvent$ShowChallengeAuthDialog0.a;
                }
                return entryViewModel$EntryDialogEvent$ShowChallengeAuthDialog0.copy(challengeResult0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof ShowChallengeAuthDialog ? Intrinsics.areEqual(this.a, ((ShowChallengeAuthDialog)object0).a) : false;
            }

            @NotNull
            public final ChallengeResult getChallengeResult() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "ShowChallengeAuthDialog(challengeResult=" + this.a + ")";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "challengeResult", "<init>", "(Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;)V", "component1", "()Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "copy", "(Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;)Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "getChallengeResult", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ShowChallengeSuccessDialog extends EntryDialogEvent {
            public static final int $stable = 8;
            public final ChallengeResult a;

            public ShowChallengeSuccessDialog(@NotNull ChallengeResult challengeResult0) {
                Intrinsics.checkNotNullParameter(challengeResult0, "challengeResult");
                super(null);
                this.a = challengeResult0;
            }

            @NotNull
            public final ChallengeResult component1() {
                return this.a;
            }

            @NotNull
            public final ShowChallengeSuccessDialog copy(@NotNull ChallengeResult challengeResult0) {
                Intrinsics.checkNotNullParameter(challengeResult0, "challengeResult");
                return new ShowChallengeSuccessDialog(challengeResult0);
            }

            public static ShowChallengeSuccessDialog copy$default(ShowChallengeSuccessDialog entryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog0, ChallengeResult challengeResult0, int v, Object object0) {
                if((v & 1) != 0) {
                    challengeResult0 = entryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog0.a;
                }
                return entryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog0.copy(challengeResult0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof ShowChallengeSuccessDialog ? Intrinsics.areEqual(this.a, ((ShowChallengeSuccessDialog)object0).a) : false;
            }

            @NotNull
            public final ChallengeResult getChallengeResult() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "ShowChallengeSuccessDialog(challengeResult=" + this.a + ")";
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowDeleteEntryDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "", "hasPermission", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowDeleteEntryDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getHasPermission", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ShowDeleteEntryDialog extends EntryDialogEvent {
            public static final int $stable;
            public final boolean a;

            public ShowDeleteEntryDialog(boolean z) {
                super(null);
                this.a = z;
            }

            public final boolean component1() {
                return this.a;
            }

            @NotNull
            public final ShowDeleteEntryDialog copy(boolean z) {
                return new ShowDeleteEntryDialog(z);
            }

            public static ShowDeleteEntryDialog copy$default(ShowDeleteEntryDialog entryViewModel$EntryDialogEvent$ShowDeleteEntryDialog0, boolean z, int v, Object object0) {
                if((v & 1) != 0) {
                    z = entryViewModel$EntryDialogEvent$ShowDeleteEntryDialog0.a;
                }
                return entryViewModel$EntryDialogEvent$ShowDeleteEntryDialog0.copy(z);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof ShowDeleteEntryDialog ? this.a == ((ShowDeleteEntryDialog)object0).a : false;
            }

            public final boolean getHasPermission() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return Boolean.hashCode(this.a);
            }

            @Override
            @NotNull
            public String toString() {
                return "ShowDeleteEntryDialog(hasPermission=" + this.a + ")";
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowModificationDialog;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent;", "", "id", "<init>", "(Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryDialogEvent$ShowModificationDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ShowModificationDialog extends EntryDialogEvent {
            public static final int $stable;
            public final Long a;

            public ShowModificationDialog(@Nullable Long long0) {
                super(null);
                this.a = long0;
            }

            @Nullable
            public final Long component1() {
                return this.a;
            }

            @NotNull
            public final ShowModificationDialog copy(@Nullable Long long0) {
                return new ShowModificationDialog(long0);
            }

            public static ShowModificationDialog copy$default(ShowModificationDialog entryViewModel$EntryDialogEvent$ShowModificationDialog0, Long long0, int v, Object object0) {
                if((v & 1) != 0) {
                    long0 = entryViewModel$EntryDialogEvent$ShowModificationDialog0.a;
                }
                return entryViewModel$EntryDialogEvent$ShowModificationDialog0.copy(long0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof ShowModificationDialog ? Intrinsics.areEqual(this.a, ((ShowModificationDialog)object0).a) : false;
            }

            @Nullable
            public final Long getId() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a == null ? 0 : this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "ShowModificationDialog(id=" + this.a + ")";
            }
        }

        public static final int $stable;

        public EntryDialogEvent(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryEvent;", "", "GoComment", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryEvent$GoComment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class EntryEvent {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryEvent$GoComment;", "Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryEvent;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "", "commentId", "<init>", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;Ljava/lang/Long;)V", "component1", "()Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "component2", "()Ljava/lang/Long;", "copy", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;Ljava/lang/Long;)Lcom/kakao/tistory/presentation/viewmodel/EntryViewModel$EntryEvent$GoComment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "getEntryItem", "b", "Ljava/lang/Long;", "getCommentId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class GoComment extends EntryEvent {
            public static final int $stable;
            public final EntryItem a;
            public final Long b;

            public GoComment(@NotNull EntryItem entryItem0, @Nullable Long long0) {
                Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
                super(null);
                this.a = entryItem0;
                this.b = long0;
            }

            public GoComment(EntryItem entryItem0, Long long0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v & 2) != 0) {
                    long0 = null;
                }
                this(entryItem0, long0);
            }

            @NotNull
            public final EntryItem component1() {
                return this.a;
            }

            @Nullable
            public final Long component2() {
                return this.b;
            }

            @NotNull
            public final GoComment copy(@NotNull EntryItem entryItem0, @Nullable Long long0) {
                Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
                return new GoComment(entryItem0, long0);
            }

            public static GoComment copy$default(GoComment entryViewModel$EntryEvent$GoComment0, EntryItem entryItem0, Long long0, int v, Object object0) {
                if((v & 1) != 0) {
                    entryItem0 = entryViewModel$EntryEvent$GoComment0.a;
                }
                if((v & 2) != 0) {
                    long0 = entryViewModel$EntryEvent$GoComment0.b;
                }
                return entryViewModel$EntryEvent$GoComment0.copy(entryItem0, long0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof GoComment)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((GoComment)object0).a) ? Intrinsics.areEqual(this.b, ((GoComment)object0).b) : false;
            }

            @Nullable
            public final Long getCommentId() {
                return this.b;
            }

            @NotNull
            public final EntryItem getEntryItem() {
                return this.a;
            }

            @Override
            public int hashCode() {
                int v = this.a.hashCode();
                return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "GoComment(entryItem=" + this.a + ", commentId=" + this.b + ")";
            }
        }

        public static final int $stable;

        public EntryEvent(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[BlogRoleType.values().length];
            try {
                arr_v[BlogRoleType.OWNER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BlogRoleType.MANAGER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BlogRoleType.EDITOR.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BlogRoleType.WRITER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final LiveData A;
    public final MutableLiveData B;
    public final LiveData C;
    public final MutableLiveData D;
    public final MutableLiveData E;
    public final MutableLiveData F;
    public final MutableLiveData G;
    public MutableLiveData H;
    public final MutableLiveData I;
    public final MutableLiveData J;
    public final MutableLiveData K;
    public final LiveData L;
    public final LiveData M;
    public final MutableLiveData N;
    public String O;
    public long P;
    public String Q;
    public String R;
    public Long S;
    public EntryWayPoint T;
    public final AccountRepository g;
    public final SessionRepository h;
    public final EntryRepository i;
    public final OldBlogRepository j;
    public final GetShowChallengeAuthUseCase k;
    public final SetShowChallengeAuthUseCase l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;
    public final MutableLiveData q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public final MutableLiveData t;
    public final MutableLiveData u;
    public final MutableLiveData v;
    public final MutableLiveData w;
    public final DialogController x;
    public final Flow y;
    public final MutableLiveData z;

    @Inject
    public EntryViewModel(@NotNull AccountRepository accountRepository0, @NotNull SessionRepository sessionRepository0, @NotNull EntryRepository entryRepository0, @NotNull OldBlogRepository oldBlogRepository0, @NotNull PostEntryChallengeUseCase postEntryChallengeUseCase0, @NotNull GetShowChallengeAuthUseCase getShowChallengeAuthUseCase0, @NotNull SetShowChallengeAuthUseCase setShowChallengeAuthUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(sessionRepository0, "sessionRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        Intrinsics.checkNotNullParameter(postEntryChallengeUseCase0, "postEntryChallengeUseCase");
        Intrinsics.checkNotNullParameter(getShowChallengeAuthUseCase0, "getShowChallengeAuthUseCase");
        Intrinsics.checkNotNullParameter(setShowChallengeAuthUseCase0, "setShowChallengeAuthUseCase");
        super();
        this.g = accountRepository0;
        this.h = sessionRepository0;
        this.i = entryRepository0;
        this.j = oldBlogRepository0;
        this.k = getShowChallengeAuthUseCase0;
        this.l = setShowChallengeAuthUseCase0;
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
        this.q = new MutableLiveData();
        this.r = new MutableLiveData();
        this.s = new MutableLiveData();
        this.t = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = new MutableLiveData();
        this.w = new MutableLiveData();
        DialogController dialogController0 = new DialogController();
        this.x = dialogController0;
        this.y = dialogController0.getEventFlow();
        this.z = new MutableLiveData();
        this.A = accountRepository0.getOldCurrentBlogName();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.B = mutableLiveData0;
        this.C = Transformations.map(mutableLiveData0, q1.a);
        this.D = new MutableLiveData();
        this.E = new MutableLiveData();
        this.F = new MutableLiveData();
        this.G = new MutableLiveData();
        this.H = new MutableLiveData(Boolean.FALSE);
        this.I = new MutableLiveData();
        this.J = entryRepository0.getUpdatedCommentCounts();
        MutableLiveData mutableLiveData1 = new MutableLiveData();
        this.K = mutableLiveData1;
        this.L = Transformations.map(mutableLiveData1, new z1(this));
        this.M = Transformations.map(mutableLiveData1, new a2(this));
        this.N = new MutableLiveData();
        this.P = -1L;
    }

    public final boolean a() {
        BlogRoleType blogRoleType0 = (BlogRoleType)this.F.getValue();
        switch((blogRoleType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[blogRoleType0.ordinal()])) {
            case 1: 
            case 2: 
            case 3: {
                return true;
            }
            case 4: {
                EntryItem entryItem0 = (EntryItem)this.B.getValue();
                Long long0 = null;
                Long long1 = entryItem0 == null ? null : entryItem0.getAuthor();
                User user0 = (User)this.g.getOldUser().getValue();
                if(user0 != null) {
                    long0 = user0.getId();
                }
                return Intrinsics.areEqual(long1, long0);
            }
            default: {
                return false;
            }
        }
    }

    public static final boolean access$hasBlogRolePermission(EntryViewModel entryViewModel0, BlogRoleType blogRoleType0) {
        entryViewModel0.getClass();
        int v = blogRoleType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[blogRoleType0.ordinal()];
        return v == 1 || v == 2 || v == 3 || v == 4;
    }

    public static final void access$onSuccessEntry(EntryViewModel entryViewModel0, EntryItem entryItem0, String s) {
        Long long0;
        String s1;
        if(entryItem0 != null) {
            entryViewModel0.getClass();
            entryItem0.setPassword(s);
        }
        entryViewModel0.B.setValue(entryItem0);
        long v = 0L;
        entryViewModel0.I.setValue((entryItem0 == null ? 0L : entryItem0.getCommentCount()));
        MutableLiveData mutableLiveData0 = entryViewModel0.F;
        if(entryItem0 == null) {
            s1 = null;
        }
        else {
            Blog blog0 = entryItem0.getBlog();
            s1 = blog0 == null ? null : blog0.getRole();
        }
        mutableLiveData0.setValue(EnumConstsKt.getBlogRoleType(s1));
        MutableLiveData mutableLiveData1 = entryViewModel0.G;
        if(entryItem0 != null) {
            v = entryItem0.getLikeCount();
        }
        mutableLiveData1.setValue(v);
        entryViewModel0.H.setValue((entryItem0 == null ? Boolean.FALSE : Boolean.valueOf(entryItem0.getLikeFlag())));
        if(entryItem0 == null) {
            long0 = null;
        }
        else {
            Blog blog1 = entryItem0.getBlog();
            long0 = blog1 == null ? null : blog1.getId();
        }
        entryViewModel0.S = long0;
        EntryWayPoint entryViewActivity$EntryWayPoint0 = entryViewModel0.T;
        if(entryViewActivity$EntryWayPoint0 != null) {
            if(entryViewActivity$EntryWayPoint0 instanceof Comment) {
                EntryViewModel.onClickComment$default(entryViewModel0, ((Comment)entryViewActivity$EntryWayPoint0).getCommentId(), null, 2, null);
            }
            else if(Intrinsics.areEqual(entryViewActivity$EntryWayPoint0, Modify.INSTANCE)) {
                entryViewModel0.onClickModification();
            }
        }
        entryViewModel0.T = null;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(entryViewModel0), null, null, new x1(entryViewModel0, null), 3, null);
    }

    public static final void access$showLikeAndCommentButton(EntryViewModel entryViewModel0, String s) {
        Integer integer0;
        MutableLiveData mutableLiveData0 = entryViewModel0.N;
        int v = 8;
        if(Intrinsics.areEqual(s, "notice")) {
            integer0 = 8;
        }
        else {
            if(Intrinsics.areEqual(entryViewModel0.K.getValue(), Boolean.FALSE)) {
                v = 0;
            }
            integer0 = v;
        }
        mutableLiveData0.setValue(integer0);
    }

    public final void deleteEntry() {
        String s = (String)this.A.getValue();
        if(s == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r1(this, s, null), 3, null);
    }

    @NotNull
    public final LiveData getAppBarUser() {
        return this.C;
    }

    @Nullable
    public final Long getBlogId() {
        return this.S;
    }

    @Nullable
    public final String getBlogName() {
        return this.O;
    }

    @NotNull
    public final MutableLiveData getCommentButtonVisibility() {
        return this.N;
    }

    @NotNull
    public final MutableLiveData getCommentCount() {
        return this.I;
    }

    @NotNull
    public final Flow getDialogEvent() {
        return this.y;
    }

    public final void getEntry(@NotNull String s, long v, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new s1(this, s, v, s1, null), 3, null);
    }

    public final void getEntry(@NotNull String s, @NotNull String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "slogan");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new t1(this, s, s1, s2, null), 3, null);
    }

    @NotNull
    public final LiveData getEntryEvent() {
        return this.n;
    }

    @NotNull
    public final MutableLiveData getEntryItem() {
        return this.B;
    }

    @NotNull
    public final LiveData getFinishActivity() {
        return this.z;
    }

    @NotNull
    public final LiveData getGoToBlogActivity() {
        return this.r;
    }

    @NotNull
    public final LiveData getGoToShare() {
        return this.p;
    }

    @NotNull
    public final LiveData getGoToStatisticsActivity() {
        return this.o;
    }

    @NotNull
    public final MutableLiveData getLikeCount() {
        return this.G;
    }

    @NotNull
    public final MutableLiveData getLikeSelected() {
        return this.H;
    }

    @NotNull
    public final MutableLiveData getMoreSelected() {
        return this.K;
    }

    @NotNull
    public final LiveData getShowMoreMineBottomGroup() {
        return this.L;
    }

    @NotNull
    public final LiveData getShowMoreOthersBottomGroup() {
        return this.M;
    }

    @NotNull
    public final LiveData getShowProtectedEntryDialogGoToComment() {
        return this.s;
    }

    @NotNull
    public final LiveData getShowProtectedEntryDialogGoToEntry() {
        return this.t;
    }

    @NotNull
    public final LiveData getShowProtectedEntryDialogGoToSupport() {
        return this.u;
    }

    @NotNull
    public final LiveData getShowProtectedEntryDialogWithSloganGoToEntry() {
        return this.v;
    }

    @NotNull
    public final LiveData getShowReportEntryDialog() {
        return this.q;
    }

    @NotNull
    public final LiveData getShowToast() {
        return this.w;
    }

    @NotNull
    public final LiveData getShowWebView() {
        return this.m;
    }

    @NotNull
    public final MutableLiveData getUpdateCommentCount() {
        return this.J;
    }

    @Nullable
    public final String getWebSessionCookie() {
        return this.h.getWebSessionCookie();
    }

    public final void init() {
        Unit unit0;
        this.K.setValue(Boolean.FALSE);
        this.N.setValue(8);
        String s = this.O;
        if(s != null) {
            String s1 = this.Q;
            if(s1 == null) {
                unit0 = null;
            }
            else {
                this.getEntry(s, s1, this.R);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                long v = this.P;
                if(v > 0L) {
                    this.getEntry(s, v, this.R);
                    return;
                }
                Event event0 = new Event(Unit.INSTANCE);
                this.z.postValue(event0);
            }
        }
    }

    public final void initBundle(@Nullable Intent intent0) {
        Unit unit1;
        Unit unit0 = null;
        if(intent0 != null) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s = bundle0.getString("EXTRA_BLOG_NAME");
                if(s == null) {
                    unit1 = null;
                }
                else {
                    this.O = s;
                    unit1 = Unit.INSTANCE;
                }
                if(unit1 == null) {
                    Event event0 = new Event(Unit.INSTANCE);
                    this.z.postValue(event0);
                }
                long v = bundle0.getLong("EXTRA_ENTRY_ID", -1L);
                if(v > 0L) {
                    this.P = v;
                }
                ChallengeResult challengeResult0 = (ChallengeResult)bundle0.getParcelable("EXTRA_CHALLENGE_RESULT");
                if(challengeResult0 != null) {
                    Intrinsics.checkNotNull(challengeResult0);
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y1(challengeResult0, this, null), 3, null);
                }
                String s1 = bundle0.getString("EXTRA_SLOGAN");
                this.Q = s1;
                if(this.P < 0L && (s1 == null || s1.length() == 0)) {
                    Event event1 = new Event(Unit.INSTANCE);
                    this.z.postValue(event1);
                }
                this.R = bundle0.getString("EXTRA_ENTRY_PASSWORD");
                this.T = (EntryWayPoint)bundle0.getParcelable("EXTRA_WAYPOINT");
                unit0 = Unit.INSTANCE;
            }
        }
        if(unit0 == null) {
            Event event2 = new Event(Unit.INSTANCE);
            this.z.postValue(event2);
        }
    }

    @NotNull
    public final MutableLiveData isRestrictedEntry() {
        return this.E;
    }

    public final void onClickComment(@Nullable Long long0, @Nullable String s) {
        Unit unit0 = null;
        EntryTiara.INSTANCE.trackClickComment();
        EntryItem entryItem0 = (EntryItem)this.B.getValue();
        if(entryItem0 != null) {
            if(s != null) {
                if(p.isBlank(s)) {
                    s = null;
                }
                if(s != null) {
                    entryItem0.setPassword(s);
                }
            }
            if(entryItem0.getAcceptComment()) {
                GoComment entryViewModel$EntryEvent$GoComment0 = new GoComment(entryItem0, long0);
                LiveDataExtensionKt.postEvent(this.n, entryViewModel$EntryEvent$GoComment0);
                return;
            }
            Long long1 = (Long)this.I.getValue();
            if(long1 != null) {
                Intrinsics.checkNotNull(long1);
                if(((long)long1) <= 0L) {
                    long1 = null;
                }
                if(long1 != null) {
                    GoComment entryViewModel$EntryEvent$GoComment1 = new GoComment(entryItem0, long0);
                    LiveDataExtensionKt.postEvent(this.n, entryViewModel$EntryEvent$GoComment1);
                    unit0 = Unit.INSTANCE;
                }
            }
            if(unit0 == null) {
                Event event0 = new Event(string.label_entry_view_not_accept);
                this.w.setValue(event0);
            }
        }
    }

    public static void onClickComment$default(EntryViewModel entryViewModel0, Long long0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            long0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        entryViewModel0.onClickComment(long0, s);
    }

    public final void onClickDelete() {
        EntryTiara.INSTANCE.trackClickDelete();
        ShowDeleteEntryDialog entryViewModel$EntryDialogEvent$ShowDeleteEntryDialog0 = new ShowDeleteEntryDialog(this.a());
        this.x.sendDialogEvent(entryViewModel$EntryDialogEvent$ShowDeleteEntryDialog0);
    }

    public final void onClickLike() {
        EntryItem entryItem0 = (EntryItem)this.B.getValue();
        Long long0 = null;
        String s = entryItem0 == null ? null : entryItem0.getBlogName();
        EntryItem entryItem1 = (EntryItem)this.B.getValue();
        if(entryItem1 != null) {
            long0 = entryItem1.getId();
        }
        Boolean boolean0 = (Boolean)this.H.getValue();
        if(boolean0 == null) {
            boolean0 = Boolean.FALSE;
        }
        boolean z = boolean0.booleanValue();
        EntryTiara.INSTANCE.trackClickLike(String.valueOf(long0), (s == null ? "" : s), z);
        if(s != null && long0 != null) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new w1(z, this, s, long0, null), 3, null);
        }
    }

    public final void onClickModification() {
        EntryTiara.INSTANCE.trackClickModify();
        EntryItem entryItem0 = (EntryItem)this.B.getValue();
        if(entryItem0 != null) {
            Long long0 = entryItem0.getId();
            if(long0 != null) {
                boolean z = this.a();
                this.x.sendDialogEvent(new ShowModificationDialog((z ? long0.longValue() : null)));
            }
        }
    }

    public final void onClickMoreButton() {
        Integer integer0;
        Boolean boolean0 = (Boolean)this.K.getValue();
        if(boolean0 == null) {
            boolean0 = Boolean.FALSE;
        }
        boolean z = boolean0.booleanValue();
        if(!z) {
            EntryTiara.INSTANCE.trackClickMore();
        }
        this.K.setValue(Boolean.valueOf(!z));
        EntryType entryType0 = (EntryType)this.D.getValue();
        MutableLiveData mutableLiveData0 = this.N;
        int v = 8;
        if(Intrinsics.areEqual((entryType0 == null ? null : entryType0.getType()), "notice")) {
            integer0 = 8;
        }
        else {
            if(Intrinsics.areEqual(this.K.getValue(), Boolean.FALSE)) {
                v = 0;
            }
            integer0 = v;
        }
        mutableLiveData0.setValue(integer0);
    }

    public final void onClickReport() {
        EntryTiara.INSTANCE.trackClickReport();
        EntryItem entryItem0 = (EntryItem)this.B.getValue();
        if(entryItem0 != null) {
            Long long0 = entryItem0.getId();
            if(long0 != null) {
                Event event0 = new Event(long0.longValue());
                this.q.setValue(event0);
            }
        }
    }

    public final void onClickShare() {
        EntryTiara entryTiara0 = EntryTiara.INSTANCE;
        EntryItem entryItem0 = (EntryItem)this.B.getValue();
        String s = null;
        String s1 = String.valueOf((entryItem0 == null ? null : entryItem0.getId()));
        EntryItem entryItem1 = (EntryItem)this.B.getValue();
        if(entryItem1 != null) {
            s = entryItem1.getBlogName();
        }
        entryTiara0.trackClickShare(s1, s);
        EntryItem entryItem2 = (EntryItem)this.B.getValue();
        if(entryItem2 != null) {
            String s2 = entryItem2.getPermalink();
            if(s2 != null) {
                this.p.setValue(new Event(new String[]{(entryItem2.getTitle() == null ? "" : entryItem2.getTitle()), s2}));
            }
        }
    }

    public final void onClickStatistics() {
        EntryTiara.INSTANCE.trackClickStatistics();
        EntryItem entryItem0 = (EntryItem)this.B.getValue();
        if(entryItem0 != null) {
            Event event0 = new Event(entryItem0);
            this.o.setValue(event0);
        }
    }

    public final void onClickUserProfileImage() {
        Event event0 = new Event(this.O);
        this.r.setValue(event0);
    }

    public final void setBlogName(@Nullable String s) {
        this.O = s;
    }

    public final void setLikeSelected(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.H = mutableLiveData0;
    }

    public final void showChallengeSuccessDialog(@NotNull ChallengeResult challengeResult0) {
        Intrinsics.checkNotNullParameter(challengeResult0, "result");
        EntryTiara.INSTANCE.trackPageChallengeSuccess();
        ShowChallengeSuccessDialog entryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog0 = new ShowChallengeSuccessDialog(challengeResult0);
        this.x.sendDialogEvent(entryViewModel$EntryDialogEvent$ShowChallengeSuccessDialog0);
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel
    public void showErrorDialog(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "CAN_NOT_FIND_POST")) {
            ShowCanNotFindPostDialog entryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog0 = new ShowCanNotFindPostDialog(errorModel0);
            this.x.sendDialogEvent(entryViewModel$EntryDialogEvent$ShowCanNotFindPostDialog0);
            return;
        }
        super.showErrorDialog(errorModel0);
    }
}

