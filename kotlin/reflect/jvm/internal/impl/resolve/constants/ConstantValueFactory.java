package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.text.selection.g1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1603#2,9:104\n1855#2:113\n1856#2:115\n1612#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
public final class ConstantValueFactory {
    @NotNull
    public static final ConstantValueFactory INSTANCE;

    static {
        ConstantValueFactory.INSTANCE = new ConstantValueFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final ArrayValue a(List list0, ModuleDescriptor moduleDescriptor0, PrimitiveType primitiveType0) {
        Iterable iterable0 = CollectionsKt___CollectionsKt.toList(list0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            ConstantValue constantValue0 = ConstantValueFactory.createConstantValue$default(this, object0, null, 2, null);
            if(constantValue0 != null) {
                arrayList0.add(constantValue0);
            }
        }
        if(moduleDescriptor0 != null) {
            SimpleType simpleType0 = moduleDescriptor0.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType0);
            Intrinsics.checkNotNullExpressionValue(simpleType0, "module.builtIns.getPrimi…KotlinType(componentType)");
            return new TypedArrayValue(arrayList0, simpleType0);
        }
        return new ArrayValue(arrayList0, new g1(primitiveType0, 14));
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List list0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        return new TypedArrayValue(list0, kotlinType0);
    }

    @Nullable
    public final ConstantValue createConstantValue(@Nullable Object object0, @Nullable ModuleDescriptor moduleDescriptor0) {
        if(object0 instanceof Byte) {
            return new ByteValue(((Number)object0).byteValue());
        }
        if(object0 instanceof Short) {
            return new ShortValue(((Number)object0).shortValue());
        }
        if(object0 instanceof Integer) {
            return new IntValue(((Number)object0).intValue());
        }
        if(object0 instanceof Long) {
            return new LongValue(((Number)object0).longValue());
        }
        if(object0 instanceof Character) {
            return new CharValue(((Character)object0).charValue());
        }
        if(object0 instanceof Float) {
            return new FloatValue(((Number)object0).floatValue());
        }
        if(object0 instanceof Double) {
            return new DoubleValue(((Number)object0).doubleValue());
        }
        if(object0 instanceof Boolean) {
            return new BooleanValue(((Boolean)object0).booleanValue());
        }
        if(object0 instanceof String) {
            return new StringValue(((String)object0));
        }
        if(object0 instanceof byte[]) {
            return this.a(ArraysKt___ArraysKt.toList(((byte[])object0)), moduleDescriptor0, PrimitiveType.BYTE);
        }
        if(object0 instanceof short[]) {
            return this.a(ArraysKt___ArraysKt.toList(((short[])object0)), moduleDescriptor0, PrimitiveType.SHORT);
        }
        if(object0 instanceof int[]) {
            return this.a(ArraysKt___ArraysKt.toList(((int[])object0)), moduleDescriptor0, PrimitiveType.INT);
        }
        if(object0 instanceof long[]) {
            return this.a(ArraysKt___ArraysKt.toList(((long[])object0)), moduleDescriptor0, PrimitiveType.LONG);
        }
        if(object0 instanceof char[]) {
            return this.a(ArraysKt___ArraysKt.toList(((char[])object0)), moduleDescriptor0, PrimitiveType.CHAR);
        }
        if(object0 instanceof float[]) {
            return this.a(ArraysKt___ArraysKt.toList(((float[])object0)), moduleDescriptor0, PrimitiveType.FLOAT);
        }
        if(object0 instanceof double[]) {
            return this.a(ArraysKt___ArraysKt.toList(((double[])object0)), moduleDescriptor0, PrimitiveType.DOUBLE);
        }
        if(object0 instanceof boolean[]) {
            return this.a(ArraysKt___ArraysKt.toList(((boolean[])object0)), moduleDescriptor0, PrimitiveType.BOOLEAN);
        }
        return object0 == null ? new NullValue() : null;
    }

    public static ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory0, Object object0, ModuleDescriptor moduleDescriptor0, int v, Object object1) {
        if((v & 2) != 0) {
            moduleDescriptor0 = null;
        }
        return constantValueFactory0.createConstantValue(object0, moduleDescriptor0);
    }
}

