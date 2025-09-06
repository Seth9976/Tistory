package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@ExperimentalMaterial3Api
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014R \u0010\u0006\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u0019\u0010\u001A\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/material3/SearchBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "<init>", "(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getDividerColor-0d7_KjU", "c", "Landroidx/compose/material3/TextFieldColors;", "getInputFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "getInputFieldColors$annotations", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SearchBarColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final TextFieldColors c;

    @Deprecated(message = "Search bars now take the input field as a parameter. TextFieldColors should be passed explicitly to the input field. The `inputFieldColors` parameter will be removed in a future version of the library.")
    public SearchBarColors(long v, long v1, TextFieldColors textFieldColors0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = textFieldColors0;
    }

    public SearchBarColors(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, SearchBar_androidKt.access$getUnspecifiedTextFieldColors$p(), null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SearchBarColors)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((SearchBarColors)object0).a)) {
            return false;
        }
        return Color.equals-impl0(this.b, ((SearchBarColors)object0).b) ? Intrinsics.areEqual(this.c, ((SearchBarColors)object0).c) : false;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getDividerColor-0d7_KjU() {
        return this.b;
    }

    @NotNull
    public final TextFieldColors getInputFieldColors() {
        return this.c;
    }

    @Deprecated(message = "Search bars now take the input field as a parameter. TextFieldColors should be passed explicitly to the input field. The `inputFieldColors` property will be removed in a future version of the library.")
    public static void getInputFieldColors$annotations() {
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F);
    }
}

