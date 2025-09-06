package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/StartStopToken;", "", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "<init>", "(Landroidx/work/impl/model/WorkGenerationalId;)V", "a", "Landroidx/work/impl/model/WorkGenerationalId;", "getId", "()Landroidx/work/impl/model/WorkGenerationalId;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StartStopToken {
    public final WorkGenerationalId a;

    public StartStopToken(@NotNull WorkGenerationalId workGenerationalId0) {
        Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
        super();
        this.a = workGenerationalId0;
    }

    @NotNull
    public final WorkGenerationalId getId() {
        return this.a;
    }
}

