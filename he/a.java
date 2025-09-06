package he;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class a implements Function0 {
    public final int a;
    public final KotlinBuiltIns b;

    public a(KotlinBuiltIns kotlinBuiltIns0, int v) {
        this.a = v;
        this.b = kotlinBuiltIns0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KotlinBuiltIns kotlinBuiltIns0 = this.b;
        int v = 0;
        if(this.a != 0) {
            EnumMap enumMap0 = new EnumMap(PrimitiveType.class);
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            PrimitiveType[] arr_primitiveType = PrimitiveType.values();
            while(v < arr_primitiveType.length) {
                PrimitiveType primitiveType0 = arr_primitiveType[v];
                String s = primitiveType0.getTypeName().asString();
                if(s != null) {
                    SimpleType simpleType0 = kotlinBuiltIns0.c(s).getDefaultType();
                    if(simpleType0 != null) {
                        String s1 = primitiveType0.getArrayTypeName().asString();
                        if(s1 != null) {
                            SimpleType simpleType1 = kotlinBuiltIns0.c(s1).getDefaultType();
                            if(simpleType1 != null) {
                                enumMap0.put(primitiveType0, simpleType1);
                                hashMap0.put(simpleType0, simpleType1);
                                hashMap1.put(simpleType1, simpleType0);
                                ++v;
                                continue;
                            }
                            KotlinBuiltIns.a(0x2F);
                            throw null;
                        }
                        KotlinBuiltIns.a(46);
                        throw null;
                    }
                    KotlinBuiltIns.a(0x2F);
                    throw null;
                }
                kotlinBuiltIns0.getClass();
                KotlinBuiltIns.a(46);
                throw null;
            }
            return new d(enumMap0, hashMap0, hashMap1);
        }
        return Arrays.asList(new PackageViewDescriptor[]{kotlinBuiltIns0.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlinBuiltIns0.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlinBuiltIns0.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), kotlinBuiltIns0.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME)});
    }
}

