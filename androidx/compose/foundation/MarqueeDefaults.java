package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR \u0010\u000F\u001A\u00020\u000E8\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001A\u00020\u000E8\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0016\u0010\u0012\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/MarqueeDefaults;", "", "Landroidx/compose/foundation/MarqueeSpacing;", "a", "Landroidx/compose/foundation/MarqueeSpacing;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "Spacing", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getVelocity-D9Ej5fM", "()F", "Velocity", "", "Iterations", "I", "getIterations", "()I", "getIterations$annotations", "()V", "RepeatDelayMillis", "getRepeatDelayMillis", "getRepeatDelayMillis$annotations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,507:1\n148#2:508\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n*L\n103#1:508\n*E\n"})
public final class MarqueeDefaults {
    public static final int $stable;
    @NotNull
    public static final MarqueeDefaults INSTANCE;
    public static final MarqueeSpacing a;
    public static final float b;

    static {
        MarqueeDefaults.INSTANCE = new MarqueeDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        MarqueeDefaults.a = MarqueeSpacing.Companion.fractionOfContainer(0.333333f);
        MarqueeDefaults.b = 30.0f;
    }

    public final int getIterations() [...] // Inlined contents

    public static void getIterations$annotations() {
    }

    public final int getRepeatDelayMillis() [...] // Inlined contents

    public static void getRepeatDelayMillis$annotations() {
    }

    @NotNull
    public final MarqueeSpacing getSpacing() {
        return MarqueeDefaults.a;
    }

    public final float getVelocity-D9Ej5fM() [...] // 潜在的解密器
}

