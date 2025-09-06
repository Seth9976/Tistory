package androidx.datastore.core;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.b0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001D\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0004¢\u0006\u0004\b\u000E\u0010\rR\u001A\u0010\u0004\u001A\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/FileReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "checkNotClosed", "a", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "b", "Landroidx/datastore/core/Serializer;", "getSerializer", "()Landroidx/datastore/core/Serializer;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public class FileReadScope implements ReadScope {
    public final File a;
    public final Serializer b;
    public final AtomicBoolean c;

    public FileReadScope(@NotNull File file0, @NotNull Serializer serializer0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        super();
        this.a = file0;
        this.b = serializer0;
        this.c = new AtomicBoolean(false);
    }

    public static Object a(FileReadScope fileReadScope0, Continuation continuation0) {
        Closeable closeable0;
        Throwable throwable4;
        Object object3;
        Throwable throwable1;
        FileInputStream fileInputStream1;
        FileReadScope fileReadScope1;
        Object object2;
        FileInputStream fileInputStream0;
        b0 b00;
        if(continuation0 instanceof b0) {
            b00 = (b0)continuation0;
            int v = b00.s;
            if((v & 0x80000000) == 0) {
                b00 = new b0(fileReadScope0, continuation0);
            }
            else {
                b00.s = v ^ 0x80000000;
            }
        }
        else {
            b00 = new b0(fileReadScope0, continuation0);
        }
        Object object0 = b00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                fileReadScope0.checkNotClosed();
                try {
                    fileInputStream0 = new FileInputStream(fileReadScope0.a);
                }
                catch(FileNotFoundException unused_ex) {
                    goto label_44;
                }
                try {
                    b00.o = fileReadScope0;
                    b00.p = fileInputStream0;
                    b00.s = 1;
                    object2 = fileReadScope0.b.readFrom(fileInputStream0, b00);
                }
                catch(Throwable throwable0) {
                    fileReadScope1 = fileReadScope0;
                    fileInputStream1 = fileInputStream0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                if(object2 == object1) {
                    return object1;
                }
                fileReadScope1 = fileReadScope0;
                fileInputStream1 = fileInputStream0;
                object0 = object2;
                goto label_41;
            }
            case 1: {
                fileInputStream1 = b00.p;
                fileReadScope1 = (FileReadScope)b00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_41;
                }
                catch(Throwable throwable1) {
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    try {
                        CloseableKt.closeFinally(fileInputStream1, throwable1);
                        throw throwable2;
                    label_41:
                        CloseableKt.closeFinally(fileInputStream1, null);
                        return object0;
                    }
                    catch(FileNotFoundException unused_ex) {
                    }
                }
                fileReadScope0 = fileReadScope1;
            label_44:
                boolean z = fileReadScope0.a.exists();
                Serializer serializer0 = fileReadScope0.b;
                if(z) {
                    FileInputStream fileInputStream2 = new FileInputStream(fileReadScope0.a);
                    try {
                        b00.o = fileInputStream2;
                        b00.p = null;
                        b00.s = 2;
                        object3 = serializer0.readFrom(fileInputStream2, b00);
                    }
                    catch(Throwable throwable3) {
                        throwable4 = throwable3;
                        closeable0 = fileInputStream2;
                        throw throwable4;
                    }
                    if(object3 == object1) {
                        return object1;
                    }
                    object0 = object3;
                    closeable0 = fileInputStream2;
                    goto label_71;
                }
                return serializer0.getDefaultValue();
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        closeable0 = (Closeable)b00.o;
        try {
            ResultKt.throwOnFailure(object0);
            goto label_71;
        }
        catch(Throwable throwable4) {
        }
        try {
            throw throwable4;
        }
        catch(Throwable throwable5) {
            CloseableKt.closeFinally(closeable0, throwable4);
            throw throwable5;
        }
    label_71:
        CloseableKt.closeFinally(closeable0, null);
        return object0;
    }

    public final void checkNotClosed() {
        if(this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override  // androidx.datastore.core.Closeable
    public void close() {
        this.c.set(true);
    }

    @NotNull
    public final File getFile() {
        return this.a;
    }

    @NotNull
    public final Serializer getSerializer() {
        return this.b;
    }

    @Override  // androidx.datastore.core.ReadScope
    @Nullable
    public Object readData(@NotNull Continuation continuation0) {
        return FileReadScope.a(this, continuation0);
    }
}

