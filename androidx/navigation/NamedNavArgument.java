package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u000B¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NamedNavArgument;", "", "", "name", "Landroidx/navigation/NavArgument;", "argument", "<init>", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/navigation/NavArgument;", "a", "Ljava/lang/String;", "getName", "b", "Landroidx/navigation/NavArgument;", "getArgument", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NamedNavArgument {
    public final String a;
    public final NavArgument b;

    public NamedNavArgument(@NotNull String s, @NotNull NavArgument navArgument0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(navArgument0, "argument");
        super();
        this.a = s;
        this.b = navArgument0;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final NavArgument component2() {
        return this.b;
    }

    @NotNull
    public final NavArgument getArgument() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }
}

