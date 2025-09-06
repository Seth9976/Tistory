package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import w1.a;
import x3.b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0012BG\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001A\b\u0002\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\b0\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", "T", "Landroidx/datastore/core/Storage;", "Lokio/FileSystem;", "fileSystem", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Lkotlin/Function2;", "Lokio/Path;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinatorProducer", "Lkotlin/Function0;", "producePath", "<init>", "(Lokio/FileSystem;Landroidx/datastore/core/okio/OkioSerializer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "Companion", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n+ 2 Atomic.jvm.kt\nandroidx/datastore/core/okio/Synchronizer\n*L\n1#1,225:1\n49#2,2:226\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n*L\n64#1:226,2\n*E\n"})
public final class OkioStorage implements Storage {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "", "", "activeFiles", "Ljava/util/Set;", "getActiveFiles$datastore_core_okio", "()Ljava/util/Set;", "Landroidx/datastore/core/okio/Synchronizer;", "activeFilesLock", "Landroidx/datastore/core/okio/Synchronizer;", "getActiveFilesLock", "()Landroidx/datastore/core/okio/Synchronizer;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Set getActiveFiles$datastore_core_okio() {
            return OkioStorage.f;
        }

        @NotNull
        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.g;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final FileSystem a;
    public final OkioSerializer b;
    public final Function2 c;
    public final Function0 d;
    public final Lazy e;
    public static final LinkedHashSet f;
    public static final Synchronizer g;

    static {
        OkioStorage.Companion = new Companion(null);
        OkioStorage.f = new LinkedHashSet();
        OkioStorage.g = new Synchronizer();
    }

    public OkioStorage(@NotNull FileSystem fileSystem0, @NotNull OkioSerializer okioSerializer0, @NotNull Function2 function20, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(okioSerializer0, "serializer");
        Intrinsics.checkNotNullParameter(function20, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(function00, "producePath");
        super();
        this.a = fileSystem0;
        this.b = okioSerializer0;
        this.c = function20;
        this.d = function00;
        this.e = c.lazy(new a(this, 4));
    }

    public OkioStorage(FileSystem fileSystem0, OkioSerializer okioSerializer0, Function2 function20, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function20 = b.w;
        }
        this(fileSystem0, okioSerializer0, function20, function00);
    }

    public static final Path access$getCanonicalPath(OkioStorage okioStorage0) {
        return (Path)okioStorage0.e.getValue();
    }

    public static final Function0 access$getProducePath$p(OkioStorage okioStorage0) {
        return okioStorage0.d;
    }

    @Override  // androidx.datastore.core.Storage
    @NotNull
    public StorageConnection createConnection() {
        String s = ((Path)this.e.getValue()).toString();
        synchronized(OkioStorage.g) {
            LinkedHashSet linkedHashSet0 = OkioStorage.f;
            if(!linkedHashSet0.contains(s)) {
                linkedHashSet0.add(s);
                Object object0 = this.e.getValue();
                Path path0 = (Path)this.e.getValue();
                Object object1 = this.c.invoke(path0, this.a);
                androidx.datastore.core.okio.a a0 = new androidx.datastore.core.okio.a(this);
                return new OkioStorageConnection(this.a, ((Path)object0), this.b, ((InterProcessCoordinator)object1), a0);
            }
        }
        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + s + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled).").toString());
    }
}

