package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u000F\u0010B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004H&J\u001D\u0010\u0006\u001A\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002J$\u0010\n\u001A\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002¢\u0006\u0002\u0010\u000BJ\u0006\u0010\f\u001A\u00020\rJ\u0006\u0010\u000E\u001A\u00020\u0000¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "()V", "asMap", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "contains", "", "T", "key", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "toMutablePreferences", "Landroidx/datastore/preferences/core/MutablePreferences;", "toPreferences", "Key", "Pair", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Preferences {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", "T", "", "", "name", "<init>", "(Ljava/lang/String;)V", "value", "Landroidx/datastore/preferences/core/Preferences$Pair;", "to", "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Pair;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Key {
        public final String a;

        public Key(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            super();
            this.a = s;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Key ? Intrinsics.areEqual(this.a, ((Key)object0).a) : false;
        }

        @NotNull
        public final String getName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final Pair to(Object object0) {
            return new Pair(this, object0);
        }

        @Override
        @NotNull
        public String toString() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001F\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0005\u001A\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", "T", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "key", "value", "<init>", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "a", "Landroidx/datastore/preferences/core/Preferences$Key;", "getKey$datastore_preferences_core", "()Landroidx/datastore/preferences/core/Preferences$Key;", "b", "Ljava/lang/Object;", "getValue$datastore_preferences_core", "()Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Pair {
        public final Key a;
        public final Object b;

        public Pair(@NotNull Key preferences$Key0, Object object0) {
            Intrinsics.checkNotNullParameter(preferences$Key0, "key");
            super();
            this.a = preferences$Key0;
            this.b = object0;
        }

        @NotNull
        public final Key getKey$datastore_preferences_core() {
            return this.a;
        }

        public final Object getValue$datastore_preferences_core() {
            return this.b;
        }
    }

    @NotNull
    public abstract Map asMap();

    public abstract boolean contains(@NotNull Key arg1);

    @Nullable
    public abstract Object get(@NotNull Key arg1);

    @NotNull
    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(x.toMutableMap(this.asMap()), false);
    }

    @NotNull
    public final Preferences toPreferences() {
        return new MutablePreferences(x.toMutableMap(this.asMap()), true);
    }
}

