package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import pd.c;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0000\u001A\u0010\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u001A\u0018\u0010\u0006\u001A\u00020\u0007*\u00020\b2\n\u0010\t\u001A\u0006\u0012\u0002\b\u00030\nH\u0000¨\u0006\u000B"}, d2 = {"areObjectsOfSameType", "", "a", "", "b", "classKeyForObject", "tryPopulateReflectively", "", "Landroidx/compose/ui/platform/InspectorInfo;", "element", "Landroidx/compose/ui/node/ModifierNodeElement;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,54:1\n6442#2:55\n33#3,6:56\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n38#1:55\n39#1:56,6\n*E\n"})
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(@NotNull Object object0, @NotNull Object object1) {
        return object0.getClass() == object1.getClass();
    }

    @NotNull
    public static final Object classKeyForObject(@NotNull Object object0) {
        return object0.getClass();
    }

    public static final void tryPopulateReflectively(@NotNull InspectorInfo inspectorInfo0, @NotNull ModifierNodeElement modifierNodeElement0) {
        List list0 = ArraysKt___ArraysKt.sortedWith(modifierNodeElement0.getClass().getDeclaredFields(), new Comparator() {
            @Override
            public final int compare(Object object0, Object object1) {
                return c.compareValues(((Field)object0).getName(), ((Field)object1).getName());
            }
        });
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Field field0 = (Field)list0.get(v1);
            if(!field0.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field0.setAccessible(true);
                    inspectorInfo0.getProperties().set(field0.getName(), field0.get(modifierNodeElement0));
                }
                catch(SecurityException | IllegalAccessException unused_ex) {
                }
            }
        }
    }
}

