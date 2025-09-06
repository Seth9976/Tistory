package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "<init>", "()V", "", "backStackEntryId", "", "clear", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModelStore;", "toString", "()Ljava/lang/String;", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/navigation/NavControllerViewModel;", "getInstance", "(Landroidx/lifecycle/ViewModelStore;)Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "FACTORY", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,83:1\n374#2:84\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n79#1:84\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final NavControllerViewModel getInstance(@NotNull ViewModelStore viewModelStore0) {
            Intrinsics.checkNotNullParameter(viewModelStore0, "viewModelStore");
            return (NavControllerViewModel)new ViewModelProvider(viewModelStore0, NavControllerViewModel.I0, null, 4, null).get(NavControllerViewModel.class);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final LinkedHashMap H0;
    public static final NavControllerViewModel.Companion.FACTORY.1 I0;

    static {
        NavControllerViewModel.Companion = new Companion(null);
        NavControllerViewModel.I0 = new NavControllerViewModel.Companion.FACTORY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public NavControllerViewModel() {
        this.H0 = new LinkedHashMap();
    }

    public final void clear(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "backStackEntryId");
        ViewModelStore viewModelStore0 = (ViewModelStore)this.H0.remove(s);
        if(viewModelStore0 != null) {
            viewModelStore0.clear();
        }
    }

    @JvmStatic
    @NotNull
    public static final NavControllerViewModel getInstance(@NotNull ViewModelStore viewModelStore0) {
        return NavControllerViewModel.Companion.getInstance(viewModelStore0);
    }

    @Override  // androidx.navigation.NavViewModelStoreProvider
    @NotNull
    public ViewModelStore getViewModelStore(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "backStackEntryId");
        LinkedHashMap linkedHashMap0 = this.H0;
        ViewModelStore viewModelStore0 = (ViewModelStore)linkedHashMap0.get(s);
        if(viewModelStore0 == null) {
            viewModelStore0 = new ViewModelStore();
            linkedHashMap0.put(s, viewModelStore0);
        }
        return viewModelStore0;
    }

    @Override  // androidx.lifecycle.ViewModel
    public void onCleared() {
        LinkedHashMap linkedHashMap0 = this.H0;
        for(Object object0: linkedHashMap0.values()) {
            ((ViewModelStore)object0).clear();
        }
        linkedHashMap0.clear();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NavControllerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} ViewModelStores (");
        Iterator iterator0 = this.H0.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((String)object0));
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        return q.l(')', "sb.toString()", stringBuilder0);
    }
}

