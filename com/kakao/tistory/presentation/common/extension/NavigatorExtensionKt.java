package com.kakao.tistory.presentation.common.extension;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.fragment.app.FragmentActivity;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.TistoryMainActivity;
import com.kakao.tistory.presentation.blog.BlogActivity.Companion;
import com.kakao.tistory.presentation.blog.BlogActivity;
import com.kakao.tistory.presentation.common.ActivityCommand;
import com.kakao.tistory.presentation.common.SettingItem;
import com.kakao.tistory.presentation.common.redirect.RedirectData;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import com.kakao.tistory.presentation.main.navigation.MainCommand;
import com.kakao.tistory.presentation.main.navigation.MainNavigationKt;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.view.SplashActivity;
import com.kakao.tistory.presentation.view.accountMigration.AccountMigrationActivity;
import com.kakao.tistory.presentation.view.blog.BlogFollowActivity;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentActivity;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookActivity;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookActivity;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;
import com.kakao.tistory.presentation.view.editor.EditorActivity;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity;
import com.kakao.tistory.presentation.view.exception.TistoryGuideActivity;
import com.kakao.tistory.presentation.view.home.RefererKeywordListActivity;
import com.kakao.tistory.presentation.view.home.RefererLogListActivity;
import com.kakao.tistory.presentation.view.leave.LeaveActivity;
import com.kakao.tistory.presentation.view.leave.LeaveCompleteActivity;
import com.kakao.tistory.presentation.view.login.KakaoLoginActivity;
import com.kakao.tistory.presentation.view.login.TistroyLoginActivity;
import com.kakao.tistory.presentation.view.search.SearchActivity.RedirectDestination;
import com.kakao.tistory.presentation.view.search.SearchActivity;
import com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity;
import com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity;
import com.kakao.tistory.presentation.view.setting.SettingListActivity;
import com.kakao.tistory.presentation.view.setting.SettingPushActivity;
import com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity;
import com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity;
import com.kakao.tistory.presentation.view.signup.SignUpActivity;
import com.kakao.tistory.presentation.view.statistics.RefererEtcListActivity;
import com.kakao.tistory.presentation.view.statistics.StatisticsActivity;
import com.kakao.tistory.presentation.view.toppost.TopPostListActivity;
import com.kakao.tistory.presentation.view.webview.CommonWebViewActivity;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00A8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A#\u0010\t\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\n\u001A\u0019\u0010\u000B\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u000B\u0010\f\u001A\u0019\u0010\t\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\t\u0010\u000F\u001A\u0019\u0010\t\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\t\u0010\u0012\u001A\u001D\u0010\u0014\u001A\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A\'\u0010\u0017\u001A\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0016\u001A\u00020\u00072\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A5\u0010\u001D\u001A\u00020\u0001*\u00020\u00042\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u001B\u0010 \u001A\u00020\u0001*\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b \u0010\f\u001A%\u0010#\u001A\u00020\u0001*\u00020\u00042\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u00052\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b#\u0010$\u001A\'\u0010(\u001A\u00020\u0001*\u00020\u00042\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\b\b\u0002\u0010\'\u001A\u00020\u0007\u00A2\u0006\u0004\b(\u0010)\u001A\u0019\u0010(\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u0005\u00A2\u0006\u0004\b(\u0010\f\u001A\u001D\u0010*\u001A\u00020\u0001*\u00020\u00042\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b*\u0010\f\u001AA\u00100\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u00052\b\u0010,\u001A\u0004\u0018\u00010+2\b\u0010-\u001A\u0004\u0018\u00010\u00052\b\u0010.\u001A\u0004\u0018\u00010\u00052\b\u0010/\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b0\u00101\u001A\u001F\u00105\u001A\u00020\u0001*\u00020\u00042\f\u00104\u001A\b\u0012\u0004\u0012\u00020302\u00A2\u0006\u0004\b5\u00106\u001A;\u00108\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u00052\n\b\u0002\u0010-\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u00107\u001A\u00020\u0007\u00A2\u0006\u0004\b8\u00109\u001A/\u0010=\u001A\u00020\u0001*\u00020\u00002\u0006\u0010&\u001A\u00020%2\b\b\u0002\u0010:\u001A\u00020\u00072\n\b\u0002\u0010<\u001A\u0004\u0018\u00010;\u00A2\u0006\u0004\b=\u0010>\u001AG\u0010=\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u00052\b\u0010,\u001A\u0004\u0018\u00010+2\n\b\u0002\u0010?\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001A\u0004\u0018\u00010@2\n\b\u0002\u0010<\u001A\u0004\u0018\u00010;\u00A2\u0006\u0004\b=\u0010B\u001A+\u0010E\u001A\u00020\u0001*\u00020\u00002\u0006\u0010&\u001A\u00020%2\b\u0010C\u001A\u0004\u0018\u00010+2\u0006\u0010D\u001A\u00020;\u00A2\u0006\u0004\bE\u0010F\u001A!\u0010G\u001A\u00020\u0001*\u00020\u00002\u0006\u0010&\u001A\u00020%2\u0006\u0010D\u001A\u00020;\u00A2\u0006\u0004\bG\u0010H\u001A\u0019\u0010K\u001A\u00020\u0001*\u00020\u00042\u0006\u0010J\u001A\u00020I\u00A2\u0006\u0004\bK\u0010L\u001A!\u0010M\u001A\u00020\u0001*\u00020\u00002\u0006\u0010J\u001A\u00020I2\u0006\u0010D\u001A\u00020;\u00A2\u0006\u0004\bM\u0010N\u001AA\u0010P\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u00052\b\b\u0002\u0010O\u001A\u00020\u00072\b\u0010,\u001A\u0004\u0018\u00010+2\n\b\u0002\u0010?\u001A\u0004\u0018\u00010\u00052\u0006\u0010D\u001A\u00020;\u00A2\u0006\u0004\bP\u0010Q\u001A\u0011\u0010R\u001A\u00020\u0001*\u00020\u0004\u00A2\u0006\u0004\bR\u0010S\u001A\u0011\u0010T\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0004\bT\u0010\u0003\u001A\u0011\u0010U\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0004\bU\u0010\u0003\u001A\u0011\u0010V\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0004\bV\u0010\u0003\u001A\u0011\u0010W\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0004\bW\u0010\u0003\u001A7\u0010]\u001A\u00020\u0001*\u00020\u00042\u0006\u0010Y\u001A\u00020X2\b\b\u0002\u0010Z\u001A\u00020\u00072\b\b\u0002\u0010[\u001A\u00020\u00072\b\b\u0002\u0010\\\u001A\u00020\u0007\u00A2\u0006\u0004\b]\u0010^\u001AA\u0010]\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010Z\u001A\u00020\u00072\b\b\u0002\u0010[\u001A\u00020\u00072\b\b\u0002\u0010\\\u001A\u00020\u00072\b\b\u0002\u0010_\u001A\u00020\u0007\u00A2\u0006\u0004\b]\u0010`\u001AU\u0010]\u001A\u00020\u0001*\u000E\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0a2\u0006\u0010d\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010Z\u001A\u00020\u00072\b\b\u0002\u0010[\u001A\u00020\u00072\b\b\u0002\u0010\\\u001A\u00020\u00072\b\b\u0002\u0010_\u001A\u00020\u0007\u00A2\u0006\u0004\b]\u0010e\u001A\u0019\u0010\b\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\b\u0010\f\u001A\u0019\u0010f\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\bf\u0010\f\u001A!\u0010i\u001A\u00020\u0001*\u00020\u00042\u0006\u0010g\u001A\u00020\u00052\u0006\u0010h\u001A\u00020\u0005\u00A2\u0006\u0004\bi\u0010j\u001A\u001B\u0010l\u001A\u00020\u0001*\u00020\u00002\b\b\u0002\u0010k\u001A\u00020\u0005\u00A2\u0006\u0004\bl\u0010\u0015\u001A5\u0010o\u001A\u00020\u0001*\u00020\u00002\n\b\u0002\u0010m\u001A\u0004\u0018\u00010+2\b\b\u0002\u0010n\u001A\u00020\u00072\n\b\u0002\u0010D\u001A\u0004\u0018\u00010;H\u0007\u00A2\u0006\u0004\bo\u0010p\u001A-\u0010q\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010,\u001A\u00020+2\n\b\u0002\u0010D\u001A\u0004\u0018\u00010;\u00A2\u0006\u0004\bq\u0010r\u001A\u001B\u0010o\u001A\u00020\u0001*\u00020\u00042\b\b\u0002\u0010n\u001A\u00020\u0007\u00A2\u0006\u0004\bo\u0010s\u001A5\u0010w\u001A\u00020\u0001*\u00020\u00042\n\b\u0002\u0010t\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010v\u001A\u0004\u0018\u00010u\u00A2\u0006\u0004\bw\u0010x\u001A%\u0010{\u001A\u00020\u0001*\u00020\u00002\u0006\u0010z\u001A\u00020y2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b{\u0010|\u001A!\u0010~\u001A\u00020\u0001*\u00020\u00002\u0006\u0010}\u001A\u00020\u00052\u0006\u0010D\u001A\u00020;\u00A2\u0006\u0004\b~\u0010\u007F\u001A!\u0010\u0081\u0001\u001A\u00020\u0001*\u00020\u00042\u000B\b\u0002\u0010\u0080\u0001\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001AM\u0010\u0088\u0001\u001A\u00020\u0001*\u00020\u00002\f\b\u0002\u0010\u0084\u0001\u001A\u0005\u0018\u00010\u0083\u00012\u000B\b\u0002\u0010\u0085\u0001\u001A\u0004\u0018\u00010\u00052\t\b\u0002\u0010\u0086\u0001\u001A\u00020\u00072\u0011\b\u0002\u0010\u0087\u0001\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u000102\u00A2\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001A\u0013\u0010\u008A\u0001\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0005\b\u008A\u0001\u0010\u0003\u001A\u0013\u0010\u008B\u0001\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0005\b\u008B\u0001\u0010\u0003\u001A\u0013\u0010\u008C\u0001\u001A\u00020\u0001*\u00020\u0000\u00A2\u0006\u0005\b\u008C\u0001\u0010\u0003\"\u0017\u0010\u008D\u0001\u001A\u00020\u00058\u0006X\u0086T\u00A2\u0006\b\n\u0006\b\u008D\u0001\u0010\u008E\u0001\u00A8\u0006\u008F\u0001"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "", "goToSplash", "(Landroidx/fragment/app/FragmentActivity;)V", "Landroid/content/Context;", "", "url", "", "goToBrowser", "goToRedirect", "(Landroid/content/Context;Ljava/lang/String;Z)V", "goToRedirectInternally", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/kakao/tistory/presentation/common/redirect/RedirectData;", "redirectData", "(Landroid/content/Context;Lcom/kakao/tistory/presentation/common/redirect/RedirectData;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Context;Landroid/content/Intent;)V", "redirectUrl", "goToKakaoLogin", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V", "forceTransfer", "goToTistoryLogin", "(Landroidx/fragment/app/FragmentActivity;ZLjava/lang/String;)V", "Lcom/kakao/tistory/presentation/common/ActivityCommand;", "activityCommand", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand;", "mainCommand", "goToMain", "(Landroid/content/Context;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/ActivityCommand;Lcom/kakao/tistory/presentation/main/navigation/MainCommand;)V", "blogName", "goToBlogTop", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "type", "goToBlogFollow", "(Landroid/content/Context;Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;)V", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "toTop", "goToStatistics", "(Landroid/content/Context;Lcom/kakao/tistory/domain/entity/entry/EntryItem;Z)V", "goToRefererLog", "", "entryId", "date", "granularity", "metric", "goToRefererEtc", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "refKeywordList", "goToRefererKeyword", "(Landroid/content/Context;Ljava/util/List;)V", "isMine", "goToTopPost", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "hasBlogRoleType", "", "flag", "goToEntryView", "(Landroidx/fragment/app/FragmentActivity;Lcom/kakao/tistory/domain/entity/entry/EntryItem;ZLjava/lang/Integer;)V", "password", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "challengeResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;Ljava/lang/Integer;)V", "commentId", "requestCode", "goToComment", "(Landroidx/fragment/app/FragmentActivity;Lcom/kakao/tistory/domain/entity/entry/EntryItem;Ljava/lang/Long;I)V", "goToPinComment", "(Landroidx/fragment/app/FragmentActivity;Lcom/kakao/tistory/domain/entity/entry/EntryItem;I)V", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "goToGuestbook", "(Landroid/content/Context;Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)V", "goToPinGuestBook", "(Landroidx/fragment/app/FragmentActivity;Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;I)V", "isOwner", "goToDonation", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;I)V", "goToSetting", "(Landroid/content/Context;)V", "goToSettingDefaultBlog", "goToSettingPush", "goToSettingNotice", "goToSettingAppInfo", "Lcom/kakao/tistory/presentation/common/SettingItem;", "settingItem", "appBarEnabled", "bottomBarEnabled", "isOpenFromRight", "goToWebView", "(Landroid/content/Context;Lcom/kakao/tistory/presentation/common/SettingItem;ZZZ)V", "checkSession", "(Landroid/content/Context;Ljava/lang/String;ZZZZ)V", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "context", "(Landroidx/activity/compose/ManagedActivityResultLauncher;Landroid/content/Context;Ljava/lang/String;ZZZZ)V", "goToExternal", "subject", "text", "goToShareIntent", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "packageName", "goToGooglePlay", "postId", "openLatestEdit", "goToEditor", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/Long;ZLjava/lang/Integer;)V", "goToEntryEditor", "(Landroid/content/Context;Ljava/lang/String;JLjava/lang/Integer;)V", "(Landroid/content/Context;Z)V", "searchKeyword", "Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;", "destination", "goToSearch", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;)V", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;", "guideType", "goToGuide", "(Landroidx/fragment/app/FragmentActivity;Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;Ljava/lang/String;)V", "title", "goToChooser", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;I)V", "needRemoveAppSession", "goToAccountMigration", "(Landroid/content/Context;Ljava/lang/Boolean;)V", "Lcom/kakao/sdk/auth/model/OAuthToken;", "token", "email", "isSignUpEnable", "duplicatedEmails", "goToSignUp", "(Landroidx/fragment/app/FragmentActivity;Lcom/kakao/sdk/auth/model/OAuthToken;Ljava/lang/String;ZLjava/util/List;)V", "goToLeave", "goToLeaveComplete", "goToSecretLab", "PACKAGE_NAME", "Ljava/lang/String;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigatorExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorExtension.kt\ncom/kakao/tistory/presentation/common/extension/NavigatorExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,464:1\n1#2:465\n*E\n"})
public final class NavigatorExtensionKt {
    @NotNull
    public static final String PACKAGE_NAME = "net.daum.android.tistoryapp";

