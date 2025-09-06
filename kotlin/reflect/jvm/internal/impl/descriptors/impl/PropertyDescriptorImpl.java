package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    public class CopyConfiguration {
        public DeclarationDescriptor a;
        public Modality b;
        public DescriptorVisibility c;
        public PropertyDescriptor d;
        public Kind e;
        public TypeSubstitution f;
        public boolean g;
        public final ReceiverParameterDescriptor h;
        public final Name i;
        public final KotlinType j;
        public final PropertyDescriptorImpl k;

        public CopyConfiguration() {
            this.a = propertyDescriptorImpl0.getContainingDeclaration();
            this.b = propertyDescriptorImpl0.getModality();
            this.c = propertyDescriptorImpl0.getVisibility();
            this.d = null;
            this.e = propertyDescriptorImpl0.getKind();
            this.f = TypeSubstitution.EMPTY;
            this.g = true;
            this.h = propertyDescriptorImpl0.r;
            this.i = propertyDescriptorImpl0.getName();
            this.j = propertyDescriptorImpl0.getType();
        }

        public static void a(int v) {
            IllegalStateException illegalStateException0;
            int v1;
            String s;
            switch(v) {
                case 1: 
                case 2: 
                case 3: 
                case 5: 
                case 7: 
                case 9: 
                case 11: 
                case 13: 
                case 14: 
                case 16: 
                case 17: 
                case 19: {
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
                case 5: 
                case 7: 
                case 9: 
                case 11: 
                case 13: 
                case 14: 
                case 16: 
                case 17: 
                case 19: {
                    v1 = 2;
                    break;
                }
                default: {
                    v1 = 3;
                }
            }
            Object[] arr_object = new Object[v1];
            switch(v) {
                case 4: {
                    arr_object[0] = "type";
                    break;
                }
                case 6: {
                    arr_object[0] = "modality";
                    break;
                }
                case 8: {
                    arr_object[0] = "visibility";
                    break;
                }
                case 10: {
                    arr_object[0] = "kind";
                    break;
                }
                case 12: {
                    arr_object[0] = "typeParameters";
                    break;
                }
                case 15: {
                    arr_object[0] = "substitution";
                    break;
                }
                case 18: {
                    arr_object[0] = "name";
                    break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 5: 
                case 7: 
                case 9: 
                case 11: 
                case 13: 
                case 14: 
                case 16: 
                case 17: 
                case 19: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                }
                default: {
                    arr_object[0] = "owner";
                }
            }
            switch(v) {
                case 1: {
                    arr_object[1] = "setOwner";
                    break;
                }
                case 2: {
                    arr_object[1] = "setOriginal";
                    break;
                }
                case 3: {
                    arr_object[1] = "setPreserveSourceElement";
                    break;
                }
                case 5: {
                    arr_object[1] = "setReturnType";
                    break;
                }
                case 7: {
                    arr_object[1] = "setModality";
                    break;
                }
                case 9: {
                    arr_object[1] = "setVisibility";
                    break;
                }
                case 11: {
                    arr_object[1] = "setKind";
                    break;
                }
                case 13: {
                    arr_object[1] = "setTypeParameters";
                    break;
                }
                case 14: {
                    arr_object[1] = "setDispatchReceiverParameter";
                    break;
                }
                case 16: {
                    arr_object[1] = "setSubstitution";
                    break;
                }
                case 17: {
                    arr_object[1] = "setCopyOverrides";
                    break;
                }
                case 19: {
                    arr_object[1] = "setName";
                    break;
                }
                default: {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                }
            }
            switch(v) {
                case 4: {
                    arr_object[2] = "setReturnType";
                    break;
                }
                case 6: {
                    arr_object[2] = "setModality";
                    break;
                }
                case 8: {
                    arr_object[2] = "setVisibility";
                    break;
                }
                case 10: {
                    arr_object[2] = "setKind";
                    break;
                }
                case 12: {
                    arr_object[2] = "setTypeParameters";
                    break;
                }
                case 15: {
                    arr_object[2] = "setSubstitution";
                    break;
                }
                case 18: {
                    arr_object[2] = "setName";
                    break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 5: 
                case 7: 
                case 9: 
                case 11: 
                case 13: 
                case 14: 
                case 16: 
                case 17: 
                case 19: {
                    break;
                }
                default: {
                    arr_object[2] = "setOwner";
                }
            }
            String s1 = String.format(s, arr_object);
            switch(v) {
                case 1: 
                case 2: 
                case 3: 
                case 5: 
                case 7: 
                case 9: 
                case 11: 
                case 13: 
                case 14: 
                case 16: 
                case 17: 
                case 19: {
                    illegalStateException0 = new IllegalStateException(s1);
                    break;
                }
                default: {
                    illegalStateException0 = new IllegalArgumentException(s1);
                }
            }
            throw illegalStateException0;
        }

        @Nullable
        public PropertyDescriptor build() {
            return PropertyDescriptorImpl.this.doSubstitute(this);
        }

        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z) {
            this.g = z;
            return this;
        }

        @NotNull
        public CopyConfiguration setKind(@NotNull Kind callableMemberDescriptor$Kind0) {
            if(callableMemberDescriptor$Kind0 != null) {
                this.e = callableMemberDescriptor$Kind0;
                return this;
            }
            CopyConfiguration.a(10);
            throw null;
        }

        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality0) {
            if(modality0 != null) {
                this.b = modality0;
                return this;
            }
            CopyConfiguration.a(6);
            throw null;
        }

        @NotNull
        public CopyConfiguration setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor0) {
            this.d = (PropertyDescriptor)callableMemberDescriptor0;
            return this;
        }

        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor0) {
            if(declarationDescriptor0 != null) {
                this.a = declarationDescriptor0;
                return this;
            }
            CopyConfiguration.a(0);
            throw null;
        }

        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution0) {
            if(typeSubstitution0 != null) {
                this.f = typeSubstitution0;
                return this;
            }
            CopyConfiguration.a(15);
            throw null;
        }

        @NotNull
        public CopyConfiguration setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
            if(descriptorVisibility0 != null) {
                this.c = descriptorVisibility0;
                return this;
            }
            CopyConfiguration.a(8);
            throw null;
        }
    }

    public final Modality f;
    public DescriptorVisibility g;
    public Collection h;
    public final PropertyDescriptor i;
    public final Kind j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public List q;
    public ReceiverParameterDescriptor r;
    public ReceiverParameterDescriptor s;
    public ArrayList t;
    public PropertyGetterDescriptorImpl u;
    public PropertySetterDescriptor v;
    public boolean w;
    public FieldDescriptor x;
    public FieldDescriptor y;

    public PropertyDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(modality0 != null) {
                    if(descriptorVisibility0 != null) {
                        if(name0 != null) {
                            if(callableMemberDescriptor$Kind0 != null) {
                                if(sourceElement0 != null) {
                                    super(declarationDescriptor0, annotations0, name0, null, z, sourceElement0);
                                    this.h = null;
                                    this.q = Collections.emptyList();
                                    this.f = modality0;
                                    this.g = descriptorVisibility0;
                                    PropertyDescriptor propertyDescriptor1 = propertyDescriptor0 == null ? this : propertyDescriptor0;
                                    this.i = propertyDescriptor1;
                                    this.j = callableMemberDescriptor$Kind0;
                                    this.k = z1;
                                    this.l = z2;
                                    this.m = z3;
                                    this.n = z4;
                                    this.o = z5;
                                    this.p = z6;
                                    return;
                                }
                                PropertyDescriptorImpl.a(6);
                                throw null;
                            }
                            PropertyDescriptorImpl.a(5);
                            throw null;
                        }
                        PropertyDescriptorImpl.a(4);
                        throw null;
                    }
                    PropertyDescriptorImpl.a(3);
                    throw null;
                }
                PropertyDescriptorImpl.a(2);
                throw null;
            }
            PropertyDescriptorImpl.a(1);
            throw null;
        }
        PropertyDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl
    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        if(v == 28 || v == 38 || v == 39 || v == 41 || v == 42) {
            s = "@NotNull method %s.%s must not return null";
        }
        else {
            switch(v) {
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    s = "@NotNull method %s.%s must not return null";
                    break;
                }
                default: {
                    s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
                }
            }
        }
        if(v == 28 || v == 38 || v == 39 || v == 41 || v == 42) {
            v1 = 2;
        }
        else {
            switch(v) {
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    v1 = 2;
                    break;
                }
                default: {
                    v1 = 3;
                }
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: 
            case 8: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: 
            case 9: {
                arr_object[0] = "modality";
                break;
            }
            case 4: 
            case 11: {
                arr_object[0] = "name";
                break;
            }
            case 14: {
                arr_object[0] = "inType";
                break;
            }
            case 15: 
            case 17: {
                arr_object[0] = "outType";
                break;
            }
            case 16: 
            case 18: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 19: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 3: 
            case 10: 
            case 20: {
                arr_object[0] = "visibility";
                break;
            }
            case 27: {
                arr_object[0] = "originalSubstitutor";
                break;
            }
            case 29: {
                arr_object[0] = "copyConfiguration";
                break;
            }
            case 30: {
                arr_object[0] = "substitutor";
                break;
            }
            case 0x1F: {
                arr_object[0] = "accessorDescriptor";
                break;
            }
            case 0x20: {
                arr_object[0] = "newOwner";
                break;
            }
            case 33: {
                arr_object[0] = "newModality";
                break;
            }
            case 34: {
                arr_object[0] = "newVisibility";
                break;
            }
            case 5: 
            case 12: 
            case 35: {
                arr_object[0] = "kind";
                break;
            }
            case 36: {
                arr_object[0] = "newName";
                break;
            }
            case 6: 
            case 13: 
            case 37: {
                arr_object[0] = "source";
                break;
            }
            case 40: {
                arr_object[0] = "overriddenDescriptors";
                break;
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 28: 
            case 38: 
            case 39: 
            case 41: 
            case 42: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 21: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 22: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 23: {
                arr_object[1] = "getReturnType";
                break;
            }
            case 24: {
                arr_object[1] = "getModality";
                break;
            }
            case 25: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 26: {
                arr_object[1] = "getAccessors";
                break;
            }
            case 28: {
                arr_object[1] = "getSourceToUseForCopy";
                break;
            }
            case 38: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 39: {
                arr_object[1] = "getKind";
                break;
            }
            case 41: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 42: {
                arr_object[1] = "copy";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
            }
        }
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arr_object[2] = "create";
                break;
            }
            case 14: {
                arr_object[2] = "setInType";
                break;
            }
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[2] = "setType";
                break;
            }
            case 20: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 27: {
                arr_object[2] = "substitute";
                break;
            }
            case 29: {
                arr_object[2] = "doSubstitute";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            }
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 40: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 28: 
            case 38: 
            case 39: 
            case 41: 
            case 42: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        if(v == 28 || v == 38 || v == 39 || v == 41 || v == 42) {
            illegalStateException0 = new IllegalStateException(s1);
        }
        else {
            switch(v) {
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    illegalStateException0 = new IllegalStateException(s1);
                    break;
                }
                default: {
                    illegalStateException0 = new IllegalArgumentException(s1);
                }
            }
        }
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitPropertyDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        PropertyDescriptor propertyDescriptor0 = this.newCopyBuilder().setOwner(declarationDescriptor0).setOriginal(null).setModality(modality0).setVisibility(descriptorVisibility0).setKind(callableMemberDescriptor$Kind0).setCopyOverrides(z).build();
        if(propertyDescriptor0 != null) {
            return propertyDescriptor0;
        }
        PropertyDescriptorImpl.a(42);
        throw null;
    }

    @NotNull
    public static PropertyDescriptorImpl create(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(modality0 != null) {
                    if(descriptorVisibility0 != null) {
                        if(name0 != null) {
                            if(callableMemberDescriptor$Kind0 != null) {
                                if(sourceElement0 != null) {
                                    return new PropertyDescriptorImpl(declarationDescriptor0, null, annotations0, modality0, descriptorVisibility0, z, name0, callableMemberDescriptor$Kind0, sourceElement0, z1, z2, z3, z4, z5, z6);
                                }
                                PropertyDescriptorImpl.a(13);
                                throw null;
                            }
                            PropertyDescriptorImpl.a(12);
                            throw null;
                        }
                        PropertyDescriptorImpl.a(11);
                        throw null;
                    }
                    PropertyDescriptorImpl.a(10);
                    throw null;
                }
                PropertyDescriptorImpl.a(9);
                throw null;
            }
            PropertyDescriptorImpl.a(8);
            throw null;
        }
        PropertyDescriptorImpl.a(7);
        throw null;
    }

    @NotNull
    public PropertyDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @Nullable PropertyDescriptor propertyDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull Name name0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(modality0 != null) {
                if(descriptorVisibility0 != null) {
                    if(callableMemberDescriptor$Kind0 != null) {
                        if(name0 != null) {
                            if(sourceElement0 != null) {
                                return new PropertyDescriptorImpl(declarationDescriptor0, propertyDescriptor0, this.getAnnotations(), modality0, descriptorVisibility0, this.isVar(), name0, callableMemberDescriptor$Kind0, sourceElement0, this.isLateInit(), this.isConst(), this.isExpect(), this.isActual(), this.isExternal(), this.isDelegated());
                            }
                            PropertyDescriptorImpl.a(37);
                            throw null;
                        }
                        PropertyDescriptorImpl.a(36);
                        throw null;
                    }
                    PropertyDescriptorImpl.a(35);
                    throw null;
                }
                PropertyDescriptorImpl.a(34);
                throw null;
            }
            PropertyDescriptorImpl.a(33);
            throw null;
        }
        PropertyDescriptorImpl.a(0x20);
        throw null;
    }

    @Nullable
    public PropertyDescriptor doSubstitute(@NotNull CopyConfiguration propertyDescriptorImpl$CopyConfiguration0) {
        PropertySetterDescriptorImpl propertySetterDescriptorImpl0;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl1;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl0;
        ReceiverParameterDescriptor receiverParameterDescriptor2;
        if(propertyDescriptorImpl$CopyConfiguration0 != null) {
            DeclarationDescriptor declarationDescriptor0 = propertyDescriptorImpl$CopyConfiguration0.a;
            Modality modality0 = propertyDescriptorImpl$CopyConfiguration0.b;
            DescriptorVisibility descriptorVisibility0 = propertyDescriptorImpl$CopyConfiguration0.c;
            PropertyDescriptor propertyDescriptor0 = propertyDescriptorImpl$CopyConfiguration0.d;
            Kind callableMemberDescriptor$Kind0 = propertyDescriptorImpl$CopyConfiguration0.e;
            SourceElement sourceElement0 = SourceElement.NO_SOURCE;
            if(sourceElement0 != null) {
                PropertyDescriptor propertyDescriptor1 = this.createSubstitutedCopy(declarationDescriptor0, modality0, descriptorVisibility0, propertyDescriptor0, callableMemberDescriptor$Kind0, propertyDescriptorImpl$CopyConfiguration0.i, sourceElement0);
                List list0 = this.getTypeParameters();
                ArrayList arrayList0 = new ArrayList(list0.size());
                TypeSubstitutor typeSubstitutor0 = DescriptorSubstitutor.substituteTypeParameters(list0, propertyDescriptorImpl$CopyConfiguration0.f, propertyDescriptor1, arrayList0);
                KotlinType kotlinType0 = propertyDescriptorImpl$CopyConfiguration0.j;
                KotlinType kotlinType1 = typeSubstitutor0.substitute(kotlinType0, Variance.OUT_VARIANCE);
                if(kotlinType1 == null) {
                    return null;
                }
                Variance variance0 = Variance.IN_VARIANCE;
                KotlinType kotlinType2 = typeSubstitutor0.substitute(kotlinType0, variance0);
                if(kotlinType2 != null) {
                    ((PropertyDescriptorImpl)propertyDescriptor1).setInType(kotlinType2);
                }
                ReceiverParameterDescriptor receiverParameterDescriptor0 = propertyDescriptorImpl$CopyConfiguration0.h;
                if(receiverParameterDescriptor0 == null) {
                    receiverParameterDescriptor2 = null;
                }
                else {
                    ReceiverParameterDescriptor receiverParameterDescriptor1 = receiverParameterDescriptor0.substitute(typeSubstitutor0);
                    if(receiverParameterDescriptor1 == null) {
                        return null;
                    }
                    receiverParameterDescriptor2 = receiverParameterDescriptor1;
                }
                ReceiverParameterDescriptor receiverParameterDescriptor3 = this.s;
                if(receiverParameterDescriptor3 == null) {
                    receiverParameterDescriptorImpl0 = null;
                }
                else {
                    KotlinType kotlinType3 = typeSubstitutor0.substitute(receiverParameterDescriptor3.getType(), variance0);
                    receiverParameterDescriptorImpl0 = kotlinType3 == null ? null : new ReceiverParameterDescriptorImpl(propertyDescriptor1, new ExtensionReceiver(propertyDescriptor1, kotlinType3, receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: this.q) {
                    ReceiverParameterDescriptor receiverParameterDescriptor4 = (ReceiverParameterDescriptor)object0;
                    KotlinType kotlinType4 = typeSubstitutor0.substitute(receiverParameterDescriptor4.getType(), Variance.IN_VARIANCE);
                    ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl1 = kotlinType4 == null ? null : new ReceiverParameterDescriptorImpl(propertyDescriptor1, new ContextReceiver(propertyDescriptor1, kotlinType4, ((ImplicitContextReceiver)receiverParameterDescriptor4.getValue()).getCustomLabelName(), receiverParameterDescriptor4.getValue()), receiverParameterDescriptor4.getAnnotations());
                    if(receiverParameterDescriptorImpl1 != null) {
                        arrayList1.add(receiverParameterDescriptorImpl1);
                    }
                }
                ((PropertyDescriptorImpl)propertyDescriptor1).setType(kotlinType1, arrayList0, receiverParameterDescriptor2, receiverParameterDescriptorImpl0, arrayList1);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = this.u;
                if(propertyGetterDescriptorImpl0 == null) {
                    propertyGetterDescriptorImpl1 = null;
                }
                else {
                    Annotations annotations0 = propertyGetterDescriptorImpl0.getAnnotations();
                    Modality modality1 = propertyDescriptorImpl$CopyConfiguration0.b;
                    DescriptorVisibility descriptorVisibility1 = this.u.getVisibility();
                    if(propertyDescriptorImpl$CopyConfiguration0.e == Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(descriptorVisibility1.normalize())) {
                        descriptorVisibility1 = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    propertyGetterDescriptorImpl1 = new PropertyGetterDescriptorImpl(propertyDescriptor1, annotations0, modality1, descriptorVisibility1, this.u.isDefault(), this.u.isExternal(), this.u.isInline(), propertyDescriptorImpl$CopyConfiguration0.e, (propertyDescriptorImpl$CopyConfiguration0.d == null ? null : propertyDescriptorImpl$CopyConfiguration0.d.getGetter()), SourceElement.NO_SOURCE);
                }
                if(propertyGetterDescriptorImpl1 != null) {
                    KotlinType kotlinType5 = this.u.getReturnType();
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = this.u;
                    if(propertyGetterDescriptorImpl2 != null) {
                        propertyGetterDescriptorImpl1.setInitialSignatureDescriptor((propertyGetterDescriptorImpl2.getInitialSignatureDescriptor() == null ? null : propertyGetterDescriptorImpl2.getInitialSignatureDescriptor().substitute(typeSubstitutor0)));
                        propertyGetterDescriptorImpl1.initialize((kotlinType5 == null ? null : typeSubstitutor0.substitute(kotlinType5, Variance.OUT_VARIANCE)));
                        goto label_64;
                    }
                    PropertyDescriptorImpl.a(0x1F);
                    throw null;
                }
            label_64:
                PropertySetterDescriptor propertySetterDescriptor0 = this.v;
                if(propertySetterDescriptor0 == null) {
                    propertySetterDescriptorImpl0 = null;
                }
                else {
                    Annotations annotations1 = propertySetterDescriptor0.getAnnotations();
                    Modality modality2 = propertyDescriptorImpl$CopyConfiguration0.b;
                    DescriptorVisibility descriptorVisibility2 = this.v.getVisibility();
                    if(propertyDescriptorImpl$CopyConfiguration0.e == Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(descriptorVisibility2.normalize())) {
                        descriptorVisibility2 = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    propertySetterDescriptorImpl0 = new PropertySetterDescriptorImpl(propertyDescriptor1, annotations1, modality2, descriptorVisibility2, this.v.isDefault(), this.v.isExternal(), this.v.isInline(), propertyDescriptorImpl$CopyConfiguration0.e, (propertyDescriptorImpl$CopyConfiguration0.d == null ? null : propertyDescriptorImpl$CopyConfiguration0.d.getSetter()), SourceElement.NO_SOURCE);
                }
                if(propertySetterDescriptorImpl0 != null) {
                    List list1 = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl0, this.v.getValueParameters(), typeSubstitutor0, false, false, null);
                    if(list1 == null) {
                        ((PropertyDescriptorImpl)propertyDescriptor1).setSetterProjectedOut(true);
                        list1 = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl0, DescriptorUtilsKt.getBuiltIns(propertyDescriptorImpl$CopyConfiguration0.a).getNothingType(), ((ValueParameterDescriptor)this.v.getValueParameters().get(0)).getAnnotations()));
                    }
                    if(list1.size() != 1) {
                        throw new IllegalStateException();
                    }
                    PropertySetterDescriptor propertySetterDescriptor1 = this.v;
                    if(propertySetterDescriptor1 != null) {
                        propertySetterDescriptorImpl0.setInitialSignatureDescriptor((propertySetterDescriptor1.getInitialSignatureDescriptor() == null ? null : propertySetterDescriptor1.getInitialSignatureDescriptor().substitute(typeSubstitutor0)));
                        propertySetterDescriptorImpl0.initialize(((ValueParameterDescriptor)list1.get(0)));
                        goto label_88;
                    }
                    PropertyDescriptorImpl.a(0x1F);
                    throw null;
                }
            label_88:
                ((PropertyDescriptorImpl)propertyDescriptor1).initialize(propertyGetterDescriptorImpl1, propertySetterDescriptorImpl0, (this.x == null ? null : new FieldDescriptorImpl(this.x.getAnnotations(), propertyDescriptor1)), (this.y == null ? null : new FieldDescriptorImpl(this.y.getAnnotations(), propertyDescriptor1)));
                if(propertyDescriptorImpl$CopyConfiguration0.g) {
                    SmartSet smartSet0 = SmartSet.create();
                    for(Object object1: this.getOverriddenDescriptors()) {
                        smartSet0.add(((PropertyDescriptor)object1).substitute(typeSubstitutor0));
                    }
                    ((PropertyDescriptorImpl)propertyDescriptor1).setOverriddenDescriptors(smartSet0);
                }
                if(this.isConst()) {
                    Function0 function00 = this.compileTimeInitializerFactory;
                    if(function00 != null) {
                        ((VariableDescriptorWithInitializerImpl)propertyDescriptor1).setCompileTimeInitializer(this.compileTimeInitializer, function00);
                    }
                }
                return propertyDescriptor1;
            }
            PropertyDescriptorImpl.a(28);
            throw null;
        }
        PropertyDescriptorImpl.a(29);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    public List getAccessors() {
        List list0 = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = this.u;
        if(propertyGetterDescriptorImpl0 != null) {
            ((ArrayList)list0).add(propertyGetterDescriptorImpl0);
        }
        PropertySetterDescriptor propertySetterDescriptor0 = this.v;
        if(propertySetterDescriptor0 != null) {
            ((ArrayList)list0).add(propertySetterDescriptor0);
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getBackingField() {
        return this.x;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getContextReceiverParameters() {
        List list0 = this.q;
        if(list0 != null) {
            return list0;
        }
        PropertyDescriptorImpl.a(22);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getDelegateField() {
        return this.y;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.r;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertyGetterDescriptor getGetter() {
        return this.getGetter();
    }

    @Nullable
    public PropertyGetterDescriptorImpl getGetter() {
        return this.u;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public Kind getKind() {
        Kind callableMemberDescriptor$Kind0 = this.j;
        if(callableMemberDescriptor$Kind0 != null) {
            return callableMemberDescriptor$Kind0;
        }
        PropertyDescriptorImpl.a(39);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality0 = this.f;
        if(modality0 != null) {
            return modality0;
        }
        PropertyDescriptorImpl.a(24);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor propertyDescriptor0 = this.i;
        PropertyDescriptor propertyDescriptor1 = propertyDescriptor0 == this ? this : propertyDescriptor0.getOriginal();
        if(propertyDescriptor1 != null) {
            return propertyDescriptor1;
        }
        PropertyDescriptorImpl.a(38);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    @NotNull
    public VariableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = this.h;
        if(collection0 == null) {
            collection0 = Collections.emptyList();
        }
        if(collection0 != null) {
            return collection0;
        }
        PropertyDescriptorImpl.a(41);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType kotlinType0 = this.getType();
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        PropertyDescriptorImpl.a(23);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getTypeParameters() {
        List list0 = this.t;
        if(list0 == null) {
            throw new IllegalStateException("typeParameters == null for " + this.toString());
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public Object getUserData(UserDataKey callableDescriptor$UserDataKey0) {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.g;
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        PropertyDescriptorImpl.a(25);
        throw null;
    }

    public void initialize(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0, @Nullable PropertySetterDescriptor propertySetterDescriptor0) {
        this.initialize(propertyGetterDescriptorImpl0, propertySetterDescriptor0, null, null);
    }

    public void initialize(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0, @Nullable PropertySetterDescriptor propertySetterDescriptor0, @Nullable FieldDescriptor fieldDescriptor0, @Nullable FieldDescriptor fieldDescriptor1) {
        this.u = propertyGetterDescriptorImpl0;
        this.v = propertySetterDescriptor0;
        this.x = fieldDescriptor0;
        this.y = fieldDescriptor1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.n;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.l;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.p;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.m;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.o;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.k;
    }

    public boolean isSetterProjectedOut() {
        return this.w;
    }

    @NotNull
    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration(this);
    }

    public void setInType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return;
        }
        PropertyDescriptorImpl.a(14);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection collection0) {
        if(collection0 != null) {
            this.h = collection0;
            return;
        }
        PropertyDescriptorImpl.a(40);
        throw null;
    }

    public void setSetterProjectedOut(boolean z) {
        this.w = z;
    }

    public void setType(@NotNull KotlinType kotlinType0, @NotNull List list0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor1, @NotNull List list1) {
        if(kotlinType0 != null) {
            if(list0 != null) {
                if(list1 != null) {
                    this.setOutType(kotlinType0);
                    this.t = new ArrayList(list0);
                    this.s = receiverParameterDescriptor1;
                    this.r = receiverParameterDescriptor0;
                    this.q = list1;
                    return;
                }
                PropertyDescriptorImpl.a(19);
                throw null;
            }
            PropertyDescriptorImpl.a(18);
            throw null;
        }
        PropertyDescriptorImpl.a(17);
        throw null;
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
        if(descriptorVisibility0 != null) {
            this.g = descriptorVisibility0;
            return;
        }
        PropertyDescriptorImpl.a(20);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return typeSubstitutor0.isEmpty() ? this : this.newCopyBuilder().setSubstitution(typeSubstitutor0.getSubstitution()).setOriginal(this.getOriginal()).build();
        }
        PropertyDescriptorImpl.a(27);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public VariableDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }
}

