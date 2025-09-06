package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001A\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000F\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\"\u0010\u0013\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001A\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000ER\"\u0010\u0017\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001A\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000ER$\u0010\u001D\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u0004\"\u0004\b\u001B\u0010\u001CR\"\u0010!\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\n\u001A\u0004\b\u001F\u0010\f\"\u0004\b \u0010\u000E¨\u0006\""}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "next", "()Lkotlin/ranges/IntRange;", "", "hasNext", "()Z", "", "a", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "b", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "c", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "d", "Lkotlin/ranges/IntRange;", "getNextItem", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", "e", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DelimitedRangesSequence.iterator.1 implements Iterator, KMappedMarker {
    public int a;
    public int b;
    public int c;
    public IntRange d;
    public int e;
    public final d f;

    public DelimitedRangesSequence.iterator.1(d d0) {
        this.f = d0;
        this.a = -1;
        int v = d0.a.length();
        int v1 = c.coerceIn(d0.b, 0, v);
        this.b = v1;
        this.c = v1;
    }

    public final void a() {
        int v = this.c;
        int v1 = 0;
        if(v < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        d d0 = this.f;
        int v2 = d0.c;
        CharSequence charSequence0 = d0.a;
        if(v2 > 0) {
            int v3 = this.e + 1;
            this.e = v3;
            if(v3 >= v2) {
                this.d = new IntRange(this.b, StringsKt__StringsKt.getLastIndex(charSequence0));
                this.c = -1;
                this.a = 1;
                return;
            }
            goto label_16;
        }
        else {
        label_16:
            if(v > charSequence0.length()) {
                this.d = new IntRange(this.b, StringsKt__StringsKt.getLastIndex(charSequence0));
                this.c = -1;
            }
            else {
                Pair pair0 = (Pair)((Function2)d0.d).invoke(charSequence0, this.c);
                if(pair0 == null) {
                    this.d = new IntRange(this.b, StringsKt__StringsKt.getLastIndex(charSequence0));
                    this.c = -1;
                }
                else {
                    int v4 = ((Number)pair0.component1()).intValue();
                    int v5 = ((Number)pair0.component2()).intValue();
                    this.d = c.until(this.b, v4);
                    int v6 = v4 + v5;
                    this.b = v6;
                    if(v5 == 0) {
                        v1 = 1;
                    }
                    this.c = v6 + v1;
                }
            }
        }
        this.a = 1;
    }

    public final int getCounter() {
        return this.e;
    }

    public final int getCurrentStartIndex() {
        return this.b;
    }

    @Nullable
    public final IntRange getNextItem() {
        return this.d;
    }

    public final int getNextSearchIndex() {
        return this.c;
    }

    public final int getNextState() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        if(this.a == -1) {
            this.a();
        }
        return this.a == 1;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @NotNull
    public IntRange next() {
        if(this.a == -1) {
            this.a();
        }
        if(this.a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange0 = this.d;
        Intrinsics.checkNotNull(intRange0, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.a = -1;
        return intRange0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCounter(int v) {
        this.e = v;
    }

    public final void setCurrentStartIndex(int v) {
        this.b = v;
    }

    public final void setNextItem(@Nullable IntRange intRange0) {
        this.d = intRange0;
    }

    public final void setNextSearchIndex(int v) {
        this.c = v;
    }

    public final void setNextState(int v) {
        this.a = v;
    }
}

