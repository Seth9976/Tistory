package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0005\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkProgress;", "", "", "workSpecId", "Landroidx/work/Data;", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/Data;)V", "a", "Ljava/lang/String;", "getWorkSpecId", "()Ljava/lang/String;", "b", "Landroidx/work/Data;", "getProgress", "()Landroidx/work/Data;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WorkProgress {
    public final String a;
    public final Data b;

    public WorkProgress(@NotNull String s, @NotNull Data data0) {
        Intrinsics.checkNotNullParameter(s, "workSpecId");
        Intrinsics.checkNotNullParameter(data0, "progress");
        super();
        this.a = s;
        this.b = data0;
    }

    @NotNull
    public final Data getProgress() {
        return this.b;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.a;
    }
}

