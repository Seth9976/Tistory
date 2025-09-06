package com.kakao.tistory.presentation.screen.revenue.item;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.screen.blog.common.contract.a;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\fR\u001A\u0010#\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0012¨\u0006$"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportItem;", "", "", "earnings", "", "supporterCount", "supportCount", "<init>", "(FII)V", "component1", "()F", "component2", "()I", "component3", "copy", "(FII)Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getEarnings", "b", "I", "getSupporterCount", "c", "getSupportCount", "d", "Ljava/lang/String;", "getCurrency", "currency", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueSupportItem {
    public static final int $stable;
    public final float a;
    public final int b;
    public final int c;
    public final String d;

    public RevenueSupportItem() {
        this(0.0f, 0, 0, 7, null);
    }

    public RevenueSupportItem(float f, int v, int v1) {
        this.a = f;
        this.b = v;
        this.c = v1;
        this.d = "₩";
    }

    public RevenueSupportItem(float f, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            f = 0.0f;
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(f, v, v1);
    }

    public final float component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final RevenueSupportItem copy(float f, int v, int v1) {
        return new RevenueSupportItem(f, v, v1);
    }

    public static RevenueSupportItem copy$default(RevenueSupportItem revenueSupportItem0, float f, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            f = revenueSupportItem0.a;
        }
        if((v2 & 2) != 0) {
            v = revenueSupportItem0.b;
        }
        if((v2 & 4) != 0) {
            v1 = revenueSupportItem0.c;
        }
        return revenueSupportItem0.copy(f, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueSupportItem)) {
            return false;
        }
        if(Float.compare(this.a, ((RevenueSupportItem)object0).a) != 0) {
            return false;
        }
        return this.b == ((RevenueSupportItem)object0).b ? this.c == ((RevenueSupportItem)object0).c : false;
    }

    @NotNull
    public final String getCurrency() [...] // 潜在的解密器

    public final float getEarnings() {
        return this.a;
    }

    public final int getSupportCount() {
        return this.c;
    }

    public final int getSupporterCount() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c + a.a(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RevenueSupportItem(earnings=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", supporterCount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", supportCount=");
        return wb.a.c(this.c, ")", stringBuilder0);
    }
}

