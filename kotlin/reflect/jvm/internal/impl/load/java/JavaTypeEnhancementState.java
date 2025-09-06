package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe.e;
import org.jetbrains.annotations.NotNull;

public final class JavaTypeEnhancementState {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final JavaTypeEnhancementState getDEFAULT() {
            return JavaTypeEnhancementState.d;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Jsr305Settings a;
    public final Function1 b;
    public final boolean c;
    public static final JavaTypeEnhancementState d;

    static {
        JavaTypeEnhancementState.Companion = new Companion(null);
        JavaTypeEnhancementState.d = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings$default(null, 1, null), e.a);
    }

    public JavaTypeEnhancementState(@NotNull Jsr305Settings jsr305Settings0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(jsr305Settings0, "jsr305");
        Intrinsics.checkNotNullParameter(function10, "getReportLevelForAnnotation");
        super();
        this.a = jsr305Settings0;
        this.b = function10;
        this.c = jsr305Settings0.isDisabled() || function10.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.IGNORE;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.c;
    }

    @NotNull
    public final Function1 getGetReportLevelForAnnotation() {
        return this.b;
    }

    @NotNull
    public final Jsr305Settings getJsr305() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + this.b + ')';
    }
}

