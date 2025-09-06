package androidx.datastore.migrations;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0002\b\u0006\" \u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "", "a", "Ljava/util/Set;", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SharedPreferencesMigration_androidKt {
    public static final LinkedHashSet a;

    static {
        SharedPreferencesMigration_androidKt.a = new LinkedHashSet();
    }

    @NotNull
    public static final Set getMIGRATE_ALL_KEYS() {
        return SharedPreferencesMigration_androidKt.a;
    }
}

