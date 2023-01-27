package net.emergentdevelopers.springboot;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import net.emergentdevelopers.springboot.model.I9Form;

import java.io.IOException;

public class I9FormDeserializer extends StdDeserializer<I9Form> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public I9FormDeserializer() {
        this(null);
    }

    public I9FormDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public I9Form deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String formType = node.get("formType").asText();
        String formStatus = node.get("formStatus").asText();
        String formTitle = node.get("formTitle").asText();

        return new I9Form(null, formType, formStatus, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, false, false, false, formTitle, false, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, false, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, formTitle, false);
    }
}
