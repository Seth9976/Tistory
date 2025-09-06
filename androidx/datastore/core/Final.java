package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/datastore/core/Final;", "T", "Landroidx/datastore/core/State;", "", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "b", "Ljava/lang/Throwable;", "getFinalException", "()Ljava/lang/Throwable;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Final extends State {
    public final Throwable b;

    public Final(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "finalException");
        super(0x7FFFFFFF, null);
        this.b = throwable0;
    }

    @NotNull
    public final Throwable getFinalException() {
        return this.b;
    }
}

