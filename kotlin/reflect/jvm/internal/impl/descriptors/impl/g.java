package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

public final class g extends AbstractTypeConstructor {
    public final SupertypeLoopChecker c;
    public final AbstractTypeParameterDescriptor d;

    public g(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor0, StorageManager storageManager0, SupertypeLoopChecker supertypeLoopChecker0) {
        if(storageManager0 != null) {
            this.d = abstractTypeParameterDescriptor0;
            super(storageManager0);
            this.c = supertypeLoopChecker0;
            return;
        }
        g.a(0);
        throw null;
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 6: {
                arr_object[0] = "type";
                break;
            }
            case 7: {
                arr_object[0] = "supertypes";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            }
            case 9: {
                arr_object[0] = "classifier";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "computeSupertypes";
                break;
            }
            case 2: {
                arr_object[1] = "getParameters";
                break;
            }
            case 3: {
                arr_object[1] = "getDeclarationDescriptor";
                break;
            }
            case 4: {
                arr_object[1] = "getBuiltIns";
                break;
            }
            case 5: {
                arr_object[1] = "getSupertypeLoopChecker";
                break;
            }
            case 8: {
                arr_object[1] = "processSupertypesWithoutCycles";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            }
        }
        switch(v) {
            case 6: {
                arr_object[2] = "reportSupertypeLoopError";
                break;
            }
            case 7: {
                arr_object[2] = "processSupertypesWithoutCycles";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                break;
            }
            case 9: {
                arr_object[2] = "isSameClassifier";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection computeSupertypes() {
        Collection collection0 = this.d.resolveUpperBounds();
        if(collection0 != null) {
            return collection0;
        }
        g.a(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final KotlinType defaultSupertypeIfEmpty() {
        return ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns kotlinBuiltIns0 = DescriptorUtilsKt.getBuiltIns(this.d);
        if(kotlinBuiltIns0 != null) {
            return kotlinBuiltIns0;
        }
        g.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    public final ClassifierDescriptor getDeclarationDescriptor() {
        ClassifierDescriptor classifierDescriptor0 = this.d;
        if(classifierDescriptor0 != null) {
            return classifierDescriptor0;
        }
        g.a(3);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        g.a(2);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        SupertypeLoopChecker supertypeLoopChecker0 = this.c;
        if(supertypeLoopChecker0 != null) {
            return supertypeLoopChecker0;
        }
        g.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    public final boolean isSameClassifier(ClassifierDescriptor classifierDescriptor0) {
        if(classifierDescriptor0 != null) {
            return classifierDescriptor0 instanceof TypeParameterDescriptor && DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.d, ((TypeParameterDescriptor)classifierDescriptor0), true);
        }
        g.a(9);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final List processSupertypesWithoutCycles(List list0) {
        if(list0 != null) {
            List list1 = this.d.processBoundsWithoutCycles(list0);
            if(list1 != null) {
                return list1;
            }
            g.a(8);
            throw null;
        }
        g.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final void reportSupertypeLoopError(KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            this.d.reportSupertypeLoopError(kotlinType0);
            return;
        }
        g.a(6);
        throw null;
    }

    @Override
    public final String toString() {
        return this.d.getName().toString();
    }
}

