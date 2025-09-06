package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

public final class JvmAbi {
    @NotNull
    public static final JvmAbi INSTANCE;
    @JvmField
    @NotNull
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;
    @JvmField
    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;
    public static final ClassId a;

    static {
        JvmAbi.INSTANCE = new JvmAbi();  // 初始化器: Ljava/lang/Object;-><init>()V
        FqName fqName0 = new FqName("kotlin.jvm.JvmField");
        JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME = fqName0;
        ClassId classId0 = ClassId.topLevel(fqName0);
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        JvmAbi.JVM_FIELD_ANNOTATION_CLASS_ID = classId0;
        Intrinsics.checkNotNullExpressionValue(ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        ClassId classId1 = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        Intrinsics.checkNotNullExpressionValue(classId1, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        JvmAbi.a = classId1;
    }

    @NotNull
    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return JvmAbi.a;
    }

    @JvmStatic
    @NotNull
    public static final String getterName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "propertyName");
        return JvmAbi.startsWithIsPrefix(s) ? s : "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(s);
    }

    @JvmStatic
    public static final boolean isGetterName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return p.startsWith$default(s, "get", false, 2, null) || p.startsWith$default(s, "is", false, 2, null);
    }

    @JvmStatic
    public static final boolean isSetterName(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return p.startsWith$default(s, "set", false, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String setterName(@NotNull String s) {
        String s1;
        Intrinsics.checkNotNullParameter(s, "propertyName");
        StringBuilder stringBuilder0 = new StringBuilder("set");
        if(JvmAbi.startsWithIsPrefix(s)) {
            s1 = s.substring(2);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
        }
        else {
            s1 = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(s);
        }
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final boolean startsWithIsPrefix(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        if(!p.startsWith$default(s, "is", false, 2, null)) {
            return false;
        }
        if(s.length() == 2) {
            return false;
        }
        int v = s.charAt(2);
        return Intrinsics.compare(97, v) > 0 || Intrinsics.compare(v, 0x7A) > 0;
    }
}

