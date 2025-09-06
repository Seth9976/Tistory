package com.kakao.tistory.presentation.view.entry;

import a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Base64;
import android.util.LongSparseArray;
import android.webkit.CookieManager;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.ActionBar;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.ViewModelLazy;
import com.google.gson.Gson;
import com.kakao.android.base.tiara.TiaraActionKind;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity;
import com.kakao.tistory.presentation.view.webview.EntryWebView;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import e;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.parcelize.Parcelize;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraActionKind(actionKind = ActionKind.ViewContent)
@TiaraPage(page = "글뷰")
@TiaraSection(section = "글뷰")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u0001:\u000267B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017\u00A2\u0006\u0004\b\u000B\u0010\fJ\'\u0010\u000F\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00060\rH\u0007\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u000F\u0010\u0015\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u000F\u0010\u0016\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0012J\u000F\u0010\u0017\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0012J\u0013\u0010\u0019\u001A\u00020\u0006*\u00020\u0018H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001AJ=\u0010 \u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0001\u0010\u001C\u001A\u00020\u001B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00060\rH\u0007\u00A2\u0006\u0004\b \u0010!J\u0017\u0010$\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\"H\u0014\u00A2\u0006\u0004\b$\u0010%J)\u0010)\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u001B2\u0006\u0010\'\u001A\u00020\u001B2\b\u0010(\u001A\u0004\u0018\u00010\"H\u0014\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b+\u0010\u0003J\u0017\u0010.\u001A\u00020\u00062\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b.\u0010/R\u001A\u00105\u001A\u0002008\u0016X\u0096D\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104\u00A8\u0006G\u00B2\u0006\u0014\u00109\u001A\n 8*\u0004\u0018\u000100008\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010:\u001A\u0002008\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010;\u001A\u00020\u001B8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010<\u001A\u0002008\n@\nX\u008A\u008E\u0002\u00B2\u0006\u0014\u0010=\u001A\n 8*\u0004\u0018\u000100008\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010>\u001A\u0002008\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010?\u001A\u0002008\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010A\u001A\u00020@8\nX\u008A\u0084\u0002\u00B2\u0006\u0014\u0010B\u001A\n 8*\u0004\u0018\u000100008\nX\u008A\u0084\u0002\u00B2\u0006\u0014\u0010D\u001A\n 8*\u0004\u0018\u00010C0C8\nX\u008A\u0084\u0002\u00B2\u0006\u0014\u0010E\u001A\n 8*\u0004\u0018\u00010C0C8\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010F\u001A\u0004\u0018\u00010\u001B8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onPageLoadFinished", "WebView", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EntryDialogHandler", "(Landroidx/compose/runtime/Composer;I)V", "BottomBar", "ReaderMoreButtonGroup", "WriterMoreButtonGroup", "LikeButton", "CommentButton", "Landroidx/compose/foundation/layout/RowScope;", "DefaultButtonGroup", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "", "src", "", "contentDescription", "onClick", "DefaultIconButton", "(Landroidx/compose/ui/Modifier;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "", "s", "Z", "getProfileEnabled", "()Z", "profileEnabled", "Companion", "EntryWayPoint", "kotlin.jvm.PlatformType", "isRestrictedEntry", "isRefreshing", "currentScrollY", "enabledScroll", "moreSelected", "showMoreOthersBottomGroup", "showMoreMineBottomGroup", "", "moreButtonRotateAnimation", "isLiked", "", "likeCount", "commentCount", "commentVisibility", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryViewActivity.kt\ncom/kakao/tistory/presentation/view/entry/EntryViewActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 14 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,757:1\n10#2,2:758\n1#3:760\n1#3:1084\n75#4,13:761\n1223#5,6:774\n1223#5,6:780\n1223#5,3:791\n1226#5,3:797\n1223#5,6:801\n1223#5,6:807\n1223#5,6:981\n1223#5,6:1028\n1223#5,6:1078\n488#6:786\n487#6,4:787\n491#6,2:794\n495#6:800\n487#7:796\n85#8:813\n82#8,6:814\n88#8:848\n92#8:893\n85#8:894\n81#8,7:895\n88#8:930\n92#8:977\n78#9,6:820\n85#9,4:835\n89#9,2:845\n78#9,6:856\n85#9,4:871\n89#9,2:881\n93#9:887\n93#9:892\n78#9,6:902\n85#9,4:917\n89#9,2:927\n78#9,6:941\n85#9,4:956\n89#9,2:966\n93#9:972\n93#9:976\n78#9,6:994\n85#9,4:1009\n89#9,2:1019\n93#9:1026\n78#9,6:1041\n85#9,4:1056\n89#9,2:1066\n93#9:1073\n368#10,9:826\n377#10:847\n368#10,9:862\n377#10:883\n378#10,2:885\n378#10,2:890\n368#10,9:908\n377#10:929\n368#10,9:947\n377#10:968\n378#10,2:970\n378#10,2:974\n368#10,9:1000\n377#10:1021\n378#10,2:1024\n368#10,9:1047\n377#10:1068\n378#10,2:1071\n4032#11,6:839\n4032#11,6:875\n4032#11,6:921\n4032#11,6:960\n4032#11,6:1013\n4032#11,6:1060\n71#12:849\n68#12,6:850\n74#12:884\n78#12:888\n148#13:889\n158#13:931\n148#13:932\n148#13:933\n148#13:978\n148#13:979\n148#13:980\n148#13:1023\n148#13:1070\n158#13:1075\n148#13:1076\n148#13:1077\n98#14:934\n95#14,6:935\n101#14:969\n105#14:973\n98#14:987\n95#14,6:988\n101#14:1022\n105#14:1027\n98#14:1034\n95#14,6:1035\n101#14:1069\n105#14:1074\n81#15:1085\n107#15,2:1086\n81#15:1088\n107#15,2:1089\n81#15:1091\n81#15:1092\n81#15:1093\n81#15:1094\n81#15:1095\n81#15:1096\n81#15:1097\n81#15:1098\n*S KotlinDebug\n*F\n+ 1 EntryViewActivity.kt\ncom/kakao/tistory/presentation/view/entry/EntryViewActivity\n*L\n133#1:758,2\n133#1:760\n133#1:761,13\n180#1:774,6\n181#1:780,6\n183#1:791,3\n183#1:797,3\n184#1:801,6\n185#1:807,6\n440#1:981,6\n469#1:1028,6\n517#1:1078,6\n183#1:786\n183#1:787,4\n183#1:794,2\n183#1:800\n183#1:796\n191#1:813\n191#1:814,6\n191#1:848\n191#1:893\n350#1:894\n350#1:895,7\n350#1:930\n350#1:977\n191#1:820,6\n191#1:835,4\n191#1:845,2\n192#1:856,6\n192#1:871,4\n192#1:881,2\n192#1:887\n191#1:892\n350#1:902,6\n350#1:917,4\n350#1:927,2\n352#1:941,6\n352#1:956,4\n352#1:966,2\n352#1:972\n350#1:976\n440#1:994,6\n440#1:1009,4\n440#1:1019,2\n440#1:1026\n469#1:1041,6\n469#1:1056,4\n469#1:1066,2\n469#1:1073\n191#1:826,9\n191#1:847\n192#1:862,9\n192#1:883\n192#1:885,2\n191#1:890,2\n350#1:908,9\n350#1:929\n352#1:947,9\n352#1:968\n352#1:970,2\n350#1:974,2\n440#1:1000,9\n440#1:1021\n440#1:1024,2\n469#1:1047,9\n469#1:1068\n469#1:1071,2\n191#1:839,6\n192#1:875,6\n350#1:921,6\n352#1:960,6\n440#1:1013,6\n469#1:1060,6\n192#1:849\n192#1:850,6\n192#1:884\n192#1:888\n236#1:889\n351#1:931\n354#1:932\n357#1:933\n393#1:978\n404#1:979\n411#1:980\n444#1:1023\n473#1:1070\n495#1:1075\n502#1:1076\n517#1:1077\n352#1:934\n352#1:935,6\n352#1:969\n352#1:973\n440#1:987\n440#1:988,6\n440#1:1022\n440#1:1027\n469#1:1034\n469#1:1035,6\n469#1:1069\n469#1:1074\n180#1:1085\n180#1:1086,2\n181#1:1088\n181#1:1089,2\n361#1:1091\n362#1:1092\n365#1:1093\n369#1:1094\n428#1:1095\n429#1:1096\n462#1:1097\n490#1:1098\n*E\n"})
public final class EntryViewActivity extends Hilt_EntryViewActivity {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001JY\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001A\u001A\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001C\u001A\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001C\u0010\u001BR\u0014\u0010\u001D\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001D\u0010\u0012R\u0014\u0010\u001E\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001E\u0010\u0012¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$Companion;", "", "Landroid/content/Context;", "context", "", "blogName", "", "entryId", "slogan", "password", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "challengeResult", "Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint;", "wayPoint", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint;)Landroid/content/Intent;", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "EXTRA_CHALLENGE_RESULT", "EXTRA_ENTRY_ID", "EXTRA_ENTRY_PASSWORD", "EXTRA_SLOGAN", "EXTRA_WAYPOINT", "PROTECTED_PWD", "", "REQUEST_CODE_FINISH", "I", "REQUEST_CODE_REFRESH", "URL_PREFIX_HTTP", "URL_PREFIX_HTTPS", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, @NotNull String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2, @Nullable ChallengeResult challengeResult0, @Nullable EntryWayPoint entryViewActivity$EntryWayPoint0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intent intent0 = new Intent(context0, EntryViewActivity.class);
            intent0.putExtra("EXTRA_BLOG_NAME", s);
            intent0.putExtra("EXTRA_ENTRY_ID", long0);
            intent0.putExtra("EXTRA_SLOGAN", s1);
            intent0.putExtra("EXTRA_ENTRY_PASSWORD", s2);
            intent0.putExtra("EXTRA_WAYPOINT", entryViewActivity$EntryWayPoint0);
            intent0.putExtra("EXTRA_CHALLENGE_RESULT", challengeResult0);
            return intent0;
        }

        public static Intent createIntent$default(Companion entryViewActivity$Companion0, Context context0, String s, Long long0, String s1, String s2, ChallengeResult challengeResult0, EntryWayPoint entryViewActivity$EntryWayPoint0, int v, Object object0) {
            Long long1 = (v & 4) == 0 ? long0 : null;
            String s3 = (v & 8) == 0 ? s1 : null;
            String s4 = (v & 16) == 0 ? s2 : null;
            ChallengeResult challengeResult1 = (v & 0x20) == 0 ? challengeResult0 : null;
            return (v & 0x40) == 0 ? entryViewActivity$Companion0.createIntent(context0, s, long1, s3, s4, challengeResult1, entryViewActivity$EntryWayPoint0) : entryViewActivity$Companion0.createIntent(context0, s, long1, s3, s4, challengeResult1, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint;", "Landroid/os/Parcelable;", "Comment", "Modify", "Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint$Comment;", "Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint$Modify;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static abstract class EntryWayPoint implements Parcelable {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000FJ \u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u0007¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint$Comment;", "Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint;", "", "commentId", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint$Comment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "J", "getCommentId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Comment extends EntryWayPoint {
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
            public static final class Creator implements Parcelable.Creator {
                @NotNull
                public final Comment createFromParcel(@NotNull Parcel parcel0) {
                    Intrinsics.checkNotNullParameter(parcel0, "parcel");
                    return new Comment(parcel0.readLong());
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.createFromParcel(parcel0);
                }

                @NotNull
                public final Comment[] newArray(int v) {
                    return new Comment[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.newArray(v);
                }
            }

            public static final int $stable;
            @NotNull
            public static final Parcelable.Creator CREATOR;
            public final long a;

            static {
                Comment.CREATOR = new Creator();
            }

            public Comment(long v) {
                super(null);
                this.a = v;
            }

            public final long component1() {
                return this.a;
            }

            @NotNull
            public final Comment copy(long v) {
                return new Comment(v);
            }

            public static Comment copy$default(Comment entryViewActivity$EntryWayPoint$Comment0, long v, int v1, Object object0) {
                if((v1 & 1) != 0) {
                    v = entryViewActivity$EntryWayPoint$Comment0.a;
                }
                return entryViewActivity$EntryWayPoint$Comment0.copy(v);
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Comment ? this.a == ((Comment)object0).a : false;
            }

            public final long getCommentId() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return Long.hashCode(this.a);
            }

            @Override
            @NotNull
            public String toString() {
                return "Comment(commentId=" + this.a + ")";
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel0, int v) {
                Intrinsics.checkNotNullParameter(parcel0, "out");
                parcel0.writeLong(this.a);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001A\u00020\b2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint$Modify;", "Lcom/kakao/tistory/presentation/view/entry/EntryViewActivity$EntryWayPoint;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Modify extends EntryWayPoint {
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
            public static final class com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint.Modify.Creator implements Parcelable.Creator {
                @NotNull
                public final Modify createFromParcel(@NotNull Parcel parcel0) {
                    Intrinsics.checkNotNullParameter(parcel0, "parcel");
                    parcel0.readInt();
                    return Modify.INSTANCE;
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.createFromParcel(parcel0);
                }

                @NotNull
                public final Modify[] newArray(int v) {
                    return new Modify[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.newArray(v);
                }
            }

            public static final int $stable;
            @NotNull
            public static final Parcelable.Creator CREATOR;
            @NotNull
            public static final Modify INSTANCE;

            static {
                Modify.INSTANCE = new Modify();
                Modify.CREATOR = new com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint.Modify.Creator();
            }

            public Modify() {
                super(null);
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel0, int v) {
                Intrinsics.checkNotNullParameter(parcel0, "out");
                parcel0.writeInt(1);
            }
        }

        public static final int $stable;

        public EntryWayPoint(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_NAME = "EXTRA_BLOG_NAME";
    @NotNull
    public static final String EXTRA_CHALLENGE_RESULT = "EXTRA_CHALLENGE_RESULT";
    @NotNull
    public static final String EXTRA_ENTRY_ID = "EXTRA_ENTRY_ID";
    @NotNull
    public static final String EXTRA_ENTRY_PASSWORD = "EXTRA_ENTRY_PASSWORD";
    @NotNull
    public static final String EXTRA_SLOGAN = "EXTRA_SLOGAN";
    @NotNull
    public static final String EXTRA_WAYPOINT = "EXTRA_WAYPOINT";
    public static final int REQUEST_CODE_FINISH = 0x809;
    public static final int REQUEST_CODE_REFRESH = 0x80A;
    public final boolean s;
    public final Lazy t;
    public final BaseViewModelLazy u;
    public EntryWebView v;
    public int w;

    static {
        EntryViewActivity.Companion = new Companion(null);
        EntryViewActivity.$stable = 8;
    }

    public EntryViewActivity() {
        this.s = true;
        this.t = c.lazy(new h0(this));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.u = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(EntryViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void BottomBar(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBB0265FB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBB0265FB, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.BottomBar (EntryViewActivity.kt:348)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray3, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 9);
        Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f), 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 20.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function01);
        }
        else {
            composer1.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        State state0 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getMoreSelected(), Boolean.FALSE, composer1, 56);
        State state1 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getShowMoreOthersBottomGroup(), Boolean.FALSE, composer1, 56);
        State state2 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getShowMoreMineBottomGroup(), Boolean.FALSE, composer1, 56);
        Boolean boolean0 = (Boolean)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(boolean0, "BottomBar$lambda$15$lambda$14$lambda$10(...)");
        State state3 = AnimateAsStateKt.animateFloatAsState((boolean0.booleanValue() ? 90.0f : 0.0f), null, 0.0f, null, null, composer1, 0, 30);
        Boolean boolean1 = (Boolean)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(boolean1, "BottomBar$lambda$15$lambda$14$lambda$10(...)");
        if(boolean1.booleanValue()) {
            composer1.startReplaceGroup(1824174009);
            composer1.startReplaceGroup(0x8FE4FF7D);
            if(((Boolean)state1.getValue()).booleanValue()) {
                this.ReaderMoreButtonGroup(composer1, 8);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x8FE508DB);
            if(((Boolean)state2.getValue()).booleanValue()) {
                this.WriterMoreButtonGroup(composer1, 8);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        }
        else {
            composer1.startReplaceGroup(-1880811109);
            this.DefaultButtonGroup(rowScopeInstance0, composer1, 70);
        }
        composer1.endReplaceGroup();
        Modifier modifier3 = RotateKt.rotate(modifier$Companion0, ((Number)state3.getValue()).floatValue());
        int v3 = drawable.ic_bar_more_off;
        Boolean boolean2 = (Boolean)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(boolean2, "BottomBar$lambda$15$lambda$14$lambda$10(...)");
        this.DefaultIconButton(modifier3, v3, StringResources_androidKt.stringResource((boolean2.booleanValue() ? string.content_desc_more_menu_collapse : string.content_desc_more_menu_expand), composer1, 0), new com.kakao.tistory.presentation.view.entry.c(this), composer1, 0x8000, 0);
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.view.entry.d(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void CommentButton(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x96319EC4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x96319EC4, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.CommentButton (EntryViewActivity.kt:460)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getCommentCount(), 0L, composer1, 56);
        int v1 = string.content_desc_button;
        int v2 = string.content_desc_entry_view_comment_count;
        Long long0 = (Long)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(long0, "CommentButton$lambda$20(...)");
        String s = StringResources_androidKt.stringResource(v1, new Object[]{StringResources_androidKt.stringResource(v2, new Object[]{long0}, composer1, 0x40)}, composer1, 0x40);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        composer1.startReplaceGroup(-1547106026);
        boolean z = composer1.changed(s);
        com.kakao.tistory.presentation.view.entry.e e0 = composer1.rememberedValue();
        if(z || e0 == Composer.Companion.getEmpty()) {
            e0 = new com.kakao.tistory.presentation.view.entry.e(s);
            composer1.updateRememberedValue(e0);
        }
        composer1.endReplaceGroup();
        Modifier modifier0 = SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, e0);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        this.DefaultIconButton(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 4.0f, 0.0f, 11, null), drawable.ic_bar_comment, null, new f(this), composer1, 0x8006, 4);
        Long long1 = (Long)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(long1, "CommentButton$lambda$20(...)");
        TextKt.Text--4IGK_g(StringExtensionKt.toFormattedString(Math.abs(long1.longValue()), 6), null, ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0x141600000L, null, FontWeight.Companion.getLight(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0x1B0C00, 0, 0x1FF92);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x5FC180B5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5FC180B5, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.Content (EntryViewActivity.kt:149)");
        }
        ScaffoldKt.Scaffold-27mzLpw(null, null, null, ComposableLambdaKt.rememberComposableLambda(0x4585977B, true, new h(this), composer1, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-2020035725, true, new k(this), composer1, 54), composer1, 0xC00, 0xC00000, 0x1FFF7);
        this.EntryDialogHandler(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(this, modifier0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DefaultButtonGroup(@NotNull RowScope rowScope0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(rowScope0, "<this>");
        Composer composer1 = composer0.startRestartGroup(-731002637);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-731002637, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.DefaultButtonGroup (EntryViewActivity.kt:488)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getCommentButtonVisibility(), composer1, 8);
        this.LikeButton(composer1, 8);
        composer1.startReplaceGroup(0x17BC9570);
        Integer integer0 = (Integer)state0.getValue();
        if(integer0 != null && ((int)integer0) == 0) {
            c.a(25.5f, Modifier.Companion, composer1, 6);
            this.CommentButton(composer1, 8);
        }
        composer1.endReplaceGroup();
        SpacerKt.Spacer(RowScope.weight$default(rowScope0, Modifier.Companion, 1.0f, false, 2, null), composer1, 0);
        this.DefaultIconButton(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 15.0f, 0.0f, 11, null), drawable.ic_bar_share, StringResources_androidKt.stringResource(string.label_entry_view_share, composer1, 0), new m(this), composer1, 0x8006, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(this, rowScope0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DefaultIconButton(@Nullable Modifier modifier0, @DrawableRes int v, @Nullable String s, @NotNull Function0 function00, @Nullable Composer composer0, int v1, int v2) {
        String s1;
        Modifier modifier1;
        int v3;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x37CFDFE4);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            s1 = (v2 & 4) == 0 ? s : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x37CFDFE4, v3, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.DefaultIconButton (EntryViewActivity.kt:515)");
            }
            Modifier modifier2 = SizeKt.size-3ABfNKs(modifier1, 24.0f);
            composer1.startReplaceGroup(-2004177734);
            o o0 = composer1.rememberedValue();
            if((v3 & 0x1C00) == 0x800 || o0 == Composer.Companion.getEmpty()) {
                o0 = new o(function00);
                composer1.updateRememberedValue(o0);
            }
            composer1.endReplaceGroup();
            IconButtonKt.IconButton(o0, modifier2, false, null, ComposableLambdaKt.rememberComposableLambda(120527304, true, new p(v, s1), composer1, 54), composer1, 0x6000, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(this, modifier1, v, s1, function00, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void EntryDialogHandler(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFA5498BF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFA5498BF, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryDialogHandler (EntryViewActivity.kt:241)");
        }
        TistoryComposeDialogKt.DialogHandler(((EntryViewModel)this.u.getValue()).getErrorDialogEvent(), ComposableSingletons.EntryViewActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 56);
        TistoryComposeDialogKt.DialogHandler(((EntryViewModel)this.u.getValue()).getDialogEvent(), ComposableLambdaKt.rememberComposableLambda(0xD44BF866, true, new a0(this), composer1, 54), composer1, 56);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void LikeButton(@Nullable Composer composer0, int v) {
        String s;
        Composer composer1 = composer0.startRestartGroup(-609773544);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-609773544, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.LikeButton (EntryViewActivity.kt:426)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getLikeSelected(), Boolean.FALSE, composer1, 56);
        State state1 = LiveDataAdapterKt.observeAsState(((EntryViewModel)this.u.getValue()).getLikeCount(), 0L, composer1, 56);
        if(Intrinsics.areEqual(((EntryViewModel)this.u.getValue()).getLikeSelected().getValue(), Boolean.TRUE)) {
            composer1.startReplaceGroup(0x95A136FD);
            int v1 = string.content_desc_entry_view_like_cancel;
            Long long0 = (Long)state1.getValue();
            Intrinsics.checkNotNullExpressionValue(long0, "LikeButton$lambda$17(...)");
            s = StringResources_androidKt.stringResource(v1, new Object[]{long0}, composer1, 0x40);
        }
        else {
            composer1.startReplaceGroup(0x95A147A8);
            int v2 = string.content_desc_entry_view_like;
            Long long1 = (Long)state1.getValue();
            Intrinsics.checkNotNullExpressionValue(long1, "LikeButton$lambda$17(...)");
            s = StringResources_androidKt.stringResource(v2, new Object[]{long1}, composer1, 0x40);
        }
        composer1.endReplaceGroup();
        String s1 = StringResources_androidKt.stringResource(string.content_desc_button, new Object[]{s}, composer1, 0x40);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        composer1.startReplaceGroup(0x95A1620C);
        boolean z = composer1.changed(s1);
        c0 c00 = composer1.rememberedValue();
        if(z || c00 == Composer.Companion.getEmpty()) {
            c00 = new c0(s1);
            composer1.updateRememberedValue(c00);
        }
        composer1.endReplaceGroup();
        Modifier modifier0 = SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, c00);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 4.0f, 0.0f, 11, null);
        Boolean boolean0 = (Boolean)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(boolean0, "LikeButton$lambda$16(...)");
        this.DefaultIconButton(modifier2, (boolean0.booleanValue() ? drawable.ic_bar_like_on : drawable.ic_bar_like_off), null, new d0(this), composer1, 0x8006, 4);
        Long long2 = (Long)state1.getValue();
        Intrinsics.checkNotNullExpressionValue(long2, "LikeButton$lambda$17(...)");
        TextKt.Text--4IGK_g(StringExtensionKt.toFormattedString(Math.abs(long2.longValue()), 6), null, ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0x141600000L, null, FontWeight.Companion.getLight(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0x1B0C00, 0, 0x1FF92);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void ReaderMoreButtonGroup(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1897396200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1897396200, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.ReaderMoreButtonGroup (EntryViewActivity.kt:390)");
        }
        this.DefaultIconButton(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 4.0f, 0.0f, 11, null), drawable.ic_bar_report, StringResources_androidKt.stringResource(string.label_report, composer1, 0), new f0(this), composer1, 0x8006, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void WebView(@Nullable Modifier modifier0, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(function00, "onPageLoadFinished");
        Composer composer1 = composer0.startRestartGroup(0xBA8BAC49);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBA8BAC49, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.WebView (EntryViewActivity.kt:178)");
        }
        composer1.startReplaceGroup(0xF233E018);
        MutableState mutableState0 = composer1.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        MutableState mutableState1 = b.a(composer1, 0xF233E79B);
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        composer1.endReplaceGroup();
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = androidx.room.a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        composer1.startReplaceGroup(0xF233F53F);
        NestedScrollDispatcher nestedScrollDispatcher0 = composer1.rememberedValue();
        if(nestedScrollDispatcher0 == composer$Companion0.getEmpty()) {
            nestedScrollDispatcher0 = new NestedScrollDispatcher();
            composer1.updateRememberedValue(nestedScrollDispatcher0);
        }
        com.kakao.tistory.presentation.view.entry.EntryViewActivity.WebView.connection.1.1 entryViewActivity$WebView$connection$1$10 = b.a(composer1, 0xF233FD28);
        if(entryViewActivity$WebView$connection$1$10 == composer$Companion0.getEmpty()) {
            entryViewActivity$WebView$connection$1$10 = new com.kakao.tistory.presentation.view.entry.EntryViewActivity.WebView.connection.1.1();
            composer1.updateRememberedValue(entryViewActivity$WebView$connection$1$10);
        }
        composer1.endReplaceGroup();
        if(((Boolean)mutableState1.getValue()).booleanValue()) {
            int v2 = ((Number)mutableState0.getValue()).intValue();
            int v3 = v2 - this.w;
            if(v2 >= ((Number)this.t.getValue()).intValue()) {
                if(Math.abs(v3) > 10) {
                    if(v3 >= 0) {
                        this.hideAppBar();
                    }
                    else {
                        TistoryToolbarActivity.showAppBar$default(this, false, 1, null);
                    }
                }
            }
            else if(v3 > 0) {
                this.hideAppBar();
            }
            else {
                this.showAppBar(true);
            }
            this.w = v2;
        }
        Modifier modifier2 = SizeKt.fillMaxSize$default(modifier1, 0.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function01);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function20);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier4 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
        Function0 function02 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function02);
        }
        else {
            composer1.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
            d.a(v5, composer1, v5, function21);
        }
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        Modifier modifier6 = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), entryViewActivity$WebView$connection$1$10, nestedScrollDispatcher0);
        AndroidView_androidKt.AndroidView(new l0(this, function00, mutableState0, nestedScrollDispatcher0, coroutineScope0, mutableState1), modifier6, null, composer1, 0, 4);
        composer1.endNode();
        BoxKt.Box(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 52.0f), composer1, 6);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(this, modifier1, function00, v, v1));
        }

        @Metadata(d1 = {"\u0000\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/kakao/tistory/presentation/view/entry/EntryViewActivity$WebView$connection$1$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.tistory.presentation.view.entry.EntryViewActivity.WebView.connection.1.1 implements NestedScrollConnection {
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void WriterMoreButtonGroup(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1032185288);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032185288, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.WriterMoreButtonGroup (EntryViewActivity.kt:401)");
        }
        this.DefaultIconButton(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 24.0f, 0.0f, 11, null), drawable.ic_bar_edit, StringResources_androidKt.stringResource(string.label_entry_view_modification, composer1, 0), new n0(this), composer1, 0x8006, 0);
        this.DefaultIconButton(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 24.0f, 0.0f, 11, null), drawable.ic_bar_statistics, StringResources_androidKt.stringResource(string.label_entry_view_statistics, composer1, 0), new o0(this), composer1, 0x8006, 0);
        this.DefaultIconButton(null, drawable.ic_bar_delete, StringResources_androidKt.stringResource(string.label_entry_view_delete, composer1, 0), new p0(this), composer1, 0x8000, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(this, v));
        }
    }

    public static final void a(EntryViewActivity entryViewActivity0, Event event0) {
        Intrinsics.checkNotNullParameter(entryViewActivity0, "this$0");
        entryViewActivity0.finish();
    }

    public static final void a(EntryViewActivity entryViewActivity0, EntryViewModel entryViewModel0, User user0) {
        Intrinsics.checkNotNullParameter(entryViewActivity0, "this$0");
        Intrinsics.checkNotNullParameter(entryViewModel0, "$this_with");
        entryViewActivity0.updateAppBarUserImage(user0, new r0(entryViewModel0));
    }

    public static final void a(EntryViewModel entryViewModel0, LongSparseArray longSparseArray0) {
        long v;
        Intrinsics.checkNotNullParameter(entryViewModel0, "$this_with");
        EntryItem entryItem0 = (EntryItem)entryViewModel0.getEntryItem().getValue();
        if(entryItem0 == null) {
            v = -1L;
        }
        else {
            Long long0 = entryItem0.getId();
            v = long0 == null ? -1L : ((long)long0);
        }
        Long long1 = (Long)longSparseArray0.get(v);
        if(long1 != null) {
            entryViewModel0.getCommentCount().setValue(long1.longValue());
        }
    }

    public final void a(EntryItem entryItem0) {
        String s = entryItem0.getPermalink();
        String s1 = ((EntryViewModel)this.u.getValue()).getWebSessionCookie();
        String s2 = entryItem0.getPassword();
        String s3 = null;
        if(s2 == null) {
            s2 = null;
        }
        else {
            if(kotlin.text.p.isBlank(s2)) {
                s2 = null;
            }
            if(s2 == null) {
                s2 = null;
            }
            else {
                try {
                    s2 = URLEncoder.encode(s2, "UTF-8");
                }
                catch(Exception exception0) {
                    Logger.INSTANCE.log("loadWebView() encode error=" + exception0);
                    CrashlyticsUtils.INSTANCE.logException(exception0);
                }
            }
        }
        int v = 0;
        if(s2 != null) {
            if(s != null) {
                if(kotlin.text.p.startsWith$default(s, "https://", false, 2, null)) {
                    v = 8;
                }
                else if(kotlin.text.p.startsWith$default(s, "http://", false, 2, null)) {
                    v = 7;
                }
            }
            if(s != null) {
                String s4 = s.substring(v, s.length());
                Intrinsics.checkNotNullExpressionValue(s4, "substring(...)");
                if(s4 != null) {
                    Map map0 = w.mapOf(new Pair(s4, s2));
                    String s5 = new Gson().toJson(map0);
                    Intrinsics.checkNotNullExpressionValue(s5, "toJson(...)");
                    byte[] arr_b = s5.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
                    s3 = androidx.room.a.j("PROTECTED_PWD=", Base64.encodeToString(arr_b, 2));
                }
            }
        }
        String s6 = this.getString(string.app_host_cookie);
        Intrinsics.checkNotNullExpressionValue(s6, "getString(...)");
        CookieManager cookieManager0 = CookieManager.getInstance();
        Logger logger0 = Logger.INSTANCE;
        logger0.log("loadWebView() : before Cookie=" + cookieManager0.getCookie(s6));
        cookieManager0.setAcceptCookie(true);
        EntryWebView entryWebView0 = this.v;
        if(entryWebView0 != null) {
            cookieManager0.setAcceptThirdPartyCookies(entryWebView0, true);
        }
        if(s1 != null) {
            cookieManager0.setCookie(s6, s1);
        }
        if(s3 != null) {
            cookieManager0.setCookie(s6, s3);
        }
        logger0.log("loadWebView() : after Cookie=" + cookieManager0.getCookie(s6));
        if(s != null) {
            EntryWebView entryWebView1 = this.v;
            if(entryWebView1 != null) {
                entryWebView1.loadUrl(s);
            }
        }
    }

    public static final void access$WebView$lambda$2(MutableState mutableState0, int v) {
        mutableState0.setValue(v);
    }

    public static final void access$WebView$lambda$5(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final EntryViewModel access$getEntryViewModel(EntryViewActivity entryViewActivity0) {
        return (EntryViewModel)entryViewActivity0.u.getValue();
    }

    public static final void access$initWebView(EntryViewActivity entryViewActivity0, EntryWebView entryWebView0) {
        entryViewActivity0.getClass();
        entryWebView0.setRedirectEnabled(true);
        entryWebView0.setOnShouldOverrideUrlCallback(new i1(entryViewActivity0));
    }

    public final void c() {
        EntryViewModel entryViewModel0 = (EntryViewModel)this.u.getValue();
        entryViewModel0.getAppBarUser().observe(this, new gc.b(3, this, entryViewModel0));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getShowWebView(), this, new x0(this));
        entryViewModel0.getUpdateCommentCount().observe(this, new androidx.lifecycle.q(entryViewModel0, 7));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getEntryEvent(), this, new y0(this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getGoToStatisticsActivity(), this, new z0(this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getGoToShare(), this, new a1(this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getGoToBlogActivity(), this, new b1(this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getShowProtectedEntryDialogGoToComment(), this, new e1(entryViewModel0, this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getShowProtectedEntryDialogWithSloganGoToEntry(), this, new h1(entryViewModel0, this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getShowProtectedEntryDialogGoToEntry(), this, new u0(entryViewModel0, this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getShowReportEntryDialog(), this, new v0(entryViewModel0, this));
        LiveDataExtensionKt.observeEvent(entryViewModel0.getShowToast(), this, new w0(this));
        entryViewModel0.getFinishActivity().observe(this, new androidx.lifecycle.q(this, 8));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return this.s;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 0x809: {
                if(v1 == CommentActivityResultType.NotFound.getCode()) {
                    this.finish();
                    return;
                }
                break;
            }
            case 0x80A: {
                if(v1 == -1) {
                    ((EntryViewModel)this.u.getValue()).init();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if(this.v != null && !this.v.onBackPressed()) {
            this.finish();
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent0, "getIntent(...)");
        ((EntryViewModel)this.u.getValue()).initBundle(intent0);
        ActionBar actionBar0 = this.getSupportActionBar();
        if(actionBar0 != null) {
            actionBar0.setShowHideAnimationEnabled(true);
        }
        this.disableAppBarBehavior();
        this.updateContentTopMargin(0);
        this.c();
        ((EntryViewModel)this.u.getValue()).init();
    }

    @Override  // androidx.activity.ComponentActivity
    public void onNewIntent(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        ((EntryViewModel)this.u.getValue()).initBundle(intent0);
        super.onNewIntent(intent0);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

