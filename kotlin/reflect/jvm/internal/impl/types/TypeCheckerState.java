package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
public class TypeCheckerState {
    public interface ForkPointContext {
        public static final class Default implements ForkPointContext {
            public boolean a;

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$ForkPointContext
            public void fork(@NotNull Function0 function00) {
                Intrinsics.checkNotNullParameter(function00, "block");
                if(this.a) {
                    return;
                }
                this.a = ((Boolean)function00.invoke()).booleanValue();
            }

            public final boolean getResult() {
                return this.a;
            }
        }

        void fork(@NotNull Function0 arg1);
    }

    public static enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

    }

    public static abstract class SupertypesPolicy {
        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        @SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$LowerIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class LowerIfFlexible extends SupertypesPolicy {
            @NotNull
            public static final LowerIfFlexible INSTANCE;

            static {
                LowerIfFlexible.INSTANCE = new LowerIfFlexible(null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/TypeCheckerState$SupertypesPolicy;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$SupertypesPolicy
            @NotNull
            public SimpleTypeMarker transformType(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
                Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
                Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
                return typeCheckerState0.getTypeSystemContext().lowerBoundIfFlexible(kotlinTypeMarker0);
            }
        }

        public static final class None extends SupertypesPolicy {
            @NotNull
            public static final None INSTANCE;

            static {
                None.INSTANCE = new None(null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/TypeCheckerState$SupertypesPolicy;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
            }

            @NotNull
            public Void transformType(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
                Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
                Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
                throw new UnsupportedOperationException("Should not be called");
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$SupertypesPolicy
            public SimpleTypeMarker transformType(TypeCheckerState typeCheckerState0, KotlinTypeMarker kotlinTypeMarker0) {
                return (SimpleTypeMarker)this.transformType(typeCheckerState0, kotlinTypeMarker0);
            }
        }

        @SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$UpperIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class UpperIfFlexible extends SupertypesPolicy {
            @NotNull
            public static final UpperIfFlexible INSTANCE;

            static {
                UpperIfFlexible.INSTANCE = new UpperIfFlexible(null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/TypeCheckerState$SupertypesPolicy;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$SupertypesPolicy
            @NotNull
            public SimpleTypeMarker transformType(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
                Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
                Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
                return typeCheckerState0.getTypeSystemContext().upperBoundIfFlexible(kotlinTypeMarker0);
            }
        }

        public SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public abstract SimpleTypeMarker transformType(@NotNull TypeCheckerState arg1, @NotNull KotlinTypeMarker arg2);
    }

    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final TypeSystemContext d;
    public final AbstractTypePreparator e;
    public final AbstractTypeRefiner f;
    public int g;
    public ArrayDeque h;
    public SmartSet i;

    public TypeCheckerState(boolean z, boolean z1, boolean z2, @NotNull TypeSystemContext typeSystemContext0, @NotNull AbstractTypePreparator abstractTypePreparator0, @NotNull AbstractTypeRefiner abstractTypeRefiner0) {
        Intrinsics.checkNotNullParameter(typeSystemContext0, "typeSystemContext");
        Intrinsics.checkNotNullParameter(abstractTypePreparator0, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(abstractTypeRefiner0, "kotlinTypeRefiner");
        super();
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = typeSystemContext0;
        this.e = abstractTypePreparator0;
        this.f = abstractTypeRefiner0;
    }

    @Nullable
    public Boolean addSubtypeConstraint(@NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull KotlinTypeMarker kotlinTypeMarker1, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "superType");
        return null;
    }

    public static Boolean addSubtypeConstraint$default(TypeCheckerState typeCheckerState0, KotlinTypeMarker kotlinTypeMarker0, KotlinTypeMarker kotlinTypeMarker1, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if((v & 4) != 0) {
            z = false;
        }
        return typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker0, kotlinTypeMarker1, z);
    }

    public final void clear() {
        ArrayDeque arrayDeque0 = this.h;
        Intrinsics.checkNotNull(arrayDeque0);
        arrayDeque0.clear();
        SmartSet smartSet0 = this.i;
        Intrinsics.checkNotNull(smartSet0);
        smartSet0.clear();
    }

    public boolean customIsSubtypeOf(@NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull KotlinTypeMarker kotlinTypeMarker1) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "superType");
        return true;
    }

    @NotNull
    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(@NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull CapturedTypeMarker capturedTypeMarker0) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(capturedTypeMarker0, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @Nullable
    public final ArrayDeque getSupertypesDeque() {
        return this.h;
    }

    @Nullable
    public final Set getSupertypesSet() {
        return this.i;
    }

    @NotNull
    public final TypeSystemContext getTypeSystemContext() {
        return this.d;
    }

    public final void initialize() {
        if(this.h == null) {
            this.h = new ArrayDeque(4);
        }
        if(this.i == null) {
            this.i = SmartSet.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(@NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        return this.c && this.d.isTypeVariableType(kotlinTypeMarker0);
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.a;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.b;
    }

    @NotNull
    public final KotlinTypeMarker prepareType(@NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        return this.e.prepareType(kotlinTypeMarker0);
    }

    @NotNull
    public final KotlinTypeMarker refineType(@NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        return this.f.refineType(kotlinTypeMarker0);
    }

    public boolean runForkingPoint(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        Default typeCheckerState$ForkPointContext$Default0 = new Default();
        function10.invoke(typeCheckerState$ForkPointContext$Default0);
        return typeCheckerState$ForkPointContext$Default0.getResult();
    }
}

