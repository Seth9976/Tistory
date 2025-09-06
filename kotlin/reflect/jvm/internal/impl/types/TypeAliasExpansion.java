package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeAliasExpansion {
    @SourceDebugExtension({"SMAP\nTypeAliasExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n*L\n34#1:44\n34#1:45,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TypeAliasExpansion create(@Nullable TypeAliasExpansion typeAliasExpansion0, @NotNull TypeAliasDescriptor typeAliasDescriptor0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(list0, "arguments");
            List list1 = typeAliasDescriptor0.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(list1, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object0: list1) {
                arrayList0.add(((TypeParameterDescriptor)object0).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion0, typeAliasDescriptor0, list0, x.toMap(CollectionsKt___CollectionsKt.zip(arrayList0, list0)), null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final TypeAliasExpansion a;
    public final TypeAliasDescriptor b;
    public final List c;
    public final Map d;

    static {
        TypeAliasExpansion.Companion = new Companion(null);
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion0, TypeAliasDescriptor typeAliasDescriptor0, List list0, Map map0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = typeAliasExpansion0;
        this.b = typeAliasDescriptor0;
        this.c = list0;
        this.d = map0;
    }

    @NotNull
    public final List getArguments() {
        return this.c;
    }

    @NotNull
    public final TypeAliasDescriptor getDescriptor() {
        return this.b;
    }

    @Nullable
    public final TypeProjection getReplacement(@NotNull TypeConstructor typeConstructor0) {
        Intrinsics.checkNotNullParameter(typeConstructor0, "constructor");
        ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
        return classifierDescriptor0 instanceof TypeParameterDescriptor ? ((TypeProjection)this.d.get(classifierDescriptor0)) : null;
    }

    public final boolean isRecursion(@NotNull TypeAliasDescriptor typeAliasDescriptor0) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "descriptor");
        if(!Intrinsics.areEqual(this.b, typeAliasDescriptor0)) {
            return this.a == null ? false : this.a.isRecursion(typeAliasDescriptor0);
        }
        return true;
    }
}

