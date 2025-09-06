package fe;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.internal.CachesKt;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.RuntimeTypeMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class a extends Lambda implements Function1 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(1, 0);
        a.y = new a(1, 1);
        a.z = new a(1, 2);
        a.A = new a(1, 3);
        a.B = new a(1, 4);
        a.C = new a(1, 5);
        a.D = new a(1, 6);
        a.E = new a(1, 7);
        a.F = new a(1, 8);
        a.G = new a(1, 9);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Class)object0), "it");
                return KClassifiers.createType(CachesKt.getOrCreateKotlinClass(((Class)object0)), CollectionsKt__CollectionsKt.emptyList(), false, CollectionsKt__CollectionsKt.emptyList());
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Class)object0), "it");
                return new ConcurrentHashMap();
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Class)object0), "it");
                return KClassifiers.createType(CachesKt.getOrCreateKotlinClass(((Class)object0)), CollectionsKt__CollectionsKt.emptyList(), true, CollectionsKt__CollectionsKt.emptyList());
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Class)object0), "it");
                return new KClassImpl(((Class)object0));
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((Class)object0), "it");
                return new KPackageImpl(((Class)object0));
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((FunctionDescriptor)object0), "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(((FunctionDescriptor)object0)) + " | " + RuntimeTypeMapper.INSTANCE.mapSignature(((FunctionDescriptor)object0)).asString();
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((PropertyDescriptor)object0), "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(((PropertyDescriptor)object0)) + " | " + RuntimeTypeMapper.INSTANCE.mapPropertySignature(((PropertyDescriptor)object0)).asString();
            }
            case 7: {
                KotlinType kotlinType0 = ((ValueParameterDescriptor)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.type");
                return ReflectionObjectRenderer.INSTANCE.renderType(kotlinType0);
            }
            case 8: {
                KotlinType kotlinType1 = ((ValueParameterDescriptor)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType1, "it.type");
                return ReflectionObjectRenderer.INSTANCE.renderType(kotlinType1);
            }
            default: {
                Intrinsics.checkNotNullExpressionValue(((Class)object0), "it");
                return ReflectClassUtilKt.getDesc(((Class)object0));
            }
        }
    }
}

