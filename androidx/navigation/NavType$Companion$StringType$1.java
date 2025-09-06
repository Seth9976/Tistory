package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001B\u0010\u0006\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0096\u0002J\u0012\u0010\n\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u000B\u001A\u00020\u0002H\u0016J\"\u0010\f\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00022\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000E\u001A\u00020\u00022\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0003\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u000F"}, d2 = {"androidx/navigation/NavType$Companion$StringType$1", "Landroidx/navigation/NavType;", "", "name", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "parseValue", "value", "put", "", "serializeAsValue", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringType$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1214:1\n1#2:1215\n*E\n"})
public final class NavType.Companion.StringType.1 extends NavType {
    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Nullable
    public String get(@NotNull Bundle bundle0, @NotNull String s) {
        return (String)q.i(bundle0, "bundle", s, "key", s);
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "string";
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    @Nullable
    public String parseValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        return Intrinsics.areEqual(s, "null") ? null : s;
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((String)object0));
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        bundle0.putString(s, s1);
    }

    @Override  // androidx.navigation.NavType
    public String serializeAsValue(Object object0) {
        return this.serializeAsValue(((String)object0));
    }

    @NotNull
    public String serializeAsValue(@Nullable String s) {
        String s1 = s == null ? null : Uri.encode(s);
        return s1 == null ? "null" : s1;
    }
}

