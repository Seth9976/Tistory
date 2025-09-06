package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import java.io.IOException;
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
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import x3.c;
import x3.d;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000E\u0010\u000FJZ\u0010\u001B\u001A\u00028\u0001\"\u0004\b\u0001\u0010\u00102B\u0010\u001A\u001A>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u0019H\u0096@¢\u0006\u0004\b\u001B\u0010\u001CJ?\u0010\u001F\u001A\u00020\f2-\u0010\u001A\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001D¢\u0006\u0002\b\u0019H\u0096@¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u001A\u0010\n\u001A\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&¨\u0006\'"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", "name", "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "readScope", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "d", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n38#2,23:226\n38#2,23:257\n120#3,8:249\n129#3:280\n1#4:281\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:226,23\n136#1:257,23\n129#1:249,8\n129#1:280\n*E\n"})
public final class OkioStorageConnection implements StorageConnection {
    public final FileSystem a;
    public final Path b;
    public final OkioSerializer c;
    public final InterProcessCoordinator d;
    public final Function0 e;
    public final AtomicBoolean f;
    public final Mutex g;

    public OkioStorageConnection(@NotNull FileSystem fileSystem0, @NotNull Path path0, @NotNull OkioSerializer okioSerializer0, @NotNull InterProcessCoordinator interProcessCoordinator0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(okioSerializer0, "serializer");
        Intrinsics.checkNotNullParameter(interProcessCoordinator0, "coordinator");
        Intrinsics.checkNotNullParameter(function00, "onClose");
        super();
        this.a = fileSystem0;
        this.b = path0;
        this.c = okioSerializer0;
        this.d = interProcessCoordinator0;
        this.e = function00;
        this.f = new AtomicBoolean(false);
        this.g = MutexKt.Mutex$default(false, 1, null);
    }

    @Override  // androidx.datastore.core.Closeable
    public void close() {
        this.f.set(true);
        this.e.invoke();
    }

    @Override  // androidx.datastore.core.StorageConnection
    @NotNull
    public InterProcessCoordinator getCoordinator() {
        return this.d;
    }

