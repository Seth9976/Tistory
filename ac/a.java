package ac;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.kakao.tistory.module.RetrofitModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

public final class a extends Lambda implements Function1 {
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(1, 0);
        a.y = new a(1, 1);
        a.z = new a(1, 2);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((CorruptionException)object0), "it");
                return PreferencesFactory.createEmpty();
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((CorruptionException)object0), "it");
                return PreferencesFactory.createEmpty();
            }
            default: {
                Intrinsics.checkNotNullParameter(((JsonBuilder)object0), "$this$Json");
                ((JsonBuilder)object0).setIgnoreUnknownKeys(true);
                ((JsonBuilder)object0).setUseAlternativeNames(true);
                ((JsonBuilder)object0).setExplicitNulls(false);
                ((JsonBuilder)object0).setEncodeDefaults(true);
                ((JsonBuilder)object0).setDecodeEnumsCaseInsensitive(true);
                ((JsonBuilder)object0).setCoerceInputValues(true);
                ((JsonBuilder)object0).setLenient(true);
                ((JsonBuilder)object0).setSerializersModule(RetrofitModule.access$getDefaultSerializersModule$cp());
                return Unit.INSTANCE;
            }
        }
    }
}

