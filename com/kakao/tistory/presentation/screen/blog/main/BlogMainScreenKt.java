package com.kakao.tistory.presentation.screen.blog.main;

import a;
import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.entity.BlogStatusType;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.CommonCompositionLocalKt;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.TistoryWindowInsets;
import com.kakao.tistory.presentation.main.MainAppKt;
import com.kakao.tistory.presentation.screen.blog.BlogConsumeEventKt;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogError;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogUiState;
import com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyBottomSheetKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.Others;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.Category;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.EntryModify;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.OthersBlogMenu;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Block;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Delete;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.UnBlock;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategoryBottomSheetKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategoryKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainOthersMenuBottomSheetKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainTopAppBarKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.EditGuideDialogKt;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.item.ViewState.Error;
import com.kakao.tistory.presentation.screen.item.ViewState.Loading;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import com.kakao.tistory.presentation.screen.item.ViewState;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import com.kakao.tistory.presentation.widget.dialog.AlertDialogData;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001AI\u0010\u000F\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0001¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u001B²\u0006\f\u0010\u0012\u001A\u00020\u00118\nX\u008A\u0084\u0002²\u0006\f\u0010\u0014\u001A\u00020\u00138\nX\u008A\u0084\u0002²\u0006\u0012\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\nX\u008A\u0084\u0002²\u0006\f\u0010\u0019\u001A\u00020\u00188\nX\u008A\u0084\u0002²\u0006\f\u0010\u001A\u001A\u00020\u00048\nX\u008A\u0084\u0002"}, d2 = {"", "blogName", "Lcom/kakao/tistory/presentation/screen/blog/navigation/FromRefer;", "refer", "", "hasBackStack", "Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "navActions", "Lcom/kakao/tistory/presentation/screen/blog/navigation/BlogNestedNavActions;", "nestedNavActions", "Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;", "blogViewModel", "Lcom/kakao/tistory/presentation/screen/blog/main/BlogMainViewModel;", "blogMainViewModel", "", "BlogMainScreen", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/navigation/FromRefer;ZLcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;Lcom/kakao/tistory/presentation/screen/blog/navigation/BlogNestedNavActions;Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;Lcom/kakao/tistory/presentation/screen/blog/main/BlogMainViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "blogUiState", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "blogMainUiState", "Landroidx/paging/ItemSnapshotList;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "entrySnapshotList", "", "fraction", "isCategorySticky", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainScreen.kt\ncom/kakao/tistory/presentation/screen/blog/main/BlogMainScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,478:1\n1223#2,6:479\n1223#2,6:567\n1223#2,6:573\n1223#2,6:579\n1223#2,6:671\n71#3:485\n69#3,5:486\n74#3:519\n78#3:524\n71#3:525\n67#3,7:526\n74#3:561\n78#3:565\n78#4,6:491\n85#4,4:506\n89#4,2:516\n93#4:523\n78#4,6:533\n85#4,4:548\n89#4,2:558\n93#4:564\n78#4,6:594\n85#4,4:609\n89#4,2:619\n78#4,6:630\n85#4,4:645\n89#4,2:655\n93#4:663\n93#4:667\n368#5,9:497\n377#5:518\n378#5,2:521\n368#5,9:539\n377#5:560\n378#5,2:562\n368#5,9:600\n377#5:621\n368#5,9:636\n377#5:657\n378#5,2:661\n378#5,2:665\n4032#6,6:510\n4032#6,6:552\n4032#6,6:613\n4032#6,6:649\n77#7:520\n77#7:566\n77#7:585\n77#7:669\n77#7:670\n1#8:586\n85#9:587\n82#9,6:588\n88#9:622\n85#9:623\n82#9,6:624\n88#9:658\n92#9:664\n92#9:668\n148#10:659\n148#10:660\n81#11:677\n81#11:678\n81#11:679\n81#11:680\n*S KotlinDebug\n*F\n+ 1 BlogMainScreen.kt\ncom/kakao/tistory/presentation/screen/blog/main/BlogMainScreenKt\n*L\n77#1:479,6\n214#1:567,6\n327#1:573,6\n342#1:579,6\n413#1:671,6\n157#1:485\n157#1:486,5\n157#1:519\n157#1:524\n174#1:525\n174#1:526,7\n174#1:561\n174#1:565\n157#1:491,6\n157#1:506,4\n157#1:516,2\n157#1:523\n174#1:533,6\n174#1:548,4\n174#1:558,2\n174#1:564\n382#1:594,6\n382#1:609,4\n382#1:619,2\n391#1:630,6\n391#1:645,4\n391#1:655,2\n391#1:663\n382#1:667\n157#1:497,9\n157#1:518\n157#1:521,2\n174#1:539,9\n174#1:560\n174#1:562,2\n382#1:600,9\n382#1:621\n391#1:636,9\n391#1:657\n391#1:661,2\n382#1:665,2\n157#1:510,6\n174#1:552,6\n382#1:613,6\n391#1:649,6\n164#1:520\n213#1:566\n380#1:585\n409#1:669\n411#1:670\n382#1:587\n382#1:588,6\n382#1:622\n391#1:623\n391#1:624,6\n391#1:658\n391#1:664\n382#1:668\n394#1:659\n396#1:660\n74#1:677\n75#1:678\n385#1:679\n386#1:680\n*E\n"})
public final class BlogMainScreenKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[ErrorStatus.values().length];
            try {
                arr_v[ErrorStatus.EXCEPTION_BLOG_LESS.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ErrorStatus.EXCEPTION_RESTRICTED_BLOG.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[BlogStatusType.values().length];
            try {
                arr_v1[BlogStatusType.DEL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[BlogStatusType.TMP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainScreen(@Nullable String s, @NotNull FromRefer fromRefer0, boolean z, @NotNull NavActions navActions0, @NotNull BlogNestedNavActions blogNestedNavActions0, @NotNull BlogViewModel blogViewModel0, @NotNull BlogMainViewModel blogMainViewModel0, @Nullable Composer composer0, int v) {
        int v2;
        State state2;
        Intrinsics.checkNotNullParameter(fromRefer0, "refer");
        Intrinsics.checkNotNullParameter(navActions0, "navActions");
        Intrinsics.checkNotNullParameter(blogNestedNavActions0, "nestedNavActions");
        Intrinsics.checkNotNullParameter(blogViewModel0, "blogViewModel");
        Intrinsics.checkNotNullParameter(blogMainViewModel0, "blogMainViewModel");
        Composer composer1 = composer0.startRestartGroup(-339210026);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339210026, v, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainScreen (BlogMainScreen.kt:72)");
        }
        State state0 = SnapshotStateKt.collectAsState(blogViewModel0.getUiState(), null, composer1, 8, 1);
        State state1 = SnapshotStateKt.collectAsState(blogMainViewModel0.getUiState(), null, composer1, 8, 1);
        Boolean boolean0 = Boolean.valueOf(z);
        composer1.startReplaceGroup(0x2F0E139C);
        boolean z1 = composer1.changed(state0);
        int v1 = 0;
        boolean z2 = (v & 14 ^ 6) > 4 && composer1.changed(s) || (v & 6) == 4;
        if((v & 0x380 ^ 0x180) > 0x100 && composer1.changed(z) || (v & 0x180) == 0x100) {
            v1 = 1;
        }
        x x0 = composer1.rememberedValue();
        if((z2 | z1 | v1) != 0 || x0 == Composer.Companion.getEmpty()) {
            x0 = new x(s, z, state0, null);
            composer1.updateRememberedValue(x0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(s, boolean0, x0, composer1, v & 14 | 0x200 | v >> 3 & 0x70);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x28B022DF, true, new b0(z, state0, state1), composer1, 54);
        ViewState viewState0 = ((BlogUiState)state0.getValue()).getState();
        if(viewState0 instanceof Error) {
            composer1.startReplaceGroup(0xB2BB309E);
            BlogMainScreenKt.a(((Error)viewState0).getErrorModel(), ((BlogUiState)state0.getValue()).getRefresh(), composableLambda0, composer1, 392);
            composer1.endReplaceGroup();
            state2 = state1;
            v2 = v >> 3;
        }
        else if(Intrinsics.areEqual(viewState0, Loading.INSTANCE)) {
            composer1.startReplaceGroup(0xB2BE7FAB);
            BlogMainScreenKt.a(composableLambda0, composer1, 6);
            composer1.endReplaceGroup();
            state2 = state1;
            v2 = v >> 3;
        }
        else {
            if(viewState0 instanceof Success) {
                composer1.startReplaceGroup(0xB2BFF38C);
                state2 = state1;
                v2 = v >> 3;
                CompositionLocalKt.CompositionLocalProvider(CommonCompositionLocalKt.getLocalRefreshingState().provides(Boolean.valueOf(((BlogUiState)state0.getValue()).isRefreshing())), ComposableLambdaKt.rememberComposableLambda(-1805288618, true, new y(fromRefer0, ((Success)viewState0), composableLambda0, state2, state0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            }
            else {
                state2 = state1;
                v2 = v >> 3;
                composer1.startReplaceGroup(-1295650850);
            }
            composer1.endReplaceGroup();
        }
        BlogConsumeEventKt.BlogConsumeEvent(blogViewModel0, navActions0, composer1, v >> 6 & 0x70 | 8);
        BlogMainScreenKt.a(blogMainViewModel0, ((BlogMainUiState)state2.getValue()), navActions0, blogNestedNavActions0, composer1, v2 & 0x380 | 8 | v2 & 0x1C00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(s, fromRefer0, z, navActions0, blogNestedNavActions0, blogViewModel0, blogMainViewModel0, v));
        }
    }

    public static final void a(ErrorModel errorModel0, Function0 function00, Function4 function40, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x921F2FBF);
        int v1 = -1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x921F2FBF, v, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogExceptionView (BlogMainScreen.kt:136)");
        }
        BlogStatusType blogStatusType0 = null;
        BlogError blogError0 = errorModel0 instanceof BlogError ? ((BlogError)errorModel0) : null;
        boolean z = blogError0 == null ? false : blogError0.isMyBlog();
        ErrorStatus errorStatus0 = ErrorStatusKt.getErrorStatus(errorModel0);
        Logger.INSTANCE.log("BlogExceptionView errorModel : " + errorModel0 + ", isMyBlog : " + z + ",  errorStatus : " + errorStatus0);
        switch(WhenMappings.$EnumSwitchMapping$0[ErrorStatusKt.getErrorStatus(errorModel0).ordinal()]) {
            case 1: {
                composer1.startReplaceGroup(0x40417B04);
                errorModel0.setTitle(StringResources_androidKt.stringResource(string.label_exception_blog_less_title, composer1, 0));
                errorModel0.setMessage(StringResources_androidKt.stringResource(string.label_exception_blog_less_message, composer1, 0));
                composer1.endReplaceGroup();
                break;
            }
            case 2: {
                composer1.startReplaceGroup(0xC7F15B2C);
                errorModel0.setTitle(StringResources_androidKt.stringResource(string.label_exception_blog_restricted_title, composer1, 0));
                BlogError blogError1 = errorModel0 instanceof BlogError ? ((BlogError)errorModel0) : null;
                if(blogError1 != null) {
                    blogStatusType0 = blogError1.getBlogStatus();
                }
                composer1.startReplaceGroup(0x3920CC83);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x3920CC83, 0, -1, "com.kakao.tistory.presentation.screen.blog.main.getRestrictedBlogMessage (BlogMainScreen.kt:180)");
                }
                StringBuilder stringBuilder0 = new StringBuilder("");
                if(blogStatusType0 != null) {
                    v1 = WhenMappings.$EnumSwitchMapping$1[blogStatusType0.ordinal()];
                }
                switch(v1) {
                    case 1: {
                        composer1.startReplaceGroup(620020669);
                        stringBuilder0.append(StringResources_androidKt.stringResource(string.label_exception_blog_status_del_message, composer1, 0));
                        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                        stringBuilder0.append('\n');
                        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                        composer1.endReplaceGroup();
                        break;
                    }
                    case 2: {
                        composer1.startReplaceGroup(620024349);
                        stringBuilder0.append(StringResources_androidKt.stringResource(string.label_exception_blog_status_tmp_message, composer1, 0));
                        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                        stringBuilder0.append('\n');
                        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                        composer1.endReplaceGroup();
                        break;
                    }
                    default: {
                        composer1.startReplaceGroup(0x79A6D0EF);
                        composer1.endReplaceGroup();
                    }
                }
                composer1.startReplaceGroup(0x24F4DFA6);
                if(z) {
                    stringBuilder0.append(StringResources_androidKt.stringResource(string.label_exception_common_message_guide_email, composer1, 0));
                    Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                    stringBuilder0.append('\n');
                    Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                }
                composer1.endReplaceGroup();
                stringBuilder0.append(StringResources_androidKt.stringResource(string.label_exception_common_message_qna, composer1, 0));
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                stringBuilder0.append('\n');
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
                String s = stringBuilder0.toString();
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer1.endReplaceGroup();
                errorModel0.setMessage(s);
                composer1.endReplaceGroup();
                break;
            }
            default: {
                composer1.startReplaceGroup(-940218901);
                composer1.endReplaceGroup();
            }
        }
        WindowInsets windowInsets0 = TistoryWindowInsets.INSTANCE.getTop(composer1, 6);
        Modifier modifier0 = WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, windowInsets0);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        CommonExceptionViewKt.CommonExceptionView(errorModel0, true, null, ((Boolean)composer1.consume(MainAppKt.getLocalOnlineState())).booleanValue(), function00, composer1, v << 9 & 0xE000 | 56, 4);
        function40.invoke(1.0f, Boolean.FALSE, composer1, ((int)(v & 0x380 | 54)));
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.blog.main.a(errorModel0, function00, function40, v));
        }
    }

    public static final void a(BlogMainViewModel blogMainViewModel0, BlogMainUiState blogMainUiState0, NavActions navActions0, BlogNestedNavActions blogNestedNavActions0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7C3ADF9C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7C3ADF9C, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ConsumeEvent (BlogMainScreen.kt:407)");
        }
        Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object object1 = composer1.consume(CompositionLocalsKt.getLocalClipboardManager());
        StartIntentSenderForResult activityResultContracts$StartIntentSenderForResult0 = new StartIntentSenderForResult();
        composer1.startReplaceGroup(0xCE61EB6A);
        boolean z = (v & 0x70 ^ 0x30) > 0x20 && composer1.changed(blogMainUiState0) || (v & 0x30) == 0x20;
        f0 f00 = composer1.rememberedValue();
        if(z || f00 == Composer.Companion.getEmpty()) {
            f00 = new f0(blogMainUiState0);
            composer1.updateRememberedValue(f00);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(blogMainViewModel0, new d0(blogMainViewModel0, navActions0, blogNestedNavActions0, ((ClipboardManager)object1), ((Context)object0), ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartIntentSenderForResult0, f00, composer1, 8), (((Context)object0) instanceof Activity ? ((Activity)(((Context)object0))) : null), null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(blogMainViewModel0, blogMainUiState0, navActions0, blogNestedNavActions0, v));
        }
    }

    public static final void a(Function4 function40, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6D5DB95E);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function40) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6D5DB95E, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogLoading (BlogMainScreen.kt:172)");
            }
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            LoadingDialogKt.LoadingDialog(composer1, 0);
            function40.invoke(1.0f, Boolean.FALSE, composer1, ((int)(v1 << 6 & 0x380 | 54)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(function40, v));
        }
    }

    public static final void access$BlogMainContent(BlogMainUiState blogMainUiState0, FromRefer fromRefer0, BlogInfo blogInfo0, Function0 function00, Function4 function40, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFAF55602);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFAF55602, v, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainContent (BlogMainScreen.kt:205)");
        }
        EffectsKt.LaunchedEffect(blogInfo0, new c(blogMainUiState0, blogInfo0, null), composer1, 72);
        boolean z = ((Boolean)composer1.consume(CommonCompositionLocalKt.getLocalRefreshingState())).booleanValue();
        composer1.startReplaceGroup(0x92C58DEA);
        int v1 = ((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(function00)) && (v & 0xC00) != 0x800 ? 0 : 1;
        int v2 = v & 14 ^ 6;
        int v3 = (v2 <= 4 || !composer1.changed(blogMainUiState0)) && (v & 6) != 4 ? 0 : 1;
        com.kakao.tistory.presentation.screen.blog.main.d d0 = composer1.rememberedValue();
        if((v1 | v3) != 0 || d0 == Composer.Companion.getEmpty()) {
            d0 = new com.kakao.tistory.presentation.screen.blog.main.d(function00, blogMainUiState0);
            composer1.updateRememberedValue(d0);
        }
        composer1.endReplaceGroup();
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x23B5D7E8, true, new l(blogMainUiState0, function40), composer1, 54);
        PullToRefreshKt.PullToRefreshBox(z, d0, null, null, Alignment.Companion.getTopCenter(), null, composableLambda0, composer1, 0x186000, 44);
        BottomSheetType bottomSheetType0 = blogMainUiState0.getBottomSheet();
        composer1.startReplaceGroup(0x92C6A340);
        if(bottomSheetType0 != null) {
            if(Intrinsics.areEqual(bottomSheetType0, Category.INSTANCE)) {
                composer1.startReplaceGroup(-1511269010);
                BlogMainCategoryBottomSheetKt.BlogMainCategoryBottomSheet(blogMainUiState0.getCategory().getList(), blogMainUiState0.getCategory().getCurrent(), blogMainUiState0.getOnDismissBottomSheet(), composer1, 8);
                composer1.endReplaceGroup();
            }
            else if(bottomSheetType0 instanceof EntryModify) {
                composer1.startReplaceGroup(0xA5EC042D);
                BlogEntryModifyBottomSheetKt.BlogEntryModifyBottomSheet(((EntryModify)bottomSheetType0).getVisibilityType(), null, new m(blogMainUiState0, bottomSheetType0), new n(blogMainUiState0, bottomSheetType0), new o(blogMainUiState0, bottomSheetType0), new p(blogMainUiState0, bottomSheetType0), new q(bottomSheetType0, blogMainUiState0), blogMainUiState0.getOnDismissBottomSheet(), composer1, 0, 2);
                composer1.endReplaceGroup();
            }
            else {
                if(Intrinsics.areEqual(bottomSheetType0, OthersBlogMenu.INSTANCE)) {
                    composer1.startReplaceGroup(0x17A48706);
                    BlogMainInfo blogMainInfo0 = blogMainUiState0.getInfo();
                    if(blogMainInfo0 != null) {
                        composer1.startReplaceGroup(0xA5EC8C10);
                        if(blogMainInfo0 instanceof Others) {
                            BlogMainOthersMenuBottomSheetKt.BlogMainOthersMenuBottomSheet(((Others)blogMainInfo0).isBlocking(), ((Others)blogMainInfo0).getOnClickBlockMenu(), ((Others)blogMainInfo0).isReportable(), ((Others)blogMainInfo0).getOnClickReport(), blogMainUiState0.getOnDismissBottomSheet(), composer1, 0);
                        }
                        composer1.endReplaceGroup();
                    }
                    composer1.endReplaceGroup();
                    goto label_42;
                }
                composer1.startReplaceGroup(0xA5E6D9C0);
                composer1.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
        }
    label_42:
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x92C79870);
        DialogType dialogType0 = blogMainUiState0.getDialog();
        if(dialogType0 instanceof Alert) {
            composer1.startReplaceGroup(0xA5ECCFAA);
            TistoryComposeDialogKt.TistoryAlertDialog(((AlertDialogData)dialogType0), blogMainUiState0.getOnDismissDialog(), composer1, 0);
        }
        else if(dialogType0 instanceof Block) {
            composer1.startReplaceGroup(0x17AF19B6);
            String s = StringResources_androidKt.stringResource(string.label_dialog_block, composer1, 0);
            String s1 = StringResources_androidKt.stringResource(string.label_dialog_block_confirm_description, composer1, 0);
            int v4 = string.label_block;
            Function0 function01 = blogMainUiState0.getOnDismissDialog();
            composer1.startReplaceGroup(0xA5ED0FBC);
            boolean z1 = v2 > 4 && composer1.changed(blogMainUiState0) || (v & 6) == 4;
            r r0 = composer1.rememberedValue();
            if(z1 || r0 == Composer.Companion.getEmpty()) {
                r0 = new r(blogMainUiState0);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceGroup();
            TistoryComposeDialogKt.TistoryAlertDialog(s, s1, true, function01, 0, v4, true, false, null, r0, composer1, 0x180180, 400);
        }
        else if(dialogType0 instanceof UnBlock) {
            composer1.startReplaceGroup(0x17BA0C2F);
            String s2 = StringResources_androidKt.stringResource(string.label_dialog_unblock, composer1, 0);
            String s3 = StringResources_androidKt.stringResource(string.label_dialog_unblock_confirm_description, composer1, 0);
            int v5 = string.label_unblock;
            Function0 function02 = blogMainUiState0.getOnDismissDialog();
            composer1.startReplaceGroup(0xA5ED6ADD);
            boolean z2 = v2 > 4 && composer1.changed(blogMainUiState0) || (v & 6) == 4;
            s s4 = composer1.rememberedValue();
            if(z2 || s4 == Composer.Companion.getEmpty()) {
                s4 = new s(blogMainUiState0);
                composer1.updateRememberedValue(s4);
            }
            composer1.endReplaceGroup();
            TistoryComposeDialogKt.TistoryAlertDialog(s2, s3, true, function02, 0, v5, true, false, null, s4, composer1, 0x180180, 400);
        }
        else if(dialogType0 instanceof Delete) {
            composer1.startReplaceGroup(0x17C5079E);
            TistoryComposeDialogKt.TistoryAlertDialog(StringResources_androidKt.stringResource(string.label_dialog_entry_delete, composer1, 0), null, true, blogMainUiState0.getOnDismissDialog(), 0, string.label_dialog_delete, true, false, null, new t(blogMainUiState0, ((Delete)dialogType0)), composer1, 0x180180, 402);
        }
        else if(dialogType0 == null) {
            composer1.startReplaceGroup(0x17CDEB74);
            if(blogMainUiState0.getShowGuide()) {
                EditGuideDialogKt.EditGuideDialog(blogMainUiState0.getOnDismissGuide(), composer1, 0, 0);
            }
        }
        else {
            composer1.startReplaceGroup(0x17CFAF22);
        }
        composer1.endReplaceGroup();
        composer1.endReplaceGroup();
        BlogMainTiara.INSTANCE.TrackPage(blogInfo0.getName(), blogInfo0.getRole(), fromRefer0, composer1, v << 3 & 0x380 | 0xC00);
        BlogMainTiara.INSTANCE.TrackUsage(blogInfo0.getName(), blogInfo0.getRole(), composer1, 0x180);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(blogMainUiState0, fromRefer0, blogInfo0, function00, function40, v));
        }
    }

    public static final void access$BlogMainContentAppBar(LazyListState lazyListState0, BlogMainUiState blogMainUiState0, Function4 function40, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE22C9FD);
        int v1 = (v & 14) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(blogMainUiState0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function40) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE22C9FD, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainContentAppBar (BlogMainScreen.kt:378)");
            }
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(56.0f);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.noRippleClickable(modifier$Companion0, v.a);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            State state0 = BlogMainTopAppBarKt.appBarFraction(lazyListState0, 1, f, composer1, v1 & 14 | 0x30);
            State state1 = BlogMainCategoryKt.isCategorySticky(lazyListState0, blogMainUiState0.getCategoryItemIndex(), f, composer1, v1 & 14);
            function40.invoke(((Number)state0.getValue()).floatValue(), Boolean.valueOf(!((Boolean)state1.getValue()).booleanValue()), composer1, ((int)(v1 & 0x380)));
            composer1.startReplaceGroup(1370874234);
            if(((Boolean)state1.getValue()).booleanValue()) {
                Modifier modifier2 = BackgroundKt.background-bw27NRU$default(modifier$Companion0, 0L, null, 2, null);
                MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    d.a(v3, composer1, v3, function21);
                }
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
                BlogMainCategoryKt.BlogMainCategory(blogMainUiState0.getCategory(), composer1, 0);
                b.a(8.0f, modifier$Companion0, composer1, 6);
                DividerKt.HorizontalDivider-9IZ8Weo(null, 1.0f, 0L, composer1, 0x1B0, 1);
                composer1.endNode();
            }
            if(com.kakao.tistory.presentation.design.ui.list.m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(lazyListState0, blogMainUiState0, function40, v));
        }
    }

    public static final BlogUiState access$BlogMainScreen$lambda$0(State state0) {
        return (BlogUiState)state0.getValue();
    }

    public static final BlogMainUiState access$BlogMainScreen$lambda$1(State state0) {
        return (BlogMainUiState)state0.getValue();
    }
}

