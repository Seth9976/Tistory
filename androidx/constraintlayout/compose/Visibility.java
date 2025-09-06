package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/constraintlayout/compose/Visibility;", "", "", "solverValue", "<init>", "(I)V", "a", "I", "getSolverValue$compose_release", "()I", "Companion", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Visibility {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R \u0010\f\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006¨\u0006\u000F"}, d2 = {"Landroidx/constraintlayout/compose/Visibility$Companion;", "", "Landroidx/constraintlayout/compose/Visibility;", "Visible", "Landroidx/constraintlayout/compose/Visibility;", "getVisible", "()Landroidx/constraintlayout/compose/Visibility;", "getVisible$annotations", "()V", "Invisible", "getInvisible", "getInvisible$annotations", "Gone", "getGone", "getGone$annotations", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Visibility getGone() {
            return Visibility.d;
        }

        @Stable
        public static void getGone$annotations() {
        }

        @NotNull
        public final Visibility getInvisible() {
            return Visibility.c;
        }

        @Stable
        public static void getInvisible$annotations() {
        }

        @NotNull
        public final Visibility getVisible() {
            return Visibility.b;
        }

        @Stable
        public static void getVisible$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final Visibility b;
    public static final Visibility c;
    public static final Visibility d;

    static {
        Visibility.Companion = new Companion(null);
        Visibility.b = new Visibility(0);
        Visibility.c = new Visibility(4);
        Visibility.d = new Visibility(8);
    }

    public Visibility(int v) {
        this.a = v;
    }

    public final int getSolverValue$compose_release() {
        return this.a;
    }
}

