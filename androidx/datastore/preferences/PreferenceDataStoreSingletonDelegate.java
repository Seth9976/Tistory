package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001E\u0010\f\u001A\u001A\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B0\n0\t\u0012\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J*\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001A\u00020\u00022\n\u0010\u0013\u001A\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "", "name", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Landroidx/datastore/core/DataStore;", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty {
    public final String a;
    public final ReplaceFileCorruptionHandler b;
    public final Function1 c;
    public final CoroutineScope d;
    public final Object e;
    public volatile DataStore f;

    public PreferenceDataStoreSingletonDelegate(@NotNull String s, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function1 function10, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "produceMigrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        super();
        this.a = s;
        this.b = replaceFileCorruptionHandler0;
        this.c = function10;
        this.d = coroutineScope0;
        this.e = new Object();
    }

    @NotNull
    public DataStore getValue(@NotNull Context context0, @NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(context0, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        DataStore dataStore0 = this.f;
        if(dataStore0 == null) {
            synchronized(this.e) {
                if(this.f == null) {
                    Context context1 = context0.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(context1, "applicationContext");
                    List list0 = (List)this.c.invoke(context1);
                    a a0 = new a(19, context1, this);
                    this.f = PreferenceDataStoreFactory.INSTANCE.create(this.b, list0, this.d, a0);
                }
                DataStore dataStore1 = this.f;
                Intrinsics.checkNotNull(dataStore1);
                return dataStore1;
            }
        }
        return dataStore0;
    }

    @Override  // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object object0, KProperty kProperty0) {
        return this.getValue(((Context)object0), kProperty0);
    }
}

