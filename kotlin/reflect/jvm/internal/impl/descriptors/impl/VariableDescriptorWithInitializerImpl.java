package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {
    protected NullableLazyValue compileTimeInitializer;
    protected Function0 compileTimeInitializerFactory;
    public final boolean e;

    public VariableDescriptorWithInitializerImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @Nullable KotlinType kotlinType0, boolean z, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(sourceElement0 != null) {
                        super(declarationDescriptor0, annotations0, name0, kotlinType0, sourceElement0);
                        this.e = z;
                        return;
                    }
                    VariableDescriptorWithInitializerImpl.a(3);
                    throw null;
                }
                VariableDescriptorWithInitializerImpl.a(2);
                throw null;
            }
            VariableDescriptorWithInitializerImpl.a(1);
            throw null;
        }
        VariableDescriptorWithInitializerImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[3];
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
                arr_object[0] = "source";
                break;
            }
            case 4: 
            case 5: {
                arr_object[0] = "compileTimeInitializerFactory";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        switch(v) {
            case 4: {
                arr_object[2] = "setCompileTimeInitializerFactory";
                break;
            }
            case 5: {
                arr_object[2] = "setCompileTimeInitializer";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    public ConstantValue getCompileTimeInitializer() {
        return this.compileTimeInitializer == null ? null : ((ConstantValue)this.compileTimeInitializer.invoke());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.e;
    }

    public void setCompileTimeInitializer(@Nullable NullableLazyValue nullableLazyValue0, @NotNull Function0 function00) {
        if(function00 != null) {
            this.compileTimeInitializerFactory = function00;
            if(nullableLazyValue0 == null) {
                nullableLazyValue0 = (NullableLazyValue)function00.invoke();
            }
            this.compileTimeInitializer = nullableLazyValue0;
            return;
        }
        VariableDescriptorWithInitializerImpl.a(5);
        throw null;
    }

    public void setCompileTimeInitializerFactory(@NotNull Function0 function00) {
        if(function00 != null) {
            this.setCompileTimeInitializer(null, function00);
            return;
        }
        VariableDescriptorWithInitializerImpl.a(4);
        throw null;
    }
}

