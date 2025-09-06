package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;

public final class Name implements Comparable {
    public final String a;
    public final boolean b;

    public Name(String s, boolean z) {
        if(s != null) {
            super();
            this.a = s;
            this.b = z;
            return;
        }
        Name.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 2 || v == 3 || v == 4 ? 2 : 3)];
        arr_object[0] = v == 1 || v == 2 || v == 3 || v == 4 ? "kotlin/reflect/jvm/internal/impl/name/Name" : "name";
        switch(v) {
            case 1: {
                arr_object[1] = "asString";
                break;
            }
            case 2: {
                arr_object[1] = "getIdentifier";
                break;
            }
            case 3: 
            case 4: {
                arr_object[1] = "asStringStripSpecialMarkers";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            case 5: {
                arr_object[2] = "identifier";
                break;
            }
            case 6: {
                arr_object[2] = "isValidIdentifier";
                break;
            }
            case 7: {
                arr_object[2] = "special";
                break;
            }
            case 8: {
                arr_object[2] = "guessByFirstCharacter";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 1 || v == 2 || v == 3 || v == 4 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 2 || v == 3 || v == 4 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public String asString() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        Name.a(1);
        throw null;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((Name)object0));
    }

    public int compareTo(Name name0) {
        return this.a.compareTo(name0.a);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Name)) {
            return false;
        }
        return this.b == ((Name)object0).b ? this.a.equals(((Name)object0).a) : false;
    }

    @NotNull
    public String getIdentifier() {
        if(this.b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String s = this.asString();
        if(s != null) {
            return s;
        }
        Name.a(2);
        throw null;
    }

    @NotNull
    public static Name guessByFirstCharacter(@NotNull String s) {
        if(s != null) {
            return s.startsWith("<") ? Name.special(s) : Name.identifier(s);
        }
        Name.a(8);
        throw null;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @NotNull
    public static Name identifier(@NotNull String s) {
        if(s != null) {
            return new Name(s, false);
        }
        Name.a(5);
        throw null;
    }

    public boolean isSpecial() {
        return this.b;
    }

    public static boolean isValidIdentifier(@NotNull String s) {
        if(s != null) {
            if(!s.isEmpty() && !s.startsWith("<")) {
                int v = 0;
                while(v < s.length()) {
                    if(s.charAt(v) != 46 && s.charAt(v) != 0x2F && s.charAt(v) != 92) {
                        ++v;
                        continue;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        Name.a(6);
        throw null;
    }

    @NotNull
    public static Name special(@NotNull String s) {
        if(s != null) {
            if(!s.startsWith("<")) {
                throw new IllegalArgumentException("special name must start with \'<\': " + s);
            }
            return new Name(s, true);
        }
        Name.a(7);
        throw null;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

