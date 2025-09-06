package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000F\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00078\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER.\u0010\u0016\u001A\u0004\u0018\u00010\u00012\b\u0010\b\u001A\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001A\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00078\u0000@@X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001A\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000ER,\u0010 \u001A\u0006\u0012\u0002\b\u00030\u001B2\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u001B8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Landroidx/navigation/NavArgumentBuilder;", "", "<init>", "()V", "Landroidx/navigation/NavArgument;", "build", "()Landroidx/navigation/NavArgument;", "", "value", "c", "Z", "getNullable", "()Z", "setNullable", "(Z)V", "nullable", "d", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "defaultValue", "e", "getUnknownDefaultValuePresent$navigation_common_release", "setUnknownDefaultValuePresent$navigation_common_release", "unknownDefaultValuePresent", "Landroidx/navigation/NavType;", "getType", "()Landroidx/navigation/NavType;", "setType", "(Landroidx/navigation/NavType;)V", "type", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavArgumentBuilder {
    public final Builder a;
    public NavType b;
    public boolean c;
    public Object d;
    public boolean e;

    public NavArgumentBuilder() {
        this.a = new Builder();
    }

    @NotNull
    public final NavArgument build() {
        return this.a.build();
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.d;
    }

    public final boolean getNullable() {
        return this.c;
    }

    @NotNull
    public final NavType getType() {
        NavType navType0 = this.b;
        if(navType0 == null) {
            throw new IllegalStateException("NavType has not been set on this builder.");
        }
        return navType0;
    }

    public final boolean getUnknownDefaultValuePresent$navigation_common_release() {
        return this.e;
    }

    public final void setDefaultValue(@Nullable Object object0) {
        this.d = object0;
        this.a.setDefaultValue(object0);
    }

    public final void setNullable(boolean z) {
        this.c = z;
        this.a.setIsNullable(z);
    }

    public final void setType(@NotNull NavType navType0) {
        Intrinsics.checkNotNullParameter(navType0, "value");
        this.b = navType0;
        this.a.setType(navType0);
    }

    public final void setUnknownDefaultValuePresent$navigation_common_release(boolean z) {
        this.e = z;
        this.a.setUnknownDefaultValuePresent$navigation_common_release(z);
    }
}

