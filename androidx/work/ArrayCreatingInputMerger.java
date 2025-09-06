package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\u0007\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/InputMerger;", "<init>", "()V", "", "Landroidx/work/Data;", "inputs", "merge", "(Ljava/util/List;)Landroidx/work/Data;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ArrayCreatingInputMerger extends InputMerger {
    @Override  // androidx.work.InputMerger
    @NotNull
    public Data merge(@NotNull List list0) {
        Object object4;
        Intrinsics.checkNotNullParameter(list0, "inputs");
        Builder data$Builder0 = new Builder();
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            Map map0 = ((Data)object0).getKeyValueMap();
            Intrinsics.checkNotNullExpressionValue(map0, "input.keyValueMap");
            for(Object object1: map0.entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                Object object2 = ((Map.Entry)object1).getValue();
                Class class0 = object2 == null ? String.class : object2.getClass();
                Object object3 = hashMap0.get(s);
                Intrinsics.checkNotNullExpressionValue(s, "key");
                if(object3 != null) {
                    Class class1 = object3.getClass();
                    if(Intrinsics.areEqual(class1, class0)) {
                        Intrinsics.checkNotNullExpressionValue(object2, "value");
                        int v = Array.getLength(object3);
                        int v1 = Array.getLength(object2);
                        Class class2 = object3.getClass().getComponentType();
                        Intrinsics.checkNotNull(class2);
                        Object object5 = Array.newInstance(class2, v + v1);
                        System.arraycopy(object3, 0, object5, 0, v);
                        System.arraycopy(object2, 0, object5, v, v1);
                        Intrinsics.checkNotNullExpressionValue(object5, "newArray");
                        object2 = object5;
                    }
                    else {
                        if(!Intrinsics.areEqual(class1.getComponentType(), class0)) {
                            throw new IllegalArgumentException();
                        }
                        int v2 = Array.getLength(object3);
                        object4 = Array.newInstance(class0, v2 + 1);
                        System.arraycopy(object3, 0, object4, 0, v2);
                        Array.set(object4, v2, object2);
                        Intrinsics.checkNotNullExpressionValue(object4, "newArray");
                        object2 = object4;
                    }
                }
                else if(!class0.isArray()) {
                    object4 = Array.newInstance(class0, 1);
                    Array.set(object4, 0, object2);
                    Intrinsics.checkNotNullExpressionValue(object4, "newArray");
                    object2 = object4;
                }
                Intrinsics.checkNotNullExpressionValue(object2, "if (existingValue == nul…      }\n                }");
                hashMap0.put(s, object2);
            }
        }
        data$Builder0.putAll(hashMap0);
        Data data0 = data$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(data0, "output.build()");
        return data0;
    }
}

