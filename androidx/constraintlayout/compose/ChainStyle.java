package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.State.Chain;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\b\u0000\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001E\u0010\u0004\u001A\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle;", "", "Landroidx/constraintlayout/core/state/State$Chain;", "Landroidx/constraintlayout/compose/SolverChain;", "style", "", "bias", "<init>", "(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V", "a", "Landroidx/constraintlayout/core/state/State$Chain;", "getStyle$compose_release", "()Landroidx/constraintlayout/core/state/State$Chain;", "b", "Ljava/lang/Float;", "getBias$compose_release", "()Ljava/lang/Float;", "Companion", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ChainStyle {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000B\u0010\f\u001A\u0004\b\t\u0010\nR \u0010\r\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000F\u0010\f\u001A\u0004\b\u000E\u0010\nR \u0010\u0005\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u0011\u0010\f\u001A\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle$Companion;", "", "", "bias", "Landroidx/constraintlayout/compose/ChainStyle;", "Packed", "(F)Landroidx/constraintlayout/compose/ChainStyle;", "Spread", "Landroidx/constraintlayout/compose/ChainStyle;", "getSpread", "()Landroidx/constraintlayout/compose/ChainStyle;", "getSpread$annotations", "()V", "SpreadInside", "getSpreadInside", "getSpreadInside$annotations", "getPacked", "getPacked$annotations", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Stable
        @NotNull
        public final ChainStyle Packed(float f) {
            return new ChainStyle(Chain.PACKED, f);
        }

        @NotNull
        public final ChainStyle getPacked() {
            return ChainStyle.e;
        }

        @Stable
        public static void getPacked$annotations() {
        }

        @NotNull
        public final ChainStyle getSpread() {
            return ChainStyle.c;
        }

        @Stable
        public static void getSpread$annotations() {
        }

        @NotNull
        public final ChainStyle getSpreadInside() {
            return ChainStyle.d;
        }

        @Stable
        public static void getSpreadInside$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Chain a;
    public final Float b;
    public static final ChainStyle c;
    public static final ChainStyle d;
    public static final ChainStyle e;

    static {
        Companion chainStyle$Companion0 = new Companion(null);
        ChainStyle.Companion = chainStyle$Companion0;
        ChainStyle.c = new ChainStyle(Chain.SPREAD, null, 2, null);
        ChainStyle.d = new ChainStyle(Chain.SPREAD_INSIDE, null, 2, null);
        ChainStyle.e = chainStyle$Companion0.Packed(0.5f);
    }

    public ChainStyle(@NotNull Chain state$Chain0, @Nullable Float float0) {
        Intrinsics.checkNotNullParameter(state$Chain0, "style");
        super();
        this.a = state$Chain0;
        this.b = float0;
    }

    public ChainStyle(Chain state$Chain0, Float float0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            float0 = null;
        }
        this(state$Chain0, float0);
    }

    @Nullable
    public final Float getBias$compose_release() {
        return this.b;
    }

    @NotNull
    public final Chain getStyle$compose_release() {
        return this.a;
    }
}

