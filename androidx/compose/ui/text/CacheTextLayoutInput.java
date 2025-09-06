package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CacheTextLayoutInput {
    public static final int $stable;
    public final TextLayoutInput a;

    public CacheTextLayoutInput(@NotNull TextLayoutInput textLayoutInput0) {
        this.a = textLayoutInput0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput0 = this.a;
        if(!Intrinsics.areEqual(textLayoutInput0.getText(), ((CacheTextLayoutInput)object0).a.getText())) {
            return false;
        }
        if(!textLayoutInput0.getStyle().hasSameLayoutAffectingAttributes(((CacheTextLayoutInput)object0).a.getStyle())) {
            return false;
        }
        if(!Intrinsics.areEqual(textLayoutInput0.getPlaceholders(), ((CacheTextLayoutInput)object0).a.getPlaceholders())) {
            return false;
        }
        if(textLayoutInput0.getMaxLines() != ((CacheTextLayoutInput)object0).a.getMaxLines()) {
            return false;
        }
        if(textLayoutInput0.getSoftWrap() != ((CacheTextLayoutInput)object0).a.getSoftWrap()) {
            return false;
        }
        if(!TextOverflow.equals-impl0(textLayoutInput0.getOverflow-gIe3tQ8(), ((CacheTextLayoutInput)object0).a.getOverflow-gIe3tQ8())) {
            return false;
        }
        if(!Intrinsics.areEqual(textLayoutInput0.getDensity(), ((CacheTextLayoutInput)object0).a.getDensity())) {
            return false;
        }
        if(textLayoutInput0.getLayoutDirection() != ((CacheTextLayoutInput)object0).a.getLayoutDirection()) {
            return false;
        }
        if(textLayoutInput0.getFontFamilyResolver() != ((CacheTextLayoutInput)object0).a.getFontFamilyResolver()) {
            return false;
        }
        return Constraints.getMaxWidth-impl(textLayoutInput0.getConstraints-msEJaDk()) == Constraints.getMaxWidth-impl(((CacheTextLayoutInput)object0).a.getConstraints-msEJaDk()) ? Constraints.getMaxHeight-impl(textLayoutInput0.getConstraints-msEJaDk()) == Constraints.getMaxHeight-impl(((CacheTextLayoutInput)object0).a.getConstraints-msEJaDk()) : false;
    }

    @NotNull
    public final TextLayoutInput getTextLayoutInput() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release();
        return Constraints.getMaxHeight-impl(this.a.getConstraints-msEJaDk()) + (Constraints.getMaxWidth-impl(this.a.getConstraints-msEJaDk()) + (this.a.getFontFamilyResolver().hashCode() + (this.a.getLayoutDirection().hashCode() + (this.a.getDensity().hashCode() + (TextOverflow.hashCode-impl(this.a.getOverflow-gIe3tQ8()) + (Boolean.hashCode(this.a.getSoftWrap()) + (this.a.getMaxLines() + (this.a.getPlaceholders().hashCode() + (v + this.a.getText().hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }
}

