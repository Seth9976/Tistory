package ra;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.q9;
import androidx.compose.material3.td;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.selector.SelectorImageDate;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function4 {
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public g(String s, int v, SnapshotStateList snapshotStateList0) {
        this.w = 0;
        this.y = s;
        this.x = v;
        this.z = snapshotStateList0;
        super(4);
    }

    public g(Function1 function10, Function0 function00, int v) {
        this.w = 1;
        this.y = function10;
        this.z = function00;
        this.x = v;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        if(this.w != 0) {
            int v = ((Number)object3).intValue();
            Intrinsics.checkNotNullParameter(((Modifier)object0), "modifier");
            Intrinsics.checkNotNullParameter(((SelectorImageDate)object1), "item");
            int v1 = (v & 14) == 0 ? (((Composer)object2).changed(((Modifier)object0)) ? 4 : 2) | v : v;
            if((v & 0x70) == 0) {
                v1 |= (((Composer)object2).changed(((SelectorImageDate)object1)) ? 0x20 : 16);
            }
            if((v1 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
                ((Composer)object2).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2B154204, v1, -1, "com.kakao.kandinsky.selector.SingleImageSelector.<anonymous>.<anonymous> (SingleImageSelector.kt:48)");
            }
            ((Composer)object2).startReplaceGroup(0xC90DA567);
            Function1 function10 = (Function1)this.y;
            boolean z = ((Composer)object2).changed(function10);
            Function0 function00 = (Function0)this.z;
            boolean z1 = ((Composer)object2).changed(function00);
            td td0 = ((Composer)object2).rememberedValue();
            if(((v1 & 0x70) == 0x20 | z | z1) != 0 || td0 == Composer.Companion.getEmpty()) {
                td0 = new td(function10, ((SelectorImageDate)object1), 15, function00);
                ((Composer)object2).updateRememberedValue(td0);
            }
            ((Composer)object2).endReplaceGroup();
            SingleImageSelectorKt.access$ImageItem(ClickableKt.clickable-XHw0xAI$default(((Modifier)object0), false, null, null, td0, 7, null), ((SelectorImageDate)object1).getUri(), ((SelectorImageDate)object1).getIndex() == this.x, ((SelectorImageDate)object1).isEdited(), ((Composer)object2), 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v2 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((Modifier)object0), "modifier");
        Intrinsics.checkNotNullParameter(((SelectorImageDate)object1), "item");
        int v3 = (v2 & 14) == 0 ? (((Composer)object2).changed(((Modifier)object0)) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (((Composer)object2).changed(((SelectorImageDate)object1)) ? 0x20 : 16);
        }
        if((v3 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD4ED2A49, v3, -1, "com.kakao.kandinsky.selector.MultipleImageSelector.<anonymous>.<anonymous> (MultipleImageSelector.kt:61)");
        }
        ((Composer)object2).startReplaceGroup(0x8856006B);
        String s = (String)this.y;
        boolean z2 = ((Composer)object2).changed(s);
        int v4 = this.x;
        boolean z3 = ((Composer)object2).changed(v4);
        q9 q90 = ((Composer)object2).rememberedValue();
        SnapshotStateList snapshotStateList0 = (SnapshotStateList)this.z;
        if((z2 | z3 | ((v3 & 0x70) == 0x20 ? 1 : 0)) != 0 || q90 == Composer.Companion.getEmpty()) {
            q90 = new q9(v4, 2, s, ((SelectorImageDate)object1), snapshotStateList0);
            ((Composer)object2).updateRememberedValue(q90);
        }
        ((Composer)object2).endReplaceGroup();
        MultipleImageSelectorKt.access$ImageItem(ClickableKt.clickable-XHw0xAI$default(((Modifier)object0), false, null, null, q90, 7, null), ((SelectorImageDate)object1).getUri(), snapshotStateList0.contains(((SelectorImageDate)object1).getIndex()), ((Composer)object2), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

