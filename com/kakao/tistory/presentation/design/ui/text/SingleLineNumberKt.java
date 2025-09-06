package com.kakao.tistory.presentation.design.ui.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E²\u0006\u000E\u0010\r\u001A\u00020\f8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "number", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/text/TextStyle;", "style", "", "SingleLineCompactNumber-cf5BqRc", "(Ljava/lang/Number;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "SingleLineCompactNumber", "", "offsetY", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSingleLineNumber.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleLineNumber.kt\ncom/kakao/tistory/presentation/design/ui/text/SingleLineNumberKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,49:1\n77#2:50\n77#2:51\n77#2:52\n77#2:54\n1#3:53\n1223#4,6:55\n1223#4,6:61\n1223#4,6:67\n76#5:73\n109#5,2:74\n*S KotlinDebug\n*F\n+ 1 SingleLineNumber.kt\ncom/kakao/tistory/presentation/design/ui/text/SingleLineNumberKt\n*L\n20#1:50\n23#1:51\n26#1:52\n27#1:54\n29#1:55,6\n35#1:61,6\n41#1:67,6\n29#1:73\n29#1:74,2\n*E\n"})
public final class SingleLineNumberKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SingleLineCompactNumber-cf5BqRc(@NotNull Number number0, @Nullable Modifier modifier0, long v, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v1, int v2) {
        TextStyle textStyle1;
        int v4;
        Intrinsics.checkNotNullParameter(number0, "number");
        Composer composer1 = composer0.startRestartGroup(0x8D756811);
        Modifier modifier1 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
        long v3 = (v2 & 4) == 0 ? v : 0L;
        if((v2 & 8) == 0) {
            textStyle1 = textStyle0;
            v4 = v1;
        }
        else {
            v4 = v1 & 0xFFFFE3FF;
            textStyle1 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8D756811, v4, -1, "com.kakao.tistory.presentation.design.ui.text.SingleLineCompactNumber (SingleLineNumber.kt:20)");
        }
        long v5 = textStyle1.getFontSize-XSAIIZE();
        TextUnit textUnit0 = null;
        TextUnit textUnit1 = TextUnit.equals-impl0(v5, 0x7FC00000L) ? null : TextUnit.box-impl(v5);
        composer1.startReplaceGroup(0x26FBE664);
        if(textUnit1 == null) {
            long v6 = ((TextStyle)composer1.consume(TextKt.getLocalTextStyle())).getFontSize-XSAIIZE();
            if(!TextUnit.equals-impl0(v6, 0x7FC00000L)) {
                textUnit0 = TextUnit.box-impl(v6);
            }
        }
        else {
            textUnit0 = textUnit1;
        }
        composer1.endReplaceGroup();
        if(textUnit0 != null) {
            long v7 = textUnit0.unbox-impl();
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toDp-GaN1DYA(v7);
            float f1 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f);
            composer1.startReplaceGroup(0x26FC080B);
            MutableFloatState mutableFloatState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableFloatState0 == composer$Companion0.getEmpty()) {
                mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer1.updateRememberedValue(mutableFloatState0);
            }
            composer1.endReplaceGroup();
            String s = number0.toString();
            Modifier modifier2 = SizeKt.height-3ABfNKs(modifier1, f);
            composer1.startReplaceGroup(0x26FC1D21);
            a a0 = composer1.rememberedValue();
            if(a0 == composer$Companion0.getEmpty()) {
                a0 = new a(mutableFloatState0);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = GraphicsLayerModifierKt.graphicsLayer(modifier2, a0);
            composer1.startReplaceGroup(0x26FC33CB);
            boolean z = composer1.changed(f1);
            b b0 = composer1.rememberedValue();
            if(z || b0 == composer$Companion0.getEmpty()) {
                b0 = new b(f1, mutableFloatState0);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceGroup();
            TextKt.Text--4IGK_g(s, modifier3, v3, v7, null, null, null, 0L, null, null, v7, 0, false, 1, 1, b0, textStyle1, composer1, v4 & 0x380, v4 << 9 & 0x380000 | 0x6C00, 0x1BF0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new c(number0, modifier1, v3, textStyle1, v1, v2));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new d(number0, modifier1, v3, textStyle1, v1, v2));
        }
    }

    public static final float access$SingleLineCompactNumber_cf5BqRc$lambda$3(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$SingleLineCompactNumber_cf5BqRc$lambda$4(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }
}

