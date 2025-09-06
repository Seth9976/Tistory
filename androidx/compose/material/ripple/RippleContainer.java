package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.R.id;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import retrofit2.p;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001A\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001A\u001A\u00020\r*\u00020\u0016¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Landroidx/compose/material/ripple/RippleHostKey;", "Landroidx/compose/material/ripple/RippleHostView;", "getRippleHostView", "(Landroidx/compose/material/ripple/RippleHostKey;)Landroidx/compose/material/ripple/RippleHostView;", "disposeRippleIfNeeded", "(Landroidx/compose/material/ripple/RippleHostKey;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
public final class RippleContainer extends ViewGroup {
    public static final int $stable = 8;
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final p d;
    public int e;

    public RippleContainer(@NotNull Context context0) {
        super(context0);
        this.a = 5;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.c = arrayList1;
        this.d = new p();
        this.setClipChildren(false);
        RippleHostView rippleHostView0 = new RippleHostView(context0);
        this.addView(rippleHostView0);
        arrayList0.add(rippleHostView0);
        arrayList1.add(rippleHostView0);
        this.e = 1;
        this.setTag(id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(@NotNull RippleHostKey rippleHostKey0) {
        rippleHostKey0.onResetRippleHostView();
        p p0 = this.d;
        RippleHostView rippleHostView0 = (RippleHostView)((LinkedHashMap)p0.a).get(rippleHostKey0);
        if(rippleHostView0 != null) {
            rippleHostView0.disposeRipple();
            LinkedHashMap linkedHashMap0 = (LinkedHashMap)p0.a;
            RippleHostView rippleHostView1 = (RippleHostView)linkedHashMap0.get(rippleHostKey0);
            if(rippleHostView1 != null) {
                RippleHostKey rippleHostKey1 = (RippleHostKey)((LinkedHashMap)p0.b).remove(rippleHostView1);
            }
            linkedHashMap0.remove(rippleHostKey0);
            this.c.add(rippleHostView0);
        }
    }

    @NotNull
    public final RippleHostView getRippleHostView(@NotNull RippleHostKey rippleHostKey0) {
        p p0 = this.d;
        RippleHostView rippleHostView0 = (RippleHostView)((LinkedHashMap)p0.a).get(rippleHostKey0);
        if(rippleHostView0 != null) {
            return rippleHostView0;
        }
        RippleHostView rippleHostView1 = (RippleHostView)o.removeFirstOrNull(this.c);
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)p0.a;
        LinkedHashMap linkedHashMap1 = (LinkedHashMap)p0.b;
        if(rippleHostView1 == null) {
            ArrayList arrayList0 = this.b;
            if(this.e > CollectionsKt__CollectionsKt.getLastIndex(arrayList0)) {
                rippleHostView1 = new RippleHostView(this.getContext());
                this.addView(rippleHostView1);
                arrayList0.add(rippleHostView1);
            }
            else {
                rippleHostView1 = (RippleHostView)arrayList0.get(this.e);
                RippleHostKey rippleHostKey1 = (RippleHostKey)linkedHashMap1.get(rippleHostView1);
                if(rippleHostKey1 != null) {
                    rippleHostKey1.onResetRippleHostView();
                    RippleHostView rippleHostView2 = (RippleHostView)linkedHashMap0.get(rippleHostKey1);
                    if(rippleHostView2 != null) {
                        RippleHostKey rippleHostKey2 = (RippleHostKey)linkedHashMap1.remove(rippleHostView2);
                    }
                    linkedHashMap0.remove(rippleHostKey1);
                    rippleHostView1.disposeRipple();
                }
            }
            int v = this.e;
            this.e = v < this.a - 1 ? v + 1 : 0;
        }
        linkedHashMap0.put(rippleHostKey0, rippleHostView1);
        linkedHashMap1.put(rippleHostView1, rippleHostKey0);
        return rippleHostView1;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}

