package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class l extends k {
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character \'\\n\' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @NotNull
    public static final Appendable appendln(@NotNull Appendable appendable0) {
        Intrinsics.checkNotNullParameter(appendable0, "<this>");
        Appendable appendable1 = appendable0.append("\n");
        Intrinsics.checkNotNullExpressionValue(appendable1, "append(...)");
        return appendable1;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character \'\\n\' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @NotNull
    public static final StringBuilder appendln(@NotNull StringBuilder stringBuilder0) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "<this>");
        stringBuilder0.append("\n");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        return stringBuilder0;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final StringBuilder clear(@NotNull StringBuilder stringBuilder0) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "<this>");
        stringBuilder0.setLength(0);
        return stringBuilder0;
    }
}

