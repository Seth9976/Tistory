package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PathEffect {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\n\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000E\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ0\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect$Companion;", "", "", "radius", "Landroidx/compose/ui/graphics/PathEffect;", "cornerPathEffect", "(F)Landroidx/compose/ui/graphics/PathEffect;", "", "intervals", "phase", "dashPathEffect", "([FF)Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "chainPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;Landroidx/compose/ui/graphics/PathEffect;)Landroidx/compose/ui/graphics/PathEffect;", "Landroidx/compose/ui/graphics/Path;", "shape", "advance", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "style", "stampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "stampedPathEffect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final PathEffect chainPathEffect(@NotNull PathEffect pathEffect0, @NotNull PathEffect pathEffect1) {
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect0, pathEffect1);
        }

        @NotNull
        public final PathEffect cornerPathEffect(float f) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f);
        }

        @NotNull
        public final PathEffect dashPathEffect(@NotNull float[] arr_f, float f) {
            return AndroidPathEffect_androidKt.actualDashPathEffect(arr_f, f);
        }

        public static PathEffect dashPathEffect$default(Companion pathEffect$Companion0, float[] arr_f, float f, int v, Object object0) {
            if((v & 2) != 0) {
                f = 0.0f;
            }
            return pathEffect$Companion0.dashPathEffect(arr_f, f);
        }

        @NotNull
        public final PathEffect stampedPathEffect-7aD1DOk(@NotNull Path path0, float f, float f1, int v) {
            return AndroidPathEffect_androidKt.actualStampedPathEffect-7aD1DOk(path0, f, f1, v);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        PathEffect.Companion = Companion.a;
    }
}

