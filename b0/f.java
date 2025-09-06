package b0;

import androidx.navigation.NavArgument;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public f(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 1: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 2: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 3: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 4: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 5: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((NavDestination)object0), "startDestination");
                Map map0 = ((NavDestination)object0).getArguments();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.mapCapacity(map0.size()));
                for(Object object1: map0.entrySet()) {
                    linkedHashMap0.put(((Map.Entry)object1).getKey(), ((NavArgument)((Map.Entry)object1).getValue()).getType());
                }
                return RouteSerializerKt.generateRouteWithArgs(this.x, linkedHashMap0);
            }
            default: {
                return Boolean.valueOf(Intrinsics.areEqual(object0, this.x));
            }
        }
    }
}

