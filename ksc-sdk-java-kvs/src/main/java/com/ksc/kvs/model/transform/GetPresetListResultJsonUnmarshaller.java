package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.GetPresetListResult;
import com.ksc.kvs.model.Preset;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class GetPresetListResultJsonUnmarshaller implements Unmarshaller<GetPresetListResult, JsonUnmarshallerContext> {

	public GetPresetListResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		GetPresetListResult kvsRequest = new GetPresetListResult();
		int originalDepth = context.getCurrentDepth();
		String currentParentElement = context.getCurrentParentElement();
		int targetDepth = originalDepth + 1;
		JsonToken token = context.getCurrentToken();
		if (token == null)
			token = context.nextToken();
		if (token == VALUE_NULL)
			return null;

		while (true) {
			if (token == null)
				break;

			if (token == FIELD_NAME || token == START_OBJECT) {

				if (context.testExpression("PresetList", targetDepth)) {
					context.nextToken();
					kvsRequest.setPresetList(
							new ListUnmarshaller<Preset>(PresetListJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					kvsRequest.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					kvsRequest.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				}

			} else if (token == END_ARRAY || token == END_OBJECT) {
				if (context.getLastParsedParentElement() == null
						|| context.getLastParsedParentElement().equals(currentParentElement)) {
					if (context.getCurrentDepth() <= originalDepth)
						break;
				}
			}
			token = context.nextToken();
		}
		return kvsRequest;
	}

	private static GetPresetListResultJsonUnmarshaller instance;

	public static GetPresetListResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetPresetListResultJsonUnmarshaller();
		return instance;
	}
}
