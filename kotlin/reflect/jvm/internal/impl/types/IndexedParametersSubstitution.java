package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n37#2,2:208\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n*L\n127#1:208,2\n*E\n"})
public final class IndexedParametersSubstitution extends TypeSubstitution {
    public final TypeParameterDescriptor[] a;
    public final TypeProjection[] b;
    public final boolean c;

    public IndexedParametersSubstitution(@NotNull List list0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(list0, "parameters");
        Intrinsics.checkNotNullParameter(list1, "argumentsList");
        this(((TypeParameterDescriptor[])list0.toArray(new TypeParameterDescriptor[0])), ((TypeProjection[])list1.toArray(new TypeProjection[0])), false, 4, null);
    }

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] arr_typeParameterDescriptor, @NotNull TypeProjection[] arr_typeProjection, boolean z) {
        Intrinsics.checkNotNullParameter(arr_typeParameterDescriptor, "parameters");
        Intrinsics.checkNotNullParameter(arr_typeProjection, "arguments");
        super();
        this.a = arr_typeParameterDescriptor;
        this.b = arr_typeProjection;
        this.c = z;
    }

    public IndexedParametersSubstitution(TypeParameterDescriptor[] arr_typeParameterDescriptor, TypeProjection[] arr_typeProjection, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(arr_typeParameterDescriptor, arr_typeProjection, z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "key");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor0 = classifierDescriptor0 instanceof TypeParameterDescriptor ? ((TypeParameterDescriptor)classifierDescriptor0) : null;
        if(typeParameterDescriptor0 == null) {
            return null;
        }
        int v = typeParameterDescriptor0.getIndex();
        return v >= this.a.length || !Intrinsics.areEqual(this.a[v].getTypeConstructor(), typeParameterDescriptor0.getTypeConstructor()) ? null : this.b[v];
    }

    @NotNull
    public final TypeProjection[] getArguments() {
        return this.b;
    }

    @NotNull
    public final TypeParameterDescriptor[] getParameters() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.b.length == 0;
    }
}

