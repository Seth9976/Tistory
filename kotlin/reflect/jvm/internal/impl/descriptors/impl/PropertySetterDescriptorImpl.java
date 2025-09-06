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
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {
    public ValueParameterDescriptor m;
    public final PropertySetterDescriptor n;

    public PropertySetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, boolean z1, boolean z2, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable PropertySetterDescriptor propertySetterDescriptor0, @NotNull SourceElement sourceElement0) {
        PropertySetterDescriptor propertySetterDescriptor2;
        PropertySetterDescriptor propertySetterDescriptor1;
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                if(modality0 != null) {
                    if(descriptorVisibility0 != null) {
                        if(callableMemberDescriptor$Kind0 != null) {
                            if(sourceElement0 != null) {
                                super(modality0, descriptorVisibility0, propertyDescriptor0, annotations0, Name.special(("<set-" + propertyDescriptor0.getName() + ">")), z, z1, z2, callableMemberDescriptor$Kind0, sourceElement0);
                                if(propertySetterDescriptor0 == null) {
                                    propertySetterDescriptor2 = this;
                                    propertySetterDescriptor1 = propertySetterDescriptor2;
                                }
                                else {
                                    propertySetterDescriptor1 = this;
                                    propertySetterDescriptor2 = propertySetterDescriptor0;
                                }
                                propertySetterDescriptor1.n = propertySetterDescriptor2;
                                return;
                            }
                            PropertySetterDescriptorImpl.a(5);
                            throw null;
                        }
                        PropertySetterDescriptorImpl.a(4);
                        throw null;
                    }
                    PropertySetterDescriptorImpl.a(3);
                    throw null;
                }
                PropertySetterDescriptorImpl.a(2);
                throw null;
            }
            PropertySetterDescriptorImpl.a(1);
            throw null;
        }
        PropertySetterDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 10 || v == 11 || v == 12 || v == 13 ? 2 : 3)];
        switch(v) {
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
            case 6: {
                arr_object[0] = "parameter";
                break;
            }
            case 7: {
                arr_object[0] = "setterDescriptor";
                break;
            }
            case 8: {
                arr_object[0] = "type";
                break;
            }
            case 1: 
            case 9: {
                arr_object[0] = "annotations";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "correspondingProperty";
            }
        }
        switch(v) {
            case 10: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 11: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 12: {
                arr_object[1] = "getReturnType";
                break;
            }
            case 13: {
                arr_object[1] = "getOriginal";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
            }
        }
        switch(v) {
            case 6: {
                arr_object[2] = "initialize";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                arr_object[2] = "createSetterParameter";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 10 || v == 11 || v == 12 || v == 13 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 10 || v == 11 || v == 12 || v == 13 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitPropertySetterDescriptor(this, object0);
    }

    public static ValueParameterDescriptorImpl createSetterParameter(@NotNull PropertySetterDescriptor propertySetterDescriptor0, @NotNull KotlinType kotlinType0, @NotNull Annotations annotations0) {
        if(propertySetterDescriptor0 != null) {
            if(kotlinType0 != null) {
                if(annotations0 != null) {
                    return new ValueParameterDescriptorImpl(propertySetterDescriptor0, null, 0, annotations0, SpecialNames.IMPLICIT_SET_PARAMETER, kotlinType0, false, false, false, null, SourceElement.NO_SOURCE);
                }
                PropertySetterDescriptorImpl.a(9);
                throw null;
            }
            PropertySetterDescriptorImpl.a(8);
            throw null;
        }
        PropertySetterDescriptorImpl.a(7);
        throw null;
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
    public PropertySetterDescriptor getOriginal() {
        PropertySetterDescriptor propertySetterDescriptor0 = this.n;
        if(propertySetterDescriptor0 != null) {
            return propertySetterDescriptor0;
        }
        PropertySetterDescriptorImpl.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = super.getOverriddenDescriptors(false);
        if(collection0 != null) {
            return collection0;
        }
        PropertySetterDescriptorImpl.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType kotlinType0 = DescriptorUtilsKt.getBuiltIns(this).getUnitType();
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        PropertySetterDescriptorImpl.a(12);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getValueParameters() {
        ValueParameterDescriptor valueParameterDescriptor0 = this.m;
        if(valueParameterDescriptor0 == null) {
            throw new IllegalStateException();
        }
        List list0 = Collections.singletonList(valueParameterDescriptor0);
        if(list0 != null) {
            return list0;
        }
        PropertySetterDescriptorImpl.a(11);
        throw null;
    }

    public void initialize(@NotNull ValueParameterDescriptor valueParameterDescriptor0) {
        if(valueParameterDescriptor0 != null) {
            this.m = valueParameterDescriptor0;
            return;
        }
        PropertySetterDescriptorImpl.a(6);
        throw null;
    }
}

