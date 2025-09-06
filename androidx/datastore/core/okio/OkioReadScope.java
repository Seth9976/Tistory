package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.b;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x3.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00028\u0000H\u0096@¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000FR\u001A\u0010\u0004\u001A\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0006\u001A\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R \u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "checkClose", "a", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "b", "Lokio/Path;", "getPath", "()Lokio/Path;", "c", "Landroidx/datastore/core/okio/OkioSerializer;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n66#2:226\n52#2,5:228\n60#2,10:234\n57#2,2:244\n71#2,2:246\n67#3:227\n68#3:233\n1#4:248\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n177#1:226\n177#1:228,5\n177#1:234,10\n177#1:244,2\n177#1:246,2\n177#1:227\n177#1:233\n*E\n"})
public class OkioReadScope implements ReadScope {
    public final FileSystem a;
    public final Path b;
    public final OkioSerializer c;
    public final AtomicBoolean d;

    public OkioReadScope(@NotNull FileSystem fileSystem0, @NotNull Path path0, @NotNull OkioSerializer okioSerializer0) {
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(okioSerializer0, "serializer");
        super();
        this.a = fileSystem0;
        this.b = path0;
        this.c = okioSerializer0;
        this.d = new AtomicBoolean(false);
    }

    public static Object a(OkioReadScope okioReadScope0, Continuation continuation0) {
        Throwable throwable2;
        BufferedSource bufferedSource1;
        OkioReadScope okioReadScope1;
        Object object2;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.s;
            if((v & 0x80000000) == 0) {
                a0 = new a(okioReadScope0, continuation0);
            }
            else {
                a0.s = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(okioReadScope0, continuation0);
        }
        Object object0 = a0.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        Throwable throwable0 = null;
        switch(a0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                okioReadScope0.checkClose();
                try {
                    BufferedSource bufferedSource0 = Okio.buffer(okioReadScope0.a.source(okioReadScope0.b));
                    try {
                        a0.o = okioReadScope0;
                        a0.p = bufferedSource0;
                        a0.s = 1;
                        object2 = okioReadScope0.c.readFrom(bufferedSource0, a0);
                    }
                    catch(Throwable throwable1) {
                        okioReadScope1 = okioReadScope0;
                        bufferedSource1 = bufferedSource0;
                        throwable2 = throwable1;
                        goto label_38;
                    }
                    if(object2 == object1) {
                        return object1;
                    }
                    okioReadScope1 = okioReadScope0;
                    bufferedSource1 = bufferedSource0;
                    object0 = object2;
                    goto label_50;
                    try {
                    label_33:
                        bufferedSource1 = a0.p;
                        okioReadScope1 = a0.o;
                        ResultKt.throwOnFailure(object0);
                        goto label_50;
                    }
                    catch(Throwable throwable2) {
                    }
                label_38:
                    if(bufferedSource1 != null) {
                        try {
                            bufferedSource1.close();
                        }
                        catch(Throwable throwable3) {
                            try {
                                b.addSuppressed(throwable2, throwable3);
                            }
                            catch(FileNotFoundException fileNotFoundException1) {
                                goto label_62;
                            }
                        }
                    }
                    okioReadScope0 = okioReadScope1;
                    throwable0 = throwable2;
                    object0 = null;
                    goto label_55;
                label_50:
                    if(bufferedSource1 != null) {
                        try {
                            bufferedSource1.close();
                        }
                        catch(Throwable throwable0) {
                        }
                    }
                    okioReadScope0 = okioReadScope1;
                label_55:
                    if(throwable0 != null) {
                        throw throwable0;
                    }
                    Intrinsics.checkNotNull(object0);
                    return object0;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    break;
                }
            }
            case 1: {
                goto label_33;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        okioReadScope1 = okioReadScope0;
        fileNotFoundException1 = fileNotFoundException0;
    label_62:
        if(okioReadScope1.a.exists(okioReadScope1.b)) {
            throw fileNotFoundException1;
        }
        return okioReadScope1.c.getDefaultValue();
    }

    public final void checkClose() {
        if(this.d.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override  // androidx.datastore.core.Closeable
    public void close() {
        this.d.set(true);
    }

    @NotNull
    public final FileSystem getFileSystem() {
        return this.a;
    }

    @NotNull
    public final Path getPath() {
        return this.b;
    }

    @NotNull
    public final OkioSerializer getSerializer() {
        return this.c;
    }

    @Override  // androidx.datastore.core.ReadScope
    @Nullable
    public Object readData(@NotNull Continuation continuation0) {
        return OkioReadScope.a(this, continuation0);
    }
}

