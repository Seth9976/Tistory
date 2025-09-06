package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\'\u0010\b\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/navigation/serialization/UNKNOWN;", "Landroidx/navigation/NavType;", "", "Landroid/os/Bundle;", "bundle", "key", "value", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "parseValue", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UNKNOWN extends NavType {
    @NotNull
    public static final UNKNOWN INSTANCE;

    static {
        UNKNOWN.INSTANCE = new UNKNOWN(false);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
    }

    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Nullable
    public String get(@NotNull Bundle bundle0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        return null;
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "unknown";
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    @NotNull
    public String parseValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        return "null";
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((String)object0));
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "value");
    }
}

