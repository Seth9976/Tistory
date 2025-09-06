package com.google.gson.internal;

import androidx.fragment.app.a2;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams {
    public static JsonElement parse(JsonReader jsonReader0) throws JsonParseException {
        try {
            boolean z = true;
            jsonReader0.peek();
            z = false;
            return (JsonElement)TypeAdapters.JSON_ELEMENT.read(jsonReader0);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw new JsonSyntaxException(eOFException0);
            }
            return JsonNull.INSTANCE;
        }
        catch(MalformedJsonException malformedJsonException0) {
            throw new JsonSyntaxException(malformedJsonException0);
        }
        catch(IOException iOException0) {
            throw new JsonIOException(iOException0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new JsonSyntaxException(numberFormatException0);
        }
    }

    public static void write(JsonElement jsonElement0, JsonWriter jsonWriter0) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter0, jsonElement0);
    }

    public static Writer writerForAppendable(Appendable appendable0) {
        return appendable0 instanceof Writer ? ((Writer)appendable0) : new a2(appendable0);
    }
}

