package kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.n;
import org.jetbrains.annotations.NotNull;

public final class FqNameUnsafe {
    public final String a;
    public transient FqName b;
    public transient FqNameUnsafe c;
    public transient Name d;
    public static final Name e;
    public static final Pattern f;
    public static final n g;

    static {
        FqNameUnsafe.e = Name.special("<root>");
        FqNameUnsafe.f = Pattern.compile("\\.");
        FqNameUnsafe.g = new n(2);
    }

    public FqNameUnsafe(@NotNull String s) {
        if(s != null) {
            super();
            this.a = s;
            return;
        }
        FqNameUnsafe.a(2);
        throw null;
    }

    public FqNameUnsafe(String s, FqName fqName0) {
        if(s != null) {
            if(fqName0 != null) {
                super();
                this.a = s;
                this.b = fqName0;
                return;
            }
            FqNameUnsafe.a(1);
            throw null;
        }
        FqNameUnsafe.a(0);
        throw null;
    }

    public FqNameUnsafe(String s, FqNameUnsafe fqNameUnsafe0, Name name0) {
        if(s != null) {
            super();
            this.a = s;
            this.c = fqNameUnsafe0;
            this.d = name0;
            return;
        }
        FqNameUnsafe.a(3);
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
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
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
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        if(v == 1) {
            arr_object[0] = "safe";
        }
        else {
            switch(v) {
                case 9: {
                    arr_object[0] = "name";
                    break;
                }
                case 15: {
                    arr_object[0] = "segment";
                    break;
                }
                case 16: {
                    arr_object[0] = "shortName";
                    break;
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 17: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                }
                default: {
                    arr_object[0] = "fqName";
                }
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "asString";
                break;
            }
            case 5: 
            case 6: {
                arr_object[1] = "toSafe";
                break;
            }
            case 7: 
            case 8: {
                arr_object[1] = "parent";
                break;
            }
            case 10: 
            case 11: {
                arr_object[1] = "shortName";
                break;
            }
            case 12: 
            case 13: {
                arr_object[1] = "shortNameOrSpecial";
                break;
            }
            case 14: {
                arr_object[1] = "pathSegments";
                break;
            }
            case 17: {
                arr_object[1] = "toString";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
            }
        }
        switch(v) {
            case 9: {
                arr_object[2] = "child";
                break;
            }
            case 15: {
                arr_object[2] = "startsWith";
                break;
            }
            case 16: {
                arr_object[2] = "topLevel";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
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
        String s = this.a;
        if(s != null) {
            return s;
        }
        FqNameUnsafe.a(4);
        throw null;
    }

    public final void b() {
        String s = this.a;
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            this.d = Name.guessByFirstCharacter(s.substring(v + 1));
            this.c = new FqNameUnsafe(s.substring(0, v));
            return;
        }
        this.d = Name.guessByFirstCharacter(s);
        this.c = FqName.ROOT.toUnsafe();
    }

    @NotNull
    public FqNameUnsafe child(@NotNull Name name0) {
        if(name0 != null) {
            return this.isRoot() ? new FqNameUnsafe(name0.asString(), this, name0) : new FqNameUnsafe(this.a + "." + name0.asString(), this, name0);
        }
        FqNameUnsafe.a(9);
        throw null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FqNameUnsafe ? this.a.equals(((FqNameUnsafe)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isRoot() {
        return this.a.isEmpty();
    }

    public boolean isSafe() {
        return this.b != null || this.asString().indexOf(60) < 0;
    }

    @NotNull
    public FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe0 = this.c;
        if(fqNameUnsafe0 != null) {
            return fqNameUnsafe0;
        }
        if(this.isRoot()) {
            throw new IllegalStateException("root");
        }
        this.b();
        FqNameUnsafe fqNameUnsafe1 = this.c;
        if(fqNameUnsafe1 != null) {
            return fqNameUnsafe1;
        }
        FqNameUnsafe.a(8);
        throw null;
    }

    @NotNull
    public List pathSegments() {
        List list0 = this.isRoot() ? Collections.emptyList() : ArraysKt___ArraysKt.map(FqNameUnsafe.f.split(this.a), FqNameUnsafe.g);
        if(list0 != null) {
            return list0;
        }
        FqNameUnsafe.a(14);
        throw null;
    }

    @NotNull
    public Name shortName() {
        Name name0 = this.d;
        if(name0 != null) {
            return name0;
        }
        if(this.isRoot()) {
            throw new IllegalStateException("root");
        }
        this.b();
        Name name1 = this.d;
        if(name1 != null) {
            return name1;
        }
        FqNameUnsafe.a(11);
        throw null;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        if(this.isRoot()) {
            Name name0 = FqNameUnsafe.e;
            if(name0 != null) {
                return name0;
            }
            FqNameUnsafe.a(12);
            throw null;
        }
        Name name1 = this.shortName();
        if(name1 != null) {
            return name1;
        }
        FqNameUnsafe.a(13);
        throw null;
    }

    public boolean startsWith(@NotNull Name name0) {
        if(name0 != null) {
            if(this.isRoot()) {
                return false;
            }
            String s = this.a;
            int v = s.indexOf(46);
            String s1 = name0.asString();
            if(v == -1) {
                v = Math.max(s.length(), s1.length());
            }
            return s.regionMatches(0, s1, 0, v);
        }
        FqNameUnsafe.a(15);
        throw null;
    }

    @NotNull
    public FqName toSafe() {
        FqName fqName0 = this.b;
        if(fqName0 != null) {
            return fqName0;
        }
        FqName fqName1 = new FqName(this);
        this.b = fqName1;
        return fqName1;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.isRoot() ? "<root>" : this.a;
        if(s != null) {
            return s;
        }
        FqNameUnsafe.a(17);
        throw null;
    }

    @NotNull
    public static FqNameUnsafe topLevel(@NotNull Name name0) {
        if(name0 != null) {
            return new FqNameUnsafe(name0.asString(), FqName.ROOT.toUnsafe(), name0);
        }
        FqNameUnsafe.a(16);
        throw null;
    }
}

