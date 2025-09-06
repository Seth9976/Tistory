package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002()B\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\u0004\b\u000B\u0010\fJ%\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\u000FJ=\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00102\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00102\u0006\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0014J8\u0010\u0019\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\u0016\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u00A2\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u0019\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\u0018\u0010\u0016\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u00A2\u0006\u0004\b\u0017\u0010\u001AJ\u0018\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\bH\u0086\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001E\u0010\u001D\u001A\u00020\u001C2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001FJ\u001C\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0 H\u0086\u0002\u00A2\u0006\u0004\b!\u0010\"J\u001E\u0010#\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002\u00A2\u0006\u0004\b#\u0010$J\'\u0010&\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\b2\b\u0010%\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b&\u0010\'\u00A8\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", "T", "", "<init>", "()V", "", "clear", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "interval", "Landroidx/compose/ui/graphics/Interval;", "findFirstOverlap", "(Lkotlin/ranges/ClosedFloatingPointRange;)Landroidx/compose/ui/graphics/Interval;", "start", "end", "(FF)Landroidx/compose/ui/graphics/Interval;", "", "results", "findOverlaps", "(Lkotlin/ranges/ClosedFloatingPointRange;Ljava/util/List;)Ljava/util/List;", "(FFLjava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "forEach$ui_graphics_release", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;)V", "forEach", "(FFLkotlin/jvm/functions/Function1;)V", "value", "", "contains", "(F)Z", "(Lkotlin/ranges/ClosedFloatingPointRange;)Z", "", "iterator", "()Ljava/util/Iterator;", "plusAssign", "(Landroidx/compose/ui/graphics/Interval;)V", "data", "addInterval", "(FFLjava/lang/Object;)V", "Node", "TreeColor", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,408:1\n171#1,16:409\n171#1,16:425\n171#1,16:441\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n121#1:409,16\n148#1:425,16\n160#1:441,16\n*E\n"})
public final class IntervalTree {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\r\u001A\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001A\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001E\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u0015\u001A\u0004\b\u001C\u0010\u0017\"\u0004\b\u001D\u0010\u0019R,\u0010$\u001A\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\f\"\u0004\b\"\u0010#R,\u0010(\u001A\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010 \u001A\u0004\b&\u0010\f\"\u0004\b\'\u0010#R,\u0010,\u001A\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b)\u0010 \u001A\u0004\b*\u0010\f\"\u0004\b+\u0010#¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "", "start", "end", "data", "Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "color", "<init>", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;Landroidx/compose/ui/graphics/IntervalTree$TreeColor;)V", "Landroidx/compose/ui/graphics/IntervalTree;", "lowestNode", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "next", "d", "Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "getColor", "()Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "setColor", "(Landroidx/compose/ui/graphics/IntervalTree$TreeColor;)V", "e", "F", "getMin", "()F", "setMin", "(F)V", "min", "f", "getMax", "setMax", "max", "g", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "getLeft", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "left", "h", "getRight", "setRight", "right", "i", "getParent", "setParent", "parent", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class Node extends Interval {
        public TreeColor d;
        public float e;
        public float f;
        public Node g;
        public Node h;
        public Node i;
        public final IntervalTree j;

        public Node(float f, float f1, @Nullable Object object0, @NotNull TreeColor intervalTree$TreeColor0) {
            super(f, f1, object0);
            this.d = intervalTree$TreeColor0;
            this.e = f;
            this.f = f1;
            this.g = intervalTree0.a;
            this.h = intervalTree0.a;
            this.i = intervalTree0.a;
        }

        @NotNull
        public final TreeColor getColor() {
            return this.d;
        }

        @NotNull
        public final Node getLeft() {
            return this.g;
        }

        public final float getMax() {
            return this.f;
        }

        public final float getMin() {
            return this.e;
        }

        @NotNull
        public final Node getParent() {
            return this.i;
        }

        @NotNull
        public final Node getRight() {
            return this.h;
        }

        @NotNull
        public final Node lowestNode() {
            Node intervalTree$Node0;
            for(intervalTree$Node0 = this; intervalTree$Node0.g != IntervalTree.this.a; intervalTree$Node0 = intervalTree$Node0.g) {
            }
            return intervalTree$Node0;
        }

        @NotNull
        public final Node next() {
            IntervalTree intervalTree0 = IntervalTree.this;
            if(this.h != intervalTree0.a) {
                return this.h.lowestNode();
            }
            Node intervalTree$Node0 = this.i;
            Node intervalTree$Node1 = this;
            while(intervalTree$Node0 != intervalTree0.a && intervalTree$Node1 == intervalTree$Node0.h) {
                intervalTree$Node1 = intervalTree$Node0;
                intervalTree$Node0 = intervalTree$Node0.i;
            }
            return intervalTree$Node0;
        }

        public final void setColor(@NotNull TreeColor intervalTree$TreeColor0) {
            this.d = intervalTree$TreeColor0;
        }

        public final void setLeft(@NotNull Node intervalTree$Node0) {
            this.g = intervalTree$Node0;
        }

        public final void setMax(float f) {
            this.f = f;
        }

        public final void setMin(float f) {
            this.e = f;
        }

        public final void setParent(@NotNull Node intervalTree$Node0) {
            this.i = intervalTree$Node0;
        }

        public final void setRight(@NotNull Node intervalTree$Node0) {
            this.h = intervalTree$Node0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "", "Red", "Black", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum TreeColor {
        Red,
        Black;

    }

    public final Node a;
    public Node b;
    public final ArrayList c;

    public IntervalTree() {
        Node intervalTree$Node0 = new Node(this, 3.402823E+38f, 1.401298E-45f, null, TreeColor.Black);
        this.a = intervalTree$Node0;
        this.b = intervalTree$Node0;
        this.c = new ArrayList();
    }

    public final void a(Node intervalTree$Node0) {
        Node intervalTree$Node1 = intervalTree$Node0.getRight();
        intervalTree$Node0.setRight(intervalTree$Node1.getLeft());
        Node intervalTree$Node2 = this.a;
        if(intervalTree$Node1.getLeft() != intervalTree$Node2) {
            intervalTree$Node1.getLeft().setParent(intervalTree$Node0);
        }
        intervalTree$Node1.setParent(intervalTree$Node0.getParent());
        if(intervalTree$Node0.getParent() == intervalTree$Node2) {
            this.b = intervalTree$Node1;
        }
        else if(intervalTree$Node0.getParent().getLeft() == intervalTree$Node0) {
            intervalTree$Node0.getParent().setLeft(intervalTree$Node1);
        }
        else {
            intervalTree$Node0.getParent().setRight(intervalTree$Node1);
        }
        intervalTree$Node1.setLeft(intervalTree$Node0);
        intervalTree$Node0.setParent(intervalTree$Node1);
        this.c(intervalTree$Node0);
    }

    public final void addInterval(float f, float f1, @Nullable Object object0) {
        Node intervalTree$Node0 = new Node(this, f, f1, object0, TreeColor.Red);
        Node intervalTree$Node1 = this.b;
        Node intervalTree$Node2 = this.a;
        Node intervalTree$Node3 = intervalTree$Node2;
        while(intervalTree$Node1 != intervalTree$Node2) {
            intervalTree$Node3 = intervalTree$Node1;
            intervalTree$Node1 = intervalTree$Node0.getStart() <= intervalTree$Node1.getStart() ? intervalTree$Node1.getLeft() : intervalTree$Node1.getRight();
        }
        intervalTree$Node0.setParent(intervalTree$Node3);
        if(intervalTree$Node3 == intervalTree$Node2) {
            this.b = intervalTree$Node0;
        }
        else if(intervalTree$Node0.getStart() <= intervalTree$Node3.getStart()) {
            intervalTree$Node3.setLeft(intervalTree$Node0);
        }
        else {
            intervalTree$Node3.setRight(intervalTree$Node0);
        }
        this.c(intervalTree$Node0);
        while(intervalTree$Node0 != this.b) {
            TreeColor intervalTree$TreeColor0 = TreeColor.Red;
            if(intervalTree$Node0.getParent().getColor() != intervalTree$TreeColor0) {
                break;
            }
            Node intervalTree$Node4 = intervalTree$Node0.getParent().getParent();
            if(intervalTree$Node0.getParent() == intervalTree$Node4.getLeft()) {
                Node intervalTree$Node5 = intervalTree$Node4.getRight();
                if(intervalTree$Node5.getColor() == intervalTree$TreeColor0) {
                    intervalTree$Node5.setColor(TreeColor.Black);
                    intervalTree$Node0.getParent().setColor(TreeColor.Black);
                    intervalTree$Node4.setColor(intervalTree$TreeColor0);
                    intervalTree$Node0 = intervalTree$Node4;
                }
                else {
                    if(intervalTree$Node0 == intervalTree$Node0.getParent().getRight()) {
                        Node intervalTree$Node6 = intervalTree$Node0.getParent();
                        this.a(intervalTree$Node6);
                        intervalTree$Node0 = intervalTree$Node6;
                    }
                    intervalTree$Node0.getParent().setColor(TreeColor.Black);
                    intervalTree$Node4.setColor(intervalTree$TreeColor0);
                    this.b(intervalTree$Node4);
                }
                continue;
            }
            else {
                Node intervalTree$Node7 = intervalTree$Node4.getLeft();
                if(intervalTree$Node7.getColor() == intervalTree$TreeColor0) {
                    intervalTree$Node7.setColor(TreeColor.Black);
                    intervalTree$Node0.getParent().setColor(TreeColor.Black);
                    intervalTree$Node4.setColor(intervalTree$TreeColor0);
                }
                else {
                    goto label_43;
                }
            }
            intervalTree$Node0 = intervalTree$Node4;
            continue;
        label_43:
            if(intervalTree$Node0 == intervalTree$Node0.getParent().getLeft()) {
                Node intervalTree$Node8 = intervalTree$Node0.getParent();
                this.b(intervalTree$Node8);
                intervalTree$Node0 = intervalTree$Node8;
            }
            intervalTree$Node0.getParent().setColor(TreeColor.Black);
            intervalTree$Node4.setColor(intervalTree$TreeColor0);
            this.a(intervalTree$Node4);
        }
        this.b.setColor(TreeColor.Black);
    }

    public final void b(Node intervalTree$Node0) {
        Node intervalTree$Node1 = intervalTree$Node0.getLeft();
        intervalTree$Node0.setLeft(intervalTree$Node1.getRight());
        Node intervalTree$Node2 = this.a;
        if(intervalTree$Node1.getRight() != intervalTree$Node2) {
            intervalTree$Node1.getRight().setParent(intervalTree$Node0);
        }
        intervalTree$Node1.setParent(intervalTree$Node0.getParent());
        if(intervalTree$Node0.getParent() == intervalTree$Node2) {
            this.b = intervalTree$Node1;
        }
        else if(intervalTree$Node0.getParent().getRight() == intervalTree$Node0) {
            intervalTree$Node0.getParent().setRight(intervalTree$Node1);
        }
        else {
            intervalTree$Node0.getParent().setLeft(intervalTree$Node1);
        }
        intervalTree$Node1.setRight(intervalTree$Node0);
        intervalTree$Node0.setParent(intervalTree$Node1);
        this.c(intervalTree$Node0);
    }

    public final void c(Node intervalTree$Node0) {
        while(intervalTree$Node0 != this.a) {
            intervalTree$Node0.setMin(Math.min(intervalTree$Node0.getStart(), Math.min(intervalTree$Node0.getLeft().getMin(), intervalTree$Node0.getRight().getMin())));
            intervalTree$Node0.setMax(Math.max(intervalTree$Node0.getEnd(), Math.max(intervalTree$Node0.getLeft().getMax(), intervalTree$Node0.getRight().getMax())));
            intervalTree$Node0 = intervalTree$Node0.getParent();
        }
    }

    public final void clear() {
        this.b = this.a;
    }

    public final boolean contains(float f) {
        return this.findFirstOverlap(f, f) != IntervalTreeKt.getEmptyInterval();
    }

    public final boolean contains(@NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        return this.findFirstOverlap(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    @NotNull
    public final Interval findFirstOverlap(float f, float f1) {
        if(this.b != this.a && this.b != this.a) {
            ArrayList arrayList0 = this.c;
            arrayList0.add(this.b);
            while(arrayList0.size() > 0) {
                Interval interval0 = (Node)o.removeLast(arrayList0);
                if(interval0.overlaps(f, f1)) {
                    return interval0;
                }
                if(((Node)interval0).getLeft() != this.a && ((Node)interval0).getLeft().getMax() >= f) {
                    arrayList0.add(((Node)interval0).getLeft());
                }
                if(((Node)interval0).getRight() != this.a && ((Node)interval0).getRight().getMin() <= f1) {
                    arrayList0.add(((Node)interval0).getRight());
                }
            }
            arrayList0.clear();
        }
        Interval interval1 = IntervalTreeKt.getEmptyInterval();
        Intrinsics.checkNotNull(interval1, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return interval1;
    }

    @NotNull
    public final Interval findFirstOverlap(@NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        return this.findFirstOverlap(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue());
    }

    public static Interval findFirstOverlap$default(IntervalTree intervalTree0, float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = f;
        }
        return intervalTree0.findFirstOverlap(f, f1);
    }

    @NotNull
    public final List findOverlaps(float f, float f1, @NotNull List list0) {
        if(this.b != this.a) {
            ArrayList arrayList0 = this.c;
            arrayList0.add(this.b);
            while(arrayList0.size() > 0) {
                Node intervalTree$Node0 = (Node)o.removeLast(arrayList0);
                if(intervalTree$Node0.overlaps(f, f1)) {
                    list0.add(intervalTree$Node0);
                }
                if(intervalTree$Node0.getLeft() != this.a && intervalTree$Node0.getLeft().getMax() >= f) {
                    arrayList0.add(intervalTree$Node0.getLeft());
                }
                if(intervalTree$Node0.getRight() != this.a && intervalTree$Node0.getRight().getMin() <= f1) {
                    arrayList0.add(intervalTree$Node0.getRight());
                }
            }
            arrayList0.clear();
        }
        return list0;
    }

    @NotNull
    public final List findOverlaps(@NotNull ClosedFloatingPointRange closedFloatingPointRange0, @NotNull List list0) {
        return this.findOverlaps(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), list0);
    }

    public static List findOverlaps$default(IntervalTree intervalTree0, float f, float f1, List list0, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = f;
        }
        if((v & 4) != 0) {
            list0 = new ArrayList();
        }
        return intervalTree0.findOverlaps(f, f1, list0);
    }

    public static List findOverlaps$default(IntervalTree intervalTree0, ClosedFloatingPointRange closedFloatingPointRange0, List list0, int v, Object object0) {
        if((v & 2) != 0) {
            list0 = new ArrayList();
        }
        return intervalTree0.findOverlaps(closedFloatingPointRange0, list0);
    }

    public final void forEach$ui_graphics_release(float f, float f1, @NotNull Function1 function10) {
        if(this.b != this.a) {
            ArrayList arrayList0 = this.c;
            arrayList0.add(this.b);
            while(arrayList0.size() > 0) {
                Node intervalTree$Node0 = (Node)o.removeLast(arrayList0);
                if(intervalTree$Node0.overlaps(f, f1)) {
                    function10.invoke(intervalTree$Node0);
                }
                if(intervalTree$Node0.getLeft() != this.a && intervalTree$Node0.getLeft().getMax() >= f) {
                    arrayList0.add(intervalTree$Node0.getLeft());
                }
                if(intervalTree$Node0.getRight() != this.a && intervalTree$Node0.getRight().getMin() <= f1) {
                    arrayList0.add(intervalTree$Node0.getRight());
                }
            }
            arrayList0.clear();
        }
    }

    public final void forEach$ui_graphics_release(@NotNull ClosedFloatingPointRange closedFloatingPointRange0, @NotNull Function1 function10) {
        float f = ((Number)closedFloatingPointRange0.getStart()).floatValue();
        float f1 = ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue();
        if(this.b != this.a) {
            ArrayList arrayList0 = this.c;
            arrayList0.add(this.b);
            while(arrayList0.size() > 0) {
                Node intervalTree$Node0 = (Node)o.removeLast(arrayList0);
                if(intervalTree$Node0.overlaps(f, f1)) {
                    function10.invoke(intervalTree$Node0);
                }
                if(intervalTree$Node0.getLeft() != this.a && intervalTree$Node0.getLeft().getMax() >= f) {
                    arrayList0.add(intervalTree$Node0.getLeft());
                }
                if(intervalTree$Node0.getRight() != this.a && intervalTree$Node0.getRight().getMin() <= f1) {
                    arrayList0.add(intervalTree$Node0.getRight());
                }
            }
            arrayList0.clear();
        }
    }

    public static void forEach$ui_graphics_release$default(IntervalTree intervalTree0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = f;
        }
        if(intervalTree0.b != intervalTree0.a) {
            ArrayList arrayList0 = intervalTree0.c;
            arrayList0.add(intervalTree0.b);
            while(arrayList0.size() > 0) {
                Node intervalTree$Node0 = (Node)o.removeLast(arrayList0);
                if(intervalTree$Node0.overlaps(f, f1)) {
                    function10.invoke(intervalTree$Node0);
                }
                if(intervalTree$Node0.getLeft() != intervalTree0.a && intervalTree$Node0.getLeft().getMax() >= f) {
                    arrayList0.add(intervalTree$Node0.getLeft());
                }
                if(intervalTree$Node0.getRight() != intervalTree0.a && intervalTree$Node0.getRight().getMin() <= f1) {
                    arrayList0.add(intervalTree$Node0.getRight());
                }
            }
            arrayList0.clear();
        }
    }

    @NotNull
    public final Iterator iterator() {
        return new Object() {
            public Node a;
            public final IntervalTree b;

            {
                this.b = intervalTree0;
                this.a = intervalTree0.b.lowestNode();
            }

            @NotNull
            public final Node getNext() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a != this.b.a;
            }

            @NotNull
            public Interval next() {
                Interval interval0 = this.a;
                this.a = ((Node)interval0).next();
                return interval0;
            }

            @Override
            public Object next() {
                return this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setNext(@NotNull Node intervalTree$Node0) {
                this.a = intervalTree$Node0;
            }
        };
    }

    public final void plusAssign(@NotNull Interval interval0) {
        this.addInterval(interval0.getStart(), interval0.getEnd(), interval0.getData());
    }
}

