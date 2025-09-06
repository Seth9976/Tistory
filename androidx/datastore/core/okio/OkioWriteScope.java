package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.b;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import x3.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,225:1\n66#2:226\n52#2,5:227\n66#2:232\n52#2,21:233\n60#2,10:254\n57#2,2:264\n71#2,2:266\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n209#1:226\n209#1:227,5\n210#1:232\n210#1:233,21\n209#1:254,10\n209#1:264,2\n209#1:266,2\n*E\n"})
public final class OkioWriteScope extends OkioReadScope implements WriteScope {
    public OkioWriteScope(@NotNull FileSystem fileSystem0, @NotNull Path path0, @NotNull OkioSerializer okioSerializer0) {
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(okioSerializer0, "serializer");
        super(fileSystem0, path0, okioSerializer0);
    }

    @Override  // androidx.datastore.core.WriteScope
    @Nullable
    public Object writeData(Object object0, @NotNull Continuation continuation0) {
        Unit unit1;
        Unit unit0;
        FileHandle fileHandle2;
        BufferedSink bufferedSink1;
        Throwable throwable3;
        FileHandle fileHandle1;
        BufferedSink bufferedSink0;
        FileHandle fileHandle0;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.t;
            if((v & 0x80000000) == 0) {
                e0 = new e(this, continuation0);
            }
            else {
                e0.t = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, continuation0);
        }
        Object object1 = e0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        Throwable throwable0 = null;
        switch(e0.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                this.checkClose();
                fileHandle0 = this.getFileSystem().openReadWrite(this.getPath());
                try {
                    bufferedSink0 = Okio.buffer(FileHandle.sink$default(fileHandle0, 0L, 1, null));
                }
                catch(Throwable throwable1) {
                    goto label_66;
                }
                try {
                    e0.o = fileHandle0;
                    e0.p = fileHandle0;
                    e0.q = bufferedSink0;
                    e0.t = 1;
                    if(this.getSerializer().writeTo(object0, bufferedSink0, e0) == object2) {
                        return object2;
                    }
                }
                catch(Throwable throwable2) {
                    fileHandle1 = fileHandle0;
                    throwable3 = throwable2;
                    bufferedSink1 = bufferedSink0;
                    break;
                }
                fileHandle1 = fileHandle0;
                fileHandle2 = fileHandle1;
                bufferedSink1 = bufferedSink0;
                goto label_41;
            }
            case 1: {
                try {
                    bufferedSink1 = e0.q;
                    fileHandle2 = e0.p;
                    fileHandle1 = e0.o;
                    ResultKt.throwOnFailure(object1);
                label_41:
                    fileHandle2.flush();
                    unit0 = Unit.INSTANCE;
                    goto label_53;
                }
                catch(Throwable throwable3) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(bufferedSink1 == null) {
            goto label_50;
        }
        else {
            try {
                bufferedSink1.close();
                goto label_50;
            }
            catch(Throwable throwable4) {
                try {
                    b.addSuppressed(throwable3, throwable4);
                label_50:
                    Throwable throwable5 = throwable3;
                    unit0 = null;
                    goto label_59;
                label_53:
                    if(bufferedSink1 == null) {
                    label_58:
                        throwable5 = null;
                    }
                    else {
                        try {
                            bufferedSink1.close();
                            goto label_58;
                        }
                        catch(Throwable throwable5) {
                        }
                    }
                label_59:
                    if(throwable5 != null) {
                        throw throwable5;
                    }
                    Intrinsics.checkNotNull(unit0);
                    unit1 = Unit.INSTANCE;
                    goto label_74;
                }
                catch(Throwable throwable1) {
                }
            }
        }
        fileHandle0 = fileHandle1;
    label_66:
        if(fileHandle0 != null) {
            try {
                fileHandle0.close();
            }
            catch(Throwable throwable6) {
                b.addSuppressed(throwable1, throwable6);
            }
        }
        throwable0 = throwable1;
        unit1 = null;
        goto label_78;
    label_74:
        if(fileHandle1 != null) {
            try {
                fileHandle1.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_78:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(unit1);
        return Unit.INSTANCE;
    }
}

