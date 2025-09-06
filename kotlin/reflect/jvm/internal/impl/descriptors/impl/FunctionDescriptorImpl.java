package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {
    public class CopyConfiguration implements CopyBuilder {
        public boolean a;
        public List b;
        public Annotations c;
        protected boolean copyOverrides;
        public boolean d;
        @Nullable
        protected ReceiverParameterDescriptor dispatchReceiverParameter;
        protected boolean dropOriginalInContainingParts;
        public final LinkedHashMap e;
        public Boolean f;
        public final FunctionDescriptorImpl g;
        protected boolean justForTypeSubstitution;
        @NotNull
        protected Kind kind;
        @Nullable
        protected Name name;
        @NotNull
        protected List newContextReceiverParameters;
        @Nullable
        protected ReceiverParameterDescriptor newExtensionReceiverParameter;
        @NotNull
        protected Modality newModality;
        @NotNull
        protected DeclarationDescriptor newOwner;
        @NotNull
        protected KotlinType newReturnType;
        @NotNull
        protected List newValueParameterDescriptors;
        @NotNull
        protected DescriptorVisibility newVisibility;
        @Nullable
        protected FunctionDescriptor original;
        protected boolean preserveSourceElement;
        protected boolean signatureChange;
        @NotNull
        protected TypeSubstitution substitution;

        public CopyConfiguration(@NotNull TypeSubstitution typeSubstitution0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull List list0, @NotNull List list1, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @NotNull KotlinType kotlinType0, @Nullable Name name0) {
            if(typeSubstitution0 != null) {
                if(declarationDescriptor0 != null) {
                    if(modality0 != null) {
                        if(descriptorVisibility0 != null) {
                            if(callableMemberDescriptor$Kind0 != null) {
                                if(list0 != null) {
                                    if(list1 != null) {
                                        if(kotlinType0 != null) {
                                            this.g = functionDescriptorImpl0;
                                            super();
                                            this.original = null;
                                            this.dispatchReceiverParameter = functionDescriptorImpl0.j;
                                            this.copyOverrides = true;
                                            this.signatureChange = false;
                                            this.preserveSourceElement = false;
                                            this.dropOriginalInContainingParts = false;
                                            this.a = functionDescriptorImpl0.isHiddenToOvercomeSignatureClash();
                                            this.b = null;
                                            this.c = null;
                                            this.d = functionDescriptorImpl0.isHiddenForResolutionEverywhereBesideSupercalls();
                                            this.e = new LinkedHashMap();
                                            this.f = null;
                                            this.justForTypeSubstitution = false;
                                            this.substitution = typeSubstitution0;
                                            this.newOwner = declarationDescriptor0;
                                            this.newModality = modality0;
                                            this.newVisibility = descriptorVisibility0;
                                            this.kind = callableMemberDescriptor$Kind0;
                                            this.newValueParameterDescriptors = list0;
                                            this.newContextReceiverParameters = list1;
                                            this.newExtensionReceiverParameter = receiverParameterDescriptor0;
                                            this.newReturnType = kotlinType0;
                                            this.name = name0;
                                            return;
                                        }
                                        CopyConfiguration.a(7);
                                        throw null;
                                    }
                                    CopyConfiguration.a(6);
                                    throw null;
                                }
                                CopyConfiguration.a(5);
                                throw null;
                            }
                            CopyConfiguration.a(4);
                            throw null;
                        }
                        CopyConfiguration.a(3);
                        throw null;
                    }
                    CopyConfiguration.a(2);
                    throw null;
                }
                CopyConfiguration.a(1);
                throw null;
            }
            CopyConfiguration.a(0);
            throw null;
        }

        public static void a(int v) {
            IllegalArgumentException illegalArgumentException0;
            int v1;
            String s;
            switch(v) {
                case 9: 
                case 11: 
                case 13: 
                case 15: 
                case 16: 
                case 18: 
                case 20: 
                case 22: 
                case 24: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 36: 
                case 38: 
                case 40: 
                case 41: 
                case 42: {
                    s = "@NotNull method %s.%s must not return null";
                    break;
                }
                default: {
                    s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
                }
            }
            switch(v) {
                case 9: 
                case 11: 
                case 13: 
                case 15: 
                case 16: 
                case 18: 
                case 20: 
                case 22: 
                case 24: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 36: 
                case 38: 
                case 40: 
                case 41: 
                case 42: {
                    v1 = 2;
                    break;
                }
                default: {
                    v1 = 3;
                }
            }
            Object[] arr_object = new Object[v1];
            switch(v) {
                case 1: {
                    arr_object[0] = "newOwner";
                    break;
                }
                case 2: {
                    arr_object[0] = "newModality";
                    break;
                }
                case 3: {
                    arr_object[0] = "newVisibility";
                    break;
                }
                case 5: {
                    arr_object[0] = "newValueParameterDescriptors";
                    break;
                }
                case 6: {
                    arr_object[0] = "newContextReceiverParameters";
                    break;
                }
                case 7: {
                    arr_object[0] = "newReturnType";
                    break;
                }
                case 8: {
                    arr_object[0] = "owner";
                    break;
                }
                case 10: {
                    arr_object[0] = "modality";
                    break;
                }
                case 12: {
                    arr_object[0] = "visibility";
                    break;
                }
                case 4: 
                case 14: {
                    arr_object[0] = "kind";
                    break;
                }
                case 17: {
                    arr_object[0] = "name";
                    break;
                }
                case 19: 
                case 21: {
                    arr_object[0] = "parameters";
                    break;
                }
                case 23: {
                    arr_object[0] = "type";
                    break;
                }
                case 25: {
                    arr_object[0] = "contextReceiverParameters";
                    break;
                }
                case 35: {
                    arr_object[0] = "additionalAnnotations";
                    break;
                }
                case 39: {
                    arr_object[0] = "userDataKey";
                    break;
                }
                case 9: 
                case 11: 
                case 13: 
                case 15: 
                case 16: 
                case 18: 
                case 20: 
                case 22: 
                case 24: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 36: 
                case 38: 
                case 40: 
                case 41: 
                case 42: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                }
                default: {
                    arr_object[0] = "substitution";
                }
            }
            switch(v) {
                case 9: {
                    arr_object[1] = "setOwner";
                    break;
                }
                case 11: {
                    arr_object[1] = "setModality";
                    break;
                }
                case 13: {
                    arr_object[1] = "setVisibility";
                    break;
                }
                case 15: {
                    arr_object[1] = "setKind";
                    break;
                }
                case 16: {
                    arr_object[1] = "setCopyOverrides";
                    break;
                }
                case 18: {
                    arr_object[1] = "setName";
                    break;
                }
                case 20: {
                    arr_object[1] = "setValueParameters";
                    break;
                }
                case 22: {
                    arr_object[1] = "setTypeParameters";
                    break;
                }
                case 24: {
                    arr_object[1] = "setReturnType";
                    break;
                }
                case 26: {
                    arr_object[1] = "setContextReceiverParameters";
                    break;
                }
                case 27: {
                    arr_object[1] = "setExtensionReceiverParameter";
                    break;
                }
                case 28: {
                    arr_object[1] = "setDispatchReceiverParameter";
                    break;
                }
                case 29: {
                    arr_object[1] = "setOriginal";
                    break;
                }
                case 30: {
                    arr_object[1] = "setSignatureChange";
                    break;
                }
                case 0x1F: {
                    arr_object[1] = "setPreserveSourceElement";
                    break;
                }
                case 0x20: {
                    arr_object[1] = "setDropOriginalInContainingParts";
                    break;
                }
                case 33: {
                    arr_object[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                }
                case 34: {
                    arr_object[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                }
                case 36: {
                    arr_object[1] = "setAdditionalAnnotations";
                    break;
                }
                case 38: {
                    arr_object[1] = "setSubstitution";
                    break;
                }
                case 40: {
                    arr_object[1] = "putUserData";
                    break;
                }
                case 41: {
                    arr_object[1] = "getSubstitution";
                    break;
                }
                case 42: {
                    arr_object[1] = "setJustForTypeSubstitution";
                    break;
                }
                default: {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                }
            }
            switch(v) {
                case 8: {
                    arr_object[2] = "setOwner";
                    break;
                }
                case 10: {
                    arr_object[2] = "setModality";
                    break;
                }
                case 12: {
                    arr_object[2] = "setVisibility";
                    break;
                }
                case 14: {
                    arr_object[2] = "setKind";
                    break;
                }
                case 17: {
                    arr_object[2] = "setName";
                    break;
                }
                case 19: {
                    arr_object[2] = "setValueParameters";
                    break;
                }
                case 21: {
                    arr_object[2] = "setTypeParameters";
                    break;
                }
                case 23: {
                    arr_object[2] = "setReturnType";
                    break;
                }
                case 25: {
                    arr_object[2] = "setContextReceiverParameters";
                    break;
                }
                case 35: {
                    arr_object[2] = "setAdditionalAnnotations";
                    break;
                }
                case 37: {
                    arr_object[2] = "setSubstitution";
                    break;
                }
                case 39: {
                    arr_object[2] = "putUserData";
                    break;
                }
                case 9: 
                case 11: 
                case 13: 
                case 15: 
                case 16: 
                case 18: 
                case 20: 
                case 22: 
                case 24: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 36: 
                case 38: 
                case 40: 
                case 41: 
                case 42: {
                    break;
                }
                default: {
                    arr_object[2] = "<init>";
                }
            }
            String s1 = String.format(s, arr_object);
            switch(v) {
                case 9: 
                case 11: 
                case 13: 
                case 15: 
                case 16: 
                case 18: 
                case 20: 
                case 22: 
                case 24: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 36: 
                case 38: 
                case 40: 
                case 41: 
                case 42: {
                    illegalArgumentException0 = new IllegalStateException(s1);
                    break;
                }
                default: {
                    illegalArgumentException0 = new IllegalArgumentException(s1);
                }
            }
            throw illegalArgumentException0;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @Nullable
        public FunctionDescriptor build() {
            return this.g.doSubstitute(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder putUserData(@NotNull UserDataKey callableDescriptor$UserDataKey0, Object object0) {
            if(callableDescriptor$UserDataKey0 != null) {
                this.e.put(callableDescriptor$UserDataKey0, object0);
                return this;
            }
            CopyConfiguration.a(39);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setAdditionalAnnotations(@NotNull Annotations annotations0) {
            return this.setAdditionalAnnotations(annotations0);
        }

        @NotNull
        public CopyConfiguration setAdditionalAnnotations(@NotNull Annotations annotations0) {
            if(annotations0 != null) {
                this.c = annotations0;
                return this;
            }
            CopyConfiguration.a(35);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setCopyOverrides(boolean z) {
            return this.setCopyOverrides(z);
        }

        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0) {
            return this.setDispatchReceiverParameter(receiverParameterDescriptor0);
        }

        @NotNull
        public CopyConfiguration setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0) {
            this.dispatchReceiverParameter = receiverParameterDescriptor0;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setDropOriginalInContainingParts() {
            return this.setDropOriginalInContainingParts();
        }

        @NotNull
        public CopyConfiguration setDropOriginalInContainingParts() {
            this.dropOriginalInContainingParts = true;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setExtensionReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0) {
            return this.setExtensionReceiverParameter(receiverParameterDescriptor0);
        }

        @NotNull
        public CopyConfiguration setExtensionReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0) {
            this.newExtensionReceiverParameter = receiverParameterDescriptor0;
            return this;
        }

        public CopyConfiguration setHasSynthesizedParameterNames(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setHiddenForResolutionEverywhereBesideSupercalls() {
            return this.setHiddenForResolutionEverywhereBesideSupercalls();
        }

        @NotNull
        public CopyConfiguration setHiddenForResolutionEverywhereBesideSupercalls() {
            this.d = true;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setHiddenToOvercomeSignatureClash() {
            return this.setHiddenToOvercomeSignatureClash();
        }

        @NotNull
        public CopyConfiguration setHiddenToOvercomeSignatureClash() {
            this.a = true;
            return this;
        }

        @NotNull
        public CopyConfiguration setJustForTypeSubstitution(boolean z) {
            this.justForTypeSubstitution = z;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setKind(@NotNull Kind callableMemberDescriptor$Kind0) {
            return this.setKind(callableMemberDescriptor$Kind0);
        }

        @NotNull
        public CopyConfiguration setKind(@NotNull Kind callableMemberDescriptor$Kind0) {
            if(callableMemberDescriptor$Kind0 != null) {
                this.kind = callableMemberDescriptor$Kind0;
                return this;
            }
            CopyConfiguration.a(14);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setModality(@NotNull Modality modality0) {
            return this.setModality(modality0);
        }

        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality0) {
            if(modality0 != null) {
                this.newModality = modality0;
                return this;
            }
            CopyConfiguration.a(10);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setName(@NotNull Name name0) {
            return this.setName(name0);
        }

        @NotNull
        public CopyConfiguration setName(@NotNull Name name0) {
            if(name0 != null) {
                this.name = name0;
                return this;
            }
            CopyConfiguration.a(17);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor0) {
            return this.setOriginal(callableMemberDescriptor0);
        }

        @NotNull
        public CopyConfiguration setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor0) {
            this.original = (FunctionDescriptor)callableMemberDescriptor0;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setOwner(@NotNull DeclarationDescriptor declarationDescriptor0) {
            return this.setOwner(declarationDescriptor0);
        }

        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor0) {
            if(declarationDescriptor0 != null) {
                this.newOwner = declarationDescriptor0;
                return this;
            }
            CopyConfiguration.a(8);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setPreserveSourceElement() {
            return this.setPreserveSourceElement();
        }

        @NotNull
        public CopyConfiguration setPreserveSourceElement() {
            this.preserveSourceElement = true;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setReturnType(@NotNull KotlinType kotlinType0) {
            return this.setReturnType(kotlinType0);
        }

        @NotNull
        public CopyConfiguration setReturnType(@NotNull KotlinType kotlinType0) {
            if(kotlinType0 != null) {
                this.newReturnType = kotlinType0;
                return this;
            }
            CopyConfiguration.a(23);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setSignatureChange() {
            return this.setSignatureChange();
        }

        @NotNull
        public CopyConfiguration setSignatureChange() {
            this.signatureChange = true;
            return this;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setSubstitution(@NotNull TypeSubstitution typeSubstitution0) {
            return this.setSubstitution(typeSubstitution0);
        }

        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution0) {
            if(typeSubstitution0 != null) {
                this.substitution = typeSubstitution0;
                return this;
            }
            CopyConfiguration.a(37);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setTypeParameters(@NotNull List list0) {
            return this.setTypeParameters(list0);
        }

        @NotNull
        public CopyConfiguration setTypeParameters(@NotNull List list0) {
            if(list0 != null) {
                this.b = list0;
                return this;
            }
            CopyConfiguration.a(21);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setValueParameters(@NotNull List list0) {
            return this.setValueParameters(list0);
        }

        @NotNull
        public CopyConfiguration setValueParameters(@NotNull List list0) {
            if(list0 != null) {
                this.newValueParameterDescriptors = list0;
                return this;
            }
            CopyConfiguration.a(19);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
        @NotNull
        public CopyBuilder setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
            return this.setVisibility(descriptorVisibility0);
        }

        @NotNull
        public CopyConfiguration setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
            if(descriptorVisibility0 != null) {
                this.newVisibility = descriptorVisibility0;
                return this;
            }
            CopyConfiguration.a(12);
            throw null;
        }
    }

    public final FunctionDescriptor A;
    public final Kind B;
    public FunctionDescriptor C;
    public List e;
    public List f;
    public KotlinType g;
    public List h;
    public ReceiverParameterDescriptor i;
    public ReceiverParameterDescriptor j;
    public Modality k;
    public DescriptorVisibility l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    protected Map userDataMap;
    public boolean v;
    public boolean w;
    public boolean x;
    public Collection y;
    public volatile k z;

    public FunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(callableMemberDescriptor$Kind0 != null) {
                        if(sourceElement0 != null) {
                            super(declarationDescriptor0, annotations0, name0, sourceElement0);
                            this.l = DescriptorVisibilities.UNKNOWN;
                            this.m = false;
                            this.n = false;
                            this.o = false;
                            this.p = false;
                            this.q = false;
                            this.r = false;
                            this.s = false;
                            this.t = false;
                            this.u = false;
                            this.v = false;
                            this.w = true;
                            this.x = false;
                            this.y = null;
                            this.z = null;
                            this.C = null;
                            this.userDataMap = null;
                            if(functionDescriptor0 == null) {
                                functionDescriptor0 = this;
                            }
                            this.A = functionDescriptor0;
                            this.B = callableMemberDescriptor$Kind0;
                            return;
                        }
                        FunctionDescriptorImpl.a(4);
                        throw null;
                    }
                    FunctionDescriptorImpl.a(3);
                    throw null;
                }
                FunctionDescriptorImpl.a(2);
                throw null;
            }
            FunctionDescriptorImpl.a(1);
            throw null;
        }
        FunctionDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "kind";
                break;
            }
            case 4: {
                arr_object[0] = "source";
                break;
            }
            case 5: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 6: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 8: 
            case 10: {
                arr_object[0] = "visibility";
                break;
            }
            case 11: {
                arr_object[0] = "unsubstitutedReturnType";
                break;
            }
            case 12: {
                arr_object[0] = "extensionReceiverParameter";
                break;
            }
            case 17: {
                arr_object[0] = "overriddenDescriptors";
                break;
            }
            case 22: {
                arr_object[0] = "originalSubstitutor";
                break;
            }
            case 25: {
                arr_object[0] = "configuration";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 7: 
            case 28: 
            case 30: {
                arr_object[0] = "unsubstitutedValueParameters";
                break;
            }
            case 24: 
            case 29: 
            case 0x1F: {
                arr_object[0] = "substitutor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 9: {
                arr_object[1] = "initialize";
                break;
            }
            case 13: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 14: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 15: {
                arr_object[1] = "getModality";
                break;
            }
            case 16: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 18: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 19: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 20: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 21: {
                arr_object[1] = "getKind";
                break;
            }
            case 23: {
                arr_object[1] = "newCopyBuilder";
                break;
            }
            case 26: {
                arr_object[1] = "copy";
                break;
            }
            case 27: {
                arr_object[1] = "getSourceToUseForCopy";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
            }
        }
        switch(v) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arr_object[2] = "initialize";
                break;
            }
            case 10: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 11: {
                arr_object[2] = "setReturnType";
                break;
            }
            case 12: {
                arr_object[2] = "setExtensionReceiverParameter";
                break;
            }
            case 17: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            case 22: {
                arr_object[2] = "substitute";
                break;
            }
            case 24: {
                arr_object[2] = "newCopyBuilder";
                break;
            }
            case 25: {
                arr_object[2] = "doSubstitute";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                break;
            }
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: {
                arr_object[2] = "getSubstitutedValueParameters";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitFunctionDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        FunctionDescriptor functionDescriptor0 = this.newCopyBuilder().setOwner(declarationDescriptor0).setModality(modality0).setVisibility(descriptorVisibility0).setKind(callableMemberDescriptor$Kind0).setCopyOverrides(z).build();
        if(functionDescriptor0 != null) {
            return functionDescriptor0;
        }
        FunctionDescriptorImpl.a(26);
        throw null;
    }

    @NotNull
    public abstract FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor arg1, @Nullable FunctionDescriptor arg2, @NotNull Kind arg3, @Nullable Name arg4, @NotNull Annotations arg5, @NotNull SourceElement arg6);

    @Nullable
    public FunctionDescriptor doSubstitute(@NotNull CopyConfiguration functionDescriptorImpl$CopyConfiguration0) {
        ReceiverParameterDescriptor receiverParameterDescriptor3;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl1;
        if(functionDescriptorImpl$CopyConfiguration0 != null) {
            boolean[] arr_z = new boolean[1];
            Annotations annotations0 = functionDescriptorImpl$CopyConfiguration0.c == null ? this.getAnnotations() : AnnotationsKt.composeAnnotations(this.getAnnotations(), functionDescriptorImpl$CopyConfiguration0.c);
            DeclarationDescriptor declarationDescriptor0 = functionDescriptorImpl$CopyConfiguration0.newOwner;
            FunctionDescriptor functionDescriptor0 = functionDescriptorImpl$CopyConfiguration0.original;
            Kind callableMemberDescriptor$Kind0 = functionDescriptorImpl$CopyConfiguration0.kind;
            Name name0 = functionDescriptorImpl$CopyConfiguration0.name;
            SourceElement sourceElement0 = functionDescriptorImpl$CopyConfiguration0.preserveSourceElement ? (functionDescriptor0 == null ? this.getOriginal() : functionDescriptor0).getSource() : SourceElement.NO_SOURCE;
            if(sourceElement0 != null) {
                FunctionDescriptor functionDescriptor1 = this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
                List list0 = functionDescriptorImpl$CopyConfiguration0.b == null ? this.getTypeParameters() : functionDescriptorImpl$CopyConfiguration0.b;
                arr_z[0] |= !list0.isEmpty();
                ArrayList arrayList0 = new ArrayList(list0.size());
                TypeSubstitutor typeSubstitutor0 = DescriptorSubstitutor.substituteTypeParameters(list0, functionDescriptorImpl$CopyConfiguration0.substitution, functionDescriptor1, arrayList0, arr_z);
                if(typeSubstitutor0 == null) {
                    return null;
                }
                ArrayList arrayList1 = new ArrayList();
                if(!functionDescriptorImpl$CopyConfiguration0.newContextReceiverParameters.isEmpty()) {
                    int v = 0;
                    for(Object object0: functionDescriptorImpl$CopyConfiguration0.newContextReceiverParameters) {
                        KotlinType kotlinType0 = typeSubstitutor0.substitute(((ReceiverParameterDescriptor)object0).getType(), Variance.IN_VARIANCE);
                        if(kotlinType0 == null) {
                            return null;
                        }
                        arrayList1.add(DescriptorFactory.createContextReceiverParameterForCallable(functionDescriptor1, kotlinType0, ((ImplicitContextReceiver)((ReceiverParameterDescriptor)object0).getValue()).getCustomLabelName(), ((ReceiverParameterDescriptor)object0).getAnnotations(), v));
                        arr_z[0] |= kotlinType0 != ((ReceiverParameterDescriptor)object0).getType();
                        ++v;
                    }
                }
                ReceiverParameterDescriptor receiverParameterDescriptor0 = functionDescriptorImpl$CopyConfiguration0.newExtensionReceiverParameter;
                if(receiverParameterDescriptor0 == null) {
                    receiverParameterDescriptorImpl1 = null;
                }
                else {
                    KotlinType kotlinType1 = typeSubstitutor0.substitute(receiverParameterDescriptor0.getType(), Variance.IN_VARIANCE);
                    if(kotlinType1 == null) {
                        return null;
                    }
                    ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl0 = new ReceiverParameterDescriptorImpl(functionDescriptor1, new ExtensionReceiver(functionDescriptor1, kotlinType1, functionDescriptorImpl$CopyConfiguration0.newExtensionReceiverParameter.getValue()), functionDescriptorImpl$CopyConfiguration0.newExtensionReceiverParameter.getAnnotations());
                    boolean z = arr_z[0];
                    arr_z[0] = kotlinType1 != functionDescriptorImpl$CopyConfiguration0.newExtensionReceiverParameter.getType() | z;
                    receiverParameterDescriptorImpl1 = receiverParameterDescriptorImpl0;
                }
                ReceiverParameterDescriptor receiverParameterDescriptor1 = functionDescriptorImpl$CopyConfiguration0.dispatchReceiverParameter;
                if(receiverParameterDescriptor1 == null) {
                    receiverParameterDescriptor3 = null;
                }
                else {
                    ReceiverParameterDescriptor receiverParameterDescriptor2 = receiverParameterDescriptor1.substitute(typeSubstitutor0);
                    if(receiverParameterDescriptor2 == null) {
                        return null;
                    }
                    arr_z[0] |= receiverParameterDescriptor2 != functionDescriptorImpl$CopyConfiguration0.dispatchReceiverParameter;
                    receiverParameterDescriptor3 = receiverParameterDescriptor2;
                }
                List list1 = FunctionDescriptorImpl.getSubstitutedValueParameters(functionDescriptor1, functionDescriptorImpl$CopyConfiguration0.newValueParameterDescriptors, typeSubstitutor0, functionDescriptorImpl$CopyConfiguration0.dropOriginalInContainingParts, functionDescriptorImpl$CopyConfiguration0.preserveSourceElement, arr_z);
                if(list1 == null) {
                    return null;
                }
                KotlinType kotlinType2 = typeSubstitutor0.substitute(functionDescriptorImpl$CopyConfiguration0.newReturnType, Variance.OUT_VARIANCE);
                if(kotlinType2 == null) {
                    return null;
                }
                int v1 = arr_z[0] | kotlinType2 != functionDescriptorImpl$CopyConfiguration0.newReturnType;
                arr_z[0] = v1;
                if(v1 == 0 && functionDescriptorImpl$CopyConfiguration0.justForTypeSubstitution) {
                    return this;
                }
                ((FunctionDescriptorImpl)functionDescriptor1).initialize(receiverParameterDescriptorImpl1, receiverParameterDescriptor3, arrayList1, arrayList0, list1, kotlinType2, functionDescriptorImpl$CopyConfiguration0.newModality, functionDescriptorImpl$CopyConfiguration0.newVisibility);
                ((FunctionDescriptorImpl)functionDescriptor1).setOperator(this.m);
                ((FunctionDescriptorImpl)functionDescriptor1).setInfix(this.n);
                ((FunctionDescriptorImpl)functionDescriptor1).setExternal(this.o);
                ((FunctionDescriptorImpl)functionDescriptor1).setInline(this.p);
                ((FunctionDescriptorImpl)functionDescriptor1).setTailrec(this.q);
                ((FunctionDescriptorImpl)functionDescriptor1).setSuspend(this.v);
                ((FunctionDescriptorImpl)functionDescriptor1).setExpect(this.r);
                ((FunctionDescriptorImpl)functionDescriptor1).setActual(this.s);
                ((FunctionDescriptorImpl)functionDescriptor1).setHasStableParameterNames(this.w);
                functionDescriptor1.t = functionDescriptorImpl$CopyConfiguration0.a;
                functionDescriptor1.u = functionDescriptorImpl$CopyConfiguration0.d;
                ((FunctionDescriptorImpl)functionDescriptor1).setHasSynthesizedParameterNames((functionDescriptorImpl$CopyConfiguration0.f == null ? this.x : functionDescriptorImpl$CopyConfiguration0.f.booleanValue()));
                if(!functionDescriptorImpl$CopyConfiguration0.e.isEmpty() || this.userDataMap != null) {
                    LinkedHashMap linkedHashMap0 = functionDescriptorImpl$CopyConfiguration0.e;
                    Map map0 = this.userDataMap;
                    if(map0 != null) {
                        for(Object object1: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(!linkedHashMap0.containsKey(map$Entry0.getKey())) {
                                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                            }
                        }
                    }
                    if(linkedHashMap0.size() == 1) {
                        Object object2 = linkedHashMap0.keySet().iterator().next();
                        Object object3 = linkedHashMap0.values().iterator().next();
                        functionDescriptor1.userDataMap = Collections.singletonMap(object2, object3);
                    }
                    else {
                        functionDescriptor1.userDataMap = linkedHashMap0;
                    }
                }
                if(functionDescriptorImpl$CopyConfiguration0.signatureChange || this.getInitialSignatureDescriptor() != null) {
                    FunctionDescriptor functionDescriptor2 = this.getInitialSignatureDescriptor() == null ? this : this.getInitialSignatureDescriptor();
                    functionDescriptor1.C = functionDescriptor2.substitute(typeSubstitutor0);
                }
                if(functionDescriptorImpl$CopyConfiguration0.copyOverrides && !this.getOriginal().getOverriddenDescriptors().isEmpty()) {
                    if(functionDescriptorImpl$CopyConfiguration0.substitution.isEmpty()) {
                        k k0 = this.z;
                        if(k0 != null) {
                            functionDescriptor1.z = k0;
                            return functionDescriptor1;
                        }
                        ((FunctionDescriptorImpl)functionDescriptor1).setOverriddenDescriptors(this.getOverriddenDescriptors());
                        return functionDescriptor1;
                    }
                    functionDescriptor1.z = new k(this, typeSubstitutor0);
                }
                return functionDescriptor1;
            }
            FunctionDescriptorImpl.a(27);
            throw null;
        }
        FunctionDescriptorImpl.a(25);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getContextReceiverParameters() {
        List list0 = this.h;
        if(list0 != null) {
            return list0;
        }
        FunctionDescriptorImpl.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.j;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.i;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.C;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public Kind getKind() {
        Kind callableMemberDescriptor$Kind0 = this.B;
        if(callableMemberDescriptor$Kind0 != null) {
            return callableMemberDescriptor$Kind0;
        }
        FunctionDescriptorImpl.a(21);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality0 = this.k;
        if(modality0 != null) {
            return modality0;
        }
        FunctionDescriptorImpl.a(15);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public FunctionDescriptor getOriginal() {
        FunctionDescriptor functionDescriptor0 = this.A;
        FunctionDescriptor functionDescriptor1 = functionDescriptor0 == this ? this : functionDescriptor0.getOriginal();
        if(functionDescriptor1 != null) {
            return functionDescriptor1;
        }
        FunctionDescriptorImpl.a(20);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        k k0 = this.z;
        if(k0 != null) {
            this.y = (Collection)k0.invoke();
            this.z = null;
        }
        Collection collection0 = this.y;
        if(collection0 == null) {
            collection0 = Collections.emptyList();
        }
        if(collection0 != null) {
            return collection0;
        }
        FunctionDescriptorImpl.a(14);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.g;
    }

    @Nullable
    public static List getSubstitutedValueParameters(FunctionDescriptor functionDescriptor0, @NotNull List list0, @NotNull TypeSubstitutor typeSubstitutor0) {
        if(list0 != null) {
            if(typeSubstitutor0 != null) {
                return FunctionDescriptorImpl.getSubstitutedValueParameters(functionDescriptor0, list0, typeSubstitutor0, false, false, null);
            }
            FunctionDescriptorImpl.a(29);
            throw null;
        }
        FunctionDescriptorImpl.a(28);
        throw null;
    }

    @Nullable
    public static List getSubstitutedValueParameters(FunctionDescriptor functionDescriptor0, @NotNull List list0, @NotNull TypeSubstitutor typeSubstitutor0, boolean z, boolean z1, @Nullable boolean[] arr_z) {
        if(list0 != null) {
            if(typeSubstitutor0 != null) {
                List list1 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)object0;
                    KotlinType kotlinType0 = typeSubstitutor0.substitute(valueParameterDescriptor0.getType(), Variance.IN_VARIANCE);
                    KotlinType kotlinType1 = valueParameterDescriptor0.getVarargElementType();
                    KotlinType kotlinType2 = kotlinType1 == null ? null : typeSubstitutor0.substitute(kotlinType1, Variance.IN_VARIANCE);
                    if(kotlinType0 == null) {
                        return null;
                    }
                    if((kotlinType0 != valueParameterDescriptor0.getType() || kotlinType1 != kotlinType2) && arr_z != null) {
                        arr_z[0] = true;
                    }
                    e e0 = valueParameterDescriptor0 instanceof WithDestructuringDeclaration ? new e(((WithDestructuringDeclaration)valueParameterDescriptor0).getDestructuringVariables(), 2) : null;
                    ((ArrayList)list1).add(ValueParameterDescriptorImpl.createWithDestructuringDeclarations(functionDescriptor0, (z ? null : valueParameterDescriptor0), valueParameterDescriptor0.getIndex(), valueParameterDescriptor0.getAnnotations(), valueParameterDescriptor0.getName(), kotlinType0, valueParameterDescriptor0.declaresDefaultValue(), valueParameterDescriptor0.isCrossinline(), valueParameterDescriptor0.isNoinline(), kotlinType2, (z1 ? valueParameterDescriptor0.getSource() : SourceElement.NO_SOURCE), e0));
                }
                return list1;
            }
            FunctionDescriptorImpl.a(0x1F);
            throw null;
        }
        FunctionDescriptorImpl.a(30);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getTypeParameters() {
        List list0 = this.e;
        if(list0 == null) {
            throw new IllegalStateException("typeParameters == null for " + this);
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Object getUserData(UserDataKey callableDescriptor$UserDataKey0) {
        return this.userDataMap == null ? null : this.userDataMap.get(callableDescriptor$UserDataKey0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getValueParameters() {
        List list0 = this.f;
        if(list0 != null) {
            return list0;
        }
        FunctionDescriptorImpl.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.l;
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        FunctionDescriptorImpl.a(16);
        throw null;
    }

    public boolean hasStableParameterNames() {
        return this.w;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.x;
    }

    @NotNull
    public FunctionDescriptorImpl initialize(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor1, @NotNull List list0, @NotNull List list1, @NotNull List list2, @Nullable KotlinType kotlinType0, @Nullable Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0) {
        if(list0 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(descriptorVisibility0 != null) {
                        this.e = CollectionsKt___CollectionsKt.toList(list1);
                        this.f = CollectionsKt___CollectionsKt.toList(list2);
                        this.g = kotlinType0;
                        this.k = modality0;
                        this.l = descriptorVisibility0;
                        this.i = receiverParameterDescriptor0;
                        this.j = receiverParameterDescriptor1;
                        this.h = list0;
                        for(int v1 = 0; v1 < list1.size(); ++v1) {
                            TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)list1.get(v1);
                            if(typeParameterDescriptor0.getIndex() != v1) {
                                throw new IllegalStateException(typeParameterDescriptor0 + " index is " + typeParameterDescriptor0.getIndex() + " but position is " + v1);
                            }
                        }
                        for(int v = 0; v < list2.size(); ++v) {
                            ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)list2.get(v);
                            if(valueParameterDescriptor0.getIndex() != v) {
                                throw new IllegalStateException(valueParameterDescriptor0 + "index is " + valueParameterDescriptor0.getIndex() + " but position is " + v);
                            }
                        }
                        return this;
                    }
                    FunctionDescriptorImpl.a(8);
                    throw null;
                }
                FunctionDescriptorImpl.a(7);
                throw null;
            }
            FunctionDescriptorImpl.a(6);
            throw null;
        }
        FunctionDescriptorImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.r;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.o;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.u;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.t;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if(this.n) {
            return true;
        }
        for(Object object0: this.getOriginal().getOverriddenDescriptors()) {
            if(((FunctionDescriptor)object0).isInfix()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return this.p;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if(this.m) {
            return true;
        }
        for(Object object0: this.getOriginal().getOverriddenDescriptors()) {
            if(((FunctionDescriptor)object0).isOperator()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return this.q;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public CopyBuilder newCopyBuilder() {
        CopyBuilder functionDescriptor$CopyBuilder0 = this.newCopyBuilder(TypeSubstitutor.EMPTY);
        if(functionDescriptor$CopyBuilder0 != null) {
            return functionDescriptor$CopyBuilder0;
        }
        FunctionDescriptorImpl.a(23);
        throw null;
    }

    @NotNull
    public CopyConfiguration newCopyBuilder(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return new CopyConfiguration(this, typeSubstitutor0.getSubstitution(), this.getContainingDeclaration(), this.getModality(), this.getVisibility(), this.getKind(), this.getValueParameters(), this.getContextReceiverParameters(), this.getExtensionReceiverParameter(), this.getReturnType(), null);
        }
        FunctionDescriptorImpl.a(24);
        throw null;
    }

    public void putInUserDataMap(UserDataKey callableDescriptor$UserDataKey0, Object object0) {
        if(this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(callableDescriptor$UserDataKey0, object0);
    }

    public void setActual(boolean z) {
        this.s = z;
    }

    public void setExpect(boolean z) {
        this.r = z;
    }

    public void setExternal(boolean z) {
        this.o = z;
    }

    public void setHasStableParameterNames(boolean z) {
        this.w = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.x = z;
    }

    public void setInfix(boolean z) {
        this.n = z;
    }

    public void setInline(boolean z) {
        this.p = z;
    }

    public void setOperator(boolean z) {
        this.m = z;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection collection0) {
        if(collection0 != null) {
            this.y = collection0;
            for(Object object0: collection0) {
                if(((FunctionDescriptor)object0).isHiddenForResolutionEverywhereBesideSupercalls()) {
                    this.u = true;
                    return;
                }
                if(false) {
                    break;
                }
            }
            return;
        }
        FunctionDescriptorImpl.a(17);
        throw null;
    }

    public void setReturnType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            this.g = kotlinType0;
            return;
        }
        FunctionDescriptorImpl.a(11);
        throw null;
    }

    public void setSuspend(boolean z) {
        this.v = z;
    }

    public void setTailrec(boolean z) {
        this.q = z;
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
        if(descriptorVisibility0 != null) {
            this.l = descriptorVisibility0;
            return;
        }
        FunctionDescriptorImpl.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return typeSubstitutor0.isEmpty() ? this : this.newCopyBuilder(typeSubstitutor0).setOriginal(this.getOriginal()).setPreserveSourceElement().setJustForTypeSubstitution(true).build();
        }
        FunctionDescriptorImpl.a(22);
        throw null;
    }
}

