package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!J\"\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000E\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001A\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001A\u001A\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001A\u00020\u001B8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "", "minLines", "coerceMinLines-Oh53vG4$foundation_release", "(JI)J", "coerceMinLines", "Landroidx/compose/ui/unit/LayoutDirection;", "a", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextStyle;", "b", "Landroidx/compose/ui/text/TextStyle;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "inputTextStyle", "Landroidx/compose/ui/unit/Density;", "c", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "d", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMinLinesConstrainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,140:1\n26#2:141\n*S KotlinDebug\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n*L\n122#1:141\n*E\n"})
public final class MinLinesConstrainer {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\f\u001A\u00020\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "minMaxUtil", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextStyle;", "paramStyle", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "from", "(Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MinLinesConstrainer from(@Nullable MinLinesConstrainer minLinesConstrainer0, @NotNull LayoutDirection layoutDirection0, @NotNull TextStyle textStyle0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0) {
            if(minLinesConstrainer0 != null && layoutDirection0 == minLinesConstrainer0.getLayoutDirection() && Intrinsics.areEqual(textStyle0, minLinesConstrainer0.getInputTextStyle()) && density0.getDensity() == minLinesConstrainer0.getDensity().getDensity() && fontFamily$Resolver0 == minLinesConstrainer0.getFontFamilyResolver()) {
                return minLinesConstrainer0;
            }
            MinLinesConstrainer minLinesConstrainer1 = MinLinesConstrainer.h;
            if(minLinesConstrainer1 != null && layoutDirection0 == minLinesConstrainer1.getLayoutDirection() && Intrinsics.areEqual(textStyle0, minLinesConstrainer1.getInputTextStyle()) && density0.getDensity() == minLinesConstrainer1.getDensity().getDensity() && fontFamily$Resolver0 == minLinesConstrainer1.getFontFamilyResolver()) {
                return minLinesConstrainer1;
            }
            MinLinesConstrainer minLinesConstrainer2 = new MinLinesConstrainer(layoutDirection0, TextStyleKt.resolveDefaults(textStyle0, layoutDirection0), density0, fontFamily$Resolver0, null);
            MinLinesConstrainer.h = minLinesConstrainer2;
            return minLinesConstrainer2;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LayoutDirection a;
    public final TextStyle b;
    public final Density c;
    public final Resolver d;
    public final TextStyle e;
    public float f;
    public float g;
    public static MinLinesConstrainer h;

    static {
        MinLinesConstrainer.Companion = new Companion(null);
        MinLinesConstrainer.$stable = 8;
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection0, TextStyle textStyle0, Density density0, Resolver fontFamily$Resolver0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = layoutDirection0;
        this.b = textStyle0;
        this.c = density0;
        this.d = fontFamily$Resolver0;
        this.e = TextStyleKt.resolveDefaults(textStyle0, layoutDirection0);
        this.f = NaNf;
        this.g = NaNf;
    }

    public final long coerceMinLines-Oh53vG4$foundation_release(long v, int v1) {
        float f = this.g;
        float f1 = this.f;
        if(Float.isNaN(f) || Float.isNaN(f1)) {
            long v2 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            f = ParagraphKt.Paragraph-UdtVg6A$default("HHHHHHHHHH", this.e, v2, this.c, this.d, null, null, 1, false, 0x60, null).getHeight();
            long v3 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            f1 = ParagraphKt.Paragraph-UdtVg6A$default("HHHHHHHHHH\nHHHHHHHHHH", this.e, v3, this.c, this.d, null, null, 2, false, 0x60, null).getHeight() - f;
            this.g = f;
            this.f = f1;
        }
        return v1 == 1 ? ConstraintsKt.Constraints(Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)) : ConstraintsKt.Constraints(Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v), c.coerceAtMost(c.coerceAtLeast(Math.round(f1 * ((float)(v1 - 1)) + f), 0), Constraints.getMaxHeight-impl(v)), Constraints.getMaxHeight-impl(v));
    }

    @NotNull
    public final Density getDensity() {
        return this.c;
    }

    @NotNull
    public final Resolver getFontFamilyResolver() {
        return this.d;
    }

    @NotNull
    public final TextStyle getInputTextStyle() {
        return this.b;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.a;
    }
}

