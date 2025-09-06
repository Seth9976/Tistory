package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassId {
    public final FqName a;
    public final FqName b;
    public final boolean c;

    public ClassId(@NotNull FqName fqName0, @NotNull FqName fqName1, boolean z) {
        if(fqName0 != null) {
            if(fqName1 != null) {
                super();
                this.a = fqName0;
                this.b = fqName1;
                this.c = z;
                return;
            }
            ClassId.a(2);
            throw null;
        }
        ClassId.a(1);
        throw null;
    }

    public ClassId(@NotNull FqName fqName0, @NotNull Name name0) {
        if(fqName0 != null) {
            if(name0 != null) {
                this(fqName0, FqName.topLevel(name0), false);
                return;
            }
            ClassId.a(4);
            throw null;
        }
        ClassId.a(3);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 5 || v == 6 || v == 7 || v == 9 || (v == 13 || v == 14 || v == 15 || v == 16) ? 2 : 3)];
        switch(v) {
            case 2: {
                arr_object[0] = "relativeClassName";
                break;
            }
            case 1: 
            case 3: {
                arr_object[0] = "packageFqName";
                break;
            }
            case 4: {
                arr_object[0] = "topLevelName";
                break;
            }
            case 8: {
                arr_object[0] = "name";
                break;
            }
            case 10: {
                arr_object[0] = "segment";
                break;
            }
            case 11: 
            case 12: {
                arr_object[0] = "string";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            }
            default: {
                arr_object[0] = "topLevelFqName";
            }
        }
        switch(v) {
            case 5: {
                arr_object[1] = "getPackageFqName";
                break;
            }
            case 6: {
                arr_object[1] = "getRelativeClassName";
                break;
            }
            case 7: {
                arr_object[1] = "getShortClassName";
                break;
            }
            case 9: {
                arr_object[1] = "asSingleFqName";
                break;
            }
            case 13: 
            case 14: {
                arr_object[1] = "asString";
                break;
            }
            case 15: 
            case 16: {
                arr_object[1] = "asFqNameString";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                arr_object[2] = "<init>";
                break;
            }
            case 8: {
                arr_object[2] = "createNestedClassId";
                break;
            }
            case 10: {
                arr_object[2] = "startsWith";
                break;
            }
            case 11: 
            case 12: {
                arr_object[2] = "fromString";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                break;
            }
            default: {
                arr_object[2] = "topLevel";
            }
        }
        String s = String.format((v == 5 || v == 6 || v == 7 || v == 9 || (v == 13 || v == 14 || v == 15 || v == 16) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 5 || v == 6 || v == 7 || v == 9 || (v == 13 || v == 14 || v == 15 || v == 16) ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public FqName asSingleFqName() {
        FqName fqName0 = this.a;
        FqName fqName1 = this.b;
        if(fqName0.isRoot()) {
            if(fqName1 != null) {
                return fqName1;
            }
            ClassId.a(9);
            throw null;
        }
        return new FqName(fqName0.asString() + "." + fqName1.asString());
    }

    @NotNull
    public String asString() {
        FqName fqName0 = this.a;
        FqName fqName1 = this.b;
        if(fqName0.isRoot()) {
            String s = fqName1.asString();
            if(s != null) {
                return s;
            }
            ClassId.a(13);
            throw null;
        }
        String s1 = fqName0.asString().replace('.', '/') + "/" + fqName1.asString();
        if(s1 != null) {
            return s1;
        }
        ClassId.a(14);
        throw null;
    }

    @NotNull
    public ClassId createNestedClassId(@NotNull Name name0) {
        if(name0 != null) {
            return new ClassId(this.getPackageFqName(), this.b.child(name0), this.c);
        }
        ClassId.a(8);
        throw null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return ClassId.class == class0 && (this.a.equals(((ClassId)object0).a) && this.b.equals(((ClassId)object0).b) && this.c == ((ClassId)object0).c);
        }
        return false;
    }

    @NotNull
    public static ClassId fromString(@NotNull String s) [...] // Inlined contents

    @NotNull
    public static ClassId fromString(@NotNull String s, boolean z) {
        if(s != null) {
            int v = s.lastIndexOf("/");
            return v == -1 ? new ClassId(new FqName(""), new FqName(s), z) : new ClassId(new FqName(s.substring(0, v).replace('/', '.')), new FqName(s.substring(v + 1)), z);
        }
        ClassId.a(12);
        throw null;
    }

    @Nullable
    public ClassId getOuterClassId() {
        FqName fqName0 = this.b.parent();
        return fqName0.isRoot() ? null : new ClassId(this.getPackageFqName(), fqName0, this.c);
    }

    @NotNull
    public FqName getPackageFqName() {
        FqName fqName0 = this.a;
        if(fqName0 != null) {
            return fqName0;
        }
        ClassId.a(5);
        throw null;
    }

    @NotNull
    public FqName getRelativeClassName() {
        FqName fqName0 = this.b;
        if(fqName0 != null) {
            return fqName0;
        }
        ClassId.a(6);
        throw null;
    }

    @NotNull
    public Name getShortClassName() {
        Name name0 = this.b.shortName();
        if(name0 != null) {
            return name0;
        }
        ClassId.a(7);
        throw null;
    }

    @Override
    public int hashCode() {
        return Boolean.valueOf(this.c).hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    public boolean isLocal() {
        return this.c;
    }

    public boolean isNestedClass() {
        return !this.b.parent().isRoot();
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return this.a.isRoot() ? "/" + this.asString() : this.asString();
    }

    @NotNull
    public static ClassId topLevel(@NotNull FqName fqName0) {
        if(fqName0 != null) {
            return new ClassId(fqName0.parent(), fqName0.shortName());
        }
        ClassId.a(0);
        throw null;
    }
}

