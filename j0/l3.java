package j0;

import androidx.compose.foundation.text.TextFieldDelegateKt;
import androidx.compose.material3.e0;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l3 extends Lambda implements Function3 {
    public final TextStyle w;

    public l3(TextStyle textStyle0) {
        this.w = textStyle0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x5E56A525);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5E56A525, v, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
        }
        Density density0 = (Density)((Composer)object1).consume(CompositionLocalsKt.getLocalDensity());
        Resolver fontFamily$Resolver0 = (Resolver)((Composer)object1).consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Object object3 = ((Composer)object1).consume(CompositionLocalsKt.getLocalLayoutDirection());
        TextStyle textStyle0 = this.w;
        boolean z = ((Composer)object1).changed(textStyle0);
        boolean z1 = ((Composer)object1).changed(((LayoutDirection)object3));
        TextStyle textStyle1 = ((Composer)object1).rememberedValue();
        if(z || z1 || textStyle1 == Composer.Companion.getEmpty()) {
            textStyle1 = TextStyleKt.resolveDefaults(textStyle0, ((LayoutDirection)object3));
            ((Composer)object1).updateRememberedValue(textStyle1);
        }
        boolean z2 = ((Composer)object1).changed(fontFamily$Resolver0);
        boolean z3 = ((Composer)object1).changed(textStyle1);
        State state0 = ((Composer)object1).rememberedValue();
        if(z2 || z3 || state0 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily0 = textStyle1.getFontFamily();
            FontWeight fontWeight0 = textStyle1.getFontWeight();
            if(fontWeight0 == null) {
                fontWeight0 = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyle0 = textStyle1.getFontStyle-4Lr2A7w();
            FontSynthesis fontSynthesis0 = textStyle1.getFontSynthesis-ZQGJjVo();
            state0 = fontFamily$Resolver0.resolve-DPcqOEQ(fontFamily0, fontWeight0, (fontStyle0 == null ? 0 : fontStyle0.unbox-impl()), (fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()));
            ((Composer)object1).updateRememberedValue(state0);
        }
        j3 j30 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(j30 == composer$Companion0.getEmpty()) {
            Object object4 = state0.getValue();
            j3 j31 = new j3();  // 初始化器: Ljava/lang/Object;-><init>()V
            j31.a = (LayoutDirection)object3;
            j31.b = density0;
            j31.c = fontFamily$Resolver0;
            j31.d = textStyle0;
            j31.e = object4;
            j31.f = TextFieldDelegateKt.computeSizeForDefaultText$default(textStyle0, density0, fontFamily$Resolver0, null, 0, 24, null);
            ((Composer)object1).updateRememberedValue(j31);
            j30 = j31;
        }
        Object object5 = state0.getValue();
        if(((LayoutDirection)object3) != j30.a || !Intrinsics.areEqual(density0, j30.b) || !Intrinsics.areEqual(fontFamily$Resolver0, j30.c) || !Intrinsics.areEqual(textStyle1, j30.d) || !Intrinsics.areEqual(object5, j30.e)) {
            j30.a = (LayoutDirection)object3;
            j30.b = density0;
            j30.c = fontFamily$Resolver0;
            j30.d = textStyle1;
            j30.e = object5;
            j30.f = TextFieldDelegateKt.computeSizeForDefaultText$default(textStyle1, density0, fontFamily$Resolver0, null, 0, 24, null);
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        boolean z4 = ((Composer)object1).changedInstance(j30);
        e0 e00 = ((Composer)object1).rememberedValue();
        if(z4 || e00 == composer$Companion0.getEmpty()) {
            e00 = new e0(j30, 6);
            ((Composer)object1).updateRememberedValue(e00);
        }
        Modifier modifier1 = LayoutModifierKt.layout(modifier$Companion0, e00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

