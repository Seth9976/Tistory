package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0006\u001A\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/JvmViewModelProviders;", "", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "createViewModel", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class JvmViewModelProviders {
    @NotNull
    public static final JvmViewModelProviders INSTANCE;

    static {
        JvmViewModelProviders.INSTANCE = new JvmViewModelProviders();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final ViewModel createViewModel(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        try {
            Object object0 = class0.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNullExpressionValue(object0, "{\n            modelClass…).newInstance()\n        }");
            return (ViewModel)object0;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("Cannot create an instance of " + class0, noSuchMethodException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("Cannot create an instance of " + class0, instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Cannot create an instance of " + class0, illegalAccessException0);
        }
    }
}

