package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final TypeEnhancementInfo w;
    public final JavaTypeQualifiers[] x;

    public a(TypeEnhancementInfo typeEnhancementInfo0, JavaTypeQualifiers[] arr_javaTypeQualifiers) {
        this.w = typeEnhancementInfo0;
        this.x = arr_javaTypeQualifiers;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        TypeEnhancementInfo typeEnhancementInfo0 = this.w;
        if(typeEnhancementInfo0 != null) {
            Map map0 = typeEnhancementInfo0.getMap();
            if(map0 != null) {
                JavaTypeQualifiers javaTypeQualifiers0 = (JavaTypeQualifiers)map0.get(v);
                if(javaTypeQualifiers0 != null) {
                    return javaTypeQualifiers0;
                }
            }
        }
        if(v >= 0) {
            return v > ArraysKt___ArraysKt.getLastIndex(this.x) ? JavaTypeQualifiers.Companion.getNONE() : this.x[v];
        }
        return JavaTypeQualifiers.Companion.getNONE();
    }
}

