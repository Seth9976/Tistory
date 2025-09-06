package com.kakao.kandinsky.textedit.ui;

import aa.x;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import ce.e;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.textedit.contract.InputState;
import eb.b;
import eb.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AR\u0010\u000B\u001A\u00020\b2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0005\u001A\u00020\u00012\u001D\u0010\n\u001A\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/textedit/contract/InputState;", "", "alpha", "Landroidx/compose/ui/graphics/Color;", "color", "alphaDefaultValue", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "ColorPanel", "(Lcom/kakao/kandinsky/textedit/contract/InputState;Lcom/kakao/kandinsky/textedit/contract/InputState;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "textedit_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColorPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPanel.kt\ncom/kakao/kandinsky/textedit/ui/ColorPanelKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n85#2:122\n82#2,6:123\n88#2:157\n92#2:175\n78#3,6:129\n85#3,4:144\n89#3,2:154\n93#3:174\n368#4,9:135\n377#4:156\n378#4,2:172\n4032#5,6:148\n148#6:158\n148#6:176\n350#7,7:159\n1223#8,6:166\n*S KotlinDebug\n*F\n+ 1 ColorPanel.kt\ncom/kakao/kandinsky/textedit/ui/ColorPanelKt\n*L\n29#1:122\n29#1:123,6\n29#1:157\n29#1:175\n29#1:129,6\n29#1:144,4\n29#1:154,2\n29#1:174\n29#1:135,9\n29#1:156\n29#1:172,2\n29#1:148,6\n30#1:158\n92#1:176\n33#1:159,7\n36#1:166,6\n*E\n"})
public final class ColorPanelKt {
    public static final List a;

    // 去混淆评级： 高(350)
    static {
        ColorPanelKt.a = CollectionsKt__CollectionsKt.listOf(new j[]{new j(0xFFFFFFFF00000000L, false, 6), new j(0xFFDDDDDD00000000L, false, 6), new j(0xFF9D9D9D00000000L, false, 6), new j(0xFF66666600000000L, false, 6), new j(0xFF44444400000000L, true, 4), new j(0xFF17171700000000L, true, BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, 0xFF2D2D2D00000000L)), new j(0xFFEE232300000000L, false, 6), new j(0xFFF8900900000000L, false, 6), new j(0xFFF3C00000000000L, false, 6), new j(0xFF0DB4A000000000L, false, 6), new j(0xFF006DD700000000L, false, 6), new j(0xFF8A3DB600000000L, false, 6), new j(0xFF7E98B100000000L, false, 6), new j(0xFFFFC1C800000000L, false, 6), new j(0xFFFFC9AF00000000L, false, 6), new j(0xFFF6E19900000000L, false, 6), new j(0xFF9FEEC300000000L, false, 6), new j(0xFF99CEFA00000000L, false, 6), new j(0xFFC1BEF900000000L, false, 6), new j(0xFFC0D1E700000000L, false, 6), new j(0xFFEF536900000000L, false, 6), new j(0xFFEF6F5300000000L, false, 6), new j(0xFFA6BC0000000000L, false, 6), new j(0xFF409D0000000000L, false, 6), new j(0xFF0593D300000000L, false, 6), new j(0xFF6164C600000000L, false, 6), new j(0xFF8CB3BE00000000L, false, 6), new j(0xFF781B3300000000L, true, 4), new j(0xFF953B3400000000L, true, 4), new j(0xFF5F6D2B00000000L, true, 4), new j(0xFF1B711D00000000L, true, 4), new j(0xFF1A549000000000L, true, 4), new j(0xFF5733B100000000L, true, 4), new j(0xFF45677100000000L, true, 4)});
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ColorPanel(@NotNull InputState inputState0, @NotNull InputState inputState1, float f, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        int v7;
        int v6;
        Intrinsics.checkNotNullParameter(inputState0, "alpha");
        Intrinsics.checkNotNullParameter(inputState1, "color");
        Intrinsics.checkNotNullParameter(function20, "onDragStopped");
        Composer composer1 = composer0.startRestartGroup(0xF1CB48B3);
        int v1 = (v & 14) == 0 ? (composer1.changed(inputState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(inputState1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        int v2 = v1;
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF1CB48B3, v2, -1, "com.kakao.kandinsky.textedit.ui.ColorPanel (ColorPanel.kt:27)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 20.0f), composer1, 6);
            int v4 = ColorPanelKt.a.size();
            int v5 = 0;
            Iterator iterator0 = ColorPanelKt.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v6 = v2;
                    v7 = -1;
                    break;
                }
                Object object0 = iterator0.next();
                v6 = v2;
                if(Color.equals-impl0(((j)object0).a, ((Color)inputState1.getValue()).unbox-impl())) {
                    v7 = v5;
                    break;
                }
                ++v5;
                v2 = v6;
            }
            composer1.startReplaceGroup(-1359050264);
            x x0 = composer1.rememberedValue();
            if((((v6 & 0x70) == 0x20 ? 1 : 0) | ((v6 & 14) == 4 ? 1 : 0)) != 0 || x0 == Composer.Companion.getEmpty()) {
                x0 = new x(14, inputState1, inputState0);
                composer1.updateRememberedValue(x0);
            }
            composer1.endReplaceGroup();
            ItemSliderKt.ItemSlider(null, v4, v7, FunctionStateKt.skippableLambda(x0, composer1, 0), null, ComposableLambdaKt.rememberComposableLambda(0x7DC049EC, true, new eb.a(inputState0), composer1, 54), ComposableSingletons.ColorPanelKt.INSTANCE.getLambda-1$textedit_release(), composer1, 0x1B0000, 17);
            KDSliderKt.KDSlider(null, false, ((Number)inputState0.getValue()).floatValue(), inputState0.getOnChange(), f, function20, false, null, 0, e.rangeTo(0.0f, 100.0f), composer1, 0xE000 & v6 << 6 | 0x180000 | v6 << 6 & 0x70000, 387);
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
            scopeUpdateScope0.updateScope(new b(inputState0, inputState1, f, function20, v));
        }
    }
}

