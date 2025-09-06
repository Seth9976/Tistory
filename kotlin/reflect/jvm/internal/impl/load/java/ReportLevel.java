package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

public enum ReportLevel {
    @SourceDebugExtension({"SMAP\nReportLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1282#2,2:21\n*S KotlinDebug\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n*L\n15#1:21,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    @NotNull
    public static final Companion Companion;
    public final String a;

    static {
        ReportLevel.Companion = new Companion(null);
    }

    public ReportLevel(String s1) {
        this.a = s1;
    }

    @NotNull
    public final String getDescription() {
        return this.a;
    }

    public final boolean isIgnore() [...] // 潜在的解密器

    public final boolean isWarning() [...] // 潜在的解密器
}

