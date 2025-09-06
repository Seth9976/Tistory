package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.selector.SelectorImageDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q9 extends Lambda implements Function0 {
    public final Object A;
    public final int w;
    public final Object x;
    public final int y;
    public final Object z;

    public q9(int v, int v1, Object object0, Object object1, Object object2) {
        this.w = v1;
        this.x = object0;
        this.y = v;
        this.A = object1;
        this.z = object2;
        super(0);
    }

    public q9(View view0, Ref ref0, int v, MutableIntState mutableIntState0) {
        this.w = 1;
        this.x = view0;
        this.A = ref0;
        this.y = v;
        this.z = mutableIntState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                int v = ExposedDropdownMenu_androidKt.access$calculateMaxHeight(ExposedDropdownMenu_androidKt.access$getWindowBounds(((View)this.x).getRootView()), ExposedDropdownMenu_androidKt.access$getAnchorBounds(ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$2(((MutableState)this.A))), this.y);
                ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$9(((MutableIntState)this.z), v);
                return Unit.INSTANCE;
            }
            case 1: {
                View view0 = ((View)this.x).getRootView();
                LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)((Ref)this.A).getValue();
                me me0 = new me(((MutableIntState)this.z), 3);
                androidx.compose.material.ExposedDropdownMenu_androidKt.access$updateHeight(view0, layoutCoordinates0, this.y, me0);
                return Unit.INSTANCE;
            }
            default: {
                String s = (String)this.x;
                if(s != null) {
                    MultipleImageSelectorKt.access$selectImageClickEvent(s);
                }
                SelectorImageDate selectorImageDate0 = (SelectorImageDate)this.A;
                if(this.y != selectorImageDate0.getIndex()) {
                    SnapshotStateList snapshotStateList0 = (SnapshotStateList)this.z;
                    if(snapshotStateList0.contains(selectorImageDate0.getIndex())) {
                        snapshotStateList0.remove(Integer.valueOf(selectorImageDate0.getIndex()));
                        return Unit.INSTANCE;
                    }
                    snapshotStateList0.add(selectorImageDate0.getIndex());
                }
                return Unit.INSTANCE;
            }
        }
    }
}

