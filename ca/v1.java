package ca;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.FadingEdgeBoxKt;
import com.kakao.kandinsky.designsystem.common.MenuListKt.MenuList.1.WhenMappings;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class v1 extends Lambda implements Function3 {
    public final ScrollState w;
    public final Function2 x;

    public v1(ScrollState scrollState0, Function2 function20) {
        this.w = scrollState0;
        this.x = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFF194233, v, -1, "com.kakao.kandinsky.designsystem.common.MenuList.<anonymous> (MenuList.kt:25)");
        }
        int v1 = MenuListKt.MenuList.1.WhenMappings.$EnumSwitchMapping$0[((Orientation)composer0.consume(OrientationKt.getLocalOrientation())).ordinal()];
        Function2 function20 = this.x;
        switch(v1) {
            case 1: {
                composer0.startReplaceGroup(0xF456F32F);
                float f = Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), 450.0f) <= 0 ? ((Dp)c.coerceAtLeast(Dp.box-impl(Dp.constructor-impl(Dp.constructor-impl(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM() - 300.0f) / 7.0f)), Dp.box-impl(0.0f))).unbox-impl() : 0.0f;
                Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 88.0f), this.w, false, null, false, 14, null), f, 0.0f, 2, null);
                MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-D5KLDUw(f, Alignment.Companion.getCenterHorizontally()), Alignment.Companion.getCenterVertically(), composer0, 0x30);
                int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
                Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function00);
                }
                else {
                    composer0.useNode();
                }
                Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                    a.t(v2, composer0, v2, function21);
                }
                function20.invoke(composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier1, 0));
                composer0.endNode();
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(0xF456F6C2);
                Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(ScrollKt.verticalScroll$default(FadingEdgeBoxKt.verticalFadingEdge-ziNgDLE$default(SizeKt.width-3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 88.0f), 8.0f, false, false, 2, null), this.w, false, null, false, 14, null), 0.0f, 16.0f, 1, null);
                MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-D5KLDUw(14.0f, Alignment.Companion.getCenterVertically()), Alignment.Companion.getCenterHorizontally(), composer0, 54);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
                Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion1.getConstructor();
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function01);
                }
                else {
                    composer0.useNode();
                }
                Function2 function22 = a.r(composeUiNode$Companion1, composer0, measurePolicy1, composer0, compositionLocalMap1);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
                    a.t(v3, composer0, v3, function22);
                }
                function20.invoke(composer0, r0.a.l(composeUiNode$Companion1, composer0, modifier3, 0));
                composer0.endNode();
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(0xF456F942);
                composer0.endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

