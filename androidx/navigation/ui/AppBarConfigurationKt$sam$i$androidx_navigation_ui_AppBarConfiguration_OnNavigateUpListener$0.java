package androidx.navigation.ui;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
public final class AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0 implements OnNavigateUpListener, FunctionAdapter {
    public final Function0 a;

    public AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        super();
        this.a = function00;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return !(object0 instanceof OnNavigateUpListener) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function getFunctionDelegate() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    @Override  // androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener
    public final boolean onNavigateUp() {
        return ((Boolean)this.a.invoke()).booleanValue();
    }
}

