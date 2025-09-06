package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SignaturePropagator {
    public static class PropagatedSignature {
        public final KotlinType a;
        public final KotlinType b;
        public final List c;
        public final List d;
        public final List e;
        public final boolean f;

        public PropagatedSignature(@NotNull KotlinType kotlinType0, @Nullable KotlinType kotlinType1, @NotNull List list0, @NotNull List list1, @NotNull List list2, boolean z) {
            if(kotlinType0 != null) {
                if(list0 != null) {
                    if(list1 != null) {
                        if(list2 != null) {
                            super();
                            this.a = kotlinType0;
                            this.b = kotlinType1;
                            this.c = list0;
                            this.d = list1;
                            this.e = list2;
                            this.f = z;
                            return;
                        }
                        PropagatedSignature.a(3);
                        throw null;
                    }
                    PropagatedSignature.a(2);
                    throw null;
                }
                PropagatedSignature.a(1);
                throw null;
            }
            PropagatedSignature.a(0);
            throw null;
        }

        public static void a(int v) {
            Object[] arr_object = new Object[(v == 4 || v == 5 || v == 6 || v == 7 ? 2 : 3)];
            switch(v) {
                case 1: {
                    arr_object[0] = "valueParameters";
                    break;
                }
                case 2: {
                    arr_object[0] = "typeParameters";
                    break;
                }
                case 3: {
                    arr_object[0] = "signatureErrors";
                    break;
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                }
                default: {
                    arr_object[0] = "returnType";
                }
            }
            switch(v) {
                case 4: {
                    arr_object[1] = "getReturnType";
                    break;
                }
                case 5: {
                    arr_object[1] = "getValueParameters";
                    break;
                }
                case 6: {
                    arr_object[1] = "getTypeParameters";
                    break;
                }
                case 7: {
                    arr_object[1] = "getErrors";
                    break;
                }
                default: {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                }
            }
            if(v != 4 && v != 5 && v != 6 && v != 7) {
                arr_object[2] = "<init>";
            }
            String s = String.format((v == 4 || v == 5 || v == 6 || v == 7 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
            IllegalStateException illegalStateException0 = v == 4 || v == 5 || v == 6 || v == 7 ? new IllegalStateException(s) : new IllegalArgumentException(s);
            throw illegalStateException0;
        }

        @NotNull
        public List getErrors() {
            List list0 = this.e;
            if(list0 != null) {
                return list0;
            }
            PropagatedSignature.a(7);
            throw null;
        }

        @Nullable
        public KotlinType getReceiverType() {
            return this.b;
        }

        @NotNull
        public KotlinType getReturnType() {
            KotlinType kotlinType0 = this.a;
            if(kotlinType0 != null) {
                return kotlinType0;
            }
            PropagatedSignature.a(4);
            throw null;
        }

        @NotNull
        public List getTypeParameters() {
            List list0 = this.d;
            if(list0 != null) {
                return list0;
            }
            PropagatedSignature.a(6);
            throw null;
        }

        @NotNull
        public List getValueParameters() {
            List list0 = this.c;
            if(list0 != null) {
                return list0;
            }
            PropagatedSignature.a(5);
            throw null;
        }

        public boolean hasStableParameterNames() {
            return this.f;
        }
    }

    public static final SignaturePropagator DO_NOTHING;

    static {
        SignaturePropagator.DO_NOTHING = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    void reportSignatureErrors(@NotNull CallableMemberDescriptor arg1, @NotNull List arg2);

    @NotNull
    PropagatedSignature resolvePropagatedSignature(@NotNull JavaMethod arg1, @NotNull ClassDescriptor arg2, @NotNull KotlinType arg3, @Nullable KotlinType arg4, @NotNull List arg5, @NotNull List arg6);
}

