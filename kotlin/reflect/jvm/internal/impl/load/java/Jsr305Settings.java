package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Jsr305Settings {
    public final ReportLevel a;
    public final ReportLevel b;
    public final Map c;
    public final Lazy d;
    public final boolean e;

    public Jsr305Settings(@NotNull ReportLevel reportLevel0, @Nullable ReportLevel reportLevel1, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(reportLevel0, "globalLevel");
        Intrinsics.checkNotNullParameter(map0, "userDefinedLevelForSpecificAnnotation");
        super();
        this.a = reportLevel0;
        this.b = reportLevel1;
        this.c = map0;
        this.d = c.lazy(new e(this, 1));
        this.e = reportLevel0 == ReportLevel.IGNORE && reportLevel1 == ReportLevel.IGNORE && map0.isEmpty();
    }

    public Jsr305Settings(ReportLevel reportLevel0, ReportLevel reportLevel1, Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            reportLevel1 = null;
        }
        if((v & 4) != 0) {
            map0 = x.emptyMap();
        }
        this(reportLevel0, reportLevel1, map0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Jsr305Settings)) {
            return false;
        }
        if(this.a != ((Jsr305Settings)object0).a) {
            return false;
        }
        return this.b == ((Jsr305Settings)object0).b ? Intrinsics.areEqual(this.c, ((Jsr305Settings)object0).c) : false;
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.a;
    }

    @Nullable
    public final ReportLevel getMigrationLevel() {
        return this.b;
    }

    @NotNull
    public final Map getUserDefinedLevelForSpecificAnnotation() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F;
    }

    public final boolean isDisabled() {
        return this.e;
    }

    @Override
    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}

