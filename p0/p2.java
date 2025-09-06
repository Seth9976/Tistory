package p0;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class p2 extends Lambda implements Function3 {
    public static final p2 A;
    public static final p2 B;
    public static final p2 C;
    public static final p2 D;
    public static final p2 E;
    public final int w;
    public static final p2 x;
    public static final p2 y;
    public static final p2 z;

    static {
        p2.x = new p2(3, 0);
        p2.y = new p2(3, 1);
        p2.z = new p2(3, 2);
        p2.A = new p2(3, 3);
        p2.B = new p2(3, 4);
        p2.C = new p2(3, 5);
        p2.D = new p2(3, 6);
        p2.E = new p2(3, 7);
    }

    public p2(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                RowScope rowScope0 = (RowScope)object0;
                int v1 = ((Number)object2).intValue();
                if((v1 & 81) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDA1027FC, v1, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:89)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                RowScope rowScope1 = (RowScope)object0;
                int v2 = ((Number)object2).intValue();
                if((v2 & 81) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD1FD28AE, v2, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-2.<anonymous> (AppBar.kt:171)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                if((v3 & 14) == 0) {
                    v3 |= (((Composer)object1).changed(((SnackbarHostState)object0)) ? 4 : 2);
                }
                if((v3 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDAD0F74, v3, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda-1.<anonymous> (BackdropScaffold.kt:275)");
                }
                SnackbarHostKt.SnackbarHost(((SnackbarHostState)object0), null, null, ((Composer)object1), v3 & 14, 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v4 = ((Number)object2).intValue();
                if((v4 & 14) == 0) {
                    v4 |= (((Composer)object1).changed(((SnackbarHostState)object0)) ? 4 : 2);
                }
                if((v4 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239945703, v4, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:440)");
                }
                SnackbarHostKt.SnackbarHost(((SnackbarHostState)object0), null, null, ((Composer)object1), v4 & 14, 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v5 = ((Number)object2).intValue();
                if((v5 & 14) == 0) {
                    v5 |= (((Composer)object1).changed(((SnackbarHostState)object0)) ? 4 : 2);
                }
                if((v5 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x355D064C, v5, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:576)");
                }
                SnackbarHostKt.SnackbarHost(((SnackbarHostState)object0), null, null, ((Composer)object1), v5 & 14, 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v6 = ((Number)object2).intValue();
                if((v6 & 14) == 0) {
                    v6 |= (((Composer)object1).changed(((SnackbarHostState)object0)) ? 4 : 2);
                }
                if((v6 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2086581188, v6, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:190)");
                }
                SnackbarHostKt.SnackbarHost(((SnackbarHostState)object0), null, null, ((Composer)object1), v6 & 14, 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 6: {
                int v7 = ((Number)object2).intValue();
                if((v7 & 14) == 0) {
                    v7 |= (((Composer)object1).changed(((SnackbarHostState)object0)) ? 4 : 2);
                }
                if((v7 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xF73275D0, v7, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-7.<anonymous> (Scaffold.kt:318)");
                }
                SnackbarHostKt.SnackbarHost(((SnackbarHostState)object0), null, null, ((Composer)object1), v7 & 14, 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object2).intValue();
                if((v & 14) == 0) {
                    v |= (((Composer)object1).changed(((SnackbarData)object0)) ? 4 : 2);
                }
                if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(996639038, v, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
                }
                SnackbarKt.Snackbar-sPrSdHI(((SnackbarData)object0), null, false, null, 0L, 0L, 0L, 0.0f, ((Composer)object1), v & 14, 0xFE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

