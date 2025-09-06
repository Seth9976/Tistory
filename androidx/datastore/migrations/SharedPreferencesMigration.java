package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;
import y3.b;
import y3.d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001DBw\b\u0017\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001A$\b\u0001\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000E¢\u0006\u0004\b\u0011\u0010\u0012By\b\u0017\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u0006\u0010\u0015\u001A\u00020\u0007\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001A$\b\u0001\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000E¢\u0006\u0004\b\u0011\u0010\u0016J\u0018\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00028\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AH\u0096@¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", "T", "Landroidx/datastore/core/DataMigration;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "migrate", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "Landroid/content/Context;", "context", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "currentData", "shouldMigrate", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cleanUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y3/c", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1747#2,3:324\n1855#2,2:327\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n*L\n158#1:324,3\n178#1:327,2\n*E\n"})
public final class SharedPreferencesMigration implements DataMigration {
    public final Function2 a;
    public final Function3 b;
    public final Context c;
    public final String d;
    public final Lazy e;
    public final Set f;

    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context0, @NotNull String s, @NotNull Set set0, @NotNull Function2 function20, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(set0, "keysToMigrate");
        Intrinsics.checkNotNullParameter(function20, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(function30, "migrate");
        this(new a(16, context0, s), set0, function20, function30, context0, s);
    }

    public SharedPreferencesMigration(Context context0, String s, Set set0, Function2 function20, Function3 function30, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            set0 = SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS();
        }
        if((v & 8) != 0) {
            function20 = new b(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        }
        this(context0, s, set0, function20, function30);
    }

    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context0, @NotNull String s, @NotNull Set set0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(set0, "keysToMigrate");
        Intrinsics.checkNotNullParameter(function30, "migrate");
        this(context0, s, set0, null, function30, 8, null);
    }

    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context0, @NotNull String s, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(function30, "migrate");
        this(context0, s, null, null, function30, 12, null);
    }

    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0 function00, @NotNull Set set0, @NotNull Function2 function20, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function00, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(set0, "keysToMigrate");
        Intrinsics.checkNotNullParameter(function20, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(function30, "migrate");
        this(function00, set0, function20, function30, null, null);
    }

    public SharedPreferencesMigration(Function0 function00, Set set0, Function2 function20, Function3 function30, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            set0 = SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS();
        }
        if((v & 4) != 0) {
            function20 = new y3.a(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        }
        this(function00, set0, function20, function30);
    }

    public SharedPreferencesMigration(Function0 function00, Set set0, Function2 function20, Function3 function30, Context context0, String s) {
        this.a = function20;
        this.b = function30;
        this.c = context0;
        this.d = s;
        this.e = c.lazy(function00);
        this.f = set0 == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : CollectionsKt___CollectionsKt.toMutableSet(set0);
    }

    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0 function00, @NotNull Set set0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function00, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(set0, "keysToMigrate");
        Intrinsics.checkNotNullParameter(function30, "migrate");
        this(function00, set0, null, function30, 4, null);
    }

    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0 function00, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function00, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(function30, "migrate");
        this(function00, null, null, function30, 6, null);
    }

    @Override  // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation continuation0) throws IOException {
        Lazy lazy0 = this.e;
        SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)lazy0.getValue()).edit();
        Set set0 = this.f;
        if(set0 == null) {
            sharedPreferences$Editor0.clear();
        }
        else {
            for(Object object0: set0) {
                sharedPreferences$Editor0.remove(((String)object0));
            }
        }
        if(!sharedPreferences$Editor0.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if(((SharedPreferences)lazy0.getValue()).getAll().isEmpty()) {
            Context context0 = this.c;
            if(context0 != null) {
                String s = this.d;
                if(s != null) {
                    y3.c.a(context0, s);
                }
            }
        }
        if(set0 != null) {
            set0.clear();
        }
        return Unit.INSTANCE;
    }

    @Override  // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(Object object0, @NotNull Continuation continuation0) {
        SharedPreferencesView sharedPreferencesView0 = new SharedPreferencesView(((SharedPreferences)this.e.getValue()), this.f);
        return this.b.invoke(sharedPreferencesView0, object0, continuation0);
    }

    @Override  // androidx.datastore.core.DataMigration
    @Nullable
    public Object shouldMigrate(Object object0, @NotNull Continuation continuation0) {
        SharedPreferencesMigration sharedPreferencesMigration0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.r;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.r = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object1 = d0.p;
        Object object2 = qd.a.getCOROUTINE_SUSPENDED();
        switch(d0.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                d0.o = this;
                d0.r = 1;
                object1 = this.a.invoke(object0, d0);
                if(object1 == object2) {
                    return object2;
                }
                sharedPreferencesMigration0 = this;
                break;
            }
            case 1: {
                sharedPreferencesMigration0 = d0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object1).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        Set set0 = sharedPreferencesMigration0.f;
        Lazy lazy0 = sharedPreferencesMigration0.e;
        if(set0 == null) {
            Map map0 = ((SharedPreferences)lazy0.getValue()).getAll();
            Intrinsics.checkNotNullExpressionValue(map0, "sharedPrefs.all");
            return map0.isEmpty() ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
        }
        SharedPreferences sharedPreferences0 = (SharedPreferences)lazy0.getValue();
        if(!(set0 instanceof Collection) || !set0.isEmpty()) {
            for(Object object3: set0) {
                if(sharedPreferences0.contains(((String)object3))) {
                    return Boxing.boxBoolean(true);
                }
                if(false) {
                    break;
                }
            }
        }
        return Boxing.boxBoolean(false);
    }
}

