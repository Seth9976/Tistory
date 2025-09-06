package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class FqName {
    public static final FqName ROOT;
    public final FqNameUnsafe a;
    public transient FqName b;

    static {
        FqName.ROOT = new FqName("");
    }

    public FqName(@NotNull String s) {
        if(s != null) {
            super();
            this.a = new FqNameUnsafe(s, this);
            return;
        }
        FqName.a(1);
        throw null;
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe0) {
        if(fqNameUnsafe0 != null) {
            super();
            this.a = fqNameUnsafe0;
            return;
        }
        FqName.a(2);
        throw null;
    }

    public FqName(FqNameUnsafe fqNameUnsafe0, FqName fqName0) {
        if(fqNameUnsafe0 != null) {
            super();
            this.a = fqNameUnsafe0;
            this.b = fqName0;
            return;
        }
        FqName.a(3);
        throw null;
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                arr_object[0] = "fqName";
                break;
            }
            case 8: {
                arr_object[0] = "name";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            }
            case 12: {
                arr_object[0] = "segment";
                break;
            }
            case 13: {
                arr_object[0] = "shortName";
                break;
            }
            default: {
                arr_object[0] = "names";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "asString";
                break;
            }
            case 5: {
                arr_object[1] = "toUnsafe";
                break;
            }
            case 6: 
            case 7: {
                arr_object[1] = "parent";
                break;
            }
            case 9: {
                arr_object[1] = "shortName";
                break;
            }
            case 10: {
                arr_object[1] = "shortNameOrSpecial";
                break;
            }
            case 11: {
                arr_object[1] = "pathSegments";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                arr_object[2] = "<init>";
                break;
            }
            case 8: {
                arr_object[2] = "child";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                break;
            }
            case 12: {
                arr_object[2] = "startsWith";
                break;
            }
            case 13: {
                arr_object[2] = "topLevel";
                break;
            }
            default: {
                arr_object[2] = "fromSegments";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @NotNull
    public String asString() {
        String s = this.a.asString();
        if(s != null) {
            return s;
        }
        FqName.a(4);
        throw null;
    }

    @NotNull
    public FqName child(@NotNull Name name0) {
        if(name0 != null) {
            return new FqName(this.a.child(name0), this);
        }
        FqName.a(8);
        throw null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FqName ? this.a.equals(((FqName)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isRoot() {
        return this.a.isRoot();
    }

    @NotNull
    public FqName parent() {
        FqName fqName0 = this.b;
        if(fqName0 != null) {
            return fqName0;
        }
        if(this.isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName1 = new FqName(this.a.parent());
        this.b = fqName1;
        return fqName1;
    }

    @NotNull
    public List pathSegments() {
        List list0 = this.a.pathSegments();
        if(list0 != null) {
            return list0;
        }
        FqName.a(11);
        throw null;
    }

    @NotNull
    public Name shortName() {
        Name name0 = this.a.shortName();
        if(name0 != null) {
            return name0;
        }
        FqName.a(9);
        throw null;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        Name name0 = this.a.shortNameOrSpecial();
        if(name0 != null) {
            return name0;
        }
        FqName.a(10);
        throw null;
    }

    public boolean startsWith(@NotNull Name name0) {
        if(name0 != null) {
            return this.a.startsWith(name0);
        }
        FqName.a(12);
        throw null;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @NotNull
    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe0 = this.a;
        if(fqNameUnsafe0 != null) {
            return fqNameUnsafe0;
        }
        FqName.a(5);
        throw null;
    }

    @NotNull
    public static FqName topLevel(@NotNull Name name0) {
        if(name0 != null) {
            return new FqName(FqNameUnsafe.topLevel(name0));
        }
        FqName.a(13);
        throw null;
    }
}

