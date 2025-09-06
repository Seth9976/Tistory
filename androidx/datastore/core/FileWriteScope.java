package androidx.datastore.core;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w3.f0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001B\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00028\u0000H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", "T", "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FileWriteScope extends FileReadScope implements WriteScope {
    public FileWriteScope(@NotNull File file0, @NotNull Serializer serializer0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        super(file0, serializer0);
    }

    @Override  // androidx.datastore.core.WriteScope
    @Nullable
    public Object writeData(Object object0, @NotNull Continuation continuation0) {
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream1;
        f0 f00;
        if(continuation0 instanceof f0) {
            f00 = (f0)continuation0;
            int v = f00.s;
            if((v & 0x80000000) == 0) {
                f00 = new f0(this, continuation0);
            }
            else {
                f00.s = v ^ 0x80000000;
            }
        }
        else {
            f00 = new f0(this, continuation0);
        }
        Object object1 = f00.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(f00.s) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                this.checkNotClosed();
                FileOutputStream fileOutputStream0 = new FileOutputStream(this.getFile());
                try {
                    UncloseableOutputStream uncloseableOutputStream0 = new UncloseableOutputStream(fileOutputStream0);
                    f00.o = fileOutputStream0;
                    f00.p = fileOutputStream0;
                    f00.s = 1;
                    if(this.getSerializer().writeTo(object0, uncloseableOutputStream0, f00) == object2) {
                        return object2;
                    }
                }
                catch(Throwable throwable0) {
                    fileOutputStream1 = fileOutputStream0;
                    break;
                }
                fileOutputStream2 = fileOutputStream0;
                fileOutputStream1 = fileOutputStream2;
                goto label_32;
            }
            case 1: {
                try {
                    fileOutputStream2 = f00.p;
                    fileOutputStream1 = f00.o;
                    ResultKt.throwOnFailure(object1);
                label_32:
                    fileOutputStream2.getFD().sync();
                    goto label_39;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            CloseableKt.closeFinally(fileOutputStream1, throwable0);
            throw throwable1;
        }
    label_39:
        CloseableKt.closeFinally(fileOutputStream1, null);
        return Unit.INSTANCE;
    }
}

