package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    @SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n*L\n96#1:208\n96#1:209,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull KotlinType kotlinType0) {
            Intrinsics.checkNotNullParameter(kotlinType0, "kotlinType");
            return this.create(kotlinType0.getConstructor(), kotlinType0.getArguments());
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull TypeConstructor typeConstructor0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(typeConstructor0, "typeConstructor");
            Intrinsics.checkNotNullParameter(list0, "arguments");
            List list1 = typeConstructor0.getParameters();
            Intrinsics.checkNotNullExpressionValue(list1, "typeConstructor.parameters");
            TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)CollectionsKt___CollectionsKt.lastOrNull(list1);
            if(typeParameterDescriptor0 != null && typeParameterDescriptor0.isCapturedFromOuterDeclaration()) {
                List list2 = typeConstructor0.getParameters();
                Intrinsics.checkNotNullExpressionValue(list2, "typeConstructor.parameters");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
                for(Object object0: list2) {
                    arrayList0.add(((TypeParameterDescriptor)object0).getTypeConstructor());
                }
                return Companion.createByConstructorsMap$default(this, x.toMap(CollectionsKt___CollectionsKt.zip(arrayList0, list0)), false, 2, null);
            }
            return new IndexedParametersSubstitution(list1, list0);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "map");
            return Companion.createByConstructorsMap$default(this, map0, false, 2, null);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map map0, boolean z) {
            Intrinsics.checkNotNullParameter(map0, "map");
            return new TypeConstructorSubstitution() {
                @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return this.b;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                @Nullable
                public TypeProjection get(@NotNull TypeConstructor typeConstructor0) {
                    Intrinsics.checkNotNullParameter(typeConstructor0, "key");
                    return (TypeProjection)z.get(typeConstructor0);
                }

                @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return z.isEmpty();
                }
            };
        }

        public static TypeConstructorSubstitution createByConstructorsMap$default(Companion typeConstructorSubstitution$Companion0, Map map0, boolean z, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            return typeConstructorSubstitution$Companion0.createByConstructorsMap(map0, z);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        TypeConstructorSubstitution.Companion = new Companion(null);
    }

    @JvmStatic
    @NotNull
    public static final TypeSubstitution create(@NotNull TypeConstructor typeConstructor0, @NotNull List list0) {
        return TypeConstructorSubstitution.Companion.create(typeConstructor0, list0);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map map0) {
        return TypeConstructorSubstitution.Companion.createByConstructorsMap(map0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "key");
        return this.get(kotlinType0.getConstructor());
    }

    @Nullable
    public abstract TypeProjection get(@NotNull TypeConstructor arg1);
}

