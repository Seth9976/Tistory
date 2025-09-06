package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PropertyGetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertyGetterDescriptor {
    public KotlinType m;
    public final PropertyGetterDescriptor n;

    public PropertyGetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, boolean z1, boolean z2, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable PropertyGetterDescriptor propertyGetterDescriptor0, @NotNull SourceElement sourceElement0) {
        PropertyGetterDescriptor propertyGetterDescriptor2;
        PropertyGetterDescriptor propertyGetterDescriptor1;
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                if(modality0 != null) {
                    if(descriptorVisibility0 != null) {
                        if(callableMemberDescriptor$Kind0 != null) {
                            if(sourceElement0 != null) {
                                super(modality0, descriptorVisibility0, propertyDescriptor0, annotations0, Name.special(("<get-" + propertyDescriptor0.getName() + ">")), z, z1, z2, callableMemberDescriptor$Kind0, sourceElement0);
                                if(propertyGetterDescriptor0 == null) {
                                    propertyGetterDescriptor2 = this;
                                    propertyGetterDescriptor1 = propertyGetterDescriptor2;
                                }
                                else {
                                    propertyGetterDescriptor1 = this;
                                    propertyGetterDescriptor2 = propertyGetterDescriptor0;
                                }
                                propertyGetterDescriptor1.n = propertyGetterDescriptor2;
                                return;
                            }
                            PropertyGetterDescriptorImpl.a(5);
                            throw null;
                        }
                        PropertyGetterDescriptorImpl.a(4);
                        throw null;
                    }
                    PropertyGetterDescriptorImpl.a(3);
                    throw null;
                }
                PropertyGetterDescriptorImpl.a(2);
                throw null;
            }
            PropertyGetterDescriptorImpl.a(1);
            throw null;
        }
        PropertyGetterDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 6 || v == 7 || v == 8 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: {
                arr_object[0] = "modality";
                break;
            }
            case 3: {
                arr_object[0] = "visibility";
                break;
            }
            case 4: {
                arr_object[0] = "kind";
                break;
            }
            case 5: {
                arr_object[0] = "source";
                break;
            }
            case 6: 
            case 7: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "correspondingProperty";
            }
        }
        switch(v) {
            case 6: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 7: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 8: {
                arr_object[1] = "getOriginal";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
            }
        }
        if(v != 6 && v != 7 && v != 8) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 6 || v == 7 || v == 8 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 6 || v == 7 || v == 8 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitPropertyGetterDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl
    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public FunctionDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl
    @NotNull
    public PropertyAccessorDescriptor getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public PropertyGetterDescriptor getOriginal() {
        PropertyGetterDescriptor propertyGetterDescriptor0 = this.n;
        if(propertyGetterDescriptor0 != null) {
            return propertyGetterDescriptor0;
        }
        PropertyGetterDescriptorImpl.a(8);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = super.getOverriddenDescriptors(true);
        if(collection0 != null) {
            return collection0;
        }
        PropertyGetterDescriptorImpl.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.m;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getValueParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        PropertyGetterDescriptorImpl.a(7);
        throw null;
    }

    public void initialize(KotlinType kotlinType0) {
        if(kotlinType0 == null) {
            kotlinType0 = this.getCorrespondingProperty().getType();
        }
        this.m = kotlinType0;
    }
}

