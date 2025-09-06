package androidx.compose.ui.input.pointer;

import android.os.Build.VERSION;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x1.b;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000B\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010R \u0010\u0017\u001A\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0003\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui_release", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent", "", "pointerId", "", "endStream", "(I)V", "Landroid/util/SparseLongArray;", "b", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "motionEventToComposePointerIdMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MotionEventAdapter {
    public static final int $stable = 8;
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final ArrayList d;
    public int e;
    public int f;

    public MotionEventAdapter() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = -1;
        this.f = -1;
    }

    @Nullable
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@NotNull MotionEvent motionEvent0, @NotNull PositionCalculator positionCalculator0) {
        int v24;
        long v23;
        long v22;
        long v21;
        long v18;
        int v17;
        int v16;
        int v11;
        int v = motionEvent0.getActionMasked();
        SparseLongArray sparseLongArray0 = this.b;
        SparseBooleanArray sparseBooleanArray0 = this.c;
        if(v != 3 && v != 4) {
            if(motionEvent0.getPointerCount() == 1) {
                int v1 = motionEvent0.getToolType(0);
                int v2 = motionEvent0.getSource();
                if(v1 != this.e || v2 != this.f) {
                    this.e = v1;
                    this.f = v2;
                    sparseBooleanArray0.clear();
                    sparseLongArray0.clear();
                }
            }
            int v3 = motionEvent0.getActionMasked();
            if(v3 == 0) {
            label_22:
                int v6 = motionEvent0.getActionIndex();
                int v7 = motionEvent0.getPointerId(v6);
                if(sparseLongArray0.indexOfKey(v7) < 0) {
                    long v8 = this.a;
                    this.a = v8 + 1L;
                    sparseLongArray0.put(v7, v8);
                    if(motionEvent0.getToolType(v6) == 3) {
                        sparseBooleanArray0.put(v7, true);
                    }
                }
            }
            else {
                switch(v3) {
                    case 5: {
                        goto label_22;
                    }
                    case 9: {
                        int v4 = motionEvent0.getPointerId(0);
                        if(sparseLongArray0.indexOfKey(v4) < 0) {
                            long v5 = this.a;
                            this.a = v5 + 1L;
                            sparseLongArray0.put(v4, v5);
                        }
                    }
                }
            }
            int v9 = v == 9 || (v == 7 || v == 10) ? 1 : 0;
            int v10 = v == 8 ? 1 : 0;
            if(v9 != 0) {
                sparseBooleanArray0.put(motionEvent0.getPointerId(motionEvent0.getActionIndex()), true);
            }
            switch(v) {
                case 1: {
                    v11 = 0;
                    break;
                }
                case 6: {
                    v11 = motionEvent0.getActionIndex();
                    break;
                }
                default: {
                    v11 = -1;
                }
            }
            ArrayList arrayList0 = this.d;
            arrayList0.clear();
            int v12 = motionEvent0.getPointerCount();
            int v13 = 0;
            while(v13 < v12) {
                boolean z = v9 == 0 && v13 != v11 && (v10 == 0 || motionEvent0.getButtonState() != 0);
                int v14 = motionEvent0.getPointerId(v13);
                int v15 = sparseLongArray0.indexOfKey(v14);
                if(v15 >= 0) {
                    v16 = v9;
                    v17 = v10;
                    v18 = sparseLongArray0.valueAt(v15);
                }
                else {
                    v17 = v10;
                    v18 = this.a;
                    v16 = v9;
                    this.a = v18 + 1L;
                    sparseLongArray0.put(v14, v18);
                }
                float f = motionEvent0.getPressure(v13);
                long v19 = OffsetKt.Offset(motionEvent0.getX(v13), motionEvent0.getY(v13));
                long v20 = Offset.copy-dBAh8RU$default(v19, 0.0f, 0.0f, 3, null);
                if(v13 == 0) {
                    v21 = OffsetKt.Offset(motionEvent0.getRawX(), motionEvent0.getRawY());
                    v22 = v21;
                    v23 = positionCalculator0.screenToLocal-MK-Hz9U(v21);
                }
                else if(Build.VERSION.SDK_INT >= 29) {
                    v21 = b.a.a(motionEvent0, v13);
                    v22 = v21;
                    v23 = positionCalculator0.screenToLocal-MK-Hz9U(v21);
                }
                else {
                    v23 = v19;
                    v22 = positionCalculator0.localToScreen-MK-Hz9U(v19);
                }
                switch(motionEvent0.getToolType(v13)) {
                    case 0: {
                        v24 = 0;
                        break;
                    }
                    case 1: {
                        v24 = 1;
                        break;
                    }
                    case 2: {
                        v24 = 3;
                        break;
                    }
                    case 3: {
                        v24 = 2;
                        break;
                    }
                    case 4: {
                        v24 = 4;
                        break;
                    }
                    default: {
                        v24 = 0;
                    }
                }
                ArrayList arrayList1 = new ArrayList(motionEvent0.getHistorySize());
                int v25 = motionEvent0.getHistorySize();
                for(int v26 = 0; v26 < v25; ++v26) {
                    float f1 = motionEvent0.getHistoricalX(v13, v26);
                    float f2 = motionEvent0.getHistoricalY(v13, v26);
                    if(!Float.isInfinite(f1) && !Float.isNaN(f1) && !Float.isInfinite(f2) && !Float.isNaN(f2)) {
                        long v27 = OffsetKt.Offset(f1, f2);
                        arrayList1.add(new HistoricalChange(motionEvent0.getHistoricalEventTime(v26), v27, v27, null));
                    }
                }
                long v28 = motionEvent0.getActionMasked() == 8 ? OffsetKt.Offset(motionEvent0.getAxisValue(10), 0.0f - motionEvent0.getAxisValue(9)) : 0L;
                boolean z1 = sparseBooleanArray0.get(motionEvent0.getPointerId(v13), false);
                arrayList0.add(new PointerInputEventData(v18, motionEvent0.getEventTime(), v22, v23, z, f, v24, z1, arrayList1, v28, v20, null));
                ++v13;
                v10 = v17;
                v9 = v16;
            }
            switch(motionEvent0.getActionMasked()) {
                case 1: 
                case 6: {
                    int v29 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                    if(!sparseBooleanArray0.get(v29, false)) {
                        sparseLongArray0.delete(v29);
                        sparseBooleanArray0.delete(v29);
                    }
                }
            }
            if(sparseLongArray0.size() > motionEvent0.getPointerCount()) {
                int v30 = sparseLongArray0.size() - 1;
                while(-1 < v30) {
                    int v31 = sparseLongArray0.keyAt(v30);
                    int v32 = motionEvent0.getPointerCount();
                    int v33 = 0;
                    while(true) {
                        if(v33 < v32) {
                            if(motionEvent0.getPointerId(v33) == v31) {
                                break;
                            }
                            else {
                                ++v33;
                                continue;
                            }
                        }
                        sparseLongArray0.removeAt(v30);
                        sparseBooleanArray0.delete(v31);
                        break;
                    }
                    --v30;
                }
            }
            return new PointerInputEvent(motionEvent0.getEventTime(), arrayList0, motionEvent0);
        }
        sparseLongArray0.clear();
        sparseBooleanArray0.clear();
        return null;
    }

    public final void endStream(int v) {
        this.c.delete(v);
        this.b.delete(v);
    }

    @NotNull
    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.b;
    }

    @VisibleForTesting
    public static void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }
}

