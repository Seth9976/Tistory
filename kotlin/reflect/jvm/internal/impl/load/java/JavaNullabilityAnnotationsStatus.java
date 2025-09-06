package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaNullabilityAnnotationsStatus {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.d;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ReportLevel a;
    public final KotlinVersion b;
    public final ReportLevel c;
    public static final JavaNullabilityAnnotationsStatus d;

    static {
        JavaNullabilityAnnotationsStatus.Companion = new Companion(null);
        JavaNullabilityAnnotationsStatus.d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevel0, @Nullable KotlinVersion kotlinVersion0, @NotNull ReportLevel reportLevel1) {
        Intrinsics.checkNotNullParameter(reportLevel0, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevel1, "reportLevelAfter");
        super();
        this.a = reportLevel0;
        this.b = kotlinVersion0;
        this.c = reportLevel1;
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel0, KotlinVersion kotlinVersion0, ReportLevel reportLevel1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            kotlinVersion0 = new KotlinVersion(1, 0);
        }
        if((v & 4) != 0) {
            reportLevel1 = reportLevel0;
        }
        this(reportLevel0, kotlinVersion0, reportLevel1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        if(this.a != ((JavaNullabilityAnnotationsStatus)object0).a) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((JavaNullabilityAnnotationsStatus)object0).b) ? this.c == ((JavaNullabilityAnnotationsStatus)object0).c : false;
    }

    @NotNull
    public final ReportLevel getReportLevelAfter() {
        return this.c;
    }

    @NotNull
    public final ReportLevel getReportLevelBefore() {
        return this.a;
    }

    @Nullable
    public final KotlinVersion getSinceVersion() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }
}

