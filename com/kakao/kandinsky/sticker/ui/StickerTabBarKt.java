package com.kakao.kandinsky.sticker.ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.g;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.fc;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.KDButtonDefaults;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import eb.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ya.h;
import ya.i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001AU\u0010\n\u001A\u00020\u00052\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000B\u001AU\u0010\r\u001A\u00020\u00052\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0003\u001A\u00020\u00012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000E\u001AU\u0010\u000F\u001A\u00020\u00052\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0003\u001A\u00020\u00012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\u000F\u0010\u000E¨\u0006\u0010"}, d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "groupList", "selectedGroup", "Lkotlin/Function1;", "", "onClickGroup", "Lkotlin/Function0;", "onClickDelete", "onClickFold", "StickerTabBar", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/sticker/contract/StickerGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "StickerHorizontalTabBar", "(Ljava/util/List;Lcom/kakao/kandinsky/sticker/contract/StickerGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StickerVerticalTabBar", "sticker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStickerTabBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerTabBar.kt\ncom/kakao/kandinsky/sticker/ui/StickerTabBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,172:1\n77#2:173\n148#3:174\n148#3:211\n148#3:212\n148#3:254\n148#3:259\n148#3:296\n148#3:297\n148#3:339\n148#3:344\n148#3:351\n148#3:352\n98#4:175\n95#4,6:176\n101#4:210\n98#4:213\n96#4,5:214\n101#4:247\n105#4:253\n105#4:258\n78#5,6:182\n85#5,4:197\n89#5,2:207\n78#5,6:219\n85#5,4:234\n89#5,2:244\n93#5:252\n93#5:257\n78#5,6:267\n85#5,4:282\n89#5,2:292\n78#5,6:304\n85#5,4:319\n89#5,2:329\n93#5:337\n93#5:342\n368#6,9:188\n377#6:209\n368#6,9:225\n377#6:246\n378#6,2:250\n378#6,2:255\n368#6,9:273\n377#6:294\n368#6,9:310\n377#6:331\n378#6,2:335\n378#6,2:340\n4032#7,6:201\n4032#7,6:238\n4032#7,6:286\n4032#7,6:323\n1855#8,2:248\n1855#8,2:333\n85#9:260\n82#9,6:261\n88#9:295\n85#9:298\n83#9,5:299\n88#9:332\n92#9:338\n92#9:343\n1223#10,6:345\n*S KotlinDebug\n*F\n+ 1 StickerTabBar.kt\ncom/kakao/kandinsky/sticker/ui/StickerTabBarKt\n*L\n34#1:173\n63#1:174\n73#1:211\n74#1:212\n88#1:254\n102#1:259\n112#1:296\n113#1:297\n127#1:339\n136#1:344\n150#1:351\n165#1:352\n61#1:175\n61#1:176,6\n61#1:210\n69#1:213\n69#1:214,5\n69#1:247\n69#1:253\n61#1:258\n61#1:182,6\n61#1:197,4\n61#1:207,2\n69#1:219,6\n69#1:234,4\n69#1:244,2\n69#1:252\n61#1:257\n100#1:267,6\n100#1:282,4\n100#1:292,2\n108#1:304,6\n108#1:319,4\n108#1:329,2\n108#1:337\n100#1:342\n61#1:188,9\n61#1:209\n69#1:225,9\n69#1:246\n69#1:250,2\n61#1:255,2\n100#1:273,9\n100#1:294\n108#1:310,9\n108#1:331\n108#1:335,2\n100#1:340,2\n61#1:201,6\n69#1:238,6\n100#1:286,6\n108#1:323,6\n76#1:248,2\n115#1:333,2\n100#1:260\n100#1:261,6\n100#1:295\n108#1:298\n108#1:299,5\n108#1:332\n108#1:338\n100#1:343\n134#1:345,6\n*E\n"})
public final class StickerTabBarKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Portrait.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Landscape.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StickerHorizontalTabBar(@NotNull List list0, @NotNull StickerGroup stickerGroup0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "groupList");
        Intrinsics.checkNotNullParameter(stickerGroup0, "selectedGroup");
        Intrinsics.checkNotNullParameter(function10, "onClickGroup");
        Intrinsics.checkNotNullParameter(function00, "onClickDelete");
        Intrinsics.checkNotNullParameter(function01, "onClickFold");
        Composer composer1 = composer0.startRestartGroup(0x22A7BA9A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x22A7BA9A, v, -1, "com.kakao.kandinsky.sticker.ui.StickerHorizontalTabBar (StickerTabBar.kt:59)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 44.0f), 0.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            a.t(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = ScrollKt.horizontalScroll$default(modifier$Companion0, ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(RowScopeInstance.INSTANCE.weight(modifier2, 1.0f, true), 8.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.spacedBy-0680j_4(6.0f), alignment$Companion0.getTop(), composer1, 6);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
        Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            a.t(v2, composer1, v2, function21);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier4, composer1, 0x8F4A3528);
        for(Object object0: list0) {
            StickerTabBarKt.c(((StickerGroup)object0), Intrinsics.areEqual(((StickerGroup)object0), stickerGroup0), function10, composer1, v & 0x380);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        StickerTabBarKt.a(function00, composer1, v >> 9 & 14);
        StickerTabBarKt.b(function01, composer1, v >> 12 & 14);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(Modifier.Companion, 8.0f), composer1, 6);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(list0, stickerGroup0, function10, function00, function01, v, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StickerTabBar(@NotNull ImmutableList immutableList0, @NotNull StickerGroup stickerGroup0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(immutableList0, "groupList");
        Intrinsics.checkNotNullParameter(stickerGroup0, "selectedGroup");
        Intrinsics.checkNotNullParameter(function10, "onClickGroup");
        Intrinsics.checkNotNullParameter(function00, "onClickDelete");
        Intrinsics.checkNotNullParameter(function01, "onClickFold");
        Composer composer1 = composer0.startRestartGroup(0x1647128A);
        int v1 = (v & 14) == 0 ? (composer1.changed(immutableList0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(stickerGroup0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1647128A, v1, -1, "com.kakao.kandinsky.sticker.ui.StickerTabBar (StickerTabBar.kt:32)");
            }
            switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                case 1: {
                    composer1.startReplaceGroup(1303159956);
                    StickerTabBarKt.StickerHorizontalTabBar(immutableList0, stickerGroup0, function10, function00, function01, composer1, v1 & 0xFFFE);
                    composer1.endReplaceGroup();
                    break;
                }
                case 2: {
                    composer1.startReplaceGroup(1303160225);
                    StickerTabBarKt.StickerVerticalTabBar(immutableList0, stickerGroup0, function10, function00, function01, composer1, v1 & 0xFFFE);
                    composer1.endReplaceGroup();
                    break;
                }
                default: {
                    composer1.startReplaceGroup(1303160463);
                    composer1.endReplaceGroup();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(immutableList0, stickerGroup0, function10, function00, function01, v, 8));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StickerVerticalTabBar(@NotNull List list0, @NotNull StickerGroup stickerGroup0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "groupList");
        Intrinsics.checkNotNullParameter(stickerGroup0, "selectedGroup");
        Intrinsics.checkNotNullParameter(function10, "onClickGroup");
        Intrinsics.checkNotNullParameter(function00, "onClickDelete");
        Intrinsics.checkNotNullParameter(function01, "onClickFold");
        Composer composer1 = composer0.startRestartGroup(0x22C040AC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x22C040AC, v, -1, "com.kakao.kandinsky.sticker.ui.StickerVerticalTabBar (StickerTabBar.kt:98)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(modifier$Companion0, 44.0f), 0.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            a.t(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = ScrollKt.verticalScroll$default(modifier$Companion0, ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(ColumnScopeInstance.INSTANCE.weight(modifier2, 1.0f, true), 0.0f, 8.0f, 1, null);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.spacedBy-0680j_4(6.0f), alignment$Companion0.getStart(), composer1, 6);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
        Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            a.t(v2, composer1, v2, function21);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier4, composer1, 1370949204);
        for(Object object0: list0) {
            StickerTabBarKt.c(((StickerGroup)object0), Intrinsics.areEqual(((StickerGroup)object0), stickerGroup0), function10, composer1, v & 0x380);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        StickerTabBarKt.a(function00, composer1, v >> 9 & 14);
        StickerTabBarKt.b(function01, composer1, v >> 12 & 14);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(Modifier.Companion, 8.0f), composer1, 6);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(list0, stickerGroup0, function10, function00, function01, v, 1));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD6EFA486);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD6EFA486, v1, -1, "com.kakao.kandinsky.sticker.ui.DeleteAllButton (StickerTabBar.kt:146)");
            }
            Modifier modifier0 = SizeKt.size-VpY3zN4(Modifier.Companion, 40.0f, 44.0f);
            long v2 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            KDButtonKt.KDIconButton(function00, modifier0, false, KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, v2, 0L, 0L, composer1, KDButtonDefaults.$stable << 15, 27), null, ComposableSingletons.StickerTabBarKt.INSTANCE.getLambda-1$sticker_release(), composer1, v1 & 14 | 0x30030, 20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function00, v, 5));
        }
    }

    public static final void access$StickerGroupButton(StickerGroup stickerGroup0, boolean z, Function1 function10, Composer composer0, int v) {
        StickerTabBarKt.c(stickerGroup0, z, function10, composer0, v);
    }

    public static final void b(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-800369939);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-800369939, v1, -1, "com.kakao.kandinsky.sticker.ui.FoldButton (StickerTabBar.kt:161)");
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 40.0f);
            long v2 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            KDButtonKt.KDIconButton(function00, modifier0, false, KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, v2, 0L, 0L, composer1, KDButtonDefaults.$stable << 15, 27), null, ComposableSingletons.StickerTabBarKt.INSTANCE.getLambda-2$sticker_release(), composer1, v1 & 14 | 0x30030, 20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function00, v, 6));
        }
    }

    public static final void c(StickerGroup stickerGroup0, boolean z, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE2B114CD);
        int v1 = (v & 14) == 0 ? (composer1.changed(stickerGroup0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE2B114CD, v1, -1, "com.kakao.kandinsky.sticker.ui.StickerGroupButton (StickerTabBar.kt:131)");
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 40.0f);
            composer1.startReplaceGroup(0xB05731CD);
            p9.a a0 = composer1.rememberedValue();
            if((((v1 & 0x380) == 0x100 ? 1 : 0) | ((v1 & 14) == 4 ? 1 : 0)) != 0 || a0 == Composer.Companion.getEmpty()) {
                a0 = new p9.a(18, function10, stickerGroup0);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            KDButtonKt.KDButton(a0, modifier0, !z, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0x7F3483C4, true, new h(z, stickerGroup0), composer1, 54), composer1, 0x6000030, 0xF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(stickerGroup0, z, function10, v, 6));
        }
    }
}

