package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import l1.a;

public enum FieldType {
    DOUBLE(0, 1, JavaType.DOUBLE),
    FLOAT(1, 1, JavaType.FLOAT),
    INT64(2, 1, JavaType.LONG),
    UINT64(3, 1, JavaType.LONG),
    INT32(4, 1, JavaType.INT),
    FIXED64(5, 1, JavaType.LONG),
    FIXED32(6, 1, JavaType.INT),
    BOOL(7, 1, JavaType.BOOLEAN),
    STRING(8, 1, JavaType.STRING),
    MESSAGE(9, 1, JavaType.MESSAGE),
    BYTES(10, 1, JavaType.BYTE_STRING),
    UINT32(11, 1, JavaType.INT),
    ENUM(12, 1, JavaType.ENUM),
    SFIXED32(13, 1, JavaType.INT),
    SFIXED64(14, 1, JavaType.LONG),
    SINT32(15, 1, JavaType.INT),
    SINT64(16, 1, JavaType.LONG),
    GROUP(17, 1, JavaType.MESSAGE),
    DOUBLE_LIST(18, 2, JavaType.DOUBLE),
    FLOAT_LIST(19, 2, JavaType.FLOAT),
    INT64_LIST(20, 2, JavaType.LONG),
    UINT64_LIST(21, 2, JavaType.LONG),
    INT32_LIST(22, 2, JavaType.INT),
    FIXED64_LIST(23, 2, JavaType.LONG),
    FIXED32_LIST(24, 2, JavaType.INT),
    BOOL_LIST(25, 2, JavaType.BOOLEAN),
    STRING_LIST(26, 2, JavaType.STRING),
    MESSAGE_LIST(27, 2, JavaType.MESSAGE),
    BYTES_LIST(28, 2, JavaType.BYTE_STRING),
    UINT32_LIST(29, 2, JavaType.INT),
    ENUM_LIST(30, 2, JavaType.ENUM),
    SFIXED32_LIST(0x1F, 2, JavaType.INT),
    SFIXED64_LIST(0x20, 2, JavaType.LONG),
    SINT32_LIST(33, 2, JavaType.INT),
    SINT64_LIST(34, 2, JavaType.LONG),
    DOUBLE_LIST_PACKED(35, 3, JavaType.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, JavaType.FLOAT),
    INT64_LIST_PACKED(37, 3, JavaType.LONG),
    UINT64_LIST_PACKED(38, 3, JavaType.LONG),
    INT32_LIST_PACKED(39, 3, JavaType.INT),
    FIXED64_LIST_PACKED(40, 3, JavaType.LONG),
    FIXED32_LIST_PACKED(41, 3, JavaType.INT),
    BOOL_LIST_PACKED(42, 3, JavaType.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, JavaType.INT),
    ENUM_LIST_PACKED(44, 3, JavaType.ENUM),
    SFIXED32_LIST_PACKED(45, 3, JavaType.INT),
    SFIXED64_LIST_PACKED(46, 3, JavaType.LONG),
    SINT32_LIST_PACKED(0x2F, 3, JavaType.INT),
    SINT64_LIST_PACKED(0x30, 3, JavaType.LONG),
    GROUP_LIST(49, 2, JavaType.MESSAGE),
    MAP(50, 4, JavaType.VOID);

    public final JavaType a;
    public final int b;
    public final Class c;
    public final boolean d;
    public final int e;
    public static final FieldType[] f;
    public static final Type[] g;

    static {
        FieldType.g = new Type[0];
        FieldType[] arr_fieldType = (FieldType[])FieldType.h.clone();
        FieldType.f = new FieldType[arr_fieldType.length];
        for(int v = 0; v < arr_fieldType.length; ++v) {
            FieldType fieldType0 = arr_fieldType[v];
            FieldType.f[fieldType0.b] = fieldType0;
        }
    }

    public FieldType(int v1, int v2, JavaType javaType0) {
        this.b = v1;
        this.e = v2;
        this.a = javaType0;
        boolean z = true;
        switch(a.c(v2)) {
            case 1: {
                this.c = javaType0.getBoxedType();
                break;
            }
            case 3: {
                this.c = javaType0.getBoxedType();
                break;
            }
            default: {
                this.c = null;
            }
        }
        if(v2 == 1) {
            switch(e1.b[javaType0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    z = false;
                }
            }
        }
        else {
            z = false;
        }
        this.d = z;
    }

