package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\u001A\u001D\u0010\u0003\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u001D\u0010\u0005\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001A?\u0010\f\u001A\u00020\u00012\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001A/\u0010\u000E\u001A\u00020\u00012\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000E\u0010\u000F\u001A%\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\b2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0013\u001A\u00020\b8\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "NavigationBack", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NavigationClose", "", "blogImage", "", "isMine", "onClickSearch", "onClickBlog", "MainActions", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BlogImageButton", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "completeEnabled", "CompleteButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "pressed", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryTopAppBarButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryTopAppBarButton.kt\ncom/kakao/tistory/presentation/widget/common/TistoryTopAppBarButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,143:1\n148#2:144\n148#2:145\n148#2:146\n148#2:187\n148#2:194\n158#2:195\n148#2:196\n148#2:198\n98#3:147\n95#3,6:148\n101#3:182\n105#3:186\n78#4,6:154\n85#4,4:169\n89#4,2:179\n93#4:185\n368#5,9:160\n377#5:181\n378#5,2:183\n4032#6,6:173\n1223#7,6:188\n77#8:197\n81#9:199\n*S KotlinDebug\n*F\n+ 1 TistoryTopAppBarButton.kt\ncom/kakao/tistory/presentation/widget/common/TistoryTopAppBarButtonKt\n*L\n33#1:144\n43#1:145\n54#1:146\n70#1:187\n100#1:194\n103#1:195\n105#1:196\n134#1:198\n54#1:147\n54#1:148,6\n54#1:182\n54#1:186\n54#1:154,6\n54#1:169,4\n54#1:179,2\n54#1:185\n54#1:160,9\n54#1:181\n54#1:183,2\n54#1:173,6\n96#1:188,6\n129#1:197\n97#1:199\n*E\n"})
public final class TistoryTopAppBarButtonKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogImageButton(@Nullable String s, boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        String s1;
        Intrinsics.checkNotNullParameter(function00, "onClickBlog");
        Composer composer1 = composer0.startRestartGroup(-995394098);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995394098, v1, -1, "com.kakao.tistory.presentation.widget.common.BlogImageButton (TistoryTopAppBarButton.kt:60)");
            }
            if(z) {
                composer1.startReplaceGroup(-601796173);
                s1 = StringResources_androidKt.stringResource(string.content_desc_appbar_menu_mine, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0xDC228BD1);
                s1 = StringResources_androidKt.stringResource(string.content_desc_appbar_menu_others, composer1, 0);
            }
            composer1.endReplaceGroup();
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(Modifier.Companion, 48.0f), false, null, null, ComposableLambdaKt.rememberComposableLambda(0x67B3E62B, true, new m3(s, s1), composer1, 54), composer1, v1 >> 6 & 14 | 0x30030, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n3(s, z, function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CompleteButton(boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xEE220EED);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEE220EED, v1, -1, "com.kakao.tistory.presentation.widget.common.CompleteButton (TistoryTopAppBarButton.kt:94)");
            }
            composer1.startReplaceGroup(0xFCF16359);
            MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
            if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
                mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource0);
            }
            composer1.endReplaceGroup();
            State state0 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource0, composer1, 6);
            Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 0.0f, 32.0f, 1, null);
            BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, 0L);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            PaddingValues paddingValues0 = PaddingKt.PaddingValues-YgX7TsA(16.0f, 8.0f);
            boolean z1 = !((Boolean)state0.getValue()).booleanValue();
            ButtonKt.TextButton(function00, modifier0, z, roundedCornerShape0, ButtonDefaults.INSTANCE.textButtonColors-ro_MJ88(0L, 0L, 0L, 0L, composer1, ButtonDefaults.$stable << 12 | 0xC30, 4), null, borderStroke0, paddingValues0, mutableInteractionSource0, ComposableSingletons.TistoryTopAppBarButtonKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 >> 3 & 14 | 0x36D80030 | v1 << 6 & 0x380, 0x20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o3(z, function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MainActions(@Nullable String s, boolean z, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClickSearch");
        Intrinsics.checkNotNullParameter(function01, "onClickBlog");
        Composer composer1 = composer0.startRestartGroup(0xF737815B);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                z = true;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF737815B, v2, -1, "com.kakao.tistory.presentation.widget.common.MainActions (TistoryTopAppBarButton.kt:52)");
            }
            Modifier modifier0 = OffsetKt.offset-VpY3zN4$default(Modifier.Companion, 10.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TistoryTopAppBarButtonKt.a(function00, composer1, v2 >> 6 & 14);
            TistoryTopAppBarButtonKt.BlogImageButton(s, z, function01, composer1, v2 & 0x7E | v2 >> 3 & 0x380);
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
            scopeUpdateScope0.updateScope(new p3(s, z, function00, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NavigationBack(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xF5903A79);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF5903A79, v1, -1, "com.kakao.tistory.presentation.widget.common.NavigationBack (TistoryTopAppBarButton.kt:27)");
            }
            int v2 = drawable.ic_navi_back_b;
            String s = StringResources_androidKt.stringResource(string.content_desc_back, composer1, 0);
            TistoryTopAppBarButtonKt.a(function00, v2, OffsetKt.offset-VpY3zN4$default(Modifier.Companion, -8.0f, 0.0f, 2, null), 0L, s, composer1, v1 & 14 | 0x180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q3(function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NavigationClose(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x80EE904C);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x80EE904C, v1, -1, "com.kakao.tistory.presentation.widget.common.NavigationClose (TistoryTopAppBarButton.kt:37)");
            }
            int v2 = drawable.ic_navi_close_b;
            String s = StringResources_androidKt.stringResource(string.content_desc_close, composer1, 0);
            TistoryTopAppBarButtonKt.a(function00, v2, OffsetKt.offset-VpY3zN4$default(Modifier.Companion, -8.0f, 0.0f, 2, null), 0L, s, composer1, v1 & 14 | 0x180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r3(function00, v));
        }
    }

    public static final void a(Function0 function00, int v, Modifier modifier0, long v1, String s, Composer composer0, int v2, int v3) {
        String s1;
        Modifier modifier1;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xB09F31B8);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 8) == 0) {
                v5 = v1;
                v6 = composer1.changed(v5) ? 0x800 : 0x400;
            }
            else {
                v5 = v1;
                v6 = 0x400;
            }
            v4 |= v6;
        }
        else {
            v5 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(s) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v4) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 8) != 0) {
                    v5 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) == 0) {
                    v7 = v5;
                    s1 = s;
                }
                else {
                    s1 = null;
                    v7 = v5;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                modifier1 = modifier0;
                v7 = v5;
                s1 = s;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB09F31B8, v4, -1, "com.kakao.tistory.presentation.widget.common.TopAppBarIconButton (TistoryTopAppBarButton.kt:130)");
            }
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(modifier1, 48.0f), false, null, null, ComposableLambdaKt.rememberComposableLambda(0xD0B763BB, true, new t3(v, s1, v7), composer1, 54), composer1, v4 & 14 | 0x30000, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v5 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u3(function00, v, modifier1, v5, s1, v2, v3));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBF56D13A);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBF56D13A, v1, -1, "com.kakao.tistory.presentation.widget.common.SearchButton (TistoryTopAppBarButton.kt:81)");
            }
            TistoryTopAppBarButtonKt.a(function00, drawable.ic_bar_search, null, 0L, StringResources_androidKt.stringResource(string.content_desc_search, composer1, 0), composer1, v1 & 14, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s3(function00, v));
        }
    }
}

