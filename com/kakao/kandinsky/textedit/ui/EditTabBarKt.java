package com.kakao.kandinsky.textedit.ui;

import aa.m;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.g;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.c3;
import androidx.compose.material3.wm;
import androidx.compose.material3.y8;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import ca.h;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.textedit.R.drawable;
import com.kakao.kandinsky.textedit.R.string;
import eb.d;
import eb.e;
import eb.f;
import eb.i;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001Ak\u0010\f\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/kandinsky/textedit/ui/EditState;", "currentEditState", "", "showWaterMark", "selectWaterMark", "Lkotlin/Function0;", "", "onKeyboardClick", "Lkotlin/Function1;", "onMenuClick", "onClickWaterMark", "onClickFold", "EditTabBar", "(Lcom/kakao/kandinsky/textedit/ui/EditState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "textedit_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditTabBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTabBar.kt\ncom/kakao/kandinsky/textedit/ui/EditTabBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n148#2:163\n148#2:164\n148#2:221\n148#2:222\n148#2:229\n148#2:230\n98#3:165\n95#3,6:166\n101#3:200\n105#3:212\n78#4,6:172\n85#4,4:187\n89#4,2:197\n93#4:211\n368#5,9:178\n377#5:199\n378#5,2:209\n4032#6,6:191\n1855#7:201\n1856#7:208\n1223#8,6:202\n1223#8,6:213\n1223#8,6:223\n77#9:219\n1#10:220\n*S KotlinDebug\n*F\n+ 1 EditTabBar.kt\ncom/kakao/kandinsky/textedit/ui/EditTabBarKt\n*L\n48#1:163\n49#1:164\n131#1:221\n137#1:222\n148#1:229\n153#1:230\n45#1:165\n45#1:166,6\n45#1:200\n45#1:212\n45#1:172,6\n45#1:187,4\n45#1:197,2\n45#1:211\n45#1:178,9\n45#1:199\n45#1:209,2\n45#1:191,6\n54#1:201\n54#1:208\n58#1:202,6\n115#1:213,6\n140#1:223,6\n131#1:219\n*E\n"})
public final class EditTabBarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EditTabBar(@NotNull EditState editState0, boolean z, boolean z1, @NotNull Function0 function00, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(editState0, "currentEditState");
        Intrinsics.checkNotNullParameter(function00, "onKeyboardClick");
        Intrinsics.checkNotNullParameter(function10, "onMenuClick");
        Intrinsics.checkNotNullParameter(function11, "onClickWaterMark");
        Intrinsics.checkNotNullParameter(function01, "onClickFold");
        Composer composer1 = composer0.startRestartGroup(947287002);
        int v1 = (v & 14) == 0 ? (composer1.changed(editState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v & 0xE000) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changedInstance(function11) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v1) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947287002, v1, -1, "com.kakao.kandinsky.textedit.ui.EditTabBar (EditTabBar.kt:43)");
            }
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 44.0f), 9.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            EditTabBarKt.b(EditState.KEYBOARD, editState0 == EditState.KEYBOARD, function00, composer1, v1 >> 3 & 0x380 | 6);
            composer1.startReplaceGroup(0x3F1664A5);
            for(Object object0: CollectionsKt__CollectionsKt.listOf(new EditState[]{EditState.FONT, EditState.TEXT_COLOR, EditState.BACKGROUND_COLOR})) {
                EditState editState1 = (EditState)object0;
                composer1.startReplaceGroup(294410056);
                boolean z2 = composer1.changed(editState1);
                m m0 = composer1.rememberedValue();
                if((v1 & 0xE000) == 0x4000 || z2 || m0 == Composer.Companion.getEmpty()) {
                    m0 = new m(16, function10, editState1);
                    composer1.updateRememberedValue(m0);
                }
                composer1.endReplaceGroup();
                EditTabBarKt.b(editState1, editState0 == editState1, m0, composer1, 0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x3F16656A);
            if(z) {
                EditTabBarKt.d(z1, function11, composer1, v1 >> 6 & 14 | v1 >> 12 & 0x70);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, Modifier.Companion, 1.0f, false, 2, null), composer1, 0);
            EditTabBarKt.a(function01, composer1, v1 >> 18 & 14);
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
            scopeUpdateScope0.updateScope(new wm(editState0, z, z1, function00, function10, function11, function01, v, 1));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF0A51F4C);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF0A51F4C, v1, -1, "com.kakao.kandinsky.textedit.ui.FoldButton (EditTabBar.kt:97)");
            }
            EditTabBarKt.c(false, false, drawable.tab_fold, string.cd_menu_fold, function00, composer1, v1 << 12 & 0xE000, 3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function00, v, 0));
        }
    }

    public static final void access$MenuButton(EditState editState0, boolean z, Function0 function00, Composer composer0, int v) {
        EditTabBarKt.b(editState0, z, function00, composer0, v);
    }

    public static final void access$PreviewEditTabBar(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1432050751);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1432050751, v, -1, "com.kakao.kandinsky.textedit.ui.PreviewEditTabBar (EditTabBar.kt:23)");
            }
            EditTabBarKt.EditTabBar(EditState.KEYBOARD, true, false, e.x, f.x, f.y, e.y, composer1, 0x1B6DB6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 3));
        }
    }

    public static final void access$PreviewTabButton(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC22DF496);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC22DF496, v, -1, "com.kakao.kandinsky.textedit.ui.PreviewTabButton (EditTabBar.kt:74)");
            }
            EditTabBarKt.b(EditState.KEYBOARD, false, e.z, composer1, 438);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 4));
        }
    }

    public static final void b(EditState editState0, boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x34C968E1);
        int v1 = (v & 14) == 0 ? (composer1.changed(editState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x34C968E1, v1, -1, "com.kakao.kandinsky.textedit.ui.MenuButton (EditTabBar.kt:85)");
            }
            EditTabBarKt.c(false, z, (z ? editState0.getSelectedIcon() : editState0.getDefaultIcon()), editState0.getContentDescription(), function00, composer1, v1 & 0x70 | v1 << 6 & 0xE000, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(editState0, z, function00, v, 4));
        }
    }

    public static final void c(boolean z, boolean z1, int v, int v1, Function0 function00, Composer composer0, int v2, int v3) {
        boolean z3;
        Modifier modifier2;
        boolean z2;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xE07BDBC2);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            z2 = z1;
        }
        else if((v2 & 0x70) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x20 : 16);
        }
        else {
            z2 = z1;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v4) != 9362 || !composer1.getSkipping()) {
            z3 = (v3 & 1) == 0 ? z : true;
            boolean z4 = (v3 & 2) == 0 ? z2 : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE07BDBC2, v4, -1, "com.kakao.kandinsky.textedit.ui.TabButton (EditTabBar.kt:128)");
            }
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(2.0f);
            long v5 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU();
            Modifier modifier0 = Modifier.Companion;
            Modifier modifier1 = PaddingKt.padding-VpY3zN4(modifier0, 3.0f, 2.0f);
            composer1.startReplaceGroup(355951660);
            if(z4) {
                composer1.startReplaceGroup(0x15376464);
                boolean z5 = composer1.changed(v5);
                boolean z6 = composer1.changed(f);
                y8 y80 = composer1.rememberedValue();
                if(z5 || z6 || y80 == Composer.Companion.getEmpty()) {
                    y80 = new y8(v5, f);
                    composer1.updateRememberedValue(y80);
                }
                composer1.endReplaceGroup();
                modifier2 = DrawModifierKt.drawBehind(modifier0, y80);
            }
            else {
                modifier2 = modifier0;
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = PaddingKt.padding-3ABfNKs(modifier1.then(modifier2), 6.0f);
            if(!z3) {
                modifier0 = AlphaKt.alpha(modifier0, 0.7f);
            }
            KDButtonKt.KDIconButton(function00, SizeKt.size-3ABfNKs(modifier3.then(modifier0), 28.0f), z3, null, null, ComposableLambdaKt.rememberComposableLambda(0x10B3D038, true, new eb.g(v, v1), composer1, 54), composer1, v4 >> 12 & 14 | 0x30000 | v4 << 6 & 0x380, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new eb.h(z3, z2, v, v1, function00, v2, v3));
        }
    }

    public static final void d(boolean z, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7F538C90);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7F538C90, v1, -1, "com.kakao.kandinsky.textedit.ui.WaterMarkButton (EditTabBar.kt:109)");
            }
            int v2 = z ? drawable.tab_watermark_on : drawable.tab_watermark;
            int v3 = string.cd_menu_watermark;
            composer1.startReplaceGroup(0x8386B79);
            c3 c30 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 14) == 4 ? 1 : 0)) != 0 || c30 == Composer.Companion.getEmpty()) {
                c30 = new c3(1, z, function10);
                composer1.updateRememberedValue(c30);
            }
            composer1.endReplaceGroup();
            EditTabBarKt.c(false, z, v2, v3, c30, composer1, v1 << 3 & 0x70, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(z, function10, v, 0));
        }
    }
}