    public static FieldType forId(int v) {
        if(v >= 0) {
            return v >= FieldType.f.length ? null : FieldType.f[v];
        }
        return null;
    }

    public JavaType getJavaType() {
        return this.a;
    }

    public int id() {
        return this.b;
    }

    public boolean isList() {
        switch(this.e) {
            case 2: 
            case 3: {
                return true;
            }
            case 1: 
            case 4: {
                return false;
            }
            default: {
                throw null;
            }
        }
    }

    public boolean isMap() {
        return this.e == 4;
    }

    public boolean isPacked() {
        return a.a(3, this.e);
    }

    public boolean isPrimitiveScalar() {
        return this.d;
    }

    public boolean isScalar() {
        return this.e == 1;
    }

    public boolean isValidForField(Field field0) {
        Type type2;
        Type[] arr_type1;
        boolean z = a.a(2, this.e);
        JavaType javaType0 = this.a;
        if(z) {
            Class class0 = field0.getType();
            if(javaType0.getType().isAssignableFrom(class0)) {
                Type type0 = field0.getGenericType();
                Type[] arr_type = FieldType.g;
                if(type0 instanceof ParameterizedType) {
                    arr_type1 = ((ParameterizedType)field0.getGenericType()).getActualTypeArguments();
                    goto label_11;
                }
            alab1:
                while(true) {
                    arr_type1 = arr_type;
                alab3:
                    while(true) {
                    label_11:
                        Class class1 = List.class;
                        if(class0 == class1) {
                            break alab1;
                        }
                        Type[] arr_type2 = class0.getGenericInterfaces();
                        int v = 0;
                        while(true) {
                            if(v < arr_type2.length) {
                                Type type1 = arr_type2[v];
                                if(type1 instanceof ParameterizedType && class1.isAssignableFrom(((Class)((ParameterizedType)type1).getRawType()))) {
                                    type2 = type1;
                                    break;
                                }
                                else {
                                    ++v;
                                    continue;
                                }
                            }
                            Type type3 = class0.getGenericSuperclass();
                            type2 = type3 instanceof ParameterizedType && class1.isAssignableFrom(((Class)((ParameterizedType)type3).getRawType())) ? type3 : null;
                            break;
                        }
                        if(type2 instanceof ParameterizedType) {
                            Type[] arr_type3 = ((ParameterizedType)type2).getActualTypeArguments();
                        alab2:
                            for(int v1 = 0; v1 < arr_type3.length; ++v1) {
                                Type type4 = arr_type3[v1];
                                if(type4 instanceof TypeVariable) {
                                    TypeVariable[] arr_typeVariable = class0.getTypeParameters();
                                    if(arr_type1.length != arr_typeVariable.length) {
                                        throw new RuntimeException("Type array mismatch");
                                    }
                                    int v2 = 0;
                                    while(v2 < arr_typeVariable.length) {
                                        if(type4 == arr_typeVariable[v2]) {
                                            arr_type3[v1] = arr_type1[v2];
                                            continue alab2;
                                        }
                                        ++v2;
                                    }
                                    throw new RuntimeException("Unable to find replacement for " + type4);
                                }
                            }
                            class0 = (Class)((ParameterizedType)type2).getRawType();
                            arr_type1 = arr_type3;
                            continue;
                        }
                        else {
                            Class[] arr_class = class0.getInterfaces();
                            int v3 = 0;
                            while(v3 < arr_class.length) {
                                Class class2 = arr_class[v3];
                                if(!class1.isAssignableFrom(class2)) {
                                    ++v3;
                                    continue;
                                }
                                arr_type1 = arr_type;
                                class0 = class2;
                                continue alab3;
                            }
                            class0 = class0.getSuperclass();
                            break;
                        }
                        throw new RuntimeException("Unable to identify parameter type for List<T>");
                    }
                }
                if(arr_type1.length != 1) {
                    throw new RuntimeException("Unable to identify parameter type for List<T>");
                }
                Type type5 = arr_type1[0];
                return type5 instanceof Class ? this.c.isAssignableFrom(((Class)type5)) : true;
            }
            return false;
        }
        return javaType0.getType().isAssignableFrom(field0.getType());
    }
}

