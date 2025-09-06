package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\u001A\u001B\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0005\u001A\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\b\u001A\u001B\u0010\t\u001A\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u000B\u001A\u001B\u0010\f\u001A\b\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u000E\u001A\u001B\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00100\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0011\u001A\u001B\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0014\u001A\u001B\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0016\u001A!\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\b\u0019¨\u0006\u001A"}, d2 = {"booleanPreferencesKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "name", "", "booleanKey", "byteArrayPreferencesKey", "", "byteArrayKey", "doublePreferencesKey", "", "doubleKey", "floatPreferencesKey", "", "floatKey", "intPreferencesKey", "", "intKey", "longPreferencesKey", "", "longKey", "stringPreferencesKey", "stringKey", "stringSetPreferencesKey", "", "stringSetKey", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "PreferencesKeys")
public final class PreferencesKeys {
    @JvmName(name = "booleanKey")
    @NotNull
    public static final Key booleanKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "byteArrayKey")
    @NotNull
    public static final Key byteArrayKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "doubleKey")
    @NotNull
    public static final Key doubleKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "floatKey")
    @NotNull
    public static final Key floatKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "intKey")
    @NotNull
    public static final Key intKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "longKey")
    @NotNull
    public static final Key longKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "stringKey")
    @NotNull
    public static final Key stringKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }

    @JvmName(name = "stringSetKey")
    @NotNull
    public static final Key stringSetKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new Key(s);
    }
}

