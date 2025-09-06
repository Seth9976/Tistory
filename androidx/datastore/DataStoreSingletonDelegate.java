package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u001E\u0010\u000E\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000B\u0012\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001A\u00020\u00032\n\u0010\u0015\u001A\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "", "fileName", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Landroidx/datastore/core/DataStore;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DataStoreSingletonDelegate implements ReadOnlyProperty {
    public final String a;
    public final OkioSerializer b;
    public final ReplaceFileCorruptionHandler c;
    public final Function1 d;
    public final CoroutineScope e;
    public final Object f;
    public volatile DataStore g;

    public DataStoreSingletonDelegate(@NotNull String s, @NotNull OkioSerializer okioSerializer0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function1 function10, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(s, "fileName");
        Intrinsics.checkNotNullParameter(okioSerializer0, "serializer");
        Intrinsics.checkNotNullParameter(function10, "produceMigrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        super();
        this.a = s;
        this.b = okioSerializer0;
        this.c = replaceFileCorruptionHandler0;
        this.d = function10;
        this.e = coroutineScope0;
        this.f = new Object();
    }

    @NotNull
    public DataStore getValue(@NotNull Context context0, @NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(context0, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        DataStore dataStore0 = this.g;
        if(dataStore0 == null) {
            synchronized(this.f) {
                if(this.g == null) {
                    Context context1 = context0.getApplicationContext();
                    b b0 = new b(context1, this);
                    OkioStorage okioStorage0 = new OkioStorage(FileSystem.SYSTEM, this.b, null, b0, 4, null);
                    Intrinsics.checkNotNullExpressionValue(context1, "applicationContext");
                    List list0 = (List)this.d.invoke(context1);
                    this.g = DataStoreFactory.INSTANCE.create(okioStorage0, this.c, list0, this.e);
                }
                DataStore dataStore1 = this.g;
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

