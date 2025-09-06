package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex.DefaultImpls;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.d0;
import w3.e0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJZ\u0010\u0019\u001A\u00028\u0001\"\u0004\b\u0001\u0010\u000E2B\u0010\u0018\u001A>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000F¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001AJ?\u0010\u001D\u001A\u00020\n2-\u0010\u0018\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001B¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\nH\u0016¢\u0006\u0004\b\u001F\u0010 R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "c", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n38#2,23:208\n38#2,23:239\n120#3,8:231\n129#3:262\n1#4:263\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n100#1:208,23\n117#1:239,23\n114#1:231,8\n114#1:262\n*E\n"})
public final class FileStorageConnection implements StorageConnection {
    public final File a;
    public final Serializer b;
    public final InterProcessCoordinator c;
    public final Function0 d;
    public final AtomicBoolean e;
    public final Mutex f;

    public FileStorageConnection(@NotNull File file0, @NotNull Serializer serializer0, @NotNull InterProcessCoordinator interProcessCoordinator0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(file0, "file");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(interProcessCoordinator0, "coordinator");
        Intrinsics.checkNotNullParameter(function00, "onClose");
        super();
        this.a = file0;
        this.b = serializer0;
        this.c = interProcessCoordinator0;
        this.d = function00;
        this.e = new AtomicBoolean(false);
        this.f = MutexKt.Mutex$default(false, 1, null);
    }

    @Override  // androidx.datastore.core.Closeable
    public void close() {
        this.e.set(true);
        this.d.invoke();
    }

    @Override  // androidx.datastore.core.StorageConnection
    @NotNull
    public InterProcessCoordinator getCoordinator() {
        return this.c;
    }

