package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0013\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000BJ%\u0010\u000E\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\r\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\u000E\u0010\u000FR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u000BR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u001C\u001A\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001D\u0010 \u001A\u00020\u001D8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001E\u0010\u0019\u001A\u0004\b\u001F\u0010\u001BR0\u0010\'\u001A\u00020!2\u0006\u0010\"\u001A\u00020!8\u0006@@X\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001A\u0004\b$\u0010\u001B\"\u0004\b%\u0010&R\u0016\u0010\r\u001A\u0004\u0018\u00010\f8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b(\u0010)\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "motionEvent", "copy", "(Ljava/util/List;Landroid/view/MotionEvent;)Landroidx/compose/ui/input/pointer/PointerEvent;", "a", "Ljava/util/List;", "getChanges", "b", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "Landroidx/compose/ui/input/pointer/PointerButtons;", "c", "I", "getButtons-ry648PA", "()I", "buttons", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "d", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerEventType;", "<set-?>", "e", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "type", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n97#1:209,6\n*E\n"})
public final class PointerEvent {
    public static final int $stable = 8;
    public final List a;
    public final InternalPointerEvent b;
    public final int c;
    public final int d;
    public int e;

    public PointerEvent(@NotNull List list0) {
        this(list0, null);
    }

    public PointerEvent(@NotNull List list0, @Nullable InternalPointerEvent internalPointerEvent0) {
        int v1;
        this.a = list0;
        this.b = internalPointerEvent0;
        MotionEvent motionEvent0 = this.getMotionEvent$ui_release();
        this.c = motionEvent0 == null ? 0 : motionEvent0.getButtonState();
        MotionEvent motionEvent1 = this.getMotionEvent$ui_release();
        this.d = motionEvent1 == null ? 0 : motionEvent1.getMetaState();
        MotionEvent motionEvent2 = this.getMotionEvent$ui_release();
        if(motionEvent2 == null) {
            int v2 = list0.size();
            for(int v = 0; v < v2; ++v) {
                PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v);
                if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                    v1 = 2;
                    break;
                }
                if(PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0)) {
                    v1 = 1;
                    break;
                }
            }
        }
        else {
            switch(motionEvent2.getActionMasked()) {
                case 0: 
                case 5: {
                    v1 = 1;
                    break;
                }
                case 1: 
                case 6: {
                    v1 = 2;
                    break;
                }
                case 2: 
                case 7: {
                    v1 = 3;
                    break;
                }
                case 8: {
                    v1 = 6;
                    break;
                }
                case 9: {
                    v1 = 4;
                    break;
                }
                case 10: {
                    v1 = 5;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        this.e = v1;
    }

    @NotNull
    public final List component1() {
        return this.a;
    }

    @NotNull
    public final PointerEvent copy(@NotNull List list0, @Nullable MotionEvent motionEvent0) {
        if(motionEvent0 == null) {
            return new PointerEvent(list0, null);
        }
        boolean z = Intrinsics.areEqual(motionEvent0, this.getMotionEvent$ui_release());
        InternalPointerEvent internalPointerEvent0 = this.b;
        if(z) {
            return new PointerEvent(list0, internalPointerEvent0);
        }
        LongSparseArray longSparseArray0 = new LongSparseArray(list0.size());
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
            longSparseArray0.put(pointerInputChange0.getId-J3iCeTQ(), pointerInputChange0);
            arrayList0.add(new PointerInputEventData(pointerInputChange0.getId-J3iCeTQ(), pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), pointerInputChange0.getPressure(), pointerInputChange0.getType-T8wyACA(), internalPointerEvent0 != null && internalPointerEvent0.activeHoverEvent-0FcD4WY(pointerInputChange0.getId-J3iCeTQ()), null, 0L, 0L, 0x700, null));
        }
        return new PointerEvent(list0, new InternalPointerEvent(longSparseArray0, new PointerInputEvent(motionEvent0.getEventTime(), arrayList0, motionEvent0)));
    }

    public final int getButtons-ry648PA() {
        return this.c;
    }

    @NotNull
    public final List getChanges() {
        return this.a;
    }

    @Nullable
    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.b;
    }

    public final int getKeyboardModifiers-k7X9c1A() {
        return this.d;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        return this.b == null ? null : this.b.getMotionEvent();
    }

    public final int getType-7fucELk() {
        return this.e;
    }

    public final void setType-EhbLWgg$ui_release(int v) {
        this.e = v;
    }
}

