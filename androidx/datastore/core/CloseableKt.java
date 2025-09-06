package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import md.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A9\u0010\u0000\u001A\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"use", "R", "T", "Landroidx/datastore/core/Closeable;", "block", "Lkotlin/Function1;", "(Landroidx/datastore/core/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CloseableKt {
    public static final Object use(@NotNull Closeable closeable0, @NotNull Function1 function10) {
        Object object0;
        Intrinsics.checkNotNullParameter(closeable0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        try {
            object0 = function10.invoke(closeable0);
        }
        catch(Throwable throwable0) {
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                b.addSuppressed(throwable0, throwable1);
            }
            throw throwable0;
        }
        try {
            closeable0.close();
            throwable2 = null;
        }
        catch(Throwable throwable2) {
        }
        if(throwable2 != null) {
            throw throwable2;
        }
        return object0;
    }
}

