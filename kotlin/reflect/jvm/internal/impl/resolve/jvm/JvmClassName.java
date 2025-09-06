package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public class JvmClassName {
    public final String a;

    public JvmClassName(String s) {
        if(s != null) {
            super();
            this.a = s;
            return;
        }
        JvmClassName.a(5);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 6 || v == 7 || v == 8 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "classId";
                break;
            }
            case 2: 
            case 4: {
                arr_object[0] = "fqName";
                break;
            }
            case 3: 
            case 6: 
            case 7: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            }
            default: {
                arr_object[0] = "internalName";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "byFqNameWithoutInnerClasses";
                break;
            }
            case 6: {
                arr_object[1] = "getFqNameForClassNameWithoutDollars";
                break;
            }
            case 7: {
                arr_object[1] = "getPackageFqName";
                break;
            }
            case 8: {
                arr_object[1] = "getInternalName";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
            }
        }
        switch(v) {
            case 1: {
                arr_object[2] = "byClassId";
                break;
            }
            case 2: 
            case 4: {
                arr_object[2] = "byFqNameWithoutInnerClasses";
                break;
            }
            case 5: {
                arr_object[2] = "<init>";
                break;
            }
            case 3: 
            case 6: 
            case 7: 
            case 8: {
                break;
            }
            default: {
                arr_object[2] = "byInternalName";
            }
        }
        String s = String.format((v == 3 || v == 6 || v == 7 || v == 8 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 6 || v == 7 || v == 8 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public static JvmClassName byClassId(@NotNull ClassId classId0) {
        if(classId0 != null) {
            FqName fqName0 = classId0.getPackageFqName();
            String s = classId0.getRelativeClassName().asString().replace('.', '$');
            return fqName0.isRoot() ? new JvmClassName(s) : new JvmClassName(fqName0.asString().replace('.', '/') + "/" + s);
        }
        JvmClassName.a(1);
        throw null;
    }

    @NotNull
    public static JvmClassName byFqNameWithoutInnerClasses(@NotNull FqName fqName0) {
        if(fqName0 != null) {
            return new JvmClassName(fqName0.asString().replace('.', '/'));
        }
        JvmClassName.a(2);
        throw null;
    }

    @NotNull
    public static JvmClassName byInternalName(@NotNull String s) {
        if(s != null) {
            return new JvmClassName(s);
        }
        JvmClassName.a(0);
        throw null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : this.a.equals(((JvmClassName)object0).a);
    }

    @NotNull
    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.a.replace('/', '.'));
    }

    @NotNull
    public String getInternalName() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        JvmClassName.a(8);
        throw null;
    }

    @NotNull
    public FqName getPackageFqName() {
        String s = this.a;
        int v = s.lastIndexOf("/");
        if(v == -1) {
            FqName fqName0 = FqName.ROOT;
            if(fqName0 != null) {
                return fqName0;
            }
            JvmClassName.a(7);
            throw null;
        }
        return new FqName(s.substring(0, v).replace('/', '.'));
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a;
    }
}

