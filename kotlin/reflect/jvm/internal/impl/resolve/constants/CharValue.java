package kotlin.reflect.jvm.internal.impl.resolve.constants;

import a5.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class CharValue extends IntegerValueConstant {
    public CharValue(char c) {
        super(Character.valueOf(c));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor0) {
        return this.getType(moduleDescriptor0);
    }

    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        SimpleType simpleType0 = moduleDescriptor0.getBuiltIns().getCharType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "module.builtIns.charType");
        return simpleType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        Integer integer0 = (int)((Character)this.getValue()).charValue();
        int v = ((Character)this.getValue()).charValue();
        switch(v) {
            case 8: {
                return b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, "\\b"});
            }
            case 9: {
                return b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, "\\t"});
            }
            case 10: {
                return b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, "\\n"});
            }
            case 12: {
                return b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, "\\f"});
            }
            case 13: {
                return b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, "\\r"});
            }
            default: {
                int v1 = (byte)Character.getType(((char)v));
                return v1 == 0 || v1 == 13 || (v1 == 14 || v1 == 15 || v1 == 16 || v1 == 18 || v1 == 19) ? b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, "?"}) : b.f(2, "\\u%04X (\'%s\')", "format(this, *args)", new Object[]{integer0, String.valueOf(((char)v))});
            }
        }
    }
}

