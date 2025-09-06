package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n2.a;
import n2.b;
import n2.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013J\u0010\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0000H\u0016J\u0016\u0010\u0010\u001A\u00020\u00002\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00020\u000BX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "merge", "other", "takeOrElse", "Lkotlin/Function0;", "Companion", "Unspecified", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextForegroundStyle {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u0007\u001A\u00020\u00042\b\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0007\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "from-8_81llA", "(J)Landroidx/compose/ui/text/style/TextForegroundStyle;", "from", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/Brush;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,149:1\n696#2:150\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:150\n*E\n"})
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final TextForegroundStyle from(@Nullable Brush brush0, float f) {
            if(brush0 == null) {
                return Unspecified.INSTANCE;
            }
            if(brush0 instanceof SolidColor) {
                return this.from-8_81llA(TextDrawStyleKt.modulate-DxMtmZc(((SolidColor)brush0).getValue-0d7_KjU(), f));
            }
            if(!(brush0 instanceof ShaderBrush)) {
                throw new NoWhenBranchMatchedException();
            }
            return new a(((ShaderBrush)brush0), f);
        }

        @NotNull
        public final TextForegroundStyle from-8_81llA(long v) {
            return v != 16L ? new b(v) : Unspecified.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u001A\u0010\u0005\u001A\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001A\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "color", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "", "getAlpha", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable;
        @NotNull
        public static final Unspecified INSTANCE;

        static {
            Unspecified.INSTANCE = new Unspecified();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return NaNf;
        }

        @Override  // androidx.compose.ui.text.style.TextForegroundStyle
        @Nullable
        public Brush getBrush() {
            return null;
        }

        @Override  // androidx.compose.ui.text.style.TextForegroundStyle
        public long getColor-0d7_KjU() {
            return Color.Companion.getUnspecified-0d7_KjU();
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        TextForegroundStyle.Companion = Companion.a;
    }

    float getAlpha();

    @Nullable
    Brush getBrush();

    long getColor-0d7_KjU();

    @NotNull
    default TextForegroundStyle merge(@NotNull TextForegroundStyle textForegroundStyle0) {
        if(textForegroundStyle0 instanceof a && this instanceof a) {
            c c0 = new c(this, 0);
            float f = TextDrawStyleKt.access$takeOrElse(((a)textForegroundStyle0).b, c0);
            return new a(((a)textForegroundStyle0).a, f);
        }
        if(!(textForegroundStyle0 instanceof a) || this instanceof a) {
            return textForegroundStyle0 instanceof a || !(this instanceof a) ? textForegroundStyle0.takeOrElse(new c(this, 1)) : this;
        }
        return textForegroundStyle0;
    }

    @NotNull
    default TextForegroundStyle takeOrElse(@NotNull Function0 function00) {
        return Intrinsics.areEqual(this, Unspecified.INSTANCE) ? ((TextForegroundStyle)function00.invoke()) : this;
    }
}

