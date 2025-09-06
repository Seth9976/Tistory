package androidx.navigation.compose;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.Navigator;
import b0.g;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001AR\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\rH\u0007\u00A2\u0006\u0002\u0010\u000E\u001A\u0085\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\u0002\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132\"\u0010\n\u001A\u001E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0018\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0002\u0010\u001A\u001A\u00AD\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\u0002\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001C\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132\"\u0010\n\u001A\u001E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0018\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u0013\u00A2\u0006\u0002\u0010\u001D\u001A\u00C5\u0002\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u001E\u0018\u0001*\u00020\u001F*\u00020\u00022\u001D\b\u0002\u0010 \u001A\u0017\u0012\u0004\u0012\u00020\"\u0012\r\u0012\u000B\u0012\u0002\b\u00030#\u00A2\u0006\u0002\b\u00120!2\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\n\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u001C\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132$\b\b\u0010\n\u001A\u001E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0018\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u0013H\u0086\b\u00A2\u0006\u0002\u0010$\u001AZ\u0010%\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010&\u001A\u00020\'2\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\u0010(\u001Ar\u0010%\u001A\u00020\u0001\"\n\b\u0000\u0010\u001E\u0018\u0001*\u00020\u001F*\u00020\u00022\u001D\b\u0002\u0010 \u001A\u0017\u0012\u0004\u0012\u00020\"\u0012\r\u0012\u000B\u0012\u0002\b\u00030#\u00A2\u0006\u0002\b\u00120!2\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010&\u001A\u00020\'2\u0019\b\b\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\rH\u0086\b\u00A2\u0006\u0002\u0010)\u001A\u00BD\u0002\u0010*\u001A\u00020\u0001\"\n\b\u0000\u0010\u001E\u0018\u0001*\u00020\u001F*\u00020\u00022\u0006\u0010+\u001A\u00020\u001F2\u001D\b\u0002\u0010 \u001A\u0017\u0012\u0004\u0012\u00020\"\u0012\r\u0012\u000B\u0012\u0002\b\u00030#\u00A2\u0006\u0002\b\u00120!2\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\n\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u001C\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132\u0019\b\b\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013H\u0086\b\u001A\u00BA\u0002\u0010*\u001A\u00020\u0001*\u00020\u00022\u0006\u0010+\u001A\u00020\u001F2\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030-2\u001D\b\u0002\u0010 \u001A\u0017\u0012\u0004\u0012\u00020\"\u0012\r\u0012\u000B\u0012\u0002\b\u00030#\u00A2\u0006\u0002\b\u00120!2\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\u0002\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u001C\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132\u0017\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013H\u0007\u001A\u00E9\u0001\u0010*\u001A\u00020\u0001*\u00020\u00022\u0006\u0010+\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062#\b\u0002\u0010\u000F\u001A\u001D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132#\b\u0002\u0010\u0014\u001A\u001D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132#\b\u0002\u0010\u0016\u001A\u001D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132#\b\u0002\u0010\u0017\u001A\u001D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132\u0017\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013H\u0007\u001A\u00A5\u0002\u0010*\u001A\u00020\u0001*\u00020\u00022\u0006\u0010+\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\u0002\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001C\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132\u0017\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013\u001AU\u0010*\u001A\u00020\u0001*\u00020\u00022\u0006\u0010+\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062\u0017\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013H\u0007\u001A\u00C1\u0002\u0010*\u001A\u00020\u0001\"\n\b\u0000\u0010\u001E\u0018\u0001*\u00020\u001F*\u00020\u00022\n\u0010+\u001A\u0006\u0012\u0002\b\u00030-2\u001D\b\u0002\u0010 \u001A\u0017\u0012\u0004\u0012\u00020\"\u0012\r\u0012\u000B\u0012\u0002\b\u00030#\u00A2\u0006\u0002\b\u00120!2\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\n\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\n\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u001C\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132\u0019\b\b\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013H\u0086\b\u001A\u00BE\u0002\u0010*\u001A\u00020\u0001*\u00020\u00022\n\u0010+\u001A\u0006\u0012\u0002\b\u00030-2\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030-2\u001D\b\u0002\u0010 \u001A\u0017\u0012\u0004\u0012\u00020\"\u0012\r\u0012\u000B\u0012\u0002\b\u00030#\u00A2\u0006\u0002\b\u00120!2\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062(\b\u0002\u0010\u000F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0014\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0016\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0011\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u000B\u0012\t\u0018\u00010\u001C\u00A2\u0006\u0002\b\u0012\u0018\u00010\u000B\u00A2\u0006\u0002\b\u00132\u0017\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000B\u00A2\u0006\u0002\b\u0013H\u0007\u00A8\u0006."}, d2 = {"composable", "", "Landroidx/navigation/NavGraphBuilder;", "route", "", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "deepLinks", "Landroidx/navigation/NavDeepLink;", "content", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/Composable;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "enterTransition", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "T", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "dialog", "dialogProperties", "Landroidx/compose/ui/window/DialogProperties;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "navigation", "startDestination", "builder", "Lkotlin/reflect/KClass;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n157#2:628\n157#2:633\n157#2:638\n157#2:643\n157#2:654\n157#2:659\n1855#3,2:629\n1855#3,2:631\n1855#3,2:634\n1855#3,2:636\n1855#3,2:639\n1855#3,2:641\n1855#3,2:644\n1855#3,2:646\n1855#3,2:648\n1855#3,2:650\n1855#3,2:652\n1855#3,2:655\n1855#3,2:657\n1855#3,2:661\n1#4:660\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n*L\n56#1:628\n106#1:633\n158#1:638\n212#1:643\n584#1:654\n618#1:659\n59#1:629,2\n62#1:631,2\n108#1:634,2\n109#1:636,2\n160#1:639,2\n161#1:641,2\n218#1:644,2\n347#1:646,2\n348#1:648,2\n449#1:650,2\n550#1:652,2\n590#1:655,2\n591#1:657,2\n624#1:661,2\n*E\n"})
public final class NavGraphBuilderKt {
    public static final void composable(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull String s, @NotNull List list0, @NotNull List list1, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function4 function40) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder0 = new ComposeNavigatorDestinationBuilder(((ComposeNavigator)navGraphBuilder0.getProvider().getNavigator(ComposeNavigator.class)), s, function40);
        for(Object object0: list0) {
            composeNavigatorDestinationBuilder0.argument(((NamedNavArgument)object0).component1(), ((NamedNavArgument)object0).component2());
        }
        for(Object object1: list1) {
            composeNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object1));
        }
        composeNavigatorDestinationBuilder0.setEnterTransition(function10);
        composeNavigatorDestinationBuilder0.setExitTransition(function11);
        composeNavigatorDestinationBuilder0.setPopEnterTransition(function12);
        composeNavigatorDestinationBuilder0.setPopExitTransition(function13);
        composeNavigatorDestinationBuilder0.setSizeTransform(function14);
        navGraphBuilder0.destination(composeNavigatorDestinationBuilder0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports sizeTransform")
    public static final void composable(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function4 function40) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder0 = new ComposeNavigatorDestinationBuilder(((ComposeNavigator)navGraphBuilder0.getProvider().getNavigator(ComposeNavigator.class)), s, function40);
        for(Object object0: list0) {
            composeNavigatorDestinationBuilder0.argument(((NamedNavArgument)object0).component1(), ((NamedNavArgument)object0).component2());
        }
        for(Object object1: list1) {
            composeNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object1));
        }
        composeNavigatorDestinationBuilder0.setEnterTransition(function10);
        composeNavigatorDestinationBuilder0.setExitTransition(function11);
        composeNavigatorDestinationBuilder0.setPopEnterTransition(function12);
        composeNavigatorDestinationBuilder0.setPopExitTransition(function13);
        navGraphBuilder0.destination(composeNavigatorDestinationBuilder0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports AnimatedContent")
    public static final void composable(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, Function3 function30) {
        Destination composeNavigator$Destination0 = new Destination(((ComposeNavigator)navGraphBuilder0.getProvider().getNavigator(ComposeNavigator.class)), ComposableLambdaKt.composableLambdaInstance(0x1CDC15AA, true, new g(3, function30)));
        composeNavigator$Destination0.setRoute(s);
        for(Object object0: list0) {
            composeNavigator$Destination0.addArgument(((NamedNavArgument)object0).component1(), ((NamedNavArgument)object0).component2());
        }
        for(Object object1: list1) {
            composeNavigator$Destination0.addDeepLink(((NavDeepLink)object1));
        }
        navGraphBuilder0.addDestination(composeNavigator$Destination0);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function4 function40) {
        ComposeNavigator composeNavigator0 = (ComposeNavigator)navGraphBuilder0.getProvider().getNavigator(ComposeNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder0 = new ComposeNavigatorDestinationBuilder(composeNavigator0, Reflection.getOrCreateKotlinClass(Object.class), map0, function40);
        for(Object object0: list0) {
            composeNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object0));
        }
        composeNavigatorDestinationBuilder0.setEnterTransition(function10);
        composeNavigatorDestinationBuilder0.setExitTransition(function11);
        composeNavigatorDestinationBuilder0.setPopEnterTransition(function12);
        composeNavigatorDestinationBuilder0.setPopExitTransition(function13);
        composeNavigatorDestinationBuilder0.setSizeTransform(function14);
        navGraphBuilder0.destination(composeNavigatorDestinationBuilder0);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function4 function40, int v, Object object0) {
        Function1 function15 = (v & 8) == 0 ? function10 : null;
        Function1 function16 = (v & 16) == 0 ? function11 : null;
        NavGraphBuilderKt.composable(navGraphBuilder0, s, ((v & 2) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v & 4) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), function15, function16, ((v & 0x20) == 0 ? function12 : function15), ((v & 0x40) == 0 ? function13 : function16), ((v & 0x80) == 0 ? function14 : null), function40);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function4 function40, int v, Object object0) {
        Function1 function14 = (v & 8) == 0 ? function10 : null;
        Function1 function15 = (v & 16) == 0 ? function11 : null;
        NavGraphBuilderKt.composable(navGraphBuilder0, s, ((v & 2) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v & 4) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), function14, function15, ((v & 0x20) == 0 ? function12 : function14), ((v & 0x40) == 0 ? function13 : function15), function40);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, Function3 function30, int v, Object object0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        NavGraphBuilderKt.composable(navGraphBuilder0, s, list0, list1, function30);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function4 function40, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            function10 = null;
        }
        if((v & 8) != 0) {
            function11 = null;
        }
        if((v & 16) != 0) {
            function12 = function10;
        }
        if((v & 0x20) != 0) {
            function13 = function11;
        }
        if((v & 0x40) != 0) {
            function14 = null;
        }
        ComposeNavigator composeNavigator0 = (ComposeNavigator)navGraphBuilder0.getProvider().getNavigator(ComposeNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder0 = new ComposeNavigatorDestinationBuilder(composeNavigator0, Reflection.getOrCreateKotlinClass(Object.class), map0, function40);
        for(Object object1: list0) {
            composeNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object1));
        }
        composeNavigatorDestinationBuilder0.setEnterTransition(function10);
        composeNavigatorDestinationBuilder0.setExitTransition(function11);
        composeNavigatorDestinationBuilder0.setPopEnterTransition(function12);
        composeNavigatorDestinationBuilder0.setPopExitTransition(function13);
        composeNavigatorDestinationBuilder0.setSizeTransform(function14);
        navGraphBuilder0.destination(composeNavigatorDestinationBuilder0);
    }

    public static final void dialog(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull String s, @NotNull List list0, @NotNull List list1, @NotNull DialogProperties dialogProperties0, @NotNull Function3 function30) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder0 = new DialogNavigatorDestinationBuilder(((DialogNavigator)navGraphBuilder0.getProvider().getNavigator(DialogNavigator.class)), s, dialogProperties0, function30);
        for(Object object0: list0) {
            dialogNavigatorDestinationBuilder0.argument(((NamedNavArgument)object0).component1(), ((NamedNavArgument)object0).component2());
        }
        for(Object object1: list1) {
            dialogNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object1));
        }
        navGraphBuilder0.destination(dialogNavigatorDestinationBuilder0);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder0, Map map0, List list0, DialogProperties dialogProperties0, Function3 function30) {
        Navigator navigator0 = navGraphBuilder0.getProvider().getNavigator(DialogNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder0 = new DialogNavigatorDestinationBuilder(((DialogNavigator)navigator0), Reflection.getOrCreateKotlinClass(Object.class), map0, dialogProperties0, function30);
        for(Object object0: list0) {
            dialogNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object0));
        }
        navGraphBuilder0.destination(dialogNavigatorDestinationBuilder0);
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, DialogProperties dialogProperties0, Function3 function30, int v, Object object0) {
        NavGraphBuilderKt.dialog(navGraphBuilder0, s, ((v & 2) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v & 4) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), ((v & 8) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 7, null)), function30);
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder0, Map map0, List list0, DialogProperties dialogProperties0, Function3 function30, int v, Object object0) {
        Map map1 = (v & 1) == 0 ? map0 : x.emptyMap();
        DialogProperties dialogProperties1 = (v & 4) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 7, null);
        DialogNavigator dialogNavigator0 = (DialogNavigator)navGraphBuilder0.getProvider().getNavigator(DialogNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder0 = new DialogNavigatorDestinationBuilder(dialogNavigator0, Reflection.getOrCreateKotlinClass(Object.class), map1, dialogProperties1, function30);
        for(Object object1: ((v & 2) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList())) {
            dialogNavigatorDestinationBuilder0.deepLink(((NavDeepLink)object1));
        }
        navGraphBuilder0.destination(dialogNavigatorDestinationBuilder0);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder0, Object object0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15) {
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilderKt.navigation(navGraphBuilder0, object0, Reflection.getOrCreateKotlinClass(Object.class), map0, list0, function10, function11, function12, function13, function14, function15);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull Object object0, @NotNull KClass kClass0, @NotNull Map map0, @NotNull List list0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function1 function15) {
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), object0, kClass0, map0);
        function15.invoke(navGraphBuilder1);
        NavGraph navGraph0 = navGraphBuilder1.build();
        for(Object object1: list0) {
            navGraph0.addDeepLink(((NavDeepLink)object1));
        }
        if(navGraph0 instanceof ComposeNavGraph) {
            ((ComposeNavGraph)navGraph0).setEnterTransition$navigation_compose_release(function10);
            ((ComposeNavGraph)navGraph0).setExitTransition$navigation_compose_release(function11);
            ((ComposeNavGraph)navGraph0).setPopEnterTransition$navigation_compose_release(function12);
            ((ComposeNavGraph)navGraph0).setPopExitTransition$navigation_compose_release(function13);
            ((ComposeNavGraph)navGraph0).setSizeTransform$navigation_compose_release(function14);
        }
        navGraphBuilder0.addDestination(navGraph0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of navigation builder that supports AnimatedContent")
    public static final void navigation(NavGraphBuilder navGraphBuilder0, String s, String s1, List list0, List list1, Function1 function10) {
        NavGraphBuilderKt.navigation(navGraphBuilder0, s, s1, list0, list1, null, null, null, null, null, function10);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of navigation builder that supports sizeTransform")
    public static final void navigation(NavGraphBuilder navGraphBuilder0, String s, String s1, List list0, List list1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14) {
        NavGraphBuilderKt.navigation(navGraphBuilder0, s, s1, list0, list1, function10, function11, function12, function13, null, function14);
    }

    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull String s, @NotNull String s1, @NotNull List list0, @NotNull List list1, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function1 function15) {
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), s, s1);
        function15.invoke(navGraphBuilder1);
        NavGraph navGraph0 = navGraphBuilder1.build();
        for(Object object0: list0) {
            navGraph0.addArgument(((NamedNavArgument)object0).component1(), ((NamedNavArgument)object0).component2());
        }
        for(Object object1: list1) {
            navGraph0.addDeepLink(((NavDeepLink)object1));
        }
        if(navGraph0 instanceof ComposeNavGraph) {
            ((ComposeNavGraph)navGraph0).setEnterTransition$navigation_compose_release(function10);
            ((ComposeNavGraph)navGraph0).setExitTransition$navigation_compose_release(function11);
            ((ComposeNavGraph)navGraph0).setPopEnterTransition$navigation_compose_release(function12);
            ((ComposeNavGraph)navGraph0).setPopExitTransition$navigation_compose_release(function13);
            ((ComposeNavGraph)navGraph0).setSizeTransform$navigation_compose_release(function14);
        }
        navGraphBuilder0.addDestination(navGraph0);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder0, KClass kClass0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15) {
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilderKt.navigation(navGraphBuilder0, kClass0, Reflection.getOrCreateKotlinClass(Object.class), map0, list0, function10, function11, function12, function13, function14, function15);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull KClass kClass0, @NotNull KClass kClass1, @NotNull Map map0, @NotNull List list0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function1 function15) {
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), kClass0, kClass1, map0);
        function15.invoke(navGraphBuilder1);
        NavGraph navGraph0 = navGraphBuilder1.build();
        for(Object object0: list0) {
            navGraph0.addDeepLink(((NavDeepLink)object0));
        }
        if(navGraph0 instanceof ComposeNavGraph) {
            ((ComposeNavGraph)navGraph0).setEnterTransition$navigation_compose_release(function10);
            ((ComposeNavGraph)navGraph0).setExitTransition$navigation_compose_release(function11);
            ((ComposeNavGraph)navGraph0).setPopEnterTransition$navigation_compose_release(function12);
            ((ComposeNavGraph)navGraph0).setPopExitTransition$navigation_compose_release(function13);
            ((ComposeNavGraph)navGraph0).setSizeTransform$navigation_compose_release(function14);
        }
        navGraphBuilder0.addDestination(navGraph0);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, Object object0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, Object object1) {
        Map map1 = (v & 2) == 0 ? map0 : x.emptyMap();
        Function1 function16 = (v & 8) == 0 ? function10 : null;
        Function1 function17 = (v & 16) == 0 ? function11 : null;
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilderKt.navigation(navGraphBuilder0, object0, Reflection.getOrCreateKotlinClass(Object.class), map1, ((v & 4) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), function16, function17, ((v & 0x20) == 0 ? function12 : function16), ((v & 0x40) == 0 ? function13 : function17), ((v & 0x80) == 0 ? function14 : null), function15);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, Object object0, KClass kClass0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, Object object1) {
        Function1 function16 = (v & 16) == 0 ? function10 : null;
        Function1 function17 = (v & 0x20) == 0 ? function11 : null;
        NavGraphBuilderKt.navigation(navGraphBuilder0, object0, kClass0, ((v & 4) == 0 ? map0 : x.emptyMap()), ((v & 8) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), function16, function17, ((v & 0x40) == 0 ? function12 : function16), ((v & 0x80) == 0 ? function13 : function17), ((v & 0x100) == 0 ? function14 : null), function15);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, String s, String s1, List list0, List list1, Function1 function10, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder0, s, s1, list0, list1, function10);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, String s, String s1, List list0, List list1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, int v, Object object0) {
        Function1 function15 = (v & 16) == 0 ? function10 : null;
        Function1 function16 = (v & 0x20) == 0 ? function11 : null;
        NavGraphBuilderKt.navigation(navGraphBuilder0, s, s1, ((v & 4) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v & 8) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), function15, function16, ((v & 0x40) == 0 ? function12 : function15), ((v & 0x80) == 0 ? function13 : function16), function14);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, String s, String s1, List list0, List list1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, Object object0) {
        Function1 function16 = (v & 16) == 0 ? function10 : null;
        Function1 function17 = (v & 0x20) == 0 ? function11 : null;
        NavGraphBuilderKt.navigation(navGraphBuilder0, s, s1, ((v & 4) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v & 8) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), function16, function17, ((v & 0x40) == 0 ? function12 : function16), ((v & 0x80) == 0 ? function13 : function17), ((v & 0x100) == 0 ? function14 : null), function15);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, KClass kClass0, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, Object object0) {
        Map map1 = (v & 2) == 0 ? map0 : x.emptyMap();
        Function1 function16 = (v & 8) == 0 ? function10 : null;
        Function1 function17 = (v & 16) == 0 ? function11 : null;
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilderKt.navigation(navGraphBuilder0, kClass0, Reflection.getOrCreateKotlinClass(Object.class), map1, ((v & 4) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), function16, function17, ((v & 0x20) == 0 ? function12 : function16), ((v & 0x40) == 0 ? function13 : function17), ((v & 0x80) == 0 ? function14 : null), function15);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, KClass kClass0, KClass kClass1, Map map0, List list0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, Object object0) {
        Function1 function16 = (v & 16) == 0 ? function10 : null;
        Function1 function17 = (v & 0x20) == 0 ? function11 : null;
        NavGraphBuilderKt.navigation(navGraphBuilder0, kClass0, kClass1, ((v & 4) == 0 ? map0 : x.emptyMap()), ((v & 8) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), function16, function17, ((v & 0x40) == 0 ? function12 : function16), ((v & 0x80) == 0 ? function13 : function17), ((v & 0x100) == 0 ? function14 : null), function15);
    }
}

