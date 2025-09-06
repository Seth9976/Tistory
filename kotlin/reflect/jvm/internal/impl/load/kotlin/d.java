package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;

public final class d implements JvmTypeFactory {
    public static final d a;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static JvmType a(String s) {
        JvmPrimitiveType jvmPrimitiveType0;
        Intrinsics.checkNotNullParameter(s, "representation");
        s.getClass();
        int v = s.charAt(0);
        JvmPrimitiveType[] arr_jvmPrimitiveType = JvmPrimitiveType.values();
        for(int v1 = 0; true; ++v1) {
            jvmPrimitiveType0 = null;
            if(v1 >= arr_jvmPrimitiveType.length) {
                break;
            }
            JvmPrimitiveType jvmPrimitiveType1 = arr_jvmPrimitiveType[v1];
            if(jvmPrimitiveType1.getDesc().charAt(0) == v) {
                jvmPrimitiveType0 = jvmPrimitiveType1;
                break;
            }
        }
        if(jvmPrimitiveType0 != null) {
            return new Primitive(jvmPrimitiveType0);
        }
        switch(v) {
            case 76: {
                StringsKt__StringsKt.endsWith$default(s, ';', false, 2, null);
                break;
            }
            case 86: {
                return new Primitive(null);
            }
            case 91: {
                String s1 = s.substring(1);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
                return new Array(d.a(s1));
            }
        }
        String s2 = s.substring(1, s.length() - 1);
        Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new Object(s2);
    }

    public static String b(JvmType jvmType0) {
        Intrinsics.checkNotNullParameter(jvmType0, "type");
        if(jvmType0 instanceof Array) {
            return "[" + d.b(((Array)jvmType0).getElementType());
        }
        if(jvmType0 instanceof Primitive) {
            JvmPrimitiveType jvmPrimitiveType0 = ((Primitive)jvmType0).getJvmPrimitiveType();
            if(jvmPrimitiveType0 != null) {
                String s = jvmPrimitiveType0.getDesc();
                return s == null ? "V" : s;
            }
            return "V";
        }
        if(!(jvmType0 instanceof Object)) {
            throw new NoWhenBranchMatchedException();
        }
        return "L" + ((Object)jvmType0).getInternalName() + ';';
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final java.lang.Object boxType(java.lang.Object object0) {
        Intrinsics.checkNotNullParameter(((JvmType)object0), "possiblyPrimitiveType");
        if(((JvmType)object0) instanceof Primitive && ((Primitive)(((JvmType)object0))).getJvmPrimitiveType() != null) {
            String s = JvmClassName.byFqNameWithoutInnerClasses(((Primitive)(((JvmType)object0))).getJvmPrimitiveType().getWrapperFqName()).getInternalName();
            Intrinsics.checkNotNullExpressionValue(s, "byFqNameWithoutInnerClas…apperFqName).internalName");
            Intrinsics.checkNotNullParameter(s, "internalName");
            return new Object(s);
        }
        return (JvmType)object0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final java.lang.Object createFromString(String s) {
        return d.a(s);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final java.lang.Object createObjectType(String s) {
        Intrinsics.checkNotNullParameter(s, "internalName");
        return new Object(s);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final java.lang.Object createPrimitiveType(PrimitiveType primitiveType0) {
        Intrinsics.checkNotNullParameter(primitiveType0, "primitiveType");
        switch(primitiveType0) {
            case 1: {
                return JvmType.Companion.getBOOLEAN$descriptors_jvm();
            }
            case 2: {
                return JvmType.Companion.getCHAR$descriptors_jvm();
            }
            case 3: {
                return JvmType.Companion.getBYTE$descriptors_jvm();
            }
            case 4: {
                return JvmType.Companion.getSHORT$descriptors_jvm();
            }
            case 5: {
                return JvmType.Companion.getINT$descriptors_jvm();
            }
            case 6: {
                return JvmType.Companion.getFLOAT$descriptors_jvm();
            }
            case 7: {
                return JvmType.Companion.getLONG$descriptors_jvm();
            }
            case 8: {
                return JvmType.Companion.getDOUBLE$descriptors_jvm();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final java.lang.Object getJavaLangClassType() {
        Intrinsics.checkNotNullParameter("java/lang/Class", "internalName");
        return new Object("java/lang/Class");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final String toString(java.lang.Object object0) {
        return d.b(((JvmType)object0));
    }
}