    @Override  // androidx.datastore.core.StorageConnection
    @Nullable
    public Object readScope(@NotNull Function3 function30, @NotNull Continuation continuation0) {
        Throwable throwable3;
        FileReadScope fileReadScope1;
        Object object2;
        boolean z1;
        Throwable throwable1;
        FileStorageConnection fileStorageConnection0;
        FileReadScope fileReadScope0;
        d0 d00;
        if(continuation0 instanceof d0) {
            d00 = (d0)continuation0;
            int v = d00.t;
            if((v & 0x80000000) == 0) {
                d00 = new d0(this, continuation0);
            }
            else {
                d00.t = v ^ 0x80000000;
            }
        }
        else {
            d00 = new d0(this, continuation0);
        }
        Object object0 = d00.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.e.get()) {
                    throw new IllegalStateException("StorageConnection has already been disposed.");
                }
                boolean z = DefaultImpls.tryLock$default(this.f, null, 1, null);
                try {
                    fileReadScope0 = new FileReadScope(this.a, this.b);
                }
                catch(Throwable throwable0) {
                    fileStorageConnection0 = this;
                    throwable1 = throwable0;
                    z1 = z;
                    goto label_64;
                }
                try {
                    d00.o = this;
                    d00.p = fileReadScope0;
                    d00.q = z;
                    d00.t = 1;
                    object2 = function30.invoke(fileReadScope0, Boxing.boxBoolean(z), d00);
                }
                catch(Throwable throwable2) {
                    fileStorageConnection0 = this;
                    fileReadScope1 = fileReadScope0;
                    throwable3 = throwable2;
                    z1 = z;
                    goto label_49;
                }
                if(object2 == object1) {
                    return object1;
                }
                fileStorageConnection0 = this;
                fileReadScope1 = fileReadScope0;
                object0 = object2;
                z1 = z;
                break;
            }
            case 1: {
                try {
                    z1 = d00.q;
                    fileReadScope1 = d00.p;
                    fileStorageConnection0 = d00.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable3) {
                }
                try {
                label_49:
                    fileReadScope1.close();
                    throw throwable3;
                }
                catch(Throwable throwable4) {
                    try {
                        b.addSuppressed(throwable3, throwable4);
                        throw throwable3;
                    }
                    catch(Throwable throwable1) {
                        goto label_64;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            fileReadScope1.close();
            throwable5 = null;
        }
        catch(Throwable throwable5) {
        }
        if(throwable5 == null) {
            if(z1) {
                DefaultImpls.unlock$default(fileStorageConnection0.f, null, 1, null);
            }
            return object0;
        }
        try {
            throw throwable5;
        }
        catch(Throwable throwable1) {
        }
    label_64:
        if(z1) {
            DefaultImpls.unlock$default(fileStorageConnection0.f, null, 1, null);
        }
        throw throwable1;
    }

    @Override  // androidx.datastore.core.StorageConnection
    @Nullable
    public Object writeScope(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        FileStorageConnection fileStorageConnection1;
        FileWriteScope fileWriteScope1;
        Throwable throwable2;
        File file3;
        FileWriteScope fileWriteScope0;
        File file2;
        Mutex mutex1;
        FileStorageConnection fileStorageConnection0;
        e0 e00;
        if(continuation0 instanceof e0) {
            e00 = (e0)continuation0;
            int v = e00.u;
            if((v & 0x80000000) == 0) {
                e00 = new e0(this, continuation0);
            }
            else {
                e00.u = v ^ 0x80000000;
            }
        }
        else {
            e00 = new e0(this, continuation0);
        }
        Object object0 = e00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e00.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!this.e.get()) {
                    File file0 = this.a;
                    File file1 = file0.getCanonicalFile().getParentFile();
                    if(file1 != null) {
                        file1.mkdirs();
                        if(!file1.isDirectory()) {
                            throw new IOException("Unable to create parent directories of " + file0);
                        }
                    }
                    e00.o = this;
                    e00.p = function20;
                    Mutex mutex0 = this.f;
                    e00.q = mutex0;
                    e00.u = 1;
                    if(mutex0.lock(null, e00) == object1) {
                        return object1;
                    }
                    try {
                        fileStorageConnection0 = this;
                        mutex1 = mutex0;
                        file2 = new File(fileStorageConnection0.a.getAbsolutePath() + ".tmp");
                        fileWriteScope0 = new FileWriteScope(file2, fileStorageConnection0.b);
                        goto label_44;
                    }
                    catch(Throwable throwable0) {
                        mutex1.unlock(null);
                        throw throwable0;
                    }
                }
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            case 1: {
                Mutex mutex2 = (Mutex)e00.q;
                Function2 function21 = (Function2)e00.p;
                fileStorageConnection0 = e00.o;
                ResultKt.throwOnFailure(object0);
                mutex1 = mutex2;
                function20 = function21;
                try {
                    file2 = new File(fileStorageConnection0.a.getAbsolutePath() + ".tmp");
                    try {
                        fileWriteScope0 = new FileWriteScope(file2, fileStorageConnection0.b);
                        goto label_44;
                    }
                    catch(IOException iOException0) {
                    }
                }
                catch(Throwable throwable0) {
                    mutex1.unlock(null);
                    throw throwable0;
                }
                goto label_83;
                try {
                label_44:
                    e00.o = fileStorageConnection0;
                    e00.p = mutex1;
                    e00.q = file2;
                    e00.r = fileWriteScope0;
                    e00.u = 2;
                    if(function20.invoke(fileWriteScope0, e00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    file3 = file2;
                    throwable2 = throwable1;
                    fileWriteScope1 = fileWriteScope0;
                    goto label_68;
                }
                file3 = file2;
                fileStorageConnection1 = fileStorageConnection0;
                fileWriteScope1 = fileWriteScope0;
                break;
            }
            case 2: {
                fileWriteScope1 = e00.r;
                file3 = (File)e00.q;
                mutex1 = (Mutex)e00.p;
                fileStorageConnection1 = e00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_68:
                    fileWriteScope1.close();
                    throw throwable2;
                }
                catch(Throwable throwable3) {
                    try {
                        b.addSuppressed(throwable2, throwable3);
                        throw throwable2;
                    }
                    catch(IOException iOException0) {
                        goto label_82;
                    }
                    catch(Throwable throwable0) {
                        mutex1.unlock(null);
                        throw throwable0;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            fileWriteScope1.close();
            throwable4 = null;
        }
        catch(Throwable throwable4) {
        }
        try {
            if(throwable4 != null) {
                throw throwable4;
            }
            if(file3.exists() && !FileMoves_androidKt.atomicMoveTo(file3, fileStorageConnection1.a)) {
                throw new IOException("Unable to rename " + file3 + " to " + fileStorageConnection1.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        catch(IOException iOException0) {
        label_82:
            file2 = file3;
            try {
            label_83:
                if(file2.exists()) {
                    file2.delete();
                }
                throw iOException0;
            }
            catch(Throwable throwable0) {
                mutex1.unlock(null);
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
            mutex1.unlock(null);
            throw throwable0;
        }
        mutex1.unlock(null);
        return Unit.INSTANCE;
    }
}

