package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001AK\u0010\t\u001A\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001A=\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000BH\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "newInstance", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "", "signature", "findMatchingConstructor", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SavedStateViewModelFactoryKt {
    public static final List a;
    public static final List b;

    static {
        SavedStateViewModelFactoryKt.a = CollectionsKt__CollectionsKt.listOf(new Class[]{Application.class, SavedStateHandle.class});
        SavedStateViewModelFactoryKt.b = k.listOf(SavedStateHandle.class);
    }

    @Nullable
    public static final Constructor findMatchingConstructor(@NotNull Class class0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        Intrinsics.checkNotNullParameter(list0, "signature");
        Constructor[] arr_constructor = class0.getConstructors();
        Intrinsics.checkNotNullExpressionValue(arr_constructor, "modelClass.constructors");
        for(int v = 0; v < arr_constructor.length; ++v) {
            Constructor constructor0 = arr_constructor[v];
            Class[] arr_class = constructor0.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_class, "constructor.parameterTypes");
            List list1 = ArraysKt___ArraysKt.toList(arr_class);
            if(Intrinsics.areEqual(list0, list1)) {
                Intrinsics.checkNotNull(constructor0, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor0;
            }
            if(list0.size() == list1.size() && list1.containsAll(list0)) {
                throw new UnsupportedOperationException("Class " + class0.getSimpleName() + " must have parameters in the proper order: " + list0);
            }
        }
        return null;
    }

    public static final ViewModel newInstance(@NotNull Class class0, @NotNull Constructor constructor0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        Intrinsics.checkNotNullParameter(constructor0, "constructor");
        Intrinsics.checkNotNullParameter(arr_object, "params");
        try {
            return (ViewModel)constructor0.newInstance(Arrays.copyOf(arr_object, arr_object.length));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Failed to access " + class0, illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("A " + class0 + " cannot be instantiated.", instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("An exception happened in constructor of " + class0, invocationTargetException0.getCause());
        }
    }
}

