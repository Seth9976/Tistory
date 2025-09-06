package kotlin.reflect.jvm.internal.impl.types.checker;

import gf.a;
import java.util.ArrayDeque;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1747#2,3:109\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n*L\n51#1:109,3\n*E\n"})
public final class UtilsKt {
    public static final String a(TypeConstructor typeConstructor0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        UtilsKt.b(stringBuilder0, "type: " + typeConstructor0);
        UtilsKt.b(stringBuilder0, "hashCode: " + typeConstructor0.hashCode());
        UtilsKt.b(stringBuilder0, "javaClass: " + typeConstructor0.getClass().getCanonicalName());
        for(DeclarationDescriptor declarationDescriptor0 = typeConstructor0.getDeclarationDescriptor(); declarationDescriptor0 != null; declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration()) {
            UtilsKt.b(stringBuilder0, "fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptor0));
            UtilsKt.b(stringBuilder0, "javaClass: " + declarationDescriptor0.getClass().getCanonicalName());
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static final void b(StringBuilder stringBuilder0, String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        stringBuilder0.append(s);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
    }

    @Nullable
    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType0, @NotNull KotlinType kotlinType1, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "subtype");
        Intrinsics.checkNotNullParameter(kotlinType1, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks0, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.add(new a(kotlinType0, null));
        TypeConstructor typeConstructor0 = kotlinType1.getConstructor();
        while(!arrayDeque0.isEmpty()) {
            a a0 = (a)arrayDeque0.poll();
            KotlinType kotlinType2 = a0.a;
            TypeConstructor typeConstructor1 = kotlinType2.getConstructor();
            if(typeCheckingProcedureCallbacks0.assertEqualTypeConstructors(typeConstructor1, typeConstructor0)) {
                boolean z = kotlinType2.isMarkedNullable();
                a a1 = a0.b;
                while(a1 != null) {
                    KotlinType kotlinType3 = a1.a;
                    Iterable iterable0 = kotlinType3.getArguments();
                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                        for(Object object0: iterable0) {
                            Variance variance0 = ((TypeProjection)object0).getProjectionKind();
                            Variance variance1 = Variance.INVARIANT;
                            if(variance0 == variance1) {
                                continue;
                            }
                            KotlinType kotlinType4 = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(kotlinType3), false, 1, null).buildSubstitutor().safeSubstitute(kotlinType2, variance1);
                            Intrinsics.checkNotNullExpressionValue(kotlinType4, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                            kotlinType2 = (KotlinType)CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType4).getUpper();
                            goto label_29;
                        }
                    }
                    kotlinType2 = TypeConstructorSubstitution.Companion.create(kotlinType3).buildSubstitutor().safeSubstitute(kotlinType2, Variance.INVARIANT);
                    Intrinsics.checkNotNullExpressionValue(kotlinType2, "{\n                    Ty…ARIANT)\n                }");
                label_29:
                    z = z || kotlinType3.isMarkedNullable();
                    a1 = a1.b;
                }
                TypeConstructor typeConstructor2 = kotlinType2.getConstructor();
                if(!typeCheckingProcedureCallbacks0.assertEqualTypeConstructors(typeConstructor2, typeConstructor0)) {
                    throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + UtilsKt.a(typeConstructor2) + ", \n\nsupertype: " + UtilsKt.a(typeConstructor0) + " \n" + typeCheckingProcedureCallbacks0.assertEqualTypeConstructors(typeConstructor2, typeConstructor0));
                }
                return TypeUtils.makeNullableAsSpecified(kotlinType2, z);
            }
            for(Object object1: typeConstructor1.getSupertypes()) {
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object1), "immediateSupertype");
                arrayDeque0.add(new a(((KotlinType)object1), a0));
            }
        }
        return null;
    }
}

