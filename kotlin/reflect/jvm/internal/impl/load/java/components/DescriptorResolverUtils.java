package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

public final class DescriptorResolverUtils {
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 18 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 7: 
            case 13: {
                arr_object[0] = "membersFromSupertypes";
                break;
            }
            case 2: 
            case 8: 
            case 14: {
                arr_object[0] = "membersFromCurrent";
                break;
            }
            case 3: 
            case 9: 
            case 15: {
                arr_object[0] = "classDescriptor";
                break;
            }
            case 4: 
            case 10: 
            case 16: {
                arr_object[0] = "errorReporter";
                break;
            }
            case 5: 
            case 11: 
            case 17: {
                arr_object[0] = "overridingUtil";
                break;
            }
            case 18: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            }
            case 20: {
                arr_object[0] = "annotationClass";
                break;
            }
            default: {
                arr_object[0] = "name";
            }
        }
        arr_object[1] = v == 18 ? "resolveOverrides" : "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        switch(v) {
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[2] = "resolveOverridesForStaticMembers";
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                arr_object[2] = "resolveOverrides";
                break;
            }
            case 18: {
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "getAnnotationParameterByName";
                break;
            }
            default: {
                arr_object[2] = "resolveOverridesForNonStaticMembers";
            }
        }
        String s = String.format((v == 18 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 18 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    public static LinkedHashSet b(Name name0, Collection collection0, Collection collection1, ClassDescriptor classDescriptor0, ErrorReporter errorReporter0, OverridingUtil overridingUtil0, boolean z) {
        if(name0 != null) {
            if(collection0 != null) {
                if(collection1 != null) {
                    if(classDescriptor0 != null) {
                        if(errorReporter0 != null) {
                            if(overridingUtil0 != null) {
                                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                                overridingUtil0.generateOverridesInFunctionGroup(name0, collection0, collection1, classDescriptor0, new a(errorReporter0, linkedHashSet0, z));
                                return linkedHashSet0;
                            }
                            DescriptorResolverUtils.a(17);
                            throw null;
                        }
                        DescriptorResolverUtils.a(16);
                        throw null;
                    }
                    DescriptorResolverUtils.a(15);
                    throw null;
                }
                DescriptorResolverUtils.a(14);
                throw null;
            }
            DescriptorResolverUtils.a(13);
            throw null;
        }
        DescriptorResolverUtils.a(12);
        throw null;
    }

    @Nullable
    public static ValueParameterDescriptor getAnnotationParameterByName(@NotNull Name name0, @NotNull ClassDescriptor classDescriptor0) {
        if(name0 != null) {
            if(classDescriptor0 != null) {
                Collection collection0 = classDescriptor0.getConstructors();
                if(collection0.size() != 1) {
                    return null;
                }
                Object object0 = collection0.iterator().next();
                for(Object object1: ((ClassConstructorDescriptor)object0).getValueParameters()) {
                    ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)object1;
                    if(valueParameterDescriptor0.getName().equals(name0)) {
                        return valueParameterDescriptor0;
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
            DescriptorResolverUtils.a(20);
            throw null;
        }
        DescriptorResolverUtils.a(19);
        throw null;
    }

    @NotNull
    public static Collection resolveOverridesForNonStaticMembers(@NotNull Name name0, @NotNull Collection collection0, @NotNull Collection collection1, @NotNull ClassDescriptor classDescriptor0, @NotNull ErrorReporter errorReporter0, @NotNull OverridingUtil overridingUtil0) {
        if(name0 != null) {
            if(collection0 != null) {
                if(collection1 != null) {
                    if(classDescriptor0 != null) {
                        if(errorReporter0 != null) {
                            if(overridingUtil0 != null) {
                                return DescriptorResolverUtils.b(name0, collection0, collection1, classDescriptor0, errorReporter0, overridingUtil0, false);
                            }
                            DescriptorResolverUtils.a(5);
                            throw null;
                        }
                        DescriptorResolverUtils.a(4);
                        throw null;
                    }
                    DescriptorResolverUtils.a(3);
                    throw null;
                }
                DescriptorResolverUtils.a(2);
                throw null;
            }
            DescriptorResolverUtils.a(1);
            throw null;
        }
        DescriptorResolverUtils.a(0);
        throw null;
    }

    @NotNull
    public static Collection resolveOverridesForStaticMembers(@NotNull Name name0, @NotNull Collection collection0, @NotNull Collection collection1, @NotNull ClassDescriptor classDescriptor0, @NotNull ErrorReporter errorReporter0, @NotNull OverridingUtil overridingUtil0) {
        if(name0 != null) {
            if(collection0 != null) {
                if(collection1 != null) {
                    if(classDescriptor0 != null) {
                        if(errorReporter0 != null) {
                            if(overridingUtil0 != null) {
                                return DescriptorResolverUtils.b(name0, collection0, collection1, classDescriptor0, errorReporter0, overridingUtil0, true);
                            }
                            DescriptorResolverUtils.a(11);
                            throw null;
                        }
                        DescriptorResolverUtils.a(10);
                        throw null;
                    }
                    DescriptorResolverUtils.a(9);
                    throw null;
                }
                DescriptorResolverUtils.a(8);
                throw null;
            }
            DescriptorResolverUtils.a(7);
            throw null;
        }
        DescriptorResolverUtils.a(6);
        throw null;
    }
}

