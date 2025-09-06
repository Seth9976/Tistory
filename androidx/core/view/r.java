package androidx.core.view;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffectImpl.1.1.WhenMappings;
import androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectImpl.1.1.WhenMappings;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class r implements LifecycleEventObserver {
    public final int a;
    public final Object b;
    public final Serializable c;
    public final Object d;

    public r(Object object0, Serializable serializable0, Object object1, int v) {
        this.a = v;
        this.b = object0;
        this.c = serializable0;
        this.d = object1;
        super();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        switch(this.a) {
            case 0: {
                MenuHostHelper menuHostHelper0 = (MenuHostHelper)this.b;
                menuHostHelper0.getClass();
                State lifecycle$State0 = (State)this.c;
                Event lifecycle$Event1 = Event.upTo(lifecycle$State0);
                MenuProvider menuProvider0 = (MenuProvider)this.d;
                if(lifecycle$Event0 == lifecycle$Event1) {
                    menuHostHelper0.addMenuProvider(menuProvider0);
                    return;
                }
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    menuHostHelper0.removeMenuProvider(menuProvider0);
                    return;
                }
                if(lifecycle$Event0 == Event.downFrom(lifecycle$State0)) {
                    menuHostHelper0.b.remove(menuProvider0);
                    menuHostHelper0.a.run();
                }
                return;
            }
            case 1: {
                int v1 = LifecycleEffectKt.LifecycleResumeEffectImpl.1.1.WhenMappings.$EnumSwitchMapping$0[lifecycle$Event0.ordinal()];
                ObjectRef ref$ObjectRef1 = (ObjectRef)this.c;
                switch(v1) {
                    case 1: {
                        ref$ObjectRef1.element = ((Function1)this.d).invoke(((LifecycleResumePauseEffectScope)this.b));
                        return;
                    }
                    case 2: {
                        LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult0 = (LifecyclePauseOrDisposeEffectResult)ref$ObjectRef1.element;
                        if(lifecyclePauseOrDisposeEffectResult0 != null) {
                            lifecyclePauseOrDisposeEffectResult0.runPauseOrOnDisposeEffect();
                            return;
                        }
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            default: {
                int v = LifecycleEffectKt.LifecycleStartEffectImpl.1.1.WhenMappings.$EnumSwitchMapping$0[lifecycle$Event0.ordinal()];
                ObjectRef ref$ObjectRef0 = (ObjectRef)this.c;
                switch(v) {
                    case 1: {
                        ref$ObjectRef0.element = ((Function1)this.d).invoke(((LifecycleStartStopEffectScope)this.b));
                        return;
                    }
                    case 2: {
                        LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult0 = (LifecycleStopOrDisposeEffectResult)ref$ObjectRef0.element;
                        if(lifecycleStopOrDisposeEffectResult0 != null) {
                            lifecycleStopOrDisposeEffectResult0.runStopOrDisposeEffect();
                        }
                    }
                }
            }
        }
    }
}

