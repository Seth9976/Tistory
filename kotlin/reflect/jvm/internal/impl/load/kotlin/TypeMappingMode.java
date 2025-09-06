package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeMappingMode {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Variance.values().length];
            try {
                arr_v[Variance.IN_VARIANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Variance.INVARIANT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @JvmField
    @NotNull
    public static final TypeMappingMode CLASS_DECLARATION;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final TypeMappingMode DEFAULT;
    @JvmField
    @NotNull
    public static final TypeMappingMode DEFAULT_UAST;
    @JvmField
    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT;
    @JvmField
    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;
    @JvmField
    @NotNull
    public static final TypeMappingMode RETURN_TYPE_BOXED;
    @JvmField
    @NotNull
    public static final TypeMappingMode SUPER_TYPE;
    @JvmField
    @NotNull
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    @JvmField
    @NotNull
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final TypeMappingMode f;
    public final boolean g;
    public final TypeMappingMode h;
    public final TypeMappingMode i;
    public final boolean j;

    static {
        TypeMappingMode.Companion = new Companion(null);
        TypeMappingMode typeMappingMode0 = new TypeMappingMode(false, false, false, false, false, null, false, null, null, false, 0x3FF, null);
        TypeMappingMode.GENERIC_ARGUMENT = typeMappingMode0;
        TypeMappingMode typeMappingMode1 = new TypeMappingMode(false, false, false, false, false, null, false, null, null, true, 0x1FF, null);
        TypeMappingMode.GENERIC_ARGUMENT_UAST = typeMappingMode1;
        TypeMappingMode.RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 0x3FD, null);
        TypeMappingMode.DEFAULT = new TypeMappingMode(false, false, false, false, false, typeMappingMode0, false, null, null, false, 988, null);
        TypeMappingMode.DEFAULT_UAST = new TypeMappingMode(false, false, false, false, false, typeMappingMode1, false, null, null, true, 476, null);
        TypeMappingMode.CLASS_DECLARATION = new TypeMappingMode(false, true, false, false, false, typeMappingMode0, false, null, null, false, 988, null);
        TypeMappingMode.SUPER_TYPE = new TypeMappingMode(false, false, false, true, false, typeMappingMode0, false, null, null, false, 983, null);
        TypeMappingMode.SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(false, false, false, true, false, typeMappingMode0, false, null, null, false, 919, null);
        TypeMappingMode.VALUE_FOR_ANNOTATION = new TypeMappingMode(false, false, true, false, false, typeMappingMode0, false, null, null, false, 984, null);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 0x3FF, null);
    }

    public TypeMappingMode(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, @Nullable TypeMappingMode typeMappingMode0, boolean z5, @Nullable TypeMappingMode typeMappingMode1, @Nullable TypeMappingMode typeMappingMode2, boolean z6) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = typeMappingMode0;
        this.g = z5;
        this.h = typeMappingMode1;
        this.i = typeMappingMode2;
        this.j = z6;
    }

    public TypeMappingMode(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, TypeMappingMode typeMappingMode0, boolean z5, TypeMappingMode typeMappingMode1, TypeMappingMode typeMappingMode2, boolean z6, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        boolean z7 = true;
        boolean z8 = false;
        TypeMappingMode typeMappingMode3 = (v & 0x20) == 0 ? typeMappingMode0 : null;
        if((v & 0x40) == 0) {
            z7 = z5;
        }
        if((v & 0x200) == 0) {
            z8 = z6;
        }
        this(((v & 1) == 0 ? z : true), ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : false), ((v & 8) == 0 ? z3 : false), ((v & 16) == 0 ? z4 : false), typeMappingMode3, z7, ((v & 0x80) == 0 ? typeMappingMode1 : typeMappingMode3), ((v & 0x100) == 0 ? typeMappingMode2 : typeMappingMode3), z8);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.g;
    }

    public final boolean getMapTypeAliases() {
        return this.j;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.b;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.a;
    }

    public final boolean isForAnnotationParameter() {
        return this.c;
    }

    @NotNull
    public final TypeMappingMode toGenericArgumentMode(@NotNull Variance variance0, boolean z) {
        Intrinsics.checkNotNullParameter(variance0, "effectiveVariance");
        if(!z || !this.c) {
            switch(WhenMappings.$EnumSwitchMapping$0[variance0.ordinal()]) {
                case 1: {
                    return this.h == null ? this : this.h;
                }
                case 2: {
                    return this.i == null ? this : this.i;
                }
                default: {
                    return this.f == null ? this : this.f;
                }
            }
        }
        return this;
    }

    @NotNull
    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.a, true, this.c, this.d, this.e, this.f, this.g, this.h, this.i, false, 0x200, null);
    }
}

