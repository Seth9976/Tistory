package com.kakao.kandinsky.selector;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/selector/SelectorEvent;", "", "MultipleSelector", "SingleSelector", "Lcom/kakao/kandinsky/selector/SelectorEvent$MultipleSelector;", "Lcom/kakao/kandinsky/selector/SelectorEvent$SingleSelector;", "selector_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SelectorEvent {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BF\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\'\u0010\f\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0013\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014JU\u0010\u0015\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052)\b\u0002\u0010\f\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007H\u00C6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0012J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0012R8\u0010\f\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00078\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0014\u00A8\u0006)"}, d2 = {"Lcom/kakao/kandinsky/selector/SelectorEvent$MultipleSelector;", "Lcom/kakao/kandinsky/selector/SelectorEvent;", "", "Lcom/kakao/kandinsky/selector/SelectorImageDate;", "selectItems", "", "fixedIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "indexList", "", "onSelect", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Lcom/kakao/kandinsky/selector/SelectorEvent$MultipleSelector;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSelectItems", "b", "I", "getFixedIndex", "c", "Lkotlin/jvm/functions/Function1;", "getOnSelect", "selector_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MultipleSelector extends SelectorEvent {
        public static final int $stable = 8;
        public final List a;
        public final int b;
        public final Function1 c;

        public MultipleSelector(@NotNull List list0, int v, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(list0, "selectItems");
            Intrinsics.checkNotNullParameter(function10, "onSelect");
            super(null);
            this.a = list0;
            this.b = v;
            this.c = function10;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final Function1 component3() {
            return this.c;
        }

        @NotNull
        public final MultipleSelector copy(@NotNull List list0, int v, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(list0, "selectItems");
            Intrinsics.checkNotNullParameter(function10, "onSelect");
            return new MultipleSelector(list0, v, function10);
        }

        public static MultipleSelector copy$default(MultipleSelector selectorEvent$MultipleSelector0, List list0, int v, Function1 function10, int v1, Object object0) {
            if((v1 & 1) != 0) {
                list0 = selectorEvent$MultipleSelector0.a;
            }
            if((v1 & 2) != 0) {
                v = selectorEvent$MultipleSelector0.b;
            }
            if((v1 & 4) != 0) {
                function10 = selectorEvent$MultipleSelector0.c;
            }
            return selectorEvent$MultipleSelector0.copy(list0, v, function10);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MultipleSelector)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((MultipleSelector)object0).a)) {
                return false;
            }
            return this.b == ((MultipleSelector)object0).b ? Intrinsics.areEqual(this.c, ((MultipleSelector)object0).c) : false;
        }

        public final int getFixedIndex() {
            return this.b;
        }

        @NotNull
        public final Function1 getOnSelect() {
            return this.c;
        }

        @NotNull
        public final List getSelectItems() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "MultipleSelector(selectItems=" + this.a + ", fixedIndex=" + this.b + ", onSelect=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B@\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012!\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0015\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052#\b\u0002\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u0012J\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BHÖ\u0003¢\u0006\u0004\b\u001E\u0010\u001FR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0012R2\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lcom/kakao/kandinsky/selector/SelectorEvent$SingleSelector;", "Lcom/kakao/kandinsky/selector/SelectorEvent;", "", "Lcom/kakao/kandinsky/selector/SelectorImageDate;", "selectItems", "", "selectedIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "onSelect", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Lcom/kakao/kandinsky/selector/SelectorEvent$SingleSelector;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSelectItems", "b", "I", "getSelectedIndex", "c", "Lkotlin/jvm/functions/Function1;", "getOnSelect", "selector_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SingleSelector extends SelectorEvent {
        public static final int $stable = 8;
        public final List a;
        public final int b;
        public final Function1 c;

        public SingleSelector(@NotNull List list0, int v, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(list0, "selectItems");
            Intrinsics.checkNotNullParameter(function10, "onSelect");
            super(null);
            this.a = list0;
            this.b = v;
            this.c = function10;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final Function1 component3() {
            return this.c;
        }

        @NotNull
        public final SingleSelector copy(@NotNull List list0, int v, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(list0, "selectItems");
            Intrinsics.checkNotNullParameter(function10, "onSelect");
            return new SingleSelector(list0, v, function10);
        }

        public static SingleSelector copy$default(SingleSelector selectorEvent$SingleSelector0, List list0, int v, Function1 function10, int v1, Object object0) {
            if((v1 & 1) != 0) {
                list0 = selectorEvent$SingleSelector0.a;
            }
            if((v1 & 2) != 0) {
                v = selectorEvent$SingleSelector0.b;
            }
            if((v1 & 4) != 0) {
                function10 = selectorEvent$SingleSelector0.c;
            }
            return selectorEvent$SingleSelector0.copy(list0, v, function10);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SingleSelector)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((SingleSelector)object0).a)) {
                return false;
            }
            return this.b == ((SingleSelector)object0).b ? Intrinsics.areEqual(this.c, ((SingleSelector)object0).c) : false;
        }

        @NotNull
        public final Function1 getOnSelect() {
            return this.c;
        }

        @NotNull
        public final List getSelectItems() {
            return this.a;
        }

        public final int getSelectedIndex() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "SingleSelector(selectItems=" + this.a + ", selectedIndex=" + this.b + ", onSelect=" + this.c + ")";
        }
    }

    public static final int $stable;

    public SelectorEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

