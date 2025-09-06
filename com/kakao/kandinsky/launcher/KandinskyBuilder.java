package com.kakao.kandinsky.launcher;

import a5.b;
import android.content.Context;
import com.kakao.kandinsky.delegate.BitmapLoader;
import com.kakao.kandinsky.delegate.ImageLibrary;
import com.kakao.kdtracker.KDTracker;
import ja.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001B\u0010\b\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001B\u0010\u000B\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\u000B\u0010\tJ&\u0010\u000F\u001A\u00020\u00072\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyBuilder;", "", "<init>", "()V", "Lkotlin/Function0;", "Lcom/kakao/kandinsky/delegate/ImageLibrary;", "block", "", "imageLibrary", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/kakao/kandinsky/delegate/BitmapLoader;", "bitmapLoader", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/launcher/KandinskyBuilder$ServiceInfo;", "Lkotlin/ExtensionFunctionType;", "serviceInfo", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "build", "(Landroid/content/Context;)V", "ServiceInfo", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KandinskyBuilder {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\rJ8\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0017\u001A\u00020\u00022\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0003\u0010\u000B\"\u0004\b\u001B\u0010\u001CR\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\r\"\u0004\b \u0010!R\"\u0010\u0006\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010\u001E\u001A\u0004\b#\u0010\r\"\u0004\b$\u0010!R\"\u0010\u0007\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010\u001E\u001A\u0004\b&\u0010\r\"\u0004\b\'\u0010!¨\u0006("}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyBuilder$ServiceInfo;", "", "", "isDebug", "", "serviceKey", "serviceDomain", "serviceVersionName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/kandinsky/launcher/KandinskyBuilder$ServiceInfo;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "setDebug", "(Z)V", "b", "Ljava/lang/String;", "getServiceKey", "setServiceKey", "(Ljava/lang/String;)V", "c", "getServiceDomain", "setServiceDomain", "d", "getServiceVersionName", "setServiceVersionName", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ServiceInfo {
        public static final int $stable = 8;
        public boolean a;
        public String b;
        public String c;
        public String d;

        public ServiceInfo() {
            this(false, null, null, null, 15, null);
        }

        public ServiceInfo(boolean z, String s, String s1, String s2) {
            Intrinsics.checkNotNullParameter(s, "serviceKey");
            Intrinsics.checkNotNullParameter(s1, "serviceDomain");
            Intrinsics.checkNotNullParameter(s2, "serviceVersionName");
            super();
            this.a = z;
            this.b = s;
            this.c = s1;
            this.d = s2;
        }

        public ServiceInfo(boolean z, String s, String s1, String s2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                z = false;
            }
            if((v & 2) != 0) {
                s = "";
            }
            if((v & 4) != 0) {
                s1 = "";
            }
            if((v & 8) != 0) {
                s2 = "";
            }
            this(z, s, s1, s2);
        }

        public final boolean component1() {
            return this.a;
        }

        public final String component2() {
            return this.b;
        }

        public final String component3() {
            return this.c;
        }

        public final String component4() {
            return this.d;
        }

        public final ServiceInfo copy(boolean z, String s, String s1, String s2) {
            Intrinsics.checkNotNullParameter(s, "serviceKey");
            Intrinsics.checkNotNullParameter(s1, "serviceDomain");
            Intrinsics.checkNotNullParameter(s2, "serviceVersionName");
            return new ServiceInfo(z, s, s1, s2);
        }

        public static ServiceInfo copy$default(ServiceInfo kandinskyBuilder$ServiceInfo0, boolean z, String s, String s1, String s2, int v, Object object0) {
            if((v & 1) != 0) {
                z = kandinskyBuilder$ServiceInfo0.a;
            }
            if((v & 2) != 0) {
                s = kandinskyBuilder$ServiceInfo0.b;
            }
            if((v & 4) != 0) {
                s1 = kandinskyBuilder$ServiceInfo0.c;
            }
            if((v & 8) != 0) {
                s2 = kandinskyBuilder$ServiceInfo0.d;
            }
            return kandinskyBuilder$ServiceInfo0.copy(z, s, s1, s2);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ServiceInfo)) {
                return false;
            }
            if(this.a != ((ServiceInfo)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((ServiceInfo)object0).b)) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((ServiceInfo)object0).c) ? Intrinsics.areEqual(this.d, ((ServiceInfo)object0).d) : false;
        }

        public final String getServiceDomain() [...] // 潜在的解密器

        public final String getServiceKey() [...] // 潜在的解密器

        public final String getServiceVersionName() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            return this.d.hashCode() + q.c(q.c(Boolean.hashCode(this.a) * 0x1F, 0x1F, this.b), 0x1F, this.c);
        }

        public final boolean isDebug() {
            return this.a;
        }

        public final void setDebug(boolean z) {
            this.a = z;
        }

        public final void setServiceDomain(String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.c = s;
        }

        public final void setServiceKey(String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.b = s;
        }

        public final void setServiceVersionName(String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.d = s;
        }

        @Override
        public String toString() {
            boolean z = this.a;
            String s = this.b;
            String s1 = this.c;
            String s2 = this.d;
            StringBuilder stringBuilder0 = new StringBuilder("ServiceInfo(isDebug=");
            stringBuilder0.append(z);
            stringBuilder0.append(", serviceKey=");
            stringBuilder0.append(s);
            stringBuilder0.append(", serviceDomain=");
            return b.r(stringBuilder0, s1, ", serviceVersionName=", s2, ")");
        }
    }

    public static final int $stable = 8;
    public Function0 a;
    public Function0 b;
    public Function1 c;

    public KandinskyBuilder() {
        this.a = c.y;
        this.b = c.x;
        this.c = a.w;
    }

    public final void bitmapLoader(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.b = function00;
    }

    public final void build(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ImageLibrary imageLibrary0 = (ImageLibrary)this.a.invoke();
        BitmapLoader bitmapLoader0 = (BitmapLoader)this.b.invoke();
        Kandinsky.INSTANCE.initialize(context0, imageLibrary0, bitmapLoader0);
        ServiceInfo kandinskyBuilder$ServiceInfo0 = new ServiceInfo(false, null, null, null, 15, null);
        this.c.invoke(kandinskyBuilder$ServiceInfo0);
        KDTracker.INSTANCE.registerApplicationInfo(kandinskyBuilder$ServiceInfo0.isDebug(), "", "", "", "1.0.6");
    }

    public final void imageLibrary(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.a = function00;
    }

    public final void serviceInfo(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        this.c = function10;
    }
}

