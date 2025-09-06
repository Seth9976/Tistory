package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import jg.i;
import jg.j;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import qd.a;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "Lkotlinx/serialization/json/JsonElement;", "read", "()Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n531#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
public final class JsonTreeReader {
    public final AbstractJsonLexer a;
    public final boolean b;
    public final boolean c;
    public int d;

    public JsonTreeReader(@NotNull JsonConfiguration jsonConfiguration0, @NotNull AbstractJsonLexer abstractJsonLexer0) {
        Intrinsics.checkNotNullParameter(jsonConfiguration0, "configuration");
        Intrinsics.checkNotNullParameter(abstractJsonLexer0, "lexer");
        super();
        this.a = abstractJsonLexer0;
        this.b = jsonConfiguration0.isLenient();
        this.c = jsonConfiguration0.getAllowTrailingComma();
    }

    public final JsonArray a() {
        AbstractJsonLexer abstractJsonLexer0 = this.a;
        int v = abstractJsonLexer0.consumeNextToken();
        if(abstractJsonLexer0.peekNextToken() != 4) {
            ArrayList arrayList0 = new ArrayList();
            while(abstractJsonLexer0.canConsumeValue()) {
                arrayList0.add(this.read());
                v = abstractJsonLexer0.consumeNextToken();
                if(v != 4) {
                    int v1 = abstractJsonLexer0.currentPosition;
                    if(v != 9) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer0, "Expected end of the array or comma", v1, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    if(false) {
                        break;
                    }
                }
            }
            switch(v) {
                case 4: {
                    if(this.c) {
                        abstractJsonLexer0.consumeNextToken(9);
                        return new JsonArray(arrayList0);
                    }
                    JsonExceptionsKt.invalidTrailingComma(abstractJsonLexer0, "array");
                    throw new KotlinNothingValueException();
                }
                case 8: {
                    abstractJsonLexer0.consumeNextToken(9);
                    return new JsonArray(arrayList0);
                }
                default: {
                    return new JsonArray(arrayList0);
                }
            }
        }
        AbstractJsonLexer.fail$default(this.a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public static final AbstractJsonLexer access$getLexer$p(JsonTreeReader jsonTreeReader0) {
        return jsonTreeReader0.a;
    }

    public static final JsonElement access$readArray(JsonTreeReader jsonTreeReader0) {
        return jsonTreeReader0.a();
    }

    public static final Object access$readObject(JsonTreeReader jsonTreeReader0, DeepRecursiveScope deepRecursiveScope0, Continuation continuation0) {
        DeepRecursiveScope deepRecursiveScope2;
        JsonTreeReader jsonTreeReader2;
        LinkedHashMap linkedHashMap1;
        String s;
        DeepRecursiveScope deepRecursiveScope1;
        LinkedHashMap linkedHashMap0;
        int v1;
        j j0;
        JsonTreeReader jsonTreeReader1 = jsonTreeReader0;
        jsonTreeReader0.getClass();
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v = j0.u;
            if((v & 0x80000000) == 0) {
                j0 = new j(jsonTreeReader1, continuation0);
            }
            else {
                j0.u = v ^ 0x80000000;
            }
        }
        else {
            j0 = new j(jsonTreeReader1, continuation0);
        }
        Object object0 = j0.s;
        JsonObject jsonObject0 = a.getCOROUTINE_SUSPENDED();
        switch(j0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v1 = jsonTreeReader1.a.consumeNextToken(6);
                if(jsonTreeReader1.a.peekNextToken() != 4) {
                    linkedHashMap0 = new LinkedHashMap();
                    deepRecursiveScope1 = deepRecursiveScope0;
                    goto label_36;
                }
                AbstractJsonLexer.fail$default(jsonTreeReader1.a, "Unexpected leading comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            case 1: {
                s = j0.r;
                linkedHashMap1 = j0.q;
                jsonTreeReader2 = j0.p;
                deepRecursiveScope2 = j0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            linkedHashMap1.put(s, ((JsonElement)object0));
            switch(jsonTreeReader2.a.consumeNextToken()) {
                case 4: {
                    deepRecursiveScope1 = deepRecursiveScope2;
                    v1 = 4;
                    jsonTreeReader1 = jsonTreeReader2;
                    linkedHashMap0 = linkedHashMap1;
                label_36:
                    AbstractJsonLexer abstractJsonLexer0 = jsonTreeReader1.a;
                    if(!abstractJsonLexer0.canConsumeValue()) {
                        goto label_57;
                    }
                    String s1 = jsonTreeReader1.b ? abstractJsonLexer0.consumeStringLenient() : abstractJsonLexer0.consumeString();
                    abstractJsonLexer0.consumeNextToken(5);
                    j0.o = deepRecursiveScope1;
                    j0.p = jsonTreeReader1;
                    j0.q = linkedHashMap0;
                    j0.r = s1;
                    j0.u = 1;
                    Object object1 = deepRecursiveScope1.callRecursive(Unit.INSTANCE, j0);
                    if(object1 == jsonObject0) {
                        break alab1;
                    }
                    jsonTreeReader2 = jsonTreeReader1;
                    s = s1;
                    linkedHashMap1 = linkedHashMap0;
                    deepRecursiveScope2 = deepRecursiveScope1;
                    object0 = object1;
                    break;
                }
                case 7: {
                    goto label_54;
                }
                default: {
                    AbstractJsonLexer.fail$default(jsonTreeReader2.a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        return jsonObject0;
    label_54:
        v1 = 7;
        jsonTreeReader1 = jsonTreeReader2;
        linkedHashMap0 = linkedHashMap1;
    label_57:
        AbstractJsonLexer abstractJsonLexer1 = jsonTreeReader1.a;
        if(v1 == 6) {
            abstractJsonLexer1.consumeNextToken(7);
            return new JsonObject(linkedHashMap0);
        }
        if(v1 == 4) {
            if(jsonTreeReader1.c) {
                abstractJsonLexer1.consumeNextToken(7);
                return new JsonObject(linkedHashMap0);
            }
            JsonExceptionsKt.invalidTrailingComma$default(abstractJsonLexer1, null, 1, null);
            throw new KotlinNothingValueException();
        }
        return new JsonObject(linkedHashMap0);
    }

    public static final JsonPrimitive access$readValue(JsonTreeReader jsonTreeReader0, boolean z) {
        return jsonTreeReader0.b(z);
    }

    public final JsonPrimitive b(boolean z) {
        String s = this.b || !z ? this.a.consumeStringLenient() : this.a.consumeString();
        return !z && Intrinsics.areEqual(s, "null") ? JsonNull.INSTANCE : new JsonLiteral(s, z, null, 4, null);
    }

    @NotNull
    public final JsonElement read() {
        JsonElement jsonElement0;
        AbstractJsonLexer abstractJsonLexer0 = this.a;
        int v = abstractJsonLexer0.peekNextToken();
        if(v == 1) {
            return this.b(true);
        }
        if(v == 0) {
            return this.b(false);
        }
        switch(v) {
            case 6: {
                int v1 = this.d + 1;
                this.d = v1;
                if(v1 == 200) {
                    jsonElement0 = (JsonElement)DeepRecursiveKt.invoke(new DeepRecursiveFunction(new i(this, null)), Unit.INSTANCE);
                    --this.d;
                    return jsonElement0;
                }
                int v2 = abstractJsonLexer0.consumeNextToken(6);
                if(abstractJsonLexer0.peekNextToken() != 4) {
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    while(abstractJsonLexer0.canConsumeValue()) {
                        String s = this.b ? abstractJsonLexer0.consumeStringLenient() : abstractJsonLexer0.consumeString();
                        abstractJsonLexer0.consumeNextToken(5);
                        linkedHashMap0.put(s, this.read());
                        v2 = abstractJsonLexer0.consumeNextToken();
                        if(v2 != 4) {
                            if(v2 == 7) {
                                break;
                            }
                            AbstractJsonLexer.fail$default(this.a, "Expected end of the object or comma", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(v2 == 6) {
                        abstractJsonLexer0.consumeNextToken(7);
                    }
                    else if(v2 == 4) {
                        if(this.c) {
                            abstractJsonLexer0.consumeNextToken(7);
                            jsonElement0 = new JsonObject(linkedHashMap0);
                            --this.d;
                            return jsonElement0;
                        }
                        JsonExceptionsKt.invalidTrailingComma$default(abstractJsonLexer0, null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    jsonElement0 = new JsonObject(linkedHashMap0);
                    --this.d;
                    return jsonElement0;
                }
                AbstractJsonLexer.fail$default(this.a, "Unexpected leading comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            case 8: {
                return this.a();
            }
            default: {
                AbstractJsonLexer.fail$default(this.a, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(((byte)v)), 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
    }
}

