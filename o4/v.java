package o4;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavHostKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final Function1 A;
    public final State B;
    public final MutableState C;
    public final Map w;
    public final ComposeNavigator x;
    public final Function1 y;
    public final Function1 z;

    public v(Map map0, ComposeNavigator composeNavigator0, Function1 function10, Function1 function11, Function1 function12, State state0, MutableState mutableState0) {
        this.w = map0;
        this.x = composeNavigator0;
        this.y = function10;
        this.z = function11;
        this.A = function12;
        this.B = state0;
        this.C = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f;
        if(NavHostKt.access$NavHost$lambda$17(this.B).contains(((AnimatedContentTransitionScope)object0).getInitialState())) {
            String s = ((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getInitialState()).getId();
            Map map0 = this.w;
            Float float0 = (Float)map0.get(s);
            if(float0 == null) {
                map0.put(((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getInitialState()).getId(), 0.0f);
                f = 0.0f;
            }
            else {
                f = (float)float0;
            }
            if(!Intrinsics.areEqual(((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getTargetState()).getId(), ((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getInitialState()).getId())) {
                f = ((Boolean)this.x.isPop$navigation_compose_release().getValue()).booleanValue() || NavHostKt.access$NavHost$lambda$11(this.C) ? f - 1.0f : f + 1.0f;
            }
            map0.put(((NavBackStackEntry)((AnimatedContentTransitionScope)object0).getTargetState()).getId(), f);
            return new ContentTransform(((EnterTransition)this.y.invoke(((AnimatedContentTransitionScope)object0))), ((ExitTransition)this.z.invoke(((AnimatedContentTransitionScope)object0))), f, ((SizeTransform)this.A.invoke(((AnimatedContentTransitionScope)object0))));
        }
        return AnimatedContentKt.togetherWith(EnterTransition.Companion.getNone(), ExitTransition.Companion.getNone());
    }
}

