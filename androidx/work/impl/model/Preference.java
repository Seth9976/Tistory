package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0012\u0010\f\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000BJ\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0015\u001A\u00020\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u000BR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\r¨\u0006\u001D"}, d2 = {"Landroidx/work/impl/model/Preference;", "", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Landroidx/work/impl/model/Preference;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "Ljava/lang/Long;", "getValue", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Preference {
    public final String a;
    public final Long b;

    public Preference(@NotNull String s, @Nullable Long long0) {
        Intrinsics.checkNotNullParameter(s, "key");
        super();
        this.a = s;
        this.b = long0;
    }

    public Preference(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "key");
        this(s, ((long)(z ? 1L : 0L)));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final Long component2() {
        return this.b;
    }

    @NotNull
    public final Preference copy(@NotNull String s, @Nullable Long long0) {
        Intrinsics.checkNotNullParameter(s, "key");
        return new Preference(s, long0);
    }

    public static Preference copy$default(Preference preference0, String s, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            s = preference0.a;
        }
        if((v & 2) != 0) {
            long0 = preference0.b;
        }
        return preference0.copy(s, long0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Preference)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((Preference)object0).a) ? Intrinsics.areEqual(this.b, ((Preference)object0).b) : false;
    }

    @NotNull
    public final String getKey() {
        return this.a;
    }

    @Nullable
    public final Long getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}

