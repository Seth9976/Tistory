package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");

    public final PrimitiveType a;
    public final String b;
    public final String c;
    public final FqName d;
    public static final HashSet e;
    public static final HashMap f;
    public static final EnumMap g;
    public static final HashMap h;

    static {
        JvmPrimitiveType.e = new HashSet();
        JvmPrimitiveType.f = new HashMap();
        JvmPrimitiveType.g = new EnumMap(PrimitiveType.class);
        JvmPrimitiveType.h = new HashMap();
        JvmPrimitiveType[] arr_jvmPrimitiveType = (JvmPrimitiveType[])JvmPrimitiveType.i.clone();
        for(int v = 0; v < arr_jvmPrimitiveType.length; ++v) {
            JvmPrimitiveType jvmPrimitiveType0 = arr_jvmPrimitiveType[v];
            FqName fqName0 = jvmPrimitiveType0.getWrapperFqName();
            JvmPrimitiveType.e.add(fqName0);
            String s = jvmPrimitiveType0.getJavaKeywordName();
            JvmPrimitiveType.f.put(s, jvmPrimitiveType0);
            PrimitiveType primitiveType0 = jvmPrimitiveType0.getPrimitiveType();
            JvmPrimitiveType.g.put(primitiveType0, jvmPrimitiveType0);
            String s1 = jvmPrimitiveType0.getDesc();
            JvmPrimitiveType.h.put(s1, jvmPrimitiveType0);
        }
    }

    public JvmPrimitiveType(PrimitiveType primitiveType0, String s1, String s2, String s3) {
        if(primitiveType0 != null) {
            super(s, v);
            this.a = primitiveType0;
            this.b = s1;
            this.c = s2;
            this.d = new FqName(s3);
            return;
        }
        JvmPrimitiveType.a(6);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 || v == 4 || (v == 10 || v == 11 || v == 12 || v == 13) ? 2 : 3)];
        switch(v) {
            case 3: {
                arr_object[0] = "type";
                break;
            }
            case 6: {
                arr_object[0] = "primitiveType";
                break;
            }
            case 1: 
            case 7: {
                arr_object[0] = "name";
                break;
            }
            case 5: 
            case 8: {
                arr_object[0] = "desc";
                break;
            }
            case 9: {
                arr_object[0] = "wrapperClassName";
                break;
            }
            case 2: 
            case 4: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            }
            default: {
                arr_object[0] = "className";
            }
        }
        if(v == 2 || v == 4) {
            arr_object[1] = "get";
        }
        else {
            switch(v) {
                case 10: {
                    arr_object[1] = "getPrimitiveType";
                    break;
                }
                case 11: {
                    arr_object[1] = "getJavaKeywordName";
                    break;
                }
                case 12: {
                    arr_object[1] = "getDesc";
                    break;
                }
                case 13: {
                    arr_object[1] = "getWrapperFqName";
                    break;
                }
                default: {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                }
            }
        }
        switch(v) {
            case 1: 
            case 3: {
                arr_object[2] = "get";
                break;
            }
            case 5: {
                arr_object[2] = "getByDesc";
                break;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                arr_object[2] = "<init>";
                break;
            }
            case 2: 
            case 4: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                break;
            }
            default: {
                arr_object[2] = "isWrapperClassName";
            }
        }
        String s = String.format((v == 2 || v == 4 || (v == 10 || v == 11 || v == 12 || v == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 2 || v == 4 || (v == 10 || v == 11 || v == 12 || v == 13) ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public static JvmPrimitiveType get(@NotNull String s) {
        if(s != null) {
            JvmPrimitiveType jvmPrimitiveType0 = (JvmPrimitiveType)JvmPrimitiveType.f.get(s);
            if(jvmPrimitiveType0 == null) {
                throw new AssertionError("Non-primitive type name passed: " + s);
            }
            return jvmPrimitiveType0;
        }
        JvmPrimitiveType.a(1);
        throw null;
    }

    @NotNull
    public static JvmPrimitiveType get(@NotNull PrimitiveType primitiveType0) {
        if(primitiveType0 != null) {
            JvmPrimitiveType jvmPrimitiveType0 = (JvmPrimitiveType)JvmPrimitiveType.g.get(primitiveType0);
            if(jvmPrimitiveType0 != null) {
                return jvmPrimitiveType0;
            }
            JvmPrimitiveType.a(4);
            throw null;
        }
        JvmPrimitiveType.a(3);
        throw null;
    }

    @NotNull
    public String getDesc() {
        String s = this.c;
        if(s != null) {
            return s;
        }
        JvmPrimitiveType.a(12);
        throw null;
    }

    @NotNull
    public String getJavaKeywordName() {
        String s = this.b;
        if(s != null) {
            return s;
        }
        JvmPrimitiveType.a(11);
        throw null;
    }

    @NotNull
    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType0 = this.a;
        if(primitiveType0 != null) {
            return primitiveType0;
        }
        JvmPrimitiveType.a(10);
        throw null;
    }

    @NotNull
    public FqName getWrapperFqName() {
        FqName fqName0 = this.d;
        if(fqName0 != null) {
            return fqName0;
        }
        JvmPrimitiveType.a(13);
        throw null;
    }
}

