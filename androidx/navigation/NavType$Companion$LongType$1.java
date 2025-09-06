package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.text.p;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u000BJ\u0015\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0004H\u0016¢\u0006\u0002\u0010\u000EJ \u0010\u000F\u001A\u00020\u00102\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0002H\u0016R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"androidx/navigation/NavType$Companion$LongType$1", "Landroidx/navigation/NavType;", "", "name", "", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Long;", "put", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavType.Companion.LongType.1 extends NavType {
    @NotNull
    public Long get(@NotNull Bundle bundle0, @NotNull String s) {
        Object object0 = q.i(bundle0, "bundle", s, "key", s);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Long");
        return (Long)object0;
    }

    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "long";
    }

    @NotNull
    public Long parseValue(@NotNull String s) {
        String s1;
        Intrinsics.checkNotNullParameter(s, "value");
        if(p.endsWith$default(s, "L", false, 2, null)) {
            s1 = s.substring(0, s.length() - 1);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        }
        else {
            s1 = s;
        }
        if(p.startsWith$default(s, "0x", false, 2, null)) {
            String s2 = s1.substring(2);
            Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
            return Long.parseLong(s2, b.checkRadix(16));
        }
        return Long.parseLong(s1);
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        bundle0.putLong(s, v);
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((Number)object0).longValue());
    }
}

