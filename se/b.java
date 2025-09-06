package se;

import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaClassDescriptor x;

    public b(LazyJavaClassDescriptor lazyJavaClassDescriptor0, int v) {
        this.w = v;
        this.x = lazyJavaClassDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return TypeParameterUtilsKt.computeConstructorTypeParameters(this.x);
            }
            case 1: {
                LazyJavaClassDescriptor lazyJavaClassDescriptor1 = this.x;
                Iterable iterable0 = lazyJavaClassDescriptor1.getJClass().getTypeParameters();
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    JavaTypeParameter javaTypeParameter0 = (JavaTypeParameter)object0;
                    TypeParameterDescriptor typeParameterDescriptor0 = lazyJavaClassDescriptor1.j.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter0);
                    if(typeParameterDescriptor0 == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter0 + " surely belongs to class " + lazyJavaClassDescriptor1.getJClass() + ", so it must be resolved");
                    }
                    arrayList0.add(typeParameterDescriptor0);
                }
                return arrayList0;
            }
            default: {
                LazyJavaClassDescriptor lazyJavaClassDescriptor0 = this.x;
                ClassId classId0 = DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor0);
                return classId0 != null ? lazyJavaClassDescriptor0.getOuterContext().getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId0) : null;
            }
        }
    }
}