    public static Intent a(Intent intent0) {
        intent0.putExtra("isRightEnterAnim", true);
        return intent0;
    }

    public static final void goToAccountMigration(@NotNull Context context0, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intent intent0 = new Intent(context0, AccountMigrationActivity.class);
        intent0.putExtra("EXTRA_NEED_REMOVE_APP_SESSION", boolean0);
        context0.startActivity(intent0);
    }

    public static void goToAccountMigration$default(Context context0, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = Boolean.FALSE;
        }
        NavigatorExtensionKt.goToAccountMigration(context0, boolean0);
    }

    public static final void goToBlogFollow(@NotNull Context context0, @Nullable String s, @NotNull Type blogFollowViewModel$Type0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(blogFollowViewModel$Type0, "type");
        context0.startActivity(NavigatorExtensionKt.a(BlogFollowActivity.Companion.createIntent(context0, s, blogFollowViewModel$Type0)));
    }

    public static void goToBlogFollow$default(Context context0, String s, Type blogFollowViewModel$Type0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        NavigatorExtensionKt.goToBlogFollow(context0, s, blogFollowViewModel$Type0);
    }

    public static final void goToBlogTop(@NotNull Context context0, @Nullable String s) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(context0, "<this>");
        if(s == null) {
            unit0 = null;
        }
        else {
            context0.startActivity(NavigatorExtensionKt.a(Companion.createIntent$default(BlogActivity.Companion, context0, s, false, 4, null)));
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            String s1 = context0.getString(string.label_default_blog_empty);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            ToastUtils.show$default(ToastUtils.INSTANCE, context0, s1, 0, 0, 12, null);
        }
    }

    public static final void goToBrowser(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "url");
        if(UrlUtils.INSTANCE.isUrl(s)) {
            context0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        }
    }

    public static final void goToChooser(@NotNull FragmentActivity fragmentActivity0, @NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(s, "title");
        Intent intent0 = new Intent();
        intent0.setAction("android.intent.action.GET_CONTENT");
        intent0.addCategory("android.intent.category.OPENABLE");
        intent0.setType("*/*");
        Intent intent1 = Intent.createChooser(intent0, s);
        Intrinsics.checkNotNullExpressionValue(intent1, "createChooser(...)");
        fragmentActivity0.startActivityForResult(intent1, v);
    }

    public static final void goToComment(@NotNull FragmentActivity fragmentActivity0, @NotNull EntryItem entryItem0, @Nullable Long long0, int v) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        Intent intent0 = new Intent(fragmentActivity0, PostCommentActivity.class);
        intent0.putExtra("EXTRA_ENTRY_ITEM", entryItem0);
        intent0.putExtra("EXTRA_COMMENT_ID", long0);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivityForResult(intent0, v);
    }

    public static final void goToDonation(@NotNull FragmentActivity fragmentActivity0, @NotNull String s, boolean z, @Nullable Long long0, @Nullable String s1, int v) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(s, "blogName");
    }

    public static void goToDonation$default(FragmentActivity fragmentActivity0, String s, boolean z, Long long0, String s1, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 8) != 0) {
            s1 = null;
        }
        NavigatorExtensionKt.goToDonation(fragmentActivity0, s, z, long0, s1, v);
    }

    public static final void goToEditor(@NotNull Context context0, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        context0.startActivity(com.kakao.tistory.presentation.view.editor.EditorActivity.Companion.createIntent$default(EditorActivity.Companion, context0, z, null, null, 12, null));
    }

    @Deprecated(message = "Use goToEntryEditor instead")
    public static final void goToEditor(@NotNull FragmentActivity fragmentActivity0, @Nullable Long long0, boolean z, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = com.kakao.tistory.presentation.view.editor.EditorActivity.Companion.createIntent$default(EditorActivity.Companion, fragmentActivity0, z, long0, null, 8, null);
        if(integer0 != null) {
            fragmentActivity0.startActivityForResult(intent0, ((int)integer0));
            return;
        }
        fragmentActivity0.startActivity(intent0);
    }

    public static void goToEditor$default(Context context0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        NavigatorExtensionKt.goToEditor(context0, z);
    }

    public static void goToEditor$default(FragmentActivity fragmentActivity0, Long long0, boolean z, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            long0 = null;
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        NavigatorExtensionKt.goToEditor(fragmentActivity0, long0, z, integer0);
    }

    public static final void goToEntryEditor(@NotNull Context context0, @NotNull String s, long v, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intent intent0 = com.kakao.tistory.presentation.view.editor.EditorActivity.Companion.createIntent$default(EditorActivity.Companion, context0, false, v, s, 2, null);
        if(integer0 != null && context0 instanceof Activity) {
            ((Activity)context0).startActivityForResult(intent0, ((int)integer0));
            return;
        }
        context0.startActivity(intent0);
    }

    public static void goToEntryEditor$default(Context context0, String s, long v, Integer integer0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            integer0 = null;
        }
        NavigatorExtensionKt.goToEntryEditor(context0, s, v, integer0);
    }

    public static final void goToEntryView(@NotNull Context context0, @NotNull String s, @Nullable Long long0, @Nullable String s1, @Nullable ChallengeResult challengeResult0, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intent intent0 = com.kakao.tistory.presentation.view.entry.EntryViewActivity.Companion.createIntent$default(EntryViewActivity.Companion, context0, s, long0, null, s1, challengeResult0, null, 72, null);
        if(integer0 != null) {
            intent0.addFlags(integer0.intValue());
        }
        context0.startActivity(NavigatorExtensionKt.a(intent0));
    }

    public static final void goToEntryView(@NotNull FragmentActivity fragmentActivity0, @NotNull EntryItem entryItem0, boolean z, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        String s = entryItem0.getBlogName();
        if(s != null) {
            Long long0 = entryItem0.getId();
            if(long0 != null) {
                long v = long0.longValue();
                if(z) {
                    NavigatorExtensionKt.goToEntryView(fragmentActivity0, s, v, entryItem0.getPassword(), null, integer0);
                    return;
                }
                if(Intrinsics.areEqual(entryItem0.getVisibility(), "protected")) {
                    EntryPasswordDialogFragment entryPasswordDialogFragment0 = EntryPasswordDialogFragment.Companion.newInstance(s, v);
                    entryPasswordDialogFragment0.setOnClickOkCallback(new i(fragmentActivity0, s, v, integer0));
                    entryPasswordDialogFragment0.show(fragmentActivity0.getSupportFragmentManager(), fragmentActivity0.getClass().getSimpleName());
                    return;
                }
                NavigatorExtensionKt.goToEntryView(fragmentActivity0, s, v, entryItem0.getPassword(), null, integer0);
            }
        }
    }

    public static void goToEntryView$default(Context context0, String s, Long long0, String s1, ChallengeResult challengeResult0, Integer integer0, int v, Object object0) {
        NavigatorExtensionKt.goToEntryView(context0, s, long0, ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? challengeResult0 : null), ((v & 16) == 0 ? integer0 : null));
    }

    public static void goToEntryView$default(FragmentActivity fragmentActivity0, EntryItem entryItem0, boolean z, Integer integer0, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        NavigatorExtensionKt.goToEntryView(fragmentActivity0, entryItem0, z, integer0);
    }

    public static final void goToExternal(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "url");
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if(intent0.resolveActivity(context0.getPackageManager()) != null) {
            context0.startActivity(intent0);
        }
    }

    public static final void goToGooglePlay(@NotNull FragmentActivity fragmentActivity0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(s, "packageName");
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse(("market://details?id=" + s)));
        fragmentActivity0.startActivity(intent0);
    }

    public static void goToGooglePlay$default(FragmentActivity fragmentActivity0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "net.daum.android.tistoryapp";
        }
        NavigatorExtensionKt.goToGooglePlay(fragmentActivity0, s);
    }

    public static final void goToGuestbook(@NotNull Context context0, @NotNull GuestbookExtra guestbookExtra0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
        Intent intent0 = new Intent(context0, GuestbookActivity.class);
        intent0.putExtra("EXTRA_GUESTBOOK", guestbookExtra0);
        intent0.putExtra("isRightEnterAnim", true);
        context0.startActivity(intent0);
    }

    public static final void goToGuide(@NotNull FragmentActivity fragmentActivity0, @NotNull GuideType tistoryGuideViewModel$GuideType0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(tistoryGuideViewModel$GuideType0, "guideType");
        Intent intent0 = new Intent(fragmentActivity0, TistoryGuideActivity.class);
        intent0.putExtra("BUNDLE_GUIDE_TYPE", tistoryGuideViewModel$GuideType0);
        intent0.putExtra("BUNDLE_REDIRECT_URL", s);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static void goToGuide$default(FragmentActivity fragmentActivity0, GuideType tistoryGuideViewModel$GuideType0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        NavigatorExtensionKt.goToGuide(fragmentActivity0, tistoryGuideViewModel$GuideType0, s);
    }

    public static final void goToKakaoLogin(@NotNull FragmentActivity fragmentActivity0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, KakaoLoginActivity.class);
        if(s != null) {
            intent0.setData(Uri.parse(s));
        }
        fragmentActivity0.startActivity(intent0);
    }

    public static void goToKakaoLogin$default(FragmentActivity fragmentActivity0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        NavigatorExtensionKt.goToKakaoLogin(fragmentActivity0, s);
    }

    public static final void goToLeave(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, LeaveActivity.class);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static final void goToLeaveComplete(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        fragmentActivity0.startActivity(new Intent(fragmentActivity0, LeaveCompleteActivity.class));
    }

    public static final void goToMain(@NotNull Context context0, @Nullable String s, @Nullable ActivityCommand activityCommand0, @Nullable MainCommand mainCommand0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        context0.startActivity(MainNavigationKt.createIntent(TistoryMainActivity.Companion, context0, s, activityCommand0, mainCommand0));
    }

    public static void goToMain$default(Context context0, String s, ActivityCommand activityCommand0, MainCommand mainCommand0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            activityCommand0 = null;
        }
        if((v & 4) != 0) {
            mainCommand0 = null;
        }
        NavigatorExtensionKt.goToMain(context0, s, activityCommand0, mainCommand0);
    }

    public static final void goToPinComment(@NotNull FragmentActivity fragmentActivity0, @NotNull EntryItem entryItem0, int v) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        Intent intent0 = new Intent(fragmentActivity0, PostPinCommentActivity.class);
        intent0.putExtra("EXTRA_ENTRY_ITEM", entryItem0);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivityForResult(intent0, v);
    }

    public static final void goToPinGuestBook(@NotNull FragmentActivity fragmentActivity0, @NotNull GuestbookExtra guestbookExtra0, int v) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
        Intent intent0 = new Intent(fragmentActivity0, PinGuestbookActivity.class);
        intent0.putExtra("EXTRA_GUESTBOOK", guestbookExtra0);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivityForResult(intent0, v);
    }

    public static final void goToRedirect(@NotNull Context context0, @NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(intent0, "intent");
        context0.startActivity(NavigatorExtensionKt.a(intent0));
    }

    public static final void goToRedirect(@NotNull Context context0, @NotNull RedirectData redirectData0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(redirectData0, "redirectData");
        RedirectUtils.INSTANCE.goToDestination(context0, redirectData0);
    }

    public static final void goToRedirect(@NotNull Context context0, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "url");
        if(z) {
            NavigatorExtensionKt.goToRedirect(context0, new RedirectData(s, null, null, null, null, null, com.kakao.tistory.presentation.common.redirect.RedirectUtils.Type.EXTERNAL, 62, null));
            return;
        }
        RedirectUtils.goToDestination$default(RedirectUtils.INSTANCE, context0, s, false, 4, null);
    }

    public static void goToRedirect$default(Context context0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        NavigatorExtensionKt.goToRedirect(context0, s, z);
    }

    public static final void goToRedirectInternally(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "url");
        RedirectUtils.INSTANCE.goToDestination(context0, s, true);
    }

    public static final void goToRefererEtc(@NotNull Context context0, @NotNull String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intent intent0 = new Intent(context0, RefererEtcListActivity.class);
        intent0.putExtra("EXTRA_REFERER_ETC_BLOG_NAME", s);
        intent0.putExtra("EXTRA_REFERER_ETC_ENTRY_ID", long0);
        intent0.putExtra("EXTRA_REFERER_ETC_DATE", s1);
        intent0.putExtra("EXTRA_REFERER_ETC_GRANULARITY", s2);
        intent0.putExtra("EXTRA_REFERER_ETC_METRICS", s3);
        intent0.putExtra("isRightEnterAnim", true);
        context0.startActivity(intent0);
    }

    public static final void goToRefererKeyword(@NotNull Context context0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "refKeywordList");
        Intent intent0 = new Intent(context0, RefererKeywordListActivity.class);
        intent0.putParcelableArrayListExtra("EXTRA_REFERER_KEYWORD_LIST", new ArrayList(list0));
        context0.startActivity(intent0);
    }

    public static final void goToRefererLog(@NotNull Context context0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intent intent0 = new Intent(context0, RefererLogListActivity.class);
        intent0.putExtra("EXTRA_BLOG_NAME", s);
        context0.startActivity(intent0);
    }

    public static void goToRefererLog$default(Context context0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        NavigatorExtensionKt.goToRefererLog(context0, s);
    }

    public static final void goToSearch(@NotNull Context context0, @Nullable String s, @Nullable String s1, @Nullable RedirectDestination searchActivity$RedirectDestination0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        context0.startActivity(NavigatorExtensionKt.a(SearchActivity.Companion.createIntent(context0, s, s1, searchActivity$RedirectDestination0)));
    }

    public static void goToSearch$default(Context context0, String s, String s1, RedirectDestination searchActivity$RedirectDestination0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            searchActivity$RedirectDestination0 = null;
        }
        NavigatorExtensionKt.goToSearch(context0, s, s1, searchActivity$RedirectDestination0);
    }

    public static final void goToSecretLab(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        fragmentActivity0.startActivity(new Intent(fragmentActivity0, SecretLabActivity.class));
    }

    public static final void goToSetting(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intent intent0 = new Intent(context0, SettingListActivity.class);
        intent0.putExtra("isRightEnterAnim", true);
        context0.startActivity(intent0);
    }

    public static final void goToSettingAppInfo(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, SettingAppInfoActivity.class);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static final void goToSettingDefaultBlog(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, SettingDefaultBlogActivity.class);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static final void goToSettingNotice(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, SettingNoticeListActivity.class);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static final void goToSettingPush(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, SettingPushActivity.class);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static final void goToShareIntent(@NotNull Context context0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "subject");
        Intrinsics.checkNotNullParameter(s1, "text");
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType("text/plain");
        intent0.putExtra("android.intent.extra.SUBJECT", s);
        intent0.putExtra("android.intent.extra.TITLE", s);
        intent0.putExtra("android.intent.extra.TEXT", s1);
        if(intent0.resolveActivity(context0.getPackageManager()) != null) {
            context0.startActivity(Intent.createChooser(intent0, context0.getString(string.label_entry_view_share)));
        }
    }

    public static final void goToSignUp(@NotNull FragmentActivity fragmentActivity0, @Nullable OAuthToken oAuthToken0, @Nullable String s, boolean z, @Nullable List list0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        fragmentActivity0.startActivity(SignUpActivity.Companion.createIntent(fragmentActivity0, oAuthToken0, s, z, list0));
    }

    public static void goToSignUp$default(FragmentActivity fragmentActivity0, OAuthToken oAuthToken0, String s, boolean z, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            oAuthToken0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            list0 = null;
        }
        NavigatorExtensionKt.goToSignUp(fragmentActivity0, oAuthToken0, s, z, list0);
    }

    public static final void goToSplash(@NotNull FragmentActivity fragmentActivity0) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        fragmentActivity0.startActivity(new Intent(fragmentActivity0, SplashActivity.class));
        fragmentActivity0.finishAffinity();
    }

    public static final void goToStatistics(@NotNull Context context0, @Nullable EntryItem entryItem0, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intent intent0 = new Intent(context0, StatisticsActivity.class);
        intent0.putExtra("EXTRA_ENTRY_ID", entryItem0);
        intent0.putExtra("EXTRA_FROM_ARTICLE", z);
        intent0.putExtra("isRightEnterAnim", z);
        context0.startActivity(intent0);
    }

    public static final void goToStatistics(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intent intent0 = new Intent(context0, StatisticsActivity.class);
        intent0.putExtra("EXTRA_BLOG_NAME", s);
        intent0.putExtra("isRightEnterAnim", false);
        context0.startActivity(intent0);
    }

    public static void goToStatistics$default(Context context0, EntryItem entryItem0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            entryItem0 = null;
        }
        if((v & 2) != 0) {
            z = false;
        }
        NavigatorExtensionKt.goToStatistics(context0, entryItem0, z);
    }

    public static final void goToTistoryLogin(@NotNull FragmentActivity fragmentActivity0, boolean z, @Nullable String s) {
        Intrinsics.checkNotNullParameter(fragmentActivity0, "<this>");
        Intent intent0 = new Intent(fragmentActivity0, TistroyLoginActivity.class);
        if(s != null) {
            intent0.setData(Uri.parse(s));
        }
        intent0.putExtra("EXTRA_FORCE_TRANSFER", z);
        intent0.putExtra("isRightEnterAnim", true);
        fragmentActivity0.startActivity(intent0);
    }

    public static void goToTistoryLogin$default(FragmentActivity fragmentActivity0, boolean z, String s, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            s = null;
        }
        NavigatorExtensionKt.goToTistoryLogin(fragmentActivity0, z, s);
    }

    public static final void goToTopPost(@NotNull Context context0, @NotNull String s, @Nullable String s1, @Nullable String s2, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intent intent0 = new Intent(context0, TopPostListActivity.class);
        intent0.putExtra("EXTRA_TOP_POST_BLOG_NAME", s);
        intent0.putExtra("EXTRA_TOP_POST_DATE", s1);
        intent0.putExtra("EXTRA_TOP_POST_GRANULARITY", s2);
        intent0.putExtra("EXTRA_IS_MINE", z);
        intent0.putExtra("isRightEnterAnim", true);
        context0.startActivity(intent0);
    }

    public static void goToTopPost$default(Context context0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            z = false;
        }
        NavigatorExtensionKt.goToTopPost(context0, s, s1, s2, z);
    }

    public static final void goToWebView(@NotNull Context context0, @NotNull SettingItem settingItem0, boolean z, boolean z1, boolean z2) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(settingItem0, "settingItem");
        Intent intent0 = new Intent(context0, CommonWebViewActivity.class);
        intent0.putExtra("EXTRA_WEB_VIEW_SETTING_ITEM", settingItem0);
        intent0.putExtra("EXTRA_WEB_VIEW_APP_BAR_ENABLED", z);
        intent0.putExtra("EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED", z1);
        intent0.putExtra("isRightEnterAnim", z2);
        context0.startActivity(intent0);
    }

    public static final void goToWebView(@NotNull Context context0, @NotNull String s, boolean z, boolean z1, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "url");
        Intent intent0 = new Intent(context0, CommonWebViewActivity.class);
        intent0.putExtra("EXTRA_WEB_VIEW_URL", s);
        intent0.putExtra("EXTRA_WEB_VIEW_APP_BAR_ENABLED", z);
        intent0.putExtra("EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED", z1);
        intent0.putExtra("EXTRA_WEB_VIEW_CHECK_SESSION", z3);
        intent0.putExtra("isRightEnterAnim", z2);
        context0.startActivity(intent0);
    }

    public static final void goToWebView(@NotNull ManagedActivityResultLauncher managedActivityResultLauncher0, @NotNull Context context0, @NotNull String s, boolean z, boolean z1, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "url");
        Intent intent0 = new Intent(context0, CommonWebViewActivity.class);
        intent0.putExtra("EXTRA_WEB_VIEW_URL", s);
        intent0.putExtra("EXTRA_WEB_VIEW_APP_BAR_ENABLED", z);
        intent0.putExtra("EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED", z1);
        intent0.putExtra("EXTRA_WEB_VIEW_CHECK_SESSION", z3);
        intent0.putExtra("isRightEnterAnim", z2);
        PendingIntent pendingIntent0 = PendingIntent.getActivity(context0, 0, intent0, 0xC000000);
        Intrinsics.checkNotNull(pendingIntent0);
        managedActivityResultLauncher0.launch(new Builder(pendingIntent0).build());
    }

    public static void goToWebView$default(Context context0, SettingItem settingItem0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        if((v & 8) != 0) {
            z2 = false;
        }
        NavigatorExtensionKt.goToWebView(context0, settingItem0, z, z1, z2);
    }

    public static void goToWebView$default(Context context0, String s, boolean z, boolean z1, boolean z2, boolean z3, int v, Object object0) {
        NavigatorExtensionKt.goToWebView(context0, s, ((v & 2) == 0 ? z : false), ((v & 4) == 0 ? z1 : true), ((v & 8) == 0 ? z2 : false), ((v & 16) == 0 ? z3 : true));
    }

    public static void goToWebView$default(ManagedActivityResultLauncher managedActivityResultLauncher0, Context context0, String s, boolean z, boolean z1, boolean z2, boolean z3, int v, Object object0) {
        NavigatorExtensionKt.goToWebView(managedActivityResultLauncher0, context0, s, ((v & 4) == 0 ? z : false), ((v & 8) == 0 ? z1 : true), ((v & 16) == 0 ? z2 : false), ((v & 0x20) == 0 ? z3 : true));
    }
}

