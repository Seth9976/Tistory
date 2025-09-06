package androidx.datastore.core;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w3.c0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010B9\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/FileStorage;", "T", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/Serializer;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Landroidx/datastore/core/Serializer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FileStorage implements Storage {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000E\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "", "", "activeFiles", "Ljava/util/Set;", "getActiveFiles$datastore_core_release", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "getActiveFilesLock$datastore_core_release", "()Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Set getActiveFiles$datastore_core_release() {
            return FileStorage.d;
        }

        @NotNull
        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.e;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Serializer a;
    public final Function1 b;
    public final Function0 c;
    public static final LinkedHashSet d;
    public static final Object e;

    static {
        FileStorage.Companion = new Companion(null);
        FileStorage.d = new LinkedHashSet();
        FileStorage.e = new Object();
    }

    public FileStorage(@NotNull Serializer serializer0, @NotNull Function1 function10, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(function10, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        super();
        this.a = serializer0;
        this.b = function10;
        this.c = function00;
    }

    public FileStorage(Serializer serializer0, Function1 function10, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = c0.w;
        }
        this(serializer0, function10, function00);
    }

    @Override  // androidx.datastore.core.Storage
    @NotNull
    public StorageConnection createConnection() {
        String s;
        File file0 = ((File)this.c.invoke()).getCanonicalFile();
        synchronized(FileStorage.e) {
            s = file0.getAbsolutePath();
            LinkedHashSet linkedHashSet0 = FileStorage.d;
            if(!linkedHashSet0.contains(s)) {
                Intrinsics.checkNotNullExpressionValue(s, "path");
                linkedHashSet0.add(s);
                Intrinsics.checkNotNullExpressionValue(file0, "file");
                InterProcessCoordinator interProcessCoordinator0 = (InterProcessCoordinator)this.b.invoke(file0);
                i i0 = new i(file0);
                return new FileStorageConnection(file0, this.a, interProcessCoordinator0, i0);
            }
        }
        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + s + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled).").toString());
    }
}

