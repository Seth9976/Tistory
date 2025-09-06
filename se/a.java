package se;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaAnnotationDescriptor x;

    public a(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor0, int v) {
        this.w = v;
        this.x = lazyJavaAnnotationDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor1 = this.x;
                Iterable iterable0 = lazyJavaAnnotationDescriptor1.b.getArguments();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    Name name0 = ((JavaAnnotationArgument)object0).getName();
                    if(name0 == null) {
                        name0 = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                    }
                    ConstantValue constantValue0 = lazyJavaAnnotationDescriptor1.a(((JavaAnnotationArgument)object0));
                    Pair pair0 = constantValue0 == null ? null : TuplesKt.to(name0, constantValue0);
                    if(pair0 != null) {
                        arrayList0.add(pair0);
                    }
                }
                return x.toMap(arrayList0);
            }
            case 1: {
                ClassId classId0 = this.x.b.getClassId();
                return classId0 != null ? classId0.asSingleFqName() : null;
            }
            default: {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor0 = this.x;
                FqName fqName0 = lazyJavaAnnotationDescriptor0.getFqName();
                if(fqName0 == null) {
                    return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, new String[]{lazyJavaAnnotationDescriptor0.b.toString()});
                }
                KotlinBuiltIns kotlinBuiltIns0 = lazyJavaAnnotationDescriptor0.a.getModule().getBuiltIns();
                ClassDescriptor classDescriptor0 = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName0, kotlinBuiltIns0, null, 4, null);
                if(classDescriptor0 == null) {
                    JavaClass javaClass0 = lazyJavaAnnotationDescriptor0.b.resolve();
                    classDescriptor0 = javaClass0 == null ? null : lazyJavaAnnotationDescriptor0.a.getComponents().getModuleClassResolver().resolveClass(javaClass0);
                    if(classDescriptor0 == null) {
                        classDescriptor0 = LazyJavaAnnotationDescriptor.access$createTypeForMissingDependencies(lazyJavaAnnotationDescriptor0, fqName0);
                    }
                }
                return classDescriptor0.getDefaultType();
            }
        }
    }
}

