package ca;

import androidx.activity.g0;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import androidx.navigation.compose.NavHostKt;
import androidx.navigation.compose.d;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p9.a;

public final class a1 extends Lambda implements Function4 {
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public a1(Object object0, Object object1, int v, Object object2) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        switch(this.w) {
            case 0: {
                int v3 = ((Number)object1).intValue();
                int v4 = ((Number)object3).intValue();
                Intrinsics.checkNotNullParameter(((PagerScope)object0), "$this$HorizontalPager");
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xAF05B817, v4, -1, "com.kakao.kandinsky.designsystem.common.Pager.<anonymous> (ItemSlider.kt:256)");
                }
                ((Composer)object2).startReplaceGroup(0x9AF8C089);
                State state0 = ((Composer)object2).rememberedValue();
                if(state0 == Composer.Companion.getEmpty()) {
                    state0 = SnapshotStateKt.derivedStateOf(new z0(v3, ((PagerState)this.z), 0));
                    ((Composer)object2).updateRememberedValue(state0);
                }
                ((Composer)object2).endReplaceGroup();
                Object object4 = state0.getValue();
                ((Boolean)object4).getClass();
                ((Function5)this.x).invoke(((Orientation)this.y), ((Boolean)object4), v3, ((Composer)object2), ((int)(v4 << 3 & 0x380 | 0xC00)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
                int v5 = ((Number)object3).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(820763100, v5, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:680)");
                }
                if(!NavHostKt.access$NavHost$lambda$11(((MutableState)this.y))) {
                    Object object5 = null;
                    List list0 = NavHostKt.access$NavHost$lambda$17(((State)this.z));
                    ListIterator listIterator0 = list0.listIterator(list0.size());
                    while(listIterator0.hasPrevious()) {
                        Object object6 = listIterator0.previous();
                        if(Intrinsics.areEqual(navBackStackEntry0, ((NavBackStackEntry)object6))) {
                            object5 = object6;
                            break;
                        }
                    }
                    navBackStackEntry0 = (NavBackStackEntry)object5;
                }
                if(navBackStackEntry0 != null) {
                    ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xB4B00A4D, true, new d(navBackStackEntry0, ((AnimatedContentScope)object0)), ((Composer)object2), 54);
                    NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry0, ((SaveableStateHolder)this.x), composableLambda0, ((Composer)object2), 0x180);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object3).intValue();
                Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SelectorBottomSheet");
                Intrinsics.checkNotNullParameter(((Function0)object1), "dismiss");
                if((v & 0x70) == 0) {
                    v |= (((Composer)object2).changedInstance(((Function0)object1)) ? 0x20 : 16);
                }
                if((v & 721) == 0x90 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-661769301, v, -1, "com.kakao.kandinsky.selector.MultipleImageSelector.<anonymous> (MultipleImageSelector.kt:46)");
                }
                SnapshotStateList snapshotStateList0 = (SnapshotStateList)this.x;
                int v1 = snapshotStateList0.size();
                ((Composer)object2).startReplaceGroup(1011168313);
                String s = (String)this.y;
                boolean z = ((Composer)object2).changed(s);
                int v2 = 0;
                a a0 = ((Composer)object2).rememberedValue();
                if(z || (v & 0x70) == 0x20 || a0 == Composer.Companion.getEmpty()) {
                    a0 = new a(2, s, ((Function0)object1));
                    ((Composer)object2).updateRememberedValue(a0);
                }
                ((Composer)object2).endReplaceGroup();
                ((Composer)object2).startReplaceGroup(1011168455);
                boolean z1 = ((Composer)object2).changed(s);
                Function1 function10 = (Function1)this.z;
                boolean z2 = ((Composer)object2).changed(function10);
                if((v & 0x70) == 0x20) {
                    v2 = 1;
                }
                g0 g00 = ((Composer)object2).rememberedValue();
                if((z1 | z2 | v2) != 0 || g00 == Composer.Companion.getEmpty()) {
                    g0 g01 = new g0(8, s, function10, snapshotStateList0, ((Function0)object1));
                    ((Composer)object2).updateRememberedValue(g01);
                    g00 = g01;
                }
                ((Composer)object2).endReplaceGroup();
                MultipleImageSelectorKt.access$TopBar(v1, a0, g00, ((Composer)object2), 0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

