package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeWithEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1549#2:170\n1620#2,3:171\n1726#2,3:174\n*S KotlinDebug\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n*L\n97#1:170\n97#1:171,3\n112#1:174,3\n*E\n"})
public final class TypeWithEnhancementKt {
    @Nullable
    public static final KotlinType getEnhancement(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return kotlinType0 instanceof TypeWithEnhancement ? ((TypeWithEnhancement)kotlinType0).getEnhancement() : null;
    }

    @NotNull
    public static final UnwrappedType inheritEnhancement(@NotNull UnwrappedType unwrappedType0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinType0, "origin");
        return TypeWithEnhancementKt.wrapEnhancement(unwrappedType0, TypeWithEnhancementKt.getEnhancement(kotlinType0));
    }

    @NotNull
    public static final UnwrappedType inheritEnhancement(@NotNull UnwrappedType unwrappedType0, @NotNull KotlinType kotlinType0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinType0, "origin");
        Intrinsics.checkNotNullParameter(function10, "transform");
        KotlinType kotlinType1 = TypeWithEnhancementKt.getEnhancement(kotlinType0);
        return kotlinType1 == null ? TypeWithEnhancementKt.wrapEnhancement(unwrappedType0, null) : TypeWithEnhancementKt.wrapEnhancement(unwrappedType0, ((KotlinType)function10.invoke(kotlinType1)));
    }

    @NotNull
    public static final UnwrappedType wrapEnhancement(@NotNull UnwrappedType unwrappedType0, @Nullable KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "<this>");
        if(unwrappedType0 instanceof TypeWithEnhancement) {
            return TypeWithEnhancementKt.wrapEnhancement(((TypeWithEnhancement)unwrappedType0).getOrigin(), kotlinType0);
        }
        if(kotlinType0 != null && !Intrinsics.areEqual(kotlinType0, unwrappedType0)) {
            if(unwrappedType0 instanceof SimpleType) {
                return new SimpleTypeWithEnhancement(((SimpleType)unwrappedType0), kotlinType0);
            }
            if(!(unwrappedType0 instanceof FlexibleType)) {
                throw new NoWhenBranchMatchedException();
            }
            return new FlexibleTypeWithEnhancement(((FlexibleType)unwrappedType0), kotlinType0);
        }
        return unwrappedType0;
    }
}

