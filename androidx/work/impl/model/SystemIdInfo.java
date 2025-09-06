package androidx.work.impl.model;

import a5.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001A\u0010\u0005\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\fR\u0014\u0010\u0006\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/work/impl/model/SystemIdInfo;", "", "", "workSpecId", "", "generation", "systemId", "<init>", "(Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Landroidx/work/impl/model/SystemIdInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "a", "I", "getGeneration", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SystemIdInfo {
    public final int a;
    @ColumnInfo(name = "system_id")
    @JvmField
    public final int systemId;
    @ColumnInfo(name = "work_spec_id")
    @JvmField
    @NotNull
    public final String workSpecId;

    public SystemIdInfo(@NotNull String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "workSpecId");
        super();
        this.workSpecId = s;
        this.a = v;
        this.systemId = v1;
    }

    @NotNull
    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.a;
    }

    public final int component3() {
        return this.systemId;
    }

    @NotNull
    public final SystemIdInfo copy(@NotNull String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "workSpecId");
        return new SystemIdInfo(s, v, v1);
    }

    public static SystemIdInfo copy$default(SystemIdInfo systemIdInfo0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = systemIdInfo0.workSpecId;
        }
        if((v2 & 2) != 0) {
            v = systemIdInfo0.a;
        }
        if((v2 & 4) != 0) {
            v1 = systemIdInfo0.systemId;
        }
        return systemIdInfo0.copy(s, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SystemIdInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.workSpecId, ((SystemIdInfo)object0).workSpecId)) {
            return false;
        }
        return this.a == ((SystemIdInfo)object0).a ? this.systemId == ((SystemIdInfo)object0).systemId : false;
    }

    public final int getGeneration() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.systemId + a.c(this.a, this.workSpecId.hashCode() * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SystemIdInfo(workSpecId=");
        stringBuilder0.append(this.workSpecId);
        stringBuilder0.append(", generation=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", systemId=");
        return b.p(stringBuilder0, this.systemId, ')');
    }
}