    @Override  // androidx.datastore.core.StorageConnection
    @Nullable
    public Object readScope(@NotNull Function3 function30, @NotNull Continuation continuation0) {
        Throwable throwable3;
        OkioReadScope okioReadScope1;
        Object object2;
        boolean z1;
        Throwable throwable1;
        OkioStorageConnection okioStorageConnection0;
        OkioReadScope okioReadScope0;
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.t;
            if((v & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.t = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.f.get()) {
                    throw new IllegalStateException("StorageConnection has already been disposed.");
                }
                boolean z = DefaultImpls.tryLock$default(this.g, null, 1, null);
                try {
                    okioReadScope0 = new OkioReadScope(this.a, this.b, this.c);
                }
                catch(Throwable throwable0) {
                    okioStorageConnection0 = this;
                    throwable1 = throwable0;
                    z1 = z;
                    goto label_64;
                }
                try {
                    c0.o = this;
                    c0.p = okioReadScope0;
                    c0.q = z;
                    c0.t = 1;
                    object2 = function30.invoke(okioReadScope0, Boxing.boxBoolean(z), c0);
                }
                catch(Throwable throwable2) {
                    okioStorageConnection0 = this;
                    okioReadScope1 = okioReadScope0;
                    throwable3 = throwable2;
                    z1 = z;
                    goto label_49;
                }
                if(object2 == object1) {
                    return object1;
                }
                okioStorageConnection0 = this;
                okioReadScope1 = okioReadScope0;
                object0 = object2;
                z1 = z;
                break;
            }
            case 1: {
                try {
                    z1 = c0.q;
                    okioReadScope1 = c0.p;
                    okioStorageConnection0 = c0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable3) {
                }
                try {
                label_49:
                    okioReadScope1.close();
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
            okioReadScope1.close();
            throwable5 = null;
        }
        catch(Throwable throwable5) {
        }
        if(throwable5 == null) {
            if(z1) {
                DefaultImpls.unlock$default(okioStorageConnection0.g, null, 1, null);
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
            DefaultImpls.unlock$default(okioStorageConnection0.g, null, 1, null);
        }
        throw throwable1;
    }

    @Override  // androidx.datastore.core.StorageConnection
    @Nullable
    public Object writeScope(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Closeable closeable0;
        Throwable throwable2;
        Mutex mutex2;
        OkioStorageConnection okioStorageConnection1;
        Path path2;
        OkioWriteScope okioWriteScope0;
        Path path1;
        OkioStorageConnection okioStorageConnection0;
        Mutex mutex0;
        Path path0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.u;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.u = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.f.get()) {
                    throw new IllegalStateException("StorageConnection has already been disposed.");
                }
                path0 = this.b.parent();
                if(path0 != null) {
                    this.a.createDirectories(path0, false);
                    d0.o = this;
                    d0.p = function20;
                    d0.q = path0;
                    mutex0 = this.g;
                    d0.r = mutex0;
                    d0.u = 1;
                    if(mutex0.lock(null, d0) == object1) {
                        return object1;
                    }
                    try {
                        okioStorageConnection0 = this;
                        path1 = path0.resolve(okioStorageConnection0.b.name() + ".tmp");
                        goto label_39;
                    }
                    catch(Throwable throwable0) {
                        mutex0.unlock(null);
                        throw throwable0;
                    }
                }
                throw new IllegalStateException("must have a parent path");
            }
            case 1: {
                Mutex mutex1 = (Mutex)d0.r;
                path0 = d0.q;
                Function2 function21 = (Function2)d0.p;
                okioStorageConnection0 = d0.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                function20 = function21;
                try {
                    path1 = path0.resolve(okioStorageConnection0.b.name() + ".tmp");
                    try {
                    label_39:
                        okioStorageConnection0.a.delete(path1, false);
                        okioWriteScope0 = new OkioWriteScope(okioStorageConnection0.a, path1, okioStorageConnection0.c);
                        goto label_44;
                    }
                    catch(IOException iOException0) {
                    }
                }
                catch(Throwable throwable0) {
                    mutex0.unlock(null);
                    throw throwable0;
                }
                goto label_89;
                try {
                label_44:
                    d0.o = okioStorageConnection0;
                    d0.p = mutex0;
                    d0.q = path1;
                    d0.r = okioWriteScope0;
                    d0.u = 2;
                    if(function20.invoke(okioWriteScope0, d0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    path2 = path1;
                    okioStorageConnection1 = okioStorageConnection0;
                    mutex2 = mutex0;
                    throwable2 = throwable1;
                    closeable0 = okioWriteScope0;
                    goto label_71;
                }
                path2 = path1;
                closeable0 = okioWriteScope0;
                okioStorageConnection1 = okioStorageConnection0;
                mutex2 = mutex0;
                break;
            }
            case 2: {
                closeable0 = (Closeable)d0.r;
                path2 = d0.q;
                mutex2 = (Mutex)d0.p;
                okioStorageConnection1 = d0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_71:
                    closeable0.close();
                    throw throwable2;
                }
                catch(Throwable throwable3) {
                    try {
                        b.addSuppressed(throwable2, throwable3);
                        throw throwable2;
                    }
                    catch(IOException iOException0) {
                        goto label_86;
                    }
                    catch(Throwable throwable0) {
                        mutex0 = mutex2;
                        mutex0.unlock(null);
                        throw throwable0;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            closeable0.close();
            throwable4 = null;
        }
        catch(Throwable throwable4) {
        }
        try {
            if(throwable4 != null) {
                throw throwable4;
            }
            if(okioStorageConnection1.a.exists(path2)) {
                okioStorageConnection1.a.atomicMove(path2, okioStorageConnection1.b);
            }
            goto label_98;
        }
        catch(IOException iOException0) {
        label_86:
            okioStorageConnection0 = okioStorageConnection1;
            mutex0 = mutex2;
            path1 = path2;
            try {
            label_89:
                if(okioStorageConnection0.a.exists(path1)) {
                    try {
                        okioStorageConnection0.a.delete(path1);
                    }
                    catch(IOException unused_ex) {
                    }
                }
                throw iOException0;
            }
            catch(Throwable throwable0) {
            }
        }
        catch(Throwable throwable0) {
            mutex0 = mutex2;
        }
        mutex0.unlock(null);
        throw throwable0;
    label_98:
        mutex2.unlock(null);
        return Unit.INSTANCE;
    }
}

