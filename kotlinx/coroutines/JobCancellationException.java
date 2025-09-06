package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000B\u001A\u0004\u0018\u00010\u0000H\u0016J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0096\u0002J\b\u0010\u0010\u001A\u00020\u0007H\u0016J\b\u0010\u0011\u001A\u00020\u0012H\u0016J\b\u0010\u0013\u001A\u00020\u0005H\u0016R\u0010\u0010\b\u001A\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "createCopy", "equals", "", "other", "", "fillInStackTrace", "hashCode", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,76:1\n26#2:77\n*S KotlinDebug\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n*L\n44#1:77\n*E\n"})
public final class JobCancellationException extends CancellationException implements CopyableThrowable {
    @JvmField
    @NotNull
    public final transient Job job;

    public JobCancellationException(@NotNull String s, @Nullable Throwable throwable0, @NotNull Job job0) {
        super(s);
        this.job = job0;
        if(throwable0 != null) {
            this.initCause(throwable0);
        }
    }

    @Override  // kotlinx.coroutines.CopyableThrowable
    public Throwable createCopy() {
        return null;
    }

    @Nullable
    public JobCancellationException createCopy() [...] // Inlined contents

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 == this || object0 instanceof JobCancellationException && Intrinsics.areEqual(((JobCancellationException)object0).getMessage(), this.getMessage()) && Intrinsics.areEqual(((JobCancellationException)object0).job, this.job) && Intrinsics.areEqual(((JobCancellationException)object0).getCause(), this.getCause());
    }

    @Override
    @NotNull
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public int hashCode() {
        String s = this.getMessage();
        Intrinsics.checkNotNull(s);
        int v = s.hashCode();
        int v1 = this.job.hashCode();
        Throwable throwable0 = this.getCause();
        return throwable0 == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + throwable0.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}

