package androidx.compose.runtime.internal;

import aa.d;
import aa.g;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.material3.c5;
import androidx.compose.material3.fc;
import androidx.compose.material3.ki;
import androidx.compose.material3.n8;
import androidx.compose.material3.o6;
import androidx.compose.material3.w7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import f1.b;
import f1.c;
import f1.e;
import f1.f;
import f1.h;
import f1.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\"\u0010\u0010\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0013J6\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0015J@\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0017JJ\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0019JT\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u001BJ^\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u001DJh\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u001FJr\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010!J|\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010#J\u008E\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010&J\u0098\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010(J\u00A2\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010*J\u00AC\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\b\u0010+\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010,J\u00B6\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\b\u0010+\u001A\u0004\u0018\u00010\u00062\b\u0010-\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010.J\u00C0\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\b\u0010+\u001A\u0004\u0018\u00010\u00062\b\u0010-\u001A\u0004\u0018\u00010\u00062\b\u0010/\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u00100J\u00CA\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\b\u0010+\u001A\u0004\u0018\u00010\u00062\b\u0010-\u001A\u0004\u0018\u00010\u00062\b\u0010/\u001A\u0004\u0018\u00010\u00062\b\u00101\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u00102J\u00D4\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\b\u0010+\u001A\u0004\u0018\u00010\u00062\b\u0010-\u001A\u0004\u0018\u00010\u00062\b\u0010/\u001A\u0004\u0018\u00010\u00062\b\u00101\u001A\u0004\u0018\u00010\u00062\b\u00103\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u00104J\u00DE\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u00062\b\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u00062\b\u0010 \u001A\u0004\u0018\u00010\u00062\b\u0010\"\u001A\u0004\u0018\u00010\u00062\b\u0010$\u001A\u0004\u0018\u00010\u00062\b\u0010\'\u001A\u0004\u0018\u00010\u00062\b\u0010)\u001A\u0004\u0018\u00010\u00062\b\u0010+\u001A\u0004\u0018\u00010\u00062\b\u0010-\u001A\u0004\u0018\u00010\u00062\b\u0010/\u001A\u0004\u0018\u00010\u00062\b\u00101\u001A\u0004\u0018\u00010\u00062\b\u00103\u001A\u0004\u0018\u00010\u00062\b\u00105\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u00106R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\u00A8\u0006;"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "", "update", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Composer;", "c", "changed", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p1", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p5", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p6", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p7", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p8", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p9", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p10", "changed1", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p11", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p12", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p13", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p14", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p15", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p16", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p17", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "p18", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "a", "I", "getKey", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableLambdaImpl implements ComposableLambda {
    public static final int $stable;
    public final int a;
    public final boolean b;
    public Object c;
    public RecomposeScope d;
    public ArrayList e;

    public ComposableLambdaImpl(int v, boolean z, @Nullable Object object0) {
        this.a = v;
        this.b = z;
        this.c = object0;
    }

    public final void a(Composer composer0) {
        if(this.b) {
            RecomposeScope recomposeScope0 = composer0.getRecomposeScope();
            if(recomposeScope0 != null) {
                composer0.recordUsed(recomposeScope0);
                if(ComposableLambdaKt.replacableWith(this.d, recomposeScope0)) {
                    this.d = recomposeScope0;
                    return;
                }
                ArrayList arrayList0 = this.e;
                if(arrayList0 == null) {
                    ArrayList arrayList1 = new ArrayList();
                    this.e = arrayList1;
                    arrayList1.add(recomposeScope0);
                    return;
                }
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(ComposableLambdaKt.replacableWith(((RecomposeScope)arrayList0.get(v1)), recomposeScope0)) {
                        arrayList0.set(v1, recomposeScope0);
                        return;
                    }
                }
                arrayList0.add(recomposeScope0);
            }
        }
    }

    public final int getKey() {
        return this.a;
    }

    @Nullable
    public Object invoke(@NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0);
        Object object0 = this.c;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object1 = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object0, 2)).invoke(composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            scopeUpdateScope0.updateScope(((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(this, 2)));
        }
        return object1;
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object object1 = this.c;
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object2 = ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object1, 3)).invoke(object0, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(this, object0, v, 10));
        }
        return object2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((Composer)object0), ((Number)object1).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object object2 = this.c;
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object3 = ((Function4)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object2, 4)).invoke(object0, object1, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 4, this, object0, object1));
        }
        return object3;
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(object0, ((Composer)object1), ((Number)object2).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object object3 = this.c;
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object4 = ((Function5)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object3, 5)).invoke(object0, object1, object2, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, 4, this, object0, object1, object2));
        }
        return object4;
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        return this.invoke(object0, object1, ((Composer)object2), ((Number)object3).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4);
        Object object4 = this.c;
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object5 = ((Function6)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, 6)).invoke(object0, object1, object2, object3, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(this, object0, object1, object2, object3, v, 3));
        }
        return object5;
    }

    @Override  // kotlin.jvm.functions.Function5
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return this.invoke(object0, object1, object2, ((Composer)object3), ((Number)object4).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5);
        Object object5 = this.c;
        Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object6 = ((Function7)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object5, 7)).invoke(object0, object1, object2, object3, object4, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ki(this, object0, object1, object2, object3, object4, v, 3));
        }
        return object6;
    }

    @Override  // kotlin.jvm.functions.Function6
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        return this.invoke(object0, object1, object2, object3, ((Composer)object4), ((Number)object5).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6);
        Object object6 = this.c;
        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object7 = ((Function8)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object6, 8)).invoke(object0, object1, object2, object3, object4, object5, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c5(this, object0, object1, object2, object3, object4, object5, v, 1));
        }
        return object7;
    }

    @Override  // kotlin.jvm.functions.Function7
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return this.invoke(object0, object1, object2, object3, object4, ((Composer)object5), ((Number)object6).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7);
        Object object7 = this.c;
        Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object8 = ((Function9)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object7, 9)).invoke(object0, object1, object2, object3, object4, object5, object6, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w7(this, object0, object1, object2, object3, object4, object5, object6, v, 1));
        }
        return object8;
    }

    @Override  // kotlin.jvm.functions.Function8
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.invoke(object0, object1, object2, object3, object4, object5, ((Composer)object6), ((Number)object7).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8);
        Object object8 = this.c;
        Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object9 = ((Function10)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object8, 10)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o6(this, object0, object1, object2, object3, object4, object5, object6, object7, v, 2));
        }
        return object9;
    }

    @Override  // kotlin.jvm.functions.Function9
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, ((Composer)object7), ((Number)object8).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @NotNull Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9);
        Object object9 = this.c;
        Intrinsics.checkNotNull(object9, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object10 = ((Function11)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object9, 11)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n8(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, v, 1));
        }
        return object10;
    }

    @Override  // kotlin.jvm.functions.Function10
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, ((Composer)object8), ((Number)object9).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(10) : ComposableLambdaKt.sameBits(10);
        Object object10 = this.c;
        Intrinsics.checkNotNull(object10, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object11 = ((Function13)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object10, 13)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f1.a(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, v));
        }
        return object11;
    }

    @Override  // kotlin.jvm.functions.Function11
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, ((Composer)object9), ((Number)object10).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(11) : ComposableLambdaKt.sameBits(11);
        Object object11 = this.c;
        Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object12 = ((Function14)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object11, 14)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, v, v1));
        }
        return object12;
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(12) : ComposableLambdaKt.sameBits(12);
        Object object12 = this.c;
        Intrinsics.checkNotNull(object12, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object13 = ((Function15)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object12, 15)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, v, v1));
        }
        return object13;
    }

    @Override  // kotlin.jvm.functions.Function13
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, ((Composer)object10), ((Number)object11).intValue(), ((Number)object12).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(13) : ComposableLambdaKt.sameBits(13);
        Object object13 = this.c;
        Intrinsics.checkNotNull(object13, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object14 = ((Function16)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object13, 16)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f1.d(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, v, v1));
        }
        return object14;
    }

    @Override  // kotlin.jvm.functions.Function14
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, ((Composer)object11), ((Number)object12).intValue(), ((Number)object13).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(14) : ComposableLambdaKt.sameBits(14);
        Object object14 = this.c;
        Intrinsics.checkNotNull(object14, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object15 = ((Function17)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object14, 17)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, v, v1));
        }
        return object15;
    }

    @Override  // kotlin.jvm.functions.Function15
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, ((Composer)object12), ((Number)object13).intValue(), ((Number)object14).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(15) : ComposableLambdaKt.sameBits(15);
        Object object15 = this.c;
        Intrinsics.checkNotNull(object15, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object16 = ((Function18)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object15, 18)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, v, v1));
        }
        return object16;
    }

    @Override  // kotlin.jvm.functions.Function16
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, ((Composer)object13), ((Number)object14).intValue(), ((Number)object15).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(16) : ComposableLambdaKt.sameBits(16);
        Object object16 = this.c;
        Intrinsics.checkNotNull(object16, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object17 = ((Function19)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object16, 19)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f1.g(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, v, v1));
        }
        return object17;
    }

    @Override  // kotlin.jvm.functions.Function17
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, ((Composer)object14), ((Number)object15).intValue(), ((Number)object16).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(17) : ComposableLambdaKt.sameBits(17);
        Object object17 = this.c;
        Intrinsics.checkNotNull(object17, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'p17\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object18 = ((Function20)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object17, 20)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, v, v1));
        }
        return object18;
    }

    @Override  // kotlin.jvm.functions.Function18
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, ((Composer)object15), ((Number)object16).intValue(), ((Number)object17).intValue());
    }

    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @Nullable Object object17, @NotNull Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(this.a);
        this.a(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(18) : ComposableLambdaKt.sameBits(18);
        Object object18 = this.c;
        Intrinsics.checkNotNull(object18, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'p17\')] kotlin.Any?, @[ParameterName(name = \'p18\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object19 = ((Function21)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object18, 21)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, v, v1));
        }
        return object19;
    }

    @Override  // kotlin.jvm.functions.Function19
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, ((Composer)object16), ((Number)object17).intValue(), ((Number)object18).intValue());
    }

    @Override  // kotlin.jvm.functions.Function20
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, ((Composer)object17), ((Number)object18).intValue(), ((Number)object19).intValue());
    }

    @Override  // kotlin.jvm.functions.Function21
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, ((Composer)object18), ((Number)object19).intValue(), ((Number)object20).intValue());
    }

    public final void update(@NotNull Object object0) {
        if(!Intrinsics.areEqual(this.c, object0)) {
            boolean z = this.c == null;
            this.c = object0;
            if(!z && this.b) {
                RecomposeScope recomposeScope0 = this.d;
                if(recomposeScope0 != null) {
                    recomposeScope0.invalidate();
                    this.d = null;
                }
                ArrayList arrayList0 = this.e;
                if(arrayList0 != null) {
                    int v1 = arrayList0.size();
                    for(int v = 0; v < v1; ++v) {
                        ((RecomposeScope)arrayList0.get(v)).invalidate();
                    }
                    arrayList0.clear();
                }
            }
        }
    }
}

