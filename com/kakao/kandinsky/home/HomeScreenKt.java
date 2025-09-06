package com.kakao.kandinsky.home;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.y;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import com.kakao.kandinsky.designsystem.common.KDButtonDefaults;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.designsystem.common.MenuListKt;
import com.kakao.kandinsky.designsystem.common.PreviewSpacerKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.designsystem.theme.ColorKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import eb.d;
import ga.c;
import ia.b;
import ia.f;
import ia.g;
import ia.h;
import ia.i;
import ia.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0098\u0001\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\t0\b2!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\t0\f2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "scrollStable", "", "currentIndex", "totalCount", "", "Lcom/kakao/kandinsky/home/contract/HomeMenu;", "menu", "Lkotlin/Function0;", "", "onClickConfirm", "onClickFinish", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onClickMenu", "onClickImagePick", "Landroidx/compose/ui/geometry/Rect;", "updatePreviewBounds", "HomeScreen", "(Landroidx/compose/foundation/ScrollState;IILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "home_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\ncom/kakao/kandinsky/home/HomeScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,218:1\n77#2:219\n77#2:220\n148#3:221\n148#3:222\n148#3:223\n148#3:224\n148#3:225\n148#3:226\n148#3:227\n148#3:228\n148#3:229\n148#3:230\n148#3:231\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\ncom/kakao/kandinsky/home/HomeScreenKt\n*L\n59#1:219\n69#1:220\n109#1:221\n111#1:222\n117#1:223\n122#1:224\n137#1:225\n139#1:226\n144#1:227\n165#1:228\n167#1:229\n173#1:230\n178#1:231\n*E\n"})
public final class HomeScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeScreen(@Nullable ScrollState scrollState0, int v, int v1, @NotNull List list0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function1 function10, @NotNull Function0 function02, @NotNull Function1 function11, @Nullable Composer composer0, int v2, int v3) {
        int v4;
        ScrollState scrollState1;
        Intrinsics.checkNotNullParameter(list0, "menu");
        Intrinsics.checkNotNullParameter(function00, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function01, "onClickFinish");
        Intrinsics.checkNotNullParameter(function10, "onClickMenu");
        Intrinsics.checkNotNullParameter(function02, "onClickImagePick");
        Intrinsics.checkNotNullParameter(function11, "updatePreviewBounds");
        Composer composer1 = composer0.startRestartGroup(-1857205947);
        if((v3 & 1) == 0) {
            scrollState1 = scrollState0;
            v4 = v2;
        }
        else {
            scrollState1 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
            v4 = v2 & -15;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1857205947, v4, -1, "com.kakao.kandinsky.home.HomeScreen (HomeScreen.kt:57)");
        }
        composer1.startReplaceGroup(0xD08101B8);
        if(composer1.consume(OrientationKt.getLocalOrientation()) == Orientation.Landscape) {
            BoxKt.Box(PreviewSpacerKt.onBoundsChanged(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), function11), composer1, 0);
        }
        composer1.endReplaceGroup();
        Function1 function12 = composer1.consume(OrientationKt.getLocalOrientation()) == Orientation.Portrait ? function11 : b.z;
        RotatableScreenKt.RotatableScreen-FHprtrg(null, null, function12, ComposableLambdaKt.rememberComposableLambda(-2072219101, true, new g(function01, v1, v, function02, function00), composer1, 54), Color.Companion.getTransparent-0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(0x11D9F925, true, new y(scrollState1, list0, 2, function10), composer1, 54), composer1, 0x36C00, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(scrollState1, v, v1, list0, function00, function01, function10, function02, function11, v2, v3));
        }
    }

    public static final void access$BottomBar(ScrollState scrollState0, List list0, Function1 function10, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x7EA29A31);
        if((v1 & 1) == 0) {
            v2 = v;
        }
        else {
            scrollState0 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
            v2 = v & -15;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7EA29A31, v2, -1, "com.kakao.kandinsky.home.BottomBar (HomeScreen.kt:204)");
        }
        MenuListKt.MenuList(OrientationKt.byOrientation$default(Modifier.Companion, f.w, null, 2, null), scrollState0, ComposableLambdaKt.rememberComposableLambda(0x965E87DD, true, new c(list0, function10), composer1, 54), composer1, v2 << 3 & 0x70 | 0x180, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(v, scrollState0, v1, list0, 10, function10));
        }
    }

    public static final void access$CancelButton(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2078700040);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078700040, v1, -1, "com.kakao.kandinsky.home.CancelButton (HomeScreen.kt:104)");
            }
            Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4(Modifier.Companion, 48.0f, 28.0f);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            long v2 = ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable));
            Modifier modifier1 = ShadowKt.shadow-s4CzXII$default(modifier0, 4.0f, roundedCornerShape0, false, ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable)), v2, 4, null);
            RoundedCornerShape roundedCornerShape1 = RoundedCornerShapeKt.RoundedCornerShape(100);
            BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null));
            long v3 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
            long v4 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getBackground-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            KDButtonKt.KDButton(function00, modifier1, false, roundedCornerShape1, KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, v4, v3, 0L, 0L, composer1, KDButtonDefaults.$stable << 15, 25), borderStroke0, PaddingKt.PaddingValues-YgX7TsA(12.0f, 5.0f), null, ComposableSingletons.HomeScreenKt.INSTANCE.getLambda-2$home_release(), composer1, v1 & 14 | 0x6180000, 0x84);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function00, v, 1));
        }
    }

    public static final void access$ConfirmButton(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF1F2569E);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF1F2569E, v1, -1, "com.kakao.kandinsky.home.ConfirmButton (HomeScreen.kt:131)");
            }
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4(Modifier.Companion, 48.0f, 28.0f);
            long v2 = ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable));
            Modifier modifier1 = ShadowKt.shadow-s4CzXII$default(modifier0, 4.0f, roundedCornerShape0, false, ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable)), v2, 4, null);
            PaddingValues paddingValues0 = PaddingKt.PaddingValues-YgX7TsA(12.0f, 5.0f);
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSecondary-0d7_KjU();
            long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU();
            KDButtonKt.KDButton(function00, modifier1, false, roundedCornerShape0, KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, v4, v3, 0L, 0L, composer1, KDButtonDefaults.$stable << 15, 25), null, paddingValues0, null, ComposableSingletons.HomeScreenKt.INSTANCE.getLambda-3$home_release(), composer1, v1 & 14 | 0x6180000, 0xA4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function00, v, 2));
        }
    }

    public static final void access$ImageIndex(int v, int v1, Function0 function00, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-2096984905);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2096984905, v3, -1, "com.kakao.kandinsky.home.ImageIndex (HomeScreen.kt:160)");
            }
            Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4(Modifier.Companion, 48.0f, 28.0f);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            long v4 = ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable));
            Modifier modifier1 = ShadowKt.shadow-s4CzXII$default(modifier0, 4.0f, roundedCornerShape0, false, ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable)), v4, 4, null);
            RoundedCornerShape roundedCornerShape1 = RoundedCornerShapeKt.RoundedCornerShape(100);
            BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null));
            long v5 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getBackground-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            long v6 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
            KDButtonKt.KDButton(function00, modifier1, false, roundedCornerShape1, KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, v5, v6, 0L, 0L, composer1, KDButtonDefaults.$stable << 15, 25), borderStroke0, PaddingKt.PaddingValues-YgX7TsA(20.0f, 7.0f), null, ComposableLambdaKt.rememberComposableLambda(0xADF0B5EE, true, new i(v1, v), composer1, 54), composer1, v3 >> 6 & 14 | 0x6180000, 0x84);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(v, v1, v2, function00));
        }
    }

    public static final void access$PreviewHomeScreen(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7D3D8D8F);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7D3D8D8F, v, -1, "com.kakao.kandinsky.home.PreviewHomeScreen (HomeScreen.kt:31)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.HomeScreenKt.INSTANCE.getLambda-1$home_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ca.h(v, 7));
        }
    }
}

