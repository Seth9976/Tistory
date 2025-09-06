package androidx.compose.material3;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.tooling.ComposableInvoker;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class n7 extends Lambda implements Function0 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public n7(Object object0, Object object1, Object object2, Object object3, int v, View view0, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.x = v;
        this.C = view0;
        super(0);
    }

    public n7(Locale locale0, Long long0, Long long1, IntRange intRange0, int v, SelectableDates selectableDates0) {
        this.w = 0;
        this.y = long0;
        this.z = long1;
        this.A = intRange0;
        this.x = v;
        this.B = selectableDates0;
        this.C = locale0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return new q7(((Locale)this.C), ((Long)this.y), ((Long)this.z), ((IntRange)this.A), this.x, ((SelectableDates)this.B));
            }
            case 1: {
                try {
                    Object[] arr_object = PreviewUtils_androidKt.getPreviewProviderParameters(((Class)this.B), this.x);
                    Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                    ComposableInvoker.INSTANCE.invokeComposable(((String)this.y), ((String)this.z), ((Composer)this.A), arr_object1);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    Throwable throwable1;
                    for(throwable1 = throwable0; throwable1 instanceof ReflectiveOperationException; throwable1 = throwable2) {
                        Throwable throwable2 = throwable1.getCause();
                        if(throwable2 == null) {
                            break;
                        }
                    }
                    ComposeViewAdapter.access$getDelayedException$p(((ComposeViewAdapter)this.C)).set(throwable1);
                    throw throwable0;
                }
            }
            default: {
                Intrinsics.checkNotNull(((View)this.C), "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                return new ViewFactoryHolder(((Context)this.y), ((Function1)this.z), ((CompositionContext)this.A), ((SaveableStateRegistry)this.B), this.x, ((Owner)(((View)this.C)))).getLayoutNode();
            }
        }
    }
}

