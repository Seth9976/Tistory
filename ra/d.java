package ra;

import a4.c;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function4 {
    public final int w;
    public static final d x;
    public static final d y;
    public static final d z;

    static {
        d.x = new d(4, 0);
        d.y = new d(4, 1);
        d.z = new d(4, 2);
    }

    public d(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object3).intValue();
                Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$null");
                Intrinsics.checkNotNullParameter(((Function0)object1), "it");
                if((v1 & 641) == 0x80 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x231527BA, v1, -1, "com.kakao.kandinsky.selector.ComposableSingletons$SelectorBottomSheetKt.lambda-1.<anonymous> (SelectorBottomSheet.kt:21)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object3).intValue();
                Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$null");
                Intrinsics.checkNotNullParameter(((Function0)object1), "it");
                if((v2 & 641) == 0x80 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xB7595037, v2, -1, "com.kakao.kandinsky.selector.ComposableSingletons$SelectorBottomSheetKt.lambda-2.<anonymous> (SelectorBottomSheet.kt:22)");
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
                    ComposerKt.traceEventStart(-1417920030, v, -1, "com.kakao.kandinsky.selector.ComposableSingletons$SingleImageSelectorKt.lambda-2.<anonymous> (SingleImageSelector.kt:36)");
                }
                ((Composer)object2).startReplaceGroup(0x64BAA1D2);
                c c0 = ((Composer)object2).rememberedValue();
                if((v & 0x70) == 0x20 || c0 == Composer.Companion.getEmpty()) {
                    c0 = new c(((Function0)object1), 15);
                    ((Composer)object2).updateRememberedValue(c0);
                }
                ((Composer)object2).endReplaceGroup();
                SingleImageSelectorKt.access$TopBar(c0, ((Composer)object2), 0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

