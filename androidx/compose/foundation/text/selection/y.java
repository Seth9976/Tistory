package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TextKt;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidUriHandler;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavBackStackEntry;
import com.kakao.kandinsky.home.HomeScreenKt;
import com.kakao.sdk.auth.model.OAuthToken;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o4.t;
import p0.ab;
import p0.f0;
import p0.ya;
import r0.a;
import yd.n;

public final class y extends Lambda implements Function2 {
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public y(ContextMenuColors contextMenuColors0, Modifier modifier0, Function1 function10) {
        this.w = 11;
        this.z = contextMenuColors0;
        this.y = modifier0;
        this.x = function10;
        super(2);
    }

    public y(Object object0, Object object1, int v, Object object2) {
        this.w = v;
        this.y = object0;
        this.z = object1;
        this.x = object2;
        super(2);
    }

    public y(Map map0, Function2 function20, Density density0) {
        this.w = 7;
        this.y = map0;
        this.x = function20;
        this.z = density0;
        super(2);
    }

    public y(Function2 function20, Function2 function21, Function3 function30) {
        this.w = 8;
        this.x = function20;
        this.y = function21;
        this.z = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Object object4;
        ArrayList arrayList1;
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x37C17254, v, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:107)");
                }
                Modifier modifier0 = ((SelectionManager)this.z).getModifier();
                SimpleLayoutKt.SimpleLayout(((Modifier)this.y).then(modifier0), ComposableLambdaKt.rememberComposableLambda(0x51F9571E, true, new x(((Function2)this.x), ((SelectionManager)this.z)), ((Composer)object0), 54), ((Composer)object0), 0x30, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x57B729FC, v1, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
                }
                CompositionLocalsKt.ProvideCommonCompositionLocals(((AndroidComposeView)this.y), ((AndroidUriHandler)this.z), ((Function2)this.x), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x11D9F925, v2, -1, "com.kakao.kandinsky.home.HomeScreen.<anonymous> (HomeScreen.kt:94)");
                }
                HomeScreenKt.access$BottomBar(((ScrollState)this.y), ((List)this.z), ((Function1)this.x), ((Composer)object0), 0x40, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).floatValue();
                t t0 = new t(((Number)object0).floatValue(), ((SeekableTransitionState)this.z), ((NavBackStackEntry)this.x), null);
                BuildersKt.launch$default(((CoroutineScope)this.y), null, null, t0, 3, null);
                return Unit.INSTANCE;
            }
            case 4: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xCB64A1A, v3, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:727)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getMedium(((Composer)object0), 6)), ComposableLambdaKt.composableLambda(((Composer)object0), 600325466, true, new f0(((WindowInsets)this.y), ((PaddingValues)this.z), ((Function3)this.x))), ((Composer)object0), ProvidedValue.$stable | 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x72CFAF, v4, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:116)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(ButtonKt.access$Button$lambda$1(((State)this.y)))), ComposableLambdaKt.composableLambda(((Composer)object0), -1699085201, true, new aa.x(22, ((PaddingValues)this.z), ((Function3)this.x))), ((Composer)object0), ProvidedValue.$stable | 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 6: {
                int v5 = ((Number)object1).intValue();
                if((v5 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1665877604, v5, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:431)");
                }
                TextKt.ProvideTextStyle(TextStyle.copy-p1EtxEg$default(((TextStyle)this.y), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, ((LineHeightStyle)this.z), 0, 0, null, 0xEFFFFF, null), ((Function2)this.x), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 7: {
                float f = ((Number)object0).floatValue();
                float f1 = ((Number)object1).floatValue();
                Object object2 = kotlin.collections.x.getValue(((Map)this.y), f);
                Object object3 = kotlin.collections.x.getValue(((Map)this.y), f1);
                return ((ThresholdConfig)((Function2)this.x).invoke(object2, object3)).computeThreshold(((Density)this.z), f, f1);
            }
            case 8: {
                long v6 = ((Constraints)object1).unbox-impl();
                int v7 = Constraints.getMaxWidth-impl(v6);
                List list0 = ((SubcomposeMeasureScope)object0).subcompose(ab.a, ((Function2)this.x));
                int v8 = list0.size();
                int v9 = v7 / v8;
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v10 = list0.size();
                for(int v11 = 0; v11 < v10; v11 = a.f(((Measurable)list0.get(v11)), Constraints.copy-Zbe2FdA$default(v6, v9, v9, 0, 0, 12, null), arrayList0, v11, 1)) {
                }
                if(arrayList0.isEmpty()) {
                    arrayList1 = arrayList0;
                    object4 = null;
                }
                else {
                    arrayList1 = arrayList0;
                    object4 = arrayList1.get(0);
                    int v12 = ((Placeable)object4).getHeight();
                    int v13 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
                    if(1 <= v13) {
                        for(int v14 = 1; true; ++v14) {
                            Object object5 = arrayList1.get(v14);
                            int v15 = ((Placeable)object5).getHeight();
                            if(v12 < v15) {
                                object4 = object5;
                                v12 = v15;
                            }
                            if(v14 == v13) {
                                break;
                            }
                        }
                    }
                }
                int v16 = ((Placeable)object4) == null ? 0 : ((Placeable)object4).getHeight();
                ArrayList arrayList2 = new ArrayList(v8);
                for(int v17 = 0; v17 < v8; ++v17) {
                    arrayList2.add(new TabPosition(Dp.constructor-impl(((SubcomposeMeasureScope)object0).toDp-u2uoSUM(v9) * ((float)v17)), ((SubcomposeMeasureScope)object0).toDp-u2uoSUM(v9), null));
                }
                return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v7, v16, null, new ya(arrayList1, ((SubcomposeMeasureScope)object0), ((Function2)this.y), v9, v6, v16, ((Function3)this.z), arrayList2, v7), 4, null);
            }
            case 9: {
                int v18 = ((Number)object1).intValue();
                if((v18 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xED0A445B, v18, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:328)");
                }
                ((Composer)object0).startReplaceableGroup(0xD2F14342);
                ComposableLambda composableLambda0 = (ComposableLambda)this.y;
                if(composableLambda0 != null) {
                    composableLambda0.invoke(((Composer)object0), 0);
                }
                ((Composer)object0).endReplaceableGroup();
                ((ComposableLambda)this.z).invoke(((Composer)object0), 0);
                ((ComposableLambda)this.x).invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 10: {
                ((ObjectRef)this.y).element = (OAuthToken)object0;
                ((ObjectRef)this.z).element = (Throwable)object1;
                ((CountDownLatch)this.x).countDown();
                return Unit.INSTANCE;
            }
            case 11: {
                int v19 = ((Number)object1).intValue();
                if((v19 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2F709E7D, v19, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
                }
                ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0x44F1A924, true, new w0(8, ((ContextMenuColors)this.z), ((Function1)this.x)), ((Composer)object0), 54);
                ContextMenuUi_androidKt.ContextMenuColumn(((ContextMenuColors)this.z), ((Modifier)this.y), composableLambda1, ((Composer)object0), 0x180, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Path)object0), "directory");
                return ((IOException)object1) == null ? FileVisitResult.CONTINUE : n.access$copyToRecursively$error(((Function3)this.y), ((Path)this.z), ((Path)this.x), ((Path)object0), ((IOException)object1));
            }
        }
    }
}

