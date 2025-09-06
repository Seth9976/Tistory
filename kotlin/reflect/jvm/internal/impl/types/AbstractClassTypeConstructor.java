package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor implements TypeConstructor {
    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager0) {
        if(storageManager0 != null) {
            super(storageManager0);
            return;
        }
        AbstractClassTypeConstructor.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 3 || v == 4 ? 2 : 3)];
        switch(v) {
            case 2: {
                arr_object[0] = "classifier";
                break;
            }
            case 1: 
            case 3: 
            case 4: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "getBuiltIns";
                break;
            }
            case 3: 
            case 4: {
                arr_object[1] = "getAdditionalNeighboursInSupertypeGraph";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
        }
        switch(v) {
            case 2: {
                arr_object[2] = "isSameClassifier";
                break;
            }
            case 1: 
            case 3: 
            case 4: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 1 || v == 3 || v == 4 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 3 || v == 4 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.getDeclarationDescriptor()) ? null : this.getBuiltIns().getAnyType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public Collection getAdditionalNeighboursInSupertypeGraph(boolean z) {
        DeclarationDescriptor declarationDescriptor0 = this.getDeclarationDescriptor().getContainingDeclaration();
        if(!(declarationDescriptor0 instanceof ClassDescriptor)) {
            Collection collection0 = Collections.emptyList();
            if(collection0 != null) {
                return collection0;
            }
            AbstractClassTypeConstructor.a(3);
            throw null;
        }
        Collection collection1 = new SmartList();
        collection1.add(((ClassDescriptor)declarationDescriptor0).getDefaultType());
        ClassDescriptor classDescriptor0 = ((ClassDescriptor)declarationDescriptor0).getCompanionObjectDescriptor();
        if(z && classDescriptor0 != null) {
            collection1.add(classDescriptor0.getDefaultType());
        }
        return collection1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns kotlinBuiltIns0 = DescriptorUtilsKt.getBuiltIns(this.getDeclarationDescriptor());
        if(kotlinBuiltIns0 != null) {
            return kotlinBuiltIns0;
        }
        AbstractClassTypeConstructor.a(1);
        throw null;
    }

    @NotNull
    public abstract ClassDescriptor getDeclarationDescriptor();

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    @NotNull
    public ClassifierDescriptor getDeclarationDescriptor() {
        return this.getDeclarationDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    public boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor0) {
        if(classifierDescriptor0 != null) {
            return classifierDescriptor0 instanceof ClassDescriptor && this.areFqNamesEqual(this.getDeclarationDescriptor(), classifierDescriptor0);
        }
        AbstractClassTypeConstructor.a(2);
        throw null;
    }
}

