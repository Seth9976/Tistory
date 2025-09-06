package com.kakao.tistory.presentation.screen.revenue;

import a;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.main.MainAppKt;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogUiState;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.item.ViewState;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.Failed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.RevenueAnotherFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.RevenueFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState.RevenueTimeout;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueFailState;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.RevenueViewKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A)\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0011²\u0006\f\u0010\n\u001A\u00020\t8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\f\u001A\u00020\u000B8\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u000E\u001A\u00020\r8\nX\u008A\u0084\u0002²\u0006\f\u0010\u0010\u001A\u00020\u000F8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "navActions", "Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;", "blogViewModel", "Lcom/kakao/tistory/presentation/screen/revenue/RevenueViewModel;", "viewModel", "", "RevenueScreen", "(Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;Lcom/kakao/tistory/presentation/screen/revenue/RevenueViewModel;Landroidx/compose/runtime/Composer;II)V", "", "collapsedFraction", "", "showVendorListBottomSheet", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "blogUiState", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueUiState;", "uiState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueScreen.kt\ncom/kakao/tistory/presentation/screen/revenue/RevenueScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,238:1\n46#2,7:239\n86#3,6:246\n1223#4,6:252\n1223#4,6:258\n1223#4,6:264\n1223#4,6:306\n1223#4,6:313\n1223#4,6:333\n1223#4,6:345\n1223#4,6:351\n1223#4,6:396\n85#5:270\n82#5,6:271\n88#5:305\n92#5:343\n85#5:358\n82#5,6:359\n88#5:393\n92#5:405\n78#6,6:277\n85#6,4:292\n89#6,2:302\n93#6:342\n78#6,6:365\n85#6,4:380\n89#6,2:390\n93#6:404\n368#7,9:283\n377#7:304\n378#7,2:340\n368#7,9:371\n377#7:392\n378#7,2:402\n4032#8,6:296\n4032#8,6:384\n77#9:312\n77#9:344\n1240#10:319\n1039#10,6:320\n1240#10:326\n1039#10,6:327\n1240#10:339\n148#11:357\n148#11:394\n1#12:395\n81#13:406\n81#13:407\n107#13,2:408\n81#13:410\n81#13:411\n*S KotlinDebug\n*F\n+ 1 RevenueScreen.kt\ncom/kakao/tistory/presentation/screen/revenue/RevenueScreenKt\n*L\n45#1:239,7\n45#1:246,6\n50#1:252,6\n56#1:258,6\n63#1:264,6\n99#1:306,6\n111#1:313,6\n140#1:333,6\n167#1:345,6\n184#1:351,6\n233#1:396,6\n68#1:270\n68#1:271,6\n68#1:305\n68#1:343\n213#1:358\n213#1:359,6\n213#1:393\n213#1:405\n68#1:277,6\n68#1:292,4\n68#1:302,2\n68#1:342\n213#1:365,6\n213#1:380,4\n213#1:390,2\n213#1:404\n68#1:283,9\n68#1:304\n68#1:340,2\n213#1:371,9\n213#1:392\n213#1:402,2\n68#1:296,6\n213#1:384,6\n109#1:312\n165#1:344\n119#1:319\n120#1:320,6\n130#1:326\n131#1:327,6\n147#1:339\n216#1:357\n226#1:394\n50#1:406\n56#1:407\n56#1:408,2\n60#1:410\n61#1:411\n*E\n"})
public final class RevenueScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RevenueScreen(@NotNull NavActions navActions0, @NotNull BlogViewModel blogViewModel0, @Nullable RevenueViewModel revenueViewModel0, @Nullable Composer composer0, int v, int v1) {
        State state3;
        MutableState mutableState1;
        RevenueViewModel revenueViewModel1;
        int v2;
        Intrinsics.checkNotNullParameter(navActions0, "navActions");
        Intrinsics.checkNotNullParameter(blogViewModel0, "blogViewModel");
        Composer composer1 = composer0.startRestartGroup(0xD2A68E40);
        if((v1 & 4) == 0) {
            revenueViewModel1 = revenueViewModel0;
            v2 = v;
        }
        else {
            composer1.startReplaceableGroup(0x70B323C8);
            ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, LocalViewModelStoreOwner.$stable);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner0, composer1, 0);
            composer1.startReplaceableGroup(0x671A9C9B);
            CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
            ViewModel viewModel0 = ViewModelKt.viewModel(RevenueViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            v2 = v & -897;
            revenueViewModel1 = (RevenueViewModel)viewModel0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD2A68E40, v2, -1, "com.kakao.tistory.presentation.screen.revenue.RevenueScreen (RevenueScreen.kt:45)");
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, composer1, TopAppBarDefaults.$stable << 12, 15);
        composer1.startReplaceGroup(0xD2279A0D);
        State state0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new b0(topAppBarScrollBehavior0));
            composer1.updateRememberedValue(state0);
        }
        MutableState mutableState0 = b.a(composer1, 0xD227AC10);
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        State state1 = SnapshotStateKt.collectAsState(blogViewModel0.getUiState(), null, composer1, 8, 1);
        State state2 = SnapshotStateKt.collectAsState(revenueViewModel1.getUiState(), null, composer1, 8, 1);
        ViewState viewState0 = ((BlogUiState)state1.getValue()).getState();
        composer1.startReplaceGroup(0xD227C699);
        boolean z = composer1.changed(state1);
        boolean z1 = composer1.changed(state2);
        p p0 = composer1.rememberedValue();
        if(z || z1 || p0 == composer$Companion0.getEmpty()) {
            p0 = new p(state1, state2, null);
            composer1.updateRememberedValue(p0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(viewState0, p0, composer1, 0x40);
        Modifier modifier0 = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), topAppBarScrollBehavior0.getNestedScrollConnection(), null, 2, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
        boolean z2 = Intrinsics.areEqual(((RevenueUiState)state2.getValue()).getFailState(), Failed.INSTANCE);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-937171084, true, new r(navActions0), composer1, 54);
        ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(1651666610, true, new s(state2), composer1, 54);
        Failed revenueFailState$Failed0 = Failed.INSTANCE;
        TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(topAppBarScrollBehavior0, ComposableSingletons.RevenueScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), null, z2, composableLambda0, null, composableLambda1, 0L, composer1, 14180400, 36);
        composer1.startReplaceGroup(0x7A0AA3);
        if(Intrinsics.areEqual(((RevenueUiState)state2.getValue()).getFailState(), revenueFailState$Failed0)) {
            mutableState1 = mutableState0;
        }
        else {
            Vendor vendor0 = ((RevenueUiState)state2.getValue()).getSelectedVendor();
            float f = ((Number)state0.getValue()).floatValue();
            composer1.startReplaceGroup(8004181);
            t t0 = composer1.rememberedValue();
            if(t0 == composer$Companion0.getEmpty()) {
                mutableState1 = mutableState0;
                t0 = new t(mutableState1);
                composer1.updateRememberedValue(t0);
            }
            else {
                mutableState1 = mutableState0;
            }
            composer1.endReplaceGroup();
            RevenueViewKt.SelectedAdBox(vendor0, f, t0, composer1, 0x180);
        }
        composer1.endReplaceGroup();
        RevenueFailState revenueFailState0 = ((RevenueUiState)state2.getValue()).getFailState();
        if(Intrinsics.areEqual(revenueFailState0, revenueFailState$Failed0)) {
            composer1.startReplaceGroup(0xECD8F16);
            ErrorModel errorModel0 = new ErrorModel();
            boolean z3 = ((Boolean)composer1.consume(MainAppKt.getLocalOnlineState())).booleanValue();
            composer1.startReplaceGroup(8018098);
            state3 = state2;
            boolean z4 = composer1.changed(state3);
            u u0 = composer1.rememberedValue();
            if(z4 || u0 == composer$Companion0.getEmpty()) {
                u0 = new u(state3);
                composer1.updateRememberedValue(u0);
            }
            composer1.endReplaceGroup();
            CommonExceptionViewKt.CommonExceptionView(errorModel0, false, null, z3, u0, composer1, 56, 4);
        }
        else {
            String s = "";
            state3 = state2;
            if(Intrinsics.areEqual(revenueFailState0, RevenueFailed.INSTANCE)) {
                composer1.startReplaceGroup(0xED35A9B);
                composer1.startReplaceGroup(8024606);
                Builder annotatedString$Builder0 = new Builder(0, 1, null);
                composer1.startReplaceGroup(8025834);
                int v4 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFA, null));
                try {
                    annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.revenue_vendor_failed_text_2, composer1, 0));
                }
                finally {
                    annotatedString$Builder0.pop(v4);
                }
                composer1.endReplaceGroup();
                annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.revenue_vendor_failed_text_3, composer1, 0));
                AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
                composer1.endReplaceGroup();
                RevenueScreenKt.a(null, annotatedString0, null, composer1, 0, 5);
            }
            else if(Intrinsics.areEqual(revenueFailState0, RevenueTimeout.INSTANCE)) {
                composer1.startReplaceGroup(0xEDB0DA6);
                composer1.startReplaceGroup(8040777);
                Builder annotatedString$Builder1 = new Builder(0, 1, null);
                composer1.startReplaceGroup(8042005);
                int v6 = annotatedString$Builder1.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFA, null));
                try {
                    Vendor vendor1 = ((RevenueUiState)state3.getValue()).getSelectedVendor();
                    String s1 = vendor1 == null ? null : StringResources_androidKt.stringResource(vendor1.getTitle(), composer1, 0);
                    if(s1 != null) {
                        s = s1;
                    }
                    annotatedString$Builder1.append(s);
                }
                finally {
                    annotatedString$Builder1.pop(v6);
                }
                composer1.endReplaceGroup();
                annotatedString$Builder1.append(StringResources_androidKt.stringResource(string.revenue_vendor_failed_text_4, composer1, 0));
                AnnotatedString annotatedString1 = annotatedString$Builder1.toAnnotatedString();
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(0x7AF00A);
                boolean z5 = composer1.changed(state3);
                v v8 = composer1.rememberedValue();
                if(z5 || v8 == composer$Companion0.getEmpty()) {
                    v8 = new v(state3);
                    composer1.updateRememberedValue(v8);
                }
                composer1.endReplaceGroup();
                RevenueScreenKt.a(null, annotatedString1, v8, composer1, 0, 1);
            }
            else if(revenueFailState0 instanceof RevenueAnotherFailed) {
                composer1.startReplaceGroup(249911059);
                Builder annotatedString$Builder2 = new Builder(0, 1, null);
                String s2 = ((RevenueAnotherFailed)revenueFailState0).getMessage();
                if(s2 != null) {
                    s = s2;
                }
                annotatedString$Builder2.append(s);
                RevenueScreenKt.a(((RevenueAnotherFailed)revenueFailState0).getTitle(), annotatedString$Builder2.toAnnotatedString(), null, composer1, 0, 4);
            }
            else {
                composer1.startReplaceGroup(250133081);
                RevenueScreenKt.a(((RevenueUiState)state3.getValue()), composer1, 0);
            }
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        composer1.startReplaceGroup(-769037448);
        if(((RevenueUiState)state3.getValue()).isLoading()) {
            LoadingDialogKt.LoadingDialog(composer1, 0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(-769034934);
        if(((Boolean)mutableState1.getValue()).booleanValue()) {
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composer1.startReplaceGroup(-769031333);
            w w0 = composer1.rememberedValue();
            if(w0 == composer$Companion0.getEmpty()) {
                w0 = new w(mutableState1);
                composer1.updateRememberedValue(w0);
            }
            composer1.endReplaceGroup();
            TistoryComposeBottomSheetKt.TistoryComposeBottomSheet(false, w0, ComposableLambdaKt.rememberComposableLambda(0xDA88E189, true, new y(state3, context0, mutableState1), composer1, 54), composer1, 0x1B0, 1);
        }
        composer1.endReplaceGroup();
        Vendor vendor2 = ((RevenueUiState)state3.getValue()).getSelectedVendor();
        composer1.startReplaceGroup(-769013079);
        boolean z6 = composer1.changed(state3);
        z z7 = composer1.rememberedValue();
        if(z6 || z7 == composer$Companion0.getEmpty()) {
            z7 = new z(state3, null);
            composer1.updateRememberedValue(z7);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(vendor2, z7, composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(navActions0, blogViewModel0, revenueViewModel1, v, v1));
        }
    }

    public static final void a(RevenueUiState revenueUiState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1B02B18C);
        int v1 = (v & 14) == 0 ? (composer1.changed(revenueUiState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1B02B18C, v1, -1, "com.kakao.tistory.presentation.screen.revenue.SelectedRevenueScreen (RevenueScreen.kt:191)");
            }
            if(revenueUiState0.getSelectedVendor() == Vendor.SUPPORT) {
                composer1.startReplaceGroup(729070135);
                DonationRevenueScreenKt.DonationRevenueScreen(revenueUiState0.getRevenueSupport(), composer1, 0);
            }
            else {
                composer1.startReplaceGroup(728560402);
                AdRevenueScreenKt.AdRevenueScreen(revenueUiState0.getSelectedVendor(), revenueUiState0.getRevenueSummary(), revenueUiState0.getRevenueTrendGraph(), revenueUiState0.getRevenueGraphDetailInfo(), revenueUiState0.getSelectedGraphPosition(), revenueUiState0.getGranularity(), revenueUiState0.getOnClickGraphPeriodType(), revenueUiState0.getOnClickGraphItem(), composer1, 0x200);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(revenueUiState0, v));
        }
    }

    public static final void a(String s, AnnotatedString annotatedString0, Function0 function00, Composer composer0, int v, int v1) {
        int v4;
        Function0 function01;
        String s1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2033508497);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            s1 = s;
        }
        else if((v & 14) == 0) {
            s1 = s;
            v2 = (composer1.changed(s1) ? 4 : 2) | v;
        }
        else {
            s1 = s;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(annotatedString0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function01 = function00;
        }
        else if((v & 0x380) == 0) {
            function01 = function00;
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        else {
            function01 = function00;
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                s1 = null;
            }
            Function0 function02 = (v1 & 4) == 0 ? function01 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2033508497, v2, -1, "com.kakao.tistory.presentation.screen.revenue.FailedRevenueScreen (RevenueScreen.kt:211)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 18.0f);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 0xB2AF7CC7);
            String s2 = s1 == null ? StringResources_androidKt.stringResource(string.revenue_vendor_failed_text_1, composer1, 0) : s1;
            composer1.endReplaceGroup();
            androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
            TextKt.Text--4IGK_g(s2, null, 0L, 0x141500000L, null, fontWeight$Companion0.getNormal(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0x1B0D80, 0, 0x1FF92);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 20.0f), composer1, 6);
            AnnotatedString annotatedString1 = kotlin.text.p.isBlank(annotatedString0.getText()) ? null : annotatedString0;
            composer1.startReplaceGroup(0xB2AFA532);
            if(annotatedString1 == null) {
                v4 = v2;
            }
            else {
                v4 = v2;
                TextKt.Text-IbK3jfQ(annotatedString0, null, 0L, 0x141500000L, null, fontWeight$Companion0.getNormal(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer1, v4 >> 3 & 14 | 0x1B0D80, 0, 0x3FF92);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xB2AFB816);
            if(function02 != null) {
                composer1.startReplaceGroup(0xB2AFBED4);
                n n0 = composer1.rememberedValue();
                if((v4 & 0x380) == 0x100 || n0 == Composer.Companion.getEmpty()) {
                    n0 = new n(function02);
                    composer1.updateRememberedValue(n0);
                }
                composer1.endReplaceGroup();
                CommonExceptionViewKt.RefreshButton(n0, composer1, 0);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(s1, annotatedString0, function01, v, v1));
        }
    }

    public static final void access$RevenueScreen$lambda$4(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final BlogUiState access$RevenueScreen$lambda$5(State state0) {
        return (BlogUiState)state0.getValue();
    }

    public static final RevenueUiState access$RevenueScreen$lambda$6(State state0) {
        return (RevenueUiState)state0.getValue();
    }
}

