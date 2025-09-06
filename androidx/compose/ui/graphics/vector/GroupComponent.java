package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import s.h1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0001\u00A2\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0012\u001A\u00020\u0007*\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR*\u0010\"\u001A\u00020\u001D2\u0006\u0010\u0018\u001A\u00020\u001D8\u0006@BX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R6\u0010,\u001A\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001A\b\u0012\u0004\u0012\u00020$0#8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R0\u00104\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010-8\u0010@\u0010X\u0090\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010:\u001A\u00020\u00142\u0006\u0010%\u001A\u00020\u00148\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u0016\"\u0004\b8\u00109R*\u0010B\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010=\u001A\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010J\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010=\u001A\u0004\bH\u0010?\"\u0004\bI\u0010AR*\u0010N\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010=\u001A\u0004\bL\u0010?\"\u0004\bM\u0010AR*\u0010R\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bO\u0010=\u001A\u0004\bP\u0010?\"\u0004\bQ\u0010AR*\u0010V\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bS\u0010=\u001A\u0004\bT\u0010?\"\u0004\bU\u0010AR*\u0010Z\u001A\u00020;2\u0006\u0010%\u001A\u00020;8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010=\u001A\u0004\bX\u0010?\"\u0004\bY\u0010AR\u0011\u0010]\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006^"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", "index", "instance", "", "insertAt", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "from", "to", "count", "move", "(III)V", "remove", "(II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "", "<set-?>", "d", "Z", "isTintable", "()Z", "Landroidx/compose/ui/graphics/Color;", "e", "J", "getTintColor-0d7_KjU", "()J", "tintColor", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "f", "Ljava/util/List;", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "clipPathData", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function1;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "invalidateListener", "k", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "name", "", "l", "F", "getRotation", "()F", "setRotation", "(F)V", "rotation", "m", "getPivotX", "setPivotX", "pivotX", "n", "getPivotY", "setPivotY", "pivotY", "o", "getScaleX", "setScaleX", "scaleX", "p", "getScaleY", "setScaleY", "scaleY", "q", "getTranslationX", "setTranslationX", "translationX", "r", "getTranslationY", "setTranslationY", "translationY", "getNumChildren", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,651:1\n696#2:652\n702#2:653\n272#3,8:654\n280#3:663\n282#3,4:670\n1#4:662\n33#5,6:664\n33#5,6:674\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n410#1:652\n411#1:653\n609#1:654,8\n609#1:663\n609#1:670,4\n616#1:664,6\n626#1:674,6\n*E\n"})
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    public float[] b;
    public final ArrayList c;
    public boolean d;
    public long e;
    public List f;
    public boolean g;
    public Path h;
    public Function1 i;
    public final h1 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public GroupComponent() {
        super(null);
        this.c = new ArrayList();
        this.d = true;
        this.e = 0L;
        this.f = VectorKt.getEmptyPath();
        this.g = true;
        this.j = new h1(this, 11);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    public final void a(long v) {
        if(!this.d) {
            return;
        }
        if(v != 16L) {
            long v1 = this.e;
            if(v1 == 16L) {
                this.e = v;
                return;
            }
            if(!VectorKt.rgbEqual--OWjLjI(v1, v)) {
                this.d = false;
                this.e = 0L;
            }
        }
    }

    public final void b(VNode vNode0) {
        if(vNode0 instanceof PathComponent) {
            Brush brush0 = ((PathComponent)vNode0).getFill();
            if(this.d && brush0 != null) {
                if(brush0 instanceof SolidColor) {
                    this.a(((SolidColor)brush0).getValue-0d7_KjU());
                }
                else {
                    this.d = false;
                    this.e = 0L;
                }
            }
            Brush brush1 = ((PathComponent)vNode0).getStroke();
            if(this.d && brush1 != null) {
                if(brush1 instanceof SolidColor) {
                    this.a(((SolidColor)brush1).getValue-0d7_KjU());
                    return;
                }
                this.d = false;
                this.e = 0L;
            }
        }
        else if(vNode0 instanceof GroupComponent) {
            if(((GroupComponent)vNode0).d && this.d) {
                this.a(((GroupComponent)vNode0).e);
                return;
            }
            this.d = false;
            this.e = 0L;
        }
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope0) {
        if(this.s) {
            float[] arr_f = this.b;
            if(arr_f == null) {
                arr_f = Matrix.constructor-impl$default(null, 1, null);
                this.b = arr_f;
            }
            else {
                Matrix.reset-impl(arr_f);
            }
            Matrix.translate-impl$default(arr_f, this.m + this.q, this.n + this.r, 0.0f, 4, null);
            Matrix.rotateZ-impl(arr_f, this.l);
            Matrix.scale-impl(arr_f, this.o, this.p, 1.0f);
            Matrix.translate-impl$default(arr_f, -this.m, -this.n, 0.0f, 4, null);
            this.s = false;
        }
        if(this.g) {
            if(!this.f.isEmpty()) {
                Path path0 = this.h;
                if(path0 == null) {
                    path0 = AndroidPath_androidKt.Path();
                    this.h = path0;
                }
                PathParserKt.toPath(this.f, path0);
            }
            this.g = false;
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            DrawTransform drawTransform0 = drawContext0.getTransform();
            float[] arr_f1 = this.b;
            if(arr_f1 != null) {
                drawTransform0.transform-58bKbWc(Matrix.box-impl(arr_f1).unbox-impl());
            }
            Path path1 = this.h;
            if(!this.f.isEmpty() && path1 != null) {
                DrawTransform.clipPath-mtrdD-E$default(drawTransform0, path1, 0, 2, null);
            }
            ArrayList arrayList0 = this.c;
            int v3 = arrayList0.size();
            for(int v = 0; v < v3; ++v) {
                ((VNode)arrayList0.get(v)).draw(drawScope0);
            }
        }
        finally {
            a.y(drawContext0, v1);
        }
    }

    @NotNull
    public final List getClipPathData() {
        return this.f;
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    @Nullable
    public Function1 getInvalidateListener$ui_release() {
        return this.i;
    }

    @NotNull
    public final String getName() {
        return this.k;
    }

    public final int getNumChildren() {
        return this.c.size();
    }

    public final float getPivotX() {
        return this.m;
    }

    public final float getPivotY() {
        return this.n;
    }

    public final float getRotation() {
        return this.l;
    }

    public final float getScaleX() {
        return this.o;
    }

    public final float getScaleY() {
        return this.p;
    }

    public final long getTintColor-0d7_KjU() {
        return this.e;
    }

    public final float getTranslationX() {
        return this.q;
    }

    public final float getTranslationY() {
        return this.r;
    }

    public final void insertAt(int v, @NotNull VNode vNode0) {
        ArrayList arrayList0 = this.c;
        if(v < this.getNumChildren()) {
            arrayList0.set(v, vNode0);
        }
        else {
            arrayList0.add(vNode0);
        }
        this.b(vNode0);
        vNode0.setInvalidateListener$ui_release(this.j);
        this.invalidate();
    }

    public final boolean isTintable() {
        return this.d;
    }

    public final void move(int v, int v1, int v2) {
        ArrayList arrayList0 = this.c;
        int v3 = 0;
        if(v > v1) {
            while(v3 < v2) {
                VNode vNode0 = (VNode)arrayList0.get(v);
                arrayList0.remove(v);
                arrayList0.add(v1, vNode0);
                ++v1;
                ++v3;
            }
        }
        else {
            while(v3 < v2) {
                VNode vNode1 = (VNode)arrayList0.get(v);
                arrayList0.remove(v);
                arrayList0.add(v1 - 1, vNode1);
                ++v3;
            }
        }
        this.invalidate();
    }

    public final void remove(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            ArrayList arrayList0 = this.c;
            if(v < arrayList0.size()) {
                ((VNode)arrayList0.get(v)).setInvalidateListener$ui_release(null);
                arrayList0.remove(v);
            }
        }
        this.invalidate();
    }

    public final void setClipPathData(@NotNull List list0) {
        this.f = list0;
        this.g = true;
        this.invalidate();
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@Nullable Function1 function10) {
        this.i = function10;
    }

    public final void setName(@NotNull String s) {
        this.k = s;
        this.invalidate();
    }

    public final void setPivotX(float f) {
        this.m = f;
        this.s = true;
        this.invalidate();
    }

    public final void setPivotY(float f) {
        this.n = f;
        this.s = true;
        this.invalidate();
    }

    public final void setRotation(float f) {
        this.l = f;
        this.s = true;
        this.invalidate();
    }

    public final void setScaleX(float f) {
        this.o = f;
        this.s = true;
        this.invalidate();
    }

    public final void setScaleY(float f) {
        this.p = f;
        this.s = true;
        this.invalidate();
    }

    public final void setTranslationX(float f) {
        this.q = f;
        this.s = true;
        this.invalidate();
    }

    public final void setTranslationY(float f) {
        this.r = f;
        this.s = true;
        this.invalidate();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("VGroup: ");
        stringBuilder0.append(this.k);
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            VNode vNode0 = (VNode)arrayList0.get(v1);
            stringBuilder0.append("\t");
            stringBuilder0.append(vNode0.toString());
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }
}

