package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001A\u00020\u0007H\u0016J\u0010\u0010\b\u001A\u00020\u00002\b\u0010\u0005\u001A\u0004\u0018\u00010\u0000J\b\u0010\t\u001A\u00020\nH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle;", "", "()V", "equals", "", "other", "hashCode", "", "merge", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformSpanStyle {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle$Companion;", "", "Landroidx/compose/ui/text/PlatformSpanStyle;", "Default", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final PlatformSpanStyle a;

    static {
        PlatformSpanStyle.Companion = new Companion(null);
        PlatformSpanStyle.a = new PlatformSpanStyle();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof PlatformSpanStyle;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    public final PlatformSpanStyle merge(@Nullable PlatformSpanStyle platformSpanStyle0) [...] // Inlined contents

    @Override
    @NotNull
    public String toString() {
        return "PlatformSpanStyle()";
    }
}

