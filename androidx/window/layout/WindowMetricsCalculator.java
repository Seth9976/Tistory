package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", "activity", "Landroid/app/Activity;", "computeMaximumWindowMetrics", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public interface WindowMetricsCalculator {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "Landroidx/window/layout/WindowMetricsCalculator;", "getOrCreate", "()Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "overridingDecorator", "", "overrideDecorator", "(Landroidx/window/layout/WindowMetricsCalculatorDecorator;)V", "reset", "()V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static Object b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = l.w;
        }

        @JvmStatic
        @NotNull
        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator)((Function1)Companion.b).invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @RestrictTo({Scope.TESTS})
        @ExperimentalWindowApi
        @JvmStatic
        public final void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator0) {
            Intrinsics.checkNotNullParameter(windowMetricsCalculatorDecorator0, "overridingDecorator");
            Companion.b = new m(1, windowMetricsCalculatorDecorator0, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        }

        @RestrictTo({Scope.TESTS})
        @ExperimentalWindowApi
        @JvmStatic
        public final void reset() {
            Companion.b = n.w;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        WindowMetricsCalculator.Companion = Companion.a;
    }

    @NotNull
    WindowMetrics computeCurrentWindowMetrics(@NotNull Activity arg1);

    @NotNull
    WindowMetrics computeMaximumWindowMetrics(@NotNull Activity arg1);

    @JvmStatic
    @NotNull
    static WindowMetricsCalculator getOrCreate() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    @RestrictTo({Scope.TESTS})
    @ExperimentalWindowApi
    @JvmStatic
    static void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator0) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator0);
    }

    @RestrictTo({Scope.TESTS})
    @ExperimentalWindowApi
    @JvmStatic
    static void reset() {
        WindowMetricsCalculator.Companion.reset();
    }
}

