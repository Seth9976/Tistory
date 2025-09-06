package j0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.foundation.text.TextFieldDelegateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function3 {
    public final int w;
    public final int x;
    public final TextStyle y;

    public e2(int v, int v1, TextStyle textStyle0) {
        this.w = v;
        this.x = v1;
        this.y = textStyle0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier1;
        Modifier modifier0 = (Modifier)object0;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        composer0.startReplaceGroup(408240218);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(408240218, v, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
        }
        int v1 = this.w;
        int v2 = this.x;
        HeightInLinesModifierKt.validateMinMaxLines(v1, v2);
        if(v1 == 1 && v2 == 0x7FFFFFFF) {
            modifier1 = Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return modifier1;
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        Resolver fontFamily$Resolver0 = (Resolver)composer0.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        TextStyle textStyle0 = this.y;
        boolean z = composer0.changed(textStyle0);
        boolean z1 = composer0.changed(layoutDirection0);
        TextStyle textStyle1 = composer0.rememberedValue();
        if(z || z1 || textStyle1 == Composer.Companion.getEmpty()) {
            textStyle1 = TextStyleKt.resolveDefaults(textStyle0, layoutDirection0);
            composer0.updateRememberedValue(textStyle1);
        }
        boolean z2 = composer0.changed(fontFamily$Resolver0);
        boolean z3 = composer0.changed(textStyle1);
        State state0 = composer0.rememberedValue();
        if(z2 || z3 || state0 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily0 = textStyle1.getFontFamily();
            FontWeight fontWeight0 = textStyle1.getFontWeight();
            if(fontWeight0 == null) {
                fontWeight0 = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyle0 = textStyle1.getFontStyle-4Lr2A7w();
            FontSynthesis fontSynthesis0 = textStyle1.getFontSynthesis-ZQGJjVo();
            state0 = fontFamily$Resolver0.resolve-DPcqOEQ(fontFamily0, fontWeight0, (fontStyle0 == null ? 0 : fontStyle0.unbox-impl()), (fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()));
            composer0.updateRememberedValue(state0);
        }
        Object object3 = state0.getValue();
        boolean z4 = composer0.changed(density0);
        boolean z5 = composer0.changed(fontFamily$Resolver0);
        boolean z6 = composer0.changed(textStyle0);
        boolean z7 = composer0.changed(layoutDirection0);
        boolean z8 = composer0.changed(object3);
        Integer integer0 = composer0.rememberedValue();
        if((z8 | (z4 | z5 | z6 | z7)) != 0 || integer0 == Composer.Companion.getEmpty()) {
            integer0 = IntSize.getHeight-impl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle1, density0, fontFamily$Resolver0, "HHHHHHHHHH", 1));
            composer0.updateRememberedValue(integer0);
        }
        int v3 = integer0.intValue();
        Object object4 = state0.getValue();
        boolean z9 = composer0.changed(density0);
        boolean z10 = composer0.changed(fontFamily$Resolver0);
        boolean z11 = composer0.changed(textStyle0);
        boolean z12 = composer0.changed(layoutDirection0);
        boolean z13 = composer0.changed(object4);
        Integer integer1 = composer0.rememberedValue();
        if((z12 | (z11 | (z9 | z10)) | z13) != 0 || integer1 == Composer.Companion.getEmpty()) {
            integer1 = IntSize.getHeight-impl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle1, density0, fontFamily$Resolver0, "HHHHHHHHHH" + '\n' + "HHHHHHHHHH", 2));
            composer0.updateRememberedValue(integer1);
        }
        int v4 = integer1.intValue() - v3;
        Integer integer2 = null;
        Integer integer3 = v1 == 1 ? null : ((int)((v1 - 1) * v4 + v3));
        if(v2 != 0x7FFFFFFF) {
            integer2 = (int)((v2 - 1) * v4 + v3);
        }
        float f = integer3 == null ? NaNf : density0.toDp-u2uoSUM(((int)integer3));
        modifier1 = SizeKt.heightIn-VpY3zN4(Modifier.Companion, f, (integer2 == null ? NaNf : density0.toDp-u2uoSUM(((int)integer2))));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier1;
    }
}

