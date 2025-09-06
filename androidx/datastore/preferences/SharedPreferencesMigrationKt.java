package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z3.c;
import z3.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001A3\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001A5\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\r\" \u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "SharedPreferencesMigration", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;)Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroid/content/Context;", "context", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Landroidx/datastore/migrations/SharedPreferencesMigration;", "a", "Ljava/util/Set;", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "SharedPreferencesMigrationKt")
public final class SharedPreferencesMigrationKt {
    public static final LinkedHashSet a;

    static {
        SharedPreferencesMigrationKt.a = new LinkedHashSet();
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration SharedPreferencesMigration(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "sharedPreferencesName");
        return SharedPreferencesMigrationKt.SharedPreferencesMigration$default(context0, s, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration SharedPreferencesMigration(@NotNull Context context0, @NotNull String s, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(set0, "keysToMigrate");
        return set0 == SharedPreferencesMigrationKt.a ? new SharedPreferencesMigration(context0, s, null, new d(set0, null), new c(3, null), 4, null) : new SharedPreferencesMigration(context0, s, set0, new d(set0, null), new c(3, null));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V / 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration SharedPreferencesMigration(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "produceSharedPreferences");
        return SharedPreferencesMigrationKt.SharedPreferencesMigration$default(function00, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration SharedPreferencesMigration(@NotNull Function0 function00, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(function00, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(set0, "keysToMigrate");
        return set0 == SharedPreferencesMigrationKt.a ? new SharedPreferencesMigration(function00, null, new d(set0, null), new c(3, null), 2, null) : new SharedPreferencesMigration(function00, set0, new d(set0, null), new c(3, null));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V / 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    public static SharedPreferencesMigration SharedPreferencesMigration$default(Context context0, String s, Set set0, int v, Object object0) {
        if((v & 4) != 0) {
            set0 = SharedPreferencesMigrationKt.a;
        }
        return SharedPreferencesMigrationKt.SharedPreferencesMigration(context0, s, set0);
    }

    public static SharedPreferencesMigration SharedPreferencesMigration$default(Function0 function00, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            set0 = SharedPreferencesMigrationKt.a;
        }
        return SharedPreferencesMigrationKt.SharedPreferencesMigration(function00, set0);
    }

    @NotNull
    public static final Set getMIGRATE_ALL_KEYS() {
        return SharedPreferencesMigrationKt.a;
    }
}

