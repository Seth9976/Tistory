package androidx.compose.material3;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BackdropValue;
import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.BottomDrawerValue;
import androidx.compose.ui.focus.FocusRequester;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.a;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p0.m0;
import p0.m3;
import p0.w3;

public final class jf extends Lambda implements Function0 {
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public jf(Object object0, Object object1, boolean z, int v) {
        this.w = v;
        this.y = object0;
        this.z = object1;
        this.x = z;
        super(0);
    }

    public jf(boolean z, Object object0, Object object1, int v) {
        this.w = v;
        this.x = z;
        this.y = object0;
        this.z = object1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                if(this.x) {
                    DrawerState drawerState1 = (DrawerState)this.y;
                    if(((Boolean)drawerState1.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed)).booleanValue()) {
                        if if0 = new if(drawerState1, null);
                        BuildersKt.launch$default(((CoroutineScope)this.z), null, null, if0, 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: {
                if(this.x) {
                    ((SavedStateRegistry)this.y).unregisterSavedStateProvider(((String)this.z));
                }
                return Unit.INSTANCE;
            }
            case 2: {
                CoreTextFieldKt.access$tapToFocus(((LegacyTextFieldState)this.y), ((FocusRequester)this.z), !this.x);
                return true;
            }
            case 3: {
                a.a(((a)this.y), ((NavBackStackEntry)this.z), this.x);
                return Unit.INSTANCE;
            }
            case 4: {
                if(this.x) {
                    BackdropScaffoldState backdropScaffoldState0 = (BackdropScaffoldState)this.y;
                    if(((Boolean)backdropScaffoldState0.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed)).booleanValue()) {
                        m0 m00 = new m0(backdropScaffoldState0, null);
                        BuildersKt.launch$default(((CoroutineScope)this.z), null, null, m00, 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
            case 5: {
                if(this.x) {
                    BottomDrawerState bottomDrawerState0 = (BottomDrawerState)this.y;
                    if(bottomDrawerState0.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                        m3 m30 = new m3(bottomDrawerState0, null);
                        BuildersKt.launch$default(((CoroutineScope)this.z), null, null, m30, 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
            default: {
                if(this.x) {
                    androidx.compose.material.DrawerState drawerState0 = (androidx.compose.material.DrawerState)this.y;
                    if(((Boolean)drawerState0.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(androidx.compose.material.DrawerValue.Closed)).booleanValue()) {
                        w3 w30 = new w3(drawerState0, null);
                        BuildersKt.launch$default(((CoroutineScope)this.z), null, null, w30, 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }
}

