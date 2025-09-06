package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public class TypeProjectionImpl extends TypeProjectionBase {
    public final Variance a;
    public final KotlinType b;

    public TypeProjectionImpl(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            this(Variance.INVARIANT, kotlinType0);
            return;
        }
        TypeProjectionImpl.a(2);
        throw null;
    }

    public TypeProjectionImpl(@NotNull Variance variance0, @NotNull KotlinType kotlinType0) {
        if(variance0 != null) {
            if(kotlinType0 != null) {
                super();
                this.a = variance0;
                this.b = kotlinType0;
                return;
            }
            TypeProjectionImpl.a(1);
            throw null;
        }
        TypeProjectionImpl.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 4 || v == 5 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                arr_object[0] = "type";
                break;
            }
            case 4: 
            case 5: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            }
            case 6: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            default: {
                arr_object[0] = "projection";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getProjectionKind";
                break;
            }
            case 5: {
                arr_object[1] = "getType";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
            }
        }
        switch(v) {
            case 3: {
                arr_object[2] = "replaceType";
                break;
            }
            case 4: 
            case 5: {
                break;
            }
            default: {
                arr_object[2] = v == 6 ? "refine" : "<init>";
            }
        }
        String s = String.format((v == 4 || v == 5 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 4 || v == 5 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public Variance getProjectionKind() {
        Variance variance0 = this.a;
        if(variance0 != null) {
            return variance0;
        }
        TypeProjectionImpl.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType0 = this.b;
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        TypeProjectionImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(kotlinTypeRefiner0 != null) {
            KotlinType kotlinType0 = kotlinTypeRefiner0.refineType(this.b);
            return new TypeProjectionImpl(this.a, kotlinType0);
        }
        TypeProjectionImpl.a(6);
        throw null;
    }
}

