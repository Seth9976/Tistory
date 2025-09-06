package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nconstantValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 constantValues.kt\norg/jetbrains/kotlin/resolve/constants/EnumValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
public final class EnumValue extends ConstantValue {
    public final ClassId b;
    public final Name c;

    public EnumValue(@NotNull ClassId classId0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(classId0, "enumClassId");
        Intrinsics.checkNotNullParameter(name0, "enumEntryName");
        super(TuplesKt.to(classId0, name0));
        this.b = classId0;
        this.c = name0;
    }

    @NotNull
    public final Name getEnumEntryName() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        ClassId classId0 = this.b;
        ClassDescriptor classDescriptor0 = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor0, classId0);
        KotlinType kotlinType0 = null;
        if(classDescriptor0 != null) {
            if(!DescriptorUtils.isEnumClass(classDescriptor0)) {
                classDescriptor0 = null;
            }
            if(classDescriptor0 != null) {
                kotlinType0 = classDescriptor0.getDefaultType();
            }
        }
        if(kotlinType0 == null) {
            String s = classId0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "enumClassId.toString()");
            String s1 = this.c.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "enumEntryName.toString()");
            return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_ENUM_TYPE, new String[]{s, s1});
        }
        return kotlinType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return this.b.getShortClassName() + '.' + this.c;
    }
}

