package androidx.navigation.serialization;

import a5.b;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import l1.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001F\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ-\u0010\u0012\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000F¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0016\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000F2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder;", "T", "", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "path", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)V", "build", "()Ljava/lang/String;", "", "index", "name", "Landroidx/navigation/NavType;", "type", "", "appendPattern", "(ILjava/lang/String;Landroidx/navigation/NavType;)V", "", "value", "appendArg", "(ILjava/lang/String;Landroidx/navigation/NavType;Ljava/util/List;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRouteBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n*S KotlinDebug\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n*L\n88#1:112,2\n*E\n"})
public final class RouteBuilder {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[a.d(2).length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final KSerializer a;
    public final String b;
    public String c;
    public String d;

    public RouteBuilder(@NotNull String s, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(s, "path");
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        super();
        this.c = "";
        this.d = "";
        this.a = kSerializer0;
        this.b = s;
    }

    public RouteBuilder(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        super();
        this.c = "";
        this.d = "";
        this.a = kSerializer0;
        this.b = kSerializer0.getDescriptor().getSerialName();
    }

    public final void a(String s, String s1) {
        String s2 = this.d.length() == 0 ? "?" : "&";
        this.d = this.d + s2 + s + '=' + s1;
    }

    public final void appendArg(int v, @NotNull String s, @NotNull NavType navType0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(navType0, "type");
        Intrinsics.checkNotNullParameter(list0, "value");
        switch(a.c((navType0 instanceof CollectionNavType || this.a.getDescriptor().isElementOptional(v) ? 2 : 1))) {
            case 0: {
                if(list0.size() == 1) {
                    String s1 = (String)CollectionsKt___CollectionsKt.first(list0);
                    this.c = this.c + '/' + s1;
                    return;
                }
                StringBuilder stringBuilder0 = b.v("Expected one value for argument ", s, ", found ");
                stringBuilder0.append(list0.size());
                stringBuilder0.append("values instead.");
                throw new IllegalArgumentException(stringBuilder0.toString().toString());
            }
            case 1: {
                for(Object object0: list0) {
                    this.a(s, ((String)object0));
                }
            }
        }
    }

    public final void appendPattern(int v, @NotNull String s, @NotNull NavType navType0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(navType0, "type");
        switch(a.c((navType0 instanceof CollectionNavType || this.a.getDescriptor().isElementOptional(v) ? 2 : 1))) {
            case 0: {
                this.c = this.c + '/' + ("{" + s + '}');
                return;
            }
            case 1: {
                this.a(s, "{" + s + '}');
            }
        }
    }

    @NotNull
    public final String build() {
        return this.b + this.c + this.d;
    }
}

