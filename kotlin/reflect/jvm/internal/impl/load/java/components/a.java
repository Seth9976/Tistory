package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class a implements SignaturePropagator {
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "owner";
                break;
            }
            case 2: {
                arr_object[0] = "returnType";
                break;
            }
            case 3: {
                arr_object[0] = "valueParameters";
                break;
            }
            case 4: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 5: {
                arr_object[0] = "descriptor";
                break;
            }
            case 6: {
                arr_object[0] = "signatureErrors";
                break;
            }
            default: {
                arr_object[0] = "method";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        arr_object[2] = v == 5 || v == 6 ? "reportSignatureErrors" : "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
    public final void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor0, List list0) {
        if(callableMemberDescriptor0 != null) {
            if(list0 != null) {
                throw new UnsupportedOperationException("Should not be called");
            }
            a.a(6);
            throw null;
        }
        a.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
    public final PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod0, ClassDescriptor classDescriptor0, KotlinType kotlinType0, KotlinType kotlinType1, List list0, List list1) {
        if(javaMethod0 != null) {
            if(classDescriptor0 != null) {
                if(kotlinType0 != null) {
                    if(list0 != null) {
                        if(list1 != null) {
                            return new PropagatedSignature(kotlinType0, kotlinType1, list0, list1, Collections.emptyList(), false);
                        }
                        a.a(4);
                        throw null;
                    }
                    a.a(3);
                    throw null;
                }
                a.a(2);
                throw null;
            }
            a.a(1);
            throw null;
        }
        a.a(0);
        throw null;
    }
}

