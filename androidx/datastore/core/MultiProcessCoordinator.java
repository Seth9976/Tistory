package androidx.datastore.core;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.g0;
import w3.h0;
import w3.i0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b2\u001C\u0010\f\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000EJ:\u0010\u0011\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b2\"\u0010\f\u001A\u001E\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u000FH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0015R\u001A\u0010\u0005\u001A\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR \u0010!\u001A\b\u0012\u0004\u0012\u00020\u001C0\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006#"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/io/File;", "file", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "b", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lkotlinx/coroutines/flow/Flow;", "", "c", "Lkotlinx/coroutines/flow/Flow;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "updateNotifications", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,205:1\n159#1,8:226\n159#1,8:234\n120#2,10:206\n32#3,10:216\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n99#1:226,8\n106#1:234,8\n43#1:206,10\n60#1:216,10\n*E\n"})
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final Object access$getExclusiveFileLockWithRetryIfDeadlock(Companion multiProcessCoordinator$Companion0, FileOutputStream fileOutputStream0, Continuation continuation0) {
            long v1;
            j j0;
            multiProcessCoordinator$Companion0.getClass();
            if(continuation0 instanceof j) {
                j0 = (j)continuation0;
                int v = j0.s;
                if((v & 0x80000000) == 0) {
                    j0 = new j(multiProcessCoordinator$Companion0, continuation0);
                }
                else {
                    j0.s = v ^ 0x80000000;
                }
            }
            else {
                j0 = new j(multiProcessCoordinator$Companion0, continuation0);
            }
            Object object0 = j0.q;
            FileLock fileLock0 = a.getCOROUTINE_SUSPENDED();
        alab1:
            switch(j0.s) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    v1 = 10L;
                    goto label_21;
                }
                case 1: {
                    v1 = j0.p;
                    fileOutputStream0 = j0.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        v1 *= 2L;
                    label_21:
                        if(Long.compare(v1, 60000L) > 0) {
                            break alab1;
                        }
                        try {
                            FileLock fileLock1 = fileOutputStream0.getChannel().lock(0L, 0x7FFFFFFFFFFFFFFFL, false);
                            Intrinsics.checkNotNullExpressionValue(fileLock1, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                            return fileLock1;
                        }
                        catch(IOException iOException0) {
                        }
                        String s = iOException0.getMessage();
                        if(s == null || !StringsKt__StringsKt.contains$default(s, "Resource deadlock would occur", false, 2, null)) {
                            break;
                        }
                        j0.o = fileOutputStream0;
                        j0.p = v1;
                        j0.s = 1;
                        if(DelayKt.delay(v1, j0) == fileLock0) {
                            return fileLock0;
                        }
                    }
                    throw iOException0;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            fileLock0 = fileOutputStream0.getChannel().lock(0L, 0x7FFFFFFFFFFFFFFFL, false);
            Intrinsics.checkNotNullExpressionValue(fileLock0, "lockFileStream.getChanne…LUE, /* shared= */ false)");
            return fileLock0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final CoroutineContext a;
    public final File b;
    public final Flow c;
    public final String d;
    public final String e;
    public final String f;
    public final Mutex g;
    public final Lazy h;
    public final Lazy i;
    public static final String j;
    public static final long k;
    public static final long l;

    static {
        MultiProcessCoordinator.Companion = new Companion(null);
        MultiProcessCoordinator.j = "Resource deadlock would occur";
        MultiProcessCoordinator.k = 10L;
        MultiProcessCoordinator.l = 60000L;
    }

    public MultiProcessCoordinator(@NotNull CoroutineContext coroutineContext0, @NotNull File file0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(file0, "file");
        super();
        this.a = coroutineContext0;
        this.b = file0;
        this.c = MulticastFileObserver.Companion.observe(file0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = MutexKt.Mutex$default(false, 1, null);
        this.h = c.lazy(new g0(this, 1));
        this.i = c.lazy(new k(this));
    }

    public static final void access$createIfNotExists(MultiProcessCoordinator multiProcessCoordinator0, File file0) {
        multiProcessCoordinator0.getClass();
        File file1 = file0.getCanonicalFile().getParentFile();
        if(file1 != null) {
            file1.mkdirs();
            if(!file1.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file0);
            }
        }
        if(!file0.exists()) {
            file0.createNewFile();
        }
    }

    public static final File access$fileWithSuffix(MultiProcessCoordinator multiProcessCoordinator0, String s) {
        multiProcessCoordinator0.getClass();
        return new File(multiProcessCoordinator0.b.getAbsolutePath() + s);
    }

    // 去混淆评级： 低(20)
    public static final String access$getDEADLOCK_ERROR_MESSAGE$cp() [...] // 潜在的解密器

    public static final long access$getINITIAL_WAIT_MILLIS$cp() [...] // 潜在的解密器

    public static final long access$getMAX_WAIT_MILLIS$cp() [...] // 潜在的解密器

    public static final SharedCounter access$getSharedCounter(MultiProcessCoordinator multiProcessCoordinator0) {
        return (SharedCounter)multiProcessCoordinator0.i.getValue();
    }

    @NotNull
    public final File getFile() {
        return this.b;
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @NotNull
    public Flow getUpdateNotifications() {
        return this.c;
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object getVersion(@NotNull Continuation continuation0) {
        Lazy lazy0 = this.i;
        if(lazy0.isInitialized()) {
            return Boxing.boxInt(((SharedCounter)lazy0.getValue()).getValue());
        }
        androidx.datastore.core.MultiProcessCoordinator.getVersion..inlined.withLazyCounter.1 multiProcessCoordinator$getVersion$$inlined$withLazyCounter$10 = new Function2(null) {
            public final MultiProcessCoordinator o;

            {
                this.o = multiProcessCoordinator0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new androidx.datastore.core.MultiProcessCoordinator.getVersion..inlined.withLazyCounter.1(this.o, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((androidx.datastore.core.MultiProcessCoordinator.getVersion..inlined.withLazyCounter.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxInt(MultiProcessCoordinator.access$getSharedCounter(this.o).getValue());
            }
        };
        return BuildersKt.withContext(this.a, multiProcessCoordinator$getVersion$$inlined$withLazyCounter$10, continuation0);
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object incrementAndGetVersion(@NotNull Continuation continuation0) {
        Lazy lazy0 = this.i;
        if(lazy0.isInitialized()) {
            return Boxing.boxInt(((SharedCounter)lazy0.getValue()).incrementAndGetValue());
        }
        androidx.datastore.core.MultiProcessCoordinator.incrementAndGetVersion..inlined.withLazyCounter.1 multiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$10 = new Function2(null) {
            public final MultiProcessCoordinator o;

            {
                this.o = multiProcessCoordinator0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new androidx.datastore.core.MultiProcessCoordinator.incrementAndGetVersion..inlined.withLazyCounter.1(this.o, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((androidx.datastore.core.MultiProcessCoordinator.incrementAndGetVersion..inlined.withLazyCounter.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxInt(MultiProcessCoordinator.access$getSharedCounter(this.o).incrementAndGetValue());
            }
        };
        return BuildersKt.withContext(this.a, multiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$10, continuation0);
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object lock(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        Object object3;
        FileLock fileLock1;
        Mutex mutex3;
        Closeable closeable1;
        Function1 function12;
        FileLock fileLock0;
        Throwable throwable2;
        Closeable closeable0;
        Mutex mutex2;
        Object object2;
        FileOutputStream fileOutputStream0;
        Mutex mutex0;
        h0 h00;
        if(continuation0 instanceof h0) {
            h00 = (h0)continuation0;
            int v = h00.t;
            if((v & 0x80000000) == 0) {
                h00 = new h0(this, continuation0);
            }
            else {
                h00.t = v ^ 0x80000000;
            }
        }
        else {
            h00 = new h0(this, continuation0);
        }
        Object object0 = h00.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h00.o = this;
                h00.p = function10;
                mutex0 = this.g;
                h00.q = mutex0;
                h00.t = 1;
                if(mutex0.lock(null, h00) == object1) {
                    return object1;
                }
                try {
                    fileOutputStream0 = new FileOutputStream(((File)this.h.getValue()));
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    mutex0.unlock(null);
                    throw throwable0;
                }
            }
            case 1: {
                Mutex mutex1 = (Mutex)h00.q;
                Function1 function11 = (Function1)h00.p;
                MultiProcessCoordinator multiProcessCoordinator0 = (MultiProcessCoordinator)h00.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                function10 = function11;
                try {
                    fileOutputStream0 = new FileOutputStream(((File)multiProcessCoordinator0.h.getValue()));
                }
                catch(Throwable throwable0) {
                    mutex0.unlock(null);
                    throw throwable0;
                }
                try {
                label_30:
                    h00.o = function10;
                    h00.p = mutex0;
                    h00.q = fileOutputStream0;
                    h00.t = 2;
                    object2 = Companion.access$getExclusiveFileLockWithRetryIfDeadlock(MultiProcessCoordinator.Companion, fileOutputStream0, h00);
                }
                catch(Throwable throwable1) {
                    mutex2 = mutex0;
                    closeable0 = fileOutputStream0;
                    throwable2 = throwable1;
                    fileLock0 = null;
                    goto label_85;
                }
                if(object2 == object1) {
                    return object1;
                }
                try {
                    function12 = function10;
                    closeable1 = fileOutputStream0;
                    mutex3 = mutex0;
                    fileLock1 = (FileLock)object2;
                    goto label_60;
                }
                catch(Throwable throwable2) {
                    closeable0 = closeable1;
                    mutex2 = mutex3;
                    fileLock0 = null;
                    goto label_85;
                }
            }
            case 2: {
                closeable1 = (Closeable)h00.q;
                mutex3 = (Mutex)h00.p;
                function12 = (Function1)h00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    fileLock1 = (FileLock)object0;
                }
                catch(Throwable throwable2) {
                    closeable0 = closeable1;
                    mutex2 = mutex3;
                    fileLock0 = null;
                    goto label_85;
                }
                try {
                label_60:
                    h00.o = mutex3;
                    h00.p = closeable1;
                    h00.q = fileLock1;
                    h00.t = 3;
                    object3 = function12.invoke(h00);
                }
                catch(Throwable throwable3) {
                    closeable0 = closeable1;
                    fileLock0 = fileLock1;
                    throwable2 = throwable3;
                    mutex2 = mutex3;
                    goto label_85;
                }
                if(object3 == object1) {
                    return object1;
                }
                closeable0 = closeable1;
                fileLock0 = fileLock1;
                object0 = object3;
                mutex2 = mutex3;
                goto label_88;
            }
            case 3: {
                fileLock0 = (FileLock)h00.q;
                closeable0 = (Closeable)h00.p;
                mutex2 = (Mutex)h00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_88;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_85:
                    if(fileLock0 != null) {
                        fileLock0.release();
                    }
                    throw throwable2;
                label_88:
                    if(fileLock0 != null) {
                        fileLock0.release();
                    }
                    goto label_99;
                }
                catch(Throwable throwable4) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            mutex0 = mutex2;
            throw throwable4;
        }
        catch(Throwable throwable5) {
            try {
                CloseableKt.closeFinally(closeable0, throwable4);
                throw throwable5;
            }
            catch(Throwable throwable0) {
            }
        }
        mutex0.unlock(null);
        throw throwable0;
        try {
        label_99:
            CloseableKt.closeFinally(closeable0, null);
        }
        catch(Throwable throwable0) {
            mutex0 = mutex2;
            mutex0.unlock(null);
            throw throwable0;
        }
        mutex2.unlock(null);
        return object0;
    }

    @Override  // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object tryLock(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        FileInputStream fileInputStream1;
        FileLock fileLock1;
        FileLock fileLock0;
        FileInputStream fileInputStream0;
        boolean z2;
        Mutex mutex1;
        i0 i00;
        if(continuation0 instanceof i0) {
            i00 = (i0)continuation0;
            int v = i00.u;
            if((v & 0x80000000) == 0) {
                i00 = new i0(this, continuation0);
            }
            else {
                i00.u = v ^ 0x80000000;
            }
        }
        else {
            i00 = new i0(this, continuation0);
        }
        Object object0 = i00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(i00.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Mutex mutex0 = this.g;
                boolean z1 = mutex0.tryLock(null);
                try {
                    if(!z1) {
                        i00.o = mutex0;
                        i00.r = false;
                        i00.u = 1;
                        object0 = function20.invoke(Boxing.boxBoolean(false), i00);
                        if(object0 == object1) {
                            return object1;
                        }
                        mutex1 = mutex0;
                        z2 = false;
                        goto label_74;
                    }
                    fileInputStream0 = new FileInputStream(((File)this.h.getValue()));
                }
                catch(Throwable throwable0) {
                    mutex1 = mutex0;
                    z2 = z1;
                    goto label_96;
                }
                try {
                    try {
                        fileLock0 = fileInputStream0.getChannel().tryLock(0L, 0x7FFFFFFFFFFFFFFFL, true);
                    }
                    catch(IOException iOException0) {
                        String s = iOException0.getMessage();
                        if(s == null || !p.startsWith$default(s, this.f, false, 2, null)) {
                            String s1 = iOException0.getMessage();
                            if(s1 == null || !p.startsWith$default(s1, "Resource deadlock would occur", false, 2, null)) {
                                throw iOException0;
                            }
                        }
                        fileLock0 = null;
                    }
                }
                catch(Throwable throwable1) {
                    mutex1 = mutex0;
                    fileLock1 = null;
                    z2 = true;
                    fileInputStream1 = fileInputStream0;
                    goto label_84;
                }
                if(fileLock0 == null) {
                    z = false;
                }
                try {
                    i00.o = mutex0;
                    i00.p = fileInputStream0;
                    i00.q = fileLock0;
                    i00.r = true;
                    i00.u = 2;
                    object0 = function20.invoke(Boxing.boxBoolean(z), i00);
                }
                catch(Throwable throwable1) {
                    mutex1 = mutex0;
                    z2 = true;
                    fileInputStream1 = fileInputStream0;
                    fileLock1 = fileLock0;
                    goto label_84;
                }
                if(object0 == object1) {
                    return object1;
                }
                mutex1 = mutex0;
                z2 = true;
                fileInputStream1 = fileInputStream0;
                fileLock1 = fileLock0;
                goto label_87;
            }
            case 1: {
                try {
                    z2 = i00.r;
                    mutex1 = i00.o;
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable0) {
                    goto label_96;
                }
            label_74:
                if(z2) {
                    mutex1.unlock(null);
                }
                return object0;
            }
            case 2: {
                try {
                    z2 = i00.r;
                    fileLock1 = i00.q;
                    fileInputStream1 = i00.p;
                    mutex1 = i00.o;
                    ResultKt.throwOnFailure(object0);
                    goto label_87;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_84:
                    if(fileLock1 != null) {
                        fileLock1.release();
                    }
                    throw throwable1;
                label_87:
                    if(fileLock1 != null) {
                        fileLock1.release();
                    }
                    goto label_93;
                }
                catch(Throwable throwable2) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            CloseableKt.closeFinally(fileInputStream1, throwable2);
            throw throwable2;
        label_93:
            CloseableKt.closeFinally(fileInputStream1, null);
            goto label_99;
        }
        catch(Throwable throwable0) {
        }
    label_96:
        if(z2) {
            mutex1.unlock(null);
        }
        throw throwable0;
    label_99:
        if(z2) {
            mutex1.unlock(null);
        }
        return object0;
    }
}

