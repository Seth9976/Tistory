package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.ByteString;
import retrofit2.Converter;

public final class a implements Converter {
    public final Gson a;
    public final TypeAdapter b;
    public static final MediaType c;

    static {
        a.c = MediaType.get("application/json; charset=UTF-8");
    }

    public a(Gson gson0, TypeAdapter typeAdapter0) {
        this.a = gson0;
        this.b = typeAdapter0;
    }

    @Override  // retrofit2.Converter
    public final Object convert(Object object0) {
        Buffer buffer0 = new Buffer();
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(buffer0.outputStream(), StandardCharsets.UTF_8);
        JsonWriter jsonWriter0 = this.a.newJsonWriter(outputStreamWriter0);
        this.b.write(jsonWriter0, object0);
        jsonWriter0.close();
        ByteString byteString0 = buffer0.readByteString();
        return RequestBody.create(a.c, byteString0);
    }
}

