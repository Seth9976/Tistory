package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0007\u001A\u0004\u0018\u00010\u00022\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u000BJ\u0015\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0004H\u0016¢\u0006\u0002\u0010\u000EJ \u0010\u000F\u001A\u00020\u00102\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0002H\u0016R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"androidx/navigation/NavType$Companion$BoolType$1", "Landroidx/navigation/NavType;", "", "name", "", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Boolean;", "put", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavType.Companion.BoolType.1 extends NavType {
    @Nullable
    public Boolean get(@NotNull Bundle bundle0, @NotNull String s) {
        return (Boolean)q.i(bundle0, "bundle", s, "key", s);
    }

    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "boolean";
    }

    @NotNull
    public Boolean parseValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        if(Intrinsics.areEqual(s, "true")) {
            return true;
        }
        if(!Intrinsics.areEqual(s, "false")) {
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
        return false;
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((Boolean)object0).booleanValue());
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        bundle0.putBoolean(s, z);
    }
}

