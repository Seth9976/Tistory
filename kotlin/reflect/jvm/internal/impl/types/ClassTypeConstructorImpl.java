package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor implements TypeConstructor {
    public final ClassDescriptor c;
    public final List d;
    public final Collection e;

    public ClassTypeConstructorImpl(@NotNull ClassDescriptor classDescriptor0, @NotNull List list0, @NotNull Collection collection0, @NotNull StorageManager storageManager0) {
        if(classDescriptor0 != null) {
            if(list0 != null) {
                if(collection0 != null) {
                    if(storageManager0 != null) {
                        super(storageManager0);
                        this.c = classDescriptor0;
                        this.d = Collections.unmodifiableList(new ArrayList(list0));
                        this.e = Collections.unmodifiableCollection(collection0);
                        return;
                    }
                    ClassTypeConstructorImpl.a(3);
                    throw null;
                }
                ClassTypeConstructorImpl.a(2);
                throw null;
            }
            ClassTypeConstructorImpl.a(1);
            throw null;
        }
        ClassTypeConstructorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 4 || v == 5 || v == 6 || v == 7 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "parameters";
                break;
            }
            case 2: {
                arr_object[0] = "supertypes";
                break;
            }
            case 3: {
                arr_object[0] = "storageManager";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            }
            default: {
                arr_object[0] = "classDescriptor";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getParameters";
                break;
            }
            case 5: {
                arr_object[1] = "getDeclarationDescriptor";
                break;
            }
            case 6: {
                arr_object[1] = "computeSupertypes";
                break;
            }
            case 7: {
                arr_object[1] = "getSupertypeLoopChecker";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
            }
        }
        if(v != 4 && v != 5 && v != 6 && v != 7) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 4 || v == 5 || v == 6 || v == 7 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 4 || v == 5 || v == 6 || v == 7 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public Collection computeSupertypes() {
        Collection collection0 = this.e;
        if(collection0 != null) {
            return collection0;
        }
        ClassTypeConstructorImpl.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    @NotNull
    public ClassDescriptor getDeclarationDescriptor() {
        ClassDescriptor classDescriptor0 = this.c;
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        ClassTypeConstructorImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public ClassifierDescriptor getDeclarationDescriptor() {
        return this.getDeclarationDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List getParameters() {
        List list0 = this.d;
        if(list0 != null) {
            return list0;
        }
        ClassTypeConstructorImpl.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public SupertypeLoopChecker getSupertypeLoopChecker() {
        SupertypeLoopChecker supertypeLoopChecker0 = EMPTY.INSTANCE;
        if(supertypeLoopChecker0 != null) {
            return supertypeLoopChecker0;
        }
        ClassTypeConstructorImpl.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return true;
    }

    @Override
    public String toString() {
        return DescriptorUtils.getFqName(this.c).asString();
    }
}

